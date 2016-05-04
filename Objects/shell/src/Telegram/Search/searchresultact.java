
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

public class searchresultact implements IRemote{
	public static searchresultact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public searchresultact() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("searchresultact"), "Telegram.Search.searchresultact");
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
		pcBA = new PCBA(this, searchresultact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listviewresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _btnmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _resultcount = RemoteObject.createImmutable(0);
public static RemoteObject _pagenumber = RemoteObject.createImmutable(0);
public static RemoteObject _labelpage = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnnext = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnprev = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _navi = RemoteObject.declareNull("de.amberhome.navdrawer.NavigationDrawer");
public static RemoteObject _pcantent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static Telegram.Search.main _main = null;
public static Telegram.Search.httputils2service _httputils2service = null;
public static Telegram.Search.aboutact _aboutact = null;
public static Telegram.Search.dbutils _dbutils = null;
public static Telegram.Search.helpact _helpact = null;
public static Telegram.Search.contactact _contactact = null;
public static Telegram.Search.insertact _insertact = null;
public static Telegram.Search.groupviewact _groupviewact = null;
public static Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public static Telegram.Search.searchact _searchact = null;
  public Object[] GetGlobals() {
		return new Object[] {"aboutAct",Debug.moduleToString(Telegram.Search.aboutact.class),"Activity",searchresultact.mostCurrent._activity,"btnMenu",searchresultact.mostCurrent._btnmenu,"btnNext",searchresultact.mostCurrent._btnnext,"btnPrev",searchresultact.mostCurrent._btnprev,"contactAct",Debug.moduleToString(Telegram.Search.contactact.class),"DBUtils",Debug.moduleToString(Telegram.Search.dbutils.class),"groupViewAct",Debug.moduleToString(Telegram.Search.groupviewact.class),"helpAct",Debug.moduleToString(Telegram.Search.helpact.class),"HttpUtils2Service",Debug.moduleToString(Telegram.Search.httputils2service.class),"ImageView1",searchresultact.mostCurrent._imageview1,"insertAct",Debug.moduleToString(Telegram.Search.insertact.class),"Label1",searchresultact.mostCurrent._label1,"LabelPage",searchresultact.mostCurrent._labelpage,"ListViewResult",searchresultact.mostCurrent._listviewresult,"Main",Debug.moduleToString(Telegram.Search.main.class),"navi",searchresultact.mostCurrent._navi,"pageNumber",searchresultact._pagenumber,"pCantent",searchresultact.mostCurrent._pcantent,"resultCount",searchresultact._resultcount,"searchAct",Debug.moduleToString(Telegram.Search.searchact.class),"viewInsertedGroupAct",Debug.moduleToString(Telegram.Search.viewinsertedgroupact.class)};
}
}