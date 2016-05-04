
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

public class groupviewact implements IRemote{
	public static groupviewact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public groupviewact() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("groupviewact"), "Telegram.Search.groupviewact");
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
		pcBA = new PCBA(this, groupviewact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnjoin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnbrokelink = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labeldesc = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _itemtype = RemoteObject.createImmutable(0);
public static RemoteObject _imagepreivew = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imagebackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _navi = RemoteObject.declareNull("de.amberhome.navdrawer.NavigationDrawer");
public static RemoteObject _pcantent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btncopy = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _edittextcomment = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _listviewcomment = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _labelinsertdate = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelshahr = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelostan = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelmember = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeladmin = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeltag = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeladdress = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labellike = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelcat = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelallert = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _buttonminus = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelliketitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btninstagram = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imageviewall = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static Telegram.Search.main _main = null;
public static Telegram.Search.httputils2service _httputils2service = null;
public static Telegram.Search.aboutact _aboutact = null;
public static Telegram.Search.searchresultact _searchresultact = null;
public static Telegram.Search.dbutils _dbutils = null;
public static Telegram.Search.helpact _helpact = null;
public static Telegram.Search.contactact _contactact = null;
public static Telegram.Search.insertact _insertact = null;
public static Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public static Telegram.Search.searchact _searchact = null;
  public Object[] GetGlobals() {
		return new Object[] {"aboutAct",Debug.moduleToString(Telegram.Search.aboutact.class),"Activity",groupviewact.mostCurrent._activity,"btnBrokeLink",groupviewact.mostCurrent._btnbrokelink,"btnCopy",groupviewact.mostCurrent._btncopy,"btnInstagram",groupviewact.mostCurrent._btninstagram,"btnJoin",groupviewact.mostCurrent._btnjoin,"btnMenu",groupviewact.mostCurrent._btnmenu,"ButtonMinus",groupviewact.mostCurrent._buttonminus,"contactAct",Debug.moduleToString(Telegram.Search.contactact.class),"DBUtils",Debug.moduleToString(Telegram.Search.dbutils.class),"EditTextComment",groupviewact.mostCurrent._edittextcomment,"helpAct",Debug.moduleToString(Telegram.Search.helpact.class),"HttpUtils2Service",Debug.moduleToString(Telegram.Search.httputils2service.class),"ImageBackground",groupviewact.mostCurrent._imagebackground,"ImagePreivew",groupviewact.mostCurrent._imagepreivew,"ImageViewAll",groupviewact.mostCurrent._imageviewall,"insertAct",Debug.moduleToString(Telegram.Search.insertact.class),"itemType",groupviewact._itemtype,"Label5",groupviewact.mostCurrent._label5,"LabelAddress",groupviewact.mostCurrent._labeladdress,"LabelAdmin",groupviewact.mostCurrent._labeladmin,"LabelAllert",groupviewact.mostCurrent._labelallert,"LabelCat",groupviewact.mostCurrent._labelcat,"LabelDesc",groupviewact.mostCurrent._labeldesc,"LabelInsertDate",groupviewact.mostCurrent._labelinsertdate,"LabelLike",groupviewact.mostCurrent._labellike,"LabelLikeTitle",groupviewact.mostCurrent._labelliketitle,"LabelMember",groupviewact.mostCurrent._labelmember,"LabelName",groupviewact.mostCurrent._labelname,"LabelOstan",groupviewact.mostCurrent._labelostan,"LabelShahr",groupviewact.mostCurrent._labelshahr,"LabelTag",groupviewact.mostCurrent._labeltag,"ListViewComment",groupviewact.mostCurrent._listviewcomment,"Main",Debug.moduleToString(Telegram.Search.main.class),"navi",groupviewact.mostCurrent._navi,"Panel1",groupviewact.mostCurrent._panel1,"Panel2",groupviewact.mostCurrent._panel2,"pCantent",groupviewact.mostCurrent._pcantent,"ScrollView1",groupviewact.mostCurrent._scrollview1,"searchAct",Debug.moduleToString(Telegram.Search.searchact.class),"searchResultAct",Debug.moduleToString(Telegram.Search.searchresultact.class),"viewInsertedGroupAct",Debug.moduleToString(Telegram.Search.viewinsertedgroupact.class)};
}
}