package Telegram.Search;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class viewinsertedgroupact extends Activity implements B4AActivity{
	public static viewinsertedgroupact mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Telegram.Search", "Telegram.Search.viewinsertedgroupact");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (viewinsertedgroupact).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, true))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "Telegram.Search", "Telegram.Search.viewinsertedgroupact");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Telegram.Search.viewinsertedgroupact", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (viewinsertedgroupact) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (viewinsertedgroupact) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEvent(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return viewinsertedgroupact.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (viewinsertedgroupact) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (viewinsertedgroupact) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _finishinserting = false;
public static boolean _firs = false;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreturn = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextmobile = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public Telegram.Search.main _main = null;
public Telegram.Search.httputils2service _httputils2service = null;
public Telegram.Search.aboutact _aboutact = null;
public Telegram.Search.searchresultact _searchresultact = null;
public Telegram.Search.dbutils _dbutils = null;
public Telegram.Search.helpact _helpact = null;
public Telegram.Search.contactact _contactact = null;
public Telegram.Search.insertact _insertact = null;
public Telegram.Search.groupviewact _groupviewact = null;
public Telegram.Search.searchact _searchact = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="viewinsertedgroupact";
if (Debug.shouldDelegate("activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
String _line = "";
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Activity.LoadLayout(\"insertedgroupview\")";
mostCurrent._activity.LoadLayout("insertedgroupview",mostCurrent.activityBA);
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="Panel1.Width = Activity.Width";
mostCurrent._panel1.setWidth(mostCurrent._activity.getWidth());
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="Panel1.Height=Activity.Height";
mostCurrent._panel1.setHeight(mostCurrent._activity.getHeight());
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="Label1.TextSize= 15";
mostCurrent._label1.setTextSize((float) (15));
RDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="Label1.Typeface=Main.font";
mostCurrent._label1.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=12910603;
 //BA.debugLineNum = 12910603;BA.debugLine="Label1.Gravity= Gravity.RIGHT";
mostCurrent._label1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=12910605;
 //BA.debugLineNum = 12910605;BA.debugLine="Label2.TextSize= 15";
mostCurrent._label2.setTextSize((float) (15));
RDebugUtils.currentLine=12910606;
 //BA.debugLineNum = 12910606;BA.debugLine="Label2.Typeface=Main.font";
mostCurrent._label2.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="Label2.TextColor=Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=12910609;
 //BA.debugLineNum = 12910609;BA.debugLine="Label2.Gravity= Gravity.RIGHT";
mostCurrent._label2.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=12910611;
 //BA.debugLineNum = 12910611;BA.debugLine="Label3.TextSize= 15";
mostCurrent._label3.setTextSize((float) (15));
RDebugUtils.currentLine=12910612;
 //BA.debugLineNum = 12910612;BA.debugLine="Label3.TextColor=Colors.Black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=12910613;
 //BA.debugLineNum = 12910613;BA.debugLine="Label3.Typeface=Main.font";
mostCurrent._label3.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=12910615;
 //BA.debugLineNum = 12910615;BA.debugLine="Label3.Gravity= Gravity.RIGHT";
mostCurrent._label3.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=12910617;
 //BA.debugLineNum = 12910617;BA.debugLine="Label5.TextSize= 15";
mostCurrent._label5.setTextSize((float) (15));
RDebugUtils.currentLine=12910618;
 //BA.debugLineNum = 12910618;BA.debugLine="Label5.Typeface=Main.font";
mostCurrent._label5.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=12910620;
 //BA.debugLineNum = 12910620;BA.debugLine="Label5.Gravity= Gravity.RIGHT";
mostCurrent._label5.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=12910622;
 //BA.debugLineNum = 12910622;BA.debugLine="txtName.Color= Colors.rgb(179,229,252)";
mostCurrent._txtname.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=12910623;
 //BA.debugLineNum = 12910623;BA.debugLine="txtName.TextSize= 15";
mostCurrent._txtname.setTextSize((float) (15));
RDebugUtils.currentLine=12910624;
 //BA.debugLineNum = 12910624;BA.debugLine="txtName.Typeface=Main.font";
mostCurrent._txtname.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=12910626;
 //BA.debugLineNum = 12910626;BA.debugLine="txtName.Gravity= Gravity.RIGHT";
mostCurrent._txtname.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=12910628;
 //BA.debugLineNum = 12910628;BA.debugLine="EditTextMobile.Color= Colors.rgb(179,229,252)";
mostCurrent._edittextmobile.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=12910629;
 //BA.debugLineNum = 12910629;BA.debugLine="EditTextMobile.TextSize= 15";
mostCurrent._edittextmobile.setTextSize((float) (15));
RDebugUtils.currentLine=12910630;
 //BA.debugLineNum = 12910630;BA.debugLine="EditTextMobile.Typeface=Main.font";
mostCurrent._edittextmobile.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=12910632;
 //BA.debugLineNum = 12910632;BA.debugLine="EditTextMobile.Gravity= Gravity.RIGHT";
mostCurrent._edittextmobile.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=12910635;
 //BA.debugLineNum = 12910635;BA.debugLine="Dim line As String";
_line = "";
RDebugUtils.currentLine=12910636;
 //BA.debugLineNum = 12910636;BA.debugLine="Try";
try {RDebugUtils.currentLine=12910637;
 //BA.debugLineNum = 12910637;BA.debugLine="line = Main.phoneId.GetLine1Number";
_line = mostCurrent._main._phoneid.GetLine1Number();
 } 
       catch (Exception e44) {
			processBA.setLastException(e44);RDebugUtils.currentLine=12910639;
 //BA.debugLineNum = 12910639;BA.debugLine="line = \"need root\"";
_line = "need root";
 };
RDebugUtils.currentLine=12910641;
 //BA.debugLineNum = 12910641;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=12910642;
 //BA.debugLineNum = 12910642;BA.debugLine="ProgressDialogShow(\"درحال بررسی\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال بررسی");
RDebugUtils.currentLine=12910643;
 //BA.debugLineNum = 12910643;BA.debugLine="job.Initialize(\"register\", Me)";
_job._initialize(null,processBA,"register",viewinsertedgroupact.getObject());
RDebugUtils.currentLine=12910644;
 //BA.debugLineNum = 12910644;BA.debugLine="firs=True";
_firs = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=12910645;
 //BA.debugLineNum = 12910645;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.php";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/register","pass=1266"+"&name="+"&mobile="+"&sdk="+BA.NumberToString(mostCurrent._main._phone.getSdkVersion())+"&model="+mostCurrent._main._phone.getManufacturer()+","+mostCurrent._main._phone.getProduct()+"&line="+_line+"&phone="+mostCurrent._main._phoneid.GetDeviceId()+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
RDebugUtils.currentLine=12910655;
 //BA.debugLineNum = 12910655;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="viewinsertedgroupact";
if (Debug.shouldDelegate("activity_pause"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_pause", new Object[] {_userclosed});
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="viewinsertedgroupact";
if (Debug.shouldDelegate("activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="End Sub";
return "";
}
public static String  _btninsert_click() throws Exception{
RDebugUtils.currentModule="viewinsertedgroupact";
if (Debug.shouldDelegate("btninsert_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btninsert_click", null);
String _line = "";
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub btnInsert_Click";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim line As String";
_line = "";
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Try";
try {RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="line = Main.phoneId.GetLine1Number";
_line = mostCurrent._main._phoneid.GetLine1Number();
 } 
       catch (Exception e64) {
			processBA.setLastException(e64);RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="line = \"need root\"";
_line = "need root";
 };
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="Try";
try {RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="ProgressDialogShow(\"درحال ثبت نام\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال ثبت نام");
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="job.Initialize(\"register\", Me)";
_job._initialize(null,processBA,"register",viewinsertedgroupact.getObject());
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="firs=False";
_firs = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/register","pass=1266"+"&name="+mostCurrent._txtname.getText()+"&mobile="+mostCurrent._edittextmobile.getText()+"&sdk="+BA.NumberToString(mostCurrent._main._phone.getSdkVersion())+"&model="+mostCurrent._main._phone.getManufacturer()+","+mostCurrent._main._phone.getProduct()+"&line="+_line+"&phone="+mostCurrent._main._phoneid.GetDeviceId()+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e73) {
			processBA.setLastException(e73);RDebugUtils.currentLine=13172762;
 //BA.debugLineNum = 13172762;BA.debugLine="Msgbox(\"خطا در اتصال به اینترنت  \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در اتصال به اینترنت  ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=13172765;
 //BA.debugLineNum = 13172765;BA.debugLine="End Sub";
return "";
}
public static String  _btnreturn_click() throws Exception{
RDebugUtils.currentModule="viewinsertedgroupact";
if (Debug.shouldDelegate("btnreturn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnreturn_click", null);
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub btnReturn_Click";
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="End Sub";
return "";
}
public static String  _edittextmobile_enterpressed() throws Exception{
RDebugUtils.currentModule="viewinsertedgroupact";
if (Debug.shouldDelegate("edittextmobile_enterpressed"))
	return (String) Debug.delegate(mostCurrent.activityBA, "edittextmobile_enterpressed", null);
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub EditTextMobile_EnterPressed";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="btnInsert_Click";
_btninsert_click();
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(Telegram.Search.httpjob _job) throws Exception{
RDebugUtils.currentModule="viewinsertedgroupact";
if (Debug.shouldDelegate("jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _userid = 0;
String _pass = "";
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Try";
try {RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="res = Job.GetString";
_res = _job._getstring(null);
RDebugUtils.currentLine=13238280;
 //BA.debugLineNum = 13238280;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"register")) {
case 0: {
RDebugUtils.currentLine=13238291;
 //BA.debugLineNum = 13238291;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13238293;
 //BA.debugLineNum = 13238293;BA.debugLine="Dim userId As Int";
_userid = 0;
RDebugUtils.currentLine=13238295;
 //BA.debugLineNum = 13238295;BA.debugLine="Dim pass As String";
_pass = "";
RDebugUtils.currentLine=13238297;
 //BA.debugLineNum = 13238297;BA.debugLine="row.Initialize()";
_row.Initialize();
RDebugUtils.currentLine=13238300;
 //BA.debugLineNum = 13238300;BA.debugLine="row=parser.NextObject";
_row = _parser.NextObject();
RDebugUtils.currentLine=13238302;
 //BA.debugLineNum = 13238302;BA.debugLine="userId=row.Get(\"id\")";
_userid = (int)(BA.ObjectToNumber(_row.Get((Object)("id"))));
RDebugUtils.currentLine=13238303;
 //BA.debugLineNum = 13238303;BA.debugLine="pass=row.Get(\"password\")";
_pass = BA.ObjectToString(_row.Get((Object)("password")));
RDebugUtils.currentLine=13238305;
 //BA.debugLineNum = 13238305;BA.debugLine="If(userId > 0 )Then";
if ((_userid>0)) { 
RDebugUtils.currentLine=13238307;
 //BA.debugLineNum = 13238307;BA.debugLine="If(Main.userInfo.IsInitialized =False) Then";
if ((mostCurrent._main._userinfo.IsInitialized()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=13238308;
 //BA.debugLineNum = 13238308;BA.debugLine="Main.userInfo.Initialize";
mostCurrent._main._userinfo.Initialize();
 };
RDebugUtils.currentLine=13238310;
 //BA.debugLineNum = 13238310;BA.debugLine="Main.userInfo.Put(\"user_name\",row.Get(\"userN";
mostCurrent._main._userinfo.Put((Object)("user_name"),_row.Get((Object)("userName")));
RDebugUtils.currentLine=13238311;
 //BA.debugLineNum = 13238311;BA.debugLine="Main.userInfo.Put(\"pass\",row.Get(\"password\")";
mostCurrent._main._userinfo.Put((Object)("pass"),_row.Get((Object)("password")));
RDebugUtils.currentLine=13238312;
 //BA.debugLineNum = 13238312;BA.debugLine="Main.userInfo.Put(\"user_id\",row.Get(\"id\"))";
mostCurrent._main._userinfo.Put((Object)("user_id"),_row.Get((Object)("id")));
RDebugUtils.currentLine=13238313;
 //BA.debugLineNum = 13238313;BA.debugLine="Main.userInfo.Put(\"line_number\",row.Get(\"lin";
mostCurrent._main._userinfo.Put((Object)("line_number"),_row.Get((Object)("line")));
RDebugUtils.currentLine=13238318;
 //BA.debugLineNum = 13238318;BA.debugLine="Msgbox2(row.Get(\"name\")   _ 									,row.Ge";
anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToString(_row.Get((Object)("name"))),BA.ObjectToString(_row.Get((Object)("family"))),"شروع استفاده از برنامه ","","",(android.graphics.Bitmap)(mostCurrent._main._groupicon.getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=13238323;
 //BA.debugLineNum = 13238323;BA.debugLine="CallSubDelayed(Main , \"writeInfo\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(mostCurrent.activityBA,(Object)(mostCurrent._main.getObject()),"writeInfo");
RDebugUtils.currentLine=13238324;
 //BA.debugLineNum = 13238324;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=13238325;
 //BA.debugLineNum = 13238325;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=13238326;
 //BA.debugLineNum = 13238326;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=13238328;
 //BA.debugLineNum = 13238328;BA.debugLine="If firs=False Then";
if (_firs==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=13238329;
 //BA.debugLineNum = 13238329;BA.debugLine="Msgbox(row.Get(\"name\"),row.Get(\"family\"))";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToString(_row.Get((Object)("name"))),BA.ObjectToString(_row.Get((Object)("family"))),mostCurrent.activityBA);
 };
 };
RDebugUtils.currentLine=13238333;
 //BA.debugLineNum = 13238333;BA.debugLine="Job.Release";
_job._release(null);
 break; }
}
;
 }else {
RDebugUtils.currentLine=13238338;
 //BA.debugLineNum = 13238338;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .",anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e117) {
			processBA.setLastException(e117);RDebugUtils.currentLine=13238341;
 //BA.debugLineNum = 13238341;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات ثبت نام    \",\"خطا\"";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ثبت نام    ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=13238346;
 //BA.debugLineNum = 13238346;BA.debugLine="End Sub";
return "";
}
}