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

public class contactact extends Activity implements B4AActivity{
	public static contactact mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Telegram.Search", "Telegram.Search.contactact");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (contactact).");
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
		activityBA = new BA(this, layout, processBA, "Telegram.Search", "Telegram.Search.contactact");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Telegram.Search.contactact", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (contactact) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (contactact) Resume **");
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
		return contactact.class;
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
        BA.LogInfo("** Activity (contactact) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (contactact) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttag = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdescription = null;
public de.amberhome.navdrawer.NavigationDrawer _navi = null;
public anywheresoftware.b4a.objects.PanelWrapper _pcantent = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public Telegram.Search.main _main = null;
public Telegram.Search.httputils2service _httputils2service = null;
public Telegram.Search.aboutact _aboutact = null;
public Telegram.Search.searchresultact _searchresultact = null;
public Telegram.Search.dbutils _dbutils = null;
public Telegram.Search.helpact _helpact = null;
public Telegram.Search.insertact _insertact = null;
public Telegram.Search.groupviewact _groupviewact = null;
public Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public Telegram.Search.searchact _searchact = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
mostCurrent._navi.Initialize2(mostCurrent.activityBA,"navi",(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._activity.getObject())),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
mostCurrent._navi.getNavigationPanel().LoadLayout("menu",mostCurrent.activityBA);
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="pCantent.Initialize(\"\")";
mostCurrent._pcantent.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
mostCurrent._navi.getContentPanel().AddView((android.view.View)(mostCurrent._pcantent.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="pCantent.SendToBack";
mostCurrent._pcantent.SendToBack();
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="pCantent.LoadLayout(\"contact\")";
mostCurrent._pcantent.LoadLayout("contact",mostCurrent.activityBA);
RDebugUtils.currentLine=8912911;
 //BA.debugLineNum = 8912911;BA.debugLine="Panel2.RemoveView";
mostCurrent._panel2.RemoveView();
RDebugUtils.currentLine=8912912;
 //BA.debugLineNum = 8912912;BA.debugLine="ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width";
mostCurrent._scrollview1.getPanel().AddView((android.view.View)(mostCurrent._panel2.getObject()),(int) (0),(int) (0),mostCurrent._panel2.getWidth(),mostCurrent._panel2.getHeight());
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="ScrollView1.Panel.Height = 600dip";
mostCurrent._scrollview1.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)));
RDebugUtils.currentLine=8912915;
 //BA.debugLineNum = 8912915;BA.debugLine="Label6.TextColor= Colors.Black";
mostCurrent._label6.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8912916;
 //BA.debugLineNum = 8912916;BA.debugLine="Label6.Typeface = Main.font";
mostCurrent._label6.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=8912917;
 //BA.debugLineNum = 8912917;BA.debugLine="Label6.Gravity= Gravity.RIGHT";
mostCurrent._label6.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=8912918;
 //BA.debugLineNum = 8912918;BA.debugLine="Label1.TextColor= Colors.Black";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8912919;
 //BA.debugLineNum = 8912919;BA.debugLine="Label1.Typeface = Main.font";
mostCurrent._label1.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=8912920;
 //BA.debugLineNum = 8912920;BA.debugLine="Label1.Gravity= Gravity.RIGHT";
mostCurrent._label1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=8912921;
 //BA.debugLineNum = 8912921;BA.debugLine="txtName.TextColor= Colors.Black";
mostCurrent._txtname.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8912922;
 //BA.debugLineNum = 8912922;BA.debugLine="txtName.Typeface = Main.font";
mostCurrent._txtname.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=8912923;
 //BA.debugLineNum = 8912923;BA.debugLine="txtName.Gravity= Gravity.RIGHT";
mostCurrent._txtname.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=8912924;
 //BA.debugLineNum = 8912924;BA.debugLine="txtName.Color=Colors.RGB(179,229,252)";
mostCurrent._txtname.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=8912926;
 //BA.debugLineNum = 8912926;BA.debugLine="Label2.TextColor= Colors.Black";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8912927;
 //BA.debugLineNum = 8912927;BA.debugLine="Label2.Typeface = Main.font";
mostCurrent._label2.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=8912928;
 //BA.debugLineNum = 8912928;BA.debugLine="Label2.Gravity= Gravity.RIGHT";
mostCurrent._label2.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=8912929;
 //BA.debugLineNum = 8912929;BA.debugLine="txtTag.TextColor= Colors.Black";
mostCurrent._txttag.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8912930;
 //BA.debugLineNum = 8912930;BA.debugLine="txtTag.Typeface = Main.font";
mostCurrent._txttag.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=8912931;
 //BA.debugLineNum = 8912931;BA.debugLine="txtTag.Gravity= Gravity.RIGHT";
mostCurrent._txttag.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=8912932;
 //BA.debugLineNum = 8912932;BA.debugLine="txtTag.Color=Colors.RGB(179,229,252)";
mostCurrent._txttag.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=8912934;
 //BA.debugLineNum = 8912934;BA.debugLine="Label3.TextColor= Colors.Black";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8912935;
 //BA.debugLineNum = 8912935;BA.debugLine="Label3.Typeface = Main.font";
mostCurrent._label3.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=8912936;
 //BA.debugLineNum = 8912936;BA.debugLine="Label3.Gravity= Gravity.RIGHT";
mostCurrent._label3.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=8912937;
 //BA.debugLineNum = 8912937;BA.debugLine="txtDescription.TextColor= Colors.Black";
mostCurrent._txtdescription.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8912938;
 //BA.debugLineNum = 8912938;BA.debugLine="txtDescription.Typeface = Main.font";
mostCurrent._txtdescription.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=8912939;
 //BA.debugLineNum = 8912939;BA.debugLine="txtDescription.Gravity= Gravity.RIGHT";
mostCurrent._txtdescription.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=8912940;
 //BA.debugLineNum = 8912940;BA.debugLine="txtDescription.Color=Colors.RGB(179,229,252)";
mostCurrent._txtdescription.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=8912943;
 //BA.debugLineNum = 8912943;BA.debugLine="ImageView1.Bitmap =LoadBitmap(File.DirAssets,\"sti";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"sticker_back.jpg").getObject()));
RDebugUtils.currentLine=8912944;
 //BA.debugLineNum = 8912944;BA.debugLine="ImageView2.Bitmap =Main.groupIcon";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(mostCurrent._main._groupicon.getObject()));
RDebugUtils.currentLine=8912946;
 //BA.debugLineNum = 8912946;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("activity_pause"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_pause", new Object[] {_userclosed});
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("btnmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null);
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
mostCurrent._navi.OpenDrawer2(mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return "";
}
public static String  _btnpanel_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("btnpanel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnpanel_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub btnPanel_Click";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
anywheresoftware.b4a.keywords.Common.Msgbox("نام کاربری شما :"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+anywheresoftware.b4a.keywords.Common.CRLF+" رمز عبور اولیه شما "+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+" می باشد","رمز عبور",mostCurrent.activityBA);
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/")));
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="End Sub";
return "";
}
public static String  _btnreturn_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("btnreturn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnreturn_click", null);
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub btnReturn_Click";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return "";
}
public static String  _buttonback_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("buttonback_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonback_click", null);
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub ButtonBack_Click";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsend_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("buttonsend_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonsend_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub ButtonSend_Click";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="If(txtDescription.Text.Length < 5 )Then";
if ((mostCurrent._txtdescription.getText().length()<5)) { 
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Msgbox(\"لطفآ متن را وارد نمائید\",\"نقص اطلاعات\")";
anywheresoftware.b4a.keywords.Common.Msgbox("لطفآ متن را وارد نمائید","نقص اطلاعات",mostCurrent.activityBA);
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Try";
try {RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="ProgressDialogShow(\"درحال ذخیره سازی\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال ذخیره سازی");
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="job.Initialize(\"saveing\", Me)";
_job._initialize(null,processBA,"saveing",contactact.getObject());
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/insertComment","pass=1266"+"&name="+mostCurrent._txtname.getText()+"&mobile="+mostCurrent._txtdescription.getText()+"&text="+mostCurrent._txttag.getText()+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e72) {
			processBA.setLastException(e72);RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در ارسال اطلاعات   ","خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=9109524;
 //BA.debugLineNum = 9109524;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=9109526;
 //BA.debugLineNum = 9109526;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(Telegram.Search.httpjob _job) throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Try";
try {RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="res = Job.GetString";
_res = _job._getstring(null);
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="If Job.JobName= \"saveing\" Then";
if ((_job._jobname).equals("saveing")) { 
RDebugUtils.currentLine=9175052;
 //BA.debugLineNum = 9175052;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . نظر ارسال شد";
anywheresoftware.b4a.keywords.Common.Msgbox("با تشکر از حسن توجه شما . نظر ارسال شد .","درخواست ",mostCurrent.activityBA);
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 }else {
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .",anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e92) {
			processBA.setLastException(e92);RDebugUtils.currentLine=9175060;
 //BA.debugLineNum = 9175060;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات ذخیره سازی\",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ذخیره سازی","خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=9175061;
 //BA.debugLineNum = 9175061;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=9175063;
 //BA.debugLineNum = 9175063;BA.debugLine="End Sub";
return "";
}
public static String  _menuabout_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("menuabout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuabout_click", null);
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub MenuAbout_Click";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="StartActivity(\"AboutAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("AboutAct"));
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="End Sub";
return "";
}
public static String  _menucontact_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("menucontact_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menucontact_click", null);
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub MenuContact_Click";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return "";
}
public static String  _menuexit_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("menuexit_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuexit_click", null);
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub MenuExit_Click";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="End Sub";
return "";
}
public static String  _menuhelp_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("menuhelp_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuhelp_click", null);
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub MenuHelp_Click";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="StartActivity(\"helpAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("helpAct"));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="End Sub";
return "";
}
public static String  _menuorder_click() throws Exception{
RDebugUtils.currentModule="contactact";
if (Debug.shouldDelegate("menuorder_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuorder_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub MenuOrder_Click";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/index/1")));
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="End Sub";
return "";
}
}