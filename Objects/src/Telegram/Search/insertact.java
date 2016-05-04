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

public class insertact extends Activity implements B4AActivity{
	public static insertact mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Telegram.Search", "Telegram.Search.insertact");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (insertact).");
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
		activityBA = new BA(this, layout, processBA, "Telegram.Search", "Telegram.Search.insertact");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Telegram.Search.insertact", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (insertact) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (insertact) Resume **");
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
		return insertact.class;
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
        BA.LogInfo("** Activity (insertact) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (insertact) Resume **");
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
public static String _name = "";
public static String _desciption = "";
public static String _address = "";
public static anywheresoftware.b4a.objects.collections.List _searchresult = null;
public static String _ostan = "";
public static String _shahr = "";
public static String _tag = "";
public static String _admin = "";
public static String _cat = "";
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _groupicon = null;
public static int _selectedostan = 0;
public static int _selectedshahr = 0;
public static int _selectedcat = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaddress = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdescription = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelname = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeladdress = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtadmin = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnerostan = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnershahr = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnercat = null;
public anywheresoftware.b4a.objects.LabelWrapper _label9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttag = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelinput = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btninsert = null;
public de.amberhome.navdrawer.NavigationDrawer _navi = null;
public anywheresoftware.b4a.objects.PanelWrapper _pcantent = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editmembercount = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public Telegram.Search.main _main = null;
public Telegram.Search.httputils2service _httputils2service = null;
public Telegram.Search.aboutact _aboutact = null;
public Telegram.Search.searchresultact _searchresultact = null;
public Telegram.Search.dbutils _dbutils = null;
public Telegram.Search.helpact _helpact = null;
public Telegram.Search.contactact _contactact = null;
public Telegram.Search.groupviewact _groupviewact = null;
public Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public Telegram.Search.searchact _searchact = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
mostCurrent._navi.Initialize2(mostCurrent.activityBA,"navi",(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._activity.getObject())),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
mostCurrent._navi.getNavigationPanel().LoadLayout("menu",mostCurrent.activityBA);
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="pCantent.Initialize(\"\")";
mostCurrent._pcantent.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
mostCurrent._navi.getContentPanel().AddView((android.view.View)(mostCurrent._pcantent.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="pCantent.LoadLayout(\"insertview\")";
mostCurrent._pcantent.LoadLayout("insertview",mostCurrent.activityBA);
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="pCantent.SendToBack";
mostCurrent._pcantent.SendToBack();
RDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="btnInsert.TextSize= 15";
mostCurrent._btninsert.setTextSize((float) (15));
RDebugUtils.currentLine=9961487;
 //BA.debugLineNum = 9961487;BA.debugLine="btnInsert.Gravity= Gravity.CENTER";
mostCurrent._btninsert.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=9961488;
 //BA.debugLineNum = 9961488;BA.debugLine="btnInsert.Typeface=Main.font";
mostCurrent._btninsert.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961490;
 //BA.debugLineNum = 9961490;BA.debugLine="LabelName.TextSize= 15";
mostCurrent._labelname.setTextSize((float) (15));
RDebugUtils.currentLine=9961491;
 //BA.debugLineNum = 9961491;BA.debugLine="LabelName.Gravity= Gravity.RIGHT";
mostCurrent._labelname.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961492;
 //BA.debugLineNum = 9961492;BA.debugLine="LabelName.Typeface=Main.font";
mostCurrent._labelname.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961494;
 //BA.debugLineNum = 9961494;BA.debugLine="txtName.TextSize=15";
mostCurrent._txtname.setTextSize((float) (15));
RDebugUtils.currentLine=9961495;
 //BA.debugLineNum = 9961495;BA.debugLine="txtName.Gravity=Gravity.RIGHT";
mostCurrent._txtname.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961496;
 //BA.debugLineNum = 9961496;BA.debugLine="txtName.Typeface=Main.font";
mostCurrent._txtname.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961497;
 //BA.debugLineNum = 9961497;BA.debugLine="txtName.Color=Colors.RGB(179,229,252)";
mostCurrent._txtname.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=9961499;
 //BA.debugLineNum = 9961499;BA.debugLine="LabelDesc.TextSize= 15";
mostCurrent._labeldesc.setTextSize((float) (15));
RDebugUtils.currentLine=9961500;
 //BA.debugLineNum = 9961500;BA.debugLine="LabelDesc.Gravity= Gravity.RIGHT";
mostCurrent._labeldesc.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961501;
 //BA.debugLineNum = 9961501;BA.debugLine="LabelDesc.Typeface=Main.font";
mostCurrent._labeldesc.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961502;
 //BA.debugLineNum = 9961502;BA.debugLine="txtDescription.TextSize=15";
mostCurrent._txtdescription.setTextSize((float) (15));
RDebugUtils.currentLine=9961503;
 //BA.debugLineNum = 9961503;BA.debugLine="txtDescription.Gravity=Gravity.RIGHT";
mostCurrent._txtdescription.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961504;
 //BA.debugLineNum = 9961504;BA.debugLine="txtDescription.Typeface=Main.font";
mostCurrent._txtdescription.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961505;
 //BA.debugLineNum = 9961505;BA.debugLine="txtDescription.Color=Colors.RGB(179,229,252)";
mostCurrent._txtdescription.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=9961507;
 //BA.debugLineNum = 9961507;BA.debugLine="LabelAddress.TextSize= 15";
mostCurrent._labeladdress.setTextSize((float) (15));
RDebugUtils.currentLine=9961508;
 //BA.debugLineNum = 9961508;BA.debugLine="LabelAddress.Gravity= Gravity.RIGHT";
mostCurrent._labeladdress.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961509;
 //BA.debugLineNum = 9961509;BA.debugLine="LabelAddress.Typeface=Main.font";
mostCurrent._labeladdress.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961510;
 //BA.debugLineNum = 9961510;BA.debugLine="txtAddress.TextSize=15";
mostCurrent._txtaddress.setTextSize((float) (15));
RDebugUtils.currentLine=9961511;
 //BA.debugLineNum = 9961511;BA.debugLine="txtAddress.Gravity=Gravity.RIGHT";
mostCurrent._txtaddress.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961512;
 //BA.debugLineNum = 9961512;BA.debugLine="txtAddress.Typeface=Main.font";
mostCurrent._txtaddress.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961513;
 //BA.debugLineNum = 9961513;BA.debugLine="txtAddress.Color=Colors.RGB(179,229,252)";
mostCurrent._txtaddress.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=9961515;
 //BA.debugLineNum = 9961515;BA.debugLine="Label10.TextSize= 15";
mostCurrent._label10.setTextSize((float) (15));
RDebugUtils.currentLine=9961516;
 //BA.debugLineNum = 9961516;BA.debugLine="Label10.Gravity= Gravity.RIGHT";
mostCurrent._label10.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961517;
 //BA.debugLineNum = 9961517;BA.debugLine="Label10.Typeface=Main.font";
mostCurrent._label10.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961518;
 //BA.debugLineNum = 9961518;BA.debugLine="txtTag.TextSize=15";
mostCurrent._txttag.setTextSize((float) (15));
RDebugUtils.currentLine=9961519;
 //BA.debugLineNum = 9961519;BA.debugLine="txtTag.Gravity=Gravity.RIGHT";
mostCurrent._txttag.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961520;
 //BA.debugLineNum = 9961520;BA.debugLine="txtTag.Typeface=Main.font";
mostCurrent._txttag.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961521;
 //BA.debugLineNum = 9961521;BA.debugLine="txtTag.Color=Colors.RGB(179,229,252)";
mostCurrent._txttag.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=9961523;
 //BA.debugLineNum = 9961523;BA.debugLine="Label6.TextSize= 15";
mostCurrent._label6.setTextSize((float) (15));
RDebugUtils.currentLine=9961524;
 //BA.debugLineNum = 9961524;BA.debugLine="Label6.Gravity= Gravity.RIGHT";
mostCurrent._label6.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961525;
 //BA.debugLineNum = 9961525;BA.debugLine="Label6.Typeface=Main.font";
mostCurrent._label6.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961534;
 //BA.debugLineNum = 9961534;BA.debugLine="SpinnerCat.TextColor =Colors.Black";
mostCurrent._spinnercat.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=9961535;
 //BA.debugLineNum = 9961535;BA.debugLine="SpinnerOstan.TextColor =Colors.Black";
mostCurrent._spinnerostan.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=9961536;
 //BA.debugLineNum = 9961536;BA.debugLine="SpinnerShahr.TextColor =Colors.Black";
mostCurrent._spinnershahr.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=9961538;
 //BA.debugLineNum = 9961538;BA.debugLine="SpinnerCat.DropdownTextColor =Colors.White";
mostCurrent._spinnercat.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9961539;
 //BA.debugLineNum = 9961539;BA.debugLine="SpinnerOstan.DropdownTextColor =Colors.White";
mostCurrent._spinnerostan.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9961540;
 //BA.debugLineNum = 9961540;BA.debugLine="SpinnerShahr.DropdownTextColor =Colors.White";
mostCurrent._spinnershahr.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9961543;
 //BA.debugLineNum = 9961543;BA.debugLine="Label7.TextSize= 15";
mostCurrent._label7.setTextSize((float) (15));
RDebugUtils.currentLine=9961544;
 //BA.debugLineNum = 9961544;BA.debugLine="Label7.Gravity= Gravity.RIGHT";
mostCurrent._label7.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961545;
 //BA.debugLineNum = 9961545;BA.debugLine="Label7.Typeface=Main.font";
mostCurrent._label7.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961548;
 //BA.debugLineNum = 9961548;BA.debugLine="Label8.TextSize= 15";
mostCurrent._label8.setTextSize((float) (15));
RDebugUtils.currentLine=9961549;
 //BA.debugLineNum = 9961549;BA.debugLine="Label8.Gravity= Gravity.RIGHT";
mostCurrent._label8.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961550;
 //BA.debugLineNum = 9961550;BA.debugLine="Label8.Typeface=Main.font";
mostCurrent._label8.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961552;
 //BA.debugLineNum = 9961552;BA.debugLine="Label9.TextSize= 15";
mostCurrent._label9.setTextSize((float) (15));
RDebugUtils.currentLine=9961553;
 //BA.debugLineNum = 9961553;BA.debugLine="Label9.Gravity= Gravity.RIGHT";
mostCurrent._label9.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961554;
 //BA.debugLineNum = 9961554;BA.debugLine="Label9.Typeface=Main.font";
mostCurrent._label9.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961555;
 //BA.debugLineNum = 9961555;BA.debugLine="txtAdmin.TextSize=15";
mostCurrent._txtadmin.setTextSize((float) (15));
RDebugUtils.currentLine=9961556;
 //BA.debugLineNum = 9961556;BA.debugLine="txtAdmin.Gravity=Gravity.RIGHT";
mostCurrent._txtadmin.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961557;
 //BA.debugLineNum = 9961557;BA.debugLine="txtAdmin.Typeface=Main.font";
mostCurrent._txtadmin.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961558;
 //BA.debugLineNum = 9961558;BA.debugLine="txtAdmin.Color=Colors.RGB(179,229,252)";
mostCurrent._txtadmin.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=9961560;
 //BA.debugLineNum = 9961560;BA.debugLine="EditMemberCount.TextSize=15";
mostCurrent._editmembercount.setTextSize((float) (15));
RDebugUtils.currentLine=9961561;
 //BA.debugLineNum = 9961561;BA.debugLine="EditMemberCount.Gravity=Gravity.RIGHT";
mostCurrent._editmembercount.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961562;
 //BA.debugLineNum = 9961562;BA.debugLine="EditMemberCount.Typeface=Main.font";
mostCurrent._editmembercount.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961563;
 //BA.debugLineNum = 9961563;BA.debugLine="EditMemberCount.Color=Colors.RGB(179,229,252)";
mostCurrent._editmembercount.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=9961565;
 //BA.debugLineNum = 9961565;BA.debugLine="Select Main.selectedType";
switch (BA.switchObjectToInt(mostCurrent._main._selectedtype,"group","id","sticker","robot","channel","ads","order")) {
case 0: {
RDebugUtils.currentLine=9961568;
 //BA.debugLineNum = 9961568;BA.debugLine="LabelName.Text = \"اسم گروه:\"";
mostCurrent._labelname.setText((Object)("اسم گروه:"));
RDebugUtils.currentLine=9961570;
 //BA.debugLineNum = 9961570;BA.debugLine="LabelDesc.Text=\"متن کوتاه درباره گروه:\"";
mostCurrent._labeldesc.setText((Object)("متن کوتاه درباره گروه:"));
RDebugUtils.currentLine=9961571;
 //BA.debugLineNum = 9961571;BA.debugLine="LabelAddress.Text=\"آدرس گروه :  شبیه(https://te";
mostCurrent._labeladdress.setText((Object)("آدرس گروه :  شبیه(https://telegram.me/joinchat/xasdsw) آدرس های غیر این باز نمی شوند"));
RDebugUtils.currentLine=9961572;
 //BA.debugLineNum = 9961572;BA.debugLine="Label9.Text =\"موبایل یا آی دی ادمین\"";
mostCurrent._label9.setText((Object)("موبایل یا آی دی ادمین"));
RDebugUtils.currentLine=9961573;
 //BA.debugLineNum = 9961573;BA.debugLine="btnInsert.Text=\"ثبت گروه\"";
mostCurrent._btninsert.setText((Object)("ثبت گروه"));
 break; }
case 1: {
RDebugUtils.currentLine=9961575;
 //BA.debugLineNum = 9961575;BA.debugLine="LabelName.Text = \"نام :\"";
mostCurrent._labelname.setText((Object)("نام :"));
RDebugUtils.currentLine=9961576;
 //BA.debugLineNum = 9961576;BA.debugLine="LabelDesc.Text=\"متن کوتاه درباره خودتون:\"";
mostCurrent._labeldesc.setText((Object)("متن کوتاه درباره خودتون:"));
RDebugUtils.currentLine=9961577;
 //BA.debugLineNum = 9961577;BA.debugLine="LabelAddress.Text=\"آی دی تلگرام :  شبیه(https:/";
mostCurrent._labeladdress.setText((Object)("آی دی تلگرام :  شبیه(https://telegram.me/nasservb) یا @nasservb"));
RDebugUtils.currentLine=9961578;
 //BA.debugLineNum = 9961578;BA.debugLine="Label9.Text =\"موبایل یا آی دی ادمین\"";
mostCurrent._label9.setText((Object)("موبایل یا آی دی ادمین"));
RDebugUtils.currentLine=9961579;
 //BA.debugLineNum = 9961579;BA.debugLine="btnInsert.Text=\"ثبت آی دی\"";
mostCurrent._btninsert.setText((Object)("ثبت آی دی"));
 break; }
case 2: {
RDebugUtils.currentLine=9961581;
 //BA.debugLineNum = 9961581;BA.debugLine="LabelName.Text = \"عنوان :\"";
mostCurrent._labelname.setText((Object)("عنوان :"));
RDebugUtils.currentLine=9961582;
 //BA.debugLineNum = 9961582;BA.debugLine="LabelDesc.Text=\"توضیح کوتاه :\"";
mostCurrent._labeldesc.setText((Object)("توضیح کوتاه :"));
RDebugUtils.currentLine=9961583;
 //BA.debugLineNum = 9961583;BA.debugLine="LabelAddress.Text=\"آدرس تلگرام:  شبیه(https://t";
mostCurrent._labeladdress.setText((Object)("آدرس تلگرام:  شبیه(https://telegram.me/addstickers/ziba)  یا @ziba"));
RDebugUtils.currentLine=9961584;
 //BA.debugLineNum = 9961584;BA.debugLine="Label9.Text =\"موبایل یا آی دی سازنده \"";
mostCurrent._label9.setText((Object)("موبایل یا آی دی سازنده "));
RDebugUtils.currentLine=9961585;
 //BA.debugLineNum = 9961585;BA.debugLine="btnInsert.Text=\"ثبت استیکر\"";
mostCurrent._btninsert.setText((Object)("ثبت استیکر"));
 break; }
case 3: {
RDebugUtils.currentLine=9961587;
 //BA.debugLineNum = 9961587;BA.debugLine="LabelName.Text = \"عنوان :\"";
mostCurrent._labelname.setText((Object)("عنوان :"));
RDebugUtils.currentLine=9961588;
 //BA.debugLineNum = 9961588;BA.debugLine="LabelDesc.Text=\"توضیح کوتاه :\"";
mostCurrent._labeldesc.setText((Object)("توضیح کوتاه :"));
RDebugUtils.currentLine=9961589;
 //BA.debugLineNum = 9961589;BA.debugLine="LabelAddress.Text=\"آدرس تلگرام:  شبیه(https://t";
mostCurrent._labeladdress.setText((Object)("آدرس تلگرام:  شبیه(https://telegram.me/bot_gard) یا @bot_gard"));
RDebugUtils.currentLine=9961590;
 //BA.debugLineNum = 9961590;BA.debugLine="Label9.Text =\"موبایل یا آی دی سازنده\"";
mostCurrent._label9.setText((Object)("موبایل یا آی دی سازنده"));
RDebugUtils.currentLine=9961591;
 //BA.debugLineNum = 9961591;BA.debugLine="btnInsert.Text=\"ثبت ربات\"";
mostCurrent._btninsert.setText((Object)("ثبت ربات"));
 break; }
case 4: {
RDebugUtils.currentLine=9961594;
 //BA.debugLineNum = 9961594;BA.debugLine="LabelName.Text = \"عنوان :\"";
mostCurrent._labelname.setText((Object)("عنوان :"));
RDebugUtils.currentLine=9961595;
 //BA.debugLineNum = 9961595;BA.debugLine="LabelDesc.Text=\"توضیح کوتاه :\"";
mostCurrent._labeldesc.setText((Object)("توضیح کوتاه :"));
RDebugUtils.currentLine=9961596;
 //BA.debugLineNum = 9961596;BA.debugLine="LabelAddress.Text=\"آدرس تلگرام:  شبیه(https://t";
mostCurrent._labeladdress.setText((Object)("آدرس تلگرام:  شبیه(https://telegram.me/mamadar_ir)  یا @mamadar_ir . "));
RDebugUtils.currentLine=9961597;
 //BA.debugLineNum = 9961597;BA.debugLine="Label9.Text =\"موبایل یا آی دی ادمین\"";
mostCurrent._label9.setText((Object)("موبایل یا آی دی ادمین"));
RDebugUtils.currentLine=9961598;
 //BA.debugLineNum = 9961598;BA.debugLine="btnInsert.Text=\"ثبت کانال\"";
mostCurrent._btninsert.setText((Object)("ثبت کانال"));
 break; }
case 5: {
RDebugUtils.currentLine=9961600;
 //BA.debugLineNum = 9961600;BA.debugLine="LabelName.Text = \"عنوان تبلیغ:\"";
mostCurrent._labelname.setText((Object)("عنوان تبلیغ:"));
RDebugUtils.currentLine=9961601;
 //BA.debugLineNum = 9961601;BA.debugLine="LabelDesc.Text=\"توضیح کوتاه :\"";
mostCurrent._labeldesc.setText((Object)("توضیح کوتاه :"));
RDebugUtils.currentLine=9961602;
 //BA.debugLineNum = 9961602;BA.debugLine="LabelAddress.Text=\"آدرس :  شبیه(آدرس وب شبیه ht";
mostCurrent._labeladdress.setText((Object)("آدرس :  شبیه(آدرس وب شبیه http://)  یا (آدرس تلگرام شبیه @mamadar_ir ) "));
RDebugUtils.currentLine=9961603;
 //BA.debugLineNum = 9961603;BA.debugLine="Label9.Text =\"موبایل یا آی دی ادمین\"";
mostCurrent._label9.setText((Object)("موبایل یا آی دی ادمین"));
RDebugUtils.currentLine=9961604;
 //BA.debugLineNum = 9961604;BA.debugLine="btnInsert.Text=\"ثبت و ادامه \"";
mostCurrent._btninsert.setText((Object)("ثبت و ادامه "));
 break; }
case 6: {
RDebugUtils.currentLine=9961606;
 //BA.debugLineNum = 9961606;BA.debugLine="LabelName.Text = \"عنوان استیکر:\"";
mostCurrent._labelname.setText((Object)("عنوان استیکر:"));
RDebugUtils.currentLine=9961607;
 //BA.debugLineNum = 9961607;BA.debugLine="LabelDesc.Text=\"  - متن توضیح کوتاه :\"";
mostCurrent._labeldesc.setText((Object)("  - متن توضیح کوتاه :"));
RDebugUtils.currentLine=9961608;
 //BA.debugLineNum = 9961608;BA.debugLine="LabelAddress.Text=\"شماره استیکر های درخواستی- ا";
mostCurrent._labeladdress.setText((Object)("شماره استیکر های درخواستی- از لیست استیکر های نمونه تهیه کنید 1-2-... "));
RDebugUtils.currentLine=9961609;
 //BA.debugLineNum = 9961609;BA.debugLine="Label9.Text =\"موبایل یا آی دی تلگرام برای تحویل";
mostCurrent._label9.setText((Object)("موبایل یا آی دی تلگرام برای تحویل استیکر"));
RDebugUtils.currentLine=9961610;
 //BA.debugLineNum = 9961610;BA.debugLine="btnInsert.Text=\"ثبت و ادامه \"";
mostCurrent._btninsert.setText((Object)("ثبت و ادامه "));
 break; }
}
;
RDebugUtils.currentLine=9961614;
 //BA.debugLineNum = 9961614;BA.debugLine="Label5.TextSize= 15";
mostCurrent._label5.setTextSize((float) (15));
RDebugUtils.currentLine=9961615;
 //BA.debugLineNum = 9961615;BA.debugLine="Label5.Gravity= Gravity.RIGHT";
mostCurrent._label5.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9961616;
 //BA.debugLineNum = 9961616;BA.debugLine="Label5.Typeface=Main.font";
mostCurrent._label5.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=9961618;
 //BA.debugLineNum = 9961618;BA.debugLine="If Main.isEdit = True Then";
if (mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=9961619;
 //BA.debugLineNum = 9961619;BA.debugLine="Label5.Text  = \" ویرایش اطلاعات \"  & Main.select";
mostCurrent._label5.setText((Object)(" ویرایش اطلاعات "+mostCurrent._main._selectedtypetitle));
RDebugUtils.currentLine=9961620;
 //BA.debugLineNum = 9961620;BA.debugLine="Activity.Title= \" ویرایش اطلاعات \"  & Main.selec";
mostCurrent._activity.setTitle((Object)(" ویرایش اطلاعات "+mostCurrent._main._selectedtypetitle));
 }else 
{RDebugUtils.currentLine=9961622;
 //BA.debugLineNum = 9961622;BA.debugLine="Else If  Main.isSuperGroup=True Then";
if (mostCurrent._main._issupergroup==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=9961625;
 //BA.debugLineNum = 9961625;BA.debugLine="Label5.Text =  \"    .تعداد مجوز باقیمانده  : \" _";
mostCurrent._label5.setText((Object)("    .تعداد مجوز باقیمانده  : "+BA.NumberToString((2-mostCurrent._main._vipinsertcount))));
RDebugUtils.currentLine=9961627;
 //BA.debugLineNum = 9961627;BA.debugLine="Activity.Title= \"   ثبت اطلاعات سوپر گروه \"";
mostCurrent._activity.setTitle((Object)("   ثبت اطلاعات سوپر گروه "));
RDebugUtils.currentLine=9961629;
 //BA.debugLineNum = 9961629;BA.debugLine="Label4.Color =Colors.rgb(236,64,122)";
mostCurrent._label4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (236),(int) (64),(int) (122)));
 }else {
RDebugUtils.currentLine=9961632;
 //BA.debugLineNum = 9961632;BA.debugLine="Label5.Text  = \" ثبت اطلاعات \"  & Main.selectedT";
mostCurrent._label5.setText((Object)(" ثبت اطلاعات "+mostCurrent._main._selectedtypetitle));
RDebugUtils.currentLine=9961633;
 //BA.debugLineNum = 9961633;BA.debugLine="Activity.Title= \" ثبت اطلاعات \"  & Main.selected";
mostCurrent._activity.setTitle((Object)(" ثبت اطلاعات "+mostCurrent._main._selectedtypetitle));
 }};
RDebugUtils.currentLine=9961638;
 //BA.debugLineNum = 9961638;BA.debugLine="If(Main.selectedType <>  \"sticker\" And Main.selec";
if (((mostCurrent._main._selectedtype).equals("sticker") == false && (mostCurrent._main._selectedtype).equals("robot") == false && (mostCurrent._main._selectedtype).equals("id") == false && (mostCurrent._main._selectedtype).equals("order") == false)) { 
RDebugUtils.currentLine=9961641;
 //BA.debugLineNum = 9961641;BA.debugLine="Label7.Visible = True";
mostCurrent._label7.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9961642;
 //BA.debugLineNum = 9961642;BA.debugLine="SpinnerOstan.Visible= True";
mostCurrent._spinnerostan.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9961643;
 //BA.debugLineNum = 9961643;BA.debugLine="SpinnerShahr.Visible = True";
mostCurrent._spinnershahr.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9961646;
 //BA.debugLineNum = 9961646;BA.debugLine="SpinnerOstan.Add(\"آذربايجان شرقي\")";
mostCurrent._spinnerostan.Add("آذربايجان شرقي");
RDebugUtils.currentLine=9961647;
 //BA.debugLineNum = 9961647;BA.debugLine="SpinnerOstan.Add(\"آذربايجان غربي\")";
mostCurrent._spinnerostan.Add("آذربايجان غربي");
RDebugUtils.currentLine=9961648;
 //BA.debugLineNum = 9961648;BA.debugLine="SpinnerOstan.Add(\"اردبيل\")";
mostCurrent._spinnerostan.Add("اردبيل");
RDebugUtils.currentLine=9961649;
 //BA.debugLineNum = 9961649;BA.debugLine="SpinnerOstan.Add(\"اصفهان\")";
mostCurrent._spinnerostan.Add("اصفهان");
RDebugUtils.currentLine=9961650;
 //BA.debugLineNum = 9961650;BA.debugLine="SpinnerOstan.Add(\"ايلام\")";
mostCurrent._spinnerostan.Add("ايلام");
RDebugUtils.currentLine=9961651;
 //BA.debugLineNum = 9961651;BA.debugLine="SpinnerOstan.Add(\"بوشهر\")";
mostCurrent._spinnerostan.Add("بوشهر");
RDebugUtils.currentLine=9961652;
 //BA.debugLineNum = 9961652;BA.debugLine="SpinnerOstan.Add(\"تهران\")";
mostCurrent._spinnerostan.Add("تهران");
RDebugUtils.currentLine=9961653;
 //BA.debugLineNum = 9961653;BA.debugLine="SpinnerOstan.Add(\"چهارمحال وبختياري\")";
mostCurrent._spinnerostan.Add("چهارمحال وبختياري");
RDebugUtils.currentLine=9961654;
 //BA.debugLineNum = 9961654;BA.debugLine="SpinnerOstan.Add(\"خراسان جنوبي\")";
mostCurrent._spinnerostan.Add("خراسان جنوبي");
RDebugUtils.currentLine=9961655;
 //BA.debugLineNum = 9961655;BA.debugLine="SpinnerOstan.Add(\"خراسان رضوي\")";
mostCurrent._spinnerostan.Add("خراسان رضوي");
RDebugUtils.currentLine=9961656;
 //BA.debugLineNum = 9961656;BA.debugLine="SpinnerOstan.Add(\"خراسان شمالي\")";
mostCurrent._spinnerostan.Add("خراسان شمالي");
RDebugUtils.currentLine=9961657;
 //BA.debugLineNum = 9961657;BA.debugLine="SpinnerOstan.Add(\"خوزستان\")";
mostCurrent._spinnerostan.Add("خوزستان");
RDebugUtils.currentLine=9961658;
 //BA.debugLineNum = 9961658;BA.debugLine="SpinnerOstan.Add(\"زنجان\")";
mostCurrent._spinnerostan.Add("زنجان");
RDebugUtils.currentLine=9961659;
 //BA.debugLineNum = 9961659;BA.debugLine="SpinnerOstan.Add(\"سمنان\")";
mostCurrent._spinnerostan.Add("سمنان");
RDebugUtils.currentLine=9961660;
 //BA.debugLineNum = 9961660;BA.debugLine="SpinnerOstan.Add(\"سيستان و بلوچستان\")";
mostCurrent._spinnerostan.Add("سيستان و بلوچستان");
RDebugUtils.currentLine=9961661;
 //BA.debugLineNum = 9961661;BA.debugLine="SpinnerOstan.Add(\"فارس\")";
mostCurrent._spinnerostan.Add("فارس");
RDebugUtils.currentLine=9961662;
 //BA.debugLineNum = 9961662;BA.debugLine="SpinnerOstan.Add(\"قزوين\")";
mostCurrent._spinnerostan.Add("قزوين");
RDebugUtils.currentLine=9961663;
 //BA.debugLineNum = 9961663;BA.debugLine="SpinnerOstan.Add(\"قم\")";
mostCurrent._spinnerostan.Add("قم");
RDebugUtils.currentLine=9961664;
 //BA.debugLineNum = 9961664;BA.debugLine="SpinnerOstan.Add(\"كردستان\")";
mostCurrent._spinnerostan.Add("كردستان");
RDebugUtils.currentLine=9961665;
 //BA.debugLineNum = 9961665;BA.debugLine="SpinnerOstan.Add(\"كرمان\")";
mostCurrent._spinnerostan.Add("كرمان");
RDebugUtils.currentLine=9961666;
 //BA.debugLineNum = 9961666;BA.debugLine="SpinnerOstan.Add(\"كرمانشاه\")";
mostCurrent._spinnerostan.Add("كرمانشاه");
RDebugUtils.currentLine=9961667;
 //BA.debugLineNum = 9961667;BA.debugLine="SpinnerOstan.Add(\"كهگيلويه وبوير احمد\")";
mostCurrent._spinnerostan.Add("كهگيلويه وبوير احمد");
RDebugUtils.currentLine=9961668;
 //BA.debugLineNum = 9961668;BA.debugLine="SpinnerOstan.Add(\"گلستان\")";
mostCurrent._spinnerostan.Add("گلستان");
RDebugUtils.currentLine=9961669;
 //BA.debugLineNum = 9961669;BA.debugLine="SpinnerOstan.Add(\"گيلان\")";
mostCurrent._spinnerostan.Add("گيلان");
RDebugUtils.currentLine=9961670;
 //BA.debugLineNum = 9961670;BA.debugLine="SpinnerOstan.Add(\"لرستان\")";
mostCurrent._spinnerostan.Add("لرستان");
RDebugUtils.currentLine=9961671;
 //BA.debugLineNum = 9961671;BA.debugLine="SpinnerOstan.Add(\"مازندران\")";
mostCurrent._spinnerostan.Add("مازندران");
RDebugUtils.currentLine=9961672;
 //BA.debugLineNum = 9961672;BA.debugLine="SpinnerOstan.Add(\"مركزي\")";
mostCurrent._spinnerostan.Add("مركزي");
RDebugUtils.currentLine=9961673;
 //BA.debugLineNum = 9961673;BA.debugLine="SpinnerOstan.Add(\"هرمزگان\")";
mostCurrent._spinnerostan.Add("هرمزگان");
RDebugUtils.currentLine=9961674;
 //BA.debugLineNum = 9961674;BA.debugLine="SpinnerOstan.Add(\"همدان\")";
mostCurrent._spinnerostan.Add("همدان");
RDebugUtils.currentLine=9961675;
 //BA.debugLineNum = 9961675;BA.debugLine="SpinnerOstan.Add(\"يزد\")";
mostCurrent._spinnerostan.Add("يزد");
RDebugUtils.currentLine=9961678;
 //BA.debugLineNum = 9961678;BA.debugLine="SpinnerCat.Add(\"دسته بندی نشده\")";
mostCurrent._spinnercat.Add("دسته بندی نشده");
RDebugUtils.currentLine=9961679;
 //BA.debugLineNum = 9961679;BA.debugLine="SpinnerCat.Add(\"رسمی\")";
mostCurrent._spinnercat.Add("رسمی");
RDebugUtils.currentLine=9961680;
 //BA.debugLineNum = 9961680;BA.debugLine="SpinnerCat.Add(\"علمی\")";
mostCurrent._spinnercat.Add("علمی");
RDebugUtils.currentLine=9961681;
 //BA.debugLineNum = 9961681;BA.debugLine="SpinnerCat.Add(\"آموزش-تحصیلی\")";
mostCurrent._spinnercat.Add("آموزش-تحصیلی");
RDebugUtils.currentLine=9961682;
 //BA.debugLineNum = 9961682;BA.debugLine="SpinnerCat.Add(\"طنز و سرگرمی\")";
mostCurrent._spinnercat.Add("طنز و سرگرمی");
RDebugUtils.currentLine=9961683;
 //BA.debugLineNum = 9961683;BA.debugLine="SpinnerCat.Add(\"اجتماعی-خبری\")";
mostCurrent._spinnercat.Add("اجتماعی-خبری");
RDebugUtils.currentLine=9961684;
 //BA.debugLineNum = 9961684;BA.debugLine="SpinnerCat.Add(\"پزشکی-سلامت\")";
mostCurrent._spinnercat.Add("پزشکی-سلامت");
RDebugUtils.currentLine=9961685;
 //BA.debugLineNum = 9961685;BA.debugLine="SpinnerCat.Add(\"دوستان شخصی\")";
mostCurrent._spinnercat.Add("دوستان شخصی");
RDebugUtils.currentLine=9961686;
 //BA.debugLineNum = 9961686;BA.debugLine="SpinnerCat.Add(\"تجاری\")";
mostCurrent._spinnercat.Add("تجاری");
RDebugUtils.currentLine=9961687;
 //BA.debugLineNum = 9961687;BA.debugLine="SpinnerCat.Add(\"ادبی-هنری\")";
mostCurrent._spinnercat.Add("ادبی-هنری");
RDebugUtils.currentLine=9961688;
 //BA.debugLineNum = 9961688;BA.debugLine="SpinnerCat.Add(\"عشق-دلنوشته\")";
mostCurrent._spinnercat.Add("عشق-دلنوشته");
RDebugUtils.currentLine=9961689;
 //BA.debugLineNum = 9961689;BA.debugLine="SpinnerCat.Add(\"اعتقادی\")";
mostCurrent._spinnercat.Add("اعتقادی");
RDebugUtils.currentLine=9961690;
 //BA.debugLineNum = 9961690;BA.debugLine="SpinnerCat.Add(\"شرکت ها-دفتر ها\")";
mostCurrent._spinnercat.Add("شرکت ها-دفتر ها");
RDebugUtils.currentLine=9961691;
 //BA.debugLineNum = 9961691;BA.debugLine="SpinnerCat.Add(\"مشاغل و صنفی\")";
mostCurrent._spinnercat.Add("مشاغل و صنفی");
RDebugUtils.currentLine=9961692;
 //BA.debugLineNum = 9961692;BA.debugLine="SpinnerCat.Add(\"ورزشی\")";
mostCurrent._spinnercat.Add("ورزشی");
RDebugUtils.currentLine=9961693;
 //BA.debugLineNum = 9961693;BA.debugLine="SpinnerCat.Add(\"مد و زیبایی\")";
mostCurrent._spinnercat.Add("مد و زیبایی");
RDebugUtils.currentLine=9961695;
 //BA.debugLineNum = 9961695;BA.debugLine="Label6.Visible =True";
mostCurrent._label6.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9961699;
 //BA.debugLineNum = 9961699;BA.debugLine="PanelInput.RemoveView()";
mostCurrent._panelinput.RemoveView();
RDebugUtils.currentLine=9961702;
 //BA.debugLineNum = 9961702;BA.debugLine="ScrollView.Panel.AddView(PanelInput,0,0,100%x,90";
mostCurrent._scrollview.getPanel().AddView((android.view.View)(mostCurrent._panelinput.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (900)));
RDebugUtils.currentLine=9961703;
 //BA.debugLineNum = 9961703;BA.debugLine="ScrollView.Panel.Height = 880dip";
mostCurrent._scrollview.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (880)));
RDebugUtils.currentLine=9961704;
 //BA.debugLineNum = 9961704;BA.debugLine="ScrollView.Color = Colors.White";
mostCurrent._scrollview.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=9961706;
 //BA.debugLineNum = 9961706;BA.debugLine="If(Main.isEdit= True)Then";
if ((mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=9961707;
 //BA.debugLineNum = 9961707;BA.debugLine="txtName.Text = Main.selected_item.Get(\"title\")";
mostCurrent._txtname.setText(mostCurrent._main._selected_item.Get((Object)("title")));
RDebugUtils.currentLine=9961708;
 //BA.debugLineNum = 9961708;BA.debugLine="txtDescription.Text= Main.selected_item.Get(\"de";
mostCurrent._txtdescription.setText(mostCurrent._main._selected_item.Get((Object)("description")));
RDebugUtils.currentLine=9961709;
 //BA.debugLineNum = 9961709;BA.debugLine="txtTag.Text= Main.selected_item.Get(\"tag\")";
mostCurrent._txttag.setText(mostCurrent._main._selected_item.Get((Object)("tag")));
RDebugUtils.currentLine=9961710;
 //BA.debugLineNum = 9961710;BA.debugLine="txtAddress.Text= Main.selected_item.Get(\"telegr";
mostCurrent._txtaddress.setText(mostCurrent._main._selected_item.Get((Object)("telegramAddress")));
RDebugUtils.currentLine=9961711;
 //BA.debugLineNum = 9961711;BA.debugLine="txtAdmin.Text= Main.selected_item.Get(\"ownerId\"";
mostCurrent._txtadmin.setText(mostCurrent._main._selected_item.Get((Object)("ownerId")));
RDebugUtils.currentLine=9961712;
 //BA.debugLineNum = 9961712;BA.debugLine="EditMemberCount.Text= Main.selected_item.Get(\"m";
mostCurrent._editmembercount.setText(mostCurrent._main._selected_item.Get((Object)("memberCount")));
RDebugUtils.currentLine=9961714;
 //BA.debugLineNum = 9961714;BA.debugLine="ScrollView.Panel.Height = 970dip";
mostCurrent._scrollview.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (970)));
 };
 }else {
RDebugUtils.currentLine=9961719;
 //BA.debugLineNum = 9961719;BA.debugLine="Label6.Visible = False";
mostCurrent._label6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9961720;
 //BA.debugLineNum = 9961720;BA.debugLine="Label7.Visible = False";
mostCurrent._label7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9961721;
 //BA.debugLineNum = 9961721;BA.debugLine="SpinnerOstan.Visible= False";
mostCurrent._spinnerostan.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9961722;
 //BA.debugLineNum = 9961722;BA.debugLine="SpinnerOstan.Visible = False";
mostCurrent._spinnerostan.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9961724;
 //BA.debugLineNum = 9961724;BA.debugLine="Label6.Visible =False";
mostCurrent._label6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=9961729;
 //BA.debugLineNum = 9961729;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("activity_pause"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_pause", new Object[] {_userclosed});
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="If(Main.selected_item.IsInitialized=True And  Mai";
if ((mostCurrent._main._selected_item.IsInitialized()==anywheresoftware.b4a.keywords.Common.True && (mostCurrent._main._selected_item.Get((Object)("title"))).equals((Object)(mostCurrent._txtname.getText())) && mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="If Main.isEdit = True Then";
if (mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="Label5.Text  = \" ویرایش اطلاعات \"  & Main.select";
mostCurrent._label5.setText((Object)(" ویرایش اطلاعات "+mostCurrent._main._selectedtypetitle));
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="Activity.Title= \" ویرایش اطلاعات \"  & Main.selec";
mostCurrent._activity.setTitle((Object)(" ویرایش اطلاعات "+mostCurrent._main._selectedtypetitle));
 }else 
{RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Else If  Main.isSuperGroup=True Then";
if (mostCurrent._main._issupergroup==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="Label5.Text = \"  .تعداد مجوز باقیمانده : \" &  _";
mostCurrent._label5.setText((Object)("  .تعداد مجوز باقیمانده : "+BA.NumberToString((1-mostCurrent._main._vipinsertcount))));
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="Activity.Title= \" ثبت اطلاعات سوپر گروه\"";
mostCurrent._activity.setTitle((Object)(" ثبت اطلاعات سوپر گروه"));
RDebugUtils.currentLine=10027024;
 //BA.debugLineNum = 10027024;BA.debugLine="Label4.Color =Colors.rgb(236,64,122)";
mostCurrent._label4.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (236),(int) (64),(int) (122)));
 }else {
RDebugUtils.currentLine=10027029;
 //BA.debugLineNum = 10027029;BA.debugLine="Label5.Text  = \" ثبت اطلاعات \"  & Main.selectedT";
mostCurrent._label5.setText((Object)(" ثبت اطلاعات "+mostCurrent._main._selectedtypetitle));
RDebugUtils.currentLine=10027030;
 //BA.debugLineNum = 10027030;BA.debugLine="Activity.Title= \" ثبت اطلاعات \"  & Main.selected";
mostCurrent._activity.setTitle((Object)(" ثبت اطلاعات "+mostCurrent._main._selectedtypetitle));
 }};
RDebugUtils.currentLine=10027034;
 //BA.debugLineNum = 10027034;BA.debugLine="End Sub";
return "";
}
public static String  _btninsert_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("btninsert_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btninsert_click", null);
String _content = "";
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub btnInsert_Click";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="If(Main.isEdit=False _ 	 	And (Main.selectedType";
if ((mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.False && ((mostCurrent._main._selectedtype).equals("group") || (mostCurrent._main._selectedtype).equals("channel")))) { 
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="If ((Main.isSuperGroup=False )And (Main.todayIn";
if (((mostCurrent._main._issupergroup==anywheresoftware.b4a.keywords.Common.False) && (mostCurrent._main._todayinsertcount>8))) { 
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از هشت گروه یا کا";
anywheresoftware.b4a.keywords.Common.Msgbox("روزانه امکان ثبت بیش از هشت گروه یا کانال وجود ندارد. ","عدم دسترسی",mostCurrent.activityBA);
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="else If ((Main.isSuperGroup=True )And (Main.vip";
if (((mostCurrent._main._issupergroup==anywheresoftware.b4a.keywords.Common.True) && (mostCurrent._main._vipinsertcount>4))) { 
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از چهار سوپر گروه";
anywheresoftware.b4a.keywords.Common.Msgbox("روزانه امکان ثبت بیش از چهار سوپر گروه وجود ندارد. ","عدم دسترسی",mostCurrent.activityBA);
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="Return";
if (true) return "";
 }};
 };
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="If (txtName.Text.Length < 2 Or txtDescription.Tex";
if ((mostCurrent._txtname.getText().length()<2 || mostCurrent._txtdescription.getText().length()<3)) { 
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="Msgbox (\"اطالاعات ورودی کم است-اسم ، توضیح\" ,		\"";
anywheresoftware.b4a.keywords.Common.Msgbox("اطالاعات ورودی کم است-اسم ، توضیح","درج ورودی",mostCurrent.activityBA);
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="If (Main.selectedType<>\"order\" And Main.selectedT";
if (((mostCurrent._main._selectedtype).equals("order") == false && (mostCurrent._main._selectedtype).equals("ads") == false && mostCurrent._txtaddress.getText().length()<4)) { 
RDebugUtils.currentLine=10354708;
 //BA.debugLineNum = 10354708;BA.debugLine="Msgbox (\"آدرس را بنویسید\" , \"آدرس خالی است\" )";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس را بنویسید","آدرس خالی است",mostCurrent.activityBA);
RDebugUtils.currentLine=10354709;
 //BA.debugLineNum = 10354709;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354712;
 //BA.debugLineNum = 10354712;BA.debugLine="Dim content As String";
_content = "";
RDebugUtils.currentLine=10354713;
 //BA.debugLineNum = 10354713;BA.debugLine="content = 	txtName.Text & \" \" & txtDescription.Te";
_content = mostCurrent._txtname.getText()+" "+mostCurrent._txtdescription.getText()+" "+mostCurrent._txttag.getText();
RDebugUtils.currentLine=10354714;
 //BA.debugLineNum = 10354714;BA.debugLine="content = content.ToLowerCase";
_content = _content.toLowerCase();
RDebugUtils.currentLine=10354716;
 //BA.debugLineNum = 10354716;BA.debugLine="If( _  				(content.Contains(\"سکس\") =  True )Or";
if (((_content.contains("سکس")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("sex")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("کس ننه")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("کس ننه")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("بگا")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سگس")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("ارضا")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سکسی")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سیکس")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("xxx")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("همجنس")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("شهو")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سکس")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("کوس")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("کوص")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("جنده")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("ناف")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("کير")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("كير")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("کون")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("پورن")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سوسکی")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("30")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("س ک س")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("gay")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سکسي")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("85")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("کاندوم")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("کیر")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("ممه")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("پستان")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("س.ک.س")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("حشر")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("خاک")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("exi")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("exy")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سسک")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("بکن")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("آبت")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("ابت")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("گوز")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سیکتیر")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("فیلم سوپر")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("لاشی")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("داغ")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("سگس")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("ووف")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("جق")==anywheresoftware.b4a.keywords.Common.True) || (_content.contains("s")==anywheresoftware.b4a.keywords.Common.True && _content.contains("e")==anywheresoftware.b4a.keywords.Common.True && _content.contains("x")==anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=10354767;
 //BA.debugLineNum = 10354767;BA.debugLine="Msgbox(\"خواهش می کنیم مطالب ناهنجار درج نکنید .\"";
anywheresoftware.b4a.keywords.Common.Msgbox("خواهش می کنیم مطالب ناهنجار درج نکنید ."+anywheresoftware.b4a.keywords.Common.CRLF+"هزاران کاربر با سلیقه ها و سن و سالهای مختلف از برنامه استفاده می کنند ."+anywheresoftware.b4a.keywords.Common.CRLF+"ما مجبوریم کاربران متخلف را تا 48 ساعت و در صورت تکرار دائم بلاک کنیم .","  خطای محتوا",mostCurrent.activityBA);
RDebugUtils.currentLine=10354771;
 //BA.debugLineNum = 10354771;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354776;
 //BA.debugLineNum = 10354776;BA.debugLine="If(  txtAddress.Text.StartsWith(\"http://telegram.";
if ((mostCurrent._txtaddress.getText().startsWith("http://telegram.me/"))) { 
RDebugUtils.currentLine=10354777;
 //BA.debugLineNum = 10354777;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"http\"";
mostCurrent._txtaddress.setText((Object)(mostCurrent._txtaddress.getText().replace("http","https")));
 }else 
{RDebugUtils.currentLine=10354778;
 //BA.debugLineNum = 10354778;BA.debugLine="else if (txtAddress.Text.StartsWith(\"telegram.me/";
if ((mostCurrent._txtaddress.getText().startsWith("telegram.me/"))) { 
RDebugUtils.currentLine=10354779;
 //BA.debugLineNum = 10354779;BA.debugLine="txtAddress.Text = \"https://\" & txtAddress.Text";
mostCurrent._txtaddress.setText((Object)("https://"+mostCurrent._txtaddress.getText()));
 }};
RDebugUtils.currentLine=10354782;
 //BA.debugLineNum = 10354782;BA.debugLine="Select Main.selectedType";
switch (BA.switchObjectToInt(mostCurrent._main._selectedtype,"group","ads","id","order","robot","channel","sticker")) {
case 0: {
RDebugUtils.currentLine=10354785;
 //BA.debugLineNum = 10354785;BA.debugLine="If(txtAddress.Text.StartsWith(\"https://telegr";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/") && mostCurrent._txtaddress.getText().startsWith("https://telegram.me/join")==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=10354786;
 //BA.debugLineNum = 10354786;BA.debugLine="Msgbox(\"آدرس ورودی مربوط به گروه نیست . برای";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس ورودی مربوط به گروه نیست . برای ثبت کانال ، ربات و موارد دیگر از بخش مربوط به هرکدام استفاده کنید ","اشکال در ورود اطلاعات",mostCurrent.activityBA);
 }else 
{RDebugUtils.currentLine=10354787;
 //BA.debugLineNum = 10354787;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
if (((mostCurrent._txtaddress.getText().startsWith("http://") || mostCurrent._txtaddress.getText().startsWith("wwww")))) { 
RDebugUtils.currentLine=10354789;
 //BA.debugLineNum = 10354789;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
anywheresoftware.b4a.keywords.Common.Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی",mostCurrent.activityBA);
RDebugUtils.currentLine=10354791;
 //BA.debugLineNum = 10354791;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=10354792;
 //BA.debugLineNum = 10354792;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/join")==anywheresoftware.b4a.keywords.Common.True)) { 
 }else {
RDebugUtils.currentLine=10354795;
 //BA.debugLineNum = 10354795;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات",mostCurrent.activityBA);
RDebugUtils.currentLine=10354796;
 //BA.debugLineNum = 10354796;BA.debugLine="Return";
if (true) return "";
 }}};
RDebugUtils.currentLine=10354799;
 //BA.debugLineNum = 10354799;BA.debugLine="If IsNumber(EditMemberCount.Text)=False Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._editmembercount.getText())==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=10354800;
 //BA.debugLineNum = 10354800;BA.debugLine="EditMemberCount.Text=\"0\"";
mostCurrent._editmembercount.setText((Object)("0"));
 };
 break; }
case 1: {
RDebugUtils.currentLine=10354807;
 //BA.debugLineNum = 10354807;BA.debugLine="If(txtAddress.Text.StartsWith(\"https://telegr";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._txtaddress.getText().contains("@"))) { 
RDebugUtils.currentLine=10354808;
 //BA.debugLineNum = 10354808;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
mostCurrent._txtaddress.setText((Object)(mostCurrent._txtaddress.getText().replace("@","")));
RDebugUtils.currentLine=10354809;
 //BA.debugLineNum = 10354809;BA.debugLine="txtAddress.Text = \"https://telegram.me/\" & t";
mostCurrent._txtaddress.setText((Object)("https://telegram.me/"+mostCurrent._txtaddress.getText()));
 };
 break; }
case 2: {
RDebugUtils.currentLine=10354816;
 //BA.debugLineNum = 10354816;BA.debugLine="If(  txtAddress.Text.Contains(\"@\") And txtAdd";
if ((mostCurrent._txtaddress.getText().contains("@") && mostCurrent._txtaddress.getText().startsWith("https://telegram.me/")==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=10354817;
 //BA.debugLineNum = 10354817;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
mostCurrent._txtaddress.setText((Object)(mostCurrent._txtaddress.getText().replace("@","")));
RDebugUtils.currentLine=10354818;
 //BA.debugLineNum = 10354818;BA.debugLine="txtAddress.Text = \"https://telegram.me/\" & t";
mostCurrent._txtaddress.setText((Object)("https://telegram.me/"+mostCurrent._txtaddress.getText()));
 }else 
{RDebugUtils.currentLine=10354819;
 //BA.debugLineNum = 10354819;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
if (((mostCurrent._txtaddress.getText().startsWith("http://") || mostCurrent._txtaddress.getText().startsWith("www")))) { 
RDebugUtils.currentLine=10354821;
 //BA.debugLineNum = 10354821;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
anywheresoftware.b4a.keywords.Common.Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی",mostCurrent.activityBA);
RDebugUtils.currentLine=10354823;
 //BA.debugLineNum = 10354823;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=10354824;
 //BA.debugLineNum = 10354824;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/")==anywheresoftware.b4a.keywords.Common.True)) { 
 }else {
RDebugUtils.currentLine=10354827;
 //BA.debugLineNum = 10354827;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات",mostCurrent.activityBA);
RDebugUtils.currentLine=10354828;
 //BA.debugLineNum = 10354828;BA.debugLine="Return";
if (true) return "";
 }}};
 break; }
case 3: {
 break; }
case 4: {
RDebugUtils.currentLine=10354834;
 //BA.debugLineNum = 10354834;BA.debugLine="If(  txtAddress.Text.Contains(\"@\") And _";
if ((mostCurrent._txtaddress.getText().contains("@") && mostCurrent._txtaddress.getText().startsWith("https://telegram.me/")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._txtaddress.getText().toLowerCase().contains("bot"))) { 
RDebugUtils.currentLine=10354838;
 //BA.debugLineNum = 10354838;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
mostCurrent._txtaddress.setText((Object)(mostCurrent._txtaddress.getText().replace("@","")));
RDebugUtils.currentLine=10354839;
 //BA.debugLineNum = 10354839;BA.debugLine="txtAddress.Text = \"https://telegram.me/\" & t";
mostCurrent._txtaddress.setText((Object)("https://telegram.me/"+mostCurrent._txtaddress.getText()));
 }else 
{RDebugUtils.currentLine=10354841;
 //BA.debugLineNum = 10354841;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
if (((mostCurrent._txtaddress.getText().startsWith("http://") || mostCurrent._txtaddress.getText().startsWith("www")))) { 
RDebugUtils.currentLine=10354843;
 //BA.debugLineNum = 10354843;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
anywheresoftware.b4a.keywords.Common.Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی",mostCurrent.activityBA);
RDebugUtils.currentLine=10354845;
 //BA.debugLineNum = 10354845;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=10354846;
 //BA.debugLineNum = 10354846;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/bot_")==anywheresoftware.b4a.keywords.Common.True)) { 
 }else {
RDebugUtils.currentLine=10354849;
 //BA.debugLineNum = 10354849;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات",mostCurrent.activityBA);
RDebugUtils.currentLine=10354850;
 //BA.debugLineNum = 10354850;BA.debugLine="Return";
if (true) return "";
 }}};
 break; }
case 5: {
RDebugUtils.currentLine=10354856;
 //BA.debugLineNum = 10354856;BA.debugLine="If(txtAddress.Text.StartsWith(\"https://telegr";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._txtaddress.getText().contains("@"))) { 
RDebugUtils.currentLine=10354857;
 //BA.debugLineNum = 10354857;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
mostCurrent._txtaddress.setText((Object)(mostCurrent._txtaddress.getText().replace("@","")));
RDebugUtils.currentLine=10354858;
 //BA.debugLineNum = 10354858;BA.debugLine="txtAddress.Text = \"https://telegram.me/\" & t";
mostCurrent._txtaddress.setText((Object)("https://telegram.me/"+mostCurrent._txtaddress.getText()));
 }else 
{RDebugUtils.currentLine=10354860;
 //BA.debugLineNum = 10354860;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
if (((mostCurrent._txtaddress.getText().startsWith("http://") || mostCurrent._txtaddress.getText().startsWith("www")))) { 
RDebugUtils.currentLine=10354862;
 //BA.debugLineNum = 10354862;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
anywheresoftware.b4a.keywords.Common.Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست . برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی",mostCurrent.activityBA);
RDebugUtils.currentLine=10354863;
 //BA.debugLineNum = 10354863;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=10354864;
 //BA.debugLineNum = 10354864;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/")==anywheresoftware.b4a.keywords.Common.True)) { 
 }else {
RDebugUtils.currentLine=10354867;
 //BA.debugLineNum = 10354867;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات",mostCurrent.activityBA);
RDebugUtils.currentLine=10354868;
 //BA.debugLineNum = 10354868;BA.debugLine="Return";
if (true) return "";
 }}};
 break; }
case 6: {
RDebugUtils.currentLine=10354872;
 //BA.debugLineNum = 10354872;BA.debugLine="If(txtAddress.Text.StartsWith(\"https://telegr";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/") && mostCurrent._txtaddress.getText().startsWith("https://telegram.me/addstickers")==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=10354873;
 //BA.debugLineNum = 10354873;BA.debugLine="Msgbox(\"آدرس ورودی مربوط به استیکر نیست . بر";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس ورودی مربوط به استیکر نیست . برای ثبت کانال ، ربات و موارد دیگر از بخش مربوط به هرکدام استفاده کنید ","اشکال در ورود اطلاعات",mostCurrent.activityBA);
RDebugUtils.currentLine=10354874;
 //BA.debugLineNum = 10354874;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=10354875;
 //BA.debugLineNum = 10354875;BA.debugLine="else If(txtAddress.Text.StartsWith(\"https://t";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/addstickers")==anywheresoftware.b4a.keywords.Common.False && mostCurrent._txtaddress.getText().contains("@"))) { 
RDebugUtils.currentLine=10354876;
 //BA.debugLineNum = 10354876;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
mostCurrent._txtaddress.setText((Object)(mostCurrent._txtaddress.getText().replace("@","")));
RDebugUtils.currentLine=10354877;
 //BA.debugLineNum = 10354877;BA.debugLine="txtAddress.Text = \"https://telegram.me/addst";
mostCurrent._txtaddress.setText((Object)("https://telegram.me/addstickers/"+mostCurrent._txtaddress.getText()));
 }else 
{RDebugUtils.currentLine=10354879;
 //BA.debugLineNum = 10354879;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
if (((mostCurrent._txtaddress.getText().startsWith("http://") || mostCurrent._txtaddress.getText().startsWith("www")))) { 
RDebugUtils.currentLine=10354881;
 //BA.debugLineNum = 10354881;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
anywheresoftware.b4a.keywords.Common.Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست . برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی",mostCurrent.activityBA);
RDebugUtils.currentLine=10354883;
 //BA.debugLineNum = 10354883;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=10354884;
 //BA.debugLineNum = 10354884;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
if ((mostCurrent._txtaddress.getText().startsWith("https://telegram.me/addstickers")==anywheresoftware.b4a.keywords.Common.True)) { 
 }else {
RDebugUtils.currentLine=10354887;
 //BA.debugLineNum = 10354887;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات",mostCurrent.activityBA);
RDebugUtils.currentLine=10354888;
 //BA.debugLineNum = 10354888;BA.debugLine="Return";
if (true) return "";
 }}}};
 break; }
}
;
RDebugUtils.currentLine=10354893;
 //BA.debugLineNum = 10354893;BA.debugLine="name = txtName.Text";
_name = mostCurrent._txtname.getText();
RDebugUtils.currentLine=10354894;
 //BA.debugLineNum = 10354894;BA.debugLine="desciption=txtDescription.Text";
_desciption = mostCurrent._txtdescription.getText();
RDebugUtils.currentLine=10354895;
 //BA.debugLineNum = 10354895;BA.debugLine="address =txtAddress.Text";
_address = mostCurrent._txtaddress.getText();
RDebugUtils.currentLine=10354896;
 //BA.debugLineNum = 10354896;BA.debugLine="admin=txtAdmin.Text";
_admin = mostCurrent._txtadmin.getText();
RDebugUtils.currentLine=10354897;
 //BA.debugLineNum = 10354897;BA.debugLine="Tag=txtTag.Text";
_tag = mostCurrent._txttag.getText();
RDebugUtils.currentLine=10354898;
 //BA.debugLineNum = 10354898;BA.debugLine="save";
_save();
RDebugUtils.currentLine=10354899;
 //BA.debugLineNum = 10354899;BA.debugLine="End Sub";
return "";
}
public static String  _save() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("save"))
	return (String) Debug.delegate(mostCurrent.activityBA, "save", null);
Telegram.Search.httpjob _job = null;
int _id = 0;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub save";
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Try";
try {RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="ProgressDialogShow(\"درحال ذخیره سازی\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال ذخیره سازی");
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="job.Initialize(\"saveing\", Me)";
_job._initialize(null,processBA,"saveing",insertact.getObject());
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="name = txtName.Text";
_name = mostCurrent._txtname.getText();
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="desciption  =  txtDescription.Text";
_desciption = mostCurrent._txtdescription.getText();
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="address =  txtAddress.Text";
_address = mostCurrent._txtaddress.getText();
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="admin =  txtAdmin.Text";
_admin = mostCurrent._txtadmin.getText();
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="Tag =  txtTag.Text";
_tag = mostCurrent._txttag.getText();
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=10289165;
 //BA.debugLineNum = 10289165;BA.debugLine="If(Main.isEdit = True And Main.selected_item.IsI";
if ((mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.True && mostCurrent._main._selected_item.IsInitialized())) { 
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="id = Main.selected_item.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("id"))));
 }else {
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="id =0";
_id = (int) (0);
 };
RDebugUtils.currentLine=10289171;
 //BA.debugLineNum = 10289171;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.p";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/insert","pass=1266"+"&name="+_name+"&description="+_desciption+"&address="+_address+"&admin="+_admin+"&cat="+BA.NumberToString(_selectedcat)+"&ostan="+BA.NumberToString(_selectedostan)+"&shahr="+BA.NumberToString(_selectedshahr)+"&tag="+_tag+"&type="+mostCurrent._main._selectedtype+"&isEdit="+BA.ObjectToString(mostCurrent._main._isedit)+"&isSupper="+BA.ObjectToString(mostCurrent._main._issupergroup)+"&id="+BA.NumberToString(_id)+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e325) {
			processBA.setLastException(e325);RDebugUtils.currentLine=10289190;
 //BA.debugLineNum = 10289190;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در ارسال اطلاعات   ","خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=10289191;
 //BA.debugLineNum = 10289191;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=10289194;
 //BA.debugLineNum = 10289194;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("btnmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null);
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
mostCurrent._navi.OpenDrawer2(mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return "";
}
public static String  _btnpanel_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("btnpanel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnpanel_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Sub btnPanel_Click";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
anywheresoftware.b4a.keywords.Common.Msgbox("نام کاربری شما :"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+anywheresoftware.b4a.keywords.Common.CRLF+" رمز عبور اولیه شما "+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+" می باشد","رمز عبور",mostCurrent.activityBA);
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/")));
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=10944519;
 //BA.debugLineNum = 10944519;BA.debugLine="End Sub";
return "";
}
public static String  _btnreturn_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("btnreturn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnreturn_click", null);
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub btnReturn_Click";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return "";
}
public static String  _buttonremove_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("buttonremove_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonremove_click", null);
int _id = 0;
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub ButtonRemove_Click";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="id = Main.selected_item.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("id"))));
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Try";
try {RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال ارسال");
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="job.Initialize(\"broke_group\", Me)";
_job._initialize(null,processBA,"broke_group",insertact.getObject());
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/linkBroken/"+BA.NumberToString((_id*34)),"pass=1266"+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&delete=1");
 } 
       catch (Exception e604) {
			processBA.setLastException(e604);RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در ارسال اطلاعات   ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(Telegram.Search.httpjob _job) throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _countries = null;
anywheresoftware.b4a.objects.collections.Map _row = null;
int _id = 0;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Try";
try {RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="res = Job.GetString";
_res = _job._getstring(null);
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="If Job.JobName= \"saveing\" Then";
if ((_job._jobname).equals("saveing")) { 
RDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="Dim COUNTRIES As List";
_countries = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list w";
_countries = _parser.NextArray();
RDebugUtils.currentLine=10223631;
 //BA.debugLineNum = 10223631;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10223633;
 //BA.debugLineNum = 10223633;BA.debugLine="row.Initialize()";
_row.Initialize();
RDebugUtils.currentLine=10223637;
 //BA.debugLineNum = 10223637;BA.debugLine="row.Initialize()";
_row.Initialize();
RDebugUtils.currentLine=10223638;
 //BA.debugLineNum = 10223638;BA.debugLine="row=COUNTRIES.Get(0)";
_row.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_countries.Get((int) (0))));
RDebugUtils.currentLine=10223640;
 //BA.debugLineNum = 10223640;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=10223641;
 //BA.debugLineNum = 10223641;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=10223642;
 //BA.debugLineNum = 10223642;BA.debugLine="id= row.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_row.Get((Object)("id"))));
RDebugUtils.currentLine=10223643;
 //BA.debugLineNum = 10223643;BA.debugLine="If( id> 0 ) Then";
if ((_id>0)) { 
RDebugUtils.currentLine=10223644;
 //BA.debugLineNum = 10223644;BA.debugLine="Main.selected_item = row";
mostCurrent._main._selected_item = _row;
RDebugUtils.currentLine=10223646;
 //BA.debugLineNum = 10223646;BA.debugLine="If(Main.isEdit=False _ 						And (Main.select";
if ((mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.False && ((mostCurrent._main._selectedtype).equals("group") || (mostCurrent._main._selectedtype).equals("channel")))) { 
RDebugUtils.currentLine=10223650;
 //BA.debugLineNum = 10223650;BA.debugLine="If (Main.isSuperGroup=False ) Then";
if ((mostCurrent._main._issupergroup==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=10223651;
 //BA.debugLineNum = 10223651;BA.debugLine="Main.todayInsertCount = Main.todayInsertCou";
mostCurrent._main._todayinsertcount = (int) (mostCurrent._main._todayinsertcount+1);
 }else {
RDebugUtils.currentLine=10223653;
 //BA.debugLineNum = 10223653;BA.debugLine="Main.vipInsertCount = Main.vipInsertCount +";
mostCurrent._main._vipinsertcount = (int) (mostCurrent._main._vipinsertcount+1);
 };
RDebugUtils.currentLine=10223655;
 //BA.debugLineNum = 10223655;BA.debugLine="writeInfo";
_writeinfo();
 };
RDebugUtils.currentLine=10223658;
 //BA.debugLineNum = 10223658;BA.debugLine="If (Main.isEdit=True ) Then";
if ((mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=10223660;
 //BA.debugLineNum = 10223660;BA.debugLine="StartActivity(\"groupViewAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("groupViewAct"));
 };
 }else {
RDebugUtils.currentLine=10223665;
 //BA.debugLineNum = 10223665;BA.debugLine="Msgbox(row.Get(\"title\") , \"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToString(_row.Get((Object)("title"))),"خطا",mostCurrent.activityBA);
 };
 }else 
{RDebugUtils.currentLine=10223667;
 //BA.debugLineNum = 10223667;BA.debugLine="else If( Job.JobName  = \"broke_group\") Then";
if (((_job._jobname).equals("broke_group"))) { 
RDebugUtils.currentLine=10223669;
 //BA.debugLineNum = 10223669;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . مورد حذف شد";
anywheresoftware.b4a.keywords.Common.Msgbox("با تشکر از حسن توجه شما . مورد حذف شد .","درخواست حذف",mostCurrent.activityBA);
RDebugUtils.currentLine=10223670;
 //BA.debugLineNum = 10223670;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }};
 }else {
RDebugUtils.currentLine=10223674;
 //BA.debugLineNum = 10223674;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .",anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e303) {
			processBA.setLastException(e303);RDebugUtils.currentLine=10223677;
 //BA.debugLineNum = 10223677;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات ذخیره سازی\",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ذخیره سازی","خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=10223678;
 //BA.debugLineNum = 10223678;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=10223680;
 //BA.debugLineNum = 10223680;BA.debugLine="End Sub";
return "";
}
public static String  _writeinfo() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("writeinfo"))
	return (String) Debug.delegate(mostCurrent.activityBA, "writeinfo", null);
String _line = "";
String _updatequery = "";
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub writeInfo";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="If(Main.userInfo.IsInitialized =False) Then";
if ((mostCurrent._main._userinfo.IsInitialized()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="Main.userInfo.Initialize";
mostCurrent._main._userinfo.Initialize();
 };
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="Dim line As String";
_line = "";
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="Try";
try {RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="line = Main.phoneId.GetLine1Number";
_line = mostCurrent._main._phoneid.GetLine1Number();
 } 
       catch (Exception e615) {
			processBA.setLastException(e615);RDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="line = \"need root\"";
_line = "need root";
 };
RDebugUtils.currentLine=11075598;
 //BA.debugLineNum = 11075598;BA.debugLine="Main.userInfo.Put(\"sdk\",Main.phone.SdkVersion)";
mostCurrent._main._userinfo.Put((Object)("sdk"),(Object)(mostCurrent._main._phone.getSdkVersion()));
RDebugUtils.currentLine=11075599;
 //BA.debugLineNum = 11075599;BA.debugLine="Main.userInfo.Put(\"model\",Main.phone.Manufacturer";
mostCurrent._main._userinfo.Put((Object)("model"),(Object)(mostCurrent._main._phone.getManufacturer()+","+mostCurrent._main._phone.getProduct()));
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="Main.userInfo.Put(\"line_number\",line)";
mostCurrent._main._userinfo.Put((Object)("line_number"),(Object)(_line));
RDebugUtils.currentLine=11075601;
 //BA.debugLineNum = 11075601;BA.debugLine="Main.userInfo.Put(\"phoneid\",Main.phoneId.GetDevic";
mostCurrent._main._userinfo.Put((Object)("phoneid"),(Object)(mostCurrent._main._phoneid.GetDeviceId()));
RDebugUtils.currentLine=11075605;
 //BA.debugLineNum = 11075605;BA.debugLine="Main.userInfo.Put(\"to_day_insert_advance\",Main.vi";
mostCurrent._main._userinfo.Put((Object)("to_day_insert_advance"),(Object)(mostCurrent._main._vipinsertcount));
RDebugUtils.currentLine=11075606;
 //BA.debugLineNum = 11075606;BA.debugLine="Main.userInfo.Put(\"to_day_insert\",Main.todayInser";
mostCurrent._main._userinfo.Put((Object)("to_day_insert"),(Object)(mostCurrent._main._todayinsertcount));
RDebugUtils.currentLine=11075608;
 //BA.debugLineNum = 11075608;BA.debugLine="Dim updateQuery As String  = \"update  info set \"";
_updatequery = "update  info set "+"name  ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("name")))+"',"+"phone	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("phone")))+"',"+"user_id	 ="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+","+"pass	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+"',"+"user_name	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+"',"+"sdk	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("sdk")))+"',"+"model	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("model")))+"',"+"line_number	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number")))+"',"+"phoneid	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("phoneid")))+"',"+"is_advance	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("is_advance")))+"',"+"is_premium	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("is_premium")))+"',"+"advance_count	 ="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("advance_count")))+","+"advance_expier_date	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("advance_expier_date")))+"',"+"to_day_date	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("to_day_date")))+"',"+"to_day_insert	 ="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("to_day_insert")))+","+"to_day_insert_advance	 ="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("to_day_insert_advance")));
RDebugUtils.currentLine=11075626;
 //BA.debugLineNum = 11075626;BA.debugLine="DBUtils.ExecuteMemoryTable(Main.SQL1,  updateQuer";
mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,mostCurrent._main._sql1,_updatequery,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=11075628;
 //BA.debugLineNum = 11075628;BA.debugLine="End Sub";
return "";
}
public static String  _menuabout_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("menuabout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuabout_click", null);
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub MenuAbout_Click";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="StartActivity(\"AboutAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("AboutAct"));
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="End Sub";
return "";
}
public static String  _menucontact_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("menucontact_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menucontact_click", null);
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub MenuContact_Click";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="StartActivity(\"contactAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("contactAct"));
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="End Sub";
return "";
}
public static String  _menuexit_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("menuexit_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuexit_click", null);
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub MenuExit_Click";
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="End Sub";
return "";
}
public static String  _menuhelp_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("menuhelp_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuhelp_click", null);
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub MenuHelp_Click";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="StartActivity(\"helpAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("helpAct"));
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="End Sub";
return "";
}
public static String  _menuorder_click() throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("menuorder_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuorder_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub MenuOrder_Click";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
anywheresoftware.b4a.keywords.Common.Msgbox("نام کاربری شما :"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+anywheresoftware.b4a.keywords.Common.CRLF+" رمز عبور اولیه شما "+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+" می باشد","رمز عبور",mostCurrent.activityBA);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/index/1")));
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="End Sub";
return "";
}
public static String  _spinnercat_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("spinnercat_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinnercat_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub SpinnerCat_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="cat = Value";
_cat = BA.ObjectToString(_value);
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Select Value";
switch (BA.switchObjectToInt(_value,(Object)("دسته بندی نشده"),(Object)("رسمی"),(Object)("علمی"),(Object)("آموزش-تحصیلی"),(Object)("طنز و سرگرمی"),(Object)("اجتماعی-خبری"),(Object)("پزشکی-سلامت"),(Object)("دوستان شخصی"),(Object)("تجاری"),(Object)("ادبی-هنری"),(Object)("عشق-دلنوشته"),(Object)("اعتقادی"),(Object)("شرکت ها-دفتر ها"),(Object)("مشاغل و صنفی"),(Object)("ورزشی"),(Object)("مد و زیبایی"))) {
case 0: {
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="selectedCat =1";
_selectedcat = (int) (1);
 break; }
case 1: {
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="selectedCat =2";
_selectedcat = (int) (2);
 break; }
case 2: {
RDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="selectedCat =3";
_selectedcat = (int) (3);
 break; }
case 3: {
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="selectedCat =4";
_selectedcat = (int) (4);
 break; }
case 4: {
RDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="selectedCat =5";
_selectedcat = (int) (5);
 break; }
case 5: {
RDebugUtils.currentLine=10551311;
 //BA.debugLineNum = 10551311;BA.debugLine="selectedCat =6";
_selectedcat = (int) (6);
 break; }
case 6: {
RDebugUtils.currentLine=10551313;
 //BA.debugLineNum = 10551313;BA.debugLine="selectedCat =7";
_selectedcat = (int) (7);
 break; }
case 7: {
RDebugUtils.currentLine=10551315;
 //BA.debugLineNum = 10551315;BA.debugLine="selectedCat =8";
_selectedcat = (int) (8);
 break; }
case 8: {
RDebugUtils.currentLine=10551317;
 //BA.debugLineNum = 10551317;BA.debugLine="selectedCat =9";
_selectedcat = (int) (9);
 break; }
case 9: {
RDebugUtils.currentLine=10551319;
 //BA.debugLineNum = 10551319;BA.debugLine="selectedCat =10";
_selectedcat = (int) (10);
 break; }
case 10: {
RDebugUtils.currentLine=10551321;
 //BA.debugLineNum = 10551321;BA.debugLine="selectedCat =11";
_selectedcat = (int) (11);
 break; }
case 11: {
RDebugUtils.currentLine=10551323;
 //BA.debugLineNum = 10551323;BA.debugLine="selectedCat =12";
_selectedcat = (int) (12);
 break; }
case 12: {
RDebugUtils.currentLine=10551325;
 //BA.debugLineNum = 10551325;BA.debugLine="selectedCat =13";
_selectedcat = (int) (13);
 break; }
case 13: {
RDebugUtils.currentLine=10551327;
 //BA.debugLineNum = 10551327;BA.debugLine="selectedCat =14";
_selectedcat = (int) (14);
 break; }
case 14: {
RDebugUtils.currentLine=10551329;
 //BA.debugLineNum = 10551329;BA.debugLine="selectedCat =15";
_selectedcat = (int) (15);
 break; }
case 15: {
RDebugUtils.currentLine=10551331;
 //BA.debugLineNum = 10551331;BA.debugLine="selectedCat =16";
_selectedcat = (int) (16);
 break; }
}
;
RDebugUtils.currentLine=10551333;
 //BA.debugLineNum = 10551333;BA.debugLine="End Sub";
return "";
}
public static String  _spinnerostan_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("spinnerostan_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinnerostan_itemclick", new Object[] {_position,_value});
String _v = "";
String _txt = "";
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
Object _row = null;
String[] _column = null;
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub SpinnerOstan_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="SpinnerShahr.Clear()";
mostCurrent._spinnershahr.Clear();
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="selectedOstan =0";
_selectedostan = (int) (0);
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="Dim v As String";
_v = "";
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="v= Value";
_v = BA.ObjectToString(_value);
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="Ostan   = v";
_ostan = _v;
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="Select v";
switch (BA.switchObjectToInt(_v,"آذربايجان شرقي","آذربايجان غربي","اردبيل","اصفهان","ايلام","بوشهر","تهران","چهارمحال وبختياري","خراسان جنوبي","خراسان رضوي","خراسان شمالي","خوزستان","زنجان","سمنان","سيستان و بلوچستان","فارس","قزوين","قم","كردستان","كرمان","كرمانشاه","كهگيلويه وبوير احمد","گلستان","گيلان","لرستان","مازندران","مركزي","هرمزگان","همدان","يزد")) {
case 0: {
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="selectedOstan =1";
_selectedostan = (int) (1);
 break; }
case 1: {
RDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="selectedOstan =2";
_selectedostan = (int) (2);
 break; }
case 2: {
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="selectedOstan =3";
_selectedostan = (int) (3);
 break; }
case 3: {
RDebugUtils.currentLine=10420241;
 //BA.debugLineNum = 10420241;BA.debugLine="selectedOstan =4";
_selectedostan = (int) (4);
 break; }
case 4: {
RDebugUtils.currentLine=10420243;
 //BA.debugLineNum = 10420243;BA.debugLine="selectedOstan =5";
_selectedostan = (int) (5);
 break; }
case 5: {
RDebugUtils.currentLine=10420245;
 //BA.debugLineNum = 10420245;BA.debugLine="selectedOstan =6";
_selectedostan = (int) (6);
 break; }
case 6: {
RDebugUtils.currentLine=10420247;
 //BA.debugLineNum = 10420247;BA.debugLine="selectedOstan =7";
_selectedostan = (int) (7);
 break; }
case 7: {
RDebugUtils.currentLine=10420249;
 //BA.debugLineNum = 10420249;BA.debugLine="selectedOstan =8";
_selectedostan = (int) (8);
 break; }
case 8: {
RDebugUtils.currentLine=10420251;
 //BA.debugLineNum = 10420251;BA.debugLine="selectedOstan =9";
_selectedostan = (int) (9);
 break; }
case 9: {
RDebugUtils.currentLine=10420253;
 //BA.debugLineNum = 10420253;BA.debugLine="selectedOstan =10";
_selectedostan = (int) (10);
 break; }
case 10: {
RDebugUtils.currentLine=10420255;
 //BA.debugLineNum = 10420255;BA.debugLine="selectedOstan =11";
_selectedostan = (int) (11);
 break; }
case 11: {
RDebugUtils.currentLine=10420257;
 //BA.debugLineNum = 10420257;BA.debugLine="selectedOstan =12";
_selectedostan = (int) (12);
 break; }
case 12: {
RDebugUtils.currentLine=10420259;
 //BA.debugLineNum = 10420259;BA.debugLine="selectedOstan =13";
_selectedostan = (int) (13);
 break; }
case 13: {
RDebugUtils.currentLine=10420261;
 //BA.debugLineNum = 10420261;BA.debugLine="selectedOstan =14";
_selectedostan = (int) (14);
 break; }
case 14: {
RDebugUtils.currentLine=10420263;
 //BA.debugLineNum = 10420263;BA.debugLine="selectedOstan =15";
_selectedostan = (int) (15);
 break; }
case 15: {
RDebugUtils.currentLine=10420265;
 //BA.debugLineNum = 10420265;BA.debugLine="selectedOstan =17";
_selectedostan = (int) (17);
 break; }
case 16: {
RDebugUtils.currentLine=10420267;
 //BA.debugLineNum = 10420267;BA.debugLine="selectedOstan =18";
_selectedostan = (int) (18);
 break; }
case 17: {
RDebugUtils.currentLine=10420269;
 //BA.debugLineNum = 10420269;BA.debugLine="selectedOstan =19";
_selectedostan = (int) (19);
 break; }
case 18: {
RDebugUtils.currentLine=10420271;
 //BA.debugLineNum = 10420271;BA.debugLine="selectedOstan =20";
_selectedostan = (int) (20);
 break; }
case 19: {
RDebugUtils.currentLine=10420273;
 //BA.debugLineNum = 10420273;BA.debugLine="selectedOstan =21";
_selectedostan = (int) (21);
 break; }
case 20: {
RDebugUtils.currentLine=10420275;
 //BA.debugLineNum = 10420275;BA.debugLine="selectedOstan =22";
_selectedostan = (int) (22);
 break; }
case 21: {
RDebugUtils.currentLine=10420277;
 //BA.debugLineNum = 10420277;BA.debugLine="selectedOstan =23";
_selectedostan = (int) (23);
 break; }
case 22: {
RDebugUtils.currentLine=10420279;
 //BA.debugLineNum = 10420279;BA.debugLine="selectedOstan =24";
_selectedostan = (int) (24);
 break; }
case 23: {
RDebugUtils.currentLine=10420281;
 //BA.debugLineNum = 10420281;BA.debugLine="selectedOstan =25";
_selectedostan = (int) (25);
 break; }
case 24: {
RDebugUtils.currentLine=10420283;
 //BA.debugLineNum = 10420283;BA.debugLine="selectedOstan =26";
_selectedostan = (int) (26);
 break; }
case 25: {
RDebugUtils.currentLine=10420285;
 //BA.debugLineNum = 10420285;BA.debugLine="selectedOstan =27";
_selectedostan = (int) (27);
 break; }
case 26: {
RDebugUtils.currentLine=10420287;
 //BA.debugLineNum = 10420287;BA.debugLine="selectedOstan =28";
_selectedostan = (int) (28);
 break; }
case 27: {
RDebugUtils.currentLine=10420289;
 //BA.debugLineNum = 10420289;BA.debugLine="selectedOstan =29";
_selectedostan = (int) (29);
 break; }
case 28: {
RDebugUtils.currentLine=10420291;
 //BA.debugLineNum = 10420291;BA.debugLine="selectedOstan =30";
_selectedostan = (int) (30);
 break; }
case 29: {
RDebugUtils.currentLine=10420293;
 //BA.debugLineNum = 10420293;BA.debugLine="selectedOstan =31";
_selectedostan = (int) (31);
 break; }
}
;
RDebugUtils.currentLine=10420297;
 //BA.debugLineNum = 10420297;BA.debugLine="Dim txt As String";
_txt = "";
RDebugUtils.currentLine=10420299;
 //BA.debugLineNum = 10420299;BA.debugLine="txt = \"SELECT id, name  FROM \" & Main.DBTableName";
_txt = "SELECT id, name  FROM "+mostCurrent._main._dbtablename+" where ostan_id = "+BA.NumberToString(_selectedostan);
RDebugUtils.currentLine=10420301;
 //BA.debugLineNum = 10420301;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420302;
 //BA.debugLineNum = 10420302;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt";
_result = mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,mostCurrent._main._sql1,_txt,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=10420304;
 //BA.debugLineNum = 10420304;BA.debugLine="For i =  0 To result.Size-1";
{
final int step72 = 1;
final int limit72 = (int) (_result.getSize()-1);
for (_i = (int) (0) ; (step72 > 0 && _i <= limit72) || (step72 < 0 && _i >= limit72); _i = ((int)(0 + _i + step72)) ) {
RDebugUtils.currentLine=10420305;
 //BA.debugLineNum = 10420305;BA.debugLine="Dim row As Object";
_row = new Object();
RDebugUtils.currentLine=10420306;
 //BA.debugLineNum = 10420306;BA.debugLine="Dim column() As String";
_column = new String[(int) (0)];
java.util.Arrays.fill(_column,"");
RDebugUtils.currentLine=10420307;
 //BA.debugLineNum = 10420307;BA.debugLine="row = result.Get(i)";
_row = _result.Get(_i);
RDebugUtils.currentLine=10420308;
 //BA.debugLineNum = 10420308;BA.debugLine="column = row";
_column = (String[])(_row);
RDebugUtils.currentLine=10420309;
 //BA.debugLineNum = 10420309;BA.debugLine="SpinnerShahr.Add(column(1))";
mostCurrent._spinnershahr.Add(_column[(int) (1)]);
 }
};
RDebugUtils.currentLine=10420311;
 //BA.debugLineNum = 10420311;BA.debugLine="End Sub";
return "";
}
public static String  _spinnershahr_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="insertact";
if (Debug.shouldDelegate("spinnershahr_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinnershahr_itemclick", new Object[] {_position,_value});
String _txt = "";
anywheresoftware.b4a.objects.collections.List _result = null;
Object _row = null;
String[] _column = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub SpinnerShahr_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim txt As String";
_txt = "";
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="txt = \"SELECT   id  FROM \" & Main.DBTableName & \"";
_txt = "SELECT   id  FROM "+mostCurrent._main._dbtablename+" where name = '"+BA.ObjectToString(_value)+"'";
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt";
_result = mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,mostCurrent._main._sql1,_txt,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="Shahr = Value";
_shahr = BA.ObjectToString(_value);
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="Dim row As Object";
_row = new Object();
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="Dim column() As String";
_column = new String[(int) (0)];
java.util.Arrays.fill(_column,"");
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="row = result.Get(0)";
_row = _result.Get((int) (0));
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="column = row";
_column = (String[])(_row);
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="selectedShahr = column(0)";
_selectedshahr = (int)(Double.parseDouble(_column[(int) (0)]));
RDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="End Sub";
return "";
}
}