package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class searchact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,47);
if (RapidSub.canDelegate("activity_create")) return searchact.remoteMe.runUserSub(false, "searchact","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
Debug.ShouldStop(65536);
searchact.mostCurrent._navi.runVoidMethod ("Initialize2",searchact.mostCurrent.activityBA,(Object)(BA.ObjectToString("navi")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), searchact.mostCurrent._activity.getObject()),(Object)(searchact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),searchact.mostCurrent.activityBA)),(Object)(searchact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 53;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
Debug.ShouldStop(1048576);
searchact.mostCurrent._navi.runMethod(false,"getNavigationPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menu")),searchact.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(4194304);
searchact.mostCurrent._pcantent.runVoidMethod ("Initialize",searchact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 56;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
Debug.ShouldStop(8388608);
searchact.mostCurrent._navi.runMethod(false,"getContentPanel").runVoidMethod ("AddView",(Object)((searchact.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(searchact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),searchact.mostCurrent.activityBA)),(Object)(searchact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),searchact.mostCurrent.activityBA)));
 BA.debugLineNum = 57;BA.debugLine="pCantent.SendToBack";
Debug.ShouldStop(16777216);
searchact.mostCurrent._pcantent.runVoidMethod ("SendToBack");
 BA.debugLineNum = 58;BA.debugLine="pCantent.LoadLayout(\"searchView\")";
Debug.ShouldStop(33554432);
searchact.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("searchView")),searchact.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="Label1.TextSize= 15";
Debug.ShouldStop(268435456);
searchact.mostCurrent._label1.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 62;BA.debugLine="Label1.Gravity= Gravity.RIGHT";
Debug.ShouldStop(536870912);
searchact.mostCurrent._label1.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 63;BA.debugLine="Label1.Typeface=Main.font";
Debug.ShouldStop(1073741824);
searchact.mostCurrent._label1.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 65;BA.debugLine="Label2.TextSize= 15";
Debug.ShouldStop(1);
searchact.mostCurrent._label2.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 66;BA.debugLine="Label2.Gravity= Gravity.RIGHT";
Debug.ShouldStop(2);
searchact.mostCurrent._label2.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 67;BA.debugLine="Label2.Typeface=Main.font";
Debug.ShouldStop(4);
searchact.mostCurrent._label2.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 69;BA.debugLine="Label3.TextSize= 15";
Debug.ShouldStop(16);
searchact.mostCurrent._label3.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 70;BA.debugLine="Label3.Gravity= Gravity.RIGHT";
Debug.ShouldStop(32);
searchact.mostCurrent._label3.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 71;BA.debugLine="Label3.Typeface=Main.font";
Debug.ShouldStop(64);
searchact.mostCurrent._label3.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 73;BA.debugLine="Label5.TextSize= 15";
Debug.ShouldStop(256);
searchact.mostCurrent._label5.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 74;BA.debugLine="Label5.Gravity= Gravity.RIGHT";
Debug.ShouldStop(512);
searchact.mostCurrent._label5.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 75;BA.debugLine="Label5.Typeface=Main.font";
Debug.ShouldStop(1024);
searchact.mostCurrent._label5.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 76;BA.debugLine="Label5.Text  = \"جستجو در \"  & Main.selectedTypeTi";
Debug.ShouldStop(2048);
searchact.mostCurrent._label5.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("جستجو در "),searchact.mostCurrent._main._selectedtypetitle,RemoteObject.createImmutable(" ها "))));
 BA.debugLineNum = 77;BA.debugLine="Activity.Title = \"جستجو در \"  & Main.selectedType";
Debug.ShouldStop(4096);
searchact.mostCurrent._activity.runMethod(false,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable("جستجو در "),searchact.mostCurrent._main._selectedtypetitle,RemoteObject.createImmutable(" ها "))));
 BA.debugLineNum = 80;BA.debugLine="txtName.TextSize= 15";
Debug.ShouldStop(32768);
searchact.mostCurrent._txtname.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 81;BA.debugLine="txtName.Gravity= Gravity.RIGHT";
Debug.ShouldStop(65536);
searchact.mostCurrent._txtname.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 82;BA.debugLine="txtName.TextColor= Colors.Black";
Debug.ShouldStop(131072);
searchact.mostCurrent._txtname.runMethod(true,"setTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 83;BA.debugLine="txtName.Color= Colors.White";
Debug.ShouldStop(262144);
searchact.mostCurrent._txtname.runVoidMethod ("setColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 84;BA.debugLine="txtName.Typeface=Main.font";
Debug.ShouldStop(524288);
searchact.mostCurrent._txtname.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 85;BA.debugLine="txtName.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(1048576);
searchact.mostCurrent._txtname.runVoidMethod ("setColor",searchact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 87;BA.debugLine="txtDescription.TextSize= 15";
Debug.ShouldStop(4194304);
searchact.mostCurrent._txtdescription.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 88;BA.debugLine="txtDescription.Gravity= Gravity.RIGHT";
Debug.ShouldStop(8388608);
searchact.mostCurrent._txtdescription.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 89;BA.debugLine="txtDescription.TextColor= Colors.Black";
Debug.ShouldStop(16777216);
searchact.mostCurrent._txtdescription.runMethod(true,"setTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 90;BA.debugLine="txtDescription.Color = Colors.White";
Debug.ShouldStop(33554432);
searchact.mostCurrent._txtdescription.runVoidMethod ("setColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 91;BA.debugLine="txtDescription.Typeface=Main.font";
Debug.ShouldStop(67108864);
searchact.mostCurrent._txtdescription.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 92;BA.debugLine="txtDescription.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(134217728);
searchact.mostCurrent._txtdescription.runVoidMethod ("setColor",searchact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 95;BA.debugLine="txtTag.TextSize= 15";
Debug.ShouldStop(1073741824);
searchact.mostCurrent._txttag.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 96;BA.debugLine="txtTag.Gravity= Gravity.RIGHT";
Debug.ShouldStop(-2147483648);
searchact.mostCurrent._txttag.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 97;BA.debugLine="txtTag.TextColor= Colors.Black";
Debug.ShouldStop(1);
searchact.mostCurrent._txttag.runMethod(true,"setTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 98;BA.debugLine="txtTag.Color= Colors.White";
Debug.ShouldStop(2);
searchact.mostCurrent._txttag.runVoidMethod ("setColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 99;BA.debugLine="txtTag.Typeface=Main.font";
Debug.ShouldStop(4);
searchact.mostCurrent._txttag.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 100;BA.debugLine="txtTag.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(8);
searchact.mostCurrent._txttag.runVoidMethod ("setColor",searchact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 103;BA.debugLine="If(Main.selectedType <>  \"sticker\" And Main.selec";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("!",searchact.mostCurrent._main._selectedtype,BA.ObjectToString("sticker")) && RemoteObject.solveBoolean("!",searchact.mostCurrent._main._selectedtype,RemoteObject.createImmutable("robot")))) { 
 BA.debugLineNum = 104;BA.debugLine="PanelInputs.RemoveView()";
Debug.ShouldStop(128);
searchact.mostCurrent._panelinputs.runVoidMethod ("RemoveView");
 BA.debugLineNum = 105;BA.debugLine="ScrollView.Panel.AddView(PanelInputs,0,0,PanelIn";
Debug.ShouldStop(256);
searchact.mostCurrent._scrollview.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((searchact.mostCurrent._panelinputs.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(searchact.mostCurrent._panelinputs.runMethod(true,"getWidth")),(Object)(searchact.mostCurrent._panelinputs.runMethod(true,"getHeight")));
 BA.debugLineNum = 106;BA.debugLine="ScrollView.Panel.Height =580dip";
Debug.ShouldStop(512);
searchact.mostCurrent._scrollview.runMethod(false,"getPanel").runMethod(true,"setHeight",searchact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 580))));
 BA.debugLineNum = 107;BA.debugLine="ScrollView.Panel.Color=Colors.White";
Debug.ShouldStop(1024);
searchact.mostCurrent._scrollview.runMethod(false,"getPanel").runVoidMethod ("setColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 111;BA.debugLine="Label6.Visible = True";
Debug.ShouldStop(16384);
searchact.mostCurrent._label6.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="Label7.Visible = True";
Debug.ShouldStop(32768);
searchact.mostCurrent._label7.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 113;BA.debugLine="SpinnerOstan.Visible= True";
Debug.ShouldStop(65536);
searchact.mostCurrent._spinnerostan.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 114;BA.debugLine="SpinnerShahr.Visible = True";
Debug.ShouldStop(131072);
searchact.mostCurrent._spinnershahr.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="Label6.TextSize= 15";
Debug.ShouldStop(524288);
searchact.mostCurrent._label6.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 117;BA.debugLine="Label6.Gravity= Gravity.RIGHT";
Debug.ShouldStop(1048576);
searchact.mostCurrent._label6.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 118;BA.debugLine="Label6.Typeface=Main.font";
Debug.ShouldStop(2097152);
searchact.mostCurrent._label6.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 120;BA.debugLine="Label7.TextSize= 15";
Debug.ShouldStop(8388608);
searchact.mostCurrent._label7.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 121;BA.debugLine="Label7.Gravity= Gravity.RIGHT";
Debug.ShouldStop(16777216);
searchact.mostCurrent._label7.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 122;BA.debugLine="Label7.Typeface=Main.font";
Debug.ShouldStop(33554432);
searchact.mostCurrent._label7.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 125;BA.debugLine="LabelMessage.TextSize= 15";
Debug.ShouldStop(268435456);
searchact.mostCurrent._labelmessage.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 126;BA.debugLine="LabelMessage.Gravity= Gravity.RIGHT";
Debug.ShouldStop(536870912);
searchact.mostCurrent._labelmessage.runMethod(true,"setGravity",searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 127;BA.debugLine="LabelMessage.Typeface=Main.font";
Debug.ShouldStop(1073741824);
searchact.mostCurrent._labelmessage.runMethod(false,"setTypeface",(searchact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 129;BA.debugLine="SpinnerOstan.Add(\"آذربايجان شرقي\")";
Debug.ShouldStop(1);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آذربايجان شرقي")));
 BA.debugLineNum = 130;BA.debugLine="SpinnerOstan.Add(\"آذربايجان غربي\")";
Debug.ShouldStop(2);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آذربايجان غربي")));
 BA.debugLineNum = 131;BA.debugLine="SpinnerOstan.Add(\"اردبيل\")";
Debug.ShouldStop(4);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اردبيل")));
 BA.debugLineNum = 132;BA.debugLine="SpinnerOstan.Add(\"اصفهان\")";
Debug.ShouldStop(8);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اصفهان")));
 BA.debugLineNum = 133;BA.debugLine="SpinnerOstan.Add(\"ايلام\")";
Debug.ShouldStop(16);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("ايلام")));
 BA.debugLineNum = 134;BA.debugLine="SpinnerOstan.Add(\"بوشهر\")";
Debug.ShouldStop(32);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("بوشهر")));
 BA.debugLineNum = 135;BA.debugLine="SpinnerOstan.Add(\"تهران\")";
Debug.ShouldStop(64);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("تهران")));
 BA.debugLineNum = 136;BA.debugLine="SpinnerOstan.Add(\"چهارمحال وبختياري\")";
Debug.ShouldStop(128);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("چهارمحال وبختياري")));
 BA.debugLineNum = 137;BA.debugLine="SpinnerOstan.Add(\"خراسان جنوبي\")";
Debug.ShouldStop(256);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان جنوبي")));
 BA.debugLineNum = 138;BA.debugLine="SpinnerOstan.Add(\"خراسان رضوي\")";
Debug.ShouldStop(512);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان رضوي")));
 BA.debugLineNum = 139;BA.debugLine="SpinnerOstan.Add(\"خراسان شمالي\")";
Debug.ShouldStop(1024);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان شمالي")));
 BA.debugLineNum = 140;BA.debugLine="SpinnerOstan.Add(\"خوزستان\")";
Debug.ShouldStop(2048);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خوزستان")));
 BA.debugLineNum = 141;BA.debugLine="SpinnerOstan.Add(\"زنجان\")";
Debug.ShouldStop(4096);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("زنجان")));
 BA.debugLineNum = 142;BA.debugLine="SpinnerOstan.Add(\"سمنان\")";
Debug.ShouldStop(8192);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سمنان")));
 BA.debugLineNum = 143;BA.debugLine="SpinnerOstan.Add(\"سيستان و بلوچستان\")";
Debug.ShouldStop(16384);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سيستان و بلوچستان")));
 BA.debugLineNum = 144;BA.debugLine="SpinnerOstan.Add(\"فارس\")";
Debug.ShouldStop(32768);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("فارس")));
 BA.debugLineNum = 145;BA.debugLine="SpinnerOstan.Add(\"قزوين\")";
Debug.ShouldStop(65536);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("قزوين")));
 BA.debugLineNum = 146;BA.debugLine="SpinnerOstan.Add(\"قم\")";
Debug.ShouldStop(131072);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("قم")));
 BA.debugLineNum = 147;BA.debugLine="SpinnerOstan.Add(\"كردستان\")";
Debug.ShouldStop(262144);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كردستان")));
 BA.debugLineNum = 148;BA.debugLine="SpinnerOstan.Add(\"كرمان\")";
Debug.ShouldStop(524288);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كرمان")));
 BA.debugLineNum = 149;BA.debugLine="SpinnerOstan.Add(\"كرمانشاه\")";
Debug.ShouldStop(1048576);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كرمانشاه")));
 BA.debugLineNum = 150;BA.debugLine="SpinnerOstan.Add(\"كهگيلويه وبوير احمد\")";
Debug.ShouldStop(2097152);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كهگيلويه وبوير احمد")));
 BA.debugLineNum = 151;BA.debugLine="SpinnerOstan.Add(\"گلستان\")";
Debug.ShouldStop(4194304);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("گلستان")));
 BA.debugLineNum = 152;BA.debugLine="SpinnerOstan.Add(\"گيلان\")";
Debug.ShouldStop(8388608);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("گيلان")));
 BA.debugLineNum = 153;BA.debugLine="SpinnerOstan.Add(\"لرستان\")";
Debug.ShouldStop(16777216);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("لرستان")));
 BA.debugLineNum = 154;BA.debugLine="SpinnerOstan.Add(\"مازندران\")";
Debug.ShouldStop(33554432);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مازندران")));
 BA.debugLineNum = 155;BA.debugLine="SpinnerOstan.Add(\"مركزي\")";
Debug.ShouldStop(67108864);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مركزي")));
 BA.debugLineNum = 156;BA.debugLine="SpinnerOstan.Add(\"هرمزگان\")";
Debug.ShouldStop(134217728);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("هرمزگان")));
 BA.debugLineNum = 157;BA.debugLine="SpinnerOstan.Add(\"همدان\")";
Debug.ShouldStop(268435456);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همدان")));
 BA.debugLineNum = 158;BA.debugLine="SpinnerOstan.Add(\"يزد\")";
Debug.ShouldStop(536870912);
searchact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("يزد")));
 BA.debugLineNum = 160;BA.debugLine="SpinnerOstan.DropdownTextColor = Colors.White";
Debug.ShouldStop(-2147483648);
searchact.mostCurrent._spinnerostan.runMethod(true,"setDropdownTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 161;BA.debugLine="SpinnerOstan.TextColor = Colors.Black";
Debug.ShouldStop(1);
searchact.mostCurrent._spinnerostan.runMethod(true,"setTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 163;BA.debugLine="SpinnerCat.Add(\"دسته بندی نشده\")";
Debug.ShouldStop(4);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("دسته بندی نشده")));
 BA.debugLineNum = 164;BA.debugLine="SpinnerCat.Add(\"رسمی\")";
Debug.ShouldStop(8);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("رسمی")));
 BA.debugLineNum = 165;BA.debugLine="SpinnerCat.Add(\"علمی\")";
Debug.ShouldStop(16);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("علمی")));
 BA.debugLineNum = 166;BA.debugLine="SpinnerCat.Add(\"آموزش-تحصیلی\")";
Debug.ShouldStop(32);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آموزش-تحصیلی")));
 BA.debugLineNum = 167;BA.debugLine="SpinnerCat.Add(\"طنز و سرگرمی\")";
Debug.ShouldStop(64);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("طنز و سرگرمی")));
 BA.debugLineNum = 168;BA.debugLine="SpinnerCat.Add(\"اجتماعی-خبری\")";
Debug.ShouldStop(128);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اجتماعی-خبری")));
 BA.debugLineNum = 169;BA.debugLine="SpinnerCat.Add(\"پزشکی-سلامت\")";
Debug.ShouldStop(256);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("پزشکی-سلامت")));
 BA.debugLineNum = 170;BA.debugLine="SpinnerCat.Add(\"دوستان شخصی\")";
Debug.ShouldStop(512);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("دوستان شخصی")));
 BA.debugLineNum = 171;BA.debugLine="SpinnerCat.Add(\"تجاری\")";
Debug.ShouldStop(1024);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("تجاری")));
 BA.debugLineNum = 172;BA.debugLine="SpinnerCat.Add(\"ادبی-هنری\")";
Debug.ShouldStop(2048);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("ادبی-هنری")));
 BA.debugLineNum = 173;BA.debugLine="SpinnerCat.Add(\"عشق-دلنوشته\")";
Debug.ShouldStop(4096);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("عشق-دلنوشته")));
 BA.debugLineNum = 174;BA.debugLine="SpinnerCat.Add(\"اعتقادی\")";
Debug.ShouldStop(8192);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اعتقادی")));
 BA.debugLineNum = 175;BA.debugLine="SpinnerCat.Add(\"شرکت ها-دفتر ها\")";
Debug.ShouldStop(16384);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("شرکت ها-دفتر ها")));
 BA.debugLineNum = 176;BA.debugLine="SpinnerCat.Add(\"مشاغل و صنفی\")";
Debug.ShouldStop(32768);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مشاغل و صنفی")));
 BA.debugLineNum = 177;BA.debugLine="SpinnerCat.Add(\"ورزشی\")";
Debug.ShouldStop(65536);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("ورزشی")));
 BA.debugLineNum = 178;BA.debugLine="SpinnerCat.Add(\"مد و زیبایی\")";
Debug.ShouldStop(131072);
searchact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مد و زیبایی")));
 BA.debugLineNum = 180;BA.debugLine="SpinnerCat.DropdownTextColor = Colors.White";
Debug.ShouldStop(524288);
searchact.mostCurrent._spinnercat.runMethod(true,"setDropdownTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 181;BA.debugLine="SpinnerCat.TextColor = Colors.Black";
Debug.ShouldStop(1048576);
searchact.mostCurrent._spinnercat.runMethod(true,"setTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 183;BA.debugLine="SpinnerShahr.DropdownTextColor = Colors.White";
Debug.ShouldStop(4194304);
searchact.mostCurrent._spinnershahr.runMethod(true,"setDropdownTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 184;BA.debugLine="SpinnerShahr.TextColor = Colors.Black";
Debug.ShouldStop(8388608);
searchact.mostCurrent._spinnershahr.runMethod(true,"setTextColor",searchact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 187;BA.debugLine="Label6.Visible =True";
Debug.ShouldStop(67108864);
searchact.mostCurrent._label6.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 193;BA.debugLine="Label6.Visible = False";
Debug.ShouldStop(1);
searchact.mostCurrent._label6.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 194;BA.debugLine="Label7.Visible = False";
Debug.ShouldStop(2);
searchact.mostCurrent._label7.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 195;BA.debugLine="SpinnerOstan.Visible= False";
Debug.ShouldStop(4);
searchact.mostCurrent._spinnerostan.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 196;BA.debugLine="SpinnerOstan.Visible = False";
Debug.ShouldStop(8);
searchact.mostCurrent._spinnerostan.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 198;BA.debugLine="Label6.Visible =False";
Debug.ShouldStop(32);
searchact.mostCurrent._label6.runMethod(true,"setVisible",searchact.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 206;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,212);
if (RapidSub.canDelegate("activity_pause")) return searchact.remoteMe.runUserSub(false, "searchact","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 212;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 214;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,208);
if (RapidSub.canDelegate("activity_resume")) return searchact.remoteMe.runUserSub(false, "searchact","activity_resume");
 BA.debugLineNum = 208;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 210;BA.debugLine="End Sub";
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
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,43);
if (RapidSub.canDelegate("btnmenu_click")) return searchact.remoteMe.runUserSub(false, "searchact","btnmenu_click");
 BA.debugLineNum = 43;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
Debug.ShouldStop(2048);
searchact.mostCurrent._navi.runVoidMethod ("OpenDrawer2",(Object)(searchact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
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
public static RemoteObject  _btnpanel_click() throws Exception{
try {
		Debug.PushSubsStack("btnPanel_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,333);
if (RapidSub.canDelegate("btnpanel_click")) return searchact.remoteMe.runUserSub(false, "searchact","btnpanel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 333;BA.debugLine="Sub btnPanel_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 335;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(16384);
searchact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),searchact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),searchact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),searchact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),searchact.mostCurrent.activityBA);
 BA.debugLineNum = 338;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(131072);
searchact.mostCurrent.__c.runVoidMethod ("StartActivity",searchact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/"))))));
 BA.debugLineNum = 339;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(262144);
searchact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 340;BA.debugLine="End Sub";
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,483);
if (RapidSub.canDelegate("button1_click")) return searchact.remoteMe.runUserSub(false, "searchact","button1_click");
 BA.debugLineNum = 483;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 484;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
searchact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 485;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonreturn_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonReturn_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,274);
if (RapidSub.canDelegate("buttonreturn_click")) return searchact.remoteMe.runUserSub(false, "searchact","buttonreturn_click");
 BA.debugLineNum = 274;BA.debugLine="Sub ButtonReturn_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
searchact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 276;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonsearch_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSearch_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,277);
if (RapidSub.canDelegate("buttonsearch_click")) return searchact.remoteMe.runUserSub(false, "searchact","buttonsearch_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 277;BA.debugLine="Sub ButtonSearch_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 280;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 282;BA.debugLine="If (txtName.Text.Length <3 And  txtDescription.T";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("<",searchact.mostCurrent._txtname.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 3)) && RemoteObject.solveBoolean("<",searchact.mostCurrent._txtdescription.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 3)) && RemoteObject.solveBoolean("<",searchact.mostCurrent._txttag.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 283;BA.debugLine="Msgbox(\"برای جستجو اطلاعات بیشتری مورد نیاز است";
Debug.ShouldStop(67108864);
searchact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("برای جستجو اطلاعات بیشتری مورد نیاز است")),(Object)(RemoteObject.createImmutable("اطلاعات بیشتر")),searchact.mostCurrent.activityBA);
 BA.debugLineNum = 284;BA.debugLine="Return";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 286;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(536870912);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 287;BA.debugLine="ProgressDialogShow(\"درحال جستجو\")";
Debug.ShouldStop(1073741824);
searchact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",searchact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال جستجو")));
 BA.debugLineNum = 288;BA.debugLine="job.Initialize(\"search_group\", Me)";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",searchact.processBA,(Object)(BA.ObjectToString("search_group")),(Object)(searchact.getObject()));
 BA.debugLineNum = 289;BA.debugLine="Main.query=\"http://www.aloosalam.ir/index.php/mo";
Debug.ShouldStop(1);
searchact.mostCurrent._main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 290;BA.debugLine="Main.parameter = \"pass=1266\"  &   _ 			\"&q=\" & t";
Debug.ShouldStop(2);
searchact.mostCurrent._main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&q="),searchact.mostCurrent._txtname.runMethod(true,"getText"),RemoteObject.createImmutable("&description="),searchact.mostCurrent._txtdescription.runMethod(true,"getText"),RemoteObject.createImmutable("&tag="),searchact.mostCurrent._txttag.runMethod(true,"getText"),RemoteObject.createImmutable("&type="),searchact.mostCurrent._main._selectedtype,RemoteObject.createImmutable("&ostan="),searchact._selectedostan,RemoteObject.createImmutable("&shahr="),searchact._selectedshahr,RemoteObject.createImmutable("&cat="),searchact._selectedcat,RemoteObject.createImmutable("&user="),searchact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),searchact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),searchact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 301;BA.debugLine="job.PostString(Main.query,Main.parameter )";
Debug.ShouldStop(4096);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(searchact.mostCurrent._main._query),(Object)(searchact.mostCurrent._main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e213) {
			BA.rdebugUtils.runVoidMethod("setLastException",searchact.processBA, e213.toString()); BA.debugLineNum = 303;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات جستجو  \",\"خطا\")";
Debug.ShouldStop(16384);
searchact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در ارسال اطلاعات جستجو  ")),(Object)(RemoteObject.createImmutable("خطا")),searchact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 306;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private txtName As EditText";
searchact.mostCurrent._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private txtDescription As EditText";
searchact.mostCurrent._txtdescription = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private txtTag As EditText";
searchact.mostCurrent._txttag = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Label1 As Label";
searchact.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label2 As Label";
searchact.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label3 As Label";
searchact.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label5 As Label";
searchact.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelInputs As Panel";
searchact.mostCurrent._panelinputs = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Label6 As Label";
searchact.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Label7 As Label";
searchact.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ScrollView As ScrollView";
searchact.mostCurrent._scrollview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private SpinnerOstan As Spinner";
searchact.mostCurrent._spinnerostan = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private SpinnerShahr As Spinner";
searchact.mostCurrent._spinnershahr = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private SpinnerCat As Spinner";
searchact.mostCurrent._spinnercat = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private txtAddress As EditText";
searchact.mostCurrent._txtaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private btnMenu As Button";
searchact.mostCurrent._btnmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private btnReturn As Button";
searchact.mostCurrent._btnreturn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private LabelMessage As Label";
searchact.mostCurrent._labelmessage = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim navi As AHNavigationDrawer";
searchact.mostCurrent._navi = RemoteObject.createNew ("de.amberhome.navdrawer.NavigationDrawer");
 //BA.debugLineNum = 39;BA.debugLine="Dim pCantent As Panel";
searchact.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,216);
if (RapidSub.canDelegate("jobdone")) return searchact.remoteMe.runUserSub(false, "searchact","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _countries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 216;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 218;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
searchact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 219;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(67108864);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 220;BA.debugLine="Dim res As String";
Debug.ShouldStop(134217728);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 221;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(268435456);
_res = _job.runClassMethod (Telegram.Search.httpjob.class, "_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 223;BA.debugLine="Log(\"Response from server: \" & res)";
Debug.ShouldStop(1073741824);
searchact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server: "),_res)));
 BA.debugLineNum = 224;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 225;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 226;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("search_group"),BA.ObjectToString(""))) {
case 0: {
 BA.debugLineNum = 229;BA.debugLine="Dim COUNTRIES As List";
Debug.ShouldStop(16);
_countries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 230;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list";
Debug.ShouldStop(32);
_countries = _parser.runMethod(false,"NextArray");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 233;BA.debugLine="Main.searchResult.Initialize()";
Debug.ShouldStop(256);
searchact.mostCurrent._main._searchresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 234;BA.debugLine="Main.searchResult.Clear()";
Debug.ShouldStop(512);
searchact.mostCurrent._main._searchresult.runVoidMethod ("Clear");
 BA.debugLineNum = 236;BA.debugLine="Dim rows As List";
Debug.ShouldStop(2048);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 237;BA.debugLine="rows= COUNTRIES.Get(0)";
Debug.ShouldStop(4096);
_rows.setObject(_countries.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 239;BA.debugLine="If(rows.Size > 0 ) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean(">",_rows.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 241;BA.debugLine="For i= 0 To rows.Size-1";
Debug.ShouldStop(65536);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {_rows.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18); _i = ((int)(0 + _i + step18)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 242;BA.debugLine="Dim row As Map";
Debug.ShouldStop(131072);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("row", _row);
 BA.debugLineNum = 244;BA.debugLine="row.Initialize()";
Debug.ShouldStop(524288);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 245;BA.debugLine="row=rows.Get(i)";
Debug.ShouldStop(1048576);
_row.setObject(_rows.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 246;BA.debugLine="Main.searchResult.Add(row)";
Debug.ShouldStop(2097152);
searchact.mostCurrent._main._searchresult.runVoidMethod ("Add",(Object)((_row.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 249;BA.debugLine="Job.Release";
Debug.ShouldStop(16777216);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 BA.debugLineNum = 250;BA.debugLine="StartActivity(\"searchResultAct\")";
Debug.ShouldStop(33554432);
searchact.mostCurrent.__c.runVoidMethod ("StartActivity",searchact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("searchResultAct"))));
 }else {
 BA.debugLineNum = 252;BA.debugLine="Msgbox(\"موردی با مشخصات درخواستی شما یافت نش";
Debug.ShouldStop(134217728);
searchact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("موردی با مشخصات درخواستی شما یافت نشد . از بخش آخرین "),searchact.mostCurrent._main._selectedtypetitle,RemoteObject.createImmutable("  ها هم می توانید  "),searchact.mostCurrent._main._selectedtypetitle,RemoteObject.createImmutable(" مورد نظر خود را پیدا کنید  . "))),(Object)(RemoteObject.createImmutable("جستجو")),searchact.mostCurrent.activityBA);
 };
 break; }
case 1: {
 BA.debugLineNum = 255;BA.debugLine="Dim l As List";
Debug.ShouldStop(1073741824);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("l", _l);
 BA.debugLineNum = 256;BA.debugLine="l = parser.NextArray";
Debug.ShouldStop(-2147483648);
_l = _parser.runMethod(false,"NextArray");Debug.locals.put("l", _l);
 BA.debugLineNum = 257;BA.debugLine="If l.Size = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_l.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 }else {
 BA.debugLineNum = 260;BA.debugLine="Dim m As Map";
Debug.ShouldStop(8);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 261;BA.debugLine="m = l.Get(0)";
Debug.ShouldStop(16);
_m.setObject(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 266;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
Debug.ShouldStop(512);
searchact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .")),(Object)(searchact.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e194) {
			BA.rdebugUtils.runVoidMethod("setLastException",searchact.processBA, e194.toString()); BA.debugLineNum = 269;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات جستجو  \",\"خطا\")";
Debug.ShouldStop(4096);
searchact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات جستجو  ")),(Object)(RemoteObject.createImmutable("خطا")),searchact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 272;BA.debugLine="End Sub";
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
public static RemoteObject  _menuabout_click() throws Exception{
try {
		Debug.PushSubsStack("MenuAbout_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,313);
if (RapidSub.canDelegate("menuabout_click")) return searchact.remoteMe.runUserSub(false, "searchact","menuabout_click");
 BA.debugLineNum = 313;BA.debugLine="Sub MenuAbout_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="StartActivity(\"AboutAct\")";
Debug.ShouldStop(33554432);
searchact.mostCurrent.__c.runVoidMethod ("StartActivity",searchact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("AboutAct"))));
 BA.debugLineNum = 315;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(67108864);
searchact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 316;BA.debugLine="End Sub";
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
public static RemoteObject  _menucontact_click() throws Exception{
try {
		Debug.PushSubsStack("MenuContact_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,329);
if (RapidSub.canDelegate("menucontact_click")) return searchact.remoteMe.runUserSub(false, "searchact","menucontact_click");
 BA.debugLineNum = 329;BA.debugLine="Sub MenuContact_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 330;BA.debugLine="StartActivity(\"contactAct\")";
Debug.ShouldStop(512);
searchact.mostCurrent.__c.runVoidMethod ("StartActivity",searchact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("contactAct"))));
 BA.debugLineNum = 331;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(1024);
searchact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 332;BA.debugLine="End Sub";
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
public static RemoteObject  _menuexit_click() throws Exception{
try {
		Debug.PushSubsStack("MenuExit_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,318);
if (RapidSub.canDelegate("menuexit_click")) return searchact.remoteMe.runUserSub(false, "searchact","menuexit_click");
 BA.debugLineNum = 318;BA.debugLine="Sub MenuExit_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 320;BA.debugLine="ExitApplication";
Debug.ShouldStop(-2147483648);
searchact.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 323;BA.debugLine="End Sub";
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
public static RemoteObject  _menuhelp_click() throws Exception{
try {
		Debug.PushSubsStack("MenuHelp_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,309);
if (RapidSub.canDelegate("menuhelp_click")) return searchact.remoteMe.runUserSub(false, "searchact","menuhelp_click");
 BA.debugLineNum = 309;BA.debugLine="Sub MenuHelp_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 310;BA.debugLine="StartActivity(\"helpAct\")";
Debug.ShouldStop(2097152);
searchact.mostCurrent.__c.runVoidMethod ("StartActivity",searchact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("helpAct"))));
 BA.debugLineNum = 311;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(4194304);
searchact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
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
public static RemoteObject  _menuorder_click() throws Exception{
try {
		Debug.PushSubsStack("MenuOrder_Click (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,324);
if (RapidSub.canDelegate("menuorder_click")) return searchact.remoteMe.runUserSub(false, "searchact","menuorder_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 324;BA.debugLine="Sub MenuOrder_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 326;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(32);
searchact.mostCurrent.__c.runVoidMethod ("StartActivity",searchact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/index/1"))))));
 BA.debugLineNum = 327;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(64);
searchact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(searchact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim selectedOstan As Int";
searchact._selectedostan = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 9;BA.debugLine="Dim selectedShahr As Int";
searchact._selectedshahr = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 10;BA.debugLine="Dim selectedCat As Int";
searchact._selectedcat = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinnercat_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerCat_ItemClick (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,446);
if (RapidSub.canDelegate("spinnercat_itemclick")) return searchact.remoteMe.runUserSub(false, "searchact","spinnercat_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 446;BA.debugLine="Sub SpinnerCat_ItemClick (Position As Int, Value A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 448;BA.debugLine="Select Value";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_value,RemoteObject.createImmutable(("دسته بندی نشده")),RemoteObject.createImmutable(("رسمی")),RemoteObject.createImmutable(("علمی")),RemoteObject.createImmutable(("آموزش-تحصیلی")),RemoteObject.createImmutable(("طنز و سرگرمی")),RemoteObject.createImmutable(("اجتماعی-خبری")),RemoteObject.createImmutable(("پزشکی-سلامت")),RemoteObject.createImmutable(("دوستان شخصی")),RemoteObject.createImmutable(("تجاری")),RemoteObject.createImmutable(("ادبی-هنری")),RemoteObject.createImmutable(("عشق-دلنوشته")),RemoteObject.createImmutable(("اعتقادی")),RemoteObject.createImmutable(("شرکت ها-دفتر ها")),RemoteObject.createImmutable(("مشاغل و صنفی")),RemoteObject.createImmutable(("ورزشی")),RemoteObject.createImmutable(("مد و زیبایی")))) {
case 0: {
 BA.debugLineNum = 450;BA.debugLine="selectedCat =1";
Debug.ShouldStop(2);
searchact._selectedcat = BA.numberCast(int.class, 1);
 break; }
case 1: {
 BA.debugLineNum = 452;BA.debugLine="selectedCat =2";
Debug.ShouldStop(8);
searchact._selectedcat = BA.numberCast(int.class, 2);
 break; }
case 2: {
 BA.debugLineNum = 454;BA.debugLine="selectedCat =3";
Debug.ShouldStop(32);
searchact._selectedcat = BA.numberCast(int.class, 3);
 break; }
case 3: {
 BA.debugLineNum = 456;BA.debugLine="selectedCat =4";
Debug.ShouldStop(128);
searchact._selectedcat = BA.numberCast(int.class, 4);
 break; }
case 4: {
 BA.debugLineNum = 458;BA.debugLine="selectedCat =5";
Debug.ShouldStop(512);
searchact._selectedcat = BA.numberCast(int.class, 5);
 break; }
case 5: {
 BA.debugLineNum = 460;BA.debugLine="selectedCat =6";
Debug.ShouldStop(2048);
searchact._selectedcat = BA.numberCast(int.class, 6);
 break; }
case 6: {
 BA.debugLineNum = 462;BA.debugLine="selectedCat =7";
Debug.ShouldStop(8192);
searchact._selectedcat = BA.numberCast(int.class, 7);
 break; }
case 7: {
 BA.debugLineNum = 464;BA.debugLine="selectedCat =8";
Debug.ShouldStop(32768);
searchact._selectedcat = BA.numberCast(int.class, 8);
 break; }
case 8: {
 BA.debugLineNum = 466;BA.debugLine="selectedCat =9";
Debug.ShouldStop(131072);
searchact._selectedcat = BA.numberCast(int.class, 9);
 break; }
case 9: {
 BA.debugLineNum = 468;BA.debugLine="selectedCat =10";
Debug.ShouldStop(524288);
searchact._selectedcat = BA.numberCast(int.class, 10);
 break; }
case 10: {
 BA.debugLineNum = 470;BA.debugLine="selectedCat =11";
Debug.ShouldStop(2097152);
searchact._selectedcat = BA.numberCast(int.class, 11);
 break; }
case 11: {
 BA.debugLineNum = 472;BA.debugLine="selectedCat =12";
Debug.ShouldStop(8388608);
searchact._selectedcat = BA.numberCast(int.class, 12);
 break; }
case 12: {
 BA.debugLineNum = 474;BA.debugLine="selectedCat =13";
Debug.ShouldStop(33554432);
searchact._selectedcat = BA.numberCast(int.class, 13);
 break; }
case 13: {
 BA.debugLineNum = 476;BA.debugLine="selectedCat =14";
Debug.ShouldStop(134217728);
searchact._selectedcat = BA.numberCast(int.class, 14);
 break; }
case 14: {
 BA.debugLineNum = 478;BA.debugLine="selectedCat =15";
Debug.ShouldStop(536870912);
searchact._selectedcat = BA.numberCast(int.class, 15);
 break; }
case 15: {
 BA.debugLineNum = 480;BA.debugLine="selectedCat =16";
Debug.ShouldStop(-2147483648);
searchact._selectedcat = BA.numberCast(int.class, 16);
 break; }
}
;
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinnerostan_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerOstan_ItemClick (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,343);
if (RapidSub.canDelegate("spinnerostan_itemclick")) return searchact.remoteMe.runUserSub(false, "searchact","spinnerostan_itemclick", _position, _value);
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _row = RemoteObject.declareNull("Object");
RemoteObject _column = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 343;BA.debugLine="Sub SpinnerOstan_ItemClick (Position As Int, Value";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="SpinnerShahr.Clear()";
Debug.ShouldStop(8388608);
searchact.mostCurrent._spinnershahr.runVoidMethod ("Clear");
 BA.debugLineNum = 346;BA.debugLine="selectedOstan =0";
Debug.ShouldStop(33554432);
searchact._selectedostan = BA.numberCast(int.class, 0);
 BA.debugLineNum = 347;BA.debugLine="Dim v As String";
Debug.ShouldStop(67108864);
_v = RemoteObject.createImmutable("");Debug.locals.put("v", _v);
 BA.debugLineNum = 348;BA.debugLine="v= Value";
Debug.ShouldStop(134217728);
_v = BA.ObjectToString(_value);Debug.locals.put("v", _v);
 BA.debugLineNum = 349;BA.debugLine="Select v";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_v,BA.ObjectToString("آذربايجان شرقي"),BA.ObjectToString("آذربايجان غربي"),BA.ObjectToString("اردبيل"),BA.ObjectToString("اصفهان"),BA.ObjectToString("ايلام"),BA.ObjectToString("بوشهر"),BA.ObjectToString("تهران"),BA.ObjectToString("چهارمحال وبختياري"),BA.ObjectToString("خراسان جنوبي"),BA.ObjectToString("خراسان رضوي"),BA.ObjectToString("خراسان شمالي"),BA.ObjectToString("خوزستان"),BA.ObjectToString("زنجان"),BA.ObjectToString("سمنان"),BA.ObjectToString("سيستان و بلوچستان"),BA.ObjectToString("فارس"),BA.ObjectToString("قزوين"),BA.ObjectToString("قم"),BA.ObjectToString("كردستان"),BA.ObjectToString("كرمان"),BA.ObjectToString("كرمانشاه"),BA.ObjectToString("كهگيلويه وبوير احمد"),BA.ObjectToString("گلستان"),BA.ObjectToString("گيلان"),BA.ObjectToString("لرستان"),BA.ObjectToString("مازندران"),BA.ObjectToString("مركزي"),BA.ObjectToString("هرمزگان"),BA.ObjectToString("همدان"),BA.ObjectToString("يزد"))) {
case 0: {
 BA.debugLineNum = 351;BA.debugLine="selectedOstan =1";
Debug.ShouldStop(1073741824);
searchact._selectedostan = BA.numberCast(int.class, 1);
 break; }
case 1: {
 BA.debugLineNum = 353;BA.debugLine="selectedOstan =2";
Debug.ShouldStop(1);
searchact._selectedostan = BA.numberCast(int.class, 2);
 break; }
case 2: {
 BA.debugLineNum = 355;BA.debugLine="selectedOstan =3";
Debug.ShouldStop(4);
searchact._selectedostan = BA.numberCast(int.class, 3);
 break; }
case 3: {
 BA.debugLineNum = 357;BA.debugLine="selectedOstan =4";
Debug.ShouldStop(16);
searchact._selectedostan = BA.numberCast(int.class, 4);
 break; }
case 4: {
 BA.debugLineNum = 359;BA.debugLine="selectedOstan =5";
Debug.ShouldStop(64);
searchact._selectedostan = BA.numberCast(int.class, 5);
 break; }
case 5: {
 BA.debugLineNum = 361;BA.debugLine="selectedOstan =6";
Debug.ShouldStop(256);
searchact._selectedostan = BA.numberCast(int.class, 6);
 break; }
case 6: {
 BA.debugLineNum = 363;BA.debugLine="selectedOstan =7";
Debug.ShouldStop(1024);
searchact._selectedostan = BA.numberCast(int.class, 7);
 break; }
case 7: {
 BA.debugLineNum = 365;BA.debugLine="selectedOstan =8";
Debug.ShouldStop(4096);
searchact._selectedostan = BA.numberCast(int.class, 8);
 break; }
case 8: {
 BA.debugLineNum = 367;BA.debugLine="selectedOstan =9";
Debug.ShouldStop(16384);
searchact._selectedostan = BA.numberCast(int.class, 9);
 break; }
case 9: {
 BA.debugLineNum = 369;BA.debugLine="selectedOstan =10";
Debug.ShouldStop(65536);
searchact._selectedostan = BA.numberCast(int.class, 10);
 break; }
case 10: {
 BA.debugLineNum = 371;BA.debugLine="selectedOstan =11";
Debug.ShouldStop(262144);
searchact._selectedostan = BA.numberCast(int.class, 11);
 break; }
case 11: {
 BA.debugLineNum = 373;BA.debugLine="selectedOstan =12";
Debug.ShouldStop(1048576);
searchact._selectedostan = BA.numberCast(int.class, 12);
 break; }
case 12: {
 BA.debugLineNum = 375;BA.debugLine="selectedOstan =13";
Debug.ShouldStop(4194304);
searchact._selectedostan = BA.numberCast(int.class, 13);
 break; }
case 13: {
 BA.debugLineNum = 377;BA.debugLine="selectedOstan =14";
Debug.ShouldStop(16777216);
searchact._selectedostan = BA.numberCast(int.class, 14);
 break; }
case 14: {
 BA.debugLineNum = 379;BA.debugLine="selectedOstan =15";
Debug.ShouldStop(67108864);
searchact._selectedostan = BA.numberCast(int.class, 15);
 break; }
case 15: {
 BA.debugLineNum = 381;BA.debugLine="selectedOstan =17";
Debug.ShouldStop(268435456);
searchact._selectedostan = BA.numberCast(int.class, 17);
 break; }
case 16: {
 BA.debugLineNum = 383;BA.debugLine="selectedOstan =18";
Debug.ShouldStop(1073741824);
searchact._selectedostan = BA.numberCast(int.class, 18);
 break; }
case 17: {
 BA.debugLineNum = 385;BA.debugLine="selectedOstan =19";
Debug.ShouldStop(1);
searchact._selectedostan = BA.numberCast(int.class, 19);
 break; }
case 18: {
 BA.debugLineNum = 387;BA.debugLine="selectedOstan =20";
Debug.ShouldStop(4);
searchact._selectedostan = BA.numberCast(int.class, 20);
 break; }
case 19: {
 BA.debugLineNum = 389;BA.debugLine="selectedOstan =21";
Debug.ShouldStop(16);
searchact._selectedostan = BA.numberCast(int.class, 21);
 break; }
case 20: {
 BA.debugLineNum = 391;BA.debugLine="selectedOstan =22";
Debug.ShouldStop(64);
searchact._selectedostan = BA.numberCast(int.class, 22);
 break; }
case 21: {
 BA.debugLineNum = 393;BA.debugLine="selectedOstan =23";
Debug.ShouldStop(256);
searchact._selectedostan = BA.numberCast(int.class, 23);
 break; }
case 22: {
 BA.debugLineNum = 395;BA.debugLine="selectedOstan =24";
Debug.ShouldStop(1024);
searchact._selectedostan = BA.numberCast(int.class, 24);
 break; }
case 23: {
 BA.debugLineNum = 397;BA.debugLine="selectedOstan =25";
Debug.ShouldStop(4096);
searchact._selectedostan = BA.numberCast(int.class, 25);
 break; }
case 24: {
 BA.debugLineNum = 399;BA.debugLine="selectedOstan =26";
Debug.ShouldStop(16384);
searchact._selectedostan = BA.numberCast(int.class, 26);
 break; }
case 25: {
 BA.debugLineNum = 401;BA.debugLine="selectedOstan =27";
Debug.ShouldStop(65536);
searchact._selectedostan = BA.numberCast(int.class, 27);
 break; }
case 26: {
 BA.debugLineNum = 403;BA.debugLine="selectedOstan =28";
Debug.ShouldStop(262144);
searchact._selectedostan = BA.numberCast(int.class, 28);
 break; }
case 27: {
 BA.debugLineNum = 405;BA.debugLine="selectedOstan =29";
Debug.ShouldStop(1048576);
searchact._selectedostan = BA.numberCast(int.class, 29);
 break; }
case 28: {
 BA.debugLineNum = 407;BA.debugLine="selectedOstan =30";
Debug.ShouldStop(4194304);
searchact._selectedostan = BA.numberCast(int.class, 30);
 break; }
case 29: {
 BA.debugLineNum = 409;BA.debugLine="selectedOstan =31";
Debug.ShouldStop(16777216);
searchact._selectedostan = BA.numberCast(int.class, 31);
 break; }
}
;
 BA.debugLineNum = 413;BA.debugLine="Dim txt As String";
Debug.ShouldStop(268435456);
_txt = RemoteObject.createImmutable("");Debug.locals.put("txt", _txt);
 BA.debugLineNum = 415;BA.debugLine="txt = \"SELECT id, name  FROM \" & Main.DBTableName";
Debug.ShouldStop(1073741824);
_txt = RemoteObject.concat(RemoteObject.createImmutable("SELECT id, name  FROM "),searchact.mostCurrent._main._dbtablename,RemoteObject.createImmutable(" where ostan_id = "),searchact._selectedostan);Debug.locals.put("txt", _txt);
 BA.debugLineNum = 417;BA.debugLine="Dim result As List";
Debug.ShouldStop(1);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 418;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt";
Debug.ShouldStop(2);
_result = searchact.mostCurrent._dbutils.runMethod(false,"_executememorytable",searchact.mostCurrent.activityBA,(Object)(searchact.mostCurrent._main._sql1),(Object)(_txt),(Object)((searchact.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("result", _result);
 BA.debugLineNum = 420;BA.debugLine="For i =  0 To result.Size-1";
Debug.ShouldStop(8);
{
final int step71 = 1;
final int limit71 = RemoteObject.solve(new RemoteObject[] {_result.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step71 > 0 && _i <= limit71) || (step71 < 0 && _i >= limit71); _i = ((int)(0 + _i + step71)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 421;BA.debugLine="Dim row As Object";
Debug.ShouldStop(16);
_row = RemoteObject.createNew ("Object");Debug.locals.put("row", _row);
 BA.debugLineNum = 422;BA.debugLine="Dim column() As String";
Debug.ShouldStop(32);
_column = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("column", _column);
 BA.debugLineNum = 423;BA.debugLine="row = result.Get(i)";
Debug.ShouldStop(64);
_row = _result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("row", _row);
 BA.debugLineNum = 424;BA.debugLine="column = row";
Debug.ShouldStop(128);
_column = (_row);Debug.locals.put("column", _column);
 BA.debugLineNum = 425;BA.debugLine="SpinnerShahr.Add(column(1))";
Debug.ShouldStop(256);
searchact.mostCurrent._spinnershahr.runVoidMethod ("Add",(Object)(_column.getArrayElement(true,BA.numberCast(int.class, 1))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 427;BA.debugLine="End Sub";
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
public static RemoteObject  _spinnershahr_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerShahr_ItemClick (searchact) ","searchact",10,searchact.mostCurrent.activityBA,searchact.mostCurrent,428);
if (RapidSub.canDelegate("spinnershahr_itemclick")) return searchact.remoteMe.runUserSub(false, "searchact","spinnershahr_itemclick", _position, _value);
RemoteObject _txt = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("Object");
RemoteObject _column = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 428;BA.debugLine="Sub SpinnerShahr_ItemClick (Position As Int, Value";
Debug.ShouldStop(2048);
 BA.debugLineNum = 430;BA.debugLine="Dim txt As String";
Debug.ShouldStop(8192);
_txt = RemoteObject.createImmutable("");Debug.locals.put("txt", _txt);
 BA.debugLineNum = 432;BA.debugLine="txt = \"SELECT   id  FROM \" & Main.DBTableName & \"";
Debug.ShouldStop(32768);
_txt = RemoteObject.concat(RemoteObject.createImmutable("SELECT   id  FROM "),searchact.mostCurrent._main._dbtablename,RemoteObject.createImmutable(" where name = '"),_value,RemoteObject.createImmutable("'"));Debug.locals.put("txt", _txt);
 BA.debugLineNum = 434;BA.debugLine="Dim result As List";
Debug.ShouldStop(131072);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 435;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt";
Debug.ShouldStop(262144);
_result = searchact.mostCurrent._dbutils.runMethod(false,"_executememorytable",searchact.mostCurrent.activityBA,(Object)(searchact.mostCurrent._main._sql1),(Object)(_txt),(Object)((searchact.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("result", _result);
 BA.debugLineNum = 438;BA.debugLine="Dim row As Object";
Debug.ShouldStop(2097152);
_row = RemoteObject.createNew ("Object");Debug.locals.put("row", _row);
 BA.debugLineNum = 439;BA.debugLine="Dim column() As String";
Debug.ShouldStop(4194304);
_column = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("column", _column);
 BA.debugLineNum = 440;BA.debugLine="row = result.Get(0)";
Debug.ShouldStop(8388608);
_row = _result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("row", _row);
 BA.debugLineNum = 441;BA.debugLine="column = row";
Debug.ShouldStop(16777216);
_column = (_row);Debug.locals.put("column", _column);
 BA.debugLineNum = 442;BA.debugLine="selectedShahr = column(0)";
Debug.ShouldStop(33554432);
searchact._selectedshahr = BA.numberCast(int.class, _column.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 444;BA.debugLine="End Sub";
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
}