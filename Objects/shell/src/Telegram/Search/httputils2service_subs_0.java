package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class httputils2service_subs_0 {


public static RemoteObject  _completejob(RemoteObject _taskid,RemoteObject _success,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("CompleteJob (httputils2service) ","httputils2service",1,httputils2service.processBA,httputils2service.mostCurrent,64);
if (RapidSub.canDelegate("completejob")) return httputils2service.remoteMe.runUserSub(false, "httputils2service","completejob", _taskid, _success, _errormessage);
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
Debug.locals.put("TaskId", _taskid);
Debug.locals.put("success", _success);
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 64;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 66;BA.debugLine="job = TaskIdToJob.Get(TaskId)";
Debug.ShouldStop(2);
_job = (httputils2service._taskidtojob.runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);
 BA.debugLineNum = 67;BA.debugLine="TaskIdToJob.Remove(TaskId)";
Debug.ShouldStop(4);
httputils2service._taskidtojob.runVoidMethod ("Remove",(Object)((_taskid)));
 BA.debugLineNum = 68;BA.debugLine="job.success = success";
Debug.ShouldStop(8);
_job.setField ("_success",_success);
 BA.debugLineNum = 69;BA.debugLine="job.errorMessage = errorMessage";
Debug.ShouldStop(16);
_job.setField ("_errormessage",_errormessage);
 BA.debugLineNum = 70;BA.debugLine="job.Complete(TaskId)";
Debug.ShouldStop(32);
_job.runClassMethod (Telegram.Search.httpjob.class, "_complete",(Object)(_taskid));
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
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (httputils2service) ","httputils2service",1,httputils2service.processBA,httputils2service.mostCurrent,52);
if (RapidSub.canDelegate("hc_responseerror")) return httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responseerror", _response, _reason, _statuscode, _taskid);
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 52;BA.debugLine="Sub hc_ResponseError (Response As HttpResponse, Re";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If Response <> Null Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("N",_response)) { 
 BA.debugLineNum = 54;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 55;BA.debugLine="Log(Response.GetString(\"UTF8\"))";
Debug.ShouldStop(4194304);
httputils2service.mostCurrent.__c.runVoidMethod ("Log",(Object)(_response.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("UTF8")))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e40) {
			BA.rdebugUtils.runVoidMethod("setLastException",httputils2service.processBA, e40.toString()); BA.debugLineNum = 57;BA.debugLine="Log(\"Failed to read error message.\")";
Debug.ShouldStop(16777216);
httputils2service.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Failed to read error message.")));
 };
 BA.debugLineNum = 59;BA.debugLine="Response.Release";
Debug.ShouldStop(67108864);
_response.runVoidMethod ("Release");
 };
 BA.debugLineNum = 61;BA.debugLine="CompleteJob(TaskId, False, Reason)";
Debug.ShouldStop(268435456);
_completejob(_taskid,httputils2service.mostCurrent.__c.getField(true,"False"),_reason);
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
public static RemoteObject  _hc_responsesuccess(RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseSuccess (httputils2service) ","httputils2service",1,httputils2service.processBA,httputils2service.mostCurrent,39);
if (RapidSub.canDelegate("hc_responsesuccess")) return httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responsesuccess", _response, _taskid);
Debug.locals.put("Response", _response);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 39;BA.debugLine="Sub hc_ResponseSuccess (Response As HttpResponse,";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Response.GetAsynchronously(\"response\", File.OpenO";
Debug.ShouldStop(128);
_response.runVoidMethod ("GetAsynchronously",httputils2service.processBA,(Object)(BA.ObjectToString("response")),(Object)((httputils2service.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(httputils2service._tempfolder),(Object)(BA.NumberToString(_taskid)),(Object)(httputils2service.mostCurrent.__c.getField(true,"False"))).getObject())),(Object)(httputils2service.mostCurrent.__c.getField(true,"True")),(Object)(_taskid));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private hc As HttpClient";
httputils2service._hc = RemoteObject.createNew ("anywheresoftware.b4a.http.HttpClientWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Private TaskIdToJob As Map";
httputils2service._taskidtojob = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="Public TempFolder";
httputils2service._tempfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Private taskCounter As Int";
httputils2service._taskcounter = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _response_streamfinish(RemoteObject _success,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("Response_StreamFinish (httputils2service) ","httputils2service",1,httputils2service.processBA,httputils2service.mostCurrent,44);
if (RapidSub.canDelegate("response_streamfinish")) return httputils2service.remoteMe.runUserSub(false, "httputils2service","response_streamfinish", _success, _taskid);
Debug.locals.put("Success", _success);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 44;BA.debugLine="Sub Response_StreamFinish (Success As Boolean, Tas";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If Success Then";
Debug.ShouldStop(4096);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 46;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
Debug.ShouldStop(8192);
_completejob(_taskid,_success,RemoteObject.createImmutable(""));
 }else {
 BA.debugLineNum = 48;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
Debug.ShouldStop(32768);
_completejob(_taskid,_success,httputils2service.mostCurrent.__c.runMethod(false,"LastException",httputils2service.processBA).runMethod(true,"getMessage"));
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (httputils2service) ","httputils2service",1,httputils2service.processBA,httputils2service.mostCurrent,14);
if (RapidSub.canDelegate("service_create")) return httputils2service.remoteMe.runUserSub(false, "httputils2service","service_create");
 BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="TempFolder = File.DirInternalCache";
Debug.ShouldStop(16384);
httputils2service._tempfolder = httputils2service.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache");
 BA.debugLineNum = 16;BA.debugLine="hc.Initialize(\"hc\")";
Debug.ShouldStop(32768);
httputils2service._hc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("hc")));
 BA.debugLineNum = 17;BA.debugLine="TaskIdToJob.Initialize";
Debug.ShouldStop(65536);
httputils2service._taskidtojob.runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
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
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (httputils2service) ","httputils2service",1,httputils2service.processBA,httputils2service.mostCurrent,24);
if (RapidSub.canDelegate("service_destroy")) return httputils2service.remoteMe.runUserSub(false, "httputils2service","service_destroy");
 BA.debugLineNum = 24;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (httputils2service) ","httputils2service",1,httputils2service.processBA,httputils2service.mostCurrent,20);
if (RapidSub.canDelegate("service_start")) return httputils2service.remoteMe.runUserSub(false, "httputils2service","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 20;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
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
public static RemoteObject  _submitjob(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("SubmitJob (httputils2service) ","httputils2service",1,httputils2service.processBA,httputils2service.mostCurrent,28);
if (RapidSub.canDelegate("submitjob")) return httputils2service.remoteMe.runUserSub(false, "httputils2service","submitjob", _job);
Debug.locals.put("job", _job);
 BA.debugLineNum = 28;BA.debugLine="Public Sub SubmitJob(job As HttpJob) As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="taskCounter = taskCounter + 1";
Debug.ShouldStop(268435456);
httputils2service._taskcounter = RemoteObject.solve(new RemoteObject[] {httputils2service._taskcounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 30;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
Debug.ShouldStop(536870912);
httputils2service._taskidtojob.runVoidMethod ("Put",(Object)((httputils2service._taskcounter)),(Object)((_job)));
 BA.debugLineNum = 31;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_job.getField(true,"_username"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_job.getField(true,"_password"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 32;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
Debug.ShouldStop(-2147483648);
httputils2service._hc.runVoidMethod ("ExecuteCredentials",httputils2service.processBA,(Object)(_job.runClassMethod (Telegram.Search.httpjob.class, "_getrequest")),(Object)(httputils2service._taskcounter),(Object)(_job.getField(true,"_username")),(Object)(_job.getField(true,"_password")));
 }else {
 BA.debugLineNum = 34;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
Debug.ShouldStop(2);
httputils2service._hc.runVoidMethod ("Execute",httputils2service.processBA,(Object)(_job.runClassMethod (Telegram.Search.httpjob.class, "_getrequest")),(Object)(httputils2service._taskcounter));
 };
 BA.debugLineNum = 36;BA.debugLine="Return taskCounter";
Debug.ShouldStop(8);
if (true) return httputils2service._taskcounter;
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}