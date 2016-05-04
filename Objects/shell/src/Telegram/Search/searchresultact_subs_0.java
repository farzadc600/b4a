package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class searchresultact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 36;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
Debug.ShouldStop(8);
searchresultact.mostCurrent._navi.runVoidMethod ("Initialize2",searchresultact.mostCurrent.activityBA,(Object)(BA.ObjectToString("navi")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), searchresultact.mostCurrent._activity.getObject()),(Object)(searchresultact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),searchresultact.mostCurrent.activityBA)),(Object)(searchresultact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 40;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
Debug.ShouldStop(128);
searchresultact.mostCurrent._navi.runMethod(false,"getNavigationPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menu")),searchresultact.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(512);
searchresultact.mostCurrent._pcantent.runVoidMethod ("Initialize",searchresultact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 43;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
Debug.ShouldStop(1024);
searchresultact.mostCurrent._navi.runMethod(false,"getContentPanel").runVoidMethod ("AddView",(Object)((searchresultact.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(searchresultact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),searchresultact.mostCurrent.activityBA)),(Object)(searchresultact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchresultact.mostCurrent.activityBA)));
 BA.debugLineNum = 44;BA.debugLine="pCantent.SendToBack";
Debug.ShouldStop(2048);
searchresultact.mostCurrent._pcantent.runVoidMethod ("SendToBack");
 BA.debugLineNum = 45;BA.debugLine="pCantent.LoadLayout(\"searchresultview\")";
Debug.ShouldStop(4096);
searchresultact.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("searchresultview")),searchresultact.mostCurrent.activityBA);
 BA.debugLineNum = 47;BA.debugLine="Activity.Title=\"نمایش نتایج جستجو\"";
Debug.ShouldStop(16384);
searchresultact.mostCurrent._activity.runMethod(false,"setTitle",RemoteObject.createImmutable(("نمایش نتایج جستجو")));
 BA.debugLineNum = 54;BA.debugLine="pageNumber = 1";
Debug.ShouldStop(2097152);
searchresultact._pagenumber = BA.numberCast(int.class, 1);
 BA.debugLineNum = 57;BA.debugLine="Label1.TextSize= 15";
Debug.ShouldStop(16777216);
searchresultact.mostCurrent._label1.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 58;BA.debugLine="Label1.Gravity= Gravity.RIGHT";
Debug.ShouldStop(33554432);
searchresultact.mostCurrent._label1.runMethod(true,"setGravity",searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 59;BA.debugLine="Label1.Typeface=Main.font";
Debug.ShouldStop(67108864);
searchresultact.mostCurrent._label1.runMethod(false,"setTypeface",(searchresultact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 62;BA.debugLine="LabelPage.TextSize= 15";
Debug.ShouldStop(536870912);
searchresultact.mostCurrent._labelpage.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 63;BA.debugLine="LabelPage.Gravity= Gravity.RIGHT";
Debug.ShouldStop(1073741824);
searchresultact.mostCurrent._labelpage.runMethod(true,"setGravity",searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 64;BA.debugLine="LabelPage.Typeface=Main.font";
Debug.ShouldStop(-2147483648);
searchresultact.mostCurrent._labelpage.runMethod(false,"setTypeface",(searchresultact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 66;BA.debugLine="ImageView1.Bitmap = Main.rightBitmap";
Debug.ShouldStop(2);
searchresultact.mostCurrent._imageview1.runMethod(false,"setBitmap",(searchresultact.mostCurrent._main._rightbitmap.getObject()));
 BA.debugLineNum = 68;BA.debugLine="ListViewResult.Clear()";
Debug.ShouldStop(8);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("Clear");
 BA.debugLineNum = 70;BA.debugLine="ListViewResult.TwoLinesAndBitmap.Label.TextSiz";
Debug.ShouldStop(32);
searchresultact.mostCurrent._listviewresult.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 71;BA.debugLine="ListViewResult.TwoLinesAndBitmap.Label.TextCol";
Debug.ShouldStop(64);
searchresultact.mostCurrent._listviewresult.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",searchresultact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 72;BA.debugLine="ListViewResult.TwoLinesAndBitmap.Label.Gravity";
Debug.ShouldStop(128);
searchresultact.mostCurrent._listviewresult.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setGravity",searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 73;BA.debugLine="ListViewResult.TwoLinesAndBitmap.Label.Typefac";
Debug.ShouldStop(256);
searchresultact.mostCurrent._listviewresult.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setTypeface",(searchresultact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 74;BA.debugLine="ListViewResult.Color=Colors.rgb(187,222,251)";
Debug.ShouldStop(512);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("setColor",searchresultact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 187)),(Object)(BA.numberCast(int.class, 222)),(Object)(BA.numberCast(int.class, 251))));
 BA.debugLineNum = 76;BA.debugLine="ListViewResult.TwoLinesAndBitmap.SecondLabel.T";
Debug.ShouldStop(2048);
searchresultact.mostCurrent._listviewresult.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 77;BA.debugLine="ListViewResult.TwoLinesAndBitmap.SecondLabel.T";
Debug.ShouldStop(4096);
searchresultact.mostCurrent._listviewresult.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",searchresultact.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 78;BA.debugLine="ListViewResult.TwoLinesAndBitmap.SecondLabel.G";
Debug.ShouldStop(8192);
searchresultact.mostCurrent._listviewresult.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setGravity",searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 79;BA.debugLine="ListViewResult.TwoLinesAndBitmap.SecondLabel.T";
Debug.ShouldStop(16384);
searchresultact.mostCurrent._listviewresult.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(false,"setTypeface",(searchresultact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 81;BA.debugLine="ListViewResult.ScrollingBackgroundColor = Colors.";
Debug.ShouldStop(65536);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("setScrollingBackgroundColor",searchresultact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 10)),(Object)(BA.numberCast(int.class, 144)),(Object)(BA.numberCast(int.class, 156))));
 BA.debugLineNum = 85;BA.debugLine="loadResult";
Debug.ShouldStop(1048576);
_loadresult();
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Pause (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,219);
if (RapidSub.canDelegate("activity_pause")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 219;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 221;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,215);
if (RapidSub.canDelegate("activity_resume")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","activity_resume");
 BA.debugLineNum = 215;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 217;BA.debugLine="End Sub";
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
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,29);
if (RapidSub.canDelegate("btnmenu_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","btnmenu_click");
 BA.debugLineNum = 29;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
Debug.ShouldStop(536870912);
searchresultact.mostCurrent._navi.runVoidMethod ("OpenDrawer2",(Object)(searchresultact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
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
public static RemoteObject  _btnnext_click() throws Exception{
try {
		Debug.PushSubsStack("btnNext_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,314);
if (RapidSub.canDelegate("btnnext_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","btnnext_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 314;BA.debugLine="Sub btnNext_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 316;BA.debugLine="If(resultCount < 15 )Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("<",searchresultact._resultcount,BA.numberCast(double.class, 15)))) { 
 BA.debugLineNum = 317;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 319;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 320;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(-2147483648);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 321;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(1);
searchresultact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",searchresultact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 322;BA.debugLine="job.Initialize(\"next\", Me)";
Debug.ShouldStop(2);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",searchresultact.processBA,(Object)(BA.ObjectToString("next")),(Object)(searchresultact.getObject()));
 BA.debugLineNum = 324;BA.debugLine="job.PostString(Main.query & \"/\" & (pageNumber* 1";
Debug.ShouldStop(8);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(RemoteObject.concat(searchresultact.mostCurrent._main._query,RemoteObject.createImmutable("/"),(RemoteObject.solve(new RemoteObject[] {searchresultact._pagenumber,RemoteObject.createImmutable(15)}, "*",0, 1)),RemoteObject.createImmutable("/"),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {searchresultact._pagenumber,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(15)}, "*",0, 1)))),(Object)(searchresultact.mostCurrent._main._parameter));
 BA.debugLineNum = 325;BA.debugLine="pageNumber = pageNumber +1";
Debug.ShouldStop(16);
searchresultact._pagenumber = RemoteObject.solve(new RemoteObject[] {searchresultact._pagenumber,RemoteObject.createImmutable(1)}, "+",1, 1);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e198) {
			BA.rdebugUtils.runVoidMethod("setLastException",searchresultact.processBA, e198.toString()); BA.debugLineNum = 328;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(128);
searchresultact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),searchresultact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 330;BA.debugLine="End Sub";
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
public static RemoteObject  _btnpanel_click() throws Exception{
try {
		Debug.PushSubsStack("btnPanel_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,356);
if (RapidSub.canDelegate("btnpanel_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","btnpanel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 356;BA.debugLine="Sub btnPanel_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 358;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(32);
searchresultact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),searchresultact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),searchresultact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),searchresultact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),searchresultact.mostCurrent.activityBA);
 BA.debugLineNum = 361;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(256);
searchresultact.mostCurrent.__c.runVoidMethod ("StartActivity",searchresultact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/"))))));
 BA.debugLineNum = 362;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(512);
searchresultact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 363;BA.debugLine="End Sub";
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
public static RemoteObject  _btnprev_click() throws Exception{
try {
		Debug.PushSubsStack("btnPrev_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,298);
if (RapidSub.canDelegate("btnprev_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","btnprev_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 298;BA.debugLine="Sub btnPrev_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 300;BA.debugLine="If(pageNumber = 0 )Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",searchresultact._pagenumber,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 301;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 303;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 304;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(32768);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 305;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(65536);
searchresultact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",searchresultact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 306;BA.debugLine="job.Initialize(\"prev\", Me)";
Debug.ShouldStop(131072);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",searchresultact.processBA,(Object)(BA.ObjectToString("prev")),(Object)(searchresultact.getObject()));
 BA.debugLineNum = 307;BA.debugLine="pageNumber = pageNumber -1";
Debug.ShouldStop(262144);
searchresultact._pagenumber = RemoteObject.solve(new RemoteObject[] {searchresultact._pagenumber,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 308;BA.debugLine="job.PostString(Main.query & \"/\" & ((pageNumber-1";
Debug.ShouldStop(524288);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(RemoteObject.concat(searchresultact.mostCurrent._main._query,RemoteObject.createImmutable("/"),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {searchresultact._pagenumber,RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(15)}, "*",0, 1)),RemoteObject.createImmutable("/"),(RemoteObject.solve(new RemoteObject[] {searchresultact._pagenumber,RemoteObject.createImmutable(15)}, "*",0, 1)))),(Object)(searchresultact.mostCurrent._main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e184) {
			BA.rdebugUtils.runVoidMethod("setLastException",searchresultact.processBA, e184.toString()); BA.debugLineNum = 311;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(4194304);
searchresultact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),searchresultact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 313;BA.debugLine="End Sub";
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
public static RemoteObject  _btnreturn_click() throws Exception{
try {
		Debug.PushSubsStack("btnReturn_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,223);
if (RapidSub.canDelegate("btnreturn_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","btnreturn_click");
 BA.debugLineNum = 223;BA.debugLine="Sub btnReturn_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
searchresultact.mostCurrent._activity.runVoidMethod ("Finish");
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
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private Label1 As Label";
searchresultact.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private ListViewResult As ListView";
searchresultact.mostCurrent._listviewresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private btnMenu As Button";
searchresultact.mostCurrent._btnmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim resultCount As Int";
searchresultact._resultcount = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="Dim pageNumber As Int";
searchresultact._pagenumber = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 19;BA.debugLine="Private LabelPage As Label";
searchresultact.mostCurrent._labelpage = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnNext As Button";
searchresultact.mostCurrent._btnnext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnPrev As Button";
searchresultact.mostCurrent._btnprev = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim navi As AHNavigationDrawer";
searchresultact.mostCurrent._navi = RemoteObject.createNew ("de.amberhome.navdrawer.NavigationDrawer");
 //BA.debugLineNum = 24;BA.debugLine="Dim pCantent As Panel";
searchresultact.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ImageView1 As ImageView";
searchresultact.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,253);
if (RapidSub.canDelegate("jobdone")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _countries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 253;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Main.searchResult.Initialize()";
Debug.ShouldStop(536870912);
searchresultact.mostCurrent._main._searchresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 255;BA.debugLine="Main.searchResult.Clear()";
Debug.ShouldStop(1073741824);
searchresultact.mostCurrent._main._searchresult.runVoidMethod ("Clear");
 BA.debugLineNum = 257;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 258;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
searchresultact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 259;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 260;BA.debugLine="Dim res As String";
Debug.ShouldStop(8);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 261;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(16);
_res = _job.runClassMethod (Telegram.Search.httpjob.class, "_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 262;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 263;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 265;BA.debugLine="If 	Job.JobName= \"next\" Or Job.JobName= \"prev\"";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("next")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("prev"))) { 
 BA.debugLineNum = 267;BA.debugLine="Dim COUNTRIES As List";
Debug.ShouldStop(1024);
_countries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 268;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list";
Debug.ShouldStop(2048);
_countries = _parser.runMethod(false,"NextArray");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 270;BA.debugLine="Dim rows As List";
Debug.ShouldStop(8192);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 271;BA.debugLine="rows= COUNTRIES.Get(0)";
Debug.ShouldStop(16384);
_rows.setObject(_countries.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 273;BA.debugLine="If(rows.Size > 0 ) Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean(">",_rows.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 275;BA.debugLine="For i= 0 To rows.Size-1";
Debug.ShouldStop(262144);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_rows.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 276;BA.debugLine="Dim row As Map";
Debug.ShouldStop(524288);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("row", _row);
 BA.debugLineNum = 278;BA.debugLine="row.Initialize()";
Debug.ShouldStop(2097152);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 279;BA.debugLine="row=rows.Get(i)";
Debug.ShouldStop(4194304);
_row.setObject(_rows.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 280;BA.debugLine="Main.searchResult.Add(row)";
Debug.ShouldStop(8388608);
searchresultact.mostCurrent._main._searchresult.runVoidMethod ("Add",(Object)((_row.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 283;BA.debugLine="loadResult";
Debug.ShouldStop(67108864);
_loadresult();
 }else {
 BA.debugLineNum = 285;BA.debugLine="Msgbox(\"موردی با مشخصات درخواستی شما یافت نش";
Debug.ShouldStop(268435456);
searchresultact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("موردی با مشخصات درخواستی شما یافت نشد . از بخش آخرین "),searchresultact.mostCurrent._main._selectedtypetitle,RemoteObject.createImmutable("ها هم می توانید "),searchresultact.mostCurrent._main._selectedtypetitle,RemoteObject.createImmutable(" مورد نظر خود را پیدا کنید  . "))),(Object)(RemoteObject.createImmutable("جستجو")),searchresultact.mostCurrent.activityBA);
 };
 };
 }else {
 BA.debugLineNum = 290;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
Debug.ShouldStop(2);
searchresultact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .")),(Object)(searchresultact.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e170) {
			BA.rdebugUtils.runVoidMethod("setLastException",searchresultact.processBA, e170.toString()); BA.debugLineNum = 293;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات جستجو  \",\"خطا\")";
Debug.ShouldStop(16);
searchresultact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات جستجو  ")),(Object)(RemoteObject.createImmutable("خطا")),searchresultact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 296;BA.debugLine="End Sub";
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
public static RemoteObject  _listviewresult_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewResult_ItemClick (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,227);
if (RapidSub.canDelegate("listviewresult_itemclick")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","listviewresult_itemclick", _position, _value);
RemoteObject _itemtype = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 227;BA.debugLine="Sub ListViewResult_ItemClick (Position As Int, Val";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="Main.selected_item = Value";
Debug.ShouldStop(8);
searchresultact.mostCurrent._main._selected_item.setObject(_value);
 BA.debugLineNum = 229;BA.debugLine="If Main.isEdit = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",searchresultact.mostCurrent._main._isedit,searchresultact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 230;BA.debugLine="Dim itemType As Int";
Debug.ShouldStop(32);
_itemtype = RemoteObject.createImmutable(0);Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 231;BA.debugLine="itemType = Main.selected_item.Get(\"telgroupTypeI";
Debug.ShouldStop(64);
_itemtype = BA.numberCast(int.class, searchresultact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telgroupTypeId")))));Debug.locals.put("itemType", _itemtype);
 BA.debugLineNum = 232;BA.debugLine="Select (itemType )";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt((_itemtype),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 7))) {
case 0: {
 BA.debugLineNum = 235;BA.debugLine="Main.selectedType=\"id\"";
Debug.ShouldStop(1024);
searchresultact.mostCurrent._main._selectedtype = BA.ObjectToString("id");
 break; }
case 1: {
 BA.debugLineNum = 237;BA.debugLine="Main.selectedType=\"sticker\"";
Debug.ShouldStop(4096);
searchresultact.mostCurrent._main._selectedtype = BA.ObjectToString("sticker");
 break; }
case 2: {
 BA.debugLineNum = 240;BA.debugLine="Main.selectedType=\"robot\"";
Debug.ShouldStop(32768);
searchresultact.mostCurrent._main._selectedtype = BA.ObjectToString("robot");
 break; }
case 3: {
 BA.debugLineNum = 242;BA.debugLine="Main.selectedType=\"channel\"";
Debug.ShouldStop(131072);
searchresultact.mostCurrent._main._selectedtype = BA.ObjectToString("channel");
 break; }
default: {
 BA.debugLineNum = 244;BA.debugLine="Main.selectedType=\"group\"";
Debug.ShouldStop(524288);
searchresultact.mostCurrent._main._selectedtype = BA.ObjectToString("group");
 break; }
}
;
 BA.debugLineNum = 246;BA.debugLine="StartActivity(\"insertAct\")";
Debug.ShouldStop(2097152);
searchresultact.mostCurrent.__c.runVoidMethod ("StartActivity",searchresultact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("insertAct"))));
 }else {
 BA.debugLineNum = 248;BA.debugLine="StartActivity(\"groupViewAct\")";
Debug.ShouldStop(8388608);
searchresultact.mostCurrent.__c.runVoidMethod ("StartActivity",searchresultact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("groupViewAct"))));
 };
 BA.debugLineNum = 251;BA.debugLine="End Sub";
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
public static RemoteObject  _loadresult() throws Exception{
try {
		Debug.PushSubsStack("loadResult (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,90);
if (RapidSub.canDelegate("loadresult")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","loadresult");
RemoteObject _selectedtype = RemoteObject.createImmutable(0);
RemoteObject _itemtitle = RemoteObject.createImmutable("");
RemoteObject _itemdesc = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _extract = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tag = RemoteObject.createImmutable("");
RemoteObject _vip = RemoteObject.createImmutable(0);
RemoteObject _super = RemoteObject.createImmutable(0);
 BA.debugLineNum = 90;BA.debugLine="Sub loadResult";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Dim selectedType As Int";
Debug.ShouldStop(67108864);
_selectedtype = RemoteObject.createImmutable(0);Debug.locals.put("selectedType", _selectedtype);
 BA.debugLineNum = 92;BA.debugLine="Dim itemTitle As String";
Debug.ShouldStop(134217728);
_itemtitle = RemoteObject.createImmutable("");Debug.locals.put("itemTitle", _itemtitle);
 BA.debugLineNum = 93;BA.debugLine="Dim itemDesc As String";
Debug.ShouldStop(268435456);
_itemdesc = RemoteObject.createImmutable("");Debug.locals.put("itemDesc", _itemdesc);
 BA.debugLineNum = 94;BA.debugLine="Dim i As Int";
Debug.ShouldStop(536870912);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 95;BA.debugLine="LabelPage.Text = pageNumber";
Debug.ShouldStop(1073741824);
searchresultact.mostCurrent._labelpage.runMethod(true,"setText",(searchresultact._pagenumber));
 BA.debugLineNum = 97;BA.debugLine="resultCount = Main.searchResult.Size";
Debug.ShouldStop(1);
searchresultact._resultcount = searchresultact.mostCurrent._main._searchresult.runMethod(true,"getSize");
 BA.debugLineNum = 98;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 99;BA.debugLine="ListViewResult.Clear";
Debug.ShouldStop(4);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("Clear");
 BA.debugLineNum = 100;BA.debugLine="For i= 0 To Main.searchResult.Size -1";
Debug.ShouldStop(8);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {searchresultact.mostCurrent._main._searchresult.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0) ; (step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 102;BA.debugLine="Dim extract As Map";
Debug.ShouldStop(32);
_extract = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("extract", _extract);
 BA.debugLineNum = 103;BA.debugLine="Dim tag As String";
Debug.ShouldStop(64);
_tag = RemoteObject.createImmutable("");Debug.locals.put("tag", _tag);
 BA.debugLineNum = 105;BA.debugLine="Dim vip As Int";
Debug.ShouldStop(256);
_vip = RemoteObject.createImmutable(0);Debug.locals.put("vip", _vip);
 BA.debugLineNum = 106;BA.debugLine="Dim super As Int";
Debug.ShouldStop(512);
_super = RemoteObject.createImmutable(0);Debug.locals.put("super", _super);
 BA.debugLineNum = 108;BA.debugLine="extract.Initialize()";
Debug.ShouldStop(2048);
_extract.runVoidMethod ("Initialize");
 BA.debugLineNum = 110;BA.debugLine="extract  = Main.searchResult.Get(i)";
Debug.ShouldStop(8192);
_extract.setObject(searchresultact.mostCurrent._main._searchresult.runMethod(false,"Get",(Object)(_i)));
 BA.debugLineNum = 111;BA.debugLine="tag=Main.ostan(extract.Get(\"ostanId\"))";
Debug.ShouldStop(16384);
_tag = searchresultact.mostCurrent._main._ostan.getArrayElement(true,BA.numberCast(int.class, _extract.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ostanId"))))));Debug.locals.put("tag", _tag);
 BA.debugLineNum = 113;BA.debugLine="selectedType=extract.Get(\"telgroupTypeId\")";
Debug.ShouldStop(65536);
_selectedtype = BA.numberCast(int.class, _extract.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telgroupTypeId")))));Debug.locals.put("selectedType", _selectedtype);
 BA.debugLineNum = 115;BA.debugLine="itemDesc = extract.Get(\"description\")";
Debug.ShouldStop(262144);
_itemdesc = BA.ObjectToString(_extract.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description")))));Debug.locals.put("itemDesc", _itemdesc);
 BA.debugLineNum = 116;BA.debugLine="If itemDesc.Length > 20 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_itemdesc.runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 117;BA.debugLine="itemDesc=itemDesc.SubString(20)";
Debug.ShouldStop(1048576);
_itemdesc = _itemdesc.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 20)));Debug.locals.put("itemDesc", _itemdesc);
 };
 BA.debugLineNum = 119;BA.debugLine="itemTitle= extract.Get(\"title\")";
Debug.ShouldStop(4194304);
_itemtitle = BA.ObjectToString(_extract.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("itemTitle", _itemtitle);
 BA.debugLineNum = 122;BA.debugLine="Select selectedType";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_selectedtype,BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 11),BA.numberCast(int.class, 4),BA.numberCast(int.class, 7),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10))) {
case 0: {
 BA.debugLineNum = 126;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(536870912);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent._main._idicon.getObject())),(Object)((_extract.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 131;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(4);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent._main._stickericon.getObject())),(Object)((_extract.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 136;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(128);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent._main._stickericon.getObject())),(Object)((_extract.getObject())));
 break; }
case 3: {
 BA.debugLineNum = 141;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(4096);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent._main._roboticon.getObject())),(Object)((_extract.getObject())));
 break; }
case 4: {
 BA.debugLineNum = 147;BA.debugLine="super =extract.Get(\"isSuperGroup\")";
Debug.ShouldStop(262144);
_super = BA.numberCast(int.class, _extract.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isSuperGroup")))));Debug.locals.put("super", _super);
 BA.debugLineNum = 148;BA.debugLine="vip =extract.Get(\"isVIP\")";
Debug.ShouldStop(524288);
_vip = BA.numberCast(int.class, _extract.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVIP")))));Debug.locals.put("vip", _vip);
 BA.debugLineNum = 150;BA.debugLine="If(vip = 1  )Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",_vip,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 151;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(4194304);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(searchresultact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("vip_channel.png"))).getObject())),(Object)((_extract.getObject())));
 }else 
{ BA.debugLineNum = 157;BA.debugLine="Else If( super = 1) Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",_super,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 158;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(536870912);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(searchresultact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("gov_channel.png"))).getObject())),(Object)((_extract.getObject())));
 }else {
 BA.debugLineNum = 164;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(8);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent._main._channelicon.getObject())),(Object)((_extract.getObject())));
 }};
 break; }
case 5: {
 BA.debugLineNum = 171;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(1024);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(searchresultact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("adsicon.png"))).getObject())),(Object)((_extract.getObject())));
 break; }
case 6: {
 BA.debugLineNum = 176;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(32768);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(searchresultact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("comment.png"))).getObject())),(Object)((_extract.getObject())));
 break; }
default: {
 BA.debugLineNum = 183;BA.debugLine="super =extract.Get(\"isSuperGroup\")";
Debug.ShouldStop(4194304);
_super = BA.numberCast(int.class, _extract.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isSuperGroup")))));Debug.locals.put("super", _super);
 BA.debugLineNum = 184;BA.debugLine="vip =extract.Get(\"isVIP\")";
Debug.ShouldStop(8388608);
_vip = BA.numberCast(int.class, _extract.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVIP")))));Debug.locals.put("vip", _vip);
 BA.debugLineNum = 186;BA.debugLine="If(vip = 1  )Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",_vip,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 187;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(67108864);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(searchresultact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("adsicon.png"))).getObject())),(Object)((_extract.getObject())));
 }else 
{ BA.debugLineNum = 192;BA.debugLine="Else If( super = 1) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_super,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 193;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(1);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(searchresultact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ispremium.png"))).getObject())),(Object)((_extract.getObject())));
 }else {
 BA.debugLineNum = 199;BA.debugLine="ListViewResult.AddTwoLinesAndBitmap2( _";
Debug.ShouldStop(64);
searchresultact.mostCurrent._listviewresult.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(_itemtitle),(Object)(RemoteObject.concat(_tag,RemoteObject.createImmutable("#"),_itemdesc)),(Object)((searchresultact.mostCurrent._main._groupicon.getObject())),(Object)((_extract.getObject())));
 }};
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e106) {
			BA.rdebugUtils.runVoidMethod("setLastException",searchresultact.processBA, e106.toString()); BA.debugLineNum = 210;BA.debugLine="Msgbox(\"خطا در نمایش نتایج جستجو\",\"خطا\")";
Debug.ShouldStop(131072);
searchresultact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در نمایش نتایج جستجو")),(Object)(RemoteObject.createImmutable("خطا")),searchresultact.mostCurrent.activityBA);
 BA.debugLineNum = 211;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
searchresultact.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 213;BA.debugLine="End Sub";
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
public static RemoteObject  _menuabout_click() throws Exception{
try {
		Debug.PushSubsStack("MenuAbout_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,337);
if (RapidSub.canDelegate("menuabout_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","menuabout_click");
 BA.debugLineNum = 337;BA.debugLine="Sub MenuAbout_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 338;BA.debugLine="StartActivity(\"AboutAct\")";
Debug.ShouldStop(131072);
searchresultact.mostCurrent.__c.runVoidMethod ("StartActivity",searchresultact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("AboutAct"))));
 BA.debugLineNum = 339;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(262144);
searchresultact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 340;BA.debugLine="End Sub";
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
public static RemoteObject  _menucontact_click() throws Exception{
try {
		Debug.PushSubsStack("MenuContact_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,351);
if (RapidSub.canDelegate("menucontact_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","menucontact_click");
 BA.debugLineNum = 351;BA.debugLine="Sub MenuContact_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 352;BA.debugLine="StartActivity(\"contactAct\")";
Debug.ShouldStop(-2147483648);
searchresultact.mostCurrent.__c.runVoidMethod ("StartActivity",searchresultact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("contactAct"))));
 BA.debugLineNum = 353;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(1);
searchresultact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 354;BA.debugLine="End Sub";
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
public static RemoteObject  _menuexit_click() throws Exception{
try {
		Debug.PushSubsStack("MenuExit_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,342);
if (RapidSub.canDelegate("menuexit_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","menuexit_click");
 BA.debugLineNum = 342;BA.debugLine="Sub MenuExit_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="ExitApplication";
Debug.ShouldStop(4194304);
searchresultact.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 345;BA.debugLine="End Sub";
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
public static RemoteObject  _menuhelp_click() throws Exception{
try {
		Debug.PushSubsStack("MenuHelp_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,332);
if (RapidSub.canDelegate("menuhelp_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","menuhelp_click");
 BA.debugLineNum = 332;BA.debugLine="Sub MenuHelp_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="StartActivity(\"helpAct\")";
Debug.ShouldStop(4096);
searchresultact.mostCurrent.__c.runVoidMethod ("StartActivity",searchresultact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("helpAct"))));
 BA.debugLineNum = 334;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(8192);
searchresultact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 335;BA.debugLine="End Sub";
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
public static RemoteObject  _menuorder_click() throws Exception{
try {
		Debug.PushSubsStack("MenuOrder_Click (searchresultact) ","searchresultact",3,searchresultact.mostCurrent.activityBA,searchresultact.mostCurrent,346);
if (RapidSub.canDelegate("menuorder_click")) return searchresultact.remoteMe.runUserSub(false, "searchresultact","menuorder_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 346;BA.debugLine="Sub MenuOrder_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(67108864);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 348;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(134217728);
searchresultact.mostCurrent.__c.runVoidMethod ("StartActivity",searchresultact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/index/1"))))));
 BA.debugLineNum = 349;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(268435456);
searchresultact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchresultact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}