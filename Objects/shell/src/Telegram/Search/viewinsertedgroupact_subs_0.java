package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class viewinsertedgroupact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (viewinsertedgroupact) ","viewinsertedgroupact",9,viewinsertedgroupact.mostCurrent.activityBA,viewinsertedgroupact.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) return viewinsertedgroupact.remoteMe.runUserSub(false, "viewinsertedgroupact","activity_create", _firsttime);
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"insertedgroupview\")";
Debug.ShouldStop(4);
viewinsertedgroupact.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("insertedgroupview")),viewinsertedgroupact.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="Panel1.Width = Activity.Width";
Debug.ShouldStop(32);
viewinsertedgroupact.mostCurrent._panel1.runMethod(true,"setWidth",viewinsertedgroupact.mostCurrent._activity.runMethod(true,"getWidth"));
 BA.debugLineNum = 39;BA.debugLine="Panel1.Height=Activity.Height";
Debug.ShouldStop(64);
viewinsertedgroupact.mostCurrent._panel1.runMethod(true,"setHeight",viewinsertedgroupact.mostCurrent._activity.runMethod(true,"getHeight"));
 BA.debugLineNum = 41;BA.debugLine="Label1.TextSize= 15";
Debug.ShouldStop(256);
viewinsertedgroupact.mostCurrent._label1.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 42;BA.debugLine="Label1.Typeface=Main.font";
Debug.ShouldStop(512);
viewinsertedgroupact.mostCurrent._label1.runMethod(false,"setTypeface",(viewinsertedgroupact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 44;BA.debugLine="Label1.Gravity= Gravity.RIGHT";
Debug.ShouldStop(2048);
viewinsertedgroupact.mostCurrent._label1.runMethod(true,"setGravity",viewinsertedgroupact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 46;BA.debugLine="Label2.TextSize= 15";
Debug.ShouldStop(8192);
viewinsertedgroupact.mostCurrent._label2.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 47;BA.debugLine="Label2.Typeface=Main.font";
Debug.ShouldStop(16384);
viewinsertedgroupact.mostCurrent._label2.runMethod(false,"setTypeface",(viewinsertedgroupact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 48;BA.debugLine="Label2.TextColor=Colors.Black";
Debug.ShouldStop(32768);
viewinsertedgroupact.mostCurrent._label2.runMethod(true,"setTextColor",viewinsertedgroupact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 50;BA.debugLine="Label2.Gravity= Gravity.RIGHT";
Debug.ShouldStop(131072);
viewinsertedgroupact.mostCurrent._label2.runMethod(true,"setGravity",viewinsertedgroupact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 52;BA.debugLine="Label3.TextSize= 15";
Debug.ShouldStop(524288);
viewinsertedgroupact.mostCurrent._label3.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 53;BA.debugLine="Label3.TextColor=Colors.Black";
Debug.ShouldStop(1048576);
viewinsertedgroupact.mostCurrent._label3.runMethod(true,"setTextColor",viewinsertedgroupact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 54;BA.debugLine="Label3.Typeface=Main.font";
Debug.ShouldStop(2097152);
viewinsertedgroupact.mostCurrent._label3.runMethod(false,"setTypeface",(viewinsertedgroupact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 56;BA.debugLine="Label3.Gravity= Gravity.RIGHT";
Debug.ShouldStop(8388608);
viewinsertedgroupact.mostCurrent._label3.runMethod(true,"setGravity",viewinsertedgroupact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 58;BA.debugLine="Label5.TextSize= 15";
Debug.ShouldStop(33554432);
viewinsertedgroupact.mostCurrent._label5.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 59;BA.debugLine="Label5.Typeface=Main.font";
Debug.ShouldStop(67108864);
viewinsertedgroupact.mostCurrent._label5.runMethod(false,"setTypeface",(viewinsertedgroupact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 61;BA.debugLine="Label5.Gravity= Gravity.RIGHT";
Debug.ShouldStop(268435456);
viewinsertedgroupact.mostCurrent._label5.runMethod(true,"setGravity",viewinsertedgroupact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 63;BA.debugLine="txtName.Color= Colors.rgb(179,229,252)";
Debug.ShouldStop(1073741824);
viewinsertedgroupact.mostCurrent._txtname.runVoidMethod ("setColor",viewinsertedgroupact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 64;BA.debugLine="txtName.TextSize= 15";
Debug.ShouldStop(-2147483648);
viewinsertedgroupact.mostCurrent._txtname.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 65;BA.debugLine="txtName.Typeface=Main.font";
Debug.ShouldStop(1);
viewinsertedgroupact.mostCurrent._txtname.runMethod(false,"setTypeface",(viewinsertedgroupact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 67;BA.debugLine="txtName.Gravity= Gravity.RIGHT";
Debug.ShouldStop(4);
viewinsertedgroupact.mostCurrent._txtname.runMethod(true,"setGravity",viewinsertedgroupact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 69;BA.debugLine="EditTextMobile.Color= Colors.rgb(179,229,252)";
Debug.ShouldStop(16);
viewinsertedgroupact.mostCurrent._edittextmobile.runVoidMethod ("setColor",viewinsertedgroupact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 70;BA.debugLine="EditTextMobile.TextSize= 15";
Debug.ShouldStop(32);
viewinsertedgroupact.mostCurrent._edittextmobile.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 71;BA.debugLine="EditTextMobile.Typeface=Main.font";
Debug.ShouldStop(64);
viewinsertedgroupact.mostCurrent._edittextmobile.runMethod(false,"setTypeface",(viewinsertedgroupact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 73;BA.debugLine="EditTextMobile.Gravity= Gravity.RIGHT";
Debug.ShouldStop(256);
viewinsertedgroupact.mostCurrent._edittextmobile.runMethod(true,"setGravity",viewinsertedgroupact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 76;BA.debugLine="Dim line As String";
Debug.ShouldStop(2048);
_line = RemoteObject.createImmutable("");Debug.locals.put("line", _line);
 BA.debugLineNum = 77;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 78;BA.debugLine="line = Main.phoneId.GetLine1Number";
Debug.ShouldStop(8192);
_line = viewinsertedgroupact.mostCurrent._main._phoneid.runMethod(true,"GetLine1Number");Debug.locals.put("line", _line);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e44) {
			BA.rdebugUtils.runVoidMethod("setLastException",viewinsertedgroupact.processBA, e44.toString()); BA.debugLineNum = 80;BA.debugLine="line = \"need root\"";
Debug.ShouldStop(32768);
_line = BA.ObjectToString("need root");Debug.locals.put("line", _line);
 };
 BA.debugLineNum = 82;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(131072);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 83;BA.debugLine="ProgressDialogShow(\"درحال بررسی\")";
Debug.ShouldStop(262144);
viewinsertedgroupact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",viewinsertedgroupact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال بررسی")));
 BA.debugLineNum = 84;BA.debugLine="job.Initialize(\"register\", Me)";
Debug.ShouldStop(524288);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",viewinsertedgroupact.processBA,(Object)(BA.ObjectToString("register")),(Object)(viewinsertedgroupact.getObject()));
 BA.debugLineNum = 85;BA.debugLine="firs=True";
Debug.ShouldStop(1048576);
viewinsertedgroupact._firs = viewinsertedgroupact.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 86;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.php";
Debug.ShouldStop(2097152);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/register")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&name="),RemoteObject.createImmutable("&mobile="),RemoteObject.createImmutable("&sdk="),viewinsertedgroupact.mostCurrent._main._phone.runMethod(true,"getSdkVersion"),RemoteObject.createImmutable("&model="),viewinsertedgroupact.mostCurrent._main._phone.runMethod(true,"getManufacturer"),RemoteObject.createImmutable(","),viewinsertedgroupact.mostCurrent._main._phone.runMethod(true,"getProduct"),RemoteObject.createImmutable("&line="),_line,RemoteObject.createImmutable("&phone="),viewinsertedgroupact.mostCurrent._main._phoneid.runMethod(true,"GetDeviceId"),RemoteObject.createImmutable("&v="),viewinsertedgroupact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),viewinsertedgroupact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (viewinsertedgroupact) ","viewinsertedgroupact",9,viewinsertedgroupact.mostCurrent.activityBA,viewinsertedgroupact.mostCurrent,102);
if (RapidSub.canDelegate("activity_pause")) return viewinsertedgroupact.remoteMe.runUserSub(false, "viewinsertedgroupact","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (viewinsertedgroupact) ","viewinsertedgroupact",9,viewinsertedgroupact.mostCurrent.activityBA,viewinsertedgroupact.mostCurrent,98);
if (RapidSub.canDelegate("activity_resume")) return viewinsertedgroupact.remoteMe.runUserSub(false, "viewinsertedgroupact","activity_resume");
 BA.debugLineNum = 98;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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
public static RemoteObject  _btninsert_click() throws Exception{
try {
		Debug.PushSubsStack("btnInsert_Click (viewinsertedgroupact) ","viewinsertedgroupact",9,viewinsertedgroupact.mostCurrent.activityBA,viewinsertedgroupact.mostCurrent,114);
if (RapidSub.canDelegate("btninsert_click")) return viewinsertedgroupact.remoteMe.runUserSub(false, "viewinsertedgroupact","btninsert_click");
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 114;BA.debugLine="Sub btnInsert_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Dim line As String";
Debug.ShouldStop(262144);
_line = RemoteObject.createImmutable("");Debug.locals.put("line", _line);
 BA.debugLineNum = 116;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 117;BA.debugLine="line = Main.phoneId.GetLine1Number";
Debug.ShouldStop(1048576);
_line = viewinsertedgroupact.mostCurrent._main._phoneid.runMethod(true,"GetLine1Number");Debug.locals.put("line", _line);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e64) {
			BA.rdebugUtils.runVoidMethod("setLastException",viewinsertedgroupact.processBA, e64.toString()); BA.debugLineNum = 119;BA.debugLine="line = \"need root\"";
Debug.ShouldStop(4194304);
_line = BA.ObjectToString("need root");Debug.locals.put("line", _line);
 };
 BA.debugLineNum = 121;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 123;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(67108864);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 124;BA.debugLine="ProgressDialogShow(\"درحال ثبت نام\")";
Debug.ShouldStop(134217728);
viewinsertedgroupact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",viewinsertedgroupact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال ثبت نام")));
 BA.debugLineNum = 125;BA.debugLine="job.Initialize(\"register\", Me)";
Debug.ShouldStop(268435456);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",viewinsertedgroupact.processBA,(Object)(BA.ObjectToString("register")),(Object)(viewinsertedgroupact.getObject()));
 BA.debugLineNum = 126;BA.debugLine="firs=False";
Debug.ShouldStop(536870912);
viewinsertedgroupact._firs = viewinsertedgroupact.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 127;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
Debug.ShouldStop(1073741824);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/register")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&name="),viewinsertedgroupact.mostCurrent._txtname.runMethod(true,"getText"),RemoteObject.createImmutable("&mobile="),viewinsertedgroupact.mostCurrent._edittextmobile.runMethod(true,"getText"),RemoteObject.createImmutable("&sdk="),viewinsertedgroupact.mostCurrent._main._phone.runMethod(true,"getSdkVersion"),RemoteObject.createImmutable("&model="),viewinsertedgroupact.mostCurrent._main._phone.runMethod(true,"getManufacturer"),RemoteObject.createImmutable(","),viewinsertedgroupact.mostCurrent._main._phone.runMethod(true,"getProduct"),RemoteObject.createImmutable("&line="),_line,RemoteObject.createImmutable("&phone="),viewinsertedgroupact.mostCurrent._main._phoneid.runMethod(true,"GetDeviceId"),RemoteObject.createImmutable("&v="),viewinsertedgroupact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),viewinsertedgroupact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e73) {
			BA.rdebugUtils.runVoidMethod("setLastException",viewinsertedgroupact.processBA, e73.toString()); BA.debugLineNum = 140;BA.debugLine="Msgbox(\"خطا در اتصال به اینترنت  \",\"خطا\")";
Debug.ShouldStop(2048);
viewinsertedgroupact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در اتصال به اینترنت  ")),(Object)(RemoteObject.createImmutable("خطا")),viewinsertedgroupact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btnReturn_Click (viewinsertedgroupact) ","viewinsertedgroupact",9,viewinsertedgroupact.mostCurrent.activityBA,viewinsertedgroupact.mostCurrent,108);
if (RapidSub.canDelegate("btnreturn_click")) return viewinsertedgroupact.remoteMe.runUserSub(false, "viewinsertedgroupact","btnreturn_click");
 BA.debugLineNum = 108;BA.debugLine="Sub btnReturn_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 111;BA.debugLine="ExitApplication";
Debug.ShouldStop(16384);
viewinsertedgroupact.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextmobile_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditTextMobile_EnterPressed (viewinsertedgroupact) ","viewinsertedgroupact",9,viewinsertedgroupact.mostCurrent.activityBA,viewinsertedgroupact.mostCurrent,223);
if (RapidSub.canDelegate("edittextmobile_enterpressed")) return viewinsertedgroupact.remoteMe.runUserSub(false, "viewinsertedgroupact","edittextmobile_enterpressed");
 BA.debugLineNum = 223;BA.debugLine="Sub EditTextMobile_EnterPressed";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="btnInsert_Click";
Debug.ShouldStop(-2147483648);
_btninsert_click();
 BA.debugLineNum = 225;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private Label1 As Label";
viewinsertedgroupact.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Panel1 As Panel";
viewinsertedgroupact.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnReturn As Button";
viewinsertedgroupact.mostCurrent._btnreturn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtName As EditText";
viewinsertedgroupact.mostCurrent._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EditTextMobile As EditText";
viewinsertedgroupact.mostCurrent._edittextmobile = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Label2 As Label";
viewinsertedgroupact.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Label3 As Label";
viewinsertedgroupact.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Label5 As Label";
viewinsertedgroupact.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (viewinsertedgroupact) ","viewinsertedgroupact",9,viewinsertedgroupact.mostCurrent.activityBA,viewinsertedgroupact.mostCurrent,146);
if (RapidSub.canDelegate("jobdone")) return viewinsertedgroupact.remoteMe.runUserSub(false, "viewinsertedgroupact","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _userid = RemoteObject.createImmutable(0);
RemoteObject _pass = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 146;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 148;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
viewinsertedgroupact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 149;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1048576);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 150;BA.debugLine="Dim res As String";
Debug.ShouldStop(2097152);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 151;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(4194304);
_res = _job.runClassMethod (Telegram.Search.httpjob.class, "_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 154;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 155;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 156;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("register"))) {
case 0: {
 BA.debugLineNum = 165;BA.debugLine="Dim row As Map";
Debug.ShouldStop(16);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("row", _row);
 BA.debugLineNum = 167;BA.debugLine="Dim userId As Int";
Debug.ShouldStop(64);
_userid = RemoteObject.createImmutable(0);Debug.locals.put("userId", _userid);
 BA.debugLineNum = 169;BA.debugLine="Dim pass As String";
Debug.ShouldStop(256);
_pass = RemoteObject.createImmutable("");Debug.locals.put("pass", _pass);
 BA.debugLineNum = 171;BA.debugLine="row.Initialize()";
Debug.ShouldStop(1024);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 174;BA.debugLine="row=parser.NextObject";
Debug.ShouldStop(8192);
_row = _parser.runMethod(false,"NextObject");Debug.locals.put("row", _row);
 BA.debugLineNum = 176;BA.debugLine="userId=row.Get(\"id\")";
Debug.ShouldStop(32768);
_userid = BA.numberCast(int.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("userId", _userid);
 BA.debugLineNum = 177;BA.debugLine="pass=row.Get(\"password\")";
Debug.ShouldStop(65536);
_pass = BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password")))));Debug.locals.put("pass", _pass);
 BA.debugLineNum = 179;BA.debugLine="If(userId > 0 )Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean(">",_userid,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 181;BA.debugLine="If(Main.userInfo.IsInitialized =False) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("=",viewinsertedgroupact.mostCurrent._main._userinfo.runMethod(true,"IsInitialized"),viewinsertedgroupact.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 182;BA.debugLine="Main.userInfo.Initialize";
Debug.ShouldStop(2097152);
viewinsertedgroupact.mostCurrent._main._userinfo.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 184;BA.debugLine="Main.userInfo.Put(\"user_name\",row.Get(\"userN";
Debug.ShouldStop(8388608);
viewinsertedgroupact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user_name"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userName"))))));
 BA.debugLineNum = 185;BA.debugLine="Main.userInfo.Put(\"pass\",row.Get(\"password\")";
Debug.ShouldStop(16777216);
viewinsertedgroupact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pass"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("password"))))));
 BA.debugLineNum = 186;BA.debugLine="Main.userInfo.Put(\"user_id\",row.Get(\"id\"))";
Debug.ShouldStop(33554432);
viewinsertedgroupact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user_id"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 187;BA.debugLine="Main.userInfo.Put(\"line_number\",row.Get(\"lin";
Debug.ShouldStop(67108864);
viewinsertedgroupact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("line_number"))),(Object)(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line"))))));
 BA.debugLineNum = 192;BA.debugLine="Msgbox2(row.Get(\"name\")   _ 									,row.Ge";
Debug.ShouldStop(-2147483648);
viewinsertedgroupact.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))),(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("family")))))),(Object)(BA.ObjectToString("شروع استفاده از برنامه ")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)((viewinsertedgroupact.mostCurrent._main._groupicon.getObject())),viewinsertedgroupact.mostCurrent.activityBA);
 BA.debugLineNum = 197;BA.debugLine="CallSubDelayed(Main , \"writeInfo\")";
Debug.ShouldStop(16);
viewinsertedgroupact.mostCurrent.__c.runVoidMethod ("CallSubDelayed",viewinsertedgroupact.mostCurrent.activityBA,(Object)((viewinsertedgroupact.mostCurrent._main.getObject())),(Object)(RemoteObject.createImmutable("writeInfo")));
 BA.debugLineNum = 198;BA.debugLine="Job.Release";
Debug.ShouldStop(32);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 BA.debugLineNum = 199;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
viewinsertedgroupact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 200;BA.debugLine="Return";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 202;BA.debugLine="If firs=False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",viewinsertedgroupact._firs,viewinsertedgroupact.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 203;BA.debugLine="Msgbox(row.Get(\"name\"),row.Get(\"family\"))";
Debug.ShouldStop(1024);
viewinsertedgroupact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))),(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("family")))))),viewinsertedgroupact.mostCurrent.activityBA);
 };
 };
 BA.debugLineNum = 207;BA.debugLine="Job.Release";
Debug.ShouldStop(16384);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 break; }
}
;
 }else {
 BA.debugLineNum = 212;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
Debug.ShouldStop(524288);
viewinsertedgroupact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .")),(Object)(viewinsertedgroupact.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e117) {
			BA.rdebugUtils.runVoidMethod("setLastException",viewinsertedgroupact.processBA, e117.toString()); BA.debugLineNum = 215;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات ثبت نام    \",\"خطا\"";
Debug.ShouldStop(4194304);
viewinsertedgroupact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ثبت نام    ")),(Object)(RemoteObject.createImmutable("خطا")),viewinsertedgroupact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 220;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim finishInserting As Boolean";
viewinsertedgroupact._finishinserting = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 10;BA.debugLine="Dim firs As Boolean";
viewinsertedgroupact._firs = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}