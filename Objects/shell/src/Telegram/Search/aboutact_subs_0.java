package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class aboutact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) return aboutact.remoteMe.runUserSub(false, "aboutact","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
Debug.ShouldStop(8);
aboutact.mostCurrent._navi.runVoidMethod ("Initialize2",aboutact.mostCurrent.activityBA,(Object)(BA.ObjectToString("navi")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), aboutact.mostCurrent._activity.getObject()),(Object)(aboutact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),aboutact.mostCurrent.activityBA)),(Object)(aboutact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 38;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
Debug.ShouldStop(32);
aboutact.mostCurrent._navi.runMethod(false,"getNavigationPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menu")),aboutact.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(128);
aboutact.mostCurrent._pcantent.runVoidMethod ("Initialize",aboutact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 41;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
Debug.ShouldStop(256);
aboutact.mostCurrent._navi.runMethod(false,"getContentPanel").runVoidMethod ("AddView",(Object)((aboutact.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(aboutact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),aboutact.mostCurrent.activityBA)),(Object)(aboutact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),aboutact.mostCurrent.activityBA)));
 BA.debugLineNum = 42;BA.debugLine="pCantent.SendToBack";
Debug.ShouldStop(512);
aboutact.mostCurrent._pcantent.runVoidMethod ("SendToBack");
 BA.debugLineNum = 43;BA.debugLine="pCantent.LoadLayout(\"aboutview\")";
Debug.ShouldStop(1024);
aboutact.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("aboutview")),aboutact.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="Activity.Title=\"درباره برنامه\"";
Debug.ShouldStop(2048);
aboutact.mostCurrent._activity.runMethod(false,"setTitle",RemoteObject.createImmutable(("درباره برنامه")));
 BA.debugLineNum = 45;BA.debugLine="ImageView1.Bitmap = Main.groupIcon";
Debug.ShouldStop(4096);
aboutact.mostCurrent._imageview1.runMethod(false,"setBitmap",(aboutact.mostCurrent._main._groupicon.getObject()));
 BA.debugLineNum = 47;BA.debugLine="Label1.TextSize=15";
Debug.ShouldStop(16384);
aboutact.mostCurrent._label1.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 48;BA.debugLine="Label1.Gravity=Gravity.RIGHT";
Debug.ShouldStop(32768);
aboutact.mostCurrent._label1.runMethod(true,"setGravity",aboutact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 49;BA.debugLine="Label1.Typeface =Main.font";
Debug.ShouldStop(65536);
aboutact.mostCurrent._label1.runMethod(false,"setTypeface",(aboutact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 50;BA.debugLine="Label1.TextColor =Colors.Black";
Debug.ShouldStop(131072);
aboutact.mostCurrent._label1.runMethod(true,"setTextColor",aboutact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 52;BA.debugLine="ImageView2.Initialize(\"\")";
Debug.ShouldStop(524288);
aboutact.mostCurrent._imageview2.runVoidMethod ("Initialize",aboutact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 53;BA.debugLine="ImageView1.Initialize(\"\")";
Debug.ShouldStop(1048576);
aboutact.mostCurrent._imageview1.runVoidMethod ("Initialize",aboutact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 55;BA.debugLine="ImageView2.Bitmap =LoadBitmap(File.DirAssets,\"rob";
Debug.ShouldStop(4194304);
aboutact.mostCurrent._imageview2.runMethod(false,"setBitmap",(aboutact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(aboutact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("robo_back.jpg"))).getObject()));
 BA.debugLineNum = 56;BA.debugLine="ImageView1.Bitmap = Main.groupIcon";
Debug.ShouldStop(8388608);
aboutact.mostCurrent._imageview1.runMethod(false,"setBitmap",(aboutact.mostCurrent._main._groupicon.getObject()));
 BA.debugLineNum = 58;BA.debugLine="Panel2.RemoveView";
Debug.ShouldStop(33554432);
aboutact.mostCurrent._panel2.runVoidMethod ("RemoveView");
 BA.debugLineNum = 60;BA.debugLine="ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width";
Debug.ShouldStop(134217728);
aboutact.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((aboutact.mostCurrent._panel2.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(aboutact.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(aboutact.mostCurrent._panel2.runMethod(true,"getHeight")));
 BA.debugLineNum = 61;BA.debugLine="ScrollView1.Panel.Height = 760dip";
Debug.ShouldStop(268435456);
aboutact.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",aboutact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 760))));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,69);
if (RapidSub.canDelegate("activity_pause")) return aboutact.remoteMe.runUserSub(false, "aboutact","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,65);
if (RapidSub.canDelegate("activity_resume")) return aboutact.remoteMe.runUserSub(false, "aboutact","activity_resume");
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("btnBack_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,73);
if (RapidSub.canDelegate("btnback_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","btnback_click");
 BA.debugLineNum = 73;BA.debugLine="Sub btnBack_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
aboutact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,30);
if (RapidSub.canDelegate("btnmenu_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","btnmenu_click");
 BA.debugLineNum = 30;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
Debug.ShouldStop(1073741824);
aboutact.mostCurrent._navi.runVoidMethod ("OpenDrawer2",(Object)(aboutact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnopenpage_click() throws Exception{
try {
		Debug.PushSubsStack("btnOpenPage_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,77);
if (RapidSub.canDelegate("btnopenpage_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","btnopenpage_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
RemoteObject _ointent = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 77;BA.debugLine="Sub btnOpenPage_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 80;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 81;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 83;BA.debugLine="Dim oIntent As Intent";
Debug.ShouldStop(262144);
_ointent = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("oIntent", _ointent);
 BA.debugLineNum = 84;BA.debugLine="oIntent.Initialize(oIntent.ACTION_VIEW,\"bazaar:/";
Debug.ShouldStop(524288);
_ointent.runVoidMethod ("Initialize",(Object)(_ointent.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("bazaar://details?id=Telegram.Group")));
 BA.debugLineNum = 85;BA.debugLine="oIntent.SetComponent(\"com.farsitel.bazaar\")";
Debug.ShouldStop(1048576);
_ointent.runVoidMethod ("SetComponent",(Object)(RemoteObject.createImmutable("com.farsitel.bazaar")));
 BA.debugLineNum = 86;BA.debugLine="StartActivity(oIntent)";
Debug.ShouldStop(2097152);
aboutact.mostCurrent.__c.runVoidMethod ("StartActivity",aboutact.mostCurrent.activityBA,(Object)((_ointent.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e52) {
			BA.rdebugUtils.runVoidMethod("setLastException",aboutact.processBA, e52.toString()); BA.debugLineNum = 89;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir";
Debug.ShouldStop(16777216);
aboutact.mostCurrent.__c.runVoidMethod ("StartActivity",aboutact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir"))))));
 };
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpanel_click() throws Exception{
try {
		Debug.PushSubsStack("btnPanel_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,123);
if (RapidSub.canDelegate("btnpanel_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","btnpanel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 123;BA.debugLine="Sub btnPanel_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 125;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(268435456);
aboutact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),aboutact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),aboutact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),aboutact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),aboutact.mostCurrent.activityBA);
 BA.debugLineNum = 128;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(-2147483648);
aboutact.mostCurrent.__c.runVoidMethod ("StartActivity",aboutact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/"))))));
 BA.debugLineNum = 129;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(1);
aboutact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(aboutact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonchannel_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonChannel_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,102);
if (RapidSub.canDelegate("buttonchannel_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","buttonchannel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 102;BA.debugLine="Sub ButtonChannel_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 104;BA.debugLine="StartActivity(p.OpenBrowser(\"https://telegram.me/";
Debug.ShouldStop(128);
aboutact.mostCurrent.__c.runVoidMethod ("StartActivity",aboutact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("https://telegram.me/mamadar_ir"))))));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private btnMenu As Button";
aboutact.mostCurrent._btnmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label1 As Label";
aboutact.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label5 As Label";
aboutact.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim navi As AHNavigationDrawer";
aboutact.mostCurrent._navi = RemoteObject.createNew ("de.amberhome.navdrawer.NavigationDrawer");
 //BA.debugLineNum = 23;BA.debugLine="Dim pCantent As Panel";
aboutact.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ImageView1 As ImageView";
aboutact.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ImageView2 As ImageView";
aboutact.mostCurrent._imageview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Panel2 As Panel";
aboutact.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ScrollView1 As ScrollView";
aboutact.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _menuabout_click() throws Exception{
try {
		Debug.PushSubsStack("MenuAbout_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,98);
if (RapidSub.canDelegate("menuabout_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","menuabout_click");
 BA.debugLineNum = 98;BA.debugLine="Sub MenuAbout_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="StartActivity(\"AboutAct\")";
Debug.ShouldStop(4);
aboutact.mostCurrent.__c.runVoidMethod ("StartActivity",aboutact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("AboutAct"))));
 BA.debugLineNum = 100;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(8);
aboutact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(aboutact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menucontact_click() throws Exception{
try {
		Debug.PushSubsStack("MenuContact_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,119);
if (RapidSub.canDelegate("menucontact_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","menucontact_click");
 BA.debugLineNum = 119;BA.debugLine="Sub MenuContact_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="StartActivity(\"contactAct\")";
Debug.ShouldStop(8388608);
aboutact.mostCurrent.__c.runVoidMethod ("StartActivity",aboutact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("contactAct"))));
 BA.debugLineNum = 121;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(16777216);
aboutact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(aboutact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menuexit_click() throws Exception{
try {
		Debug.PushSubsStack("MenuExit_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,108);
if (RapidSub.canDelegate("menuexit_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","menuexit_click");
 BA.debugLineNum = 108;BA.debugLine="Sub MenuExit_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="ExitApplication";
Debug.ShouldStop(8192);
aboutact.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menuhelp_click() throws Exception{
try {
		Debug.PushSubsStack("MenuHelp_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,94);
if (RapidSub.canDelegate("menuhelp_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","menuhelp_click");
 BA.debugLineNum = 94;BA.debugLine="Sub MenuHelp_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="StartActivity(\"helpAct\")";
Debug.ShouldStop(1073741824);
aboutact.mostCurrent.__c.runVoidMethod ("StartActivity",aboutact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("helpAct"))));
 BA.debugLineNum = 96;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(-2147483648);
aboutact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(aboutact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menuorder_click() throws Exception{
try {
		Debug.PushSubsStack("MenuOrder_Click (aboutact) ","aboutact",2,aboutact.mostCurrent.activityBA,aboutact.mostCurrent,114);
if (RapidSub.canDelegate("menuorder_click")) return aboutact.remoteMe.runUserSub(false, "aboutact","menuorder_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 114;BA.debugLine="Sub MenuOrder_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 116;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(524288);
aboutact.mostCurrent.__c.runVoidMethod ("StartActivity",aboutact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/index/1"))))));
 BA.debugLineNum = 117;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(1048576);
aboutact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(aboutact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}