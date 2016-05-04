package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class contactact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,39);
if (RapidSub.canDelegate("activity_create")) return contactact.remoteMe.runUserSub(false, "contactact","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 43;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
Debug.ShouldStop(1024);
contactact.mostCurrent._navi.runVoidMethod ("Initialize2",contactact.mostCurrent.activityBA,(Object)(BA.ObjectToString("navi")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), contactact.mostCurrent._activity.getObject()),(Object)(contactact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),contactact.mostCurrent.activityBA)),(Object)(contactact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 47;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
Debug.ShouldStop(16384);
contactact.mostCurrent._navi.runMethod(false,"getNavigationPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menu")),contactact.mostCurrent.activityBA);
 BA.debugLineNum = 49;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(65536);
contactact.mostCurrent._pcantent.runVoidMethod ("Initialize",contactact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 50;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
Debug.ShouldStop(131072);
contactact.mostCurrent._navi.runMethod(false,"getContentPanel").runVoidMethod ("AddView",(Object)((contactact.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(contactact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),contactact.mostCurrent.activityBA)),(Object)(contactact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),contactact.mostCurrent.activityBA)));
 BA.debugLineNum = 51;BA.debugLine="pCantent.SendToBack";
Debug.ShouldStop(262144);
contactact.mostCurrent._pcantent.runVoidMethod ("SendToBack");
 BA.debugLineNum = 52;BA.debugLine="pCantent.LoadLayout(\"contact\")";
Debug.ShouldStop(524288);
contactact.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("contact")),contactact.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="Panel2.RemoveView";
Debug.ShouldStop(2097152);
contactact.mostCurrent._panel2.runVoidMethod ("RemoveView");
 BA.debugLineNum = 55;BA.debugLine="ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width";
Debug.ShouldStop(4194304);
contactact.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((contactact.mostCurrent._panel2.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(contactact.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(contactact.mostCurrent._panel2.runMethod(true,"getHeight")));
 BA.debugLineNum = 56;BA.debugLine="ScrollView1.Panel.Height = 600dip";
Debug.ShouldStop(8388608);
contactact.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",contactact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))));
 BA.debugLineNum = 58;BA.debugLine="Label6.TextColor= Colors.Black";
Debug.ShouldStop(33554432);
contactact.mostCurrent._label6.runMethod(true,"setTextColor",contactact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 59;BA.debugLine="Label6.Typeface = Main.font";
Debug.ShouldStop(67108864);
contactact.mostCurrent._label6.runMethod(false,"setTypeface",(contactact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 60;BA.debugLine="Label6.Gravity= Gravity.RIGHT";
Debug.ShouldStop(134217728);
contactact.mostCurrent._label6.runMethod(true,"setGravity",contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 61;BA.debugLine="Label1.TextColor= Colors.Black";
Debug.ShouldStop(268435456);
contactact.mostCurrent._label1.runMethod(true,"setTextColor",contactact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 62;BA.debugLine="Label1.Typeface = Main.font";
Debug.ShouldStop(536870912);
contactact.mostCurrent._label1.runMethod(false,"setTypeface",(contactact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 63;BA.debugLine="Label1.Gravity= Gravity.RIGHT";
Debug.ShouldStop(1073741824);
contactact.mostCurrent._label1.runMethod(true,"setGravity",contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 64;BA.debugLine="txtName.TextColor= Colors.Black";
Debug.ShouldStop(-2147483648);
contactact.mostCurrent._txtname.runMethod(true,"setTextColor",contactact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 65;BA.debugLine="txtName.Typeface = Main.font";
Debug.ShouldStop(1);
contactact.mostCurrent._txtname.runMethod(false,"setTypeface",(contactact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 66;BA.debugLine="txtName.Gravity= Gravity.RIGHT";
Debug.ShouldStop(2);
contactact.mostCurrent._txtname.runMethod(true,"setGravity",contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 67;BA.debugLine="txtName.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(4);
contactact.mostCurrent._txtname.runVoidMethod ("setColor",contactact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 69;BA.debugLine="Label2.TextColor= Colors.Black";
Debug.ShouldStop(16);
contactact.mostCurrent._label2.runMethod(true,"setTextColor",contactact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 70;BA.debugLine="Label2.Typeface = Main.font";
Debug.ShouldStop(32);
contactact.mostCurrent._label2.runMethod(false,"setTypeface",(contactact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 71;BA.debugLine="Label2.Gravity= Gravity.RIGHT";
Debug.ShouldStop(64);
contactact.mostCurrent._label2.runMethod(true,"setGravity",contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 72;BA.debugLine="txtTag.TextColor= Colors.Black";
Debug.ShouldStop(128);
contactact.mostCurrent._txttag.runMethod(true,"setTextColor",contactact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 73;BA.debugLine="txtTag.Typeface = Main.font";
Debug.ShouldStop(256);
contactact.mostCurrent._txttag.runMethod(false,"setTypeface",(contactact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 74;BA.debugLine="txtTag.Gravity= Gravity.RIGHT";
Debug.ShouldStop(512);
contactact.mostCurrent._txttag.runMethod(true,"setGravity",contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 75;BA.debugLine="txtTag.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(1024);
contactact.mostCurrent._txttag.runVoidMethod ("setColor",contactact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 77;BA.debugLine="Label3.TextColor= Colors.Black";
Debug.ShouldStop(4096);
contactact.mostCurrent._label3.runMethod(true,"setTextColor",contactact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 78;BA.debugLine="Label3.Typeface = Main.font";
Debug.ShouldStop(8192);
contactact.mostCurrent._label3.runMethod(false,"setTypeface",(contactact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 79;BA.debugLine="Label3.Gravity= Gravity.RIGHT";
Debug.ShouldStop(16384);
contactact.mostCurrent._label3.runMethod(true,"setGravity",contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 80;BA.debugLine="txtDescription.TextColor= Colors.Black";
Debug.ShouldStop(32768);
contactact.mostCurrent._txtdescription.runMethod(true,"setTextColor",contactact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 81;BA.debugLine="txtDescription.Typeface = Main.font";
Debug.ShouldStop(65536);
contactact.mostCurrent._txtdescription.runMethod(false,"setTypeface",(contactact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 82;BA.debugLine="txtDescription.Gravity= Gravity.RIGHT";
Debug.ShouldStop(131072);
contactact.mostCurrent._txtdescription.runMethod(true,"setGravity",contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 83;BA.debugLine="txtDescription.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(262144);
contactact.mostCurrent._txtdescription.runVoidMethod ("setColor",contactact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 86;BA.debugLine="ImageView1.Bitmap =LoadBitmap(File.DirAssets,\"sti";
Debug.ShouldStop(2097152);
contactact.mostCurrent._imageview1.runMethod(false,"setBitmap",(contactact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(contactact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sticker_back.jpg"))).getObject()));
 BA.debugLineNum = 87;BA.debugLine="ImageView2.Bitmap =Main.groupIcon";
Debug.ShouldStop(4194304);
contactact.mostCurrent._imageview2.runMethod(false,"setBitmap",(contactact.mostCurrent._main._groupicon.getObject()));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,95);
if (RapidSub.canDelegate("activity_pause")) return contactact.remoteMe.runUserSub(false, "contactact","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 95;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,91);
if (RapidSub.canDelegate("activity_resume")) return contactact.remoteMe.runUserSub(false, "contactact","activity_resume");
 BA.debugLineNum = 91;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnMenu_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,34);
if (RapidSub.canDelegate("btnmenu_click")) return contactact.remoteMe.runUserSub(false, "contactact","btnmenu_click");
 BA.debugLineNum = 34;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
Debug.ShouldStop(4);
contactact.mostCurrent._navi.runVoidMethod ("OpenDrawer2",(Object)(contactact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btnPanel_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,184);
if (RapidSub.canDelegate("btnpanel_click")) return contactact.remoteMe.runUserSub(false, "contactact","btnpanel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 184;BA.debugLine="Sub btnPanel_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 186;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(33554432);
contactact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),contactact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),contactact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),contactact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),contactact.mostCurrent.activityBA);
 BA.debugLineNum = 189;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(268435456);
contactact.mostCurrent.__c.runVoidMethod ("StartActivity",contactact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/"))))));
 BA.debugLineNum = 190;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(536870912);
contactact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 191;BA.debugLine="End Sub";
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
public static RemoteObject  _btnreturn_click() throws Exception{
try {
		Debug.PushSubsStack("btnReturn_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,178);
if (RapidSub.canDelegate("btnreturn_click")) return contactact.remoteMe.runUserSub(false, "contactact","btnreturn_click");
 BA.debugLineNum = 178;BA.debugLine="Sub btnReturn_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
contactact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 180;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonback_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBack_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,153);
if (RapidSub.canDelegate("buttonback_click")) return contactact.remoteMe.runUserSub(false, "contactact","buttonback_click");
 BA.debugLineNum = 153;BA.debugLine="Sub ButtonBack_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
contactact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonsend_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSend_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,102);
if (RapidSub.canDelegate("buttonsend_click")) return contactact.remoteMe.runUserSub(false, "contactact","buttonsend_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 102;BA.debugLine="Sub ButtonSend_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="If(txtDescription.Text.Length < 5 )Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("<",contactact.mostCurrent._txtdescription.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 5)))) { 
 BA.debugLineNum = 104;BA.debugLine="Msgbox(\"لطفآ متن را وارد نمائید\",\"نقص اطلاعات\")";
Debug.ShouldStop(128);
contactact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("لطفآ متن را وارد نمائید")),(Object)(RemoteObject.createImmutable("نقص اطلاعات")),contactact.mostCurrent.activityBA);
 BA.debugLineNum = 105;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 107;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 108;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2048);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 109;BA.debugLine="ProgressDialogShow(\"درحال ذخیره سازی\")";
Debug.ShouldStop(4096);
contactact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",contactact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال ذخیره سازی")));
 BA.debugLineNum = 110;BA.debugLine="job.Initialize(\"saveing\", Me)";
Debug.ShouldStop(8192);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",contactact.processBA,(Object)(BA.ObjectToString("saveing")),(Object)(contactact.getObject()));
 BA.debugLineNum = 112;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
Debug.ShouldStop(32768);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/insertComment")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&name="),contactact.mostCurrent._txtname.runMethod(true,"getText"),RemoteObject.createImmutable("&mobile="),contactact.mostCurrent._txtdescription.runMethod(true,"getText"),RemoteObject.createImmutable("&text="),contactact.mostCurrent._txttag.runMethod(true,"getText"),RemoteObject.createImmutable("&user="),contactact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),contactact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),contactact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e72) {
			BA.rdebugUtils.runVoidMethod("setLastException",contactact.processBA, e72.toString()); BA.debugLineNum = 121;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
Debug.ShouldStop(16777216);
contactact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در ارسال اطلاعات   ")),(Object)(RemoteObject.createImmutable("خطا")),contactact.mostCurrent.activityBA);
 BA.debugLineNum = 122;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
contactact.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 124;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private Panel2 As Panel";
contactact.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ScrollView1 As ScrollView";
contactact.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label6 As Label";
contactact.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label1 As Label";
contactact.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtName As EditText";
contactact.mostCurrent._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Label2 As Label";
contactact.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private txtTag As EditText";
contactact.mostCurrent._txttag = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Label3 As Label";
contactact.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtDescription As EditText";
contactact.mostCurrent._txtdescription = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim navi As AHNavigationDrawer";
contactact.mostCurrent._navi = RemoteObject.createNew ("de.amberhome.navdrawer.NavigationDrawer");
 //BA.debugLineNum = 27;BA.debugLine="Dim pCantent As Panel";
contactact.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ImageView2 As ImageView";
contactact.mostCurrent._imageview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ImageView1 As ImageView";
contactact.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,127);
if (RapidSub.canDelegate("jobdone")) return contactact.remoteMe.runUserSub(false, "contactact","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 127;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 129;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1);
contactact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 130;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(2);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 131;BA.debugLine="Dim res As String";
Debug.ShouldStop(4);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 132;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(8);
_res = _job.runClassMethod (Telegram.Search.httpjob.class, "_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 134;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 135;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 136;BA.debugLine="If Job.JobName= \"saveing\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("saveing"))) { 
 BA.debugLineNum = 139;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . نظر ارسال شد";
Debug.ShouldStop(1024);
contactact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("با تشکر از حسن توجه شما . نظر ارسال شد .")),(Object)(RemoteObject.createImmutable("درخواست ")),contactact.mostCurrent.activityBA);
 BA.debugLineNum = 140;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
contactact.mostCurrent._activity.runVoidMethod ("Finish");
 };
 }else {
 BA.debugLineNum = 144;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
Debug.ShouldStop(32768);
contactact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .")),(Object)(contactact.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e92) {
			BA.rdebugUtils.runVoidMethod("setLastException",contactact.processBA, e92.toString()); BA.debugLineNum = 147;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات ذخیره سازی\",\"خطا\")";
Debug.ShouldStop(262144);
contactact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ذخیره سازی")),(Object)(RemoteObject.createImmutable("خطا")),contactact.mostCurrent.activityBA);
 BA.debugLineNum = 148;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
contactact.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
public static RemoteObject  _menuabout_click() throws Exception{
try {
		Debug.PushSubsStack("MenuAbout_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,162);
if (RapidSub.canDelegate("menuabout_click")) return contactact.remoteMe.runUserSub(false, "contactact","menuabout_click");
 BA.debugLineNum = 162;BA.debugLine="Sub MenuAbout_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="StartActivity(\"AboutAct\")";
Debug.ShouldStop(4);
contactact.mostCurrent.__c.runVoidMethod ("StartActivity",contactact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("AboutAct"))));
 BA.debugLineNum = 164;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(8);
contactact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MenuContact_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,181);
if (RapidSub.canDelegate("menucontact_click")) return contactact.remoteMe.runUserSub(false, "contactact","menucontact_click");
 BA.debugLineNum = 181;BA.debugLine="Sub MenuContact_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("MenuExit_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,167);
if (RapidSub.canDelegate("menuexit_click")) return contactact.remoteMe.runUserSub(false, "contactact","menuexit_click");
 BA.debugLineNum = 167;BA.debugLine="Sub MenuExit_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 169;BA.debugLine="ExitApplication";
Debug.ShouldStop(256);
contactact.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 172;BA.debugLine="End Sub";
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
public static RemoteObject  _menuhelp_click() throws Exception{
try {
		Debug.PushSubsStack("MenuHelp_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,158);
if (RapidSub.canDelegate("menuhelp_click")) return contactact.remoteMe.runUserSub(false, "contactact","menuhelp_click");
 BA.debugLineNum = 158;BA.debugLine="Sub MenuHelp_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="StartActivity(\"helpAct\")";
Debug.ShouldStop(1073741824);
contactact.mostCurrent.__c.runVoidMethod ("StartActivity",contactact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("helpAct"))));
 BA.debugLineNum = 160;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(-2147483648);
contactact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MenuOrder_Click (contactact) ","contactact",6,contactact.mostCurrent.activityBA,contactact.mostCurrent,173);
if (RapidSub.canDelegate("menuorder_click")) return contactact.remoteMe.runUserSub(false, "contactact","menuorder_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 173;BA.debugLine="Sub MenuOrder_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 175;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(16384);
contactact.mostCurrent.__c.runVoidMethod ("StartActivity",contactact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/index/1"))))));
 BA.debugLineNum = 176;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(32768);
contactact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(contactact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}