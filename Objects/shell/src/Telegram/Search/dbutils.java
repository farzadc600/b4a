
package Telegram.Search;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class dbutils implements IRemote{
	public static dbutils mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public dbutils() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, dbutils.class);
    static {
		mostCurrent = new dbutils();
        remoteMe = RemoteObject.declareNull("Telegram.Search.dbutils");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("dbutils"), "Telegram.Search.dbutils");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("Telegram.Search.dbutils"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _db_real = RemoteObject.createImmutable("");
public static RemoteObject _db_integer = RemoteObject.createImmutable("");
public static RemoteObject _db_blob = RemoteObject.createImmutable("");
public static RemoteObject _db_text = RemoteObject.createImmutable("");
public static RemoteObject _htmlcss = RemoteObject.createImmutable("");
public static Telegram.Search.main _main = null;
public static Telegram.Search.httputils2service _httputils2service = null;
public static Telegram.Search.aboutact _aboutact = null;
public static Telegram.Search.searchresultact _searchresultact = null;
public static Telegram.Search.helpact _helpact = null;
public static Telegram.Search.contactact _contactact = null;
public static Telegram.Search.insertact _insertact = null;
public static Telegram.Search.groupviewact _groupviewact = null;
public static Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public static Telegram.Search.searchact _searchact = null;
  public Object[] GetGlobals() {
		return new Object[] {"aboutAct",Debug.moduleToString(Telegram.Search.aboutact.class),"contactAct",Debug.moduleToString(Telegram.Search.contactact.class),"DB_BLOB",dbutils._db_blob,"DB_INTEGER",dbutils._db_integer,"DB_REAL",dbutils._db_real,"DB_TEXT",dbutils._db_text,"groupViewAct",Debug.moduleToString(Telegram.Search.groupviewact.class),"helpAct",Debug.moduleToString(Telegram.Search.helpact.class),"HtmlCSS",dbutils._htmlcss,"HttpUtils2Service",Debug.moduleToString(Telegram.Search.httputils2service.class),"insertAct",Debug.moduleToString(Telegram.Search.insertact.class),"Main",Debug.moduleToString(Telegram.Search.main.class),"searchAct",Debug.moduleToString(Telegram.Search.searchact.class),"searchResultAct",Debug.moduleToString(Telegram.Search.searchresultact.class),"viewInsertedGroupAct",Debug.moduleToString(Telegram.Search.viewinsertedgroupact.class)};
}
}