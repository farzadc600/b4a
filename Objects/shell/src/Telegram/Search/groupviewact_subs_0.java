package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class groupviewact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,61);
if (RapidSub.canDelegate("activity_create")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","activity_create", _firsttime);
RemoteObject _txt = RemoteObject.createImmutable("");
RemoteObject _shahr = RemoteObject.createImmutable("");
RemoteObject _ostan = RemoteObject.createImmutable("");
RemoteObject _category = RemoteObject.createImmutable("");
RemoteObject _job1 = RemoteObject.declareNull("Telegram.Search.httpjob");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("Object");
RemoteObject _column = null;
RemoteObject _desc = RemoteObject.createImmutable("");
RemoteObject _iconpic = RemoteObject.createImmutable(0);
RemoteObject _vip = RemoteObject.createImmutable(0);
RemoteObject _super = RemoteObject.createImmutable(0);
RemoteObject _comment = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 61;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 64;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._navi.runVoidMethod ("Initialize2",groupviewact.mostCurrent.activityBA,(Object)(BA.ObjectToString("navi")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), groupviewact.mostCurrent._activity.getObject()),(Object)(groupviewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),groupviewact.mostCurrent.activityBA)),(Object)(groupviewact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 66;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
Debug.ShouldStop(2);
groupviewact.mostCurrent._navi.runMethod(false,"getNavigationPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menu")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 68;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(8);
groupviewact.mostCurrent._pcantent.runVoidMethod ("Initialize",groupviewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
Debug.ShouldStop(16);
groupviewact.mostCurrent._navi.runMethod(false,"getContentPanel").runVoidMethod ("AddView",(Object)((groupviewact.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(groupviewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),groupviewact.mostCurrent.activityBA)),(Object)(groupviewact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),groupviewact.mostCurrent.activityBA)));
 BA.debugLineNum = 70;BA.debugLine="pCantent.SendToBack";
Debug.ShouldStop(32);
groupviewact.mostCurrent._pcantent.runVoidMethod ("SendToBack");
 BA.debugLineNum = 71;BA.debugLine="pCantent.LoadLayout(\"groupview\")";
Debug.ShouldStop(64);
groupviewact.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("groupview")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="Label5.Text=Main.selected_item.Get(\"title\")";
Debug.ShouldStop(256);
groupviewact.mostCurrent._label5.runMethod(true,"setText",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));
 BA.debugLineNum = 74;BA.debugLine="Activity.Title=\"نمایش اطلاعات\"";
Debug.ShouldStop(512);
groupviewact.mostCurrent._activity.runMethod(false,"setTitle",RemoteObject.createImmutable(("نمایش اطلاعات")));
 BA.debugLineNum = 78;BA.debugLine="Panel1.Width = Activity.Width";
Debug.ShouldStop(8192);
groupviewact.mostCurrent._panel1.runMethod(true,"setWidth",groupviewact.mostCurrent._activity.runMethod(true,"getWidth"));
 BA.debugLineNum = 79;BA.debugLine="Panel1.Height=Activity.Height";
Debug.ShouldStop(16384);
groupviewact.mostCurrent._panel1.runMethod(true,"setHeight",groupviewact.mostCurrent._activity.runMethod(true,"getHeight"));
 BA.debugLineNum = 81;BA.debugLine="Panel2.Color =Colors.rgb(236,239,241)";
Debug.ShouldStop(65536);
groupviewact.mostCurrent._panel2.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 236)),(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 241))));
 BA.debugLineNum = 82;BA.debugLine="Panel2.RemoveView";
Debug.ShouldStop(131072);
groupviewact.mostCurrent._panel2.runVoidMethod ("RemoveView");
 BA.debugLineNum = 83;BA.debugLine="ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width";
Debug.ShouldStop(262144);
groupviewact.mostCurrent._scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((groupviewact.mostCurrent._panel2.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(groupviewact.mostCurrent._panel2.runMethod(true,"getWidth")),(Object)(groupviewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 810)))));
 BA.debugLineNum = 84;BA.debugLine="ScrollView1.Panel.Height = 820dip";
Debug.ShouldStop(524288);
groupviewact.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",groupviewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 820))));
 BA.debugLineNum = 86;BA.debugLine="LabelDesc.TextSize= 15";
Debug.ShouldStop(2097152);
groupviewact.mostCurrent._labeldesc.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 87;BA.debugLine="LabelDesc.Gravity= Gravity.CENTER";
Debug.ShouldStop(4194304);
groupviewact.mostCurrent._labeldesc.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 88;BA.debugLine="LabelDesc.Typeface=Main.font";
Debug.ShouldStop(8388608);
groupviewact.mostCurrent._labeldesc.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 89;BA.debugLine="LabelDesc.TextColor=Colors.Black";
Debug.ShouldStop(16777216);
groupviewact.mostCurrent._labeldesc.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 90;BA.debugLine="LabelDesc.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(33554432);
groupviewact.mostCurrent._labeldesc.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 92;BA.debugLine="LabelAddress.TextSize= 15";
Debug.ShouldStop(134217728);
groupviewact.mostCurrent._labeladdress.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 93;BA.debugLine="LabelAddress.Gravity= Bit.Or(Gravity.CENTER_VERTI";
Debug.ShouldStop(268435456);
groupviewact.mostCurrent._labeladdress.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 94;BA.debugLine="LabelAddress.Typeface=Main.font";
Debug.ShouldStop(536870912);
groupviewact.mostCurrent._labeladdress.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 95;BA.debugLine="LabelAddress.TextColor=Colors.Black";
Debug.ShouldStop(1073741824);
groupviewact.mostCurrent._labeladdress.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 96;BA.debugLine="LabelAddress.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._labeladdress.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 98;BA.debugLine="LabelLikeTitle.TextSize= 15";
Debug.ShouldStop(2);
groupviewact.mostCurrent._labelliketitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 99;BA.debugLine="LabelLikeTitle.Gravity= Bit.Or(Gravity.CENTER_VER";
Debug.ShouldStop(4);
groupviewact.mostCurrent._labelliketitle.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 100;BA.debugLine="LabelLikeTitle.Typeface=Main.font";
Debug.ShouldStop(8);
groupviewact.mostCurrent._labelliketitle.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 101;BA.debugLine="LabelLikeTitle.TextColor=Colors.Black";
Debug.ShouldStop(16);
groupviewact.mostCurrent._labelliketitle.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 102;BA.debugLine="LabelLikeTitle.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(32);
groupviewact.mostCurrent._labelliketitle.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 104;BA.debugLine="LabelInsertDate.TextSize= 15";
Debug.ShouldStop(128);
groupviewact.mostCurrent._labelinsertdate.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 105;BA.debugLine="LabelInsertDate.Gravity= Bit.Or(Gravity.CENTER_VE";
Debug.ShouldStop(256);
groupviewact.mostCurrent._labelinsertdate.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 106;BA.debugLine="LabelInsertDate.Typeface=Main.font";
Debug.ShouldStop(512);
groupviewact.mostCurrent._labelinsertdate.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 107;BA.debugLine="LabelInsertDate.TextColor=Colors.Black";
Debug.ShouldStop(1024);
groupviewact.mostCurrent._labelinsertdate.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 108;BA.debugLine="LabelInsertDate.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(2048);
groupviewact.mostCurrent._labelinsertdate.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 110;BA.debugLine="LabelShahr.TextSize= 15";
Debug.ShouldStop(8192);
groupviewact.mostCurrent._labelshahr.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 111;BA.debugLine="LabelShahr.Gravity= Bit.Or(Gravity.CENTER_VERTICA";
Debug.ShouldStop(16384);
groupviewact.mostCurrent._labelshahr.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 112;BA.debugLine="LabelShahr.Typeface=Main.font";
Debug.ShouldStop(32768);
groupviewact.mostCurrent._labelshahr.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 113;BA.debugLine="LabelShahr.TextColor=Colors.Black";
Debug.ShouldStop(65536);
groupviewact.mostCurrent._labelshahr.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 114;BA.debugLine="LabelShahr.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(131072);
groupviewact.mostCurrent._labelshahr.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 116;BA.debugLine="LabelOstan.TextSize= 15";
Debug.ShouldStop(524288);
groupviewact.mostCurrent._labelostan.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 117;BA.debugLine="LabelOstan.Gravity= Bit.Or(Gravity.CENTER_VERTICA";
Debug.ShouldStop(1048576);
groupviewact.mostCurrent._labelostan.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 118;BA.debugLine="LabelOstan.Typeface=Main.font";
Debug.ShouldStop(2097152);
groupviewact.mostCurrent._labelostan.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 119;BA.debugLine="LabelOstan.TextColor=Colors.Black";
Debug.ShouldStop(4194304);
groupviewact.mostCurrent._labelostan.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 120;BA.debugLine="LabelOstan.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(8388608);
groupviewact.mostCurrent._labelostan.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 122;BA.debugLine="LabelMember.TextSize= 15";
Debug.ShouldStop(33554432);
groupviewact.mostCurrent._labelmember.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 123;BA.debugLine="LabelMember.Gravity= Bit.Or(Gravity.CENTER_VERTIC";
Debug.ShouldStop(67108864);
groupviewact.mostCurrent._labelmember.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 124;BA.debugLine="LabelMember.Typeface=Main.font";
Debug.ShouldStop(134217728);
groupviewact.mostCurrent._labelmember.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 125;BA.debugLine="LabelMember.TextColor=Colors.Black";
Debug.ShouldStop(268435456);
groupviewact.mostCurrent._labelmember.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 126;BA.debugLine="LabelMember.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(536870912);
groupviewact.mostCurrent._labelmember.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 128;BA.debugLine="LabelAdmin.TextSize= 15";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._labeladmin.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 129;BA.debugLine="LabelAdmin.Gravity= Bit.Or(Gravity.CENTER_VERTICA";
Debug.ShouldStop(1);
groupviewact.mostCurrent._labeladmin.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 130;BA.debugLine="LabelAdmin.Typeface=Main.font";
Debug.ShouldStop(2);
groupviewact.mostCurrent._labeladmin.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 131;BA.debugLine="LabelAdmin.TextColor=Colors.Black";
Debug.ShouldStop(4);
groupviewact.mostCurrent._labeladmin.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 132;BA.debugLine="LabelAdmin.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(8);
groupviewact.mostCurrent._labeladmin.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 134;BA.debugLine="LabelTag.TextSize= 15";
Debug.ShouldStop(32);
groupviewact.mostCurrent._labeltag.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 135;BA.debugLine="LabelTag.Gravity= Bit.Or(Gravity.CENTER_VERTICAL,";
Debug.ShouldStop(64);
groupviewact.mostCurrent._labeltag.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 136;BA.debugLine="LabelTag.Typeface=Main.font";
Debug.ShouldStop(128);
groupviewact.mostCurrent._labeltag.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 137;BA.debugLine="LabelTag.TextColor=Colors.Black";
Debug.ShouldStop(256);
groupviewact.mostCurrent._labeltag.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 138;BA.debugLine="LabelTag.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(512);
groupviewact.mostCurrent._labeltag.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 140;BA.debugLine="LabelName.TextSize= 15";
Debug.ShouldStop(2048);
groupviewact.mostCurrent._labelname.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 141;BA.debugLine="LabelName.Gravity= Bit.Or(Gravity.CENTER_VERTICAL";
Debug.ShouldStop(4096);
groupviewact.mostCurrent._labelname.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 142;BA.debugLine="LabelName.Typeface=Main.font";
Debug.ShouldStop(8192);
groupviewact.mostCurrent._labelname.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 143;BA.debugLine="LabelName.TextColor=Colors.Black";
Debug.ShouldStop(16384);
groupviewact.mostCurrent._labelname.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 144;BA.debugLine="LabelName.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(32768);
groupviewact.mostCurrent._labelname.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 146;BA.debugLine="LabelLike.TextSize= 15";
Debug.ShouldStop(131072);
groupviewact.mostCurrent._labellike.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 147;BA.debugLine="LabelLike.Gravity= Bit.Or(Gravity.CENTER_VERTI";
Debug.ShouldStop(262144);
groupviewact.mostCurrent._labellike.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 148;BA.debugLine="LabelLike.Typeface=Main.font";
Debug.ShouldStop(524288);
groupviewact.mostCurrent._labellike.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 149;BA.debugLine="LabelLike.TextColor=Colors.Black";
Debug.ShouldStop(1048576);
groupviewact.mostCurrent._labellike.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 150;BA.debugLine="LabelLike.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(2097152);
groupviewact.mostCurrent._labellike.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 152;BA.debugLine="LabelCat.TextSize= 15";
Debug.ShouldStop(8388608);
groupviewact.mostCurrent._labelcat.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 153;BA.debugLine="LabelCat.Gravity= Bit.Or(Gravity.CENTER_VERTICAL,";
Debug.ShouldStop(16777216);
groupviewact.mostCurrent._labelcat.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 154;BA.debugLine="LabelCat.Typeface=Main.font";
Debug.ShouldStop(33554432);
groupviewact.mostCurrent._labelcat.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 155;BA.debugLine="LabelCat.TextColor=Colors.Black";
Debug.ShouldStop(67108864);
groupviewact.mostCurrent._labelcat.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 156;BA.debugLine="LabelCat.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(134217728);
groupviewact.mostCurrent._labelcat.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 158;BA.debugLine="LabelAllert.TextSize= 15";
Debug.ShouldStop(536870912);
groupviewact.mostCurrent._labelallert.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 159;BA.debugLine="LabelAllert.Gravity= Bit.Or(Gravity.CENTER_VERTIC";
Debug.ShouldStop(1073741824);
groupviewact.mostCurrent._labelallert.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 160;BA.debugLine="LabelAllert.Typeface=Main.font";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._labelallert.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 161;BA.debugLine="LabelAllert.TextColor=Colors.Black";
Debug.ShouldStop(1);
groupviewact.mostCurrent._labelallert.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 162;BA.debugLine="LabelAllert.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(2);
groupviewact.mostCurrent._labelallert.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 164;BA.debugLine="EditTextComment.TextSize= 15";
Debug.ShouldStop(8);
groupviewact.mostCurrent._edittextcomment.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 165;BA.debugLine="EditTextComment.Gravity= Bit.Or(Gravity.CENTER_VE";
Debug.ShouldStop(16);
groupviewact.mostCurrent._edittextcomment.runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 166;BA.debugLine="EditTextComment.Typeface=Main.font";
Debug.ShouldStop(32);
groupviewact.mostCurrent._edittextcomment.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 167;BA.debugLine="EditTextComment.TextColor=Colors.Black";
Debug.ShouldStop(64);
groupviewact.mostCurrent._edittextcomment.runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 168;BA.debugLine="EditTextComment.Color=Colors.RGB(229,229,242)";
Debug.ShouldStop(128);
groupviewact.mostCurrent._edittextcomment.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 242))));
 BA.debugLineNum = 171;BA.debugLine="btnBrokeLink.Typeface=Main.font";
Debug.ShouldStop(1024);
groupviewact.mostCurrent._btnbrokelink.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 173;BA.debugLine="btnJoin.TextSize= 15";
Debug.ShouldStop(4096);
groupviewact.mostCurrent._btnjoin.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 175;BA.debugLine="btnJoin.Typeface=Main.font";
Debug.ShouldStop(16384);
groupviewact.mostCurrent._btnjoin.runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 177;BA.debugLine="Dim txt As String";
Debug.ShouldStop(65536);
_txt = RemoteObject.createImmutable("");Debug.locals.put("txt", _txt);
 BA.debugLineNum = 178;BA.debugLine="Dim shahr As String";
Debug.ShouldStop(131072);
_shahr = RemoteObject.createImmutable("");Debug.locals.put("shahr", _shahr);
 BA.debugLineNum = 179;BA.debugLine="Dim ostan As String";
Debug.ShouldStop(262144);
_ostan = RemoteObject.createImmutable("");Debug.locals.put("ostan", _ostan);
 BA.debugLineNum = 180;BA.debugLine="Dim category As String";
Debug.ShouldStop(524288);
_category = RemoteObject.createImmutable("");Debug.locals.put("category", _category);
 BA.debugLineNum = 181;BA.debugLine="Dim job1 As HttpJob";
Debug.ShouldStop(1048576);
_job1 = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job1", _job1);
 BA.debugLineNum = 183;BA.debugLine="itemType =  Main.selected_item.Get(\"telgroupTypeI";
Debug.ShouldStop(4194304);
groupviewact._itemtype = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telgroupTypeId")))));
 BA.debugLineNum = 185;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 186;BA.debugLine="If(itemType <> 4 And itemType <> 3) Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("!",groupviewact._itemtype,BA.numberCast(double.class, 4)) && RemoteObject.solveBoolean("!",groupviewact._itemtype,BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 187;BA.debugLine="If(Main.selected_item.Get(\"shahrId\") <> 0 )Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("!",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shahrId")))),RemoteObject.createImmutable((0))))) { 
 BA.debugLineNum = 188;BA.debugLine="txt = \"SELECT name  FROM \" & Main.DBTableName";
Debug.ShouldStop(134217728);
_txt = RemoteObject.concat(RemoteObject.createImmutable("SELECT name  FROM "),groupviewact.mostCurrent._main._dbtablename,RemoteObject.createImmutable(" where id = "),groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shahrId")))));Debug.locals.put("txt", _txt);
 BA.debugLineNum = 191;BA.debugLine="Dim result As List";
Debug.ShouldStop(1073741824);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 192;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1,";
Debug.ShouldStop(-2147483648);
_result = groupviewact.mostCurrent._dbutils.runMethod(false,"_executememorytable",groupviewact.mostCurrent.activityBA,(Object)(groupviewact.mostCurrent._main._sql1),(Object)(_txt),(Object)((groupviewact.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("result", _result);
 BA.debugLineNum = 194;BA.debugLine="If (result.Size > 0  )Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean(">",_result.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 195;BA.debugLine="Dim row As Object";
Debug.ShouldStop(4);
_row = RemoteObject.createNew ("Object");Debug.locals.put("row", _row);
 BA.debugLineNum = 196;BA.debugLine="Dim column() As String";
Debug.ShouldStop(8);
_column = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("column", _column);
 BA.debugLineNum = 197;BA.debugLine="row = result.Get(0)";
Debug.ShouldStop(16);
_row = _result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("row", _row);
 BA.debugLineNum = 198;BA.debugLine="column = row";
Debug.ShouldStop(32);
_column = (_row);Debug.locals.put("column", _column);
 BA.debugLineNum = 199;BA.debugLine="shahr = column(0)";
Debug.ShouldStop(64);
_shahr = _column.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("shahr", _shahr);
 }else {
 BA.debugLineNum = 201;BA.debugLine="shahr = \"همه شهر ها\"";
Debug.ShouldStop(256);
_shahr = BA.ObjectToString("همه شهر ها");Debug.locals.put("shahr", _shahr);
 };
 }else {
 BA.debugLineNum = 204;BA.debugLine="shahr = \"همه شهر ها\"";
Debug.ShouldStop(2048);
_shahr = BA.ObjectToString("همه شهر ها");Debug.locals.put("shahr", _shahr);
 };
 BA.debugLineNum = 207;BA.debugLine="If(Main.selected_item.Get(\"ostanId\") <> 0 )Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("!",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ostanId")))),RemoteObject.createImmutable((0))))) { 
 BA.debugLineNum = 208;BA.debugLine="ostan = Main.ostan(Main.selected_item.Get(\"ost";
Debug.ShouldStop(32768);
_ostan = groupviewact.mostCurrent._main._ostan.getArrayElement(true,BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ostanId"))))));Debug.locals.put("ostan", _ostan);
 }else {
 BA.debugLineNum = 210;BA.debugLine="ostan = \"همه استان ها\"";
Debug.ShouldStop(131072);
_ostan = BA.ObjectToString("همه استان ها");Debug.locals.put("ostan", _ostan);
 };
 };
 BA.debugLineNum = 215;BA.debugLine="If( Main.selected_item.Get(\"telgroupCategoryId\")";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("!",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telgroupCategoryId")))),RemoteObject.createImmutable((0))))) { 
 BA.debugLineNum = 216;BA.debugLine="category = Main.cat(Main.selected_item.Get(\"tel";
Debug.ShouldStop(8388608);
_category = groupviewact.mostCurrent._main._cat.getArrayElement(true,BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telgroupCategoryId"))))));Debug.locals.put("category", _category);
 }else {
 BA.debugLineNum = 218;BA.debugLine="category =	\" همه دسته ها  \"";
Debug.ShouldStop(33554432);
_category = BA.ObjectToString(" همه دسته ها  ");Debug.locals.put("category", _category);
 };
 BA.debugLineNum = 221;BA.debugLine="Dim desc As String";
Debug.ShouldStop(268435456);
_desc = RemoteObject.createImmutable("");Debug.locals.put("desc", _desc);
 BA.debugLineNum = 222;BA.debugLine="desc=Main.selected_item.Get(\"description\")";
Debug.ShouldStop(536870912);
_desc = BA.ObjectToString(groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description")))));Debug.locals.put("desc", _desc);
 BA.debugLineNum = 225;BA.debugLine="If (desc.Length > 100 )Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean(">",_desc.runMethod(true,"length"),BA.numberCast(double.class, 100)))) { 
 BA.debugLineNum = 226;BA.debugLine="LabelDesc.Text= desc.SubString2(0,100)";
Debug.ShouldStop(2);
groupviewact.mostCurrent._labeldesc.runMethod(true,"setText",(_desc.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 100)))));
 };
 BA.debugLineNum = 231;BA.debugLine="ListViewComment.Clear()";
Debug.ShouldStop(64);
groupviewact.mostCurrent._listviewcomment.runVoidMethod ("Clear");
 BA.debugLineNum = 233;BA.debugLine="ListViewComment.TwoLinesLayout.ItemHeight =70dip";
Debug.ShouldStop(256);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").runMethod(true,"setItemHeight",groupviewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70))));
 BA.debugLineNum = 234;BA.debugLine="ListViewComment.TwoLinesLayout.Label.TextSize";
Debug.ShouldStop(512);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 235;BA.debugLine="ListViewComment.TwoLinesLayout.Label.TextColo";
Debug.ShouldStop(1024);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 236;BA.debugLine="ListViewComment.TwoLinesLayout.Label.Gravity";
Debug.ShouldStop(2048);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 237;BA.debugLine="ListViewComment.TwoLinesLayout.Label.Typeface";
Debug.ShouldStop(4096);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 238;BA.debugLine="ListViewComment.TwoLinesLayout.Label.Color= C";
Debug.ShouldStop(8192);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 219)),(Object)(BA.numberCast(int.class, 239)),(Object)(BA.numberCast(int.class, 242))));
 BA.debugLineNum = 240;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.TextS";
Debug.ShouldStop(32768);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 241;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.Te";
Debug.ShouldStop(65536);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 242;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.Gr";
Debug.ShouldStop(131072);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setGravity",groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 243;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.Ty";
Debug.ShouldStop(262144);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(false,"setTypeface",(groupviewact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 244;BA.debugLine="ListViewComment.TwoLinesLayout.SecondLabel.Co";
Debug.ShouldStop(524288);
groupviewact.mostCurrent._listviewcomment.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 222))));
 BA.debugLineNum = 247;BA.debugLine="ListViewComment.ScrollingBackgroundColor =Colors";
Debug.ShouldStop(4194304);
groupviewact.mostCurrent._listviewcomment.runVoidMethod ("setScrollingBackgroundColor",groupviewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 248;BA.debugLine="ListViewComment.Color=Colors.rgb(187,222,251)";
Debug.ShouldStop(8388608);
groupviewact.mostCurrent._listviewcomment.runVoidMethod ("setColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 187)),(Object)(BA.numberCast(int.class, 222)),(Object)(BA.numberCast(int.class, 251))));
 BA.debugLineNum = 249;BA.debugLine="ListViewComment.ScrollingBackgroundColor = Color";
Debug.ShouldStop(16777216);
groupviewact.mostCurrent._listviewcomment.runVoidMethod ("setScrollingBackgroundColor",groupviewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 10)),(Object)(BA.numberCast(int.class, 144)),(Object)(BA.numberCast(int.class, 156))));
 BA.debugLineNum = 252;BA.debugLine="LabelName.Text =  \"عنوان :\" & Main.selected_item";
Debug.ShouldStop(134217728);
groupviewact.mostCurrent._labelname.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("عنوان :"),groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))));
 BA.debugLineNum = 253;BA.debugLine="LabelDesc.Text =  desc";
Debug.ShouldStop(268435456);
groupviewact.mostCurrent._labeldesc.runMethod(true,"setText",(_desc));
 BA.debugLineNum = 255;BA.debugLine="LabelTag.Text = \"هشتگ :\" & Main.selected_item.Ge";
Debug.ShouldStop(1073741824);
groupviewact.mostCurrent._labeltag.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("هشتگ :"),groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tag")))))));
 BA.debugLineNum = 256;BA.debugLine="LabelAddress.Text = \"آدرس:\" & Main.selected_item";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._labeladdress.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("آدرس:"),groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telegramAddress")))))));
 BA.debugLineNum = 259;BA.debugLine="LabelCat.Text= \"دسته بندی :\" & category";
Debug.ShouldStop(4);
groupviewact.mostCurrent._labelcat.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("دسته بندی :"),_category)));
 BA.debugLineNum = 261;BA.debugLine="LabelInsertDate.Text= \"تاریخ ثبت :\" & Main.selec";
Debug.ShouldStop(16);
groupviewact.mostCurrent._labelinsertdate.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("تاریخ ثبت :"),groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("insertDate")))))));
 BA.debugLineNum = 263;BA.debugLine="If Main.selected_item.Get(\"memberCount\")<> Null";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("N",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("memberCount")))))) { 
 BA.debugLineNum = 264;BA.debugLine="LabelMember.Text= \"تعداد اعضا :\" & Main.selecte";
Debug.ShouldStop(128);
groupviewact.mostCurrent._labelmember.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("تعداد اعضا :"),groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("memberCount")))))));
 }else {
 BA.debugLineNum = 266;BA.debugLine="LabelMember.Text= \"تعداد اعضا :0\"";
Debug.ShouldStop(512);
groupviewact.mostCurrent._labelmember.runMethod(true,"setText",RemoteObject.createImmutable(("تعداد اعضا :0")));
 };
 BA.debugLineNum = 269;BA.debugLine="If(itemType =1 Or itemType =7) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",groupviewact._itemtype,BA.numberCast(double.class, 1)) || RemoteObject.solveBoolean("=",groupviewact._itemtype,BA.numberCast(double.class, 7)))) { 
 BA.debugLineNum = 270;BA.debugLine="LabelAllert.Text=\"اگر لینک باز نشد حتمآ نسخه تل";
Debug.ShouldStop(8192);
groupviewact.mostCurrent._labelallert.runMethod(true,"setText",RemoteObject.createImmutable(("اگر لینک باز نشد حتمآ نسخه تلگرام خود را بروز کنید.")));
 };
 BA.debugLineNum = 274;BA.debugLine="If Main.selected_item.Get(\"ownerId\")<> Null The";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ownerId")))))) { 
 BA.debugLineNum = 275;BA.debugLine="LabelAdmin.Text=  \"ادمین :\" & Main.selected_it";
Debug.ShouldStop(262144);
groupviewact.mostCurrent._labeladmin.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("ادمین :"),groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ownerId")))))));
 }else {
 BA.debugLineNum = 277;BA.debugLine="LabelAdmin.Text=  \"ادمین :\"";
Debug.ShouldStop(1048576);
groupviewact.mostCurrent._labeladmin.runMethod(true,"setText",RemoteObject.createImmutable(("ادمین :")));
 };
 BA.debugLineNum = 280;BA.debugLine="LabelOstan.Text=\"استان :\" & ostan";
Debug.ShouldStop(8388608);
groupviewact.mostCurrent._labelostan.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("استان :"),_ostan)));
 BA.debugLineNum = 281;BA.debugLine="LabelShahr.Text=\"شهر :\" & shahr";
Debug.ShouldStop(16777216);
groupviewact.mostCurrent._labelshahr.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("شهر :"),_shahr)));
 BA.debugLineNum = 284;BA.debugLine="Dim iconPic As Int";
Debug.ShouldStop(134217728);
_iconpic = RemoteObject.createImmutable(0);Debug.locals.put("iconPic", _iconpic);
 BA.debugLineNum = 285;BA.debugLine="iconPic = Main.selected_item.Get(\"iconPictureId\"";
Debug.ShouldStop(268435456);
_iconpic = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("iconPictureId")))));Debug.locals.put("iconPic", _iconpic);
 BA.debugLineNum = 287;BA.debugLine="If (Main.selected_item.Get(\"likeCount\") = Null)";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("n",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("likeCount"))))))) { 
 BA.debugLineNum = 288;BA.debugLine="LabelLike.Text= \"0\"";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._labellike.runMethod(true,"setText",RemoteObject.createImmutable(("0")));
 }else {
 BA.debugLineNum = 290;BA.debugLine="LabelLike.Text= Main.selected_item.Get(\"likeCou";
Debug.ShouldStop(2);
groupviewact.mostCurrent._labellike.runMethod(true,"setText",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("likeCount")))));
 };
 BA.debugLineNum = 293;BA.debugLine="If(itemType = 11)Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",groupviewact._itemtype,BA.numberCast(double.class, 11)))) { 
 BA.debugLineNum = 294;BA.debugLine="btnBrokeLink.Visible=False";
Debug.ShouldStop(32);
groupviewact.mostCurrent._btnbrokelink.runMethod(true,"setVisible",groupviewact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 295;BA.debugLine="btnCopy.Visible =False";
Debug.ShouldStop(64);
groupviewact.mostCurrent._btncopy.runMethod(true,"setVisible",groupviewact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 296;BA.debugLine="btnJoin.Visible=False";
Debug.ShouldStop(128);
groupviewact.mostCurrent._btnjoin.runMethod(true,"setVisible",groupviewact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 297;BA.debugLine="btnInstagram.Visible =False";
Debug.ShouldStop(256);
groupviewact.mostCurrent._btninstagram.runMethod(true,"setVisible",groupviewact.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 302;BA.debugLine="Dim vip As Int";
Debug.ShouldStop(8192);
_vip = RemoteObject.createImmutable(0);Debug.locals.put("vip", _vip);
 BA.debugLineNum = 303;BA.debugLine="Dim super As Int";
Debug.ShouldStop(16384);
_super = RemoteObject.createImmutable(0);Debug.locals.put("super", _super);
 BA.debugLineNum = 305;BA.debugLine="If( iconPic= 0 Or Main.selected_item.Get(\"isVIP\"";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_iconpic,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVIP")))),(groupviewact.mostCurrent.__c.getField(true,"False"))))) { 
 BA.debugLineNum = 307;BA.debugLine="Select itemType";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(groupviewact._itemtype,BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 7),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10))) {
case 0: {
 BA.debugLineNum = 309;BA.debugLine="ImagePreivew.Bitmap= Main.idIcon";
Debug.ShouldStop(1048576);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent._main._idicon.getObject()));
 BA.debugLineNum = 310;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
Debug.ShouldStop(2097152);
groupviewact.mostCurrent._imagebackground.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("id_back.jpg"))).getObject()));
 break; }
case 1: {
 BA.debugLineNum = 313;BA.debugLine="ImagePreivew.Bitmap= Main.stickerIcon";
Debug.ShouldStop(16777216);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent._main._stickericon.getObject()));
 BA.debugLineNum = 314;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
Debug.ShouldStop(33554432);
groupviewact.mostCurrent._imagebackground.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sticker_back.jpg"))).getObject()));
 break; }
case 2: {
 BA.debugLineNum = 316;BA.debugLine="ImagePreivew.Bitmap= Main.robotIcon";
Debug.ShouldStop(134217728);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent._main._roboticon.getObject()));
 BA.debugLineNum = 317;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
Debug.ShouldStop(268435456);
groupviewact.mostCurrent._imagebackground.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("robot_back.jpg"))).getObject()));
 break; }
case 3: {
 BA.debugLineNum = 320;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._imagebackground.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("channel_back.jpg"))).getObject()));
 BA.debugLineNum = 322;BA.debugLine="super =Main.selected_item.Get(\"isSuperGroup\")";
Debug.ShouldStop(2);
_super = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isSuperGroup")))));Debug.locals.put("super", _super);
 BA.debugLineNum = 323;BA.debugLine="vip =Main.selected_item.Get(\"isVIP\")";
Debug.ShouldStop(4);
_vip = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVIP")))));Debug.locals.put("vip", _vip);
 BA.debugLineNum = 325;BA.debugLine="If(vip = 1  )Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",_vip,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 326;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAsset";
Debug.ShouldStop(32);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("vip_channel.png"))).getObject()));
 }else 
{ BA.debugLineNum = 327;BA.debugLine="Else If( super = 1) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",_super,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 328;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAsset";
Debug.ShouldStop(128);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("gov_channel.png"))).getObject()));
 }else {
 BA.debugLineNum = 330;BA.debugLine="ImagePreivew.Bitmap=Main.channelIcon";
Debug.ShouldStop(512);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent._main._channelicon.getObject()));
 }};
 break; }
case 4: {
 BA.debugLineNum = 335;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
Debug.ShouldStop(16384);
groupviewact.mostCurrent._imagebackground.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sticker_back.jpg"))).getObject()));
 BA.debugLineNum = 336;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAssets";
Debug.ShouldStop(32768);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("adsicon.png"))).getObject()));
 break; }
case 5: {
 BA.debugLineNum = 340;BA.debugLine="ImagePreivew.Bitmap=  LoadBitmap(File.DirAsse";
Debug.ShouldStop(524288);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("comment.png"))).getObject()));
 BA.debugLineNum = 341;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
Debug.ShouldStop(1048576);
groupviewact.mostCurrent._imagebackground.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("id_back.jpg"))).getObject()));
 break; }
default: {
 BA.debugLineNum = 345;BA.debugLine="ImageBackground.Bitmap= LoadBitmap(File.DirAs";
Debug.ShouldStop(16777216);
groupviewact.mostCurrent._imagebackground.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("group_back.jpg"))).getObject()));
 BA.debugLineNum = 348;BA.debugLine="super =Main.selected_item.Get(\"isSuperGroup\")";
Debug.ShouldStop(134217728);
_super = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isSuperGroup")))));Debug.locals.put("super", _super);
 BA.debugLineNum = 349;BA.debugLine="vip =Main.selected_item.Get(\"isVIP\")";
Debug.ShouldStop(268435456);
_vip = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("isVIP")))));Debug.locals.put("vip", _vip);
 BA.debugLineNum = 351;BA.debugLine="If(vip = 1  )Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",_vip,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 352;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAsset";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("adsicon.png"))).getObject()));
 }else 
{ BA.debugLineNum = 353;BA.debugLine="Else If( super = 1) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",_super,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 354;BA.debugLine="ImagePreivew.Bitmap=LoadBitmap(File.DirAsset";
Debug.ShouldStop(2);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(groupviewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("ispremium.png"))).getObject()));
 }else {
 BA.debugLineNum = 356;BA.debugLine="ImagePreivew.Bitmap=Main.groupIcon";
Debug.ShouldStop(8);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent._main._groupicon.getObject()));
 }};
 break; }
}
;
 }else {
 BA.debugLineNum = 361;BA.debugLine="job1.Initialize(\"download_icon\", Me)";
Debug.ShouldStop(256);
_job1.runClassMethod (Telegram.Search.httpjob.class, "_initialize",groupviewact.processBA,(Object)(BA.ObjectToString("download_icon")),(Object)(groupviewact.getObject()));
 BA.debugLineNum = 362;BA.debugLine="If (itemType = 11 ) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",groupviewact._itemtype,BA.numberCast(double.class, 11)))) { 
 BA.debugLineNum = 363;BA.debugLine="ProgressDialogShow(\"درحال دریافت \")";
Debug.ShouldStop(1024);
groupviewact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",groupviewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت ")));
 };
 BA.debugLineNum = 365;BA.debugLine="job1.Download(\"http://aloosalam.ir/index.php";
Debug.ShouldStop(4096);
_job1.runClassMethod (Telegram.Search.httpjob.class, "_download",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://aloosalam.ir/index.php/index/iconGroupView/"),_iconpic,RemoteObject.createImmutable("/"),groupviewact._itemtype)));
 };
 BA.debugLineNum = 368;BA.debugLine="Dim comment As Int =Main.selected_item.Get(\"comm";
Debug.ShouldStop(32768);
_comment = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("commentCount")))));Debug.locals.put("comment", _comment);Debug.locals.put("comment", _comment);
 BA.debugLineNum = 369;BA.debugLine="If( comment > 0  )Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean(">",_comment,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 370;BA.debugLine="Dim id As Int";
Debug.ShouldStop(131072);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 371;BA.debugLine="id = Main.selected_item.Get(\"id\")";
Debug.ShouldStop(262144);
_id = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 372;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 373;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1048576);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 374;BA.debugLine="ProgressDialogShow(\"درحال دریافت نظرات\")";
Debug.ShouldStop(2097152);
groupviewact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",groupviewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت نظرات")));
 BA.debugLineNum = 375;BA.debugLine="job.Initialize(\"getComments\", Me)";
Debug.ShouldStop(4194304);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",groupviewact.processBA,(Object)(BA.ObjectToString("getComments")),(Object)(groupviewact.getObject()));
 BA.debugLineNum = 377;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.";
Debug.ShouldStop(16777216);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://www.aloosalam.ir/index.php/mobile/index/getComments/"),_id)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&user="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),groupviewact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e274) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e274.toString()); BA.debugLineNum = 380;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات   \",\"خطا\")";
Debug.ShouldStop(134217728);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات   ")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 };
 }else {
 BA.debugLineNum = 384;BA.debugLine="ListViewComment.AddTwoLines(\"نظری داده نشده است";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._listviewcomment.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToString("نظری داده نشده است . ")),(Object)(RemoteObject.createImmutable("اولین نفری باشید که نظر می دهد")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e280) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e280.toString()); BA.debugLineNum = 389;BA.debugLine="Msgbox(\"خطا در نمایش اطلاعات\",\"خطا\")";
Debug.ShouldStop(16);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در نمایش اطلاعات")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 390;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
groupviewact.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,398);
if (RapidSub.canDelegate("activity_pause")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 398;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,394);
if (RapidSub.canDelegate("activity_resume")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","activity_resume");
 BA.debugLineNum = 394;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbrokelink_click() throws Exception{
try {
		Debug.PushSubsStack("btnBrokeLink_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,731);
if (RapidSub.canDelegate("btnbrokelink_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","btnbrokelink_click");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 731;BA.debugLine="Sub btnBrokeLink_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 733;BA.debugLine="Dim id As Int";
Debug.ShouldStop(268435456);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 734;BA.debugLine="id = Main.selected_item.Get(\"id\")";
Debug.ShouldStop(536870912);
_id = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 735;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 737;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 738;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
Debug.ShouldStop(2);
groupviewact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",groupviewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال ارسال")));
 BA.debugLineNum = 739;BA.debugLine="job.Initialize(\"broke_group\", Me)";
Debug.ShouldStop(4);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",groupviewact.processBA,(Object)(BA.ObjectToString("broke_group")),(Object)(groupviewact.getObject()));
 BA.debugLineNum = 741;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
Debug.ShouldStop(16);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://www.aloosalam.ir/index.php/mobile/index/linkBroken/"),(RemoteObject.solve(new RemoteObject[] {_id,RemoteObject.createImmutable(34)}, "*",0, 1)))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&user="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),groupviewact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e518) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e518.toString()); BA.debugLineNum = 747;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
Debug.ShouldStop(1024);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در ارسال اطلاعات   ")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncopy_click() throws Exception{
try {
		Debug.PushSubsStack("btnCopy_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,606);
if (RapidSub.canDelegate("btncopy_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","btncopy_click");
RemoteObject _tmpt = RemoteObject.createImmutable("");
RemoteObject _bc = RemoteObject.declareNull("b4a.util.BClipboard");
 BA.debugLineNum = 606;BA.debugLine="Sub btnCopy_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 607;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 609;BA.debugLine="Dim tmpt As String";
Debug.ShouldStop(1);
_tmpt = RemoteObject.createImmutable("");Debug.locals.put("tmpt", _tmpt);
 BA.debugLineNum = 610;BA.debugLine="Dim bc As BClipboard";
Debug.ShouldStop(2);
_bc = RemoteObject.createNew ("b4a.util.BClipboard");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 611;BA.debugLine="bc.clrText";
Debug.ShouldStop(4);
_bc.runVoidMethod ("clrText",groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 612;BA.debugLine="tmpt  =  Main.selected_item.Get(\"telegramAddress";
Debug.ShouldStop(8);
_tmpt = BA.ObjectToString(groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telegramAddress")))));Debug.locals.put("tmpt", _tmpt);
 BA.debugLineNum = 614;BA.debugLine="bc.setText(tmpt)";
Debug.ShouldStop(32);
_bc.runVoidMethod ("setText",groupviewact.mostCurrent.activityBA,(Object)(_tmpt));
 BA.debugLineNum = 615;BA.debugLine="Msgbox(\"آدرس کپی شد . اکنون می توانید آن را هر ج";
Debug.ShouldStop(64);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس کپی شد . اکنون می توانید آن را هر جا خواستید بچسبانید .")),(Object)(RemoteObject.createImmutable("آدرس ")),groupviewact.mostCurrent.activityBA);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e451) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e451.toString()); BA.debugLineNum = 617;BA.debugLine="Msgbox(tmpt,\"آدرس \")";
Debug.ShouldStop(256);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(_tmpt),(Object)(RemoteObject.createImmutable("آدرس ")),groupviewact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 619;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btninstagram_click() throws Exception{
try {
		Debug.PushSubsStack("btnInstagram_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,588);
if (RapidSub.canDelegate("btninstagram_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","btninstagram_click");
RemoteObject _inten = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _tmpt = RemoteObject.createImmutable("");
RemoteObject _u = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");
 BA.debugLineNum = 588;BA.debugLine="Sub btnInstagram_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 589;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 590;BA.debugLine="Dim inten As Intent";
Debug.ShouldStop(8192);
_inten = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("inten", _inten);
 BA.debugLineNum = 591;BA.debugLine="Dim tmpt As String";
Debug.ShouldStop(16384);
_tmpt = RemoteObject.createImmutable("");Debug.locals.put("tmpt", _tmpt);
 BA.debugLineNum = 592;BA.debugLine="tmpt  =  Main.selected_item.Get(\"telegramAddress";
Debug.ShouldStop(32768);
_tmpt = BA.ObjectToString(groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telegramAddress")))));Debug.locals.put("tmpt", _tmpt);
 BA.debugLineNum = 594;BA.debugLine="Dim u As Uri";
Debug.ShouldStop(131072);
_u = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");Debug.locals.put("u", _u);
 BA.debugLineNum = 595;BA.debugLine="u.Parse(tmpt)";
Debug.ShouldStop(262144);
_u.runVoidMethod ("Parse",(Object)(_tmpt));
 BA.debugLineNum = 596;BA.debugLine="inten.Initialize(inten.ACTION_SEND,\"\")";
Debug.ShouldStop(524288);
_inten.runVoidMethod ("Initialize",(Object)(_inten.getField(true,"ACTION_SEND")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 597;BA.debugLine="inten.SetType(\"image/*\")";
Debug.ShouldStop(1048576);
_inten.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("image/*")));
 BA.debugLineNum = 598;BA.debugLine="inten.PutExtra(\"android.intent.extra.STREAM\",u)";
Debug.ShouldStop(2097152);
_inten.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("android.intent.extra.STREAM")),(Object)((_u.getObject())));
 BA.debugLineNum = 599;BA.debugLine="inten.PutExtra(\"android.intent.extra.TEXT\",Main.";
Debug.ShouldStop(4194304);
_inten.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("android.intent.extra.TEXT")),(Object)((RemoteObject.concat(groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),groupviewact.mostCurrent.__c.getField(true,"CRLF"),groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description")))),groupviewact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("http://aloosalam.ir")))));
 BA.debugLineNum = 600;BA.debugLine="inten.SetComponent(\"com.instagram.android/.activ";
Debug.ShouldStop(8388608);
_inten.runVoidMethod ("SetComponent",(Object)(RemoteObject.createImmutable("com.instagram.android/.activity.ShareHandlerActivity")));
 BA.debugLineNum = 601;BA.debugLine="StartActivity(inten)";
Debug.ShouldStop(16777216);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_inten.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e439) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e439.toString()); BA.debugLineNum = 603;BA.debugLine="Msgbox(\"اینستاگرام نصب نیست .\",\"اینستاگرام\")";
Debug.ShouldStop(67108864);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("اینستاگرام نصب نیست .")),(Object)(RemoteObject.createImmutable("اینستاگرام")),groupviewact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 605;BA.debugLine="End Sub";
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
public static RemoteObject  _btnjoin_click() throws Exception{
try {
		Debug.PushSubsStack("btnJoin_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,406);
if (RapidSub.canDelegate("btnjoin_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","btnjoin_click");
RemoteObject _address = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 406;BA.debugLine="Sub btnJoin_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 407;BA.debugLine="Dim address As String";
Debug.ShouldStop(4194304);
_address = RemoteObject.createImmutable("");Debug.locals.put("address", _address);
 BA.debugLineNum = 408;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(8388608);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 409;BA.debugLine="address= Main.selected_item.Get(\"telegramAddress\"";
Debug.ShouldStop(16777216);
_address = BA.ObjectToString(groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telegramAddress")))));Debug.locals.put("address", _address);
 BA.debugLineNum = 411;BA.debugLine="address=address.Replace(\"{userid}\",Main.userInfo.";
Debug.ShouldStop(67108864);
_address = _address.runMethod(true,"replace",(Object)(BA.ObjectToString("{userid}")),(Object)(BA.ObjectToString(groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))))));Debug.locals.put("address", _address);
 BA.debugLineNum = 413;BA.debugLine="If (address.StartsWith(\"https://telegram.me\") Or";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean(".",_address.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me")))) || RemoteObject.solveBoolean(".",_address.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("telegram.me")))) || RemoteObject.solveBoolean(".",_address.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("telegram.me")))))) { 
 BA.debugLineNum = 414;BA.debugLine="joinTelegram(address)";
Debug.ShouldStop(536870912);
_jointelegram(_address);
 }else 
{ BA.debugLineNum = 415;BA.debugLine="Else if(address.StartsWith(\"http://aloosalam.ir\")";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean(".",_address.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://aloosalam.ir")))) || RemoteObject.solveBoolean(".",_address.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://")))))) { 
 BA.debugLineNum = 416;BA.debugLine="StartActivity(p.OpenBrowser(address))";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(_address)))));
 }else 
{ BA.debugLineNum = 417;BA.debugLine="Else if (itemType =11 )Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",groupviewact._itemtype,BA.numberCast(double.class, 11)))) { 
 }else {
 BA.debugLineNum = 420;BA.debugLine="Msgbox(\"آدرس گروه صحیح نیست . گزینه دیگری را امت";
Debug.ShouldStop(8);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس گروه صحیح نیست . گزینه دیگری را امتحان کنید .")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 }}};
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,57);
if (RapidSub.canDelegate("btnmenu_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","btnmenu_click");
 BA.debugLineNum = 57;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
Debug.ShouldStop(33554432);
groupviewact.mostCurrent._navi.runVoidMethod ("OpenDrawer2",(Object)(groupviewact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpanel_click() throws Exception{
try {
		Debug.PushSubsStack("btnPanel_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,579);
if (RapidSub.canDelegate("btnpanel_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","btnpanel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 579;BA.debugLine="Sub btnPanel_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 580;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 581;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(16);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),groupviewact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 584;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(128);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/"))))));
 BA.debugLineNum = 585;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(256);
groupviewact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 586;BA.debugLine="End Sub";
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
public static RemoteObject  _btnreturn_click() throws Exception{
try {
		Debug.PushSubsStack("btnReturn_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,402);
if (RapidSub.canDelegate("btnreturn_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","btnreturn_click");
 BA.debugLineNum = 402;BA.debugLine="Sub btnReturn_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
groupviewact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 404;BA.debugLine="End Sub";
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
public static RemoteObject  _buttoncomment_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonComment_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,667);
if (RapidSub.canDelegate("buttoncomment_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","buttoncomment_click");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 667;BA.debugLine="Sub ButtonComment_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 668;BA.debugLine="Dim id As Int";
Debug.ShouldStop(134217728);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 669;BA.debugLine="id = Main.selected_item.Get(\"id\")";
Debug.ShouldStop(268435456);
_id = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 670;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 672;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(-2147483648);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 673;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
Debug.ShouldStop(1);
groupviewact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",groupviewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال ارسال")));
 BA.debugLineNum = 674;BA.debugLine="job.Initialize(\"insertComment\", Me)";
Debug.ShouldStop(2);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",groupviewact.processBA,(Object)(BA.ObjectToString("insertComment")),(Object)(groupviewact.getObject()));
 BA.debugLineNum = 676;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
Debug.ShouldStop(8);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://www.aloosalam.ir/index.php/mobile/index/insertComment/"),_id)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&text="),groupviewact.mostCurrent._edittextcomment.runMethod(true,"getText"),RemoteObject.createImmutable("&type="),groupviewact._itemtype,RemoteObject.createImmutable("&name="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable("&user="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),groupviewact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e482) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e482.toString()); BA.debugLineNum = 685;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
Debug.ShouldStop(4096);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در ارسال اطلاعات   ")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 688;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonminus_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMinus_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,689);
if (RapidSub.canDelegate("buttonminus_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","buttonminus_click");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 689;BA.debugLine="Sub ButtonMinus_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 690;BA.debugLine="Dim id As Int";
Debug.ShouldStop(131072);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 691;BA.debugLine="id = Main.selected_item.Get(\"id\")";
Debug.ShouldStop(262144);
_id = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 692;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 694;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2097152);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 695;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
Debug.ShouldStop(4194304);
groupviewact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",groupviewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال ارسال")));
 BA.debugLineNum = 696;BA.debugLine="job.Initialize(\"sendLike\", Me)";
Debug.ShouldStop(8388608);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",groupviewact.processBA,(Object)(BA.ObjectToString("sendLike")),(Object)(groupviewact.getObject()));
 BA.debugLineNum = 698;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
Debug.ShouldStop(33554432);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://www.aloosalam.ir/index.php/mobile/index/sendLike/"),_id)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&liek=minus"),RemoteObject.createImmutable("&user="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),groupviewact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e494) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e494.toString()); BA.debugLineNum = 705;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
Debug.ShouldStop(1);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در ارسال اطلاعات   ")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 708;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonplus_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonPlus_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,709);
if (RapidSub.canDelegate("buttonplus_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","buttonplus_click");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 709;BA.debugLine="Sub ButtonPlus_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 710;BA.debugLine="Dim id As Int";
Debug.ShouldStop(32);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 711;BA.debugLine="id = Main.selected_item.Get(\"id\")";
Debug.ShouldStop(64);
_id = BA.numberCast(int.class, groupviewact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 712;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 714;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(512);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 715;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
Debug.ShouldStop(1024);
groupviewact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",groupviewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال ارسال")));
 BA.debugLineNum = 716;BA.debugLine="job.Initialize(\"sendLike\", Me)";
Debug.ShouldStop(2048);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",groupviewact.processBA,(Object)(BA.ObjectToString("sendLike")),(Object)(groupviewact.getObject()));
 BA.debugLineNum = 718;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
Debug.ShouldStop(8192);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://www.aloosalam.ir/index.php/mobile/index/sendLike/"),_id)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&liek=plus"),RemoteObject.createImmutable("&user="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),groupviewact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e506) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e506.toString()); BA.debugLineNum = 725;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
Debug.ShouldStop(1048576);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در ارسال اطلاعات   ")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 728;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private Panel1 As Panel";
groupviewact.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnJoin As Button";
groupviewact.mostCurrent._btnjoin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnBrokeLink As Button";
groupviewact.mostCurrent._btnbrokelink = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private btnMenu As Button";
groupviewact.mostCurrent._btnmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelDesc As Label";
groupviewact.mostCurrent._labeldesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim itemType As Int";
groupviewact._itemtype = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 28;BA.debugLine="Private ImagePreivew As ImageView";
groupviewact.mostCurrent._imagepreivew = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Label5 As Label";
groupviewact.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ImageBackground As ImageView";
groupviewact.mostCurrent._imagebackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim navi As AHNavigationDrawer";
groupviewact.mostCurrent._navi = RemoteObject.createNew ("de.amberhome.navdrawer.NavigationDrawer");
 //BA.debugLineNum = 34;BA.debugLine="Dim pCantent As Panel";
groupviewact.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private btnCopy As Button";
groupviewact.mostCurrent._btncopy = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private EditTextComment As EditText";
groupviewact.mostCurrent._edittextcomment = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private ListViewComment As ListView";
groupviewact.mostCurrent._listviewcomment = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private LabelInsertDate As Label";
groupviewact.mostCurrent._labelinsertdate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private LabelShahr As Label";
groupviewact.mostCurrent._labelshahr = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private LabelOstan As Label";
groupviewact.mostCurrent._labelostan = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private LabelMember As Label";
groupviewact.mostCurrent._labelmember = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private LabelAdmin As Label";
groupviewact.mostCurrent._labeladmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private LabelTag As Label";
groupviewact.mostCurrent._labeltag = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private LabelAddress As Label";
groupviewact.mostCurrent._labeladdress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LabelName As Label";
groupviewact.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LabelLike As Label";
groupviewact.mostCurrent._labellike = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private LabelCat As Label";
groupviewact.mostCurrent._labelcat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private LabelAllert As Label";
groupviewact.mostCurrent._labelallert = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private ScrollView1 As ScrollView";
groupviewact.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private Panel2 As Panel";
groupviewact.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private ButtonMinus As Button";
groupviewact.mostCurrent._buttonminus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private LabelLikeTitle As Label";
groupviewact.mostCurrent._labelliketitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private btnInstagram As Button";
groupviewact.mostCurrent._btninstagram = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private ImageViewAll As ImageView";
groupviewact.mostCurrent._imageviewall = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imagepreivew_click() throws Exception{
try {
		Debug.PushSubsStack("ImagePreivew_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,756);
if (RapidSub.canDelegate("imagepreivew_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","imagepreivew_click");
 BA.debugLineNum = 756;BA.debugLine="Sub ImagePreivew_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 757;BA.debugLine="ImageViewAll.Left=0";
Debug.ShouldStop(1048576);
groupviewact.mostCurrent._imageviewall.runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 758;BA.debugLine="ImageViewAll.Top=0";
Debug.ShouldStop(2097152);
groupviewact.mostCurrent._imageviewall.runMethod(true,"setTop",BA.numberCast(int.class, 0));
 BA.debugLineNum = 759;BA.debugLine="ImageViewAll.Bitmap = ImagePreivew.Bitmap";
Debug.ShouldStop(4194304);
groupviewact.mostCurrent._imageviewall.runMethod(false,"setBitmap",groupviewact.mostCurrent._imagepreivew.runMethod(false,"getBitmap"));
 BA.debugLineNum = 760;BA.debugLine="ImageViewAll.Visible=True";
Debug.ShouldStop(8388608);
groupviewact.mostCurrent._imageviewall.runMethod(true,"setVisible",groupviewact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 762;BA.debugLine="End Sub";
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
public static RemoteObject  _imageviewall_click() throws Exception{
try {
		Debug.PushSubsStack("ImageViewAll_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,753);
if (RapidSub.canDelegate("imageviewall_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","imageviewall_click");
 BA.debugLineNum = 753;BA.debugLine="Sub ImageViewAll_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 754;BA.debugLine="ImageViewAll.Visible=False";
Debug.ShouldStop(131072);
groupviewact.mostCurrent._imageviewall.runMethod(true,"setVisible",groupviewact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 755;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,480);
if (RapidSub.canDelegate("jobdone")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _countries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 480;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 481;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 482;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
groupviewact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 483;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(4);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 484;BA.debugLine="Dim res As String";
Debug.ShouldStop(8);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 485;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(16);
_res = _job.runClassMethod (Telegram.Search.httpjob.class, "_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 486;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 487;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 489;BA.debugLine="If( Job.JobName  = \"download_icon\") Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),RemoteObject.createImmutable("download_icon")))) { 
 BA.debugLineNum = 490;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 491;BA.debugLine="ImagePreivew.Bitmap = Job.GetBitmap";
Debug.ShouldStop(1024);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(_job.runClassMethod (Telegram.Search.httpjob.class, "_getbitmap").getObject()));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e355) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e355.toString()); BA.debugLineNum = 493;BA.debugLine="ImagePreivew.Bitmap=Main.groupIcon";
Debug.ShouldStop(4096);
groupviewact.mostCurrent._imagepreivew.runMethod(false,"setBitmap",(groupviewact.mostCurrent._main._groupicon.getObject()));
 };
 BA.debugLineNum = 495;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16384);
groupviewact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 496;BA.debugLine="Job.Release";
Debug.ShouldStop(32768);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 }else 
{ BA.debugLineNum = 497;BA.debugLine="else If( Job.JobName  = \"getComments\") Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),RemoteObject.createImmutable("getComments")))) { 
 BA.debugLineNum = 498;BA.debugLine="Dim COUNTRIES As List";
Debug.ShouldStop(131072);
_countries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 499;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list w";
Debug.ShouldStop(262144);
_countries = _parser.runMethod(false,"NextArray");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 501;BA.debugLine="Dim rows As List";
Debug.ShouldStop(1048576);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 502;BA.debugLine="rows= COUNTRIES.Get(0)";
Debug.ShouldStop(2097152);
_rows.setObject(_countries.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 504;BA.debugLine="If(rows.Size > 0 ) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean(">",_rows.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 506;BA.debugLine="For i= 0 To rows.Size-1";
Debug.ShouldStop(33554432);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_rows.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22); _i = ((int)(0 + _i + step22)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 507;BA.debugLine="Dim row As Map";
Debug.ShouldStop(67108864);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("row", _row);
 BA.debugLineNum = 509;BA.debugLine="row.Initialize()";
Debug.ShouldStop(268435456);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 510;BA.debugLine="row=rows.Get(i)";
Debug.ShouldStop(536870912);
_row.setObject(_rows.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 511;BA.debugLine="ListViewComment.AddTwoLines(row.Get(\"name\")";
Debug.ShouldStop(1073741824);
groupviewact.mostCurrent._listviewcomment.runVoidMethod ("AddTwoLines",(Object)(RemoteObject.concat(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable("-"),_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("createDate")))))),(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("content")))))));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 514;BA.debugLine="ListViewComment.AddTwoLines(\"نظری داده نشده ا";
Debug.ShouldStop(2);
groupviewact.mostCurrent._listviewcomment.runVoidMethod ("AddTwoLines",(Object)(BA.ObjectToString("نظری داده نشده است . ")),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 516;BA.debugLine="Job.Release";
Debug.ShouldStop(8);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 }else 
{ BA.debugLineNum = 518;BA.debugLine="else If( Job.JobName  = \"insertComment\") Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),RemoteObject.createImmutable("insertComment")))) { 
 BA.debugLineNum = 520;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . نظر شما ثبت";
Debug.ShouldStop(128);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("با تشکر از حسن توجه شما . نظر شما ثبت شد .")),(Object)(RemoteObject.createImmutable("ثبت نظر")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 521;BA.debugLine="Job.Release";
Debug.ShouldStop(256);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 BA.debugLineNum = 522;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
groupviewact.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 524;BA.debugLine="else If( Job.JobName  = \"sendLike\") Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),RemoteObject.createImmutable("sendLike")))) { 
 BA.debugLineNum = 526;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . امتیاز شد .\"";
Debug.ShouldStop(8192);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("با تشکر از حسن توجه شما . امتیاز شد .")),(Object)(RemoteObject.createImmutable("گزارش خطا")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 527;BA.debugLine="Job.Release";
Debug.ShouldStop(16384);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 BA.debugLineNum = 528;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
groupviewact.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 530;BA.debugLine="else If( Job.JobName  = \"broke_group\") Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),RemoteObject.createImmutable("broke_group")))) { 
 BA.debugLineNum = 532;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . گزارش ثبت شد";
Debug.ShouldStop(524288);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("با تشکر از حسن توجه شما . گزارش ثبت شد .")),(Object)(RemoteObject.createImmutable("گزارش خطا")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 533;BA.debugLine="Job.Release";
Debug.ShouldStop(1048576);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 BA.debugLineNum = 534;BA.debugLine="Main.vipInsertCount = Main.vipInsertCount +1";
Debug.ShouldStop(2097152);
groupviewact.mostCurrent._main._vipinsertcount = RemoteObject.solve(new RemoteObject[] {groupviewact.mostCurrent._main._vipinsertcount,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 535;BA.debugLine="writeInfo";
Debug.ShouldStop(4194304);
_writeinfo();
 BA.debugLineNum = 536;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
groupviewact.mostCurrent._activity.runVoidMethod ("Finish");
 }}}}};
 }else {
 BA.debugLineNum = 540;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
Debug.ShouldStop(134217728);
groupviewact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .")),(Object)(groupviewact.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e394) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e394.toString()); BA.debugLineNum = 543;BA.debugLine="Job.Release";
Debug.ShouldStop(1073741824);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 BA.debugLineNum = 544;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات جستجو  \",\"خطا\")";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات جستجو  ")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 547;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jointelegram(RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("joinTelegram (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,424);
if (RapidSub.canDelegate("jointelegram")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","jointelegram", _address);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
RemoteObject _teladdress = RemoteObject.createImmutable("");
Debug.locals.put("address", _address);
 BA.debugLineNum = 424;BA.debugLine="Sub joinTelegram(address As String  )";
Debug.ShouldStop(128);
 BA.debugLineNum = 426;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(512);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 428;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 430;BA.debugLine="Dim telAddress As String";
Debug.ShouldStop(8192);
_teladdress = RemoteObject.createImmutable("");Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 432;BA.debugLine="Select itemType";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(groupviewact._itemtype,BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 7))) {
case 0: {
 BA.debugLineNum = 435;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
Debug.ShouldStop(262144);
_teladdress = _address.runMethod(true,"replace",(Object)(BA.ObjectToString("https://telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 436;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
Debug.ShouldStop(524288);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("http://telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 437;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/\",";
Debug.ShouldStop(1048576);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 438;BA.debugLine="telAddress=telAddress.Replace(\"@\",\"\")";
Debug.ShouldStop(2097152);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("@")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 439;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://resolve?";
Debug.ShouldStop(4194304);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tg://resolve?domain="),_teladdress))))));
 break; }
case 1: {
 BA.debugLineNum = 442;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
Debug.ShouldStop(33554432);
_teladdress = _address.runMethod(true,"replace",(Object)(BA.ObjectToString("https://telegram.me/addstickers/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 443;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
Debug.ShouldStop(67108864);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("http://telegram.me/addstickers/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 444;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/ad";
Debug.ShouldStop(134217728);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("telegram.me/addstickers/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 446;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://addstick";
Debug.ShouldStop(536870912);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tg://addstickers/?set="),_teladdress))))));
 break; }
case 2: {
 BA.debugLineNum = 449;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
Debug.ShouldStop(1);
_teladdress = _address.runMethod(true,"replace",(Object)(BA.ObjectToString("https://telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 450;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
Debug.ShouldStop(2);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("http://telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 451;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/\",";
Debug.ShouldStop(4);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 452;BA.debugLine="telAddress=telAddress.Replace(\"@\",\"\")";
Debug.ShouldStop(8);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("@")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 453;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://resolve?";
Debug.ShouldStop(16);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tg://resolve?domain="),_teladdress))))));
 break; }
case 3: {
 BA.debugLineNum = 457;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
Debug.ShouldStop(256);
_teladdress = _address.runMethod(true,"replace",(Object)(BA.ObjectToString("https://telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 458;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
Debug.ShouldStop(512);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("http://telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 459;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/\",";
Debug.ShouldStop(1024);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("telegram.me/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 461;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://resolve?";
Debug.ShouldStop(4096);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tg://resolve?domain="),_teladdress))))));
 break; }
default: {
 BA.debugLineNum = 464;BA.debugLine="telAddress=address.Replace(\"https://telegram.";
Debug.ShouldStop(32768);
_teladdress = _address.runMethod(true,"replace",(Object)(BA.ObjectToString("https://telegram.me/joinchat/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 465;BA.debugLine="telAddress=telAddress.Replace(\"http://telegra";
Debug.ShouldStop(65536);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("http://telegram.me/joinchat/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 466;BA.debugLine="telAddress=telAddress.Replace(\"telegram.me/jo";
Debug.ShouldStop(131072);
_teladdress = _teladdress.runMethod(true,"replace",(Object)(BA.ObjectToString("telegram.me/joinchat/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("telAddress", _teladdress);
 BA.debugLineNum = 468;BA.debugLine="StartActivity(p.OpenBrowser(\"tg://join?inv";
Debug.ShouldStop(524288);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.concat(RemoteObject.createImmutable("tg://join?invite="),_teladdress))))));
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e339) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e339.toString()); BA.debugLineNum = 474;BA.debugLine="Msgbox(\"نرم افزار تلگرام نصب نیست.\",\"خطا\")";
Debug.ShouldStop(33554432);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("نرم افزار تلگرام نصب نیست.")),(Object)(RemoteObject.createImmutable("خطا")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 475;BA.debugLine="StartActivity(p.OpenBrowser(address))";
Debug.ShouldStop(67108864);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(_address)))));
 };
 BA.debugLineNum = 478;BA.debugLine="End Sub";
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
public static RemoteObject  _menuabout_click() throws Exception{
try {
		Debug.PushSubsStack("MenuAbout_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,554);
if (RapidSub.canDelegate("menuabout_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","menuabout_click");
 BA.debugLineNum = 554;BA.debugLine="Sub MenuAbout_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 555;BA.debugLine="StartActivity(\"AboutAct\")";
Debug.ShouldStop(1024);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("AboutAct"))));
 BA.debugLineNum = 556;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(2048);
groupviewact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 557;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menucontact_click() throws Exception{
try {
		Debug.PushSubsStack("MenuContact_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,574);
if (RapidSub.canDelegate("menucontact_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","menucontact_click");
 BA.debugLineNum = 574;BA.debugLine="Sub MenuContact_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 575;BA.debugLine="StartActivity(\"contactAct\")";
Debug.ShouldStop(1073741824);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("contactAct"))));
 BA.debugLineNum = 576;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(-2147483648);
groupviewact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 577;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menuexit_click() throws Exception{
try {
		Debug.PushSubsStack("MenuExit_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,559);
if (RapidSub.canDelegate("menuexit_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","menuexit_click");
 BA.debugLineNum = 559;BA.debugLine="Sub MenuExit_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 561;BA.debugLine="ExitApplication";
Debug.ShouldStop(65536);
groupviewact.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 564;BA.debugLine="End Sub";
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
public static RemoteObject  _menuhelp_click() throws Exception{
try {
		Debug.PushSubsStack("MenuHelp_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,549);
if (RapidSub.canDelegate("menuhelp_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","menuhelp_click");
 BA.debugLineNum = 549;BA.debugLine="Sub MenuHelp_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="StartActivity(\"helpAct\")";
Debug.ShouldStop(32);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("helpAct"))));
 BA.debugLineNum = 551;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(64);
groupviewact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 552;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menuorder_click() throws Exception{
try {
		Debug.PushSubsStack("MenuOrder_Click (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,565);
if (RapidSub.canDelegate("menuorder_click")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","menuorder_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 565;BA.debugLine="Sub MenuOrder_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 566;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 567;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(4194304);
groupviewact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),groupviewact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),groupviewact.mostCurrent.activityBA);
 BA.debugLineNum = 570;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(33554432);
groupviewact.mostCurrent.__c.runVoidMethod ("StartActivity",groupviewact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/index/1"))))));
 BA.debugLineNum = 571;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(67108864);
groupviewact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(groupviewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 572;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _writeinfo() throws Exception{
try {
		Debug.PushSubsStack("writeInfo (groupviewact) ","groupviewact",8,groupviewact.mostCurrent.activityBA,groupviewact.mostCurrent,622);
if (RapidSub.canDelegate("writeinfo")) return groupviewact.remoteMe.runUserSub(false, "groupviewact","writeinfo");
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _updatequery = RemoteObject.createImmutable("");
 BA.debugLineNum = 622;BA.debugLine="Sub writeInfo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 624;BA.debugLine="If(Main.userInfo.IsInitialized =False) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",groupviewact.mostCurrent._main._userinfo.runMethod(true,"IsInitialized"),groupviewact.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 625;BA.debugLine="Main.userInfo.Initialize";
Debug.ShouldStop(65536);
groupviewact.mostCurrent._main._userinfo.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 628;BA.debugLine="Dim line As String";
Debug.ShouldStop(524288);
_line = RemoteObject.createImmutable("");Debug.locals.put("line", _line);
 BA.debugLineNum = 630;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 631;BA.debugLine="line = Main.phoneId.GetLine1Number";
Debug.ShouldStop(4194304);
_line = groupviewact.mostCurrent._main._phoneid.runMethod(true,"GetLine1Number");Debug.locals.put("line", _line);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e462) {
			BA.rdebugUtils.runVoidMethod("setLastException",groupviewact.processBA, e462.toString()); BA.debugLineNum = 633;BA.debugLine="line = \"need root\"";
Debug.ShouldStop(16777216);
_line = BA.ObjectToString("need root");Debug.locals.put("line", _line);
 };
 BA.debugLineNum = 636;BA.debugLine="Main.userInfo.Put(\"sdk\",Main.phone.SdkVersion)";
Debug.ShouldStop(134217728);
groupviewact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sdk"))),(Object)((groupviewact.mostCurrent._main._phone.runMethod(true,"getSdkVersion"))));
 BA.debugLineNum = 637;BA.debugLine="Main.userInfo.Put(\"model\",Main.phone.Manufacturer";
Debug.ShouldStop(268435456);
groupviewact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("model"))),(Object)((RemoteObject.concat(groupviewact.mostCurrent._main._phone.runMethod(true,"getManufacturer"),RemoteObject.createImmutable(","),groupviewact.mostCurrent._main._phone.runMethod(true,"getProduct")))));
 BA.debugLineNum = 638;BA.debugLine="Main.userInfo.Put(\"line_number\",line)";
Debug.ShouldStop(536870912);
groupviewact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("line_number"))),(Object)((_line)));
 BA.debugLineNum = 639;BA.debugLine="Main.userInfo.Put(\"phoneid\",Main.phoneId.GetDevic";
Debug.ShouldStop(1073741824);
groupviewact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("phoneid"))),(Object)((groupviewact.mostCurrent._main._phoneid.runMethod(true,"GetDeviceId"))));
 BA.debugLineNum = 643;BA.debugLine="Main.userInfo.Put(\"to_day_insert_advance\",Main.vi";
Debug.ShouldStop(4);
groupviewact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_insert_advance"))),(Object)((groupviewact.mostCurrent._main._vipinsertcount)));
 BA.debugLineNum = 644;BA.debugLine="Main.userInfo.Put(\"to_day_insert\",Main.todayInser";
Debug.ShouldStop(8);
groupviewact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_insert"))),(Object)((groupviewact.mostCurrent._main._todayinsertcount)));
 BA.debugLineNum = 646;BA.debugLine="Dim updateQuery As String  = \"update  info set \"";
Debug.ShouldStop(32);
_updatequery = RemoteObject.concat(RemoteObject.createImmutable("update  info set "),RemoteObject.createImmutable("name  ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("phone	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("user_id	 ="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("pass	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("user_name	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("sdk	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sdk")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("model	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("model")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("line_number	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("phoneid	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phoneid")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("is_advance	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_advance")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("is_premium	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_premium")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("advance_count	 ="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("advance_count")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("advance_expier_date	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("advance_expier_date")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("to_day_date	 ='"),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_date")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("to_day_insert	 ="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("to_day_insert_advance	 ="),groupviewact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert_advance")))));Debug.locals.put("updateQuery", _updatequery);Debug.locals.put("updateQuery", _updatequery);
 BA.debugLineNum = 664;BA.debugLine="DBUtils.ExecuteMemoryTable(Main.SQL1,  updateQuer";
Debug.ShouldStop(8388608);
groupviewact.mostCurrent._dbutils.runVoidMethod ("_executememorytable",groupviewact.mostCurrent.activityBA,(Object)(groupviewact.mostCurrent._main._sql1),(Object)(_updatequery),(Object)((groupviewact.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 666;BA.debugLine="End Sub";
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
}