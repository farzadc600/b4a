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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Telegram.Search", "Telegram.Search.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "Telegram.Search", "Telegram.Search.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Telegram.Search.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (aboutact.mostCurrent != null);
vis = vis | (searchresultact.mostCurrent != null);
vis = vis | (helpact.mostCurrent != null);
vis = vis | (contactact.mostCurrent != null);
vis = vis | (insertact.mostCurrent != null);
vis = vis | (groupviewact.mostCurrent != null);
vis = vis | (viewinsertedgroupact.mostCurrent != null);
vis = vis | (searchact.mostCurrent != null);
return vis;}

public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = main.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, httputils2service.class));
 {
            Activity __a = null;
            if (aboutact.previousOne != null) {
				__a = aboutact.previousOne.get();
			}
            else {
                BA ba = aboutact.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (searchresultact.previousOne != null) {
				__a = searchresultact.previousOne.get();
			}
            else {
                BA ba = searchresultact.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (helpact.previousOne != null) {
				__a = helpact.previousOne.get();
			}
            else {
                BA ba = helpact.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (contactact.previousOne != null) {
				__a = contactact.previousOne.get();
			}
            else {
                BA ba = contactact.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (insertact.previousOne != null) {
				__a = insertact.previousOne.get();
			}
            else {
                BA ba = insertact.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (groupviewact.previousOne != null) {
				__a = groupviewact.previousOne.get();
			}
            else {
                BA ba = groupviewact.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (viewinsertedgroupact.previousOne != null) {
				__a = viewinsertedgroupact.previousOne.get();
			}
            else {
                BA ba = viewinsertedgroupact.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (searchact.previousOne != null) {
				__a = searchact.previousOne.get();
			}
            else {
                BA ba = searchact.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String[] _ostan = null;
public static String[] _cat = null;
public static String _dbfilename = "";
public static String _dbfiledir = "";
public static String _dbtablename = "";
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static anywheresoftware.b4a.objects.collections.Map _selected_item = null;
public static anywheresoftware.b4a.objects.collections.List _searchresult = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _groupicon = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _stickericon = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _idicon = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _roboticon = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _channelicon = null;
public static String _selectedtype = "";
public static String _selectedtypetitle = "";
public static String _query = "";
public static String _parameter = "";
public static anywheresoftware.b4a.objects.collections.Map _userinfo = null;
public static anywheresoftware.b4a.phone.Phone _phone = null;
public static anywheresoftware.b4a.phone.Phone.PhoneId _phoneid = null;
public static anywheresoftware.b4a.keywords.constants.TypefaceWrapper _font = null;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _rightbitmap = null;
public static boolean _isedit = false;
public static boolean _issupergroup = false;
public static int _vipinsertcount = 0;
public static int _todayinsertcount = 0;
public anywheresoftware.b4a.objects.PanelWrapper _panelsticker = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelchannel = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelgroup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _group = null;
public anywheresoftware.b4a.objects.ButtonWrapper _sticker = null;
public anywheresoftware.b4a.objects.ButtonWrapper _channel = null;
public de.amberhome.navdrawer.NavigationDrawer _navi = null;
public anywheresoftware.b4a.objects.PanelWrapper _pcantent = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontopid = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlastid = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsearchid = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonaddid = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontopjoingroup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontopgroup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlastgroup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsearchgroup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonaddgroup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenu = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _search = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonsupergroup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonvipchannel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview21 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview22 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview23 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview24 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview25 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview26 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview15 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview16 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview17 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview18 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview19 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview20 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview10 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview11 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview12 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview13 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview14 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview6 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview7 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview8 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview9 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview3 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview4 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview5 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview30 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview27 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttoninsertsupergroup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonmygroup = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollviewchannel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonmychannel = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollviewgroup = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelgroupcontainer = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelchannelcontainer = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttontopchannelview = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview29 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelstickercontainer = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollviewsticker = null;
public Telegram.Search.httputils2service _httputils2service = null;
public Telegram.Search.aboutact _aboutact = null;
public Telegram.Search.searchresultact _searchresultact = null;
public Telegram.Search.dbutils _dbutils = null;
public Telegram.Search.helpact _helpact = null;
public Telegram.Search.contactact _contactact = null;
public Telegram.Search.insertact _insertact = null;
public Telegram.Search.groupviewact _groupviewact = null;
public Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public Telegram.Search.searchact _searchact = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
mostCurrent._navi.Initialize2(mostCurrent.activityBA,"navi",(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._activity.getObject())),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
mostCurrent._navi.getNavigationPanel().LoadLayout("menu",mostCurrent.activityBA);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="pCantent.Initialize(\"\")";
mostCurrent._pcantent.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
mostCurrent._navi.getContentPanel().AddView((android.view.View)(mostCurrent._pcantent.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="pCantent.LoadLayout(\"main_view\")";
mostCurrent._pcantent.LoadLayout("main_view",mostCurrent.activityBA);
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="pCantent.SendToBack";
mostCurrent._pcantent.SendToBack();
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="Activity.Title=\"جستجوی گروه تلگرام\"";
mostCurrent._activity.setTitle((Object)("جستجوی گروه تلگرام"));
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="DBFileDir = DBUtils.CopyDBFromAssets(DBFileName)";
_dbfiledir = mostCurrent._dbutils._copydbfromassets(mostCurrent.activityBA,_dbfilename);
 };
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="SQL1.Initialize(DBFileDir, DBFileName, True)";
_sql1.Initialize(_dbfiledir,_dbfilename,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="cat(1)=(\"دسته بندی نشده\")'1";
_cat[(int) (1)] = ("دسته بندی نشده");
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="cat(2)=(\"رسمی\")'2";
_cat[(int) (2)] = ("رسمی");
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="cat(3)=(\"علمی\")'3";
_cat[(int) (3)] = ("علمی");
RDebugUtils.currentLine=131098;
 //BA.debugLineNum = 131098;BA.debugLine="cat(4)=(\"آموزش-تحصیلی\")'4";
_cat[(int) (4)] = ("آموزش-تحصیلی");
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="cat(5)=(\"طنز و سرگرمی\")'5";
_cat[(int) (5)] = ("طنز و سرگرمی");
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="cat(6)=(\"اجتماعی-خبری\")'6";
_cat[(int) (6)] = ("اجتماعی-خبری");
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="cat(7)=(\"پزشکی-سلامت\")'7";
_cat[(int) (7)] = ("پزشکی-سلامت");
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="cat(8)=(\"دوستان شخصی\")'8";
_cat[(int) (8)] = ("دوستان شخصی");
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="cat(9)=(\"تجاری\")'9";
_cat[(int) (9)] = ("تجاری");
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="cat(10)=(\"ادبی-هنری\")'10";
_cat[(int) (10)] = ("ادبی-هنری");
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="cat(11)=(\"عشق-دلنوشته\")'11";
_cat[(int) (11)] = ("عشق-دلنوشته");
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="cat(12)=(\"اعتقادی\")'12";
_cat[(int) (12)] = ("اعتقادی");
RDebugUtils.currentLine=131107;
 //BA.debugLineNum = 131107;BA.debugLine="cat(13)=(\"شرکت ها-دفتر ها\")'13";
_cat[(int) (13)] = ("شرکت ها-دفتر ها");
RDebugUtils.currentLine=131108;
 //BA.debugLineNum = 131108;BA.debugLine="cat(14)=(\"مشاغل و صنفی\")'14";
_cat[(int) (14)] = ("مشاغل و صنفی");
RDebugUtils.currentLine=131109;
 //BA.debugLineNum = 131109;BA.debugLine="cat(15)=(\"ورزشی\")'15";
_cat[(int) (15)] = ("ورزشی");
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="cat(16)=(\"مد و زیبایی\")'16";
_cat[(int) (16)] = ("مد و زیبایی");
RDebugUtils.currentLine=131113;
 //BA.debugLineNum = 131113;BA.debugLine="ostan(0)=\"همه استانها\"";
_ostan[(int) (0)] = "همه استانها";
RDebugUtils.currentLine=131114;
 //BA.debugLineNum = 131114;BA.debugLine="ostan(1)=\"آذربايجان شرقي\"";
_ostan[(int) (1)] = "آذربايجان شرقي";
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="ostan(2)=\"آذربايجان غربي\"";
_ostan[(int) (2)] = "آذربايجان غربي";
RDebugUtils.currentLine=131116;
 //BA.debugLineNum = 131116;BA.debugLine="ostan(3)=\"اردبيل\"";
_ostan[(int) (3)] = "اردبيل";
RDebugUtils.currentLine=131117;
 //BA.debugLineNum = 131117;BA.debugLine="ostan(4)=\"اصفهان\"";
_ostan[(int) (4)] = "اصفهان";
RDebugUtils.currentLine=131118;
 //BA.debugLineNum = 131118;BA.debugLine="ostan(5)=\"ايلام\"";
_ostan[(int) (5)] = "ايلام";
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="ostan(6)=\"بوشهر\"";
_ostan[(int) (6)] = "بوشهر";
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="ostan(7)=\"تهران\"";
_ostan[(int) (7)] = "تهران";
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="ostan(8)=\"چهارمحال وبختياري\"";
_ostan[(int) (8)] = "چهارمحال وبختياري";
RDebugUtils.currentLine=131122;
 //BA.debugLineNum = 131122;BA.debugLine="ostan(9)=\"خراسان جنوبي\"";
_ostan[(int) (9)] = "خراسان جنوبي";
RDebugUtils.currentLine=131123;
 //BA.debugLineNum = 131123;BA.debugLine="ostan(10)=\"خراسان رضوي\"";
_ostan[(int) (10)] = "خراسان رضوي";
RDebugUtils.currentLine=131124;
 //BA.debugLineNum = 131124;BA.debugLine="ostan(11)=\"خراسان شمالي\"";
_ostan[(int) (11)] = "خراسان شمالي";
RDebugUtils.currentLine=131125;
 //BA.debugLineNum = 131125;BA.debugLine="ostan(12)=\"خوزستان\"";
_ostan[(int) (12)] = "خوزستان";
RDebugUtils.currentLine=131126;
 //BA.debugLineNum = 131126;BA.debugLine="ostan(13)=\"زنجان\"";
_ostan[(int) (13)] = "زنجان";
RDebugUtils.currentLine=131127;
 //BA.debugLineNum = 131127;BA.debugLine="ostan(14)=\"سمنان\"";
_ostan[(int) (14)] = "سمنان";
RDebugUtils.currentLine=131128;
 //BA.debugLineNum = 131128;BA.debugLine="ostan(15)=\"سيستان و بلوچستان\"";
_ostan[(int) (15)] = "سيستان و بلوچستان";
RDebugUtils.currentLine=131129;
 //BA.debugLineNum = 131129;BA.debugLine="ostan(17)=\"فارس\"";
_ostan[(int) (17)] = "فارس";
RDebugUtils.currentLine=131130;
 //BA.debugLineNum = 131130;BA.debugLine="ostan(18)=\"قزوين\"";
_ostan[(int) (18)] = "قزوين";
RDebugUtils.currentLine=131131;
 //BA.debugLineNum = 131131;BA.debugLine="ostan(19)=\"قم\"";
_ostan[(int) (19)] = "قم";
RDebugUtils.currentLine=131132;
 //BA.debugLineNum = 131132;BA.debugLine="ostan(20)=\"كردستان\"";
_ostan[(int) (20)] = "كردستان";
RDebugUtils.currentLine=131133;
 //BA.debugLineNum = 131133;BA.debugLine="ostan(21)=\"كرمان\"";
_ostan[(int) (21)] = "كرمان";
RDebugUtils.currentLine=131134;
 //BA.debugLineNum = 131134;BA.debugLine="ostan(22)=\"كرمانشاه\"";
_ostan[(int) (22)] = "كرمانشاه";
RDebugUtils.currentLine=131136;
 //BA.debugLineNum = 131136;BA.debugLine="ostan(23)=\"كهگيلويه وبوير احمد\"";
_ostan[(int) (23)] = "كهگيلويه وبوير احمد";
RDebugUtils.currentLine=131137;
 //BA.debugLineNum = 131137;BA.debugLine="ostan(24)=\"گلستان\"";
_ostan[(int) (24)] = "گلستان";
RDebugUtils.currentLine=131138;
 //BA.debugLineNum = 131138;BA.debugLine="ostan(25)=\"گيلان\"";
_ostan[(int) (25)] = "گيلان";
RDebugUtils.currentLine=131139;
 //BA.debugLineNum = 131139;BA.debugLine="ostan(26)=\"لرستان\"";
_ostan[(int) (26)] = "لرستان";
RDebugUtils.currentLine=131140;
 //BA.debugLineNum = 131140;BA.debugLine="ostan(27)=\"مازندران\"";
_ostan[(int) (27)] = "مازندران";
RDebugUtils.currentLine=131141;
 //BA.debugLineNum = 131141;BA.debugLine="ostan(28)=\"مركزي\"";
_ostan[(int) (28)] = "مركزي";
RDebugUtils.currentLine=131142;
 //BA.debugLineNum = 131142;BA.debugLine="ostan(29)=\"هرمزگان\"";
_ostan[(int) (29)] = "هرمزگان";
RDebugUtils.currentLine=131143;
 //BA.debugLineNum = 131143;BA.debugLine="ostan(30)=\"همدان\"";
_ostan[(int) (30)] = "همدان";
RDebugUtils.currentLine=131144;
 //BA.debugLineNum = 131144;BA.debugLine="ostan(31)=\"يزد\"";
_ostan[(int) (31)] = "يزد";
RDebugUtils.currentLine=131146;
 //BA.debugLineNum = 131146;BA.debugLine="font =Typeface.LoadFromAssets(\"yekan.ttf\")";
_font.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("yekan.ttf")));
RDebugUtils.currentLine=131151;
 //BA.debugLineNum = 131151;BA.debugLine="Sticker.Typeface =font";
mostCurrent._sticker.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131152;
 //BA.debugLineNum = 131152;BA.debugLine="Sticker.TextSize =15";
mostCurrent._sticker.setTextSize((float) (15));
RDebugUtils.currentLine=131153;
 //BA.debugLineNum = 131153;BA.debugLine="Group.Typeface =font";
mostCurrent._group.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131154;
 //BA.debugLineNum = 131154;BA.debugLine="Group.TextSize =15";
mostCurrent._group.setTextSize((float) (15));
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="Channel.Typeface = font";
mostCurrent._channel.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131156;
 //BA.debugLineNum = 131156;BA.debugLine="Channel.TextSize = 15";
mostCurrent._channel.setTextSize((float) (15));
RDebugUtils.currentLine=131160;
 //BA.debugLineNum = 131160;BA.debugLine="ButtonSearchId.Typeface=font";
mostCurrent._buttonsearchid.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131161;
 //BA.debugLineNum = 131161;BA.debugLine="ButtonSearchId.TextSize=15";
mostCurrent._buttonsearchid.setTextSize((float) (15));
RDebugUtils.currentLine=131162;
 //BA.debugLineNum = 131162;BA.debugLine="ButtonAddId.Typeface=font";
mostCurrent._buttonaddid.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131163;
 //BA.debugLineNum = 131163;BA.debugLine="ButtonAddId.TextSize=15";
mostCurrent._buttonaddid.setTextSize((float) (15));
RDebugUtils.currentLine=131164;
 //BA.debugLineNum = 131164;BA.debugLine="ButtonTopJoinGroup.Typeface=font";
mostCurrent._buttontopjoingroup.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131165;
 //BA.debugLineNum = 131165;BA.debugLine="ButtonTopJoinGroup.TextSize=15";
mostCurrent._buttontopjoingroup.setTextSize((float) (15));
RDebugUtils.currentLine=131166;
 //BA.debugLineNum = 131166;BA.debugLine="ButtonTopGroup.Typeface=font";
mostCurrent._buttontopgroup.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131167;
 //BA.debugLineNum = 131167;BA.debugLine="ButtonTopGroup.TextSize=15";
mostCurrent._buttontopgroup.setTextSize((float) (15));
RDebugUtils.currentLine=131168;
 //BA.debugLineNum = 131168;BA.debugLine="ButtonLastGroup.Typeface=font";
mostCurrent._buttonlastgroup.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131169;
 //BA.debugLineNum = 131169;BA.debugLine="ButtonLastGroup.TextSize=15";
mostCurrent._buttonlastgroup.setTextSize((float) (15));
RDebugUtils.currentLine=131170;
 //BA.debugLineNum = 131170;BA.debugLine="ButtonSearchGroup.Typeface=font";
mostCurrent._buttonsearchgroup.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131171;
 //BA.debugLineNum = 131171;BA.debugLine="ButtonSearchGroup.TextSize=15";
mostCurrent._buttonsearchgroup.setTextSize((float) (15));
RDebugUtils.currentLine=131172;
 //BA.debugLineNum = 131172;BA.debugLine="ButtonAddGroup.Typeface=font";
mostCurrent._buttonaddgroup.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131173;
 //BA.debugLineNum = 131173;BA.debugLine="ButtonAddGroup.TextSize=15";
mostCurrent._buttonaddgroup.setTextSize((float) (15));
RDebugUtils.currentLine=131175;
 //BA.debugLineNum = 131175;BA.debugLine="ButtonVIPChannel.Typeface=font";
mostCurrent._buttonvipchannel.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131176;
 //BA.debugLineNum = 131176;BA.debugLine="ButtonVIPChannel.TextSize=15";
mostCurrent._buttonvipchannel.setTextSize((float) (15));
RDebugUtils.currentLine=131178;
 //BA.debugLineNum = 131178;BA.debugLine="ButtonSuperGroup.Typeface=font";
mostCurrent._buttonsupergroup.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131179;
 //BA.debugLineNum = 131179;BA.debugLine="ButtonSuperGroup.TextSize=15";
mostCurrent._buttonsupergroup.setTextSize((float) (15));
RDebugUtils.currentLine=131183;
 //BA.debugLineNum = 131183;BA.debugLine="ButtonInsertSuperGroup.Typeface=font";
mostCurrent._buttoninsertsupergroup.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131184;
 //BA.debugLineNum = 131184;BA.debugLine="ButtonInsertSuperGroup.TextSize=15";
mostCurrent._buttoninsertsupergroup.setTextSize((float) (15));
RDebugUtils.currentLine=131187;
 //BA.debugLineNum = 131187;BA.debugLine="ButtonMyGroup.Typeface=font";
mostCurrent._buttonmygroup.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131188;
 //BA.debugLineNum = 131188;BA.debugLine="ButtonMyGroup.TextSize=15";
mostCurrent._buttonmygroup.setTextSize((float) (15));
RDebugUtils.currentLine=131191;
 //BA.debugLineNum = 131191;BA.debugLine="ButtonMyChannel.Typeface=font";
mostCurrent._buttonmychannel.setTypeface((android.graphics.Typeface)(_font.getObject()));
RDebugUtils.currentLine=131192;
 //BA.debugLineNum = 131192;BA.debugLine="ButtonMyChannel.TextSize=15";
mostCurrent._buttonmychannel.setTextSize((float) (15));
RDebugUtils.currentLine=131197;
 //BA.debugLineNum = 131197;BA.debugLine="groupIcon.Initialize(File.DirAssets, \"group_icon.";
_groupicon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"group_icon.png");
RDebugUtils.currentLine=131198;
 //BA.debugLineNum = 131198;BA.debugLine="stickerIcon.Initialize(File.DirAssets, \"sticker_i";
_stickericon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"sticker_icon.png");
RDebugUtils.currentLine=131199;
 //BA.debugLineNum = 131199;BA.debugLine="idIcon.Initialize(File.DirAssets, \"id_icon.png\")";
_idicon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"id_icon.png");
RDebugUtils.currentLine=131200;
 //BA.debugLineNum = 131200;BA.debugLine="robotIcon.Initialize(File.DirAssets, \"robot_icon.";
_roboticon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"robot_icon.png");
RDebugUtils.currentLine=131201;
 //BA.debugLineNum = 131201;BA.debugLine="channelIcon.Initialize(File.DirAssets, \"channel_i";
_channelicon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"channel_icon.png");
RDebugUtils.currentLine=131202;
 //BA.debugLineNum = 131202;BA.debugLine="rightBitmap.Initialize(File.DirAssets,\"right237.p";
_rightbitmap.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"right237.png");
RDebugUtils.currentLine=131205;
 //BA.debugLineNum = 131205;BA.debugLine="ImageView1.Bitmap = rightBitmap";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131206;
 //BA.debugLineNum = 131206;BA.debugLine="ImageView21.Bitmap = rightBitmap";
mostCurrent._imageview21.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131207;
 //BA.debugLineNum = 131207;BA.debugLine="ImageView22.Bitmap = rightBitmap";
mostCurrent._imageview22.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131208;
 //BA.debugLineNum = 131208;BA.debugLine="ImageView23.Bitmap = rightBitmap";
mostCurrent._imageview23.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131209;
 //BA.debugLineNum = 131209;BA.debugLine="ImageView24.Bitmap = rightBitmap";
mostCurrent._imageview24.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131210;
 //BA.debugLineNum = 131210;BA.debugLine="ImageView25.Bitmap = rightBitmap";
mostCurrent._imageview25.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131211;
 //BA.debugLineNum = 131211;BA.debugLine="ImageView26.Bitmap = rightBitmap";
mostCurrent._imageview26.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131212;
 //BA.debugLineNum = 131212;BA.debugLine="ImageView15.Bitmap = rightBitmap";
mostCurrent._imageview15.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131213;
 //BA.debugLineNum = 131213;BA.debugLine="ImageView16.Bitmap = rightBitmap";
mostCurrent._imageview16.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131214;
 //BA.debugLineNum = 131214;BA.debugLine="ImageView17.Bitmap = rightBitmap";
mostCurrent._imageview17.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131215;
 //BA.debugLineNum = 131215;BA.debugLine="ImageView18.Bitmap = rightBitmap";
mostCurrent._imageview18.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131216;
 //BA.debugLineNum = 131216;BA.debugLine="ImageView19.Bitmap = rightBitmap";
mostCurrent._imageview19.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131217;
 //BA.debugLineNum = 131217;BA.debugLine="ImageView20.Bitmap = rightBitmap";
mostCurrent._imageview20.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131218;
 //BA.debugLineNum = 131218;BA.debugLine="ImageView10.Bitmap = rightBitmap";
mostCurrent._imageview10.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131219;
 //BA.debugLineNum = 131219;BA.debugLine="ImageView11.Bitmap = rightBitmap";
mostCurrent._imageview11.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131220;
 //BA.debugLineNum = 131220;BA.debugLine="ImageView12.Bitmap = rightBitmap";
mostCurrent._imageview12.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131221;
 //BA.debugLineNum = 131221;BA.debugLine="ImageView13.Bitmap = rightBitmap";
mostCurrent._imageview13.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131222;
 //BA.debugLineNum = 131222;BA.debugLine="ImageView14.Bitmap = rightBitmap";
mostCurrent._imageview14.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131223;
 //BA.debugLineNum = 131223;BA.debugLine="ImageView6.Bitmap = rightBitmap";
mostCurrent._imageview6.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131224;
 //BA.debugLineNum = 131224;BA.debugLine="ImageView7.Bitmap = rightBitmap";
mostCurrent._imageview7.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131225;
 //BA.debugLineNum = 131225;BA.debugLine="ImageView8.Bitmap = rightBitmap";
mostCurrent._imageview8.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131226;
 //BA.debugLineNum = 131226;BA.debugLine="ImageView9.Bitmap = rightBitmap";
mostCurrent._imageview9.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131227;
 //BA.debugLineNum = 131227;BA.debugLine="ImageView2.Bitmap = rightBitmap";
mostCurrent._imageview2.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131228;
 //BA.debugLineNum = 131228;BA.debugLine="ImageView3.Bitmap = rightBitmap";
mostCurrent._imageview3.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131229;
 //BA.debugLineNum = 131229;BA.debugLine="ImageView4.Bitmap = rightBitmap";
mostCurrent._imageview4.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131230;
 //BA.debugLineNum = 131230;BA.debugLine="ImageView5.Bitmap = rightBitmap";
mostCurrent._imageview5.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131232;
 //BA.debugLineNum = 131232;BA.debugLine="ImageView27.Bitmap = rightBitmap";
mostCurrent._imageview27.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131234;
 //BA.debugLineNum = 131234;BA.debugLine="ImageView29.Bitmap = rightBitmap";
mostCurrent._imageview29.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131235;
 //BA.debugLineNum = 131235;BA.debugLine="ImageView30.Bitmap = rightBitmap";
mostCurrent._imageview30.setBitmap((android.graphics.Bitmap)(_rightbitmap.getObject()));
RDebugUtils.currentLine=131238;
 //BA.debugLineNum = 131238;BA.debugLine="PanelGroupContainer.RemoveView()";
mostCurrent._panelgroupcontainer.RemoveView();
RDebugUtils.currentLine=131239;
 //BA.debugLineNum = 131239;BA.debugLine="ScrollViewGroup.Panel.AddView(PanelGroupContainer";
mostCurrent._scrollviewgroup.getPanel().AddView((android.view.View)(mostCurrent._panelgroupcontainer.getObject()),(int) (0),(int) (0),mostCurrent._panelgroupcontainer.getWidth(),mostCurrent._panelgroupcontainer.getHeight());
RDebugUtils.currentLine=131240;
 //BA.debugLineNum = 131240;BA.debugLine="ScrollViewGroup.Panel.Height =450dip";
mostCurrent._scrollviewgroup.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (450)));
RDebugUtils.currentLine=131241;
 //BA.debugLineNum = 131241;BA.debugLine="ScrollViewGroup.Panel.Color=Colors.White";
mostCurrent._scrollviewgroup.getPanel().setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131243;
 //BA.debugLineNum = 131243;BA.debugLine="PanelStickerContainer.RemoveView";
mostCurrent._panelstickercontainer.RemoveView();
RDebugUtils.currentLine=131244;
 //BA.debugLineNum = 131244;BA.debugLine="ScrollViewSticker.Panel.AddView(PanelStickerConta";
mostCurrent._scrollviewsticker.getPanel().AddView((android.view.View)(mostCurrent._panelstickercontainer.getObject()),(int) (0),(int) (0),mostCurrent._panelstickercontainer.getWidth(),mostCurrent._panelstickercontainer.getHeight());
RDebugUtils.currentLine=131245;
 //BA.debugLineNum = 131245;BA.debugLine="ScrollViewSticker.Panel.Height =410dip";
mostCurrent._scrollviewsticker.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (410)));
RDebugUtils.currentLine=131246;
 //BA.debugLineNum = 131246;BA.debugLine="ScrollViewSticker.Panel.Color=Colors.White";
mostCurrent._scrollviewsticker.getPanel().setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131248;
 //BA.debugLineNum = 131248;BA.debugLine="PanelChannelContainer.RemoveView()";
mostCurrent._panelchannelcontainer.RemoveView();
RDebugUtils.currentLine=131249;
 //BA.debugLineNum = 131249;BA.debugLine="ScrollViewChannel.Panel.AddView(PanelChannelConta";
mostCurrent._scrollviewchannel.getPanel().AddView((android.view.View)(mostCurrent._panelchannelcontainer.getObject()),(int) (0),(int) (0),mostCurrent._panelchannelcontainer.getWidth(),mostCurrent._panelchannelcontainer.getHeight());
RDebugUtils.currentLine=131250;
 //BA.debugLineNum = 131250;BA.debugLine="ScrollViewChannel.Panel.Height =410dip";
mostCurrent._scrollviewchannel.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (410)));
RDebugUtils.currentLine=131251;
 //BA.debugLineNum = 131251;BA.debugLine="ScrollViewChannel.Panel.Color=Colors.White";
mostCurrent._scrollviewchannel.getPanel().setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131255;
 //BA.debugLineNum = 131255;BA.debugLine="If(FirstTime = True ) Then";
if ((_firsttime==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=131256;
 //BA.debugLineNum = 131256;BA.debugLine="checkRegister";
_checkregister();
 };
RDebugUtils.currentLine=131261;
 //BA.debugLineNum = 131261;BA.debugLine="readInfo";
_readinfo();
RDebugUtils.currentLine=131262;
 //BA.debugLineNum = 131262;BA.debugLine="End Sub";
return "";
}
public static String  _checkregister() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("checkregister"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkregister", null);
String _model = "";
int _sdk = 0;
String _phone_id = "";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub checkRegister";
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="readInfo";
_readinfo();
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Dim model As String = userInfo.Get(\"model\")";
_model = BA.ObjectToString(_userinfo.Get((Object)("model")));
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Dim sdk As Int = userInfo.Get(\"sdk\")";
_sdk = (int)(BA.ObjectToNumber(_userinfo.Get((Object)("sdk"))));
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Dim phone_id As String = userInfo.Get(\"phoneid\")";
_phone_id = BA.ObjectToString(_userinfo.Get((Object)("phoneid")));
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="If(IsNumber( userInfo.Get(\"user_id\"))=False Or _";
if ((anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_userinfo.Get((Object)("user_id"))))==anywheresoftware.b4a.keywords.Common.False || (_userinfo.Get((Object)("user_id"))).equals((Object)(0)) || anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_userinfo.Get((Object)("user_name"))))==anywheresoftware.b4a.keywords.Common.False || _userinfo.Get((Object)("user_name"))== null || _sdk!=_phone.getSdkVersion() || (_model).equals(_phone.getManufacturer()+","+_phone.getProduct()) == false || (_phone_id).equals(_phoneid.GetDeviceId()) == false)) { 
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="userInfo.Put(\"is_advance\",False)";
_userinfo.Put((Object)("is_advance"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=917530;
 //BA.debugLineNum = 917530;BA.debugLine="userInfo.Put(\"is_premium\",False)";
_userinfo.Put((Object)("is_premium"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="userInfo.Put(\"to_day_insert_advance\",0)";
_userinfo.Put((Object)("to_day_insert_advance"),(Object)(0));
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="writeInfo";
_writeinfo();
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="StartActivity(\"viewInsertedGroupAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("viewInsertedGroupAct"));
RDebugUtils.currentLine=917535;
 //BA.debugLineNum = 917535;BA.debugLine="writeInfo";
_writeinfo();
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="End Sub";
return "";
}
public static String  _readinfo() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("readinfo"))
	return (String) Debug.delegate(mostCurrent.activityBA, "readinfo", null);
int _day = 0;
int _today = 0;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub readInfo";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Try";
try {RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="userInfo.Initialize";
_userinfo.Initialize();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="userInfo= DBUtils.ExecuteMap(SQL1,  \"SELECT *";
_userinfo = mostCurrent._dbutils._executemap(mostCurrent.activityBA,_sql1,"SELECT *   FROM  info ",(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="If userInfo.Get(\"to_day_insert_advance\") = Null";
if (_userinfo.Get((Object)("to_day_insert_advance"))== null) { 
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="vipInsertCount = 0";
_vipinsertcount = (int) (0);
 }else {
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="vipInsertCount = userInfo.Get(\"to_day_insert_ad";
_vipinsertcount = (int)(BA.ObjectToNumber(_userinfo.Get((Object)("to_day_insert_advance"))));
 };
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="If userInfo.Get(\"to_day_insert\") = Null Then";
if (_userinfo.Get((Object)("to_day_insert"))== null) { 
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="todayInsertCount = 0";
_todayinsertcount = (int) (0);
 }else {
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="todayInsertCount = userInfo.Get(\"to_day_insert\"";
_todayinsertcount = (int)(BA.ObjectToNumber(_userinfo.Get((Object)("to_day_insert"))));
 };
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Dim day  As Int  =  DateTime.GetDayOfMonth(DateT";
_day = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="Dim today As Int";
_today = 0;
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="If IsNumber( userInfo.Get(\"to_day_date\")) =False";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_userinfo.Get((Object)("to_day_date"))))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="today = 0";
_today = (int) (0);
 }else {
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="today = userInfo.Get(\"to_day_date\")";
_today = (int)(BA.ObjectToNumber(_userinfo.Get((Object)("to_day_date"))));
 };
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="If (today <> day )Then";
if ((_today!=_day)) { 
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="todayInsertCount = 0";
_todayinsertcount = (int) (0);
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="vipInsertCount = 0";
_vipinsertcount = (int) (0);
RDebugUtils.currentLine=786459;
 //BA.debugLineNum = 786459;BA.debugLine="userInfo.Put(\"to_day_date\",day)";
_userinfo.Put((Object)("to_day_date"),(Object)(_day));
RDebugUtils.currentLine=786460;
 //BA.debugLineNum = 786460;BA.debugLine="writeInfo";
_writeinfo();
 };
 } 
       catch (Exception e270) {
			processBA.setLastException(e270);RDebugUtils.currentLine=786464;
 //BA.debugLineNum = 786464;BA.debugLine="Try";
try {RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="userInfo=DBUtils.ExecuteMap(SQL1,  _ 				\"CREAT";
_userinfo = mostCurrent._dbutils._executemap(mostCurrent.activityBA,_sql1,"CREATE TABLE info (             "+"name	TEXT,                      "+"phone	TEXT,                  "+"user_id	INTEGER,               "+"pass	TEXT,                      "+"user_name	TEXT,              "+"sdk	TEXT,                      "+"model	TEXT,                  "+"line_number	TEXT,              "+"phoneid	TEXT,                  "+"is_advance	INTEGER,           "+"is_premium	INTEGER,           "+"advance_count	INTEGER,       "+"advance_expier_date	TEXT,      "+"to_day_date	TEXT,              "+"to_day_insert	INTEGER,       "+"to_day_insert_advance 	INTEGER"+")",(String[])(anywheresoftware.b4a.keywords.Common.Null));
 } 
       catch (Exception e273) {
			processBA.setLastException(e273); };
RDebugUtils.currentLine=786488;
 //BA.debugLineNum = 786488;BA.debugLine="DBUtils.ExecuteMap(SQL1,  _ 			\"insert into info";
mostCurrent._dbutils._executemap(mostCurrent.activityBA,_sql1,"insert into info (name,is_advance,is_premium)VALUES('temp','false','false') ",(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=786491;
 //BA.debugLineNum = 786491;BA.debugLine="userInfo= DBUtils.ExecuteMap(SQL1,  \"SELECT *";
_userinfo = mostCurrent._dbutils._executemap(mostCurrent.activityBA,_sql1,"SELECT *   FROM  info ",(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=786492;
 //BA.debugLineNum = 786492;BA.debugLine="Dim day  As Int  =  DateTime.GetDayOfMonth(DateT";
_day = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=786493;
 //BA.debugLineNum = 786493;BA.debugLine="userInfo.Put(\"to_day_date\",day)";
_userinfo.Put((Object)("to_day_date"),(Object)(_day));
RDebugUtils.currentLine=786494;
 //BA.debugLineNum = 786494;BA.debugLine="todayInsertCount = 0";
_todayinsertcount = (int) (0);
RDebugUtils.currentLine=786496;
 //BA.debugLineNum = 786496;BA.debugLine="writeInfo";
_writeinfo();
 };
RDebugUtils.currentLine=786499;
 //BA.debugLineNum = 786499;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("activity_pause"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_pause", new Object[] {_userclosed});
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _btnabout_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("btnabout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnabout_click", null);
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub btnAbout_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="StartActivity(\"aboutAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("aboutAct"));
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _btnlastgroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("btnlastgroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnlastgroup_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub btnLastGroup_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Try";
try {RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="job.Initialize(\"last_group\", Me)";
_job._initialize(null,processBA,"last_group",main.getObject());
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="query =\"http://www.aloosalam.ir/index.php/mobile";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="parameter  = \"pass=1266&type=group&sort=last\" &";
_parameter = "pass=1266&type=group&sort=last"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="job.PostString(query, parameter)";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e380) {
			processBA.setLastException(e380);RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("btnmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
mostCurrent._navi.OpenDrawer2(mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
public static String  _btnpanel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("btnpanel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnpanel_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub btnPanel_Click";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Msgbox(\"نام کاربری شما :\" & userInfo.Get(\"user_na";
anywheresoftware.b4a.keywords.Common.Msgbox("نام کاربری شما :"+BA.ObjectToString(_userinfo.Get((Object)("user_name")))+anywheresoftware.b4a.keywords.Common.CRLF+" رمز عبور اولیه شما "+BA.ObjectToString(_userinfo.Get((Object)("pass")))+" می باشد","رمز عبور",mostCurrent.activityBA);
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/")));
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="End Sub";
return "";
}
public static String  _buttonaddchannel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonaddchannel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonaddchannel_click", null);
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub ButtonAddChannel_Click";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="If (todayInsertCount >8 ) Then";
if ((_todayinsertcount>8)) { 
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از هشت گروه یا کانا";
anywheresoftware.b4a.keywords.Common.Msgbox("روزانه امکان ثبت بیش از هشت گروه یا کانال وجود ندارد. ","عدم دسترسی",mostCurrent.activityBA);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="selectedType = \"channel\"";
_selectedtype = "channel";
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="selectedTypeTitle = \"کانال\"";
_selectedtypetitle = "کانال";
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="StartActivity(\"insertAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("insertAct"));
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="End Sub";
return "";
}
public static String  _buttonaddgroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonaddgroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonaddgroup_click", null);
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub ButtonAddGroup_Click";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If (todayInsertCount >8 ) Then";
if ((_todayinsertcount>8)) { 
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از هشت گروه یا کانا";
anywheresoftware.b4a.keywords.Common.Msgbox("روزانه امکان ثبت بیش از هشت گروه یا کانال  وجود ندارد.این مورد برای جلوگیری از اسپم می باشد .  ","عدم دسترسی",mostCurrent.activityBA);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="isSuperGroup=False";
_issupergroup = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="selectedType = \"group\"";
_selectedtype = "group";
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="selectedTypeTitle = \"گروه \"";
_selectedtypetitle = "گروه ";
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="StartActivity(\"insertAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("insertAct"));
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="End Sub";
return "";
}
public static String  _buttonaddid_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonaddid_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonaddid_click", null);
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub ButtonAddId_Click";
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="selectedType = \"id\"";
_selectedtype = "id";
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="selectedTypeTitle = \"آی دی \"";
_selectedtypetitle = "آی دی ";
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="StartActivity(\"insertAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("insertAct"));
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="End Sub";
return "";
}
public static String  _buttonaddrobot_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonaddrobot_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonaddrobot_click", null);
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub ButtonAddRobot_Click";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="selectedType = \"robot\"";
_selectedtype = "robot";
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="selectedTypeTitle = \"ربات\"";
_selectedtypetitle = "ربات";
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="StartActivity(\"insertAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("insertAct"));
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="End Sub";
return "";
}
public static String  _buttonaddsticker_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonaddsticker_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonaddsticker_click", null);
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub ButtonAddSticker_Click";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="selectedType = \"sticker\"";
_selectedtype = "sticker";
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="selectedTypeTitle = \"استیکر\"";
_selectedtypetitle = "استیکر";
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="StartActivity(\"insertAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("insertAct"));
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="End Sub";
return "";
}
public static String  _buttoninsertsupergroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttoninsertsupergroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttoninsertsupergroup_click", null);
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub ButtonInsertSuperGroup_Click";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="If (vipInsertCount >4 ) Then";
if ((_vipinsertcount>4)) { 
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از چهار سوپر گروه و";
anywheresoftware.b4a.keywords.Common.Msgbox("روزانه امکان ثبت بیش از چهار سوپر گروه وجود ندارد. ","عدم دسترسی",mostCurrent.activityBA);
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="selectedType = \"group\"";
_selectedtype = "group";
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="selectedTypeTitle = \"سوپر گروه \"";
_selectedtypetitle = "سوپر گروه ";
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="isSuperGroup=True";
_issupergroup = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="StartActivity(\"insertAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("insertAct"));
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlastchannel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonlastchannel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonlastchannel_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub ButtonLastChannel_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Try";
try {RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="job.Initialize(\"last_channel\", Me)";
_job._initialize(null,processBA,"last_channel",main.getObject());
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="query =\"http://www.aloosalam.ir/index.php/mobile";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="parameter=\"pass=1266&type=channel&sort=last\"  &";
_parameter = "pass=1266&type=channel&sort=last"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="job.PostString(query,parameter)";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e500) {
			processBA.setLastException(e500);RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlastgroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonlastgroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonlastgroup_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub ButtonLastGroup_Click";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Try";
try {RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="job.Initialize(\"last_group\", Me)";
_job._initialize(null,processBA,"last_group",main.getObject());
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="parameter=\"pass=1266&type=group&sort=last\" & \"&u";
_parameter = "pass=1266&type=group&sort=last"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e633) {
			processBA.setLastException(e633);RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlastid_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonlastid_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonlastid_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub ButtonLastId_Click";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Try";
try {RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="job.Initialize(\"last_id\", Me)";
_job._initialize(null,processBA,"last_id",main.getObject());
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="parameter=\"pass=1266&type=id&sort=last\" & \"&user";
_parameter = "pass=1266&type=id&sort=last"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e591) {
			processBA.setLastException(e591);RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlastrobot_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonlastrobot_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonlastrobot_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub ButtonLastRobot_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Try";
try {RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="job.Initialize(\"last_robot\", Me)";
_job._initialize(null,processBA,"last_robot",main.getObject());
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="parameter=\"pass=1266&type=robot&sort=last\" & \"&u";
_parameter = "pass=1266&type=robot&sort=last"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="job.PostString(query, parameter)";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e540) {
			processBA.setLastException(e540);RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlaststicker_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonlaststicker_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonlaststicker_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub ButtonLastSticker_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Try";
try {RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="job.Initialize(\"last_sticker\", Me)";
_job._initialize(null,processBA,"last_sticker",main.getObject());
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="parameter  =\"pass=1266&type=sticker&sort=last\" &";
_parameter = "pass=1266&type=sticker&sort=last"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="job.PostString(query,parameter)";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e444) {
			processBA.setLastException(e444);RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmenu_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonmenu_click", null);
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub ButtonMenu_Click";
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmychannel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonmychannel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonmychannel_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub ButtonMyChannel_Click";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Try";
try {RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="isEdit =True";
_isedit = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="job.Initialize(\"my_channel\", Me)";
_job._initialize(null,processBA,"my_channel",main.getObject());
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="parameter=\"pass=1266&type=channel&sort=my\" & \"&u";
_parameter = "pass=1266&type=channel&sort=my"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e755) {
			processBA.setLastException(e755);RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3801101;
 //BA.debugLineNum = 3801101;BA.debugLine="End Sub";
return "";
}
public static String  _buttonmygroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonmygroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonmygroup_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub ButtonMyGroup_Click";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Try";
try {RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="isEdit =True";
_isedit = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="job.Initialize(\"my_group\", Me)";
_job._initialize(null,processBA,"my_group",main.getObject());
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="parameter=\"pass=1266&type=group&sort=my\" & \"&use";
_parameter = "pass=1266&type=group&sort=my"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e730) {
			processBA.setLastException(e730);RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsearchchannel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonsearchchannel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonsearchchannel_click", null);
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub ButtonSearchChannel_Click";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="selectedType = \"channel\"";
_selectedtype = "channel";
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="selectedTypeTitle = \"کانال\"";
_selectedtypetitle = "کانال";
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="StartActivity(\"searchAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("searchAct"));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsearchgroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonsearchgroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonsearchgroup_click", null);
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub ButtonSearchGroup_Click";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="selectedType = \"group\"";
_selectedtype = "group";
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="selectedTypeTitle = \"گروه \"";
_selectedtypetitle = "گروه ";
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="StartActivity(\"searchAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("searchAct"));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsearchid_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonsearchid_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonsearchid_click", null);
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub ButtonSearchId_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="selectedType = \"id\"";
_selectedtype = "id";
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="selectedTypeTitle = \"آی دی \"";
_selectedtypetitle = "آی دی ";
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="StartActivity(\"searchAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("searchAct"));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsearchrobot_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonsearchrobot_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonsearchrobot_click", null);
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub ButtonSearchRobot_Click";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="selectedType = \"robot\"";
_selectedtype = "robot";
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="selectedTypeTitle = \"ربات\"";
_selectedtypetitle = "ربات";
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="StartActivity(\"searchAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("searchAct"));
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsearchsticker_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonsearchsticker_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonsearchsticker_click", null);
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub ButtonSearchSticker_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="selectedType = \"sticker\"";
_selectedtype = "sticker";
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="selectedTypeTitle = \"استیکر\"";
_selectedtypetitle = "استیکر";
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="StartActivity(\"searchAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("searchAct"));
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="End Sub";
return "";
}
public static String  _buttonsupergroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonsupergroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonsupergroup_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub ButtonSuperGroup_Click";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Try";
try {RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="job.Initialize(\"super_group\", Me)";
_job._initialize(null,processBA,"super_group",main.getObject());
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="parameter=\"pass=1266&type=group&sort=super\" & \"&";
_parameter = "pass=1266&type=group&sort=super"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e704) {
			processBA.setLastException(e704);RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="End Sub";
return "";
}
public static String  _buttontopchannellike_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontopchannellike_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontopchannellike_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub ButtonTopChannelLike_Click";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Try";
try {RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="job.Initialize(\"topJoin_channel\", Me)";
_job._initialize(null,processBA,"topJoin_channel",main.getObject());
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="parameter=\"pass=1266&type=channel&sort=topJoin\"";
_parameter = "pass=1266&type=channel&sort=topJoin"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="job.PostString(query, parameter)";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e785) {
			processBA.setLastException(e785);RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="End Sub";
return "";
}
public static String  _buttontopchannelview_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontopchannelview_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontopchannelview_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub ButtonTopChannelView_Click";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Try";
try {RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="job.Initialize(\"topView_channel\", Me)";
_job._initialize(null,processBA,"topView_channel",main.getObject());
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="parameter=\"pass=1266&Type=channel&sort=topView\"";
_parameter = "pass=1266&Type=channel&sort=topView"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="job.PostString(query,parameter)";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e772) {
			processBA.setLastException(e772);RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="End Sub";
return "";
}
public static String  _buttontopgroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontopgroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontopgroup_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub ButtonTopGroup_Click";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Try";
try {RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="job.Initialize(\"topView_group\", Me)";
_job._initialize(null,processBA,"topView_group",main.getObject());
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="parameter=\"pass=1266&type=group&sort=topView\" &";
_parameter = "pass=1266&type=group&sort=topView"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e646) {
			processBA.setLastException(e646);RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="End Sub";
return "";
}
public static String  _buttontopid_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontopid_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontopid_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub ButtonTopId_Click";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Try";
try {RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="job.Initialize(\"topView_id\", Me)";
_job._initialize(null,processBA,"topView_id",main.getObject());
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobi";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="parameter=\"pass=1266&type=id&sort=topView\" & \"&";
_parameter = "pass=1266&type=id&sort=topView"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e604) {
			processBA.setLastException(e604);RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="End Sub";
return "";
}
public static String  _buttontopjoingroup_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontopjoingroup_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontopjoingroup_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub ButtonTopJoinGroup_Click";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Try";
try {RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="job.Initialize(\"topMember_channel\", Me)";
_job._initialize(null,processBA,"topMember_channel",main.getObject());
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="parameter=\"pass=1266&type=group&sort=topJoin\" &";
_parameter = "pass=1266&type=group&sort=topJoin"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e513) {
			processBA.setLastException(e513);RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="End Sub";
return "";
}
public static String  _buttontopjoinrobot_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontopjoinrobot_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontopjoinrobot_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub ButtonTopJoinRobot_Click";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Try";
try {RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="job.Initialize(\"topJoin_group\", Me)";
_job._initialize(null,processBA,"topJoin_group",main.getObject());
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="parameter=\"pass=1266&type=group&sort=topJoin\" &";
_parameter = "pass=1266&type=group&sort=topJoin"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="job.PostString(query,parameter)";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e566) {
			processBA.setLastException(e566);RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="End Sub";
return "";
}
public static String  _buttontopjoinsticker_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontopjoinsticker_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontopjoinsticker_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub ButtonTopJoinSticker_Click";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Try";
try {RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="job.Initialize(\"topJoin_sticker\", Me)";
_job._initialize(null,processBA,"topJoin_sticker",main.getObject());
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="query =\"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="parameter=\"pass=1266&type=sticker&sort=topJoin\"";
_parameter = "pass=1266&type=sticker&sort=topJoin"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="job.PostString(query, parameter)";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e470) {
			processBA.setLastException(e470);RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="End Sub";
return "";
}
public static String  _buttontoprobot_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontoprobot_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontoprobot_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub ButtonTopRobot_Click";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Try";
try {RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="job.Initialize(\"topView_robot\", Me)";
_job._initialize(null,processBA,"topView_robot",main.getObject());
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="parameter=\"pass=1266&type=robot&sort=topView\" &";
_parameter = "pass=1266&type=robot&sort=topView"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e553) {
			processBA.setLastException(e553);RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="End Sub";
return "";
}
public static String  _buttontopsticker_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttontopsticker_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttontopsticker_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub ButtonTopSticker_Click";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Try";
try {RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="job.Initialize(\"topView_sticker\", Me)";
_job._initialize(null,processBA,"topView_sticker",main.getObject());
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="parameter=\"pass=1266&type=sticker&sort=topView\"";
_parameter = "pass=1266&type=sticker&sort=topView"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e457) {
			processBA.setLastException(e457);RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="End Sub";
return "";
}
public static String  _buttonvipchannel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("buttonvipchannel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonvipchannel_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub ButtonVIPChannel_Click";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Try";
try {RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="job.Initialize(\"vip_channel\", Me)";
_job._initialize(null,processBA,"vip_channel",main.getObject());
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
_query = "http://www.aloosalam.ir/index.php/mobile/index/search";
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="parameter=\"pass=1266&type=channel&sort=vip\" & \"&";
_parameter = "pass=1266&type=channel&sort=vip"+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number")));
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="job.PostString(query,parameter )";
_job._poststring(null,_query,_parameter);
 } 
       catch (Exception e717) {
			processBA.setLastException(e717);RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="End Sub";
return "";
}
public static String  _channel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("channel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "channel_click", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Channel_Click";
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="PanelGroup.Visible=False";
mostCurrent._panelgroup.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="PanelChannel.Visible= True";
mostCurrent._panelchannel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="PanelSticker.Visible=False";
mostCurrent._panelsticker.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Group.Color = Colors.RGB(30,136,229)";
mostCurrent._group.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Sticker.Color = Colors.RGB(30,136,229)";
mostCurrent._sticker.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="Group.TextColor= Colors.RGB(207,216,220)";
mostCurrent._group.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="Sticker.TextColor = Colors.RGB(207,216,220)";
mostCurrent._sticker.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="Channel.Color = Colors.White";
mostCurrent._channel.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Channel.TextColor= Colors.rgb(96,125,139)";
mostCurrent._channel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (96),(int) (125),(int) (139)));
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="End Sub";
return "";
}
public static String  _writeinfo() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("writeinfo"))
	return (String) Debug.delegate(mostCurrent.activityBA, "writeinfo", null);
String _updatequery = "";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub writeInfo";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If(userInfo.IsInitialized =False) Then";
if ((_userinfo.IsInitialized()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="userInfo.Initialize";
_userinfo.Initialize();
 };
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="userInfo.Put(\"sdk\",phone.SdkVersion)";
_userinfo.Put((Object)("sdk"),(Object)(_phone.getSdkVersion()));
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="userInfo.Put(\"model\",phone.Manufacturer & \",\"& ph";
_userinfo.Put((Object)("model"),(Object)(_phone.getManufacturer()+","+_phone.getProduct()));
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="userInfo.Put(\"phoneid\",phoneId.GetDeviceId)";
_userinfo.Put((Object)("phoneid"),(Object)(_phoneid.GetDeviceId()));
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="userInfo.Put(\"to_day_insert_advance\",vipInsertCou";
_userinfo.Put((Object)("to_day_insert_advance"),(Object)(_vipinsertcount));
RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="userInfo.Put(\"to_day_insert\",todayInsertCount)";
_userinfo.Put((Object)("to_day_insert"),(Object)(_todayinsertcount));
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Dim updateQuery As String  = \"update  info set \"";
_updatequery = "update  info set "+"name  ='"+BA.ObjectToString(_userinfo.Get((Object)("name")))+"',"+"phone	 ='"+BA.ObjectToString(_userinfo.Get((Object)("phone")))+"',"+"user_id	 ="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+","+"pass	 ='"+BA.ObjectToString(_userinfo.Get((Object)("pass")))+"',"+"user_name	 ='"+BA.ObjectToString(_userinfo.Get((Object)("user_name")))+"',"+"sdk	 ='"+BA.ObjectToString(_userinfo.Get((Object)("sdk")))+"',"+"model	 ='"+BA.ObjectToString(_userinfo.Get((Object)("model")))+"',"+"line_number	 ='"+BA.ObjectToString(_userinfo.Get((Object)("line_number")))+"',"+"phoneid	 ='"+BA.ObjectToString(_userinfo.Get((Object)("phoneid")))+"',"+"is_advance	 ='"+BA.ObjectToString(_userinfo.Get((Object)("is_advance")))+"',"+"is_premium	 ='"+BA.ObjectToString(_userinfo.Get((Object)("is_premium")))+"',"+"advance_count	 ="+BA.ObjectToString(_userinfo.Get((Object)("advance_count")))+","+"advance_expier_date	 ='"+BA.ObjectToString(_userinfo.Get((Object)("advance_expier_date")))+"',"+"to_day_date	 ='"+BA.ObjectToString(_userinfo.Get((Object)("to_day_date")))+"',"+"to_day_insert	 ="+BA.ObjectToString(_userinfo.Get((Object)("to_day_insert")))+","+"to_day_insert_advance	 ="+BA.ObjectToString(_userinfo.Get((Object)("to_day_insert_advance")));
RDebugUtils.currentLine=852010;
 //BA.debugLineNum = 852010;BA.debugLine="DBUtils.ExecuteMemoryTable(SQL1,  updateQuery , N";
mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,_sql1,_updatequery,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=852012;
 //BA.debugLineNum = 852012;BA.debugLine="End Sub";
return "";
}
public static String  _editsearch_enterpressed() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("editsearch_enterpressed"))
	return (String) Debug.delegate(mostCurrent.activityBA, "editsearch_enterpressed", null);
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub EditSearch_EnterPressed";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Search_Click";
_search_click();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public static String  _search_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("search_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "search_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Search_Click";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="isEdit =False";
_isedit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If EditSearch.Text.Length <2 Then";
if (mostCurrent._editsearch.getText().length()<2) { 
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Try";
try {RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="job.Initialize(\"search_all\", Me)";
_job._initialize(null,processBA,"search_all",main.getObject());
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/search","pass=1266"+"&type=all"+"&q="+mostCurrent._editsearch.getText()+"&user="+BA.ObjectToString(_userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(_userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e688) {
			processBA.setLastException(e688);RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="End Sub";
return "";
}
public static String  _group_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("group_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "group_click", null);
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Group_Click";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="PanelGroup.Visible= True";
mostCurrent._panelgroup.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="PanelChannel.Visible=False";
mostCurrent._panelchannel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="PanelSticker.Visible=False";
mostCurrent._panelsticker.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Channel.Color=Colors.RGB(30,136,229)";
mostCurrent._channel.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Sticker.Color= Colors.RGB(30,136,229)";
mostCurrent._sticker.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Channel.TextColor=Colors.RGB(207,216,220)";
mostCurrent._channel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Sticker.TextColor = Colors.RGB(207,216,220)";
mostCurrent._sticker.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="Group.Color = Colors.White";
mostCurrent._group.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="Group.TextColor= Colors.rgb(96,125,139)";
mostCurrent._group.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (96),(int) (125),(int) (139)));
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="End Sub";
return "";
}
public static String  _id_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("id_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "id_click", null);
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub ID_Click";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="PanelGroup.Visible=False";
mostCurrent._panelgroup.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="PanelChannel.Visible=False";
mostCurrent._panelchannel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="PanelSticker.Visible=False";
mostCurrent._panelsticker.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Channel.Color=Colors.RGB(30,136,229)";
mostCurrent._channel.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Group.Color = Colors.RGB(30,136,229)";
mostCurrent._group.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Sticker.Color = Colors.RGB(30,136,229)";
mostCurrent._sticker.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="Channel.TextColor=Colors.RGB(207,216,220)";
mostCurrent._channel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="Group.TextColor= Colors.RGB(207,216,220)";
mostCurrent._group.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="Sticker.TextColor = Colors.RGB(207,216,220)";
mostCurrent._sticker.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(Telegram.Search.httpjob _job) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _countries = null;
anywheresoftware.b4a.objects.collections.List _rows = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="searchResult.Initialize()";
_searchresult.Initialize();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="searchResult.Clear()";
_searchresult.Clear();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Try";
try {RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="res = Job.GetString";
_res = _job._getstring(null);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="If 	Job.JobName= \"topJoin_group\" Or  _ 				Job.";
if ((_job._jobname).equals("topJoin_group") || (_job._jobname).equals("last_group") || (_job._jobname).equals("topView_group") || (_job._jobname).equals("topJoin_id") || (_job._jobname).equals("last_id") || (_job._jobname).equals("topView_id") || (_job._jobname).equals("topJoin_sticker") || (_job._jobname).equals("last_sticker") || (_job._jobname).equals("topView_sticker") || (_job._jobname).equals("topJoin_robot") || (_job._jobname).equals("last_robot") || (_job._jobname).equals("topView_robot") || (_job._jobname).equals("topJoin_channel") || (_job._jobname).equals("last_channel") || (_job._jobname).equals("topView_channel") || (_job._jobname).equals("topMember_channel") || (_job._jobname).equals("my_channel") || (_job._jobname).equals("my_group") || (_job._jobname).equals("super_group") || (_job._jobname).equals("vip_channel") || (_job._jobname).equals("order_sticker") || (_job._jobname).equals("search_all")) { 
RDebugUtils.currentLine=1441827;
 //BA.debugLineNum = 1441827;BA.debugLine="Dim COUNTRIES As List";
_countries = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1441828;
 //BA.debugLineNum = 1441828;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list";
_countries = _parser.NextArray();
RDebugUtils.currentLine=1441830;
 //BA.debugLineNum = 1441830;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1441831;
 //BA.debugLineNum = 1441831;BA.debugLine="rows= COUNTRIES.Get(0)";
_rows.setObject((java.util.List)(_countries.Get((int) (0))));
RDebugUtils.currentLine=1441833;
 //BA.debugLineNum = 1441833;BA.debugLine="If(rows.Size > 0 ) Then";
if ((_rows.getSize()>0)) { 
RDebugUtils.currentLine=1441835;
 //BA.debugLineNum = 1441835;BA.debugLine="For i= 0 To rows.Size-1";
{
final int step16 = 1;
final int limit16 = (int) (_rows.getSize()-1);
for (_i = (int) (0) ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
RDebugUtils.currentLine=1441836;
 //BA.debugLineNum = 1441836;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1441838;
 //BA.debugLineNum = 1441838;BA.debugLine="row.Initialize()";
_row.Initialize();
RDebugUtils.currentLine=1441839;
 //BA.debugLineNum = 1441839;BA.debugLine="row=rows.Get(i)";
_row.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rows.Get(_i)));
RDebugUtils.currentLine=1441840;
 //BA.debugLineNum = 1441840;BA.debugLine="searchResult.Add(row)";
_searchresult.Add((Object)(_row.getObject()));
 }
};
RDebugUtils.currentLine=1441843;
 //BA.debugLineNum = 1441843;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=1441844;
 //BA.debugLineNum = 1441844;BA.debugLine="StartActivity(\"searchResultAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("searchResultAct"));
 }else {
RDebugUtils.currentLine=1441846;
 //BA.debugLineNum = 1441846;BA.debugLine="If(Job.JobName=\"my_channel\" Or _ 							Job.";
if (((_job._jobname).equals("my_channel") || (_job._jobname).equals("my_group"))) { 
RDebugUtils.currentLine=1441848;
 //BA.debugLineNum = 1441848;BA.debugLine="Msgbox(\"شما هنوز موردی ثبت نکرده اید. از دک";
anywheresoftware.b4a.keywords.Common.Msgbox("شما هنوز موردی ثبت نکرده اید. از دکمه ثبت گروه یا ثبت کانال استفاده کنید.","ثبت مورد",mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=1441850;
 //BA.debugLineNum = 1441850;BA.debugLine="Msgbox(\"موردی با مشخصات درخواستی شما یافت ن";
anywheresoftware.b4a.keywords.Common.Msgbox("موردی با مشخصات درخواستی شما یافت نشد . از بخش آخرین "+_selectedtypetitle+"ها هم می توانید "+_selectedtypetitle+" مورد نظر خود را پیدا کنید  . ","جستجو",mostCurrent.activityBA);
 };
 };
 };
 }else {
RDebugUtils.currentLine=1441856;
 //BA.debugLineNum = 1441856;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .",anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e419) {
			processBA.setLastException(e419);RDebugUtils.currentLine=1441859;
 //BA.debugLineNum = 1441859;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات جستجو  \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات جستجو  ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=1441862;
 //BA.debugLineNum = 1441862;BA.debugLine="End Sub";
return "";
}
public static String  _loadmenu() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("loadmenu"))
	return (String) Debug.delegate(mostCurrent.activityBA, "loadmenu", null);
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub loadMenu";
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="End Sub";
return "";
}
public static String  _menuabout_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("menuabout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuabout_click", null);
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub MenuAbout_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="StartActivity(\"AboutAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("AboutAct"));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="End Sub";
return "";
}
public static String  _menucontact_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("menucontact_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menucontact_click", null);
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub MenuContact_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="StartActivity(\"contactAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("contactAct"));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="End Sub";
return "";
}
public static String  _menuexit_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("menuexit_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuexit_click", null);
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub MenuExit_Click";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="End Sub";
return "";
}
public static String  _menuhelp_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("menuhelp_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuhelp_click", null);
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub MenuHelp_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="StartActivity(\"helpAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("helpAct"));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="End Sub";
return "";
}
public static String  _menuorder_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("menuorder_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuorder_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub MenuOrder_Click";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/index/1")));
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="End Sub";
return "";
}
public static String  _panelid_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("panelid_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "panelid_click", null);
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub PanelID_Click";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
public static String  _panelrobot_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("panelrobot_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "panelrobot_click", null);
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub PanelRobot_Click";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return "";
}
public static String  _robot_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("robot_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "robot_click", null);
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Robot_Click";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="PanelChannel.Visible = False";
mostCurrent._panelchannel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="PanelGroup.Visible=False";
mostCurrent._panelgroup.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="PanelSticker.Visible = False";
mostCurrent._panelsticker.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Channel.Color=Colors.RGB(30,136,229)";
mostCurrent._channel.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="Group.Color = Colors.RGB(30,136,229)";
mostCurrent._group.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="Sticker.Color = Colors.RGB(30,136,229)";
mostCurrent._sticker.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="Channel.TextColor=Colors.RGB(207,216,220)";
mostCurrent._channel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="Group.TextColor= Colors.RGB(207,216,220)";
mostCurrent._group.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Sticker.TextColor = Colors.RGB(207,216,220)";
mostCurrent._sticker.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="End Sub";
return "";
}
public static String  _sticker_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate("sticker_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "sticker_click", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Sticker_Click";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="PanelGroup.Visible=False";
mostCurrent._panelgroup.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="PanelChannel.Visible=False";
mostCurrent._panelchannel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="PanelSticker.Visible=True";
mostCurrent._panelsticker.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Channel.Color=Colors.RGB(30,136,229)";
mostCurrent._channel.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Group.Color = Colors.RGB(30,136,229)";
mostCurrent._group.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (30),(int) (136),(int) (229)));
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Channel.TextColor=Colors.RGB(207,216,220)";
mostCurrent._channel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Group.TextColor= Colors.RGB(207,216,220)";
mostCurrent._group.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (207),(int) (216),(int) (220)));
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="Sticker.Color=  Colors.White";
mostCurrent._sticker.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="Sticker.TextColor= Colors.rgb(96,125,139)";
mostCurrent._sticker.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (96),(int) (125),(int) (139)));
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="End Sub";
return "";
}
}