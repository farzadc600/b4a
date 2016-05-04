
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

public class viewinsertedgroupact implements IRemote{
	public static viewinsertedgroupact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public viewinsertedgroupact() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("viewinsertedgroupact"), "Telegram.Search.viewinsertedgroupact");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, viewinsertedgroupact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _finishinserting = RemoteObject.createImmutable(false);
public static RemoteObject _firs = RemoteObject.createImmutable(false);
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnreturn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittextmobile = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static Telegram.Search.main _main = null;
public static Telegram.Search.httputils2service _httputils2service = null;
public static Telegram.Search.aboutact _aboutact = null;
public static Telegram.Search.searchresultact _searchresultact = null;
public static Telegram.Search.dbutils _dbutils = null;
public static Telegram.Search.helpact _helpact = null;
public static Telegram.Search.contactact _contactact = null;
public static Telegram.Search.insertact _insertact = null;
public static Telegram.Search.groupviewact _groupviewact = null;
public static Telegram.Search.searchact _searchact = null;
  public Object[] GetGlobals() {
		return new Object[] {"aboutAct",Debug.moduleToString(Telegram.Search.aboutact.class),"Activity",viewinsertedgroupact.mostCurrent._activity,"btnReturn",viewinsertedgroupact.mostCurrent._btnreturn,"contactAct",Debug.moduleToString(Telegram.Search.contactact.class),"DBUtils",Debug.moduleToString(Telegram.Search.dbutils.class),"EditTextMobile",viewinsertedgroupact.mostCurrent._edittextmobile,"finishInserting",viewinsertedgroupact._finishinserting,"firs",viewinsertedgroupact._firs,"groupViewAct",Debug.moduleToString(Telegram.Search.groupviewact.class),"helpAct",Debug.moduleToString(Telegram.Search.helpact.class),"HttpUtils2Service",Debug.moduleToString(Telegram.Search.httputils2service.class),"insertAct",Debug.moduleToString(Telegram.Search.insertact.class),"Label1",viewinsertedgroupact.mostCurrent._label1,"Label2",viewinsertedgroupact.mostCurrent._label2,"Label3",viewinsertedgroupact.mostCurrent._label3,"Label5",viewinsertedgroupact.mostCurrent._label5,"Main",Debug.moduleToString(Telegram.Search.main.class),"Panel1",viewinsertedgroupact.mostCurrent._panel1,"searchAct",Debug.moduleToString(Telegram.Search.searchact.class),"searchResultAct",Debug.moduleToString(Telegram.Search.searchresultact.class),"txtName",viewinsertedgroupact.mostCurrent._txtname};
}
}