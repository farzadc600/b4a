
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "Telegram.Search.main");
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
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ostan = null;
public static RemoteObject _cat = null;
public static RemoteObject _dbfilename = RemoteObject.createImmutable("");
public static RemoteObject _dbfiledir = RemoteObject.createImmutable("");
public static RemoteObject _dbtablename = RemoteObject.createImmutable("");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _selected_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _searchresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _groupicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _stickericon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _idicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _roboticon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _channelicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _selectedtype = RemoteObject.createImmutable("");
public static RemoteObject _selectedtypetitle = RemoteObject.createImmutable("");
public static RemoteObject _query = RemoteObject.createImmutable("");
public static RemoteObject _parameter = RemoteObject.createImmutable("");
public static RemoteObject _userinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _phone = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _phoneid = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneId");
public static RemoteObject _font = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _rightbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _isedit = RemoteObject.createImmutable(false);
public static RemoteObject _issupergroup = RemoteObject.createImmutable(false);
public static RemoteObject _vipinsertcount = RemoteObject.createImmutable(0);
public static RemoteObject _todayinsertcount = RemoteObject.createImmutable(0);
public static RemoteObject _panelsticker = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelchannel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _group = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _sticker = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _channel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _navi = RemoteObject.declareNull("de.amberhome.navdrawer.NavigationDrawer");
public static RemoteObject _pcantent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _buttontopid = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonlastid = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonsearchid = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonaddid = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttontopjoingroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttontopgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonlastgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonsearchgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonaddgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _search = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _editsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _buttonsupergroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonvipchannel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview21 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview22 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview23 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview24 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview25 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview26 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview15 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview16 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview17 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview18 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview19 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview20 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview11 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview12 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview13 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview14 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview30 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imageview27 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _labelback = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _buttoninsertsupergroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttonmygroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _scrollviewchannel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _buttonmychannel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _scrollviewgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelgroupcontainer = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelchannelcontainer = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _buttontopchannelview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imageview29 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _panelstickercontainer = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scrollviewsticker = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
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
  public Object[] GetGlobals() {
		return new Object[] {"aboutAct",Debug.moduleToString(Telegram.Search.aboutact.class),"Activity",main.mostCurrent._activity,"btnMenu",main.mostCurrent._btnmenu,"ButtonAddGroup",main.mostCurrent._buttonaddgroup,"ButtonAddId",main.mostCurrent._buttonaddid,"ButtonInsertSuperGroup",main.mostCurrent._buttoninsertsupergroup,"ButtonLastGroup",main.mostCurrent._buttonlastgroup,"ButtonLastId",main.mostCurrent._buttonlastid,"ButtonMyChannel",main.mostCurrent._buttonmychannel,"ButtonMyGroup",main.mostCurrent._buttonmygroup,"ButtonSearchGroup",main.mostCurrent._buttonsearchgroup,"ButtonSearchId",main.mostCurrent._buttonsearchid,"ButtonSuperGroup",main.mostCurrent._buttonsupergroup,"ButtonTopChannelView",main.mostCurrent._buttontopchannelview,"ButtonTopGroup",main.mostCurrent._buttontopgroup,"ButtonTopId",main.mostCurrent._buttontopid,"ButtonTopJoinGroup",main.mostCurrent._buttontopjoingroup,"ButtonVIPChannel",main.mostCurrent._buttonvipchannel,"cat",main._cat,"Channel",main.mostCurrent._channel,"channelIcon",main._channelicon,"contactAct",Debug.moduleToString(Telegram.Search.contactact.class),"DBFileDir",main._dbfiledir,"DBFileName",main._dbfilename,"DBTableName",main._dbtablename,"DBUtils",Debug.moduleToString(Telegram.Search.dbutils.class),"EditSearch",main.mostCurrent._editsearch,"font",main._font,"Group",main.mostCurrent._group,"groupIcon",main._groupicon,"groupViewAct",Debug.moduleToString(Telegram.Search.groupviewact.class),"helpAct",Debug.moduleToString(Telegram.Search.helpact.class),"HttpUtils2Service",Debug.moduleToString(Telegram.Search.httputils2service.class),"idIcon",main._idicon,"ImageView1",main.mostCurrent._imageview1,"ImageView10",main.mostCurrent._imageview10,"ImageView11",main.mostCurrent._imageview11,"ImageView12",main.mostCurrent._imageview12,"ImageView13",main.mostCurrent._imageview13,"ImageView14",main.mostCurrent._imageview14,"ImageView15",main.mostCurrent._imageview15,"ImageView16",main.mostCurrent._imageview16,"ImageView17",main.mostCurrent._imageview17,"ImageView18",main.mostCurrent._imageview18,"ImageView19",main.mostCurrent._imageview19,"ImageView2",main.mostCurrent._imageview2,"ImageView20",main.mostCurrent._imageview20,"ImageView21",main.mostCurrent._imageview21,"ImageView22",main.mostCurrent._imageview22,"ImageView23",main.mostCurrent._imageview23,"ImageView24",main.mostCurrent._imageview24,"ImageView25",main.mostCurrent._imageview25,"ImageView26",main.mostCurrent._imageview26,"ImageView27",main.mostCurrent._imageview27,"ImageView29",main.mostCurrent._imageview29,"ImageView3",main.mostCurrent._imageview3,"ImageView30",main.mostCurrent._imageview30,"ImageView4",main.mostCurrent._imageview4,"ImageView5",main.mostCurrent._imageview5,"ImageView6",main.mostCurrent._imageview6,"ImageView7",main.mostCurrent._imageview7,"ImageView8",main.mostCurrent._imageview8,"ImageView9",main.mostCurrent._imageview9,"insertAct",Debug.moduleToString(Telegram.Search.insertact.class),"isEdit",main._isedit,"isSuperGroup",main._issupergroup,"LabelBack",main.mostCurrent._labelback,"navi",main.mostCurrent._navi,"ostan",main._ostan,"PanelChannel",main.mostCurrent._panelchannel,"PanelChannelContainer",main.mostCurrent._panelchannelcontainer,"PanelGroup",main.mostCurrent._panelgroup,"PanelGroupContainer",main.mostCurrent._panelgroupcontainer,"PanelSticker",main.mostCurrent._panelsticker,"PanelStickerContainer",main.mostCurrent._panelstickercontainer,"parameter",main._parameter,"pCantent",main.mostCurrent._pcantent,"phone",main._phone,"phoneId",main._phoneid,"query",main._query,"rightBitmap",main._rightbitmap,"robotIcon",main._roboticon,"ScrollViewChannel",main.mostCurrent._scrollviewchannel,"ScrollViewGroup",main.mostCurrent._scrollviewgroup,"ScrollViewSticker",main.mostCurrent._scrollviewsticker,"Search",main.mostCurrent._search,"searchAct",Debug.moduleToString(Telegram.Search.searchact.class),"searchResult",main._searchresult,"searchResultAct",Debug.moduleToString(Telegram.Search.searchresultact.class),"selected_item",main._selected_item,"selectedType",main._selectedtype,"selectedTypeTitle",main._selectedtypetitle,"SQL1",main._sql1,"Sticker",main.mostCurrent._sticker,"stickerIcon",main._stickericon,"todayInsertCount",main._todayinsertcount,"userInfo",main._userinfo,"viewInsertedGroupAct",Debug.moduleToString(Telegram.Search.viewinsertedgroupact.class),"vipInsertCount",main._vipinsertcount};
}
}