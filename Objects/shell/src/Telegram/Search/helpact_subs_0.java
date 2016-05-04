package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class helpact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) return helpact.remoteMe.runUserSub(false, "helpact","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 42;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
Debug.ShouldStop(512);
helpact.mostCurrent._navi.runVoidMethod ("Initialize2",helpact.mostCurrent.activityBA,(Object)(BA.ObjectToString("navi")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), helpact.mostCurrent._activity.getObject()),(Object)(helpact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),helpact.mostCurrent.activityBA)),(Object)(helpact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 46;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
Debug.ShouldStop(8192);
helpact.mostCurrent._navi.runMethod(false,"getNavigationPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menu")),helpact.mostCurrent.activityBA);
 BA.debugLineNum = 48;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(32768);
helpact.mostCurrent._pcantent.runVoidMethod ("Initialize",helpact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 49;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
Debug.ShouldStop(65536);
helpact.mostCurrent._navi.runMethod(false,"getContentPanel").runVoidMethod ("AddView",(Object)((helpact.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(helpact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),helpact.mostCurrent.activityBA)),(Object)(helpact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),helpact.mostCurrent.activityBA)));
 BA.debugLineNum = 50;BA.debugLine="pCantent.SendToBack";
Debug.ShouldStop(131072);
helpact.mostCurrent._pcantent.runVoidMethod ("SendToBack");
 BA.debugLineNum = 51;BA.debugLine="pCantent.LoadLayout(\"helpView\")";
Debug.ShouldStop(262144);
helpact.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("helpView")),helpact.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="Panel1.Color = Colors.White";
Debug.ShouldStop(1048576);
helpact.mostCurrent._panel1.runVoidMethod ("setColor",helpact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 55;BA.debugLine="Label2.Typeface = Main.font";
Debug.ShouldStop(4194304);
helpact.mostCurrent._label2.runMethod(false,"setTypeface",(helpact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 56;BA.debugLine="Label2.TextSize = 15";
Debug.ShouldStop(8388608);
helpact.mostCurrent._label2.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 57;BA.debugLine="Label2.TextColor = Colors.Black";
Debug.ShouldStop(16777216);
helpact.mostCurrent._label2.runMethod(true,"setTextColor",helpact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 58;BA.debugLine="Label2.Gravity = Gravity.RIGHT";
Debug.ShouldStop(33554432);
helpact.mostCurrent._label2.runMethod(true,"setGravity",helpact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 59;BA.debugLine="Label1.Typeface = Main.font";
Debug.ShouldStop(67108864);
helpact.mostCurrent._label1.runMethod(false,"setTypeface",(helpact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 60;BA.debugLine="Label1.TextSize = 15";
Debug.ShouldStop(134217728);
helpact.mostCurrent._label1.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 61;BA.debugLine="Label1.TextColor= Colors.Black";
Debug.ShouldStop(268435456);
helpact.mostCurrent._label1.runMethod(true,"setTextColor",helpact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 62;BA.debugLine="Label1.Gravity = Gravity.RIGHT";
Debug.ShouldStop(536870912);
helpact.mostCurrent._label1.runMethod(true,"setGravity",helpact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 63;BA.debugLine="Label3.Typeface = Main.font";
Debug.ShouldStop(1073741824);
helpact.mostCurrent._label3.runMethod(false,"setTypeface",(helpact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 64;BA.debugLine="Label3.TextSize = 15";
Debug.ShouldStop(-2147483648);
helpact.mostCurrent._label3.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 65;BA.debugLine="Label3.TextColor = Colors.Black";
Debug.ShouldStop(1);
helpact.mostCurrent._label3.runMethod(true,"setTextColor",helpact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 66;BA.debugLine="Label3.Gravity = Gravity.RIGHT";
Debug.ShouldStop(2);
helpact.mostCurrent._label3.runMethod(true,"setGravity",helpact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 67;BA.debugLine="Panel2.RemoveView";
Debug.ShouldStop(4);
helpact.mostCurrent._panel2.runVoidMethod ("RemoveView");
 BA.debugLineNum = 68;BA.debugLine="ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width";
Debug.ShouldStop(8);
helpact.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((helpact.mostCurrent._panel2.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(helpact.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(helpact.mostCurrent._panel2.runMethod(true,"getHeight")));
 BA.debugLineNum = 69;BA.debugLine="ScrollView1.Panel.Height = 1180dip";
Debug.ShouldStop(16);
helpact.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",helpact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1180))));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,76);
if (RapidSub.canDelegate("activity_pause")) return helpact.remoteMe.runUserSub(false, "helpact","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 76;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,72);
if (RapidSub.canDelegate("activity_resume")) return helpact.remoteMe.runUserSub(false, "helpact","activity_resume");
 BA.debugLineNum = 72;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,32);
if (RapidSub.canDelegate("btnmenu_click")) return helpact.remoteMe.runUserSub(false, "helpact","btnmenu_click");
 BA.debugLineNum = 32;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
Debug.ShouldStop(1);
helpact.mostCurrent._navi.runVoidMethod ("OpenDrawer2",(Object)(helpact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
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
public static RemoteObject  _btnopenpage_click() throws Exception{
try {
		Debug.PushSubsStack("btnOpenPage_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,118);
if (RapidSub.canDelegate("btnopenpage_click")) return helpact.remoteMe.runUserSub(false, "helpact","btnopenpage_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 118;BA.debugLine="Sub btnOpenPage_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 120;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(8388608);
helpact.mostCurrent.__c.runVoidMethod ("StartActivity",helpact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/"))))));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnPanel_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,109);
if (RapidSub.canDelegate("btnpanel_click")) return helpact.remoteMe.runUserSub(false, "helpact","btnpanel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 109;BA.debugLine="Sub btnPanel_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 111;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(16384);
helpact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),helpact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),helpact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),helpact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),helpact.mostCurrent.activityBA);
 BA.debugLineNum = 114;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(131072);
helpact.mostCurrent.__c.runVoidMethod ("StartActivity",helpact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/"))))));
 BA.debugLineNum = 115;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(262144);
helpact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(helpact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnreturn_click() throws Exception{
try {
		Debug.PushSubsStack("btnReturn_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,102);
if (RapidSub.canDelegate("btnreturn_click")) return helpact.remoteMe.runUserSub(false, "helpact","btnreturn_click");
 BA.debugLineNum = 102;BA.debugLine="Sub btnReturn_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
helpact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 17;BA.debugLine="Dim navi As AHNavigationDrawer";
helpact.mostCurrent._navi = RemoteObject.createNew ("de.amberhome.navdrawer.NavigationDrawer");
 //BA.debugLineNum = 18;BA.debugLine="Dim pCantent As Panel";
helpact.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnMenu As Button";
helpact.mostCurrent._btnmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnReturn As Button";
helpact.mostCurrent._btnreturn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Panel1 As Panel";
helpact.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Label3 As Label";
helpact.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Panel2 As Panel";
helpact.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Label2 As Label";
helpact.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Label1 As Label";
helpact.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ScrollView1 As ScrollView";
helpact.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _menuabout_click() throws Exception{
try {
		Debug.PushSubsStack("MenuAbout_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,86);
if (RapidSub.canDelegate("menuabout_click")) return helpact.remoteMe.runUserSub(false, "helpact","menuabout_click");
 BA.debugLineNum = 86;BA.debugLine="Sub MenuAbout_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="StartActivity(\"AboutAct\")";
Debug.ShouldStop(4194304);
helpact.mostCurrent.__c.runVoidMethod ("StartActivity",helpact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("AboutAct"))));
 BA.debugLineNum = 88;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(8388608);
helpact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(helpact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("MenuContact_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,105);
if (RapidSub.canDelegate("menucontact_click")) return helpact.remoteMe.runUserSub(false, "helpact","menucontact_click");
 BA.debugLineNum = 105;BA.debugLine="Sub MenuContact_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="StartActivity(\"contactAct\")";
Debug.ShouldStop(512);
helpact.mostCurrent.__c.runVoidMethod ("StartActivity",helpact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("contactAct"))));
 BA.debugLineNum = 107;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(1024);
helpact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(helpact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("MenuExit_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,91);
if (RapidSub.canDelegate("menuexit_click")) return helpact.remoteMe.runUserSub(false, "helpact","menuexit_click");
 BA.debugLineNum = 91;BA.debugLine="Sub MenuExit_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="ExitApplication";
Debug.ShouldStop(268435456);
helpact.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
public static RemoteObject  _menuhelp_click() throws Exception{
try {
		Debug.PushSubsStack("MenuHelp_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,82);
if (RapidSub.canDelegate("menuhelp_click")) return helpact.remoteMe.runUserSub(false, "helpact","menuhelp_click");
 BA.debugLineNum = 82;BA.debugLine="Sub MenuHelp_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="StartActivity(\"helpAct\")";
Debug.ShouldStop(262144);
helpact.mostCurrent.__c.runVoidMethod ("StartActivity",helpact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("helpAct"))));
 BA.debugLineNum = 84;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(524288);
helpact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(helpact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("MenuOrder_Click (helpact) ","helpact",5,helpact.mostCurrent.activityBA,helpact.mostCurrent,97);
if (RapidSub.canDelegate("menuorder_click")) return helpact.remoteMe.runUserSub(false, "helpact","menuorder_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 97;BA.debugLine="Sub MenuOrder_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 99;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(4);
helpact.mostCurrent.__c.runVoidMethod ("StartActivity",helpact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/index/1"))))));
 BA.debugLineNum = 100;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(8);
helpact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(helpact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}