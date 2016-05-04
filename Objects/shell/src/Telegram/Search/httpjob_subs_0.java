package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class httpjob_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public JobName As String";
httpjob._jobname = RemoteObject.createImmutable("");__ref.setField("_jobname",httpjob._jobname);
 //BA.debugLineNum = 5;BA.debugLine="Public Success As Boolean";
httpjob._success = RemoteObject.createImmutable(false);__ref.setField("_success",httpjob._success);
 //BA.debugLineNum = 6;BA.debugLine="Public Username, Password As String";
httpjob._username = RemoteObject.createImmutable("");__ref.setField("_username",httpjob._username);
httpjob._password = RemoteObject.createImmutable("");__ref.setField("_password",httpjob._password);
 //BA.debugLineNum = 7;BA.debugLine="Public ErrorMessage As String";
httpjob._errormessage = RemoteObject.createImmutable("");__ref.setField("_errormessage",httpjob._errormessage);
 //BA.debugLineNum = 8;BA.debugLine="Private target As Object";
httpjob._target = RemoteObject.createNew ("Object");__ref.setField("_target",httpjob._target);
 //BA.debugLineNum = 9;BA.debugLine="Private mLink As String";
httpjob._mlink = RemoteObject.createImmutable("");__ref.setField("_mlink",httpjob._mlink);
 //BA.debugLineNum = 10;BA.debugLine="Private taskId As String";
httpjob._taskid = RemoteObject.createImmutable("");__ref.setField("_taskid",httpjob._taskid);
 //BA.debugLineNum = 11;BA.debugLine="Private req As HttpRequest";
httpjob._req = RemoteObject.createNew ("anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper");__ref.setField("_req",httpjob._req);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _complete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Complete (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("complete")) return __ref.runUserSub(false, "httpjob","complete", __ref, _id);
Debug.locals.put("id", _id);
 BA.debugLineNum = 90;BA.debugLine="Public Sub Complete (id As Int)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="taskId = id";
Debug.ShouldStop(67108864);
__ref.setField ("_taskid",BA.NumberToString(_id));
 BA.debugLineNum = 92;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
Debug.ShouldStop(134217728);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.runMethod(false,"getActivityBA"),(Object)(__ref.getField(false,"_target")),(Object)(BA.ObjectToString("JobDone")),(Object)(__ref));
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
public static RemoteObject  _download(RemoteObject __ref,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("Download (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("download")) return __ref.runUserSub(false, "httpjob","download", __ref, _link);
Debug.locals.put("Link", _link);
 BA.debugLineNum = 58;BA.debugLine="Public Sub Download(Link As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="mLink = Link";
Debug.ShouldStop(67108864);
__ref.setField ("_mlink",_link);
 BA.debugLineNum = 60;BA.debugLine="req.InitializeGet(Link)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_req").runVoidMethod ("InitializeGet",(Object)(_link));
 BA.debugLineNum = 61;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(268435456);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.runMethod(false,"getActivityBA"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
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
public static RemoteObject  _download2(RemoteObject __ref,RemoteObject _link,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("Download2 (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("download2")) return __ref.runUserSub(false, "httpjob","download2", __ref, _link, _parameters);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
int _i = 0;
Debug.locals.put("Link", _link);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 68;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="mLink = Link";
Debug.ShouldStop(16);
__ref.setField ("_mlink",_link);
 BA.debugLineNum = 70;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 71;BA.debugLine="sb.Initialize";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="sb.Append(Link)";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(_link));
 BA.debugLineNum = 73;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_parameters.getField(true,"length"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));};
 BA.debugLineNum = 74;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(512);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 75;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
Debug.ShouldStop(1024);
{
final int step7 = 2;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_parameters.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7); _i = ((int)(0 + _i + step7)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&")));};
 BA.debugLineNum = 77;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
Debug.ShouldStop(4096);
_sb.runMethod(false,"Append",(Object)(_su.runMethod(true,"EncodeUrl",(Object)(_parameters.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)(RemoteObject.createImmutable("UTF8"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("=")));
 BA.debugLineNum = 78;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(_su.runMethod(true,"EncodeUrl",(Object)(_parameters.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(RemoteObject.createImmutable("UTF8")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 80;BA.debugLine="req.InitializeGet(sb.ToString)";
Debug.ShouldStop(32768);
__ref.getField(false,"_req").runVoidMethod ("InitializeGet",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 81;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(65536);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.runMethod(false,"getActivityBA"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbitmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBitmap (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("getbitmap")) return __ref.runUserSub(false, "httpjob","getbitmap", __ref);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 BA.debugLineNum = 116;BA.debugLine="Public Sub GetBitmap As Bitmap";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(1048576);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 118;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
Debug.ShouldStop(2097152);
_b = httpjob.__c.runMethod(false,"LoadBitmap",(Object)(httpjob._httputils2service._tempfolder),(Object)(__ref.getField(true,"_taskid")));Debug.locals.put("b", _b);
 BA.debugLineNum = 119;BA.debugLine="Return b";
Debug.ShouldStop(4194304);
if (true) return _b;
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinputstream(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetInputStream (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("getinputstream")) return __ref.runUserSub(false, "httpjob","getinputstream", __ref);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 122;BA.debugLine="Sub GetInputStream As InputStream";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(67108864);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 124;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
Debug.ShouldStop(134217728);
_in = httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(httpjob._httputils2service._tempfolder),(Object)(__ref.getField(true,"_taskid")));Debug.locals.put("In", _in);
 BA.debugLineNum = 125;BA.debugLine="Return In";
Debug.ShouldStop(268435456);
if (true) return _in;
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrequest(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRequest (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("getrequest")) return __ref.runUserSub(false, "httpjob","getrequest", __ref);
 BA.debugLineNum = 85;BA.debugLine="Public Sub GetRequest As HttpRequest";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Return req";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_req");
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetString (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("getstring")) return __ref.runUserSub(false, "httpjob","getstring", __ref);
 BA.debugLineNum = 101;BA.debugLine="Public Sub GetString As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Return GetString2(\"UTF8\")";
Debug.ShouldStop(32);
if (true) return __ref.runClassMethod (Telegram.Search.httpjob.class, "_getstring2",(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
public static RemoteObject  _getstring2(RemoteObject __ref,RemoteObject _encoding) throws Exception{
try {
		Debug.PushSubsStack("GetString2 (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("getstring2")) return __ref.runUserSub(false, "httpjob","getstring2", __ref, _encoding);
RemoteObject _tr = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("Encoding", _encoding);
 BA.debugLineNum = 106;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Dim tr As TextReader";
Debug.ShouldStop(1024);
_tr = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("tr", _tr);
 BA.debugLineNum = 108;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
Debug.ShouldStop(2048);
_tr.runVoidMethod ("Initialize2",(Object)((httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(httpjob._httputils2service._tempfolder),(Object)(__ref.getField(true,"_taskid"))).getObject())),(Object)(_encoding));
 BA.debugLineNum = 109;BA.debugLine="Dim res As String";
Debug.ShouldStop(4096);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 110;BA.debugLine="res = tr.ReadAll";
Debug.ShouldStop(8192);
_res = _tr.runMethod(true,"ReadAll");Debug.locals.put("res", _res);
 BA.debugLineNum = 111;BA.debugLine="tr.Close";
Debug.ShouldStop(16384);
_tr.runVoidMethod ("Close");
 BA.debugLineNum = 112;BA.debugLine="Return res";
Debug.ShouldStop(32768);
if (true) return _res;
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _name,RemoteObject _targetmodule) throws Exception{
try {
		Debug.PushSubsStack("Initialize (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "httpjob","initialize", __ref, _ba, _name, _targetmodule);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Name", _name);
Debug.locals.put("TargetModule", _targetmodule);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="JobName = Name";
Debug.ShouldStop(131072);
__ref.setField ("_jobname",_name);
 BA.debugLineNum = 19;BA.debugLine="target = TargetModule";
Debug.ShouldStop(262144);
__ref.setField ("_target",_targetmodule);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
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
public static RemoteObject  _postbytes(RemoteObject __ref,RemoteObject _link,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("PostBytes (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("postbytes")) return __ref.runUserSub(false, "httpjob","postbytes", __ref, _link, _data);
Debug.locals.put("Link", _link);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 27;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="mLink = Link";
Debug.ShouldStop(134217728);
__ref.setField ("_mlink",_link);
 BA.debugLineNum = 29;BA.debugLine="req.InitializePost2(Link, Data)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_req").runVoidMethod ("InitializePost2",(Object)(_link),(Object)(_data));
 BA.debugLineNum = 30;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.ShouldStop(536870912);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.runMethod(false,"getActivityBA"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
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
public static RemoteObject  _postfile(RemoteObject __ref,RemoteObject _link,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("PostFile (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("postfile")) return __ref.runUserSub(false, "httpjob","postfile", __ref, _link, _dir, _filename);
RemoteObject _length = RemoteObject.createImmutable(0);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Link", _link);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 35;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Dim length As Int";
Debug.ShouldStop(8);
_length = RemoteObject.createImmutable(0);Debug.locals.put("length", _length);
 BA.debugLineNum = 37;BA.debugLine="If Dir = File.DirAssets Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_dir,httpjob.__c.getField(false,"File").runMethod(true,"getDirAssets"))) { 
 BA.debugLineNum = 38;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
Debug.ShouldStop(32);
httpjob.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Cannot send files from the assets folder.")));
 BA.debugLineNum = 39;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 41;BA.debugLine="length = File.Size(Dir, FileName)";
Debug.ShouldStop(256);
_length = BA.numberCast(int.class, httpjob.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename)));Debug.locals.put("length", _length);
 BA.debugLineNum = 42;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(512);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 43;BA.debugLine="In = File.OpenInput(Dir, FileName)";
Debug.ShouldStop(1024);
_in = httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename));Debug.locals.put("In", _in);
 BA.debugLineNum = 44;BA.debugLine="If length < 1000000 Then '1mb";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",_length,BA.numberCast(double.class, 1000000))) { 
 BA.debugLineNum = 47;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(16384);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 48;BA.debugLine="out.InitializeToBytesArray(length)";
Debug.ShouldStop(32768);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(_length));
 BA.debugLineNum = 49;BA.debugLine="File.Copy2(In, out)";
Debug.ShouldStop(65536);
httpjob.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_in.getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 50;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
Debug.ShouldStop(131072);
__ref.runClassMethod (Telegram.Search.httpjob.class, "_postbytes",(Object)(_link),(Object)(_out.runMethod(false,"ToBytesArray")));
 }else {
 BA.debugLineNum = 52;BA.debugLine="req.InitializePost(Link, In, length)";
Debug.ShouldStop(524288);
__ref.getField(false,"_req").runVoidMethod ("InitializePost",(Object)(_link),(Object)((_in.getObject())),(Object)(_length));
 BA.debugLineNum = 53;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
Debug.ShouldStop(1048576);
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.runMethod(false,"getActivityBA"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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
public static RemoteObject  _poststring(RemoteObject __ref,RemoteObject _link,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("PostString (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("poststring")) return __ref.runUserSub(false, "httpjob","poststring", __ref, _link, _text);
Debug.locals.put("Link", _link);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 22;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
Debug.ShouldStop(4194304);
__ref.runClassMethod (Telegram.Search.httpjob.class, "_postbytes",(Object)(_link),(Object)(_text.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
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
public static RemoteObject  _release(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Release (httpjob) ","httpjob",11,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("release")) return __ref.runUserSub(false, "httpjob","release", __ref);
 BA.debugLineNum = 96;BA.debugLine="Public Sub Release";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
Debug.ShouldStop(1);
httpjob.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(httpjob._httputils2service._tempfolder),(Object)(__ref.getField(true,"_taskid")));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
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
}