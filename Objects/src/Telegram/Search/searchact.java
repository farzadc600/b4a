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

public class searchact extends Activity implements B4AActivity{
	public static searchact mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Telegram.Search", "Telegram.Search.searchact");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (searchact).");
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
		activityBA = new BA(this, layout, processBA, "Telegram.Search", "Telegram.Search.searchact");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Telegram.Search.searchact", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (searchact) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (searchact) Resume **");
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
		return searchact.class;
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
        BA.LogInfo("** Activity (searchact) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (searchact) Resume **");
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
public static int _selectedostan = 0;
public static int _selectedshahr = 0;
public static int _selectedcat = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _txtname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdescription = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttag = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelinputs = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnerostan = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnershahr = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnercat = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaddress = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreturn = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelmessage = null;
public de.amberhome.navdrawer.NavigationDrawer _navi = null;
public anywheresoftware.b4a.objects.PanelWrapper _pcantent = null;
public Telegram.Search.main _main = null;
public Telegram.Search.httputils2service _httputils2service = null;
public Telegram.Search.aboutact _aboutact = null;
public Telegram.Search.searchresultact _searchresultact = null;
public Telegram.Search.dbutils _dbutils = null;
public Telegram.Search.helpact _helpact = null;
public Telegram.Search.contactact _contactact = null;
public Telegram.Search.insertact _insertact = null;
public Telegram.Search.groupviewact _groupviewact = null;
public Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
mostCurrent._navi.Initialize2(mostCurrent.activityBA,"navi",(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._activity.getObject())),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
mostCurrent._navi.getNavigationPanel().LoadLayout("menu",mostCurrent.activityBA);
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="pCantent.Initialize(\"\")";
mostCurrent._pcantent.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
mostCurrent._navi.getContentPanel().AddView((android.view.View)(mostCurrent._pcantent.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="pCantent.SendToBack";
mostCurrent._pcantent.SendToBack();
RDebugUtils.currentLine=13565963;
 //BA.debugLineNum = 13565963;BA.debugLine="pCantent.LoadLayout(\"searchView\")";
mostCurrent._pcantent.LoadLayout("searchView",mostCurrent.activityBA);
RDebugUtils.currentLine=13565966;
 //BA.debugLineNum = 13565966;BA.debugLine="Label1.TextSize= 15";
mostCurrent._label1.setTextSize((float) (15));
RDebugUtils.currentLine=13565967;
 //BA.debugLineNum = 13565967;BA.debugLine="Label1.Gravity= Gravity.RIGHT";
mostCurrent._label1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13565968;
 //BA.debugLineNum = 13565968;BA.debugLine="Label1.Typeface=Main.font";
mostCurrent._label1.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13565970;
 //BA.debugLineNum = 13565970;BA.debugLine="Label2.TextSize= 15";
mostCurrent._label2.setTextSize((float) (15));
RDebugUtils.currentLine=13565971;
 //BA.debugLineNum = 13565971;BA.debugLine="Label2.Gravity= Gravity.RIGHT";
mostCurrent._label2.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13565972;
 //BA.debugLineNum = 13565972;BA.debugLine="Label2.Typeface=Main.font";
mostCurrent._label2.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13565974;
 //BA.debugLineNum = 13565974;BA.debugLine="Label3.TextSize= 15";
mostCurrent._label3.setTextSize((float) (15));
RDebugUtils.currentLine=13565975;
 //BA.debugLineNum = 13565975;BA.debugLine="Label3.Gravity= Gravity.RIGHT";
mostCurrent._label3.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13565976;
 //BA.debugLineNum = 13565976;BA.debugLine="Label3.Typeface=Main.font";
mostCurrent._label3.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13565978;
 //BA.debugLineNum = 13565978;BA.debugLine="Label5.TextSize= 15";
mostCurrent._label5.setTextSize((float) (15));
RDebugUtils.currentLine=13565979;
 //BA.debugLineNum = 13565979;BA.debugLine="Label5.Gravity= Gravity.RIGHT";
mostCurrent._label5.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13565980;
 //BA.debugLineNum = 13565980;BA.debugLine="Label5.Typeface=Main.font";
mostCurrent._label5.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13565981;
 //BA.debugLineNum = 13565981;BA.debugLine="Label5.Text  = \"جستجو در \"  & Main.selectedTypeTi";
mostCurrent._label5.setText((Object)("جستجو در "+mostCurrent._main._selectedtypetitle+" ها "));
RDebugUtils.currentLine=13565982;
 //BA.debugLineNum = 13565982;BA.debugLine="Activity.Title = \"جستجو در \"  & Main.selectedType";
mostCurrent._activity.setTitle((Object)("جستجو در "+mostCurrent._main._selectedtypetitle+" ها "));
RDebugUtils.currentLine=13565985;
 //BA.debugLineNum = 13565985;BA.debugLine="txtName.TextSize= 15";
mostCurrent._txtname.setTextSize((float) (15));
RDebugUtils.currentLine=13565986;
 //BA.debugLineNum = 13565986;BA.debugLine="txtName.Gravity= Gravity.RIGHT";
mostCurrent._txtname.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13565987;
 //BA.debugLineNum = 13565987;BA.debugLine="txtName.TextColor= Colors.Black";
mostCurrent._txtname.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=13565988;
 //BA.debugLineNum = 13565988;BA.debugLine="txtName.Color= Colors.White";
mostCurrent._txtname.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=13565989;
 //BA.debugLineNum = 13565989;BA.debugLine="txtName.Typeface=Main.font";
mostCurrent._txtname.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13565990;
 //BA.debugLineNum = 13565990;BA.debugLine="txtName.Color=Colors.RGB(179,229,252)";
mostCurrent._txtname.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=13565992;
 //BA.debugLineNum = 13565992;BA.debugLine="txtDescription.TextSize= 15";
mostCurrent._txtdescription.setTextSize((float) (15));
RDebugUtils.currentLine=13565993;
 //BA.debugLineNum = 13565993;BA.debugLine="txtDescription.Gravity= Gravity.RIGHT";
mostCurrent._txtdescription.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13565994;
 //BA.debugLineNum = 13565994;BA.debugLine="txtDescription.TextColor= Colors.Black";
mostCurrent._txtdescription.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=13565995;
 //BA.debugLineNum = 13565995;BA.debugLine="txtDescription.Color = Colors.White";
mostCurrent._txtdescription.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=13565996;
 //BA.debugLineNum = 13565996;BA.debugLine="txtDescription.Typeface=Main.font";
mostCurrent._txtdescription.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13565997;
 //BA.debugLineNum = 13565997;BA.debugLine="txtDescription.Color=Colors.RGB(179,229,252)";
mostCurrent._txtdescription.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=13566000;
 //BA.debugLineNum = 13566000;BA.debugLine="txtTag.TextSize= 15";
mostCurrent._txttag.setTextSize((float) (15));
RDebugUtils.currentLine=13566001;
 //BA.debugLineNum = 13566001;BA.debugLine="txtTag.Gravity= Gravity.RIGHT";
mostCurrent._txttag.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13566002;
 //BA.debugLineNum = 13566002;BA.debugLine="txtTag.TextColor= Colors.Black";
mostCurrent._txttag.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=13566003;
 //BA.debugLineNum = 13566003;BA.debugLine="txtTag.Color= Colors.White";
mostCurrent._txttag.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=13566004;
 //BA.debugLineNum = 13566004;BA.debugLine="txtTag.Typeface=Main.font";
mostCurrent._txttag.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13566005;
 //BA.debugLineNum = 13566005;BA.debugLine="txtTag.Color=Colors.RGB(179,229,252)";
mostCurrent._txttag.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=13566008;
 //BA.debugLineNum = 13566008;BA.debugLine="If(Main.selectedType <>  \"sticker\" And Main.selec";
if (((mostCurrent._main._selectedtype).equals("sticker") == false && (mostCurrent._main._selectedtype).equals("robot") == false)) { 
RDebugUtils.currentLine=13566009;
 //BA.debugLineNum = 13566009;BA.debugLine="PanelInputs.RemoveView()";
mostCurrent._panelinputs.RemoveView();
RDebugUtils.currentLine=13566010;
 //BA.debugLineNum = 13566010;BA.debugLine="ScrollView.Panel.AddView(PanelInputs,0,0,PanelIn";
mostCurrent._scrollview.getPanel().AddView((android.view.View)(mostCurrent._panelinputs.getObject()),(int) (0),(int) (0),mostCurrent._panelinputs.getWidth(),mostCurrent._panelinputs.getHeight());
RDebugUtils.currentLine=13566011;
 //BA.debugLineNum = 13566011;BA.debugLine="ScrollView.Panel.Height =580dip";
mostCurrent._scrollview.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (580)));
RDebugUtils.currentLine=13566012;
 //BA.debugLineNum = 13566012;BA.debugLine="ScrollView.Panel.Color=Colors.White";
mostCurrent._scrollview.getPanel().setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=13566016;
 //BA.debugLineNum = 13566016;BA.debugLine="Label6.Visible = True";
mostCurrent._label6.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13566017;
 //BA.debugLineNum = 13566017;BA.debugLine="Label7.Visible = True";
mostCurrent._label7.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13566018;
 //BA.debugLineNum = 13566018;BA.debugLine="SpinnerOstan.Visible= True";
mostCurrent._spinnerostan.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13566019;
 //BA.debugLineNum = 13566019;BA.debugLine="SpinnerShahr.Visible = True";
mostCurrent._spinnershahr.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=13566021;
 //BA.debugLineNum = 13566021;BA.debugLine="Label6.TextSize= 15";
mostCurrent._label6.setTextSize((float) (15));
RDebugUtils.currentLine=13566022;
 //BA.debugLineNum = 13566022;BA.debugLine="Label6.Gravity= Gravity.RIGHT";
mostCurrent._label6.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13566023;
 //BA.debugLineNum = 13566023;BA.debugLine="Label6.Typeface=Main.font";
mostCurrent._label6.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13566025;
 //BA.debugLineNum = 13566025;BA.debugLine="Label7.TextSize= 15";
mostCurrent._label7.setTextSize((float) (15));
RDebugUtils.currentLine=13566026;
 //BA.debugLineNum = 13566026;BA.debugLine="Label7.Gravity= Gravity.RIGHT";
mostCurrent._label7.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13566027;
 //BA.debugLineNum = 13566027;BA.debugLine="Label7.Typeface=Main.font";
mostCurrent._label7.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13566030;
 //BA.debugLineNum = 13566030;BA.debugLine="LabelMessage.TextSize= 15";
mostCurrent._labelmessage.setTextSize((float) (15));
RDebugUtils.currentLine=13566031;
 //BA.debugLineNum = 13566031;BA.debugLine="LabelMessage.Gravity= Gravity.RIGHT";
mostCurrent._labelmessage.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13566032;
 //BA.debugLineNum = 13566032;BA.debugLine="LabelMessage.Typeface=Main.font";
mostCurrent._labelmessage.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=13566034;
 //BA.debugLineNum = 13566034;BA.debugLine="SpinnerOstan.Add(\"آذربايجان شرقي\")";
mostCurrent._spinnerostan.Add("آذربايجان شرقي");
RDebugUtils.currentLine=13566035;
 //BA.debugLineNum = 13566035;BA.debugLine="SpinnerOstan.Add(\"آذربايجان غربي\")";
mostCurrent._spinnerostan.Add("آذربايجان غربي");
RDebugUtils.currentLine=13566036;
 //BA.debugLineNum = 13566036;BA.debugLine="SpinnerOstan.Add(\"اردبيل\")";
mostCurrent._spinnerostan.Add("اردبيل");
RDebugUtils.currentLine=13566037;
 //BA.debugLineNum = 13566037;BA.debugLine="SpinnerOstan.Add(\"اصفهان\")";
mostCurrent._spinnerostan.Add("اصفهان");
RDebugUtils.currentLine=13566038;
 //BA.debugLineNum = 13566038;BA.debugLine="SpinnerOstan.Add(\"ايلام\")";
mostCurrent._spinnerostan.Add("ايلام");
RDebugUtils.currentLine=13566039;
 //BA.debugLineNum = 13566039;BA.debugLine="SpinnerOstan.Add(\"بوشهر\")";
mostCurrent._spinnerostan.Add("بوشهر");
RDebugUtils.currentLine=13566040;
 //BA.debugLineNum = 13566040;BA.debugLine="SpinnerOstan.Add(\"تهران\")";
mostCurrent._spinnerostan.Add("تهران");
RDebugUtils.currentLine=13566041;
 //BA.debugLineNum = 13566041;BA.debugLine="SpinnerOstan.Add(\"چهارمحال وبختياري\")";
mostCurrent._spinnerostan.Add("چهارمحال وبختياري");
RDebugUtils.currentLine=13566042;
 //BA.debugLineNum = 13566042;BA.debugLine="SpinnerOstan.Add(\"خراسان جنوبي\")";
mostCurrent._spinnerostan.Add("خراسان جنوبي");
RDebugUtils.currentLine=13566043;
 //BA.debugLineNum = 13566043;BA.debugLine="SpinnerOstan.Add(\"خراسان رضوي\")";
mostCurrent._spinnerostan.Add("خراسان رضوي");
RDebugUtils.currentLine=13566044;
 //BA.debugLineNum = 13566044;BA.debugLine="SpinnerOstan.Add(\"خراسان شمالي\")";
mostCurrent._spinnerostan.Add("خراسان شمالي");
RDebugUtils.currentLine=13566045;
 //BA.debugLineNum = 13566045;BA.debugLine="SpinnerOstan.Add(\"خوزستان\")";
mostCurrent._spinnerostan.Add("خوزستان");
RDebugUtils.currentLine=13566046;
 //BA.debugLineNum = 13566046;BA.debugLine="SpinnerOstan.Add(\"زنجان\")";
mostCurrent._spinnerostan.Add("زنجان");
RDebugUtils.currentLine=13566047;
 //BA.debugLineNum = 13566047;BA.debugLine="SpinnerOstan.Add(\"سمنان\")";
mostCurrent._spinnerostan.Add("سمنان");
RDebugUtils.currentLine=13566048;
 //BA.debugLineNum = 13566048;BA.debugLine="SpinnerOstan.Add(\"سيستان و بلوچستان\")";
mostCurrent._spinnerostan.Add("سيستان و بلوچستان");
RDebugUtils.currentLine=13566049;
 //BA.debugLineNum = 13566049;BA.debugLine="SpinnerOstan.Add(\"فارس\")";
mostCurrent._spinnerostan.Add("فارس");
RDebugUtils.currentLine=13566050;
 //BA.debugLineNum = 13566050;BA.debugLine="SpinnerOstan.Add(\"قزوين\")";
mostCurrent._spinnerostan.Add("قزوين");
RDebugUtils.currentLine=13566051;
 //BA.debugLineNum = 13566051;BA.debugLine="SpinnerOstan.Add(\"قم\")";
mostCurrent._spinnerostan.Add("قم");
RDebugUtils.currentLine=13566052;
 //BA.debugLineNum = 13566052;BA.debugLine="SpinnerOstan.Add(\"كردستان\")";
mostCurrent._spinnerostan.Add("كردستان");
RDebugUtils.currentLine=13566053;
 //BA.debugLineNum = 13566053;BA.debugLine="SpinnerOstan.Add(\"كرمان\")";
mostCurrent._spinnerostan.Add("كرمان");
RDebugUtils.currentLine=13566054;
 //BA.debugLineNum = 13566054;BA.debugLine="SpinnerOstan.Add(\"كرمانشاه\")";
mostCurrent._spinnerostan.Add("كرمانشاه");
RDebugUtils.currentLine=13566055;
 //BA.debugLineNum = 13566055;BA.debugLine="SpinnerOstan.Add(\"كهگيلويه وبوير احمد\")";
mostCurrent._spinnerostan.Add("كهگيلويه وبوير احمد");
RDebugUtils.currentLine=13566056;
 //BA.debugLineNum = 13566056;BA.debugLine="SpinnerOstan.Add(\"گلستان\")";
mostCurrent._spinnerostan.Add("گلستان");
RDebugUtils.currentLine=13566057;
 //BA.debugLineNum = 13566057;BA.debugLine="SpinnerOstan.Add(\"گيلان\")";
mostCurrent._spinnerostan.Add("گيلان");
RDebugUtils.currentLine=13566058;
 //BA.debugLineNum = 13566058;BA.debugLine="SpinnerOstan.Add(\"لرستان\")";
mostCurrent._spinnerostan.Add("لرستان");
RDebugUtils.currentLine=13566059;
 //BA.debugLineNum = 13566059;BA.debugLine="SpinnerOstan.Add(\"مازندران\")";
mostCurrent._spinnerostan.Add("مازندران");
RDebugUtils.currentLine=13566060;
 //BA.debugLineNum = 13566060;BA.debugLine="SpinnerOstan.Add(\"مركزي\")";
mostCurrent._spinnerostan.Add("مركزي");
RDebugUtils.currentLine=13566061;
 //BA.debugLineNum = 13566061;BA.debugLine="SpinnerOstan.Add(\"هرمزگان\")";
mostCurrent._spinnerostan.Add("هرمزگان");
RDebugUtils.currentLine=13566062;
 //BA.debugLineNum = 13566062;BA.debugLine="SpinnerOstan.Add(\"همدان\")";
mostCurrent._spinnerostan.Add("همدان");
RDebugUtils.currentLine=13566063;
 //BA.debugLineNum = 13566063;BA.debugLine="SpinnerOstan.Add(\"يزد\")";
mostCurrent._spinnerostan.Add("يزد");
RDebugUtils.currentLine=13566065;
 //BA.debugLineNum = 13566065;BA.debugLine="SpinnerOstan.DropdownTextColor = Colors.White";
mostCurrent._spinnerostan.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=13566066;
 //BA.debugLineNum = 13566066;BA.debugLine="SpinnerOstan.TextColor = Colors.Black";
mostCurrent._spinnerostan.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=13566068;
 //BA.debugLineNum = 13566068;BA.debugLine="SpinnerCat.Add(\"دسته بندی نشده\")";
mostCurrent._spinnercat.Add("دسته بندی نشده");
RDebugUtils.currentLine=13566069;
 //BA.debugLineNum = 13566069;BA.debugLine="SpinnerCat.Add(\"رسمی\")";
mostCurrent._spinnercat.Add("رسمی");
RDebugUtils.currentLine=13566070;
 //BA.debugLineNum = 13566070;BA.debugLine="SpinnerCat.Add(\"علمی\")";
mostCurrent._spinnercat.Add("علمی");
RDebugUtils.currentLine=13566071;
 //BA.debugLineNum = 13566071;BA.debugLine="SpinnerCat.Add(\"آموزش-تحصیلی\")";
mostCurrent._spinnercat.Add("آموزش-تحصیلی");
RDebugUtils.currentLine=13566072;
 //BA.debugLineNum = 13566072;BA.debugLine="SpinnerCat.Add(\"طنز و سرگرمی\")";
mostCurrent._spinnercat.Add("طنز و سرگرمی");
RDebugUtils.currentLine=13566073;
 //BA.debugLineNum = 13566073;BA.debugLine="SpinnerCat.Add(\"اجتماعی-خبری\")";
mostCurrent._spinnercat.Add("اجتماعی-خبری");
RDebugUtils.currentLine=13566074;
 //BA.debugLineNum = 13566074;BA.debugLine="SpinnerCat.Add(\"پزشکی-سلامت\")";
mostCurrent._spinnercat.Add("پزشکی-سلامت");
RDebugUtils.currentLine=13566075;
 //BA.debugLineNum = 13566075;BA.debugLine="SpinnerCat.Add(\"دوستان شخصی\")";
mostCurrent._spinnercat.Add("دوستان شخصی");
RDebugUtils.currentLine=13566076;
 //BA.debugLineNum = 13566076;BA.debugLine="SpinnerCat.Add(\"تجاری\")";
mostCurrent._spinnercat.Add("تجاری");
RDebugUtils.currentLine=13566077;
 //BA.debugLineNum = 13566077;BA.debugLine="SpinnerCat.Add(\"ادبی-هنری\")";
mostCurrent._spinnercat.Add("ادبی-هنری");
RDebugUtils.currentLine=13566078;
 //BA.debugLineNum = 13566078;BA.debugLine="SpinnerCat.Add(\"عشق-دلنوشته\")";
mostCurrent._spinnercat.Add("عشق-دلنوشته");
RDebugUtils.currentLine=13566079;
 //BA.debugLineNum = 13566079;BA.debugLine="SpinnerCat.Add(\"اعتقادی\")";
mostCurrent._spinnercat.Add("اعتقادی");
RDebugUtils.currentLine=13566080;
 //BA.debugLineNum = 13566080;BA.debugLine="SpinnerCat.Add(\"شرکت ها-دفتر ها\")";
mostCurrent._spinnercat.Add("شرکت ها-دفتر ها");
RDebugUtils.currentLine=13566081;
 //BA.debugLineNum = 13566081;BA.debugLine="SpinnerCat.Add(\"مشاغل و صنفی\")";
mostCurrent._spinnercat.Add("مشاغل و صنفی");
RDebugUtils.currentLine=13566082;
 //BA.debugLineNum = 13566082;BA.debugLine="SpinnerCat.Add(\"ورزشی\")";
mostCurrent._spinnercat.Add("ورزشی");
RDebugUtils.currentLine=13566083;
 //BA.debugLineNum = 13566083;BA.debugLine="SpinnerCat.Add(\"مد و زیبایی\")";
mostCurrent._spinnercat.Add("مد و زیبایی");
RDebugUtils.currentLine=13566085;
 //BA.debugLineNum = 13566085;BA.debugLine="SpinnerCat.DropdownTextColor = Colors.White";
mostCurrent._spinnercat.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=13566086;
 //BA.debugLineNum = 13566086;BA.debugLine="SpinnerCat.TextColor = Colors.Black";
mostCurrent._spinnercat.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=13566088;
 //BA.debugLineNum = 13566088;BA.debugLine="SpinnerShahr.DropdownTextColor = Colors.White";
mostCurrent._spinnershahr.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=13566089;
 //BA.debugLineNum = 13566089;BA.debugLine="SpinnerShahr.TextColor = Colors.Black";
mostCurrent._spinnershahr.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=13566092;
 //BA.debugLineNum = 13566092;BA.debugLine="Label6.Visible =True";
mostCurrent._label6.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=13566098;
 //BA.debugLineNum = 13566098;BA.debugLine="Label6.Visible = False";
mostCurrent._label6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13566099;
 //BA.debugLineNum = 13566099;BA.debugLine="Label7.Visible = False";
mostCurrent._label7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13566100;
 //BA.debugLineNum = 13566100;BA.debugLine="SpinnerOstan.Visible= False";
mostCurrent._spinnerostan.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13566101;
 //BA.debugLineNum = 13566101;BA.debugLine="SpinnerOstan.Visible = False";
mostCurrent._spinnerostan.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=13566103;
 //BA.debugLineNum = 13566103;BA.debugLine="Label6.Visible =False";
mostCurrent._label6.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=13566111;
 //BA.debugLineNum = 13566111;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("activity_pause"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_pause", new Object[] {_userclosed});
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("btnmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null);
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
mostCurrent._navi.OpenDrawer2(mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public static String  _btnpanel_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("btnpanel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnpanel_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub btnPanel_Click";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
anywheresoftware.b4a.keywords.Common.Msgbox("نام کاربری شما :"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+anywheresoftware.b4a.keywords.Common.CRLF+" رمز عبور اولیه شما "+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+" می باشد","رمز عبور",mostCurrent.activityBA);
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/")));
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("button1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button1_click", null);
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="End Sub";
return "";
}
public static String  _buttonreturn_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("buttonreturn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonreturn_click", null);
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub ButtonReturn_Click";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsearch_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("buttonsearch_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonsearch_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub ButtonSearch_Click";
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Try";
try {RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="If (txtName.Text.Length <3 And  txtDescription.T";
if ((mostCurrent._txtname.getText().length()<3 && mostCurrent._txtdescription.getText().length()<3 && mostCurrent._txttag.getText().length()<3)) { 
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="Msgbox(\"برای جستجو اطلاعات بیشتری مورد نیاز است";
anywheresoftware.b4a.keywords.Common.Msgbox("برای جستجو اطلاعات بیشتری مورد نیاز است","اطلاعات بیشتر",mostCurrent.activityBA);
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="ProgressDialogShow(\"درحال جستجو\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال جستجو");
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="job.Initialize(\"search_group\", Me)";
_job._initialize(null,processBA,"search_group",searchact.getObject());
RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="Main.query=\"http://www.aloosalam.ir/index.php/mo";
mostCurrent._main._query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=13893645;
 //BA.debugLineNum = 13893645;BA.debugLine="Main.parameter = \"pass=1266\"  &   _ 			\"&q=\" & t";
mostCurrent._main._parameter = "pass=1266"+"&q="+mostCurrent._txtname.getText()+"&description="+mostCurrent._txtdescription.getText()+"&tag="+mostCurrent._txttag.getText()+"&type="+mostCurrent._main._selectedtype+"&ostan="+BA.NumberToString(_selectedostan)+"&shahr="+BA.NumberToString(_selectedshahr)+"&cat="+BA.NumberToString(_selectedcat)+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=13893656;
 //BA.debugLineNum = 13893656;BA.debugLine="job.PostString(Main.query,Main.parameter )";
_job._poststring(null,mostCurrent._main._query,mostCurrent._main._parameter);
 } 
       catch (Exception e213) {
			processBA.setLastException(e213);RDebugUtils.currentLine=13893658;
 //BA.debugLineNum = 13893658;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات جستجو  \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در ارسال اطلاعات جستجو  ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=13893661;
 //BA.debugLineNum = 13893661;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(Telegram.Search.httpjob _job) throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _countries = null;
anywheresoftware.b4a.objects.collections.List _rows = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Try";
try {RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="res = Job.GetString";
_res = _job._getstring(null);
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="Log(\"Response from server: \" & res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server: "+_res);
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"search_group","")) {
case 0: {
RDebugUtils.currentLine=13762573;
 //BA.debugLineNum = 13762573;BA.debugLine="Dim COUNTRIES As List";
_countries = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13762574;
 //BA.debugLineNum = 13762574;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list";
_countries = _parser.NextArray();
RDebugUtils.currentLine=13762577;
 //BA.debugLineNum = 13762577;BA.debugLine="Main.searchResult.Initialize()";
mostCurrent._main._searchresult.Initialize();
RDebugUtils.currentLine=13762578;
 //BA.debugLineNum = 13762578;BA.debugLine="Main.searchResult.Clear()";
mostCurrent._main._searchresult.Clear();
RDebugUtils.currentLine=13762580;
 //BA.debugLineNum = 13762580;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13762581;
 //BA.debugLineNum = 13762581;BA.debugLine="rows= COUNTRIES.Get(0)";
_rows.setObject((java.util.List)(_countries.Get((int) (0))));
RDebugUtils.currentLine=13762583;
 //BA.debugLineNum = 13762583;BA.debugLine="If(rows.Size > 0 ) Then";
if ((_rows.getSize()>0)) { 
RDebugUtils.currentLine=13762585;
 //BA.debugLineNum = 13762585;BA.debugLine="For i= 0 To rows.Size-1";
{
final int step18 = 1;
final int limit18 = (int) (_rows.getSize()-1);
for (_i = (int) (0) ; (step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18); _i = ((int)(0 + _i + step18)) ) {
RDebugUtils.currentLine=13762586;
 //BA.debugLineNum = 13762586;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13762588;
 //BA.debugLineNum = 13762588;BA.debugLine="row.Initialize()";
_row.Initialize();
RDebugUtils.currentLine=13762589;
 //BA.debugLineNum = 13762589;BA.debugLine="row=rows.Get(i)";
_row.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rows.Get(_i)));
RDebugUtils.currentLine=13762590;
 //BA.debugLineNum = 13762590;BA.debugLine="Main.searchResult.Add(row)";
mostCurrent._main._searchresult.Add((Object)(_row.getObject()));
 }
};
RDebugUtils.currentLine=13762593;
 //BA.debugLineNum = 13762593;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=13762594;
 //BA.debugLineNum = 13762594;BA.debugLine="StartActivity(\"searchResultAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("searchResultAct"));
 }else {
RDebugUtils.currentLine=13762596;
 //BA.debugLineNum = 13762596;BA.debugLine="Msgbox(\"موردی با مشخصات درخواستی شما یافت نش";
anywheresoftware.b4a.keywords.Common.Msgbox("موردی با مشخصات درخواستی شما یافت نشد . از بخش آخرین "+mostCurrent._main._selectedtypetitle+"  ها هم می توانید  "+mostCurrent._main._selectedtypetitle+" مورد نظر خود را پیدا کنید  . ","جستجو",mostCurrent.activityBA);
 };
 break; }
case 1: {
RDebugUtils.currentLine=13762599;
 //BA.debugLineNum = 13762599;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13762600;
 //BA.debugLineNum = 13762600;BA.debugLine="l = parser.NextArray";
_l = _parser.NextArray();
RDebugUtils.currentLine=13762601;
 //BA.debugLineNum = 13762601;BA.debugLine="If l.Size = 0 Then";
if (_l.getSize()==0) { 
 }else {
RDebugUtils.currentLine=13762604;
 //BA.debugLineNum = 13762604;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13762605;
 //BA.debugLineNum = 13762605;BA.debugLine="m = l.Get(0)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_l.Get((int) (0))));
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=13762610;
 //BA.debugLineNum = 13762610;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .",anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e194) {
			processBA.setLastException(e194);RDebugUtils.currentLine=13762613;
 //BA.debugLineNum = 13762613;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات جستجو  \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات جستجو  ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=13762616;
 //BA.debugLineNum = 13762616;BA.debugLine="End Sub";
return "";
}
public static String  _menuabout_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("menuabout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuabout_click", null);
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub MenuAbout_Click";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="StartActivity(\"AboutAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("AboutAct"));
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="End Sub";
return "";
}
public static String  _menucontact_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("menucontact_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menucontact_click", null);
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub MenuContact_Click";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="StartActivity(\"contactAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("contactAct"));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="End Sub";
return "";
}
public static String  _menuexit_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("menuexit_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuexit_click", null);
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub MenuExit_Click";
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="End Sub";
return "";
}
public static String  _menuhelp_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("menuhelp_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuhelp_click", null);
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub MenuHelp_Click";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="StartActivity(\"helpAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("helpAct"));
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="End Sub";
return "";
}
public static String  _menuorder_click() throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("menuorder_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuorder_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub MenuOrder_Click";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/index/1")));
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="End Sub";
return "";
}
public static String  _spinnercat_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("spinnercat_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinnercat_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Sub SpinnerCat_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Select Value";
switch (BA.switchObjectToInt(_value,(Object)("دسته بندی نشده"),(Object)("رسمی"),(Object)("علمی"),(Object)("آموزش-تحصیلی"),(Object)("طنز و سرگرمی"),(Object)("اجتماعی-خبری"),(Object)("پزشکی-سلامت"),(Object)("دوستان شخصی"),(Object)("تجاری"),(Object)("ادبی-هنری"),(Object)("عشق-دلنوشته"),(Object)("اعتقادی"),(Object)("شرکت ها-دفتر ها"),(Object)("مشاغل و صنفی"),(Object)("ورزشی"),(Object)("مد و زیبایی"))) {
case 0: {
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="selectedCat =1";
_selectedcat = (int) (1);
 break; }
case 1: {
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="selectedCat =2";
_selectedcat = (int) (2);
 break; }
case 2: {
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="selectedCat =3";
_selectedcat = (int) (3);
 break; }
case 3: {
RDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="selectedCat =4";
_selectedcat = (int) (4);
 break; }
case 4: {
RDebugUtils.currentLine=14483468;
 //BA.debugLineNum = 14483468;BA.debugLine="selectedCat =5";
_selectedcat = (int) (5);
 break; }
case 5: {
RDebugUtils.currentLine=14483470;
 //BA.debugLineNum = 14483470;BA.debugLine="selectedCat =6";
_selectedcat = (int) (6);
 break; }
case 6: {
RDebugUtils.currentLine=14483472;
 //BA.debugLineNum = 14483472;BA.debugLine="selectedCat =7";
_selectedcat = (int) (7);
 break; }
case 7: {
RDebugUtils.currentLine=14483474;
 //BA.debugLineNum = 14483474;BA.debugLine="selectedCat =8";
_selectedcat = (int) (8);
 break; }
case 8: {
RDebugUtils.currentLine=14483476;
 //BA.debugLineNum = 14483476;BA.debugLine="selectedCat =9";
_selectedcat = (int) (9);
 break; }
case 9: {
RDebugUtils.currentLine=14483478;
 //BA.debugLineNum = 14483478;BA.debugLine="selectedCat =10";
_selectedcat = (int) (10);
 break; }
case 10: {
RDebugUtils.currentLine=14483480;
 //BA.debugLineNum = 14483480;BA.debugLine="selectedCat =11";
_selectedcat = (int) (11);
 break; }
case 11: {
RDebugUtils.currentLine=14483482;
 //BA.debugLineNum = 14483482;BA.debugLine="selectedCat =12";
_selectedcat = (int) (12);
 break; }
case 12: {
RDebugUtils.currentLine=14483484;
 //BA.debugLineNum = 14483484;BA.debugLine="selectedCat =13";
_selectedcat = (int) (13);
 break; }
case 13: {
RDebugUtils.currentLine=14483486;
 //BA.debugLineNum = 14483486;BA.debugLine="selectedCat =14";
_selectedcat = (int) (14);
 break; }
case 14: {
RDebugUtils.currentLine=14483488;
 //BA.debugLineNum = 14483488;BA.debugLine="selectedCat =15";
_selectedcat = (int) (15);
 break; }
case 15: {
RDebugUtils.currentLine=14483490;
 //BA.debugLineNum = 14483490;BA.debugLine="selectedCat =16";
_selectedcat = (int) (16);
 break; }
}
;
RDebugUtils.currentLine=14483492;
 //BA.debugLineNum = 14483492;BA.debugLine="End Sub";
return "";
}
public static String  _spinnerostan_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("spinnerostan_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinnerostan_itemclick", new Object[] {_position,_value});
String _v = "";
String _txt = "";
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
Object _row = null;
String[] _column = null;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Sub SpinnerOstan_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="SpinnerShahr.Clear()";
mostCurrent._spinnershahr.Clear();
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="selectedOstan =0";
_selectedostan = (int) (0);
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Dim v As String";
_v = "";
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="v= Value";
_v = BA.ObjectToString(_value);
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="Select v";
switch (BA.switchObjectToInt(_v,"آذربايجان شرقي","آذربايجان غربي","اردبيل","اصفهان","ايلام","بوشهر","تهران","چهارمحال وبختياري","خراسان جنوبي","خراسان رضوي","خراسان شمالي","خوزستان","زنجان","سمنان","سيستان و بلوچستان","فارس","قزوين","قم","كردستان","كرمان","كرمانشاه","كهگيلويه وبوير احمد","گلستان","گيلان","لرستان","مازندران","مركزي","هرمزگان","همدان","يزد")) {
case 0: {
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="selectedOstan =1";
_selectedostan = (int) (1);
 break; }
case 1: {
RDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="selectedOstan =2";
_selectedostan = (int) (2);
 break; }
case 2: {
RDebugUtils.currentLine=14352396;
 //BA.debugLineNum = 14352396;BA.debugLine="selectedOstan =3";
_selectedostan = (int) (3);
 break; }
case 3: {
RDebugUtils.currentLine=14352398;
 //BA.debugLineNum = 14352398;BA.debugLine="selectedOstan =4";
_selectedostan = (int) (4);
 break; }
case 4: {
RDebugUtils.currentLine=14352400;
 //BA.debugLineNum = 14352400;BA.debugLine="selectedOstan =5";
_selectedostan = (int) (5);
 break; }
case 5: {
RDebugUtils.currentLine=14352402;
 //BA.debugLineNum = 14352402;BA.debugLine="selectedOstan =6";
_selectedostan = (int) (6);
 break; }
case 6: {
RDebugUtils.currentLine=14352404;
 //BA.debugLineNum = 14352404;BA.debugLine="selectedOstan =7";
_selectedostan = (int) (7);
 break; }
case 7: {
RDebugUtils.currentLine=14352406;
 //BA.debugLineNum = 14352406;BA.debugLine="selectedOstan =8";
_selectedostan = (int) (8);
 break; }
case 8: {
RDebugUtils.currentLine=14352408;
 //BA.debugLineNum = 14352408;BA.debugLine="selectedOstan =9";
_selectedostan = (int) (9);
 break; }
case 9: {
RDebugUtils.currentLine=14352410;
 //BA.debugLineNum = 14352410;BA.debugLine="selectedOstan =10";
_selectedostan = (int) (10);
 break; }
case 10: {
RDebugUtils.currentLine=14352412;
 //BA.debugLineNum = 14352412;BA.debugLine="selectedOstan =11";
_selectedostan = (int) (11);
 break; }
case 11: {
RDebugUtils.currentLine=14352414;
 //BA.debugLineNum = 14352414;BA.debugLine="selectedOstan =12";
_selectedostan = (int) (12);
 break; }
case 12: {
RDebugUtils.currentLine=14352416;
 //BA.debugLineNum = 14352416;BA.debugLine="selectedOstan =13";
_selectedostan = (int) (13);
 break; }
case 13: {
RDebugUtils.currentLine=14352418;
 //BA.debugLineNum = 14352418;BA.debugLine="selectedOstan =14";
_selectedostan = (int) (14);
 break; }
case 14: {
RDebugUtils.currentLine=14352420;
 //BA.debugLineNum = 14352420;BA.debugLine="selectedOstan =15";
_selectedostan = (int) (15);
 break; }
case 15: {
RDebugUtils.currentLine=14352422;
 //BA.debugLineNum = 14352422;BA.debugLine="selectedOstan =17";
_selectedostan = (int) (17);
 break; }
case 16: {
RDebugUtils.currentLine=14352424;
 //BA.debugLineNum = 14352424;BA.debugLine="selectedOstan =18";
_selectedostan = (int) (18);
 break; }
case 17: {
RDebugUtils.currentLine=14352426;
 //BA.debugLineNum = 14352426;BA.debugLine="selectedOstan =19";
_selectedostan = (int) (19);
 break; }
case 18: {
RDebugUtils.currentLine=14352428;
 //BA.debugLineNum = 14352428;BA.debugLine="selectedOstan =20";
_selectedostan = (int) (20);
 break; }
case 19: {
RDebugUtils.currentLine=14352430;
 //BA.debugLineNum = 14352430;BA.debugLine="selectedOstan =21";
_selectedostan = (int) (21);
 break; }
case 20: {
RDebugUtils.currentLine=14352432;
 //BA.debugLineNum = 14352432;BA.debugLine="selectedOstan =22";
_selectedostan = (int) (22);
 break; }
case 21: {
RDebugUtils.currentLine=14352434;
 //BA.debugLineNum = 14352434;BA.debugLine="selectedOstan =23";
_selectedostan = (int) (23);
 break; }
case 22: {
RDebugUtils.currentLine=14352436;
 //BA.debugLineNum = 14352436;BA.debugLine="selectedOstan =24";
_selectedostan = (int) (24);
 break; }
case 23: {
RDebugUtils.currentLine=14352438;
 //BA.debugLineNum = 14352438;BA.debugLine="selectedOstan =25";
_selectedostan = (int) (25);
 break; }
case 24: {
RDebugUtils.currentLine=14352440;
 //BA.debugLineNum = 14352440;BA.debugLine="selectedOstan =26";
_selectedostan = (int) (26);
 break; }
case 25: {
RDebugUtils.currentLine=14352442;
 //BA.debugLineNum = 14352442;BA.debugLine="selectedOstan =27";
_selectedostan = (int) (27);
 break; }
case 26: {
RDebugUtils.currentLine=14352444;
 //BA.debugLineNum = 14352444;BA.debugLine="selectedOstan =28";
_selectedostan = (int) (28);
 break; }
case 27: {
RDebugUtils.currentLine=14352446;
 //BA.debugLineNum = 14352446;BA.debugLine="selectedOstan =29";
_selectedostan = (int) (29);
 break; }
case 28: {
RDebugUtils.currentLine=14352448;
 //BA.debugLineNum = 14352448;BA.debugLine="selectedOstan =30";
_selectedostan = (int) (30);
 break; }
case 29: {
RDebugUtils.currentLine=14352450;
 //BA.debugLineNum = 14352450;BA.debugLine="selectedOstan =31";
_selectedostan = (int) (31);
 break; }
}
;
RDebugUtils.currentLine=14352454;
 //BA.debugLineNum = 14352454;BA.debugLine="Dim txt As String";
_txt = "";
RDebugUtils.currentLine=14352456;
 //BA.debugLineNum = 14352456;BA.debugLine="txt = \"SELECT id, name  FROM \" & Main.DBTableName";
_txt = "SELECT id, name  FROM "+mostCurrent._main._dbtablename+" where ostan_id = "+BA.NumberToString(_selectedostan);
RDebugUtils.currentLine=14352458;
 //BA.debugLineNum = 14352458;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14352459;
 //BA.debugLineNum = 14352459;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt";
_result = mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,mostCurrent._main._sql1,_txt,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=14352461;
 //BA.debugLineNum = 14352461;BA.debugLine="For i =  0 To result.Size-1";
{
final int step71 = 1;
final int limit71 = (int) (_result.getSize()-1);
for (_i = (int) (0) ; (step71 > 0 && _i <= limit71) || (step71 < 0 && _i >= limit71); _i = ((int)(0 + _i + step71)) ) {
RDebugUtils.currentLine=14352462;
 //BA.debugLineNum = 14352462;BA.debugLine="Dim row As Object";
_row = new Object();
RDebugUtils.currentLine=14352463;
 //BA.debugLineNum = 14352463;BA.debugLine="Dim column() As String";
_column = new String[(int) (0)];
java.util.Arrays.fill(_column,"");
RDebugUtils.currentLine=14352464;
 //BA.debugLineNum = 14352464;BA.debugLine="row = result.Get(i)";
_row = _result.Get(_i);
RDebugUtils.currentLine=14352465;
 //BA.debugLineNum = 14352465;BA.debugLine="column = row";
_column = (String[])(_row);
RDebugUtils.currentLine=14352466;
 //BA.debugLineNum = 14352466;BA.debugLine="SpinnerShahr.Add(column(1))";
mostCurrent._spinnershahr.Add(_column[(int) (1)]);
 }
};
RDebugUtils.currentLine=14352468;
 //BA.debugLineNum = 14352468;BA.debugLine="End Sub";
return "";
}
public static String  _spinnershahr_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="searchact";
if (Debug.shouldDelegate("spinnershahr_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinnershahr_itemclick", new Object[] {_position,_value});
String _txt = "";
anywheresoftware.b4a.objects.collections.List _result = null;
Object _row = null;
String[] _column = null;
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub SpinnerShahr_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim txt As String";
_txt = "";
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="txt = \"SELECT   id  FROM \" & Main.DBTableName & \"";
_txt = "SELECT   id  FROM "+mostCurrent._main._dbtablename+" where name = '"+BA.ObjectToString(_value)+"'";
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt";
_result = mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,mostCurrent._main._sql1,_txt,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=14417930;
 //BA.debugLineNum = 14417930;BA.debugLine="Dim row As Object";
_row = new Object();
RDebugUtils.currentLine=14417931;
 //BA.debugLineNum = 14417931;BA.debugLine="Dim column() As String";
_column = new String[(int) (0)];
java.util.Arrays.fill(_column,"");
RDebugUtils.currentLine=14417932;
 //BA.debugLineNum = 14417932;BA.debugLine="row = result.Get(0)";
_row = _result.Get((int) (0));
RDebugUtils.currentLine=14417933;
 //BA.debugLineNum = 14417933;BA.debugLine="column = row";
_column = (String[])(_row);
RDebugUtils.currentLine=14417934;
 //BA.debugLineNum = 14417934;BA.debugLine="selectedShahr = column(0)";
_selectedshahr = (int)(Double.parseDouble(_column[(int) (0)]));
RDebugUtils.currentLine=14417936;
 //BA.debugLineNum = 14417936;BA.debugLine="End Sub";
return "";
}
}