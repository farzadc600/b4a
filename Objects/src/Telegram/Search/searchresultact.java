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

public class searchresultact extends Activity implements B4AActivity{
	public static searchresultact mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "Telegram.Search", "Telegram.Search.searchresultact");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (searchresultact).");
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
		activityBA = new BA(this, layout, processBA, "Telegram.Search", "Telegram.Search.searchresultact");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "Telegram.Search.searchresultact", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (searchresultact) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (searchresultact) Resume **");
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
		return searchresultact.class;
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
        BA.LogInfo("** Activity (searchresultact) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (searchresultact) Resume **");
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
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewresult = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenu = null;
public static int _resultcount = 0;
public static int _pagenumber = 0;
public anywheresoftware.b4a.objects.LabelWrapper _labelpage = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnprev = null;
public de.amberhome.navdrawer.NavigationDrawer _navi = null;
public anywheresoftware.b4a.objects.PanelWrapper _pcantent = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public Telegram.Search.main _main = null;
public Telegram.Search.httputils2service _httputils2service = null;
public Telegram.Search.aboutact _aboutact = null;
public Telegram.Search.dbutils _dbutils = null;
public Telegram.Search.helpact _helpact = null;
public Telegram.Search.contactact _contactact = null;
public Telegram.Search.insertact _insertact = null;
public Telegram.Search.groupviewact _groupviewact = null;
public Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public Telegram.Search.searchact _searchact = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
mostCurrent._navi.Initialize2(mostCurrent.activityBA,"navi",(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._activity.getObject())),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
mostCurrent._navi.getNavigationPanel().LoadLayout("menu",mostCurrent.activityBA);
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="pCantent.Initialize(\"\")";
mostCurrent._pcantent.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
mostCurrent._navi.getContentPanel().AddView((android.view.View)(mostCurrent._pcantent.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="pCantent.SendToBack";
mostCurrent._pcantent.SendToBack();
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="pCantent.LoadLayout(\"searchresultview\")";
mostCurrent._pcantent.LoadLayout("searchresultview",mostCurrent.activityBA);
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="Activity.Title=\"نمایش نتایج جستجو\"";
mostCurrent._activity.setTitle((Object)("نمایش نتایج جستجو"));
RDebugUtils.currentLine=5898261;
 //BA.debugLineNum = 5898261;BA.debugLine="pageNumber = 1";
_pagenumber = (int) (1);
RDebugUtils.currentLine=5898264;
 //BA.debugLineNum = 5898264;BA.debugLine="Label1.TextSize= 15";
mostCurrent._label1.setTextSize((float) (15));
RDebugUtils.currentLine=5898265;
 //BA.debugLineNum = 5898265;BA.debugLine="Label1.Gravity= Gravity.RIGHT";
mostCurrent._label1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=5898266;
 //BA.debugLineNum = 5898266;BA.debugLine="Label1.Typeface=Main.font";
mostCurrent._label1.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=5898269;
 //BA.debugLineNum = 5898269;BA.debugLine="LabelPage.TextSize= 15";
mostCurrent._labelpage.setTextSize((float) (15));
RDebugUtils.currentLine=5898270;
 //BA.debugLineNum = 5898270;BA.debugLine="LabelPage.Gravity= Gravity.RIGHT";
mostCurrent._labelpage.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=5898271;
 //BA.debugLineNum = 5898271;BA.debugLine="LabelPage.Typeface=Main.font";
mostCurrent._labelpage.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=5898273;
 //BA.debugLineNum = 5898273;BA.debugLine="ImageView1.Bitmap = Main.rightBitmap";
mostCurrent._imageview1.setBitmap((android.graphics.Bitmap)(mostCurrent._main._rightbitmap.getObject()));
RDebugUtils.currentLine=5898275;
 //BA.debugLineNum = 5898275;BA.debugLine="ListViewResult.Clear()";
mostCurrent._listviewresult.Clear();
RDebugUtils.currentLine=5898277;
 //BA.debugLineNum = 5898277;BA.debugLine="ListViewResult.TwoLinesAndBitmap.Label.TextSiz";
mostCurrent._listviewresult.getTwoLinesAndBitmap().Label.setTextSize((float) (15));
RDebugUtils.currentLine=5898278;
 //BA.debugLineNum = 5898278;BA.debugLine="ListViewResult.TwoLinesAndBitmap.Label.TextCol";
mostCurrent._listviewresult.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=5898279;
 //BA.debugLineNum = 5898279;BA.debugLine="ListViewResult.TwoLinesAndBitmap.Label.Gravity";
mostCurrent._listviewresult.getTwoLinesAndBitmap().Label.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=5898280;
 //BA.debugLineNum = 5898280;BA.debugLine="ListViewResult.TwoLinesAndBitmap.Label.Typefac";
mostCurrent._listviewresult.getTwoLinesAndBitmap().Label.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=5898281;
 //BA.debugLineNum = 5898281;BA.debugLine="ListViewResult.Color=Colors.rgb(187,222,251)";
mostCurrent._listviewresult.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (187),(int) (222),(int) (251)));
RDebugUtils.currentLine=5898283;
 //BA.debugLineNum = 5898283;BA.debugLine="ListViewResult.TwoLinesAndBitmap.SecondLabel.T";
mostCurrent._listviewresult.getTwoLinesAndBitmap().SecondLabel.setTextSize((float) (12));
RDebugUtils.currentLine=5898284;
 //BA.debugLineNum = 5898284;BA.debugLine="ListViewResult.TwoLinesAndBitmap.SecondLabel.T";
mostCurrent._listviewresult.getTwoLinesAndBitmap().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
RDebugUtils.currentLine=5898285;
 //BA.debugLineNum = 5898285;BA.debugLine="ListViewResult.TwoLinesAndBitmap.SecondLabel.G";
mostCurrent._listviewresult.getTwoLinesAndBitmap().SecondLabel.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=5898286;
 //BA.debugLineNum = 5898286;BA.debugLine="ListViewResult.TwoLinesAndBitmap.SecondLabel.T";
mostCurrent._listviewresult.getTwoLinesAndBitmap().SecondLabel.setTypeface((android.graphics.Typeface)(mostCurrent._main._font.getObject()));
RDebugUtils.currentLine=5898288;
 //BA.debugLineNum = 5898288;BA.debugLine="ListViewResult.ScrollingBackgroundColor = Colors.";
mostCurrent._listviewresult.setScrollingBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (10),(int) (144),(int) (156)));
RDebugUtils.currentLine=5898292;
 //BA.debugLineNum = 5898292;BA.debugLine="loadResult";
_loadresult();
RDebugUtils.currentLine=5898295;
 //BA.debugLineNum = 5898295;BA.debugLine="End Sub";
return "";
}
public static String  _loadresult() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("loadresult"))
	return (String) Debug.delegate(mostCurrent.activityBA, "loadresult", null);
int _selectedtype = 0;
String _itemtitle = "";
String _itemdesc = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _extract = null;
String _tag = "";
int _vip = 0;
int _super = 0;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub loadResult";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim selectedType As Int";
_selectedtype = 0;
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Dim itemTitle As String";
_itemtitle = "";
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Dim itemDesc As String";
_itemdesc = "";
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="LabelPage.Text = pageNumber";
mostCurrent._labelpage.setText((Object)(_pagenumber));
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="resultCount = Main.searchResult.Size";
_resultcount = mostCurrent._main._searchresult.getSize();
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="Try";
try {RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="ListViewResult.Clear";
mostCurrent._listviewresult.Clear();
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="For i= 0 To Main.searchResult.Size -1";
{
final int step9 = 1;
final int limit9 = (int) (mostCurrent._main._searchresult.getSize()-1);
for (_i = (int) (0) ; (step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9); _i = ((int)(0 + _i + step9)) ) {
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="Dim extract As Map";
_extract = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="Dim tag As String";
_tag = "";
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="Dim vip As Int";
_vip = 0;
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="Dim super As Int";
_super = 0;
RDebugUtils.currentLine=5963794;
 //BA.debugLineNum = 5963794;BA.debugLine="extract.Initialize()";
_extract.Initialize();
RDebugUtils.currentLine=5963796;
 //BA.debugLineNum = 5963796;BA.debugLine="extract  = Main.searchResult.Get(i)";
_extract.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._main._searchresult.Get(_i)));
RDebugUtils.currentLine=5963797;
 //BA.debugLineNum = 5963797;BA.debugLine="tag=Main.ostan(extract.Get(\"ostanId\"))";
_tag = mostCurrent._main._ostan[(int)(BA.ObjectToNumber(_extract.Get((Object)("ostanId"))))];
RDebugUtils.currentLine=5963799;
 //BA.debugLineNum = 5963799;BA.debugLine="selectedType=extract.Get(\"telgroupTypeId\")";
_selectedtype = (int)(BA.ObjectToNumber(_extract.Get((Object)("telgroupTypeId"))));
RDebugUtils.currentLine=5963801;
 //BA.debugLineNum = 5963801;BA.debugLine="itemDesc = extract.Get(\"description\")";
_itemdesc = BA.ObjectToString(_extract.Get((Object)("description")));
RDebugUtils.currentLine=5963802;
 //BA.debugLineNum = 5963802;BA.debugLine="If itemDesc.Length > 20 Then";
if (_itemdesc.length()>20) { 
RDebugUtils.currentLine=5963803;
 //BA.debugLineNum = 5963803;BA.debugLine="itemDesc=itemDesc.SubString(20)";
_itemdesc = _itemdesc.substring((int) (20));
 };
RDebugUtils.currentLine=5963805;
 //BA.debugLineNum = 5963805;BA.debugLine="itemTitle= extract.Get(\"title\")";
_itemtitle = BA.ObjectToString(_extract.Get((Object)("title")));
RDebugUtils.currentLine=5963808;
 //BA.debugLineNum = 5963808;BA.debugLine="Select selectedType";
switch (_selectedtype) {
case 2: {
RDebugUtils.currentLine=5963812;
 //BA.debugLineNum = 5963812;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(mostCurrent._main._idicon.getObject()),(Object)(_extract.getObject()));
 break; }
case 3: {
RDebugUtils.currentLine=5963817;
 //BA.debugLineNum = 5963817;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(mostCurrent._main._stickericon.getObject()),(Object)(_extract.getObject()));
 break; }
case 11: {
RDebugUtils.currentLine=5963822;
 //BA.debugLineNum = 5963822;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(mostCurrent._main._stickericon.getObject()),(Object)(_extract.getObject()));
 break; }
case 4: {
RDebugUtils.currentLine=5963827;
 //BA.debugLineNum = 5963827;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(mostCurrent._main._roboticon.getObject()),(Object)(_extract.getObject()));
 break; }
case 7: {
RDebugUtils.currentLine=5963833;
 //BA.debugLineNum = 5963833;BA.debugLine="super =extract.Get(\"isSuperGroup\")";
_super = (int)(BA.ObjectToNumber(_extract.Get((Object)("isSuperGroup"))));
RDebugUtils.currentLine=5963834;
 //BA.debugLineNum = 5963834;BA.debugLine="vip =extract.Get(\"isVIP\")";
_vip = (int)(BA.ObjectToNumber(_extract.Get((Object)("isVIP"))));
RDebugUtils.currentLine=5963836;
 //BA.debugLineNum = 5963836;BA.debugLine="If(vip = 1  )Then";
if ((_vip==1)) { 
RDebugUtils.currentLine=5963837;
 //BA.debugLineNum = 5963837;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"vip_channel.png").getObject()),(Object)(_extract.getObject()));
 }else 
{RDebugUtils.currentLine=5963843;
 //BA.debugLineNum = 5963843;BA.debugLine="Else If( super = 1) Then";
if ((_super==1)) { 
RDebugUtils.currentLine=5963844;
 //BA.debugLineNum = 5963844;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"gov_channel.png").getObject()),(Object)(_extract.getObject()));
 }else {
RDebugUtils.currentLine=5963850;
 //BA.debugLineNum = 5963850;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(mostCurrent._main._channelicon.getObject()),(Object)(_extract.getObject()));
 }};
 break; }
case 9: {
RDebugUtils.currentLine=5963857;
 //BA.debugLineNum = 5963857;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"adsicon.png").getObject()),(Object)(_extract.getObject()));
 break; }
case 10: {
RDebugUtils.currentLine=5963862;
 //BA.debugLineNum = 5963862;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"comment.png").getObject()),(Object)(_extract.getObject()));
 break; }
default: {
RDebugUtils.currentLine=5963869;
 //BA.debugLineNum = 5963869;BA.debugLine="super =extract.Get(\"isSuperGroup\")";
_super = (int)(BA.ObjectToNumber(_extract.Get((Object)("isSuperGroup"))));
RDebugUtils.currentLine=5963870;
 //BA.debugLineNum = 5963870;BA.debugLine="vip =extract.Get(\"isVIP\")";
_vip = (int)(BA.ObjectToNumber(_extract.Get((Object)("isVIP"))));
RDebugUtils.currentLine=5963872;
 //BA.debugLineNum = 5963872;BA.debugLine="If(vip = 1  )Then";
if ((_vip==1)) { 
RDebugUtils.currentLine=5963873;
 //BA.debugLineNum = 5963873;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"adsicon.png").getObject()),(Object)(_extract.getObject()));
 }else 
{RDebugUtils.currentLine=5963878;
 //BA.debugLineNum = 5963878;BA.debugLine="Else If( super = 1) Then";
if ((_super==1)) { 
RDebugUtils.currentLine=5963879;
 //BA.debugLineNum = 5963879;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ispremium.png").getObject()),(Object)(_extract.getObject()));
 }else {
RDebugUtils.currentLine=5963885;
 //BA.debugLineNum = 5963885;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
mostCurrent._listviewresult.AddTwoLinesAndBitmap2(_itemtitle,_tag+"#"+_itemdesc,(android.graphics.Bitmap)(mostCurrent._main._groupicon.getObject()),(Object)(_extract.getObject()));
 }};
 break; }
}
;
 }
};
 } 
       catch (Exception e106) {
			processBA.setLastException(e106);RDebugUtils.currentLine=5963896;
 //BA.debugLineNum = 5963896;BA.debugLine="Msgbox(\"خطا در نمایش نتایج جستجو\",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در نمایش نتایج جستجو","خطا",mostCurrent.activityBA);
RDebugUtils.currentLine=5963897;
 //BA.debugLineNum = 5963897;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=5963899;
 //BA.debugLineNum = 5963899;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("activity_pause"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_pause", new Object[] {_userclosed});
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("btnmenu_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null);
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
mostCurrent._navi.OpenDrawer2(mostCurrent._navi.GRAVITY_RIGHT);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
public static String  _btnnext_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("btnnext_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnnext_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub btnNext_Click";
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="If(resultCount < 15 )Then";
if ((_resultcount<15)) { 
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="Try";
try {RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="job.Initialize(\"next\", Me)";
_job._initialize(null,processBA,"next",searchresultact.getObject());
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="job.PostString(Main.query & \"/\" & (pageNumber* 1";
_job._poststring(null,mostCurrent._main._query+"/"+BA.NumberToString((_pagenumber*15))+"/"+BA.NumberToString(((_pagenumber+1)*15)),mostCurrent._main._parameter);
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="pageNumber = pageNumber +1";
_pagenumber = (int) (_pagenumber+1);
 } 
       catch (Exception e198) {
			processBA.setLastException(e198);RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="End Sub";
return "";
}
public static String  _btnpanel_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("btnpanel_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnpanel_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub btnPanel_Click";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
anywheresoftware.b4a.keywords.Common.Msgbox("نام کاربری شما :"+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("user_name")))+anywheresoftware.b4a.keywords.Common.CRLF+" رمز عبور اولیه شما "+BA.ObjectToString(mostCurrent._main._userinfo.Get((Object)("pass")))+" می باشد","رمز عبور",mostCurrent.activityBA);
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/")));
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="End Sub";
return "";
}
public static String  _btnprev_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("btnprev_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnprev_click", null);
Telegram.Search.httpjob _job = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub btnPrev_Click";
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="If(pageNumber = 0 )Then";
if ((_pagenumber==0)) { 
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Try";
try {RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Dim job As HttpJob";
_job = new Telegram.Search.httpjob();
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"درحال دریافت");
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="job.Initialize(\"prev\", Me)";
_job._initialize(null,processBA,"prev",searchresultact.getObject());
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="pageNumber = pageNumber -1";
_pagenumber = (int) (_pagenumber-1);
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="job.PostString(Main.query & \"/\" & ((pageNumber-1";
_job._poststring(null,mostCurrent._main._query+"/"+BA.NumberToString(((_pagenumber-1)*15))+"/"+BA.NumberToString((_pagenumber*15)),mostCurrent._main._parameter);
 } 
       catch (Exception e184) {
			processBA.setLastException(e184);RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="End Sub";
return "";
}
public static String  _btnreturn_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("btnreturn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnreturn_click", null);
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub btnReturn_Click";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(Telegram.Search.httpjob _job) throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _countries = null;
anywheresoftware.b4a.objects.collections.List _rows = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _row = null;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Main.searchResult.Initialize()";
mostCurrent._main._searchresult.Initialize();
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Main.searchResult.Clear()";
mostCurrent._main._searchresult.Clear();
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Try";
try {RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="res = Job.GetString";
_res = _job._getstring(null);
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="If 	Job.JobName= \"next\" Or Job.JobName= \"prev\"";
if ((_job._jobname).equals("next") || (_job._jobname).equals("prev")) { 
RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="Dim COUNTRIES As List";
_countries = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6291471;
 //BA.debugLineNum = 6291471;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list";
_countries = _parser.NextArray();
RDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6291474;
 //BA.debugLineNum = 6291474;BA.debugLine="rows= COUNTRIES.Get(0)";
_rows.setObject((java.util.List)(_countries.Get((int) (0))));
RDebugUtils.currentLine=6291476;
 //BA.debugLineNum = 6291476;BA.debugLine="If(rows.Size > 0 ) Then";
if ((_rows.getSize()>0)) { 
RDebugUtils.currentLine=6291478;
 //BA.debugLineNum = 6291478;BA.debugLine="For i= 0 To rows.Size-1";
{
final int step16 = 1;
final int limit16 = (int) (_rows.getSize()-1);
for (_i = (int) (0) ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
RDebugUtils.currentLine=6291479;
 //BA.debugLineNum = 6291479;BA.debugLine="Dim row As Map";
_row = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6291481;
 //BA.debugLineNum = 6291481;BA.debugLine="row.Initialize()";
_row.Initialize();
RDebugUtils.currentLine=6291482;
 //BA.debugLineNum = 6291482;BA.debugLine="row=rows.Get(i)";
_row.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rows.Get(_i)));
RDebugUtils.currentLine=6291483;
 //BA.debugLineNum = 6291483;BA.debugLine="Main.searchResult.Add(row)";
mostCurrent._main._searchresult.Add((Object)(_row.getObject()));
 }
};
RDebugUtils.currentLine=6291486;
 //BA.debugLineNum = 6291486;BA.debugLine="loadResult";
_loadresult();
 }else {
RDebugUtils.currentLine=6291488;
 //BA.debugLineNum = 6291488;BA.debugLine="Msgbox(\"موردی با مشخصات درخواستی شما یافت نش";
anywheresoftware.b4a.keywords.Common.Msgbox("موردی با مشخصات درخواستی شما یافت نشد . از بخش آخرین "+mostCurrent._main._selectedtypetitle+"ها هم می توانید "+mostCurrent._main._selectedtypetitle+" مورد نظر خود را پیدا کنید  . ","جستجو",mostCurrent.activityBA);
 };
 };
 }else {
RDebugUtils.currentLine=6291493;
 //BA.debugLineNum = 6291493;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .",anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e170) {
			processBA.setLastException(e170);RDebugUtils.currentLine=6291496;
 //BA.debugLineNum = 6291496;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات جستجو  \",\"خطا\")";
anywheresoftware.b4a.keywords.Common.Msgbox("خطا در دریافت اطلاعات جستجو  ","خطا",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=6291499;
 //BA.debugLineNum = 6291499;BA.debugLine="End Sub";
return "";
}
public static String  _listviewresult_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("listviewresult_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "listviewresult_itemclick", new Object[] {_position,_value});
int _itemtype = 0;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub ListViewResult_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Main.selected_item = Value";
mostCurrent._main._selected_item.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="If Main.isEdit = True Then";
if (mostCurrent._main._isedit==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Dim itemType As Int";
_itemtype = 0;
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="itemType = Main.selected_item.Get(\"telgroupTypeI";
_itemtype = (int)(BA.ObjectToNumber(mostCurrent._main._selected_item.Get((Object)("telgroupTypeId"))));
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Select (itemType )";
switch (BA.switchObjectToInt((_itemtype),(int) (2),(int) (3),(int) (4),(int) (7))) {
case 0: {
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="Main.selectedType=\"id\"";
mostCurrent._main._selectedtype = "id";
 break; }
case 1: {
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="Main.selectedType=\"sticker\"";
mostCurrent._main._selectedtype = "sticker";
 break; }
case 2: {
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="Main.selectedType=\"robot\"";
mostCurrent._main._selectedtype = "robot";
 break; }
case 3: {
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="Main.selectedType=\"channel\"";
mostCurrent._main._selectedtype = "channel";
 break; }
default: {
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="Main.selectedType=\"group\"";
mostCurrent._main._selectedtype = "group";
 break; }
}
;
RDebugUtils.currentLine=6225939;
 //BA.debugLineNum = 6225939;BA.debugLine="StartActivity(\"insertAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("insertAct"));
 }else {
RDebugUtils.currentLine=6225941;
 //BA.debugLineNum = 6225941;BA.debugLine="StartActivity(\"groupViewAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("groupViewAct"));
 };
RDebugUtils.currentLine=6225944;
 //BA.debugLineNum = 6225944;BA.debugLine="End Sub";
return "";
}
public static String  _menuabout_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("menuabout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuabout_click", null);
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub MenuAbout_Click";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="StartActivity(\"AboutAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("AboutAct"));
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="End Sub";
return "";
}
public static String  _menucontact_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("menucontact_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menucontact_click", null);
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub MenuContact_Click";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="StartActivity(\"contactAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("contactAct"));
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="End Sub";
return "";
}
public static String  _menuexit_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("menuexit_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuexit_click", null);
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub MenuExit_Click";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="End Sub";
return "";
}
public static String  _menuhelp_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("menuhelp_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuhelp_click", null);
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub MenuHelp_Click";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="StartActivity(\"helpAct\")";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)("helpAct"));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="End Sub";
return "";
}
public static String  _menuorder_click() throws Exception{
RDebugUtils.currentModule="searchresultact";
if (Debug.shouldDelegate("menuorder_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "menuorder_click", null);
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub MenuOrder_Click";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_p.OpenBrowser("http://aloosalam.ir/index.php/login/index/1")));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
mostCurrent._navi.CloseDrawer2(anywheresoftware.b4a.keywords.Common.Gravity.RIGHT);
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return "";
}
}