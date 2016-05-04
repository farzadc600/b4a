
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

public class searchact implements IRemote{
	public static searchact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public searchact() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("searchact"), "Telegram.Search.searchact");
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
		pcBA = new PCBA(this, searchact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _selectedostan = RemoteObject.createImmutable(0);
public static RemoteObject _selectedshahr = RemoteObject.createImmutable(0);
public static RemoteObject _selectedcat = RemoteObject.createImmutable(0);
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtdescription = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txttag = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelinputs = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _spinnerostan = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinnershahr = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinnercat = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _txtaddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnreturn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelmessage = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _navi = RemoteObject.declareNull("de.amberhome.navdrawer.NavigationDrawer");
public static RemoteObject _pcantent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
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
  public Object[] GetGlobals() {
		return new Object[] {"aboutAct",Debug.moduleToString(Telegram.Search.aboutact.class),"Activity",searchact.mostCurrent._activity,"btnMenu",searchact.mostCurrent._btnmenu,"btnReturn",searchact.mostCurrent._btnreturn,"contactAct",Debug.moduleToString(Telegram.Search.contactact.class),"DBUtils",Debug.moduleToString(Telegram.Search.dbutils.class),"groupViewAct",Debug.moduleToString(Telegram.Search.groupviewact.class),"helpAct",Debug.moduleToString(Telegram.Search.helpact.class),"HttpUtils2Service",Debug.moduleToString(Telegram.Search.httputils2service.class),"insertAct",Debug.moduleToString(Telegram.Search.insertact.class),"Label1",searchact.mostCurrent._label1,"Label2",searchact.mostCurrent._label2,"Label3",searchact.mostCurrent._label3,"Label5",searchact.mostCurrent._label5,"Label6",searchact.mostCurrent._label6,"Label7",searchact.mostCurrent._label7,"LabelMessage",searchact.mostCurrent._labelmessage,"Main",Debug.moduleToString(Telegram.Search.main.class),"navi",searchact.mostCurrent._navi,"PanelInputs",searchact.mostCurrent._panelinputs,"pCantent",searchact.mostCurrent._pcantent,"ScrollView",searchact.mostCurrent._scrollview,"searchResultAct",Debug.moduleToString(Telegram.Search.searchresultact.class),"selectedCat",searchact._selectedcat,"selectedOstan",searchact._selectedostan,"selectedShahr",searchact._selectedshahr,"SpinnerCat",searchact.mostCurrent._spinnercat,"SpinnerOstan",searchact.mostCurrent._spinnerostan,"SpinnerShahr",searchact.mostCurrent._spinnershahr,"txtAddress",searchact.mostCurrent._txtaddress,"txtDescription",searchact.mostCurrent._txtdescription,"txtName",searchact.mostCurrent._txtname,"txtTag",searchact.mostCurrent._txttag,"viewInsertedGroupAct",Debug.moduleToString(Telegram.Search.viewinsertedgroupact.class)};
}
}