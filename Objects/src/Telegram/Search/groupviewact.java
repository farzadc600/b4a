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

public class groupviewact extends Activity implements B4AActivity{
	public static groupviewact mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Telegram.Search", "Telegram.Search.groupviewact");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (groupviewact).");
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
		activityBA = new BA(this, layout, processBA, "Telegram.Search", "Telegram.Search.groupviewact");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Telegram.Search.groupviewact", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (groupviewact) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (groupviewact) Resume **");
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
		return groupviewact.class;
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
        BA.LogInfo("** Activity (groupviewact) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (groupviewact) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnjoin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbrokelink = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenu = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldesc = null;
public static int _itemtype = 0;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagepreivew = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagebackground = null;
public de.amberhome.navdrawer.NavigationDrawer _navi = null;
public anywheresoftware.b4a.objects.PanelWrapper _pcantent = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncopy = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextcomment = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewcomment = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelinsertdate = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelshahr = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelostan = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelmember = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeladmin = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltag = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeladdress = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelname = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellike = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcat = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelallert = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonminus = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelliketitle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btninstagram = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageviewall = null;
public Telegram.Search.main _main = null;
public Telegram.Search.httputils2service _httputils2service = null;
public Telegram.Search.aboutact _aboutact = null;
public Telegram.Search.searchresultact _searchresultact = null;
public Telegram.Search.dbutils _dbutils = null;
public Telegram.Search.helpact _helpact = null;
public Telegram.Search.contactact _contactact = null;
public Telegram.Search.insertact _insertact = null;
public Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public Telegram.Search.searchact _searchact = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
String _txt = "";
String _shahr = "";
String _ostan = "";
String _category = "";
Telegram.Search.httpjob _job1 = null;
anywheresoftware.b4a.objects.collections.List _result = null;
Object _row = null;
String[] _column = null;
String _desc = "";
int _iconpic = 0;
int _vip = 0;
int _super = 0;
int _comment = 0;
int _id = 0;
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
mostCurrent._navi.Initialize2(mostCurrent.activityBA,"navi",(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._activity.getObject())),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
mostCurrent._navi.getNavigationPanel().LoadLayout("menu",mostCurrent.activityBA);
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="pCantent.Initialize(\"\")";
mostCurrent._pcantent.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
mostCurrent._navi.getContentPanel().AddView((android.view.View)(mostCurrent._pcantent.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="pCantent.SendToBack";
mostCurrent._pcantent.SendToBack();
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="pCantent.LoadLayout(\"groupview\")";
mostCurrent._pcantent.LoadLayout("groupview",mostCurrent.activityBA);
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="Label5.Text=Main.selected_item.Get(\"title\")";
mostCurrent._label5.setText(mostCurrent._main._selected_item.Get((Object)("title")));
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="Activity.Title=\"نمایش اطلاعات\"";
mostCurrent._activity.setTitle((Object)("نمایش اطلاعات"));
RDebugUtils.currentLine=11337745;
 //BA.debugLineNum = 11337745;BA.debugLine="Panel1.Width = Activity.Width";
mostCurrent._panel1.setWidth(mostCurrent._activity.getWidth());
RDebugUtils.currentLine=11337746;
 //BA.debugLineNum = 11337746;BA.debugLine="Panel1.Height=Activity.Height";
mostCurrent._panel1.setHeight(mostCurrent._activity.getHeight());
RDebugUtils.currentLine=11337748;
 //BA.debugLineNum = 11337748;BA.debugLine="Panel2.Color =Colors.rgb(236,239,241)";
mostCurrent._panel2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (236),(int) (239),(int) (241)));
RDebugUtils.currentLine=11337749;
 //BA.debugLineNum = 11337749;BA.debugLine="Panel2.RemoveView";
mostCurrent._panel2.RemoveView();
RDebugUtils.currentLine=11337750;
 //BA.debugLineNum = 11337750;BA.debugLine="ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width";
mostCurrent._scrollview1.getPanel().AddView((android.view.View)(mostCurrent._panel2.getObject()),(int) (0),(int) (0),mostCurrent._panel2.getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (810)));
RDebugUtils.currentLine=11337751;
 //BA.debugLineNum = 11337751;BA.debugLine="ScrollView1.Panel.Height = 820dip";
mostCurrent._scrollview1.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (820)));
RDebugUtils.currentLine=11337753;
 //BA.debugLineNum = 11337753;BA.debugLine="LabelDesc.TextSize= 15";
mostCurrent._labeldesc.setTextSize((float) (15));
RDebugUtils.currentLine=11337754;
 //BA.debugLineNum = 11337754;BA.debugLine="LabelDesc.Gravity= Gravity.CENTER";
mostCurrent._labeldesc.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=11337755;
 //BA.debugLineNum = 11337755;BA.debugLine="LabelDesc.Typeface=Main.font";
mostCurrent._labeldesc.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337756;
 //BA.debugLineNum = 11337756;BA.debugLine="LabelDesc.TextColor=Colors.Black";
mostCurrent._labeldesc.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337757;
 //BA.debugLineNum = 11337757;BA.debugLine="LabelDesc.Color=Colors.RGB(179,229,252)";
mostCurrent._labeldesc.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337759;
 //BA.debugLineNum = 11337759;BA.debugLine="LabelAddress.TextSize= 15";
mostCurrent._labeladdress.setTextSize((float) (15));
RDebugUtils.currentLine=11337760;
 //BA.debugLineNum = 11337760;BA.debugLine="LabelAddress.Gravity= Bit.Or(Gravity.CENTER_VERTI";
mostCurrent._labeladdress.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337761;
 //BA.debugLineNum = 11337761;BA.debugLine="LabelAddress.Typeface=Main.font";
mostCurrent._labeladdress.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337762;
 //BA.debugLineNum = 11337762;BA.debugLine="LabelAddress.TextColor=Colors.Black";
mostCurrent._labeladdress.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337763;
 //BA.debugLineNum = 11337763;BA.debugLine="LabelAddress.Color=Colors.RGB(179,229,252)";
mostCurrent._labeladdress.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337765;
 //BA.debugLineNum = 11337765;BA.debugLine="LabelLikeTitle.TextSize= 15";
mostCurrent._labelliketitle.setTextSize((float) (15));
RDebugUtils.currentLine=11337766;
 //BA.debugLineNum = 11337766;BA.debugLine="LabelLikeTitle.Gravity= Bit.Or(Gravity.CENTER_VER";
mostCurrent._labelliketitle.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337767;
 //BA.debugLineNum = 11337767;BA.debugLine="LabelLikeTitle.Typeface=Main.font";
mostCurrent._labelliketitle.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337768;
 //BA.debugLineNum = 11337768;BA.debugLine="LabelLikeTitle.TextColor=Colors.Black";
mostCurrent._labelliketitle.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337769;
 //BA.debugLineNum = 11337769;BA.debugLine="LabelLikeTitle.Color=Colors.RGB(179,229,252)";
mostCurrent._labelliketitle.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337771;
 //BA.debugLineNum = 11337771;BA.debugLine="LabelInsertDate.TextSize= 15";
mostCurrent._labelinsertdate.setTextSize((float) (15));
RDebugUtils.currentLine=11337772;
 //BA.debugLineNum = 11337772;BA.debugLine="LabelInsertDate.Gravity= Bit.Or(Gravity.CENTER_VE";
mostCurrent._labelinsertdate.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337773;
 //BA.debugLineNum = 11337773;BA.debugLine="LabelInsertDate.Typeface=Main.font";
mostCurrent._labelinsertdate.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337774;
 //BA.debugLineNum = 11337774;BA.debugLine="LabelInsertDate.TextColor=Colors.Black";
mostCurrent._labelinsertdate.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337775;
 //BA.debugLineNum = 11337775;BA.debugLine="LabelInsertDate.Color=Colors.RGB(179,229,252)";
mostCurrent._labelinsertdate.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337777;
 //BA.debugLineNum = 11337777;BA.debugLine="LabelShahr.TextSize= 15";
mostCurrent._labelshahr.setTextSize((float) (15));
RDebugUtils.currentLine=11337778;
 //BA.debugLineNum = 11337778;BA.debugLine="LabelShahr.Gravity= Bit.Or(Gravity.CENTER_VERTICA";
mostCurrent._labelshahr.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337779;
 //BA.debugLineNum = 11337779;BA.debugLine="LabelShahr.Typeface=Main.font";
mostCurrent._labelshahr.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337780;
 //BA.debugLineNum = 11337780;BA.debugLine="LabelShahr.TextColor=Colors.Black";
mostCurrent._labelshahr.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337781;
 //BA.debugLineNum = 11337781;BA.debugLine="LabelShahr.Color=Colors.RGB(179,229,252)";
mostCurrent._labelshahr.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337783;
 //BA.debugLineNum = 11337783;BA.debugLine="LabelOstan.TextSize= 15";
mostCurrent._labelostan.setTextSize((float) (15));
RDebugUtils.currentLine=11337784;
 //BA.debugLineNum = 11337784;BA.debugLine="LabelOstan.Gravity= Bit.Or(Gravity.CENTER_VERTICA";
mostCurrent._labelostan.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337785;
 //BA.debugLineNum = 11337785;BA.debugLine="LabelOstan.Typeface=Main.font";
mostCurrent._labelostan.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337786;
 //BA.debugLineNum = 11337786;BA.debugLine="LabelOstan.TextColor=Colors.Black";
mostCurrent._labelostan.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337787;
 //BA.debugLineNum = 11337787;BA.debugLine="LabelOstan.Color=Colors.RGB(179,229,252)";
mostCurrent._labelostan.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337789;
 //BA.debugLineNum = 11337789;BA.debugLine="LabelMember.TextSize= 15";
mostCurrent._labelmember.setTextSize((float) (15));
RDebugUtils.currentLine=11337790;
 //BA.debugLineNum = 11337790;BA.debugLine="LabelMember.Gravity= Bit.Or(Gravity.CENTER_VERTIC";
mostCurrent._labelmember.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337791;
 //BA.debugLineNum = 11337791;BA.debugLine="LabelMember.Typeface=Main.font";
mostCurrent._labelmember.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337792;
 //BA.debugLineNum = 11337792;BA.debugLine="LabelMember.TextColor=Colors.Black";
mostCurrent._labelmember.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337793;
 //BA.debugLineNum = 11337793;BA.debugLine="LabelMember.Color=Colors.RGB(179,229,252)";
mostCurrent._labelmember.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337795;
 //BA.debugLineNum = 11337795;BA.debugLine="LabelAdmin.TextSize= 15";
mostCurrent._labeladmin.setTextSize((float) (15));
RDebugUtils.currentLine=11337796;
 //BA.debugLineNum = 11337796;BA.debugLine="LabelAdmin.Gravity= Bit.Or(Gravity.CENTER_VERTICA";
mostCurrent._labeladmin.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337797;
 //BA.debugLineNum = 11337797;BA.debugLine="LabelAdmin.Typeface=Main.font";
mostCurrent._labeladmin.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337798;
 //BA.debugLineNum = 11337798;BA.debugLine="LabelAdmin.TextColor=Colors.Black";
mostCurrent._labeladmin.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337799;
 //BA.debugLineNum = 11337799;BA.debugLine="LabelAdmin.Color=Colors.RGB(179,229,252)";
mostCurrent._labeladmin.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337801;
 //BA.debugLineNum = 11337801;BA.debugLine="LabelTag.TextSize= 15";
mostCurrent._labeltag.setTextSize((float) (15));
RDebugUtils.currentLine=11337802;
 //BA.debugLineNum = 11337802;BA.debugLine="LabelTag.Gravity= Bit.Or(Gravity.CENTER_VERTICAL,";
mostCurrent._labeltag.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337803;
 //BA.debugLineNum = 11337803;BA.debugLine="LabelTag.Typeface=Main.font";
mostCurrent._labeltag.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337804;
 //BA.debugLineNum = 11337804;BA.debugLine="LabelTag.TextColor=Colors.Black";
mostCurrent._labeltag.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337805;
 //BA.debugLineNum = 11337805;BA.debugLine="LabelTag.Color=Colors.RGB(179,229,252)";
mostCurrent._labeltag.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337807;
 //BA.debugLineNum = 11337807;BA.debugLine="LabelName.TextSize= 15";
mostCurrent._labelname.setTextSize((float) (15));
RDebugUtils.currentLine=11337808;
 //BA.debugLineNum = 11337808;BA.debugLine="LabelName.Gravity= Bit.Or(Gravity.CENTER_VERTICAL";
mostCurrent._labelname.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337809;
 //BA.debugLineNum = 11337809;BA.debugLine="LabelName.Typeface=Main.font";
mostCurrent._labelname.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337810;
 //BA.debugLineNum = 11337810;BA.debugLine="LabelName.TextColor=Colors.Black";
mostCurrent._labelname.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337811;
 //BA.debugLineNum = 11337811;BA.debugLine="LabelName.Color=Colors.RGB(179,229,252)";
mostCurrent._labelname.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337813;
 //BA.debugLineNum = 11337813;BA.debugLine="LabelLike.TextSize= 15";
mostCurrent._labellike.setTextSize((float) (15));
RDebugUtils.currentLine=11337814;
 //BA.debugLineNum = 11337814;BA.debugLine="LabelLike.Gravity= Bit.Or(Gravity.CENTER_VERTI";
mostCurrent._labellike.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337815;
 //BA.debugLineNum = 11337815;BA.debugLine="LabelLike.Typeface=Main.font";
mostCurrent._labellike.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337816;
 //BA.debugLineNum = 11337816;BA.debugLine="LabelLike.TextColor=Colors.Black";
mostCurrent._labellike.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337817;
 //BA.debugLineNum = 11337817;BA.debugLine="LabelLike.Color=Colors.RGB(179,229,252)";
mostCurrent._labellike.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337819;
 //BA.debugLineNum = 11337819;BA.debugLine="LabelCat.TextSize= 15";
mostCurrent._labelcat.setTextSize((float) (15));
RDebugUtils.currentLine=11337820;
 //BA.debugLineNum = 11337820;BA.debugLine="LabelCat.Gravity= Bit.Or(Gravity.CENTER_VERTICAL,";
mostCurrent._labelcat.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337821;
 //BA.debugLineNum = 11337821;BA.debugLine="LabelCat.Typeface=Main.font";
mostCurrent._labelcat.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337822;
 //BA.debugLineNum = 11337822;BA.debugLine="LabelCat.TextColor=Colors.Black";
mostCurrent._labelcat.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337823;
 //BA.debugLineNum = 11337823;BA.debugLine="LabelCat.Color=Colors.RGB(179,229,252)";
mostCurrent._labelcat.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337825;
 //BA.debugLineNum = 11337825;BA.debugLine="LabelAllert.TextSize= 15";
mostCurrent._labelallert.setTextSize((float) (15));
RDebugUtils.currentLine=11337826;
 //BA.debugLineNum = 11337826;BA.debugLine="LabelAllert.Gravity= Bit.Or(Gravity.CENTER_VERTIC";
mostCurrent._labelallert.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337827;
 //BA.debugLineNum = 11337827;BA.debugLine="LabelAllert.Typeface=Main.font";
mostCurrent._labelallert.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337828;
 //BA.debugLineNum = 11337828;BA.debugLine="LabelAllert.TextColor=Colors.Black";
mostCurrent._labelallert.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337829;
 //BA.debugLineNum = 11337829;BA.debugLine="LabelAllert.Color=Colors.RGB(179,229,252)";
mostCurrent._labelallert.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (252)));
RDebugUtils.currentLine=11337831;
 //BA.debugLineNum = 11337831;BA.debugLine="EditTextComment.TextSize= 15";
mostCurrent._edittextcomment.setTextSize((float) (15));
RDebugUtils.currentLine=11337832;
 //BA.debugLineNum = 11337832;BA.debugLine="EditTextComment.Gravity= Bit.Or(Gravity.CENTER_VE";
mostCurrent._edittextcomment.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL,anywheresoftware.b4a.keywords.Common.Gravity.RIGHT));
RDebugUtils.currentLine=11337833;
 //BA.debugLineNum = 11337833;BA.debugLine="EditTextComment.Typeface=Main.font";
mostCurrent._edittextcomment.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337834;
 //BA.debugLineNum = 11337834;BA.debugLine="EditTextComment.TextColor=Colors.Black";
mostCurrent._edittextcomment.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337835;
 //BA.debugLineNum = 11337835;BA.debugLine="EditTextComment.Color=Colors.RGB(229,229,242)";
mostCurrent._edittextcomment.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (229),(int) (229),(int) (242)));
RDebugUtils.currentLine=11337838;
 //BA.debugLineNum = 11337838;BA.debugLine="btnBrokeLink.Typeface=Main.font";
mostCurrent._btnbrokelink.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337840;
 //BA.debugLineNum = 11337840;BA.debugLine="btnJoin.TextSize= 15";
mostCurrent._btnjoin.setTextSize((float) (15));
RDebugUtils.currentLine=11337842;
 //BA.debugLineNum = 11337842;BA.debugLine="btnJoin.Typeface=Main.font";
mostCurrent._btnjoin.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337844;
 //BA.debugLineNum = 11337844;BA.debugLine="Dim txt As String";
_txt = "";
RDebugUtils.currentLine=11337845;
 //BA.debugLineNum = 11337845;BA.debugLine="Dim shahr As String";
_shahr = "";
RDebugUtils.currentLine=11337846;
 //BA.debugLineNum = 11337846;BA.debugLine="Dim ostan As String";
_ostan = "";
RDebugUtils.currentLine=11337847;
 //BA.debugLineNum = 11337847;BA.debugLine="Dim category As String";
_category = "";
RDebugUtils.currentLine=11337848;
 //BA.debugLineNum = 11337848;BA.debugLine="Dim job1 As HttpJob";
_job1 = new Telegram.Search.httpjob();
RDebugUtils.currentLine=11337850;
 //BA.debugLineNum = 11337850;BA.debugLine="itemType =  Main.selected_item.Get(\"telgroupTypeI";
_itemtype = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("telgroupTypeId"))));
RDebugUtils.currentLine=11337852;
 //BA.debugLineNum = 11337852;BA.debugLine="Try";
try {RDebugUtils.currentLine=11337853;
 //BA.debugLineNum = 11337853;BA.debugLine="If(itemType <> 4 And itemType <> 3) Then";
if ((_itemtype!=4 && _itemtype!=3)) { 
RDebugUtils.currentLine=11337854;
 //BA.debugLineNum = 11337854;BA.debugLine="If(Main.selected_item.Get(\"shahrId\") <> 0 )Then";
if (((mostCurrent._main._selected_item.Get((Object)("shahrId"))).equals((Object)(0)) == false)) { 
RDebugUtils.currentLine=11337855;
 //BA.debugLineNum = 11337855;BA.debugLine="txt = \"SELECT name  FROM \" & Main.DBTableName";
_txt = "SELECT name  FROM "+mostCurrent._main._dbtablename+" where id = "+BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("shahrId")));
RDebugUtils.currentLine=11337858;
 //BA.debugLineNum = 11337858;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11337859;
 //BA.debugLineNum = 11337859;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1,";
_result = mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,mostCurrent._main._sql1,_txt,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=11337861;
 //BA.debugLineNum = 11337861;BA.debugLine="If (result.Size > 0  )Then";
if ((_result.getSize()>0)) { 
RDebugUtils.currentLine=11337862;
 //BA.debugLineNum = 11337862;BA.debugLine="Dim row As Object";
_row = new Object();
RDebugUtils.currentLine=11337863;
 //BA.debugLineNum = 11337863;BA.debugLine="Dim column() As String";
_column = new String[(int) (0)];
java.util.Arrays.fill(_column,"");
RDebugUtils.currentLine=11337864;
 //BA.debugLineNum = 11337864;BA.debugLine="row = result.Get(0)";
_row = _result.Get((int) (0));
RDebugUtils.currentLine=11337865;
 //BA.debugLineNum = 11337865;BA.debugLine="column = row";
_column = (String[])(_row);
RDebugUtils.currentLine=11337866;
 //BA.debugLineNum = 11337866;BA.debugLine="shahr = column(0)";
_shahr = _column[(int) (0)];
 }else {
RDebugUtils.currentLine=11337868;
 //BA.debugLineNum = 11337868;BA.debugLine="shahr = \"همه شهر ها\"";
_shahr = "همه شهر ها";
 };
 }else {
RDebugUtils.currentLine=11337871;
 //BA.debugLineNum = 11337871;BA.debugLine="shahr = \"همه شهر ها\"";
_shahr = "همه شهر ها";
 };
RDebugUtils.currentLine=11337874;
 //BA.debugLineNum = 11337874;BA.debugLine="If(Main.selected_item.Get(\"ostanId\") <> 0 )Then";
if (((mostCurrent._main._selected_item.Get((Object)("ostanId"))).equals((Object)(0)) == false)) { 
RDebugUtils.currentLine=11337875;
 //BA.debugLineNum = 11337875;BA.debugLine="ostan = Main.ostan(Main.selected_item.Get(\"ost";
_ostan = mostCurrent._main._ostan[(int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("ostanId"))))];
 }else {
RDebugUtils.currentLine=11337877;
 //BA.debugLineNum = 11337877;BA.debugLine="ostan = \"همه استان ها\"";
_ostan = "همه استان ها";
 };
 };
RDebugUtils.currentLine=11337882;
 //BA.debugLineNum = 11337882;BA.debugLine="If( Main.selected_item.Get(\"telgroupCategoryId\")";
if (((mostCurrent._main._selected_item.Get((Object)("telgroupCategoryId"))).equals((Object)(0)) == false)) { 
RDebugUtils.currentLine=11337883;
 //BA.debugLineNum = 11337883;BA.debugLine="category = Main.cat(Main.selected_item.Get(\"tel";
_category = mostCurrent._main._cat[(int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("telgroupCategoryId"))))];
 }else {
RDebugUtils.currentLine=11337885;
 //BA.debugLineNum = 11337885;BA.debugLine="category =	\" همه دسته ها  \"";
_category = " همه دسته ها  ";
 };
RDebugUtils.currentLine=11337888;
 //BA.debugLineNum = 11337888;BA.debugLine="Dim desc As String";
_desc = "";
RDebugUtils.currentLine=11337889;
 //BA.debugLineNum = 11337889;BA.debugLine="desc=Main.selected_item.Get(\"description\")";
_desc = BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("description")));
RDebugUtils.currentLine=11337892;
 //BA.debugLineNum = 11337892;BA.debugLine="If (desc.Length > 100 )Then";
if ((_desc.length()>100)) { 
RDebugUtils.currentLine=11337893;
 //BA.debugLineNum = 11337893;BA.debugLine="LabelDesc.Text= desc.SubString2(0,100)";
mostCurrent._labeldesc.setText((Object)(_desc.substring((int) (0),(int) (100))));
 };
RDebugUtils.currentLine=11337898;
 //BA.debugLineNum = 11337898;BA.debugLine="ListViewComment.Clear()";
mostCurrent._listviewcomment.Clear();
RDebugUtils.currentLine=11337900;
 //BA.debugLineNum = 11337900;BA.debugLine="ListViewComment.TwoLinesLayout.ItemHeight =70dip";
mostCurrent._listviewcomment.getTwoLinesLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)));
RDebugUtils.currentLine=11337901;
 //BA.debugLineNum = 11337901;BA.debugLine="ListViewComment.TwoLinesLayout.Label.TextSize";
mostCurrent._listviewcomment.getTwoLinesLayout().Label.setTextSize((float) (14));
RDebugUtils.currentLine=11337902;
 //BA.debugLineNum = 11337902;BA.debugLine="ListViewComment.TwoLinesLayout.Label.TextColo";
mostCurrent._listviewcomment.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337903;
 //BA.debugLineNum = 11337903;BA.debugLine="ListViewComment.TwoLinesLayout.Label.Gravity";
mostCurrent._listviewcomment.getTwoLinesLayout().Label.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=11337904;
 //BA.debugLineNum = 11337904;BA.debugLine="ListViewComment.TwoLinesLayout.Label.Typeface";
mostCurrent._listviewcomment.getTwoLinesLayout().Label.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337905;
 //BA.debugLineNum = 11337905;BA.debugLine="ListViewComment.TwoLinesLayout.Label.Color= C";
mostCurrent._listviewcomment.getTwoLinesLayout().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (219),(int) (239),(int) (242)));
RDebugUtils.currentLine=11337907;
 //BA.debugLineNum = 11337907;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.TextS";
mostCurrent._listviewcomment.getTwoLinesLayout().SecondLabel.setTextSize((float) (14));
RDebugUtils.currentLine=11337908;
 //BA.debugLineNum = 11337908;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.Te";
mostCurrent._listviewcomment.getTwoLinesLayout().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11337909;
 //BA.debugLineNum = 11337909;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.Gr";
mostCurrent._listviewcomment.getTwoLinesLayout().SecondLabel.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=11337910;
 //BA.debugLineNum = 11337910;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.Ty";
mostCurrent._listviewcomment.getTwoLinesLayout().SecondLabel.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=11337911;
 //BA.debugLineNum = 11337911;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.Co";
mostCurrent._listviewcomment.getTwoLinesLayout().SecondLabel.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (179),(int) (229),(int) (222)));
RDebugUtils.currentLine=11337914;
 //BA.debugLineNum = 11337914;BA.debugLine="ListViewComment.ScrollingBackgroundColor =Colors";
mostCurrent._listviewcomment.setScrollingBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=11337915;
 //BA.debugLineNum = 11337915;BA.debugLine="ListViewComment.Color=Colors.rgb(187,222,251)";
mostCurrent._listviewcomment.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (187),(int) (222),(int) (251)));
RDebugUtils.currentLine=11337916;
 //BA.debugLineNum = 11337916;BA.debugLine="ListViewComment.ScrollingBackgroundColor = Color";
mostCurrent._listviewcomment.setScrollingBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (10),(int) (144),(int) (156)));
RDebugUtils.currentLine=11337919;
 //BA.debugLineNum = 11337919;BA.debugLine="LabelName.Text =  \"عنوان :\" & Main.selected_item";
mostCurrent._labelname.setText((Object)("عنوان :"+BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("title")))));
RDebugUtils.currentLine=11337920;
 //BA.debugLineNum = 11337920;BA.debugLine="LabelDesc.Text =  desc";
mostCurrent._labeldesc.setText((Object)(_desc));
RDebugUtils.currentLine=11337922;
 //BA.debugLineNum = 11337922;BA.debugLine="LabelTag.Text = \"هشتگ :\" & Main.selected_item.Ge";
mostCurrent._labeltag.setText((Object)("هشتگ :"+BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("tag")))));
RDebugUtils.currentLine=11337923;
 //BA.debugLineNum = 11337923;BA.debugLine="LabelAddress.Text = \"آدرس:\" & Main.selected_item";
mostCurrent._labeladdress.setText((Object)("آدرس:"+BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("telegramAddress")))));
RDebugUtils.currentLine=11337926;
 //BA.debugLineNum = 11337926;BA.debugLine="LabelCat.Text= \"دسته بندی :\" & category";
mostCurrent._labelcat.setText((Object)("دسته بندی :"+_category));
RDebugUtils.currentLine=11337928;
 //BA.debugLineNum = 11337928;BA.debugLine="LabelInsertDate.Text= \"تاریخ ثبت :\" & Main.selec";
mostCurrent._labelinsertdate.setText((Object)("تاریخ ثبت :"+BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("insertDate")))));
RDebugUtils.currentLine=11337930;
 //BA.debugLineNum = 11337930;BA.debugLine="If Main.selected_item.Get(\"memberCount\")<> Null";
if (mostCurrent._main._selected_item.Get((Object)("memberCount"))!= null) { 
RDebugUtils.currentLine=11337931;
 //BA.debugLineNum = 11337931;BA.debugLine="LabelMember.Text= \"تعداد اعضا :\" & Main.selecte";
mostCurrent._labelmember.setText((Object)("تعداد اعضا :"+BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("memberCount")))));
 }else {
RDebugUtils.currentLine=11337933;
 //BA.debugLineNum = 11337933;BA.debugLine="LabelMember.Text= \"تعداد اعضا :0\"";
mostCurrent._labelmember.setText((Object)("تعداد اعضا :0"));
 };
RDebugUtils.currentLine=11337936;
 //BA.debugLineNum = 11337936;BA.debugLine="If(itemType =1 Or itemType =7) Then";
if ((_itemtype==1 || _itemtype==7)) { 
RDebugUtils.currentLine=11337937;
 //BA.debugLineNum = 11337937;BA.debugLine="LabelAllert.Text=\"اگر لینک باز نشد حتمآ نسخه تل";
mostCurrent._labelallert.setText((Object)("اگر لینک باز نشد حتمآ نسخه تلگرام خود را بروز کنید."));
 };
RDebugUtils.currentLine=11337941;
 //BA.debugLineNum = 11337941;BA.debugLine="If Main.selected_item.Get(\"ownerId\")<> Null The";
if (mostCurrent._main._selected_item.Get((Object)("ownerId"))!= null) { 
RDebugUtils.currentLine=11337942;
 //BA.debugLineNum = 11337942;BA.debugLine="LabelAdmin.Text=  \"ادمین :\" & Main.selected_it";
mostCurrent._labeladmin.setText((Object)("ادمین :"+BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("ownerId")))));
 }else {
RDebugUtils.currentLine=11337944;
 //BA.debugLineNum = 11337944;BA.debugLine="LabelAdmin.Text=  \"ادمین :\"";
mostCurrent._labeladmin.setText((Object)("ادمین :"));
 };
RDebugUtils.currentLine=11337947;
 //BA.debugLineNum = 11337947;BA.debugLine="LabelOstan.Text=\"استان :\" & ostan";
mostCurrent._labelostan.setText((Object)("استان :"+_ostan));
RDebugUtils.currentLine=11337948;
 //BA.debugLineNum = 11337948;BA.debugLine="LabelShahr.Text=\"شهر :\" & shahr";
mostCurrent._labelshahr.setText((Object)("شهر :"+_shahr));
RDebugUtils.currentLine=11337951;
 //BA.debugLineNum = 11337951;BA.debugLine="Dim iconPic As Int";
_iconpic = 0;
RDebugUtils.currentLine=11337952;
 //BA.debugLineNum = 11337952;BA.debugLine="iconPic = Main.selected_item.Get(\"iconPictureId\"";
_iconpic = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("iconPictureId"))));
RDebugUtils.currentLine=11337954;
 //BA.debugLineNum = 11337954;BA.debugLine="If (Main.selected_item.Get(\"likeCount\") = Null)";
if ((mostCurrent._main._selected_item.Get((Object)("likeCount"))== null)) { 
RDebugUtils.currentLine=11337955;
 //BA.debugLineNum = 11337955;BA.debugLine="LabelLike.Text= \"0\"";
mostCurrent._labellike.setText((Object)("0"));
 }else {
RDebugUtils.currentLine=11337957;
 //BA.debugLineNum = 11337957;BA.debugLine="LabelLike.Text= Main.selected_item.Get(\"likeCou";
mostCurrent._labellike.setText(mostCurrent._main._selected_item.Get((Object)("likeCount")));
 };
RDebugUtils.currentLine=11337960;
 //BA.debugLineNum = 11337960;BA.debugLine="If(itemType = 11)Then";
if ((_itemtype==11)) { 
RDebugUtils.currentLine=11337961;
 //BA.debugLineNum = 11337961;BA.debugLine="btnBrokeLink.Visible=False";
mostCurrent._btnbrokelink.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11337962;
 //BA.debugLineNum = 11337962;BA.debugLine="btnCopy.Visible =False";
mostCurrent._btncopy.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11337963;
 //BA.debugLineNum = 11337963;BA.debugLine="btnJoin.Visible=False";
mostCurrent._btnjoin.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11337964;
 //BA.debugLineNum = 11337964;BA.debugLine="btnInstagram.Visible =False";
mostCurrent._btninstagram.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=11337969;
 //BA.debugLineNum = 11337969;BA.debugLine="Dim vip As Int";
_vip = 0;
RDebugUtils.currentLine=11337970;
 //BA.debugLineNum = 11337970;BA.debugLine="Dim super As Int";
_super = 0;
RDebugUtils.currentLine=11337972;
 //BA.debugLineNum = 11337972;BA.debugLine="If( iconPic= 0 Or Main.selected_item.Get(\"isVIP\"";
if ((_iconpic==0 || (mostCurrent._main._selected_item.Get((Object)("isVIP"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False)))) { 
RDebugUtils.currentLine=11337974;
 //BA.debugLineNum = 11337974;BA.debugLine="Select itemType";
switch (_itemtype) {
case 2: {
RDebugUtils.currentLine=11337976;
 //BA.debugLineNum = 11337976;BA.debugLine="ImagePreivew.Bitmap= Main.idIcon";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(mostCurrent._main._idicon.getObject()));
RDebugUtils.currentLine=11337977;
 //BA.debugLineNum = 11337977;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
mostCurrent._imagebackground.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"id_back.jpg").getObject()));
 break; }
case 3: {
RDebugUtils.currentLine=11337980;
 //BA.debugLineNum = 11337980;BA.debugLine="ImagePreivew.Bitmap= Main.stickerIcon";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(mostCurrent._main._stickericon.getObject()));
RDebugUtils.currentLine=11337981;
 //BA.debugLineNum = 11337981;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
mostCurrent._imagebackground.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"sticker_back.jpg").getObject()));
 break; }
case 4: {
RDebugUtils.currentLine=11337983;
 //BA.debugLineNum = 11337983;BA.debugLine="ImagePreivew.Bitmap= Main.robotIcon";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(mostCurrent._main._roboticon.getObject()));
RDebugUtils.currentLine=11337984;
 //BA.debugLineNum = 11337984;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
mostCurrent._imagebackground.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"robot_back.jpg").getObject()));
 break; }
case 7: {
RDebugUtils.currentLine=11337987;
 //BA.debugLineNum = 11337987;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
mostCurrent._imagebackground.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"channel_back.jpg").getObject()));
RDebugUtils.currentLine=11337989;
 //BA.debugLineNum = 11337989;BA.debugLine="super =Main.selected_item.Get(\"isSuperGroup\")";
_super = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("isSuperGroup"))));
RDebugUtils.currentLine=11337990;
 //BA.debugLineNum = 11337990;BA.debugLine="vip =Main.selected_item.Get(\"isVIP\")";
_vip = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("isVIP"))));
RDebugUtils.currentLine=11337992;
 //BA.debugLineNum = 11337992;BA.debugLine="If(vip = 1  )Then";
if ((_vip==1)) { 
RDebugUtils.currentLine=11337993;
 //BA.debugLineNum = 11337993;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAsset";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"vip_channel.png").getObject()));
 }else 
{RDebugUtils.currentLine=11337994;
 //BA.debugLineNum = 11337994;BA.debugLine="Else If( super = 1) Then";
if ((_super==1)) { 
RDebugUtils.currentLine=11337995;
 //BA.debugLineNum = 11337995;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAsset";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"gov_channel.png").getObject()));
 }else {
RDebugUtils.currentLine=11337997;
 //BA.debugLineNum = 11337997;BA.debugLine="ImagePreivew.Bitmap=Main.channelIcon";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(mostCurrent._main._channelicon.getObject()));
 }};
 break; }
case 9: {
RDebugUtils.currentLine=11338002;
 //BA.debugLineNum = 11338002;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
mostCurrent._imagebackground.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"sticker_back.jpg").getObject()));
RDebugUtils.currentLine=11338003;
 //BA.debugLineNum = 11338003;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAssets";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"adsicon.png").getObject()));
 break; }
case 10: {
RDebugUtils.currentLine=11338007;
 //BA.debugLineNum = 11338007;BA.debugLine="ImagePreivew.Bitmap=  LoadBitmap(File.DirAsse";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"comment.png").getObject()));
RDebugUtils.currentLine=11338008;
 //BA.debugLineNum = 11338008;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
mostCurrent._imagebackground.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"id_back.jpg").getObject()));
 break; }
default: {
RDebugUtils.currentLine=11338012;
 //BA.debugLineNum = 11338012;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
mostCurrent._imagebackground.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"group_back.jpg").getObject()));
RDebugUtils.currentLine=11338015;
 //BA.debugLineNum = 11338015;BA.debugLine="super =Main.selected_item.Get(\"isSuperGroup\")";
_super = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("isSuperGroup"))));
RDebugUtils.currentLine=11338016;
 //BA.debugLineNum = 11338016;BA.debugLine="vip =Main.selected_item.Get(\"isVIP\")";
_vip = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("isVIP"))));
RDebugUtils.currentLine=11338018;
 //BA.debugLineNum = 11338018;BA.debugLine="If(vip = 1  )Then";
if ((_vip==1)) { 
RDebugUtils.currentLine=11338019;
 //BA.debugLineNum = 11338019;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAsset";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"adsicon.png").getObject()));
 }else 
{RDebugUtils.currentLine=11338020;
 //BA.debugLineNum = 11338020;BA.debugLine="Else If( super = 1) Then";
if ((_super==1)) { 
RDebugUtils.currentLine=11338021;
 //BA.debugLineNum = 11338021;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAsset";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ispremium.png").getObject()));
 }else {
RDebugUtils.currentLine=11338023;
 //BA.debugLineNum = 11338023;BA.debugLine="ImagePreivew.Bitmap=Main.groupIcon";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(mostCurrent._main._groupicon.getObject()));
 }};
 break; }
}
;
 }else {
RDebugUtils.currentLine=11338028;
 //BA.debugLineNum = 11338028;BA.debugLine="job1.Initialize(\"download_icon\", Me)";
_job1._initialize(null,processBA,"download_icon",groupviewact.getObject());
RDebugUtils.currentLine=11338029;
 //BA.debugLineNum = 11338029;BA.debugLine="If (itemType = 11 ) Then";
if ((_itemtype==11)) { 
RDebugUtils.currentLine=11338030;
 //BA.debugLineNum = 11338030;BA.debugLine="ProgressDialogShow(\"درحال دریافت \")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت ");
 };
RDebugUtils.currentLine=11338032;
 //BA.debugLineNum = 11338032;BA.debugLine="job1.Download(\"http://aloosalam.ir/index.php";
_job1._download(null,"http://aloosalam.ir/index.php/index/iconGroupView/"+BA.NumberToString(_iconpic)+"/"+BA.NumberToString(_itemtype));
 };
RDebugUtils.currentLine=11338035;
 //BA.debugLineNum = 11338035;BA.debugLine="Dim comment As Int =Main.selected_item.Get(\"comm";
_comment = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("commentCount"))));
RDebugUtils.currentLine=11338036;
 //BA.debugLineNum = 11338036;BA.debugLine="If( comment > 0  )Then";
if ((_comment>0)) { 
RDebugUtils.currentLine=11338037;
 //BA.debugLineNum = 11338037;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=11338038;
 //BA.debugLineNum = 11338038;BA.debugLine="id = Main.selected_item.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("id"))));
RDebugUtils.currentLine=11338039;
 //BA.debugLineNum = 11338039;BA.debugLine="Try";
try {RDebugUtils.currentLine=11338040;
 //BA.debugLineNum = 11338040;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=11338041;
 //BA.debugLineNum = 11338041;BA.debugLine="ProgressDialogShow(\"درحال دریافت نظرات\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت نظرات");
RDebugUtils.currentLine=11338042;
 //BA.debugLineNum = 11338042;BA.debugLine="job.Initialize(\"getComments\", Me)";
_job._initialize(null,processBA,"getComments",groupviewact.getObject());
RDebugUtils.currentLine=11338044;
 //BA.debugLineNum = 11338044;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/getComments/"+BA.NumberToString(_id),"pass=1266"+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e274) {
			processBA.setLastException(e274);RDebugUtils.currentLine=11338047;
 //BA.debugLineNum = 11338047;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات   \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات   ","خطا",mostCurrent.activityBA);
 };
 }else {
RDebugUtils.currentLine=11338051;
 //BA.debugLineNum = 11338051;BA.debugLine="ListViewComment.AddTwoLines(\"نظری داده نشده است";
mostCurrent._listviewcomment.AddTwoLines("نظری داده نشده است . ","اولین نفری باشید که نظر می دهد");
 };
 } 
       catch (Exception e280) {
			processBA.setLastException(e280);RDebugUtils.currentLine=11338056;
 //BA.debugLineNum = 11338056;BA.debugLine="Msgbox(\"خطا در نمایش اطلاعات\",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در نمایش اطلاعات","خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=11338057;
 //BA.debugLineNum = 11338057;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=11338059;
 //BA.debugLineNum = 11338059;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("activity_pause"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_pause", new Object[] {_userclosed});
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="End Sub";
return "";
}
public static String  _btnbrokelink_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("btnbrokelink_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnbrokelink_click", null);
int _id = 0;
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub btnBrokeLink_Click";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="id = Main.selected_item.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("id"))));
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Try";
try {RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال ارسال");
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="job.Initialize(\"broke_group\", Me)";
_job._initialize(null,processBA,"broke_group",groupviewact.getObject());
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/linkBroken/"+BA.NumberToString((_id*34)),"pass=1266"+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e518) {
			processBA.setLastException(e518);RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در ارسال اطلاعات   ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=12582931;
 //BA.debugLineNum = 12582931;BA.debugLine="End Sub";
return "";
}
public static String  _btncopy_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("btncopy_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btncopy_click", null);
String _tmpt = "";
b4a.util.BClipboard _bc = null;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub btnCopy_Click";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Try";
try {RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Dim tmpt As String";
_tmpt = "";
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="Dim bc As BClipboard";
_bc = new b4a.util.BClipboard();
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="bc.clrText";
_bc.clrText(mostCurrent.activityBA);
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="tmpt  =  Main.selected_item.Get(\"telegramAddress";
_tmpt = BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("telegramAddress")));
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="bc.setText(tmpt)";
_bc.setText(mostCurrent.activityBA,_tmpt);
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="Msgbox(\"آدرس کپی شد . اکنون می توانید آن را هر ج";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس کپی شد . اکنون می توانید آن را هر جا خواستید بچسبانید .","آدرس ",mostCurrent.activityBA);
 } 
       catch (Exception e451) {
			processBA.setLastException(e451);RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="Msgbox(tmpt,\"آدرس \")";
anywheresoftware.b4a.keywords.Common.Msgbox(_tmpt,"آدرس ",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=12255245;
 //BA.debugLineNum = 12255245;BA.debugLine="End Sub";
return "";
}
public static String  _btninstagram_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("btninstagram_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btninstagram_click", null);
anywheresoftware.b4a.objects.IntentWrapper _inten = null;
String _tmpt = "";
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _u = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub btnInstagram_Click";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Try";
try {RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Dim inten As Intent";
_inten = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Dim tmpt As String";
_tmpt = "";
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="tmpt  =  Main.selected_item.Get(\"telegramAddress";
_tmpt = BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("telegramAddress")));
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Dim u As Uri";
_u = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="u.Parse(tmpt)";
_u.Parse(_tmpt);
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="inten.Initialize(inten.ACTION_SEND,\"\")";
_inten.Initialize(_inten.ACTION_SEND,"");
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="inten.SetType(\"image/*\")";
_inten.SetType("image/*");
RDebugUtils.currentLine=12189706;
 //BA.debugLineNum = 12189706;BA.debugLine="inten.PutExtra(\"android.intent.extra.STREAM\",u)";
_inten.PutExtra("android.intent.extra.STREAM",(Object)(_u.getObject()));
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="inten.PutExtra(\"android.intent.extra.TEXT\",Main.";
_inten.PutExtra("android.intent.extra.TEXT",(Object)(BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("title")))+anywheresoftware.b4a.keywords.Common.CRLF+BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("description")))+anywheresoftware.b4a.keywords.Common.CRLF+"http://aloosalam.ir"));
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="inten.SetComponent(\"com.instagram.android/.activ";
_inten.SetComponent("com.instagram.android/.activity.ShareHandlerActivity");
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="StartActivity(inten)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_inten.getObject()));
 } 
       catch (Exception e439) {
			processBA.setLastException(e439);RDebugUtils.currentLine=12189711;
 //BA.debugLineNum = 12189711;BA.debugLine="Msgbox(\"اینستاگرام نصب نیست .\",\"اینستاگرام\")";
anywheresoftware.b4a.keywords.Common.Msgbox("اینستاگرام نصب نیست .","اینستاگرام",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=12189713;
 //BA.debugLineNum = 12189713;BA.debugLine="End Sub";
return "";
}
public static String  _btnjoin_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("btnjoin_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnjoin_click", null);
String _address = "";
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub btnJoin_Click";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Dim address As String";
_address = "";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="address= Main.selected_item.Get(\"telegramAddress\"";
_address = BA.ObjectToString(mostCurrent._main._selected_item.Get((Object)("telegramAddress")));
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="address=address.Replace(\"{userid}\",Main.userInfo.";
_address = _address.replace("{userid}",BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id"))));
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="If (address.StartsWith(\"https://telegram.me\") Or";
if ((_address.startsWith("https://telegram.me") || _address.startsWith("telegram.me") || _address.contains("telegram.me"))) { 
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="joinTelegram(address)";
_jointelegram(_address);
 }else 
{RDebugUtils.currentLine=11599881;
 //BA.debugLineNum = 11599881;BA.debugLine="Else if(address.StartsWith(\"http://aloosalam.ir\")";
if ((_address.startsWith("http://aloosalam.ir") || _address.startsWith("http://"))) { 
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="StartActivity(p.OpenBrowser(address))";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser(_address)));
 }else 
{RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="Else if (itemType =11 )Then";
if ((_itemtype==11)) { 
 }else {
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="Msgbox(\"آدرس گروه صحیح نیست . گزینه دیگری را امت";
anywheresoftware.b4a.keywords.Common.Msgbox("آدرس گروه صحیح نیست . گزینه دیگری را امتحان کنید .","خطا",mostCurrent.activityBA);
 }}};
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="End Sub";
return "";
}
public static String  _jointelegram(String _address) throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("jointelegram"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jointelegram", new Object[] {_address});
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
String _teladdress = "";
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub joinTelegram(address As String  )";
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Try";
try {RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Dim telAddress As String";
_teladdress = "";
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="Select itemType";
switch (_itemtype) {
case 2: {
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
_teladdress = _address.replace("https://telegram.me/","");
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
_teladdress = _teladdress.replace("http://telegram.me/","");
RDebugUtils.currentLine=11665421;
 //BA.debugLineNum = 11665421;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/\",";
_teladdress = _teladdress.replace("telegram.me/","");
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="telAddress=telAddress.Replace(\"@\",\"\")";
_teladdress = _teladdress.replace("@","");
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://resolve?";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("tg://resolve?domain="+_teladdress)));
 break; }
case 3: {
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
_teladdress = _address.replace("https://telegram.me/addstickers/","");
RDebugUtils.currentLine=11665427;
 //BA.debugLineNum = 11665427;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
_teladdress = _teladdress.replace("http://telegram.me/addstickers/","");
RDebugUtils.currentLine=11665428;
 //BA.debugLineNum = 11665428;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/ad";
_teladdress = _teladdress.replace("telegram.me/addstickers/","");
RDebugUtils.currentLine=11665430;
 //BA.debugLineNum = 11665430;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://addstick";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("tg://addstickers/?set="+_teladdress)));
 break; }
case 4: {
RDebugUtils.currentLine=11665433;
 //BA.debugLineNum = 11665433;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
_teladdress = _address.replace("https://telegram.me/","");
RDebugUtils.currentLine=11665434;
 //BA.debugLineNum = 11665434;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
_teladdress = _teladdress.replace("http://telegram.me/","");
RDebugUtils.currentLine=11665435;
 //BA.debugLineNum = 11665435;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/\",";
_teladdress = _teladdress.replace("telegram.me/","");
RDebugUtils.currentLine=11665436;
 //BA.debugLineNum = 11665436;BA.debugLine="telAddress=telAddress.Replace(\"@\",\"\")";
_teladdress = _teladdress.replace("@","");
RDebugUtils.currentLine=11665437;
 //BA.debugLineNum = 11665437;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://resolve?";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("tg://resolve?domain="+_teladdress)));
 break; }
case 7: {
RDebugUtils.currentLine=11665441;
 //BA.debugLineNum = 11665441;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
_teladdress = _address.replace("https://telegram.me/","");
RDebugUtils.currentLine=11665442;
 //BA.debugLineNum = 11665442;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
_teladdress = _teladdress.replace("http://telegram.me/","");
RDebugUtils.currentLine=11665443;
 //BA.debugLineNum = 11665443;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/\",";
_teladdress = _teladdress.replace("telegram.me/","");
RDebugUtils.currentLine=11665445;
 //BA.debugLineNum = 11665445;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://resolve?";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("tg://resolve?domain="+_teladdress)));
 break; }
default: {
RDebugUtils.currentLine=11665448;
 //BA.debugLineNum = 11665448;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
_teladdress = _address.replace("https://telegram.me/joinchat/","");
RDebugUtils.currentLine=11665449;
 //BA.debugLineNum = 11665449;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
_teladdress = _teladdress.replace("http://telegram.me/joinchat/","");
RDebugUtils.currentLine=11665450;
 //BA.debugLineNum = 11665450;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/jo";
_teladdress = _teladdress.replace("telegram.me/joinchat/","");
RDebugUtils.currentLine=11665452;
 //BA.debugLineNum = 11665452;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://join?inv";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("tg://join?invite="+_teladdress)));
 break; }
}
;
 } 
       catch (Exception e339) {
			processBA.setLastException(e339);RDebugUtils.currentLine=11665458;
 //BA.debugLineNum = 11665458;BA.debugLine="Msgbox(\"نرم افزار تلگرام نصب نیست.\",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("نرم افزار تلگرام نصب نیست.","خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=11665459;
 //BA.debugLineNum = 11665459;BA.debugLine="StartActivity(p.OpenBrowser(address))";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser(_address)));
 };
RDebugUtils.currentLine=11665462;
 //BA.debugLineNum = 11665462;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("btnmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null);
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
mostCurrent._navi.OpenDrawer2(mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="End Sub";
return "";
}
public static String  _btnpanel_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("btnpanel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnpanel_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub btnPanel_Click";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
anywheresoftware.b4a.keywords.Common.Msgbox("نام کاربری شما :"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+anywheresoftware.b4a.keywords.Common.CRLF+" رمز عبور اولیه شما "+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+" می باشد","رمز عبور",mostCurrent.activityBA);
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/")));
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="End Sub";
return "";
}
public static String  _btnreturn_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("btnreturn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnreturn_click", null);
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub btnReturn_Click";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="End Sub";
return "";
}
public static String  _buttoncomment_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("buttoncomment_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttoncomment_click", null);
int _id = 0;
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub ButtonComment_Click";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="id = Main.selected_item.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("id"))));
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="Try";
try {RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال ارسال");
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="job.Initialize(\"insertComment\", Me)";
_job._initialize(null,processBA,"insertComment",groupviewact.getObject());
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/insertComment/"+BA.NumberToString(_id),"pass=1266"+"&text="+mostCurrent._edittextcomment.getText()+"&type="+BA.NumberToString(_itemtype)+"&name="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("name")))+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e482) {
			processBA.setLastException(e482);RDebugUtils.currentLine=12386322;
 //BA.debugLineNum = 12386322;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در ارسال اطلاعات   ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=12386325;
 //BA.debugLineNum = 12386325;BA.debugLine="End Sub";
return "";
}
public static String  _buttonminus_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("buttonminus_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonminus_click", null);
int _id = 0;
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub ButtonMinus_Click";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="id = Main.selected_item.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("id"))));
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="Try";
try {RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال ارسال");
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="job.Initialize(\"sendLike\", Me)";
_job._initialize(null,processBA,"sendLike",groupviewact.getObject());
RDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/sendLike/"+BA.NumberToString(_id),"pass=1266"+"&liek=minus"+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e494) {
			processBA.setLastException(e494);RDebugUtils.currentLine=12451856;
 //BA.debugLineNum = 12451856;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در ارسال اطلاعات   ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=12451859;
 //BA.debugLineNum = 12451859;BA.debugLine="End Sub";
return "";
}
public static String  _buttonplus_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("buttonplus_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buttonplus_click", null);
int _id = 0;
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Sub ButtonPlus_Click";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="id = Main.selected_item.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("id"))));
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="Try";
try {RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال ارسال");
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="job.Initialize(\"sendLike\", Me)";
_job._initialize(null,processBA,"sendLike",groupviewact.getObject());
RDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
_job._poststring(null,"http://www.aloosalam.ir/index.php/mobile/index/sendLike/"+BA.NumberToString(_id),"pass=1266"+"&liek=plus"+"&user="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+"&v="+BA.NumberToString(anywheresoftware.b4a.keywords.Common.Application.getVersionCode())+"&line="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number"))));
 } 
       catch (Exception e506) {
			processBA.setLastException(e506);RDebugUtils.currentLine=12517392;
 //BA.debugLineNum = 12517392;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در ارسال اطلاعات   ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=12517395;
 //BA.debugLineNum = 12517395;BA.debugLine="End Sub";
return "";
}
public static String  _imagepreivew_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("imagepreivew_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "imagepreivew_click", null);
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub ImagePreivew_Click";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="ImageViewAll.Left=0";
mostCurrent._imageviewall.setLeft((int) (0));
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="ImageViewAll.Top=0";
mostCurrent._imageviewall.setTop((int) (0));
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="ImageViewAll.Bitmap = ImagePreivew.Bitmap";
mostCurrent._imageviewall.setBitmap(mostCurrent._imagepreivew.getBitmap());
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="ImageViewAll.Visible=True";
mostCurrent._imageviewall.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="End Sub";
return "";
}
public static String  _imageviewall_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("imageviewall_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "imageviewall_click", null);
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub ImageViewAll_Click";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="ImageViewAll.Visible=False";
mostCurrent._imageviewall.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(Telegram.Search.httpjob _job) throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _countries = null;
anywheresoftware.b4a.objects.collections.List _rows = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Try";
try {RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="res = Job.GetString";
_res = _job._getstring(null);
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="If( Job.JobName  = \"download_icon\") Then";
if (((_job._jobname).equals("download_icon"))) { 
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="Try";
try {RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="ImagePreivew.Bitmap = Job.GetBitmap";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(_job._getbitmap(null).getObject()));
 } 
       catch (Exception e355) {
			processBA.setLastException(e355);RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="ImagePreivew.Bitmap=Main.groupIcon";
mostCurrent._imagepreivew.setBitmap((android.graphics.Bitmap)(mostCurrent._main._groupicon.getObject()));
 };
RDebugUtils.currentLine=11730959;
 //BA.debugLineNum = 11730959;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=11730960;
 //BA.debugLineNum = 11730960;BA.debugLine="Job.Release";
_job._release(null);
 }else 
{RDebugUtils.currentLine=11730961;
 //BA.debugLineNum = 11730961;BA.debugLine="else If( Job.JobName  = \"getComments\") Then";
if (((_job._jobname).equals("getComments"))) { 
RDebugUtils.currentLine=11730962;
 //BA.debugLineNum = 11730962;BA.debugLine="Dim COUNTRIES As List";
_countries = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730963;
 //BA.debugLineNum = 11730963;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list w";
_countries = _parser.NextArray();
RDebugUtils.currentLine=11730965;
 //BA.debugLineNum = 11730965;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="rows= COUNTRIES.Get(0)";
_rows.setObject((java.util.List)(_countries.Get((int) (0))));
RDebugUtils.currentLine=11730968;
 //BA.debugLineNum = 11730968;BA.debugLine="If(rows.Size > 0 ) Then";
if ((_rows.getSize()>0)) { 
RDebugUtils.currentLine=11730970;
 //BA.debugLineNum = 11730970;BA.debugLine="For i= 0 To rows.Size-1";
{
final int step22 = 1;
final int limit22 = (int) (_rows.getSize()-1);
for (_i = (int) (0) ; (step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22); _i = ((int)(0 + _i + step22)) ) {
RDebugUtils.currentLine=11730971;
 //BA.debugLineNum = 11730971;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11730973;
 //BA.debugLineNum = 11730973;BA.debugLine="row.Initialize()";
_row.Initialize();
RDebugUtils.currentLine=11730974;
 //BA.debugLineNum = 11730974;BA.debugLine="row=rows.Get(i)";
_row.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rows.Get(_i)));
RDebugUtils.currentLine=11730975;
 //BA.debugLineNum = 11730975;BA.debugLine="ListViewComment.AddTwoLines(row.Get(\"name\")";
mostCurrent._listviewcomment.AddTwoLines(BA.ObjectToString(_row.Get((Object)("name")))+"-"+BA.ObjectToString(_row.Get((Object)("createDate"))),BA.ObjectToString(_row.Get((Object)("content"))));
 }
};
 }else {
RDebugUtils.currentLine=11730978;
 //BA.debugLineNum = 11730978;BA.debugLine="ListViewComment.AddTwoLines(\"نظری داده نشده ا";
mostCurrent._listviewcomment.AddTwoLines("نظری داده نشده است . ","");
 };
RDebugUtils.currentLine=11730980;
 //BA.debugLineNum = 11730980;BA.debugLine="Job.Release";
_job._release(null);
 }else 
{RDebugUtils.currentLine=11730982;
 //BA.debugLineNum = 11730982;BA.debugLine="else If( Job.JobName  = \"insertComment\") Then";
if (((_job._jobname).equals("insertComment"))) { 
RDebugUtils.currentLine=11730984;
 //BA.debugLineNum = 11730984;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . نظر شما ثبت";
anywheresoftware.b4a.keywords.Common.Msgbox("با تشکر از حسن توجه شما . نظر شما ثبت شد .","ثبت نظر",mostCurrent.activityBA);
RDebugUtils.currentLine=11730985;
 //BA.debugLineNum = 11730985;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=11730986;
 //BA.debugLineNum = 11730986;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=11730988;
 //BA.debugLineNum = 11730988;BA.debugLine="else If( Job.JobName  = \"sendLike\") Then";
if (((_job._jobname).equals("sendLike"))) { 
RDebugUtils.currentLine=11730990;
 //BA.debugLineNum = 11730990;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . امتیاز شد .\"";
anywheresoftware.b4a.keywords.Common.Msgbox("با تشکر از حسن توجه شما . امتیاز شد .","گزارش خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=11730991;
 //BA.debugLineNum = 11730991;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=11730992;
 //BA.debugLineNum = 11730992;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=11730994;
 //BA.debugLineNum = 11730994;BA.debugLine="else If( Job.JobName  = \"broke_group\") Then";
if (((_job._jobname).equals("broke_group"))) { 
RDebugUtils.currentLine=11730996;
 //BA.debugLineNum = 11730996;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . گزارش ثبت شد";
anywheresoftware.b4a.keywords.Common.Msgbox("با تشکر از حسن توجه شما . گزارش ثبت شد .","گزارش خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=11730997;
 //BA.debugLineNum = 11730997;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=11730998;
 //BA.debugLineNum = 11730998;BA.debugLine="Main.vipInsertCount = Main.vipInsertCount +1";
mostCurrent._main._vipinsertcount = (int) (mostCurrent._main._vipinsertcount+1);
RDebugUtils.currentLine=11730999;
 //BA.debugLineNum = 11730999;BA.debugLine="writeInfo";
_writeinfo();
RDebugUtils.currentLine=11731000;
 //BA.debugLineNum = 11731000;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }}}}};
 }else {
RDebugUtils.currentLine=11731004;
 //BA.debugLineNum = 11731004;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .",anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e394) {
			processBA.setLastException(e394);RDebugUtils.currentLine=11731007;
 //BA.debugLineNum = 11731007;BA.debugLine="Job.Release";
_job._release(null);
RDebugUtils.currentLine=11731008;
 //BA.debugLineNum = 11731008;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات جستجو  \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات جستجو  ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=11731011;
 //BA.debugLineNum = 11731011;BA.debugLine="End Sub";
return "";
}
public static String  _writeinfo() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("writeinfo"))
	return (String) Debug.delegate(mostCurrent.activityBA, "writeinfo", null);
String _line = "";
String _updatequery = "";
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub writeInfo";
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="If(Main.userInfo.IsInitialized =False) Then";
if ((mostCurrent._main._userinfo.IsInitialized()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="Main.userInfo.Initialize";
mostCurrent._main._userinfo.Initialize();
 };
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="Dim line As String";
_line = "";
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="Try";
try {RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="line = Main.phoneId.GetLine1Number";
_line = mostCurrent._main._phoneid.GetLine1Number();
 } 
       catch (Exception e462) {
			processBA.setLastException(e462);RDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="line = \"need root\"";
_line = "need root";
 };
RDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="Main.userInfo.Put(\"sdk\",Main.phone.SdkVersion)";
mostCurrent._main._userinfo.Put((Object)("sdk"),(Object)(mostCurrent._main._phone.getSdkVersion()));
RDebugUtils.currentLine=12320783;
 //BA.debugLineNum = 12320783;BA.debugLine="Main.userInfo.Put(\"model\",Main.phone.Manufacturer";
mostCurrent._main._userinfo.Put((Object)("model"),(Object)(mostCurrent._main._phone.getManufacturer()+","+mostCurrent._main._phone.getProduct()));
RDebugUtils.currentLine=12320784;
 //BA.debugLineNum = 12320784;BA.debugLine="Main.userInfo.Put(\"line_number\",line)";
mostCurrent._main._userinfo.Put((Object)("line_number"),(Object)(_line));
RDebugUtils.currentLine=12320785;
 //BA.debugLineNum = 12320785;BA.debugLine="Main.userInfo.Put(\"phoneid\",Main.phoneId.GetDevic";
mostCurrent._main._userinfo.Put((Object)("phoneid"),(Object)(mostCurrent._main._phoneid.GetDeviceId()));
RDebugUtils.currentLine=12320789;
 //BA.debugLineNum = 12320789;BA.debugLine="Main.userInfo.Put(\"to_day_insert_advance\",Main.vi";
mostCurrent._main._userinfo.Put((Object)("to_day_insert_advance"),(Object)(mostCurrent._main._vipinsertcount));
RDebugUtils.currentLine=12320790;
 //BA.debugLineNum = 12320790;BA.debugLine="Main.userInfo.Put(\"to_day_insert\",Main.todayInser";
mostCurrent._main._userinfo.Put((Object)("to_day_insert"),(Object)(mostCurrent._main._todayinsertcount));
RDebugUtils.currentLine=12320792;
 //BA.debugLineNum = 12320792;BA.debugLine="Dim updateQuery As String  = \"update  info set \"";
_updatequery = "update  info set "+"name  ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("name")))+"',"+"phone	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("phone")))+"',"+"user_id	 ="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_id")))+","+"pass	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+"',"+"user_name	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+"',"+"sdk	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("sdk")))+"',"+"model	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("model")))+"',"+"line_number	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("line_number")))+"',"+"phoneid	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("phoneid")))+"',"+"is_advance	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("is_advance")))+"',"+"is_premium	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("is_premium")))+"',"+"advance_count	 ="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("advance_count")))+","+"advance_expier_date	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("advance_expier_date")))+"',"+"to_day_date	 ='"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("to_day_date")))+"',"+"to_day_insert	 ="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("to_day_insert")))+","+"to_day_insert_advance	 ="+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("to_day_insert_advance")));
RDebugUtils.currentLine=12320810;
 //BA.debugLineNum = 12320810;BA.debugLine="DBUtils.ExecuteMemoryTable(Main.SQL1,  updateQuer";
mostCurrent._dbutils._executememorytable(mostCurrent.activityBA,mostCurrent._main._sql1,_updatequery,(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=12320812;
 //BA.debugLineNum = 12320812;BA.debugLine="End Sub";
return "";
}
public static String  _menuabout_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("menuabout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuabout_click", null);
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub MenuAbout_Click";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="StartActivity(\"AboutAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("AboutAct"));
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="End Sub";
return "";
}
public static String  _menucontact_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("menucontact_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menucontact_click", null);
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub MenuContact_Click";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="StartActivity(\"contactAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("contactAct"));
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="End Sub";
return "";
}
public static String  _menuexit_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("menuexit_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuexit_click", null);
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub MenuExit_Click";
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="End Sub";
return "";
}
public static String  _menuhelp_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("menuhelp_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuhelp_click", null);
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub MenuHelp_Click";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="StartActivity(\"helpAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("helpAct"));
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="End Sub";
return "";
}
public static String  _menuorder_click() throws Exception{
RDebugUtils.currentModule="groupviewact";
if (Debug.shouldDelegate("menuorder_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuorder_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub MenuOrder_Click";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
anywheresoftware.b4a.keywords.Common.Msgbox("نام کاربری شما :"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+anywheresoftware.b4a.keywords.Common.CRLF+" رمز عبور اولیه شما "+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+" می باشد","رمز عبور",mostCurrent.activityBA);
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/index/1")));
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="End Sub";
return "";
}
}