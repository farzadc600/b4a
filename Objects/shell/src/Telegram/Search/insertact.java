
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

public class insertact implements IRemote{
	public static insertact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public insertact() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("insertact"), "Telegram.Search.insertact");
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
		pcBA = new PCBA(this, insertact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _desciption = RemoteObject.createImmutable("");
public static RemoteObject _address = RemoteObject.createImmutable("");
public static RemoteObject _searchresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ostan = RemoteObject.createImmutable("");
public static RemoteObject _shahr = RemoteObject.createImmutable("");
public static RemoteObject _tag = RemoteObject.createImmutable("");
public static RemoteObject _admin = RemoteObject.createImmutable("");
public static RemoteObject _cat = RemoteObject.createImmutable("");
public static RemoteObject _groupicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _selectedostan = RemoteObject.createImmutable(0);
public static RemoteObject _selectedshahr = RemoteObject.createImmutable(0);
public static RemoteObject _selectedcat = RemoteObject.createImmutable(0);
public static RemoteObject _txtname = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtaddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtdescription = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _labelname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeldesc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeladdress = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txtadmin = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _spinnerostan = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinnershahr = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinnercat = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _label9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txttag = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _label10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelinput = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btninsert = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _navi = RemoteObject.declareNull("de.amberhome.navdrawer.NavigationDrawer");
public static RemoteObject _pcantent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editmembercount = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static Telegram.Search.main _main = null;
public static Telegram.Search.httputils2service _httputils2service = null;
public static Telegram.Search.aboutact _aboutact = null;
public static Telegram.Search.searchresultact _searchresultact = null;
public static Telegram.Search.dbutils _dbutils = null;
public static Telegram.Search.helpact _helpact = null;
public static Telegram.Search.contactact _contactact = null;
public static Telegram.Search.groupviewact _groupviewact = null;
public static Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public static Telegram.Search.searchact _searchact = null;
  public Object[] GetGlobals() {
		return new Object[] {"aboutAct",Debug.moduleToString(Telegram.Search.aboutact.class),"Activity",insertact.mostCurrent._activity,"address",insertact._address,"admin",insertact._admin,"btnInsert",insertact.mostCurrent._btninsert,"btnMenu",insertact.mostCurrent._btnmenu,"cat",insertact._cat,"contactAct",Debug.moduleToString(Telegram.Search.contactact.class),"DBUtils",Debug.moduleToString(Telegram.Search.dbutils.class),"desciption",insertact._desciption,"EditMemberCount",insertact.mostCurrent._editmembercount,"groupIcon",insertact._groupicon,"groupViewAct",Debug.moduleToString(Telegram.Search.groupviewact.class),"helpAct",Debug.moduleToString(Telegram.Search.helpact.class),"HttpUtils2Service",Debug.moduleToString(Telegram.Search.httputils2service.class),"ImageView1",insertact.mostCurrent._imageview1,"Label10",insertact.mostCurrent._label10,"Label4",insertact.mostCurrent._label4,"Label5",insertact.mostCurrent._label5,"Label6",insertact.mostCurrent._label6,"Label7",insertact.mostCurrent._label7,"Label8",insertact.mostCurrent._label8,"Label9",insertact.mostCurrent._label9,"LabelAddress",insertact.mostCurrent._labeladdress,"LabelDesc",insertact.mostCurrent._labeldesc,"LabelName",insertact.mostCurrent._labelname,"Main",Debug.moduleToString(Telegram.Search.main.class),"name",insertact._name,"navi",insertact.mostCurrent._navi,"Ostan",insertact._ostan,"PanelInput",insertact.mostCurrent._panelinput,"pCantent",insertact.mostCurrent._pcantent,"ScrollView",insertact.mostCurrent._scrollview,"searchAct",Debug.moduleToString(Telegram.Search.searchact.class),"searchResult",insertact._searchresult,"searchResultAct",Debug.moduleToString(Telegram.Search.searchresultact.class),"selectedCat",insertact._selectedcat,"selectedOstan",insertact._selectedostan,"selectedShahr",insertact._selectedshahr,"Shahr",insertact._shahr,"SpinnerCat",insertact.mostCurrent._spinnercat,"SpinnerOstan",insertact.mostCurrent._spinnerostan,"SpinnerShahr",insertact.mostCurrent._spinnershahr,"Tag",insertact._tag,"txtAddress",insertact.mostCurrent._txtaddress,"txtAdmin",insertact.mostCurrent._txtadmin,"txtDescription",insertact.mostCurrent._txtdescription,"txtName",insertact.mostCurrent._txtname,"txtTag",insertact.mostCurrent._txttag,"viewInsertedGroupAct",Debug.moduleToString(Telegram.Search.viewinsertedgroupact.class)};
}
}