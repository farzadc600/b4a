
package Telegram.Search;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class httpjob {
    public static RemoteObject myClass;
	public httpjob() {
	}
    public static PCBA staticBA = new PCBA(null, httpjob.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _jobname = RemoteObject.createImmutable("");
public static RemoteObject _success = RemoteObject.createImmutable(false);
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _errormessage = RemoteObject.createImmutable("");
public static RemoteObject _target = RemoteObject.declareNull("Object");
public static RemoteObject _mlink = RemoteObject.createImmutable("");
public static RemoteObject _taskid = RemoteObject.createImmutable("");
public static RemoteObject _req = RemoteObject.declareNull("anywheresoftware.b4a.http.HttpClientWrapper.HttpUriRequestWrapper");
public static Telegram.Search.main _main = null;
public static Telegram.Search.httputils2service _httputils2service = null;
public static Telegram.Search.aboutact _aboutact = null;
public static Telegram.Search.searchresultact _searchresultact = null;
public static Telegram.Search.dbutils _dbutils = null;
public static Telegram.Search.helpact _helpact = null;
public static Telegram.Search.contactact _contactact = null;
public static Telegram.Search.insertact _insertact = null;
public static Telegram.Search.groupviewact _groupviewact = null;
public static Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public static Telegram.Search.searchact _searchact = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ErrorMessage",_ref.getField(false, "_errormessage"),"JobName",_ref.getField(false, "_jobname"),"mLink",_ref.getField(false, "_mlink"),"Password",_ref.getField(false, "_password"),"req",_ref.getField(false, "_req"),"Success",_ref.getField(false, "_success"),"target",_ref.getField(false, "_target"),"taskId",_ref.getField(false, "_taskid"),"Username",_ref.getField(false, "_username")};
}
}