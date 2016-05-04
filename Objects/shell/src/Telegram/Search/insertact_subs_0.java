package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class insertact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,71);
if (RapidSub.canDelegate("activity_create")) return insertact.remoteMe.runUserSub(false, "insertact","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 74;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
Debug.ShouldStop(512);
insertact.mostCurrent._navi.runVoidMethod ("Initialize2",insertact.mostCurrent.activityBA,(Object)(BA.ObjectToString("navi")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), insertact.mostCurrent._activity.getObject()),(Object)(insertact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),insertact.mostCurrent.activityBA)),(Object)(insertact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 76;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
Debug.ShouldStop(2048);
insertact.mostCurrent._navi.runMethod(false,"getNavigationPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menu")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 78;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(8192);
insertact.mostCurrent._pcantent.runVoidMethod ("Initialize",insertact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 79;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
Debug.ShouldStop(16384);
insertact.mostCurrent._navi.runMethod(false,"getContentPanel").runVoidMethod ("AddView",(Object)((insertact.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(insertact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),insertact.mostCurrent.activityBA)),(Object)(insertact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),insertact.mostCurrent.activityBA)));
 BA.debugLineNum = 81;BA.debugLine="pCantent.LoadLayout(\"insertview\")";
Debug.ShouldStop(65536);
insertact.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("insertview")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 82;BA.debugLine="pCantent.SendToBack";
Debug.ShouldStop(131072);
insertact.mostCurrent._pcantent.runVoidMethod ("SendToBack");
 BA.debugLineNum = 85;BA.debugLine="btnInsert.TextSize= 15";
Debug.ShouldStop(1048576);
insertact.mostCurrent._btninsert.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 86;BA.debugLine="btnInsert.Gravity= Gravity.CENTER";
Debug.ShouldStop(2097152);
insertact.mostCurrent._btninsert.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 87;BA.debugLine="btnInsert.Typeface=Main.font";
Debug.ShouldStop(4194304);
insertact.mostCurrent._btninsert.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 89;BA.debugLine="LabelName.TextSize= 15";
Debug.ShouldStop(16777216);
insertact.mostCurrent._labelname.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 90;BA.debugLine="LabelName.Gravity= Gravity.RIGHT";
Debug.ShouldStop(33554432);
insertact.mostCurrent._labelname.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 91;BA.debugLine="LabelName.Typeface=Main.font";
Debug.ShouldStop(67108864);
insertact.mostCurrent._labelname.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 93;BA.debugLine="txtName.TextSize=15";
Debug.ShouldStop(268435456);
insertact.mostCurrent._txtname.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 94;BA.debugLine="txtName.Gravity=Gravity.RIGHT";
Debug.ShouldStop(536870912);
insertact.mostCurrent._txtname.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 95;BA.debugLine="txtName.Typeface=Main.font";
Debug.ShouldStop(1073741824);
insertact.mostCurrent._txtname.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 96;BA.debugLine="txtName.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(-2147483648);
insertact.mostCurrent._txtname.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 98;BA.debugLine="LabelDesc.TextSize= 15";
Debug.ShouldStop(2);
insertact.mostCurrent._labeldesc.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 99;BA.debugLine="LabelDesc.Gravity= Gravity.RIGHT";
Debug.ShouldStop(4);
insertact.mostCurrent._labeldesc.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 100;BA.debugLine="LabelDesc.Typeface=Main.font";
Debug.ShouldStop(8);
insertact.mostCurrent._labeldesc.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 101;BA.debugLine="txtDescription.TextSize=15";
Debug.ShouldStop(16);
insertact.mostCurrent._txtdescription.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 102;BA.debugLine="txtDescription.Gravity=Gravity.RIGHT";
Debug.ShouldStop(32);
insertact.mostCurrent._txtdescription.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 103;BA.debugLine="txtDescription.Typeface=Main.font";
Debug.ShouldStop(64);
insertact.mostCurrent._txtdescription.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 104;BA.debugLine="txtDescription.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(128);
insertact.mostCurrent._txtdescription.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 106;BA.debugLine="LabelAddress.TextSize= 15";
Debug.ShouldStop(512);
insertact.mostCurrent._labeladdress.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 107;BA.debugLine="LabelAddress.Gravity= Gravity.RIGHT";
Debug.ShouldStop(1024);
insertact.mostCurrent._labeladdress.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 108;BA.debugLine="LabelAddress.Typeface=Main.font";
Debug.ShouldStop(2048);
insertact.mostCurrent._labeladdress.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 109;BA.debugLine="txtAddress.TextSize=15";
Debug.ShouldStop(4096);
insertact.mostCurrent._txtaddress.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 110;BA.debugLine="txtAddress.Gravity=Gravity.RIGHT";
Debug.ShouldStop(8192);
insertact.mostCurrent._txtaddress.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 111;BA.debugLine="txtAddress.Typeface=Main.font";
Debug.ShouldStop(16384);
insertact.mostCurrent._txtaddress.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 112;BA.debugLine="txtAddress.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(32768);
insertact.mostCurrent._txtaddress.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 114;BA.debugLine="Label10.TextSize= 15";
Debug.ShouldStop(131072);
insertact.mostCurrent._label10.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 115;BA.debugLine="Label10.Gravity= Gravity.RIGHT";
Debug.ShouldStop(262144);
insertact.mostCurrent._label10.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 116;BA.debugLine="Label10.Typeface=Main.font";
Debug.ShouldStop(524288);
insertact.mostCurrent._label10.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 117;BA.debugLine="txtTag.TextSize=15";
Debug.ShouldStop(1048576);
insertact.mostCurrent._txttag.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 118;BA.debugLine="txtTag.Gravity=Gravity.RIGHT";
Debug.ShouldStop(2097152);
insertact.mostCurrent._txttag.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 119;BA.debugLine="txtTag.Typeface=Main.font";
Debug.ShouldStop(4194304);
insertact.mostCurrent._txttag.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 120;BA.debugLine="txtTag.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(8388608);
insertact.mostCurrent._txttag.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 122;BA.debugLine="Label6.TextSize= 15";
Debug.ShouldStop(33554432);
insertact.mostCurrent._label6.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 123;BA.debugLine="Label6.Gravity= Gravity.RIGHT";
Debug.ShouldStop(67108864);
insertact.mostCurrent._label6.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 124;BA.debugLine="Label6.Typeface=Main.font";
Debug.ShouldStop(134217728);
insertact.mostCurrent._label6.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 133;BA.debugLine="SpinnerCat.TextColor =Colors.Black";
Debug.ShouldStop(16);
insertact.mostCurrent._spinnercat.runMethod(true,"setTextColor",insertact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 134;BA.debugLine="SpinnerOstan.TextColor =Colors.Black";
Debug.ShouldStop(32);
insertact.mostCurrent._spinnerostan.runMethod(true,"setTextColor",insertact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 135;BA.debugLine="SpinnerShahr.TextColor =Colors.Black";
Debug.ShouldStop(64);
insertact.mostCurrent._spinnershahr.runMethod(true,"setTextColor",insertact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 137;BA.debugLine="SpinnerCat.DropdownTextColor =Colors.White";
Debug.ShouldStop(256);
insertact.mostCurrent._spinnercat.runMethod(true,"setDropdownTextColor",insertact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 138;BA.debugLine="SpinnerOstan.DropdownTextColor =Colors.White";
Debug.ShouldStop(512);
insertact.mostCurrent._spinnerostan.runMethod(true,"setDropdownTextColor",insertact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 139;BA.debugLine="SpinnerShahr.DropdownTextColor =Colors.White";
Debug.ShouldStop(1024);
insertact.mostCurrent._spinnershahr.runMethod(true,"setDropdownTextColor",insertact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 142;BA.debugLine="Label7.TextSize= 15";
Debug.ShouldStop(8192);
insertact.mostCurrent._label7.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 143;BA.debugLine="Label7.Gravity= Gravity.RIGHT";
Debug.ShouldStop(16384);
insertact.mostCurrent._label7.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 144;BA.debugLine="Label7.Typeface=Main.font";
Debug.ShouldStop(32768);
insertact.mostCurrent._label7.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 147;BA.debugLine="Label8.TextSize= 15";
Debug.ShouldStop(262144);
insertact.mostCurrent._label8.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 148;BA.debugLine="Label8.Gravity= Gravity.RIGHT";
Debug.ShouldStop(524288);
insertact.mostCurrent._label8.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 149;BA.debugLine="Label8.Typeface=Main.font";
Debug.ShouldStop(1048576);
insertact.mostCurrent._label8.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 151;BA.debugLine="Label9.TextSize= 15";
Debug.ShouldStop(4194304);
insertact.mostCurrent._label9.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 152;BA.debugLine="Label9.Gravity= Gravity.RIGHT";
Debug.ShouldStop(8388608);
insertact.mostCurrent._label9.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 153;BA.debugLine="Label9.Typeface=Main.font";
Debug.ShouldStop(16777216);
insertact.mostCurrent._label9.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 154;BA.debugLine="txtAdmin.TextSize=15";
Debug.ShouldStop(33554432);
insertact.mostCurrent._txtadmin.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 155;BA.debugLine="txtAdmin.Gravity=Gravity.RIGHT";
Debug.ShouldStop(67108864);
insertact.mostCurrent._txtadmin.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 156;BA.debugLine="txtAdmin.Typeface=Main.font";
Debug.ShouldStop(134217728);
insertact.mostCurrent._txtadmin.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 157;BA.debugLine="txtAdmin.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(268435456);
insertact.mostCurrent._txtadmin.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 159;BA.debugLine="EditMemberCount.TextSize=15";
Debug.ShouldStop(1073741824);
insertact.mostCurrent._editmembercount.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 160;BA.debugLine="EditMemberCount.Gravity=Gravity.RIGHT";
Debug.ShouldStop(-2147483648);
insertact.mostCurrent._editmembercount.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 161;BA.debugLine="EditMemberCount.Typeface=Main.font";
Debug.ShouldStop(1);
insertact.mostCurrent._editmembercount.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 162;BA.debugLine="EditMemberCount.Color=Colors.RGB(179,229,252)";
Debug.ShouldStop(2);
insertact.mostCurrent._editmembercount.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 179)),(Object)(BA.numberCast(int.class, 229)),(Object)(BA.numberCast(int.class, 252))));
 BA.debugLineNum = 164;BA.debugLine="Select Main.selectedType";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(insertact.mostCurrent._main._selectedtype,BA.ObjectToString("group"),BA.ObjectToString("id"),BA.ObjectToString("sticker"),BA.ObjectToString("robot"),BA.ObjectToString("channel"),BA.ObjectToString("ads"),BA.ObjectToString("order"))) {
case 0: {
 BA.debugLineNum = 167;BA.debugLine="LabelName.Text = \"اسم گروه:\"";
Debug.ShouldStop(64);
insertact.mostCurrent._labelname.runMethod(true,"setText",RemoteObject.createImmutable(("اسم گروه:")));
 BA.debugLineNum = 169;BA.debugLine="LabelDesc.Text=\"متن کوتاه درباره گروه:\"";
Debug.ShouldStop(256);
insertact.mostCurrent._labeldesc.runMethod(true,"setText",RemoteObject.createImmutable(("متن کوتاه درباره گروه:")));
 BA.debugLineNum = 170;BA.debugLine="LabelAddress.Text=\"آدرس گروه :  شبیه(https://te";
Debug.ShouldStop(512);
insertact.mostCurrent._labeladdress.runMethod(true,"setText",RemoteObject.createImmutable(("آدرس گروه :  شبیه(https://telegram.me/joinchat/xasdsw) آدرس های غیر این باز نمی شوند")));
 BA.debugLineNum = 171;BA.debugLine="Label9.Text =\"موبایل یا آی دی ادمین\"";
Debug.ShouldStop(1024);
insertact.mostCurrent._label9.runMethod(true,"setText",RemoteObject.createImmutable(("موبایل یا آی دی ادمین")));
 BA.debugLineNum = 172;BA.debugLine="btnInsert.Text=\"ثبت گروه\"";
Debug.ShouldStop(2048);
insertact.mostCurrent._btninsert.runMethod(true,"setText",RemoteObject.createImmutable(("ثبت گروه")));
 break; }
case 1: {
 BA.debugLineNum = 174;BA.debugLine="LabelName.Text = \"نام :\"";
Debug.ShouldStop(8192);
insertact.mostCurrent._labelname.runMethod(true,"setText",RemoteObject.createImmutable(("نام :")));
 BA.debugLineNum = 175;BA.debugLine="LabelDesc.Text=\"متن کوتاه درباره خودتون:\"";
Debug.ShouldStop(16384);
insertact.mostCurrent._labeldesc.runMethod(true,"setText",RemoteObject.createImmutable(("متن کوتاه درباره خودتون:")));
 BA.debugLineNum = 176;BA.debugLine="LabelAddress.Text=\"آی دی تلگرام :  شبیه(https:/";
Debug.ShouldStop(32768);
insertact.mostCurrent._labeladdress.runMethod(true,"setText",RemoteObject.createImmutable(("آی دی تلگرام :  شبیه(https://telegram.me/nasservb) یا @nasservb")));
 BA.debugLineNum = 177;BA.debugLine="Label9.Text =\"موبایل یا آی دی ادمین\"";
Debug.ShouldStop(65536);
insertact.mostCurrent._label9.runMethod(true,"setText",RemoteObject.createImmutable(("موبایل یا آی دی ادمین")));
 BA.debugLineNum = 178;BA.debugLine="btnInsert.Text=\"ثبت آی دی\"";
Debug.ShouldStop(131072);
insertact.mostCurrent._btninsert.runMethod(true,"setText",RemoteObject.createImmutable(("ثبت آی دی")));
 break; }
case 2: {
 BA.debugLineNum = 180;BA.debugLine="LabelName.Text = \"عنوان :\"";
Debug.ShouldStop(524288);
insertact.mostCurrent._labelname.runMethod(true,"setText",RemoteObject.createImmutable(("عنوان :")));
 BA.debugLineNum = 181;BA.debugLine="LabelDesc.Text=\"توضیح کوتاه :\"";
Debug.ShouldStop(1048576);
insertact.mostCurrent._labeldesc.runMethod(true,"setText",RemoteObject.createImmutable(("توضیح کوتاه :")));
 BA.debugLineNum = 182;BA.debugLine="LabelAddress.Text=\"آدرس تلگرام:  شبیه(https://t";
Debug.ShouldStop(2097152);
insertact.mostCurrent._labeladdress.runMethod(true,"setText",RemoteObject.createImmutable(("آدرس تلگرام:  شبیه(https://telegram.me/addstickers/ziba)  یا @ziba")));
 BA.debugLineNum = 183;BA.debugLine="Label9.Text =\"موبایل یا آی دی سازنده \"";
Debug.ShouldStop(4194304);
insertact.mostCurrent._label9.runMethod(true,"setText",RemoteObject.createImmutable(("موبایل یا آی دی سازنده ")));
 BA.debugLineNum = 184;BA.debugLine="btnInsert.Text=\"ثبت استیکر\"";
Debug.ShouldStop(8388608);
insertact.mostCurrent._btninsert.runMethod(true,"setText",RemoteObject.createImmutable(("ثبت استیکر")));
 break; }
case 3: {
 BA.debugLineNum = 186;BA.debugLine="LabelName.Text = \"عنوان :\"";
Debug.ShouldStop(33554432);
insertact.mostCurrent._labelname.runMethod(true,"setText",RemoteObject.createImmutable(("عنوان :")));
 BA.debugLineNum = 187;BA.debugLine="LabelDesc.Text=\"توضیح کوتاه :\"";
Debug.ShouldStop(67108864);
insertact.mostCurrent._labeldesc.runMethod(true,"setText",RemoteObject.createImmutable(("توضیح کوتاه :")));
 BA.debugLineNum = 188;BA.debugLine="LabelAddress.Text=\"آدرس تلگرام:  شبیه(https://t";
Debug.ShouldStop(134217728);
insertact.mostCurrent._labeladdress.runMethod(true,"setText",RemoteObject.createImmutable(("آدرس تلگرام:  شبیه(https://telegram.me/bot_gard) یا @bot_gard")));
 BA.debugLineNum = 189;BA.debugLine="Label9.Text =\"موبایل یا آی دی سازنده\"";
Debug.ShouldStop(268435456);
insertact.mostCurrent._label9.runMethod(true,"setText",RemoteObject.createImmutable(("موبایل یا آی دی سازنده")));
 BA.debugLineNum = 190;BA.debugLine="btnInsert.Text=\"ثبت ربات\"";
Debug.ShouldStop(536870912);
insertact.mostCurrent._btninsert.runMethod(true,"setText",RemoteObject.createImmutable(("ثبت ربات")));
 break; }
case 4: {
 BA.debugLineNum = 193;BA.debugLine="LabelName.Text = \"عنوان :\"";
Debug.ShouldStop(1);
insertact.mostCurrent._labelname.runMethod(true,"setText",RemoteObject.createImmutable(("عنوان :")));
 BA.debugLineNum = 194;BA.debugLine="LabelDesc.Text=\"توضیح کوتاه :\"";
Debug.ShouldStop(2);
insertact.mostCurrent._labeldesc.runMethod(true,"setText",RemoteObject.createImmutable(("توضیح کوتاه :")));
 BA.debugLineNum = 195;BA.debugLine="LabelAddress.Text=\"آدرس تلگرام:  شبیه(https://t";
Debug.ShouldStop(4);
insertact.mostCurrent._labeladdress.runMethod(true,"setText",RemoteObject.createImmutable(("آدرس تلگرام:  شبیه(https://telegram.me/mamadar_ir)  یا @mamadar_ir . ")));
 BA.debugLineNum = 196;BA.debugLine="Label9.Text =\"موبایل یا آی دی ادمین\"";
Debug.ShouldStop(8);
insertact.mostCurrent._label9.runMethod(true,"setText",RemoteObject.createImmutable(("موبایل یا آی دی ادمین")));
 BA.debugLineNum = 197;BA.debugLine="btnInsert.Text=\"ثبت کانال\"";
Debug.ShouldStop(16);
insertact.mostCurrent._btninsert.runMethod(true,"setText",RemoteObject.createImmutable(("ثبت کانال")));
 break; }
case 5: {
 BA.debugLineNum = 199;BA.debugLine="LabelName.Text = \"عنوان تبلیغ:\"";
Debug.ShouldStop(64);
insertact.mostCurrent._labelname.runMethod(true,"setText",RemoteObject.createImmutable(("عنوان تبلیغ:")));
 BA.debugLineNum = 200;BA.debugLine="LabelDesc.Text=\"توضیح کوتاه :\"";
Debug.ShouldStop(128);
insertact.mostCurrent._labeldesc.runMethod(true,"setText",RemoteObject.createImmutable(("توضیح کوتاه :")));
 BA.debugLineNum = 201;BA.debugLine="LabelAddress.Text=\"آدرس :  شبیه(آدرس وب شبیه ht";
Debug.ShouldStop(256);
insertact.mostCurrent._labeladdress.runMethod(true,"setText",RemoteObject.createImmutable(("آدرس :  شبیه(آدرس وب شبیه http://)  یا (آدرس تلگرام شبیه @mamadar_ir ) ")));
 BA.debugLineNum = 202;BA.debugLine="Label9.Text =\"موبایل یا آی دی ادمین\"";
Debug.ShouldStop(512);
insertact.mostCurrent._label9.runMethod(true,"setText",RemoteObject.createImmutable(("موبایل یا آی دی ادمین")));
 BA.debugLineNum = 203;BA.debugLine="btnInsert.Text=\"ثبت و ادامه \"";
Debug.ShouldStop(1024);
insertact.mostCurrent._btninsert.runMethod(true,"setText",RemoteObject.createImmutable(("ثبت و ادامه ")));
 break; }
case 6: {
 BA.debugLineNum = 205;BA.debugLine="LabelName.Text = \"عنوان استیکر:\"";
Debug.ShouldStop(4096);
insertact.mostCurrent._labelname.runMethod(true,"setText",RemoteObject.createImmutable(("عنوان استیکر:")));
 BA.debugLineNum = 206;BA.debugLine="LabelDesc.Text=\"  - متن توضیح کوتاه :\"";
Debug.ShouldStop(8192);
insertact.mostCurrent._labeldesc.runMethod(true,"setText",RemoteObject.createImmutable(("  - متن توضیح کوتاه :")));
 BA.debugLineNum = 207;BA.debugLine="LabelAddress.Text=\"شماره استیکر های درخواستی- ا";
Debug.ShouldStop(16384);
insertact.mostCurrent._labeladdress.runMethod(true,"setText",RemoteObject.createImmutable(("شماره استیکر های درخواستی- از لیست استیکر های نمونه تهیه کنید 1-2-... ")));
 BA.debugLineNum = 208;BA.debugLine="Label9.Text =\"موبایل یا آی دی تلگرام برای تحویل";
Debug.ShouldStop(32768);
insertact.mostCurrent._label9.runMethod(true,"setText",RemoteObject.createImmutable(("موبایل یا آی دی تلگرام برای تحویل استیکر")));
 BA.debugLineNum = 209;BA.debugLine="btnInsert.Text=\"ثبت و ادامه \"";
Debug.ShouldStop(65536);
insertact.mostCurrent._btninsert.runMethod(true,"setText",RemoteObject.createImmutable(("ثبت و ادامه ")));
 break; }
}
;
 BA.debugLineNum = 213;BA.debugLine="Label5.TextSize= 15";
Debug.ShouldStop(1048576);
insertact.mostCurrent._label5.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 214;BA.debugLine="Label5.Gravity= Gravity.RIGHT";
Debug.ShouldStop(2097152);
insertact.mostCurrent._label5.runMethod(true,"setGravity",insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 215;BA.debugLine="Label5.Typeface=Main.font";
Debug.ShouldStop(4194304);
insertact.mostCurrent._label5.runMethod(false,"setTypeface",(insertact.mostCurrent._main._font.getObject()));
 BA.debugLineNum = 217;BA.debugLine="If Main.isEdit = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",insertact.mostCurrent._main._isedit,insertact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 218;BA.debugLine="Label5.Text  = \" ویرایش اطلاعات \"  & Main.select";
Debug.ShouldStop(33554432);
insertact.mostCurrent._label5.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(" ویرایش اطلاعات "),insertact.mostCurrent._main._selectedtypetitle)));
 BA.debugLineNum = 219;BA.debugLine="Activity.Title= \" ویرایش اطلاعات \"  & Main.selec";
Debug.ShouldStop(67108864);
insertact.mostCurrent._activity.runMethod(false,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable(" ویرایش اطلاعات "),insertact.mostCurrent._main._selectedtypetitle)));
 }else 
{ BA.debugLineNum = 221;BA.debugLine="Else If  Main.isSuperGroup=True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",insertact.mostCurrent._main._issupergroup,insertact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 224;BA.debugLine="Label5.Text =  \"    .تعداد مجوز باقیمانده  : \" _";
Debug.ShouldStop(-2147483648);
insertact.mostCurrent._label5.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("    .تعداد مجوز باقیمانده  : "),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),insertact.mostCurrent._main._vipinsertcount}, "-",1, 1)))));
 BA.debugLineNum = 226;BA.debugLine="Activity.Title= \"   ثبت اطلاعات سوپر گروه \"";
Debug.ShouldStop(2);
insertact.mostCurrent._activity.runMethod(false,"setTitle",RemoteObject.createImmutable(("   ثبت اطلاعات سوپر گروه ")));
 BA.debugLineNum = 228;BA.debugLine="Label4.Color =Colors.rgb(236,64,122)";
Debug.ShouldStop(8);
insertact.mostCurrent._label4.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 236)),(Object)(BA.numberCast(int.class, 64)),(Object)(BA.numberCast(int.class, 122))));
 }else {
 BA.debugLineNum = 231;BA.debugLine="Label5.Text  = \" ثبت اطلاعات \"  & Main.selectedT";
Debug.ShouldStop(64);
insertact.mostCurrent._label5.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(" ثبت اطلاعات "),insertact.mostCurrent._main._selectedtypetitle)));
 BA.debugLineNum = 232;BA.debugLine="Activity.Title= \" ثبت اطلاعات \"  & Main.selected";
Debug.ShouldStop(128);
insertact.mostCurrent._activity.runMethod(false,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable(" ثبت اطلاعات "),insertact.mostCurrent._main._selectedtypetitle)));
 }};
 BA.debugLineNum = 237;BA.debugLine="If(Main.selectedType <>  \"sticker\" And Main.selec";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("!",insertact.mostCurrent._main._selectedtype,BA.ObjectToString("sticker")) && RemoteObject.solveBoolean("!",insertact.mostCurrent._main._selectedtype,BA.ObjectToString("robot")) && RemoteObject.solveBoolean("!",insertact.mostCurrent._main._selectedtype,BA.ObjectToString("id")) && RemoteObject.solveBoolean("!",insertact.mostCurrent._main._selectedtype,RemoteObject.createImmutable("order")))) { 
 BA.debugLineNum = 240;BA.debugLine="Label7.Visible = True";
Debug.ShouldStop(32768);
insertact.mostCurrent._label7.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 241;BA.debugLine="SpinnerOstan.Visible= True";
Debug.ShouldStop(65536);
insertact.mostCurrent._spinnerostan.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 242;BA.debugLine="SpinnerShahr.Visible = True";
Debug.ShouldStop(131072);
insertact.mostCurrent._spinnershahr.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 245;BA.debugLine="SpinnerOstan.Add(\"آذربايجان شرقي\")";
Debug.ShouldStop(1048576);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آذربايجان شرقي")));
 BA.debugLineNum = 246;BA.debugLine="SpinnerOstan.Add(\"آذربايجان غربي\")";
Debug.ShouldStop(2097152);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آذربايجان غربي")));
 BA.debugLineNum = 247;BA.debugLine="SpinnerOstan.Add(\"اردبيل\")";
Debug.ShouldStop(4194304);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اردبيل")));
 BA.debugLineNum = 248;BA.debugLine="SpinnerOstan.Add(\"اصفهان\")";
Debug.ShouldStop(8388608);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اصفهان")));
 BA.debugLineNum = 249;BA.debugLine="SpinnerOstan.Add(\"ايلام\")";
Debug.ShouldStop(16777216);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("ايلام")));
 BA.debugLineNum = 250;BA.debugLine="SpinnerOstan.Add(\"بوشهر\")";
Debug.ShouldStop(33554432);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("بوشهر")));
 BA.debugLineNum = 251;BA.debugLine="SpinnerOstan.Add(\"تهران\")";
Debug.ShouldStop(67108864);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("تهران")));
 BA.debugLineNum = 252;BA.debugLine="SpinnerOstan.Add(\"چهارمحال وبختياري\")";
Debug.ShouldStop(134217728);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("چهارمحال وبختياري")));
 BA.debugLineNum = 253;BA.debugLine="SpinnerOstan.Add(\"خراسان جنوبي\")";
Debug.ShouldStop(268435456);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان جنوبي")));
 BA.debugLineNum = 254;BA.debugLine="SpinnerOstan.Add(\"خراسان رضوي\")";
Debug.ShouldStop(536870912);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان رضوي")));
 BA.debugLineNum = 255;BA.debugLine="SpinnerOstan.Add(\"خراسان شمالي\")";
Debug.ShouldStop(1073741824);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان شمالي")));
 BA.debugLineNum = 256;BA.debugLine="SpinnerOstan.Add(\"خوزستان\")";
Debug.ShouldStop(-2147483648);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خوزستان")));
 BA.debugLineNum = 257;BA.debugLine="SpinnerOstan.Add(\"زنجان\")";
Debug.ShouldStop(1);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("زنجان")));
 BA.debugLineNum = 258;BA.debugLine="SpinnerOstan.Add(\"سمنان\")";
Debug.ShouldStop(2);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سمنان")));
 BA.debugLineNum = 259;BA.debugLine="SpinnerOstan.Add(\"سيستان و بلوچستان\")";
Debug.ShouldStop(4);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سيستان و بلوچستان")));
 BA.debugLineNum = 260;BA.debugLine="SpinnerOstan.Add(\"فارس\")";
Debug.ShouldStop(8);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("فارس")));
 BA.debugLineNum = 261;BA.debugLine="SpinnerOstan.Add(\"قزوين\")";
Debug.ShouldStop(16);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("قزوين")));
 BA.debugLineNum = 262;BA.debugLine="SpinnerOstan.Add(\"قم\")";
Debug.ShouldStop(32);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("قم")));
 BA.debugLineNum = 263;BA.debugLine="SpinnerOstan.Add(\"كردستان\")";
Debug.ShouldStop(64);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كردستان")));
 BA.debugLineNum = 264;BA.debugLine="SpinnerOstan.Add(\"كرمان\")";
Debug.ShouldStop(128);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كرمان")));
 BA.debugLineNum = 265;BA.debugLine="SpinnerOstan.Add(\"كرمانشاه\")";
Debug.ShouldStop(256);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كرمانشاه")));
 BA.debugLineNum = 266;BA.debugLine="SpinnerOstan.Add(\"كهگيلويه وبوير احمد\")";
Debug.ShouldStop(512);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كهگيلويه وبوير احمد")));
 BA.debugLineNum = 267;BA.debugLine="SpinnerOstan.Add(\"گلستان\")";
Debug.ShouldStop(1024);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("گلستان")));
 BA.debugLineNum = 268;BA.debugLine="SpinnerOstan.Add(\"گيلان\")";
Debug.ShouldStop(2048);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("گيلان")));
 BA.debugLineNum = 269;BA.debugLine="SpinnerOstan.Add(\"لرستان\")";
Debug.ShouldStop(4096);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("لرستان")));
 BA.debugLineNum = 270;BA.debugLine="SpinnerOstan.Add(\"مازندران\")";
Debug.ShouldStop(8192);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مازندران")));
 BA.debugLineNum = 271;BA.debugLine="SpinnerOstan.Add(\"مركزي\")";
Debug.ShouldStop(16384);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مركزي")));
 BA.debugLineNum = 272;BA.debugLine="SpinnerOstan.Add(\"هرمزگان\")";
Debug.ShouldStop(32768);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("هرمزگان")));
 BA.debugLineNum = 273;BA.debugLine="SpinnerOstan.Add(\"همدان\")";
Debug.ShouldStop(65536);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همدان")));
 BA.debugLineNum = 274;BA.debugLine="SpinnerOstan.Add(\"يزد\")";
Debug.ShouldStop(131072);
insertact.mostCurrent._spinnerostan.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("يزد")));
 BA.debugLineNum = 277;BA.debugLine="SpinnerCat.Add(\"دسته بندی نشده\")";
Debug.ShouldStop(1048576);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("دسته بندی نشده")));
 BA.debugLineNum = 278;BA.debugLine="SpinnerCat.Add(\"رسمی\")";
Debug.ShouldStop(2097152);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("رسمی")));
 BA.debugLineNum = 279;BA.debugLine="SpinnerCat.Add(\"علمی\")";
Debug.ShouldStop(4194304);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("علمی")));
 BA.debugLineNum = 280;BA.debugLine="SpinnerCat.Add(\"آموزش-تحصیلی\")";
Debug.ShouldStop(8388608);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آموزش-تحصیلی")));
 BA.debugLineNum = 281;BA.debugLine="SpinnerCat.Add(\"طنز و سرگرمی\")";
Debug.ShouldStop(16777216);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("طنز و سرگرمی")));
 BA.debugLineNum = 282;BA.debugLine="SpinnerCat.Add(\"اجتماعی-خبری\")";
Debug.ShouldStop(33554432);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اجتماعی-خبری")));
 BA.debugLineNum = 283;BA.debugLine="SpinnerCat.Add(\"پزشکی-سلامت\")";
Debug.ShouldStop(67108864);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("پزشکی-سلامت")));
 BA.debugLineNum = 284;BA.debugLine="SpinnerCat.Add(\"دوستان شخصی\")";
Debug.ShouldStop(134217728);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("دوستان شخصی")));
 BA.debugLineNum = 285;BA.debugLine="SpinnerCat.Add(\"تجاری\")";
Debug.ShouldStop(268435456);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("تجاری")));
 BA.debugLineNum = 286;BA.debugLine="SpinnerCat.Add(\"ادبی-هنری\")";
Debug.ShouldStop(536870912);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("ادبی-هنری")));
 BA.debugLineNum = 287;BA.debugLine="SpinnerCat.Add(\"عشق-دلنوشته\")";
Debug.ShouldStop(1073741824);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("عشق-دلنوشته")));
 BA.debugLineNum = 288;BA.debugLine="SpinnerCat.Add(\"اعتقادی\")";
Debug.ShouldStop(-2147483648);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اعتقادی")));
 BA.debugLineNum = 289;BA.debugLine="SpinnerCat.Add(\"شرکت ها-دفتر ها\")";
Debug.ShouldStop(1);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("شرکت ها-دفتر ها")));
 BA.debugLineNum = 290;BA.debugLine="SpinnerCat.Add(\"مشاغل و صنفی\")";
Debug.ShouldStop(2);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مشاغل و صنفی")));
 BA.debugLineNum = 291;BA.debugLine="SpinnerCat.Add(\"ورزشی\")";
Debug.ShouldStop(4);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("ورزشی")));
 BA.debugLineNum = 292;BA.debugLine="SpinnerCat.Add(\"مد و زیبایی\")";
Debug.ShouldStop(8);
insertact.mostCurrent._spinnercat.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مد و زیبایی")));
 BA.debugLineNum = 294;BA.debugLine="Label6.Visible =True";
Debug.ShouldStop(32);
insertact.mostCurrent._label6.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 298;BA.debugLine="PanelInput.RemoveView()";
Debug.ShouldStop(512);
insertact.mostCurrent._panelinput.runVoidMethod ("RemoveView");
 BA.debugLineNum = 301;BA.debugLine="ScrollView.Panel.AddView(PanelInput,0,0,100%x,90";
Debug.ShouldStop(4096);
insertact.mostCurrent._scrollview.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((insertact.mostCurrent._panelinput.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(insertact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),insertact.mostCurrent.activityBA)),(Object)(insertact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 900)))));
 BA.debugLineNum = 302;BA.debugLine="ScrollView.Panel.Height = 880dip";
Debug.ShouldStop(8192);
insertact.mostCurrent._scrollview.runMethod(false,"getPanel").runMethod(true,"setHeight",insertact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 880))));
 BA.debugLineNum = 303;BA.debugLine="ScrollView.Color = Colors.White";
Debug.ShouldStop(16384);
insertact.mostCurrent._scrollview.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 305;BA.debugLine="If(Main.isEdit= True)Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._isedit,insertact.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 306;BA.debugLine="txtName.Text = Main.selected_item.Get(\"title\")";
Debug.ShouldStop(131072);
insertact.mostCurrent._txtname.runMethodAndSync(true,"setText",insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));
 BA.debugLineNum = 307;BA.debugLine="txtDescription.Text= Main.selected_item.Get(\"de";
Debug.ShouldStop(262144);
insertact.mostCurrent._txtdescription.runMethodAndSync(true,"setText",insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description")))));
 BA.debugLineNum = 308;BA.debugLine="txtTag.Text= Main.selected_item.Get(\"tag\")";
Debug.ShouldStop(524288);
insertact.mostCurrent._txttag.runMethodAndSync(true,"setText",insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tag")))));
 BA.debugLineNum = 309;BA.debugLine="txtAddress.Text= Main.selected_item.Get(\"telegr";
Debug.ShouldStop(1048576);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telegramAddress")))));
 BA.debugLineNum = 310;BA.debugLine="txtAdmin.Text= Main.selected_item.Get(\"ownerId\"";
Debug.ShouldStop(2097152);
insertact.mostCurrent._txtadmin.runMethodAndSync(true,"setText",insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ownerId")))));
 BA.debugLineNum = 311;BA.debugLine="EditMemberCount.Text= Main.selected_item.Get(\"m";
Debug.ShouldStop(4194304);
insertact.mostCurrent._editmembercount.runMethodAndSync(true,"setText",insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("memberCount")))));
 BA.debugLineNum = 313;BA.debugLine="ScrollView.Panel.Height = 970dip";
Debug.ShouldStop(16777216);
insertact.mostCurrent._scrollview.runMethod(false,"getPanel").runMethod(true,"setHeight",insertact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 970))));
 };
 }else {
 BA.debugLineNum = 318;BA.debugLine="Label6.Visible = False";
Debug.ShouldStop(536870912);
insertact.mostCurrent._label6.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 319;BA.debugLine="Label7.Visible = False";
Debug.ShouldStop(1073741824);
insertact.mostCurrent._label7.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 320;BA.debugLine="SpinnerOstan.Visible= False";
Debug.ShouldStop(-2147483648);
insertact.mostCurrent._spinnerostan.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 321;BA.debugLine="SpinnerOstan.Visible = False";
Debug.ShouldStop(1);
insertact.mostCurrent._spinnerostan.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 323;BA.debugLine="Label6.Visible =False";
Debug.ShouldStop(4);
insertact.mostCurrent._label6.runMethod(true,"setVisible",insertact.mostCurrent.__c.getField(true,"False"));
 };
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,358);
if (RapidSub.canDelegate("activity_pause")) return insertact.remoteMe.runUserSub(false, "insertact","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 358;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 360;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,330);
if (RapidSub.canDelegate("activity_resume")) return insertact.remoteMe.runUserSub(false, "insertact","activity_resume");
 BA.debugLineNum = 330;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="If(Main.selected_item.IsInitialized=True And  Mai";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._selected_item.runMethod(true,"IsInitialized"),insertact.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),(insertact.mostCurrent._txtname.runMethod(true,"getText"))) && RemoteObject.solveBoolean("=",insertact.mostCurrent._main._isedit,insertact.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 332;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
insertact.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 335;BA.debugLine="If Main.isEdit = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",insertact.mostCurrent._main._isedit,insertact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 336;BA.debugLine="Label5.Text  = \" ویرایش اطلاعات \"  & Main.select";
Debug.ShouldStop(32768);
insertact.mostCurrent._label5.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(" ویرایش اطلاعات "),insertact.mostCurrent._main._selectedtypetitle)));
 BA.debugLineNum = 337;BA.debugLine="Activity.Title= \" ویرایش اطلاعات \"  & Main.selec";
Debug.ShouldStop(65536);
insertact.mostCurrent._activity.runMethod(false,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable(" ویرایش اطلاعات "),insertact.mostCurrent._main._selectedtypetitle)));
 }else 
{ BA.debugLineNum = 339;BA.debugLine="Else If  Main.isSuperGroup=True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",insertact.mostCurrent._main._issupergroup,insertact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 342;BA.debugLine="Label5.Text = \"  .تعداد مجوز باقیمانده : \" &  _";
Debug.ShouldStop(2097152);
insertact.mostCurrent._label5.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("  .تعداد مجوز باقیمانده : "),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),insertact.mostCurrent._main._vipinsertcount}, "-",1, 1)))));
 BA.debugLineNum = 344;BA.debugLine="Activity.Title= \" ثبت اطلاعات سوپر گروه\"";
Debug.ShouldStop(8388608);
insertact.mostCurrent._activity.runMethod(false,"setTitle",RemoteObject.createImmutable((" ثبت اطلاعات سوپر گروه")));
 BA.debugLineNum = 346;BA.debugLine="Label4.Color =Colors.rgb(236,64,122)";
Debug.ShouldStop(33554432);
insertact.mostCurrent._label4.runVoidMethod ("setColor",insertact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 236)),(Object)(BA.numberCast(int.class, 64)),(Object)(BA.numberCast(int.class, 122))));
 }else {
 BA.debugLineNum = 351;BA.debugLine="Label5.Text  = \" ثبت اطلاعات \"  & Main.selectedT";
Debug.ShouldStop(1073741824);
insertact.mostCurrent._label5.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(" ثبت اطلاعات "),insertact.mostCurrent._main._selectedtypetitle)));
 BA.debugLineNum = 352;BA.debugLine="Activity.Title= \" ثبت اطلاعات \"  & Main.selected";
Debug.ShouldStop(-2147483648);
insertact.mostCurrent._activity.runMethod(false,"setTitle",(RemoteObject.concat(RemoteObject.createImmutable(" ثبت اطلاعات "),insertact.mostCurrent._main._selectedtypetitle)));
 }};
 BA.debugLineNum = 356;BA.debugLine="End Sub";
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
public static RemoteObject  _btninsert_click() throws Exception{
try {
		Debug.PushSubsStack("btnInsert_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,476);
if (RapidSub.canDelegate("btninsert_click")) return insertact.remoteMe.runUserSub(false, "insertact","btninsert_click");
RemoteObject _content = RemoteObject.createImmutable("");
 BA.debugLineNum = 476;BA.debugLine="Sub btnInsert_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 477;BA.debugLine="If(Main.isEdit=False _ 	 	And (Main.selectedType";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._isedit,insertact.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._selectedtype,BA.ObjectToString("group")) || RemoteObject.solveBoolean("=",insertact.mostCurrent._main._selectedtype,RemoteObject.createImmutable("channel"))))))) { 
 BA.debugLineNum = 480;BA.debugLine="If ((Main.isSuperGroup=False )And (Main.todayIn";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._issupergroup,insertact.mostCurrent.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",insertact.mostCurrent._main._todayinsertcount,BA.numberCast(double.class, 8))))))) { 
 BA.debugLineNum = 482;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از هشت گروه یا کا";
Debug.ShouldStop(2);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("روزانه امکان ثبت بیش از هشت گروه یا کانال وجود ندارد. ")),(Object)(RemoteObject.createImmutable("عدم دسترسی")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 483;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 484;BA.debugLine="else If ((Main.isSuperGroup=True )And (Main.vip";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._issupergroup,insertact.mostCurrent.__c.getField(true,"True"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",insertact.mostCurrent._main._vipinsertcount,BA.numberCast(double.class, 4))))))) { 
 BA.debugLineNum = 485;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از چهار سوپر گروه";
Debug.ShouldStop(16);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("روزانه امکان ثبت بیش از چهار سوپر گروه وجود ندارد. ")),(Object)(RemoteObject.createImmutable("عدم دسترسی")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 486;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 }};
 };
 BA.debugLineNum = 490;BA.debugLine="If (txtName.Text.Length < 2 Or txtDescription.Tex";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("<",insertact.mostCurrent._txtname.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("<",insertact.mostCurrent._txtdescription.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 491;BA.debugLine="Msgbox (\"اطالاعات ورودی کم است-اسم ، توضیح\" ,		\"";
Debug.ShouldStop(1024);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("اطالاعات ورودی کم است-اسم ، توضیح")),(Object)(RemoteObject.createImmutable("درج ورودی")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 492;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 495;BA.debugLine="If (Main.selectedType<>\"order\" And Main.selectedT";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("!",insertact.mostCurrent._main._selectedtype,BA.ObjectToString("order")) && RemoteObject.solveBoolean("!",insertact.mostCurrent._main._selectedtype,BA.ObjectToString("ads")) && RemoteObject.solveBoolean("<",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 4)))) { 
 BA.debugLineNum = 496;BA.debugLine="Msgbox (\"آدرس را بنویسید\" , \"آدرس خالی است\" )";
Debug.ShouldStop(32768);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس را بنویسید")),(Object)(RemoteObject.createImmutable("آدرس خالی است")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 497;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 500;BA.debugLine="Dim content As String";
Debug.ShouldStop(524288);
_content = RemoteObject.createImmutable("");Debug.locals.put("content", _content);
 BA.debugLineNum = 501;BA.debugLine="content = 	txtName.Text & \" \" & txtDescription.Te";
Debug.ShouldStop(1048576);
_content = RemoteObject.concat(insertact.mostCurrent._txtname.runMethod(true,"getText"),RemoteObject.createImmutable(" "),insertact.mostCurrent._txtdescription.runMethod(true,"getText"),RemoteObject.createImmutable(" "),insertact.mostCurrent._txttag.runMethod(true,"getText"));Debug.locals.put("content", _content);
 BA.debugLineNum = 502;BA.debugLine="content = content.ToLowerCase";
Debug.ShouldStop(2097152);
_content = _content.runMethod(true,"toLowerCase");Debug.locals.put("content", _content);
 BA.debugLineNum = 504;BA.debugLine="If( _  				(content.Contains(\"سکس\") =  True )Or";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سکس"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("sex"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("کس ننه"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("کس ننه"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("بگا"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سگس"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("ارضا"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سکسی"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سیکس"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("xxx"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("همجنس"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("شهو"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سکس"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("کوس"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("کوص"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("جنده"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("ناف"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("کير"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("كير"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("کون"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("پورن"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سوسکی"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("30"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("س ک س"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("gay"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سکسي"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("85"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("کاندوم"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("کیر"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("ممه"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("پستان"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("س.ک.س"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("حشر"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("خاک"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("exi"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("exy"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سسک"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("بکن"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("آبت"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("ابت"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("گوز"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سیکتیر"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("فیلم سوپر"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("لاشی"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("داغ"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("سگس"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("ووف"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("جق"))),insertact.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("s"))),insertact.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("e"))),insertact.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_content.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("x"))),insertact.mostCurrent.__c.getField(true,"True"))))))) { 
 BA.debugLineNum = 555;BA.debugLine="Msgbox(\"خواهش می کنیم مطالب ناهنجار درج نکنید .\"";
Debug.ShouldStop(1024);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("خواهش می کنیم مطالب ناهنجار درج نکنید ."),insertact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("هزاران کاربر با سلیقه ها و سن و سالهای مختلف از برنامه استفاده می کنند ."),insertact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("ما مجبوریم کاربران متخلف را تا 48 ساعت و در صورت تکرار دائم بلاک کنیم ."))),(Object)(RemoteObject.createImmutable("  خطای محتوا")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 559;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 564;BA.debugLine="If(  txtAddress.Text.StartsWith(\"http://telegram.";
Debug.ShouldStop(524288);
if ((insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://telegram.me/")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 565;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"http\"";
Debug.ShouldStop(1048576);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("http")),(Object)(RemoteObject.createImmutable("https")))));
 }else 
{ BA.debugLineNum = 566;BA.debugLine="else if (txtAddress.Text.StartsWith(\"telegram.me/";
Debug.ShouldStop(2097152);
if ((insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("telegram.me/")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 567;BA.debugLine="txtAddress.Text = \"https://\" & txtAddress.Text";
Debug.ShouldStop(4194304);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("https://"),insertact.mostCurrent._txtaddress.runMethod(true,"getText"))));
 }};
 BA.debugLineNum = 570;BA.debugLine="Select Main.selectedType";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(insertact.mostCurrent._main._selectedtype,BA.ObjectToString("group"),BA.ObjectToString("ads"),BA.ObjectToString("id"),BA.ObjectToString("order"),BA.ObjectToString("robot"),BA.ObjectToString("channel"),BA.ObjectToString("sticker"))) {
case 0: {
 BA.debugLineNum = 573;BA.debugLine="If(txtAddress.Text.StartsWith(\"https://telegr";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/")))) && RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/join"))),insertact.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 574;BA.debugLine="Msgbox(\"آدرس ورودی مربوط به گروه نیست . برای";
Debug.ShouldStop(536870912);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس ورودی مربوط به گروه نیست . برای ثبت کانال ، ربات و موارد دیگر از بخش مربوط به هرکدام استفاده کنید ")),(Object)(RemoteObject.createImmutable("اشکال در ورود اطلاعات")),insertact.mostCurrent.activityBA);
 }else 
{ BA.debugLineNum = 575;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
Debug.ShouldStop(1073741824);
if (((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("wwww"))))))) { 
 BA.debugLineNum = 577;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
Debug.ShouldStop(1);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید")),(Object)(RemoteObject.createImmutable(" استفاده تبلیغاتی")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 579;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 580;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/join"))),insertact.mostCurrent.__c.getField(true,"True")))) { 
 }else {
 BA.debugLineNum = 583;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
Debug.ShouldStop(64);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید.")),(Object)(RemoteObject.createImmutable(" درج اطلاعات")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 584;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 }}};
 BA.debugLineNum = 587;BA.debugLine="If IsNumber(EditMemberCount.Text)=False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",insertact.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(insertact.mostCurrent._editmembercount.runMethod(true,"getText"))),insertact.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 588;BA.debugLine="EditMemberCount.Text=\"0\"";
Debug.ShouldStop(2048);
insertact.mostCurrent._editmembercount.runMethodAndSync(true,"setText",RemoteObject.createImmutable(("0")));
 };
 break; }
case 1: {
 BA.debugLineNum = 595;BA.debugLine="If(txtAddress.Text.StartsWith(\"https://telegr";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/"))),insertact.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("@")))))) { 
 BA.debugLineNum = 596;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
Debug.ShouldStop(524288);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("@")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 597;BA.debugLine="txtAddress.Text = \"https://telegram.me/\" & t";
Debug.ShouldStop(1048576);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("https://telegram.me/"),insertact.mostCurrent._txtaddress.runMethod(true,"getText"))));
 };
 break; }
case 2: {
 BA.debugLineNum = 604;BA.debugLine="If(  txtAddress.Text.Contains(\"@\") And txtAdd";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("@")))) && RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/"))),insertact.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 605;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
Debug.ShouldStop(268435456);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("@")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 606;BA.debugLine="txtAddress.Text = \"https://telegram.me/\" & t";
Debug.ShouldStop(536870912);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("https://telegram.me/"),insertact.mostCurrent._txtaddress.runMethod(true,"getText"))));
 }else 
{ BA.debugLineNum = 607;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
Debug.ShouldStop(1073741824);
if (((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("www"))))))) { 
 BA.debugLineNum = 609;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
Debug.ShouldStop(1);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید")),(Object)(RemoteObject.createImmutable(" استفاده تبلیغاتی")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 611;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 612;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/"))),insertact.mostCurrent.__c.getField(true,"True")))) { 
 }else {
 BA.debugLineNum = 615;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
Debug.ShouldStop(64);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید.")),(Object)(RemoteObject.createImmutable(" درج اطلاعات")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 616;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 }}};
 break; }
case 3: {
 break; }
case 4: {
 BA.debugLineNum = 622;BA.debugLine="If(  txtAddress.Text.Contains(\"@\") And _";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("@")))) && RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/"))),insertact.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("bot")))))) { 
 BA.debugLineNum = 626;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
Debug.ShouldStop(131072);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("@")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 627;BA.debugLine="txtAddress.Text = \"https://telegram.me/\" & t";
Debug.ShouldStop(262144);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("https://telegram.me/"),insertact.mostCurrent._txtaddress.runMethod(true,"getText"))));
 }else 
{ BA.debugLineNum = 629;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
Debug.ShouldStop(1048576);
if (((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("www"))))))) { 
 BA.debugLineNum = 631;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
Debug.ShouldStop(4194304);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید")),(Object)(RemoteObject.createImmutable(" استفاده تبلیغاتی")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 633;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 634;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/bot_"))),insertact.mostCurrent.__c.getField(true,"True")))) { 
 }else {
 BA.debugLineNum = 637;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
Debug.ShouldStop(268435456);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید.")),(Object)(RemoteObject.createImmutable(" درج اطلاعات")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 638;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 }}};
 break; }
case 5: {
 BA.debugLineNum = 644;BA.debugLine="If(txtAddress.Text.StartsWith(\"https://telegr";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/"))),insertact.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("@")))))) { 
 BA.debugLineNum = 645;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
Debug.ShouldStop(16);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("@")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 646;BA.debugLine="txtAddress.Text = \"https://telegram.me/\" & t";
Debug.ShouldStop(32);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("https://telegram.me/"),insertact.mostCurrent._txtaddress.runMethod(true,"getText"))));
 }else 
{ BA.debugLineNum = 648;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
Debug.ShouldStop(128);
if (((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("www"))))))) { 
 BA.debugLineNum = 650;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
Debug.ShouldStop(512);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("درج لینک تبلیغاتی در آدرس امکان پذیر نیست . برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید")),(Object)(RemoteObject.createImmutable(" استفاده تبلیغاتی")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 651;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 652;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/"))),insertact.mostCurrent.__c.getField(true,"True")))) { 
 }else {
 BA.debugLineNum = 655;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
Debug.ShouldStop(16384);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید.")),(Object)(RemoteObject.createImmutable(" درج اطلاعات")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 656;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 }}};
 break; }
case 6: {
 BA.debugLineNum = 660;BA.debugLine="If(txtAddress.Text.StartsWith(\"https://telegr";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/")))) && RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/addstickers"))),insertact.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 661;BA.debugLine="Msgbox(\"آدرس ورودی مربوط به استیکر نیست . بر";
Debug.ShouldStop(1048576);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس ورودی مربوط به استیکر نیست . برای ثبت کانال ، ربات و موارد دیگر از بخش مربوط به هرکدام استفاده کنید ")),(Object)(RemoteObject.createImmutable("اشکال در ورود اطلاعات")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 662;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 663;BA.debugLine="else If(txtAddress.Text.StartsWith(\"https://t";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/addstickers"))),insertact.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("@")))))) { 
 BA.debugLineNum = 664;BA.debugLine="txtAddress.Text = txtAddress.Text.Replace(\"@";
Debug.ShouldStop(8388608);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("@")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 665;BA.debugLine="txtAddress.Text = \"https://telegram.me/addst";
Debug.ShouldStop(16777216);
insertact.mostCurrent._txtaddress.runMethodAndSync(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("https://telegram.me/addstickers/"),insertact.mostCurrent._txtaddress.runMethod(true,"getText"))));
 }else 
{ BA.debugLineNum = 667;BA.debugLine="Else If( (txtAddress.Text.StartsWith(\"http://";
Debug.ShouldStop(67108864);
if (((RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("www"))))))) { 
 BA.debugLineNum = 669;BA.debugLine="Msgbox(\"درج لینک تبلیغاتی در آدرس امکان پذیر";
Debug.ShouldStop(268435456);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("درج لینک تبلیغاتی در آدرس امکان پذیر نیست . برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید")),(Object)(RemoteObject.createImmutable(" استفاده تبلیغاتی")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 671;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 672;BA.debugLine="else If( txtAddress.Text.StartsWith(\"https://";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._txtaddress.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://telegram.me/addstickers"))),insertact.mostCurrent.__c.getField(true,"True")))) { 
 }else {
 BA.debugLineNum = 675;BA.debugLine="Msgbox(\"آدرس وارد شده صحیح نمی باشد لطفآ در";
Debug.ShouldStop(4);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید.")),(Object)(RemoteObject.createImmutable(" درج اطلاعات")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 676;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 }}}};
 break; }
}
;
 BA.debugLineNum = 681;BA.debugLine="name = txtName.Text";
Debug.ShouldStop(256);
insertact._name = insertact.mostCurrent._txtname.runMethod(true,"getText");
 BA.debugLineNum = 682;BA.debugLine="desciption=txtDescription.Text";
Debug.ShouldStop(512);
insertact._desciption = insertact.mostCurrent._txtdescription.runMethod(true,"getText");
 BA.debugLineNum = 683;BA.debugLine="address =txtAddress.Text";
Debug.ShouldStop(1024);
insertact._address = insertact.mostCurrent._txtaddress.runMethod(true,"getText");
 BA.debugLineNum = 684;BA.debugLine="admin=txtAdmin.Text";
Debug.ShouldStop(2048);
insertact._admin = insertact.mostCurrent._txtadmin.runMethod(true,"getText");
 BA.debugLineNum = 685;BA.debugLine="Tag=txtTag.Text";
Debug.ShouldStop(4096);
insertact._tag = insertact.mostCurrent._txttag.runMethod(true,"getText");
 BA.debugLineNum = 686;BA.debugLine="save";
Debug.ShouldStop(8192);
_save();
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btnMenu_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,67);
if (RapidSub.canDelegate("btnmenu_click")) return insertact.remoteMe.runUserSub(false, "insertact","btnmenu_click");
 BA.debugLineNum = 67;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
Debug.ShouldStop(8);
insertact.mostCurrent._navi.runVoidMethod ("OpenDrawer2",(Object)(insertact.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
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
public static RemoteObject  _btnpanel_click() throws Exception{
try {
		Debug.PushSubsStack("btnPanel_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,867);
if (RapidSub.canDelegate("btnpanel_click")) return insertact.remoteMe.runUserSub(false, "insertact","btnpanel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 867;BA.debugLine="Sub btnPanel_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 868;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(8);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 869;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(16);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),insertact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 872;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(128);
insertact.mostCurrent.__c.runVoidMethod ("StartActivity",insertact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/"))))));
 BA.debugLineNum = 873;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(256);
insertact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 874;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnReturn_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,362);
if (RapidSub.canDelegate("btnreturn_click")) return insertact.remoteMe.runUserSub(false, "insertact","btnreturn_click");
 BA.debugLineNum = 362;BA.debugLine="Sub btnReturn_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 363;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
insertact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 364;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonremove_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonRemove_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,876);
if (RapidSub.canDelegate("buttonremove_click")) return insertact.remoteMe.runUserSub(false, "insertact","buttonremove_click");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 876;BA.debugLine="Sub ButtonRemove_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 877;BA.debugLine="Dim id As Int";
Debug.ShouldStop(4096);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 878;BA.debugLine="id = Main.selected_item.Get(\"id\")";
Debug.ShouldStop(8192);
_id = BA.numberCast(int.class, insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 879;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 881;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(65536);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 882;BA.debugLine="ProgressDialogShow(\"درحال ارسال\")";
Debug.ShouldStop(131072);
insertact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",insertact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال ارسال")));
 BA.debugLineNum = 883;BA.debugLine="job.Initialize(\"broke_group\", Me)";
Debug.ShouldStop(262144);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",insertact.processBA,(Object)(BA.ObjectToString("broke_group")),(Object)(insertact.getObject()));
 BA.debugLineNum = 885;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
Debug.ShouldStop(1048576);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://www.aloosalam.ir/index.php/mobile/index/linkBroken/"),(RemoteObject.solve(new RemoteObject[] {_id,RemoteObject.createImmutable(34)}, "*",0, 1)))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&user="),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),insertact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&delete=1"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e604) {
			BA.rdebugUtils.runVoidMethod("setLastException",insertact.processBA, e604.toString()); BA.debugLineNum = 888;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
Debug.ShouldStop(8388608);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در ارسال اطلاعات   ")),(Object)(RemoteObject.createImmutable("خطا")),insertact.mostCurrent.activityBA);
 };
 BA.debugLineNum = 891;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Dim selectedOstan As Int";
insertact._selectedostan = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 26;BA.debugLine="Dim selectedShahr As Int";
insertact._selectedshahr = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="Dim selectedCat As Int";
insertact._selectedcat = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 32;BA.debugLine="Private txtName As EditText";
insertact.mostCurrent._txtname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private txtAddress As EditText";
insertact.mostCurrent._txtaddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private txtDescription As EditText";
insertact.mostCurrent._txtdescription = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private LabelName As Label";
insertact.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private LabelDesc As Label";
insertact.mostCurrent._labeldesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private LabelAddress As Label";
insertact.mostCurrent._labeladdress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private txtAdmin As EditText";
insertact.mostCurrent._txtadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private SpinnerOstan As Spinner";
insertact.mostCurrent._spinnerostan = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private SpinnerShahr As Spinner";
insertact.mostCurrent._spinnershahr = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private SpinnerCat As Spinner";
insertact.mostCurrent._spinnercat = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Label9 As Label";
insertact.mostCurrent._label9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private Label8 As Label";
insertact.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private Label7 As Label";
insertact.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Label5 As Label";
insertact.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private txtTag As EditText";
insertact.mostCurrent._txttag = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private Label10 As Label";
insertact.mostCurrent._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private ScrollView As ScrollView";
insertact.mostCurrent._scrollview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private PanelInput As Panel";
insertact.mostCurrent._panelinput = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private Label6 As Label";
insertact.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private Label4 As Label";
insertact.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private btnInsert As Button";
insertact.mostCurrent._btninsert = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Dim navi As AHNavigationDrawer";
insertact.mostCurrent._navi = RemoteObject.createNew ("de.amberhome.navdrawer.NavigationDrawer");
 //BA.debugLineNum = 60;BA.debugLine="Dim pCantent As Panel";
insertact.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private btnMenu As Button";
insertact.mostCurrent._btnmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private EditMemberCount As EditText";
insertact.mostCurrent._editmembercount = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private ImageView1 As ImageView";
insertact.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,366);
if (RapidSub.canDelegate("jobdone")) return insertact.remoteMe.runUserSub(false, "insertact","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _countries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 366;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 368;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
insertact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 369;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(65536);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 370;BA.debugLine="Dim res As String";
Debug.ShouldStop(131072);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 371;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(262144);
_res = _job.runClassMethod (Telegram.Search.httpjob.class, "_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 373;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 374;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 375;BA.debugLine="If Job.JobName= \"saveing\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("saveing"))) { 
 BA.debugLineNum = 377;BA.debugLine="Dim COUNTRIES As List";
Debug.ShouldStop(16777216);
_countries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 378;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list w";
Debug.ShouldStop(33554432);
_countries = _parser.runMethod(false,"NextArray");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 381;BA.debugLine="Dim row As Map";
Debug.ShouldStop(268435456);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("row", _row);
 BA.debugLineNum = 383;BA.debugLine="row.Initialize()";
Debug.ShouldStop(1073741824);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 387;BA.debugLine="row.Initialize()";
Debug.ShouldStop(4);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 388;BA.debugLine="row=COUNTRIES.Get(0)";
Debug.ShouldStop(8);
_row.setObject(_countries.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 390;BA.debugLine="Job.Release";
Debug.ShouldStop(32);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 BA.debugLineNum = 391;BA.debugLine="Dim id As Int";
Debug.ShouldStop(64);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 392;BA.debugLine="id= row.Get(\"id\")";
Debug.ShouldStop(128);
_id = BA.numberCast(int.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 393;BA.debugLine="If( id> 0 ) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean(">",_id,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 394;BA.debugLine="Main.selected_item = row";
Debug.ShouldStop(512);
insertact.mostCurrent._main._selected_item = _row;
 BA.debugLineNum = 396;BA.debugLine="If(Main.isEdit=False _ 						And (Main.select";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._isedit,insertact.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._selectedtype,BA.ObjectToString("group")) || RemoteObject.solveBoolean("=",insertact.mostCurrent._main._selectedtype,RemoteObject.createImmutable("channel"))))))) { 
 BA.debugLineNum = 400;BA.debugLine="If (Main.isSuperGroup=False ) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._issupergroup,insertact.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 401;BA.debugLine="Main.todayInsertCount = Main.todayInsertCou";
Debug.ShouldStop(65536);
insertact.mostCurrent._main._todayinsertcount = RemoteObject.solve(new RemoteObject[] {insertact.mostCurrent._main._todayinsertcount,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 403;BA.debugLine="Main.vipInsertCount = Main.vipInsertCount +";
Debug.ShouldStop(262144);
insertact.mostCurrent._main._vipinsertcount = RemoteObject.solve(new RemoteObject[] {insertact.mostCurrent._main._vipinsertcount,RemoteObject.createImmutable(1)}, "+",1, 1);
 };
 BA.debugLineNum = 405;BA.debugLine="writeInfo";
Debug.ShouldStop(1048576);
_writeinfo();
 };
 BA.debugLineNum = 408;BA.debugLine="If (Main.isEdit=True ) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._isedit,insertact.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 410;BA.debugLine="StartActivity(\"groupViewAct\")";
Debug.ShouldStop(33554432);
insertact.mostCurrent.__c.runVoidMethod ("StartActivity",insertact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("groupViewAct"))));
 };
 }else {
 BA.debugLineNum = 415;BA.debugLine="Msgbox(row.Get(\"title\") , \"خطا\")";
Debug.ShouldStop(1073741824);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString(_row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)(RemoteObject.createImmutable("خطا")),insertact.mostCurrent.activityBA);
 };
 }else 
{ BA.debugLineNum = 417;BA.debugLine="else If( Job.JobName  = \"broke_group\") Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),RemoteObject.createImmutable("broke_group")))) { 
 BA.debugLineNum = 419;BA.debugLine="Msgbox(\"با تشکر از حسن توجه شما . مورد حذف شد";
Debug.ShouldStop(4);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("با تشکر از حسن توجه شما . مورد حذف شد .")),(Object)(RemoteObject.createImmutable("درخواست حذف")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 420;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
insertact.mostCurrent._activity.runVoidMethod ("Finish");
 }};
 }else {
 BA.debugLineNum = 424;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
Debug.ShouldStop(128);
insertact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .")),(Object)(insertact.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e303) {
			BA.rdebugUtils.runVoidMethod("setLastException",insertact.processBA, e303.toString()); BA.debugLineNum = 427;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات ذخیره سازی\",\"خطا\")";
Debug.ShouldStop(1024);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ذخیره سازی")),(Object)(RemoteObject.createImmutable("خطا")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 428;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
insertact.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 430;BA.debugLine="End Sub";
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
public static RemoteObject  _menuabout_click() throws Exception{
try {
		Debug.PushSubsStack("MenuAbout_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,839);
if (RapidSub.canDelegate("menuabout_click")) return insertact.remoteMe.runUserSub(false, "insertact","menuabout_click");
 BA.debugLineNum = 839;BA.debugLine="Sub MenuAbout_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 840;BA.debugLine="StartActivity(\"AboutAct\")";
Debug.ShouldStop(128);
insertact.mostCurrent.__c.runVoidMethod ("StartActivity",insertact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("AboutAct"))));
 BA.debugLineNum = 841;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(256);
insertact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 842;BA.debugLine="End Sub";
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
public static RemoteObject  _menucontact_click() throws Exception{
try {
		Debug.PushSubsStack("MenuContact_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,859);
if (RapidSub.canDelegate("menucontact_click")) return insertact.remoteMe.runUserSub(false, "insertact","menucontact_click");
 BA.debugLineNum = 859;BA.debugLine="Sub MenuContact_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 860;BA.debugLine="StartActivity(\"contactAct\")";
Debug.ShouldStop(134217728);
insertact.mostCurrent.__c.runVoidMethod ("StartActivity",insertact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("contactAct"))));
 BA.debugLineNum = 861;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(268435456);
insertact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 866;BA.debugLine="End Sub";
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
public static RemoteObject  _menuexit_click() throws Exception{
try {
		Debug.PushSubsStack("MenuExit_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,844);
if (RapidSub.canDelegate("menuexit_click")) return insertact.remoteMe.runUserSub(false, "insertact","menuexit_click");
 BA.debugLineNum = 844;BA.debugLine="Sub MenuExit_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 846;BA.debugLine="ExitApplication";
Debug.ShouldStop(8192);
insertact.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 849;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("MenuHelp_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,835);
if (RapidSub.canDelegate("menuhelp_click")) return insertact.remoteMe.runUserSub(false, "insertact","menuhelp_click");
 BA.debugLineNum = 835;BA.debugLine="Sub MenuHelp_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 836;BA.debugLine="StartActivity(\"helpAct\")";
Debug.ShouldStop(8);
insertact.mostCurrent.__c.runVoidMethod ("StartActivity",insertact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("helpAct"))));
 BA.debugLineNum = 837;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(16);
insertact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 838;BA.debugLine="End Sub";
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
public static RemoteObject  _menuorder_click() throws Exception{
try {
		Debug.PushSubsStack("MenuOrder_Click (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,850);
if (RapidSub.canDelegate("menuorder_click")) return insertact.remoteMe.runUserSub(false, "insertact","menuorder_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 850;BA.debugLine="Sub MenuOrder_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 851;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 852;BA.debugLine="Msgbox(\"نام کاربری شما :\" & Main.userInfo.Get(\"us";
Debug.ShouldStop(524288);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),insertact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 855;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(4194304);
insertact.mostCurrent.__c.runVoidMethod ("StartActivity",insertact.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/index/1"))))));
 BA.debugLineNum = 856;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(8388608);
insertact.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(insertact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 857;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim name As String";
insertact._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim desciption As String";
insertact._desciption = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim address As String";
insertact._address = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim searchResult  As List";
insertact._searchresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 14;BA.debugLine="Dim Ostan As String";
insertact._ostan = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim Shahr As String";
insertact._shahr = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim Tag As String";
insertact._tag = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim admin As String";
insertact._admin = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Dim cat As String";
insertact._cat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Dim groupIcon As Bitmap";
insertact._groupicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _save() throws Exception{
try {
		Debug.PushSubsStack("save (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,432);
if (RapidSub.canDelegate("save")) return insertact.remoteMe.runUserSub(false, "insertact","save");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
RemoteObject _id = RemoteObject.createImmutable(0);
 BA.debugLineNum = 432;BA.debugLine="Sub save";
Debug.ShouldStop(32768);
 BA.debugLineNum = 434;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 435;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(262144);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 436;BA.debugLine="ProgressDialogShow(\"درحال ذخیره سازی\")";
Debug.ShouldStop(524288);
insertact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",insertact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال ذخیره سازی")));
 BA.debugLineNum = 437;BA.debugLine="job.Initialize(\"saveing\", Me)";
Debug.ShouldStop(1048576);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",insertact.processBA,(Object)(BA.ObjectToString("saveing")),(Object)(insertact.getObject()));
 BA.debugLineNum = 439;BA.debugLine="name = txtName.Text";
Debug.ShouldStop(4194304);
insertact._name = insertact.mostCurrent._txtname.runMethod(true,"getText");
 BA.debugLineNum = 440;BA.debugLine="desciption  =  txtDescription.Text";
Debug.ShouldStop(8388608);
insertact._desciption = insertact.mostCurrent._txtdescription.runMethod(true,"getText");
 BA.debugLineNum = 441;BA.debugLine="address =  txtAddress.Text";
Debug.ShouldStop(16777216);
insertact._address = insertact.mostCurrent._txtaddress.runMethod(true,"getText");
 BA.debugLineNum = 442;BA.debugLine="admin =  txtAdmin.Text";
Debug.ShouldStop(33554432);
insertact._admin = insertact.mostCurrent._txtadmin.runMethod(true,"getText");
 BA.debugLineNum = 443;BA.debugLine="Tag =  txtTag.Text";
Debug.ShouldStop(67108864);
insertact._tag = insertact.mostCurrent._txttag.runMethod(true,"getText");
 BA.debugLineNum = 444;BA.debugLine="Dim id As Int";
Debug.ShouldStop(134217728);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 445;BA.debugLine="If(Main.isEdit = True And Main.selected_item.IsI";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._isedit,insertact.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean(".",insertact.mostCurrent._main._selected_item.runMethod(true,"IsInitialized")))) { 
 BA.debugLineNum = 446;BA.debugLine="id = Main.selected_item.Get(\"id\")";
Debug.ShouldStop(536870912);
_id = BA.numberCast(int.class, insertact.mostCurrent._main._selected_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);
 }else {
 BA.debugLineNum = 448;BA.debugLine="id =0";
Debug.ShouldStop(-2147483648);
_id = BA.numberCast(int.class, 0);Debug.locals.put("id", _id);
 };
 BA.debugLineNum = 451;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.p";
Debug.ShouldStop(4);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/insert")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&name="),insertact._name,RemoteObject.createImmutable("&description="),insertact._desciption,RemoteObject.createImmutable("&address="),insertact._address,RemoteObject.createImmutable("&admin="),insertact._admin,RemoteObject.createImmutable("&cat="),insertact._selectedcat,RemoteObject.createImmutable("&ostan="),insertact._selectedostan,RemoteObject.createImmutable("&shahr="),insertact._selectedshahr,RemoteObject.createImmutable("&tag="),insertact._tag,RemoteObject.createImmutable("&type="),insertact.mostCurrent._main._selectedtype,RemoteObject.createImmutable("&isEdit="),insertact.mostCurrent._main._isedit,RemoteObject.createImmutable("&isSupper="),insertact.mostCurrent._main._issupergroup,RemoteObject.createImmutable("&id="),_id,RemoteObject.createImmutable("&user="),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),insertact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e325) {
			BA.rdebugUtils.runVoidMethod("setLastException",insertact.processBA, e325.toString()); BA.debugLineNum = 470;BA.debugLine="Msgbox(\"خطا در ارسال اطلاعات   \",\"خطا\")";
Debug.ShouldStop(2097152);
insertact.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در ارسال اطلاعات   ")),(Object)(RemoteObject.createImmutable("خطا")),insertact.mostCurrent.activityBA);
 BA.debugLineNum = 471;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
insertact.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 474;BA.debugLine="End Sub";
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
public static RemoteObject  _spinnercat_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerCat_ItemClick (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,796);
if (RapidSub.canDelegate("spinnercat_itemclick")) return insertact.remoteMe.runUserSub(false, "insertact","spinnercat_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 796;BA.debugLine="Sub SpinnerCat_ItemClick (Position As Int, Value A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 797;BA.debugLine="cat = Value";
Debug.ShouldStop(268435456);
insertact._cat = BA.ObjectToString(_value);
 BA.debugLineNum = 799;BA.debugLine="Select Value";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_value,RemoteObject.createImmutable(("دسته بندی نشده")),RemoteObject.createImmutable(("رسمی")),RemoteObject.createImmutable(("علمی")),RemoteObject.createImmutable(("آموزش-تحصیلی")),RemoteObject.createImmutable(("طنز و سرگرمی")),RemoteObject.createImmutable(("اجتماعی-خبری")),RemoteObject.createImmutable(("پزشکی-سلامت")),RemoteObject.createImmutable(("دوستان شخصی")),RemoteObject.createImmutable(("تجاری")),RemoteObject.createImmutable(("ادبی-هنری")),RemoteObject.createImmutable(("عشق-دلنوشته")),RemoteObject.createImmutable(("اعتقادی")),RemoteObject.createImmutable(("شرکت ها-دفتر ها")),RemoteObject.createImmutable(("مشاغل و صنفی")),RemoteObject.createImmutable(("ورزشی")),RemoteObject.createImmutable(("مد و زیبایی")))) {
case 0: {
 BA.debugLineNum = 801;BA.debugLine="selectedCat =1";
Debug.ShouldStop(1);
insertact._selectedcat = BA.numberCast(int.class, 1);
 break; }
case 1: {
 BA.debugLineNum = 803;BA.debugLine="selectedCat =2";
Debug.ShouldStop(4);
insertact._selectedcat = BA.numberCast(int.class, 2);
 break; }
case 2: {
 BA.debugLineNum = 805;BA.debugLine="selectedCat =3";
Debug.ShouldStop(16);
insertact._selectedcat = BA.numberCast(int.class, 3);
 break; }
case 3: {
 BA.debugLineNum = 807;BA.debugLine="selectedCat =4";
Debug.ShouldStop(64);
insertact._selectedcat = BA.numberCast(int.class, 4);
 break; }
case 4: {
 BA.debugLineNum = 809;BA.debugLine="selectedCat =5";
Debug.ShouldStop(256);
insertact._selectedcat = BA.numberCast(int.class, 5);
 break; }
case 5: {
 BA.debugLineNum = 811;BA.debugLine="selectedCat =6";
Debug.ShouldStop(1024);
insertact._selectedcat = BA.numberCast(int.class, 6);
 break; }
case 6: {
 BA.debugLineNum = 813;BA.debugLine="selectedCat =7";
Debug.ShouldStop(4096);
insertact._selectedcat = BA.numberCast(int.class, 7);
 break; }
case 7: {
 BA.debugLineNum = 815;BA.debugLine="selectedCat =8";
Debug.ShouldStop(16384);
insertact._selectedcat = BA.numberCast(int.class, 8);
 break; }
case 8: {
 BA.debugLineNum = 817;BA.debugLine="selectedCat =9";
Debug.ShouldStop(65536);
insertact._selectedcat = BA.numberCast(int.class, 9);
 break; }
case 9: {
 BA.debugLineNum = 819;BA.debugLine="selectedCat =10";
Debug.ShouldStop(262144);
insertact._selectedcat = BA.numberCast(int.class, 10);
 break; }
case 10: {
 BA.debugLineNum = 821;BA.debugLine="selectedCat =11";
Debug.ShouldStop(1048576);
insertact._selectedcat = BA.numberCast(int.class, 11);
 break; }
case 11: {
 BA.debugLineNum = 823;BA.debugLine="selectedCat =12";
Debug.ShouldStop(4194304);
insertact._selectedcat = BA.numberCast(int.class, 12);
 break; }
case 12: {
 BA.debugLineNum = 825;BA.debugLine="selectedCat =13";
Debug.ShouldStop(16777216);
insertact._selectedcat = BA.numberCast(int.class, 13);
 break; }
case 13: {
 BA.debugLineNum = 827;BA.debugLine="selectedCat =14";
Debug.ShouldStop(67108864);
insertact._selectedcat = BA.numberCast(int.class, 14);
 break; }
case 14: {
 BA.debugLineNum = 829;BA.debugLine="selectedCat =15";
Debug.ShouldStop(268435456);
insertact._selectedcat = BA.numberCast(int.class, 15);
 break; }
case 15: {
 BA.debugLineNum = 831;BA.debugLine="selectedCat =16";
Debug.ShouldStop(1073741824);
insertact._selectedcat = BA.numberCast(int.class, 16);
 break; }
}
;
 BA.debugLineNum = 833;BA.debugLine="End Sub";
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
public static RemoteObject  _spinnerostan_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerOstan_ItemClick (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,689);
if (RapidSub.canDelegate("spinnerostan_itemclick")) return insertact.remoteMe.runUserSub(false, "insertact","spinnerostan_itemclick", _position, _value);
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _row = RemoteObject.declareNull("Object");
RemoteObject _column = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 689;BA.debugLine="Sub SpinnerOstan_ItemClick (Position As Int, Value";
Debug.ShouldStop(65536);
 BA.debugLineNum = 690;BA.debugLine="SpinnerShahr.Clear()";
Debug.ShouldStop(131072);
insertact.mostCurrent._spinnershahr.runVoidMethod ("Clear");
 BA.debugLineNum = 694;BA.debugLine="selectedOstan =0";
Debug.ShouldStop(2097152);
insertact._selectedostan = BA.numberCast(int.class, 0);
 BA.debugLineNum = 695;BA.debugLine="Dim v As String";
Debug.ShouldStop(4194304);
_v = RemoteObject.createImmutable("");Debug.locals.put("v", _v);
 BA.debugLineNum = 696;BA.debugLine="v= Value";
Debug.ShouldStop(8388608);
_v = BA.ObjectToString(_value);Debug.locals.put("v", _v);
 BA.debugLineNum = 697;BA.debugLine="Ostan   = v";
Debug.ShouldStop(16777216);
insertact._ostan = _v;
 BA.debugLineNum = 698;BA.debugLine="Select v";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_v,BA.ObjectToString("آذربايجان شرقي"),BA.ObjectToString("آذربايجان غربي"),BA.ObjectToString("اردبيل"),BA.ObjectToString("اصفهان"),BA.ObjectToString("ايلام"),BA.ObjectToString("بوشهر"),BA.ObjectToString("تهران"),BA.ObjectToString("چهارمحال وبختياري"),BA.ObjectToString("خراسان جنوبي"),BA.ObjectToString("خراسان رضوي"),BA.ObjectToString("خراسان شمالي"),BA.ObjectToString("خوزستان"),BA.ObjectToString("زنجان"),BA.ObjectToString("سمنان"),BA.ObjectToString("سيستان و بلوچستان"),BA.ObjectToString("فارس"),BA.ObjectToString("قزوين"),BA.ObjectToString("قم"),BA.ObjectToString("كردستان"),BA.ObjectToString("كرمان"),BA.ObjectToString("كرمانشاه"),BA.ObjectToString("كهگيلويه وبوير احمد"),BA.ObjectToString("گلستان"),BA.ObjectToString("گيلان"),BA.ObjectToString("لرستان"),BA.ObjectToString("مازندران"),BA.ObjectToString("مركزي"),BA.ObjectToString("هرمزگان"),BA.ObjectToString("همدان"),BA.ObjectToString("يزد"))) {
case 0: {
 BA.debugLineNum = 700;BA.debugLine="selectedOstan =1";
Debug.ShouldStop(134217728);
insertact._selectedostan = BA.numberCast(int.class, 1);
 break; }
case 1: {
 BA.debugLineNum = 702;BA.debugLine="selectedOstan =2";
Debug.ShouldStop(536870912);
insertact._selectedostan = BA.numberCast(int.class, 2);
 break; }
case 2: {
 BA.debugLineNum = 704;BA.debugLine="selectedOstan =3";
Debug.ShouldStop(-2147483648);
insertact._selectedostan = BA.numberCast(int.class, 3);
 break; }
case 3: {
 BA.debugLineNum = 706;BA.debugLine="selectedOstan =4";
Debug.ShouldStop(2);
insertact._selectedostan = BA.numberCast(int.class, 4);
 break; }
case 4: {
 BA.debugLineNum = 708;BA.debugLine="selectedOstan =5";
Debug.ShouldStop(8);
insertact._selectedostan = BA.numberCast(int.class, 5);
 break; }
case 5: {
 BA.debugLineNum = 710;BA.debugLine="selectedOstan =6";
Debug.ShouldStop(32);
insertact._selectedostan = BA.numberCast(int.class, 6);
 break; }
case 6: {
 BA.debugLineNum = 712;BA.debugLine="selectedOstan =7";
Debug.ShouldStop(128);
insertact._selectedostan = BA.numberCast(int.class, 7);
 break; }
case 7: {
 BA.debugLineNum = 714;BA.debugLine="selectedOstan =8";
Debug.ShouldStop(512);
insertact._selectedostan = BA.numberCast(int.class, 8);
 break; }
case 8: {
 BA.debugLineNum = 716;BA.debugLine="selectedOstan =9";
Debug.ShouldStop(2048);
insertact._selectedostan = BA.numberCast(int.class, 9);
 break; }
case 9: {
 BA.debugLineNum = 718;BA.debugLine="selectedOstan =10";
Debug.ShouldStop(8192);
insertact._selectedostan = BA.numberCast(int.class, 10);
 break; }
case 10: {
 BA.debugLineNum = 720;BA.debugLine="selectedOstan =11";
Debug.ShouldStop(32768);
insertact._selectedostan = BA.numberCast(int.class, 11);
 break; }
case 11: {
 BA.debugLineNum = 722;BA.debugLine="selectedOstan =12";
Debug.ShouldStop(131072);
insertact._selectedostan = BA.numberCast(int.class, 12);
 break; }
case 12: {
 BA.debugLineNum = 724;BA.debugLine="selectedOstan =13";
Debug.ShouldStop(524288);
insertact._selectedostan = BA.numberCast(int.class, 13);
 break; }
case 13: {
 BA.debugLineNum = 726;BA.debugLine="selectedOstan =14";
Debug.ShouldStop(2097152);
insertact._selectedostan = BA.numberCast(int.class, 14);
 break; }
case 14: {
 BA.debugLineNum = 728;BA.debugLine="selectedOstan =15";
Debug.ShouldStop(8388608);
insertact._selectedostan = BA.numberCast(int.class, 15);
 break; }
case 15: {
 BA.debugLineNum = 730;BA.debugLine="selectedOstan =17";
Debug.ShouldStop(33554432);
insertact._selectedostan = BA.numberCast(int.class, 17);
 break; }
case 16: {
 BA.debugLineNum = 732;BA.debugLine="selectedOstan =18";
Debug.ShouldStop(134217728);
insertact._selectedostan = BA.numberCast(int.class, 18);
 break; }
case 17: {
 BA.debugLineNum = 734;BA.debugLine="selectedOstan =19";
Debug.ShouldStop(536870912);
insertact._selectedostan = BA.numberCast(int.class, 19);
 break; }
case 18: {
 BA.debugLineNum = 736;BA.debugLine="selectedOstan =20";
Debug.ShouldStop(-2147483648);
insertact._selectedostan = BA.numberCast(int.class, 20);
 break; }
case 19: {
 BA.debugLineNum = 738;BA.debugLine="selectedOstan =21";
Debug.ShouldStop(2);
insertact._selectedostan = BA.numberCast(int.class, 21);
 break; }
case 20: {
 BA.debugLineNum = 740;BA.debugLine="selectedOstan =22";
Debug.ShouldStop(8);
insertact._selectedostan = BA.numberCast(int.class, 22);
 break; }
case 21: {
 BA.debugLineNum = 742;BA.debugLine="selectedOstan =23";
Debug.ShouldStop(32);
insertact._selectedostan = BA.numberCast(int.class, 23);
 break; }
case 22: {
 BA.debugLineNum = 744;BA.debugLine="selectedOstan =24";
Debug.ShouldStop(128);
insertact._selectedostan = BA.numberCast(int.class, 24);
 break; }
case 23: {
 BA.debugLineNum = 746;BA.debugLine="selectedOstan =25";
Debug.ShouldStop(512);
insertact._selectedostan = BA.numberCast(int.class, 25);
 break; }
case 24: {
 BA.debugLineNum = 748;BA.debugLine="selectedOstan =26";
Debug.ShouldStop(2048);
insertact._selectedostan = BA.numberCast(int.class, 26);
 break; }
case 25: {
 BA.debugLineNum = 750;BA.debugLine="selectedOstan =27";
Debug.ShouldStop(8192);
insertact._selectedostan = BA.numberCast(int.class, 27);
 break; }
case 26: {
 BA.debugLineNum = 752;BA.debugLine="selectedOstan =28";
Debug.ShouldStop(32768);
insertact._selectedostan = BA.numberCast(int.class, 28);
 break; }
case 27: {
 BA.debugLineNum = 754;BA.debugLine="selectedOstan =29";
Debug.ShouldStop(131072);
insertact._selectedostan = BA.numberCast(int.class, 29);
 break; }
case 28: {
 BA.debugLineNum = 756;BA.debugLine="selectedOstan =30";
Debug.ShouldStop(524288);
insertact._selectedostan = BA.numberCast(int.class, 30);
 break; }
case 29: {
 BA.debugLineNum = 758;BA.debugLine="selectedOstan =31";
Debug.ShouldStop(2097152);
insertact._selectedostan = BA.numberCast(int.class, 31);
 break; }
}
;
 BA.debugLineNum = 762;BA.debugLine="Dim txt As String";
Debug.ShouldStop(33554432);
_txt = RemoteObject.createImmutable("");Debug.locals.put("txt", _txt);
 BA.debugLineNum = 764;BA.debugLine="txt = \"SELECT id, name  FROM \" & Main.DBTableName";
Debug.ShouldStop(134217728);
_txt = RemoteObject.concat(RemoteObject.createImmutable("SELECT id, name  FROM "),insertact.mostCurrent._main._dbtablename,RemoteObject.createImmutable(" where ostan_id = "),insertact._selectedostan);Debug.locals.put("txt", _txt);
 BA.debugLineNum = 766;BA.debugLine="Dim result As List";
Debug.ShouldStop(536870912);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 767;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt";
Debug.ShouldStop(1073741824);
_result = insertact.mostCurrent._dbutils.runMethod(false,"_executememorytable",insertact.mostCurrent.activityBA,(Object)(insertact.mostCurrent._main._sql1),(Object)(_txt),(Object)((insertact.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("result", _result);
 BA.debugLineNum = 769;BA.debugLine="For i =  0 To result.Size-1";
Debug.ShouldStop(1);
{
final int step72 = 1;
final int limit72 = RemoteObject.solve(new RemoteObject[] {_result.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step72 > 0 && _i <= limit72) || (step72 < 0 && _i >= limit72); _i = ((int)(0 + _i + step72)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 770;BA.debugLine="Dim row As Object";
Debug.ShouldStop(2);
_row = RemoteObject.createNew ("Object");Debug.locals.put("row", _row);
 BA.debugLineNum = 771;BA.debugLine="Dim column() As String";
Debug.ShouldStop(4);
_column = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("column", _column);
 BA.debugLineNum = 772;BA.debugLine="row = result.Get(i)";
Debug.ShouldStop(8);
_row = _result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("row", _row);
 BA.debugLineNum = 773;BA.debugLine="column = row";
Debug.ShouldStop(16);
_column = (_row);Debug.locals.put("column", _column);
 BA.debugLineNum = 774;BA.debugLine="SpinnerShahr.Add(column(1))";
Debug.ShouldStop(32);
insertact.mostCurrent._spinnershahr.runVoidMethod ("Add",(Object)(_column.getArrayElement(true,BA.numberCast(int.class, 1))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 776;BA.debugLine="End Sub";
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
public static RemoteObject  _spinnershahr_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinnerShahr_ItemClick (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,778);
if (RapidSub.canDelegate("spinnershahr_itemclick")) return insertact.remoteMe.runUserSub(false, "insertact","spinnershahr_itemclick", _position, _value);
RemoteObject _txt = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("Object");
RemoteObject _column = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 778;BA.debugLine="Sub SpinnerShahr_ItemClick (Position As Int, Value";
Debug.ShouldStop(512);
 BA.debugLineNum = 780;BA.debugLine="Dim txt As String";
Debug.ShouldStop(2048);
_txt = RemoteObject.createImmutable("");Debug.locals.put("txt", _txt);
 BA.debugLineNum = 782;BA.debugLine="txt = \"SELECT   id  FROM \" & Main.DBTableName & \"";
Debug.ShouldStop(8192);
_txt = RemoteObject.concat(RemoteObject.createImmutable("SELECT   id  FROM "),insertact.mostCurrent._main._dbtablename,RemoteObject.createImmutable(" where name = '"),_value,RemoteObject.createImmutable("'"));Debug.locals.put("txt", _txt);
 BA.debugLineNum = 784;BA.debugLine="Dim result As List";
Debug.ShouldStop(32768);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 785;BA.debugLine="result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt";
Debug.ShouldStop(65536);
_result = insertact.mostCurrent._dbutils.runMethod(false,"_executememorytable",insertact.mostCurrent.activityBA,(Object)(insertact.mostCurrent._main._sql1),(Object)(_txt),(Object)((insertact.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("result", _result);
 BA.debugLineNum = 787;BA.debugLine="Shahr = Value";
Debug.ShouldStop(262144);
insertact._shahr = BA.ObjectToString(_value);
 BA.debugLineNum = 789;BA.debugLine="Dim row As Object";
Debug.ShouldStop(1048576);
_row = RemoteObject.createNew ("Object");Debug.locals.put("row", _row);
 BA.debugLineNum = 790;BA.debugLine="Dim column() As String";
Debug.ShouldStop(2097152);
_column = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("column", _column);
 BA.debugLineNum = 791;BA.debugLine="row = result.Get(0)";
Debug.ShouldStop(4194304);
_row = _result.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("row", _row);
 BA.debugLineNum = 792;BA.debugLine="column = row";
Debug.ShouldStop(8388608);
_column = (_row);Debug.locals.put("column", _column);
 BA.debugLineNum = 793;BA.debugLine="selectedShahr = column(0)";
Debug.ShouldStop(16777216);
insertact._selectedshahr = BA.numberCast(int.class, _column.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 794;BA.debugLine="End Sub";
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
public static RemoteObject  _writeinfo() throws Exception{
try {
		Debug.PushSubsStack("writeInfo (insertact) ","insertact",7,insertact.mostCurrent.activityBA,insertact.mostCurrent,893);
if (RapidSub.canDelegate("writeinfo")) return insertact.remoteMe.runUserSub(false, "insertact","writeinfo");
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _updatequery = RemoteObject.createImmutable("");
 BA.debugLineNum = 893;BA.debugLine="Sub writeInfo";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 895;BA.debugLine="If(Main.userInfo.IsInitialized =False) Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",insertact.mostCurrent._main._userinfo.runMethod(true,"IsInitialized"),insertact.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 896;BA.debugLine="Main.userInfo.Initialize";
Debug.ShouldStop(-2147483648);
insertact.mostCurrent._main._userinfo.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 899;BA.debugLine="Dim line As String";
Debug.ShouldStop(4);
_line = RemoteObject.createImmutable("");Debug.locals.put("line", _line);
 BA.debugLineNum = 901;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 902;BA.debugLine="line = Main.phoneId.GetLine1Number";
Debug.ShouldStop(32);
_line = insertact.mostCurrent._main._phoneid.runMethod(true,"GetLine1Number");Debug.locals.put("line", _line);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e615) {
			BA.rdebugUtils.runVoidMethod("setLastException",insertact.processBA, e615.toString()); BA.debugLineNum = 904;BA.debugLine="line = \"need root\"";
Debug.ShouldStop(128);
_line = BA.ObjectToString("need root");Debug.locals.put("line", _line);
 };
 BA.debugLineNum = 907;BA.debugLine="Main.userInfo.Put(\"sdk\",Main.phone.SdkVersion)";
Debug.ShouldStop(1024);
insertact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sdk"))),(Object)((insertact.mostCurrent._main._phone.runMethod(true,"getSdkVersion"))));
 BA.debugLineNum = 908;BA.debugLine="Main.userInfo.Put(\"model\",Main.phone.Manufacturer";
Debug.ShouldStop(2048);
insertact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("model"))),(Object)((RemoteObject.concat(insertact.mostCurrent._main._phone.runMethod(true,"getManufacturer"),RemoteObject.createImmutable(","),insertact.mostCurrent._main._phone.runMethod(true,"getProduct")))));
 BA.debugLineNum = 909;BA.debugLine="Main.userInfo.Put(\"line_number\",line)";
Debug.ShouldStop(4096);
insertact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("line_number"))),(Object)((_line)));
 BA.debugLineNum = 910;BA.debugLine="Main.userInfo.Put(\"phoneid\",Main.phoneId.GetDevic";
Debug.ShouldStop(8192);
insertact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("phoneid"))),(Object)((insertact.mostCurrent._main._phoneid.runMethod(true,"GetDeviceId"))));
 BA.debugLineNum = 914;BA.debugLine="Main.userInfo.Put(\"to_day_insert_advance\",Main.vi";
Debug.ShouldStop(131072);
insertact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_insert_advance"))),(Object)((insertact.mostCurrent._main._vipinsertcount)));
 BA.debugLineNum = 915;BA.debugLine="Main.userInfo.Put(\"to_day_insert\",Main.todayInser";
Debug.ShouldStop(262144);
insertact.mostCurrent._main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_insert"))),(Object)((insertact.mostCurrent._main._todayinsertcount)));
 BA.debugLineNum = 917;BA.debugLine="Dim updateQuery As String  = \"update  info set \"";
Debug.ShouldStop(1048576);
_updatequery = RemoteObject.concat(RemoteObject.createImmutable("update  info set "),RemoteObject.createImmutable("name  ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("phone	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("user_id	 ="),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("pass	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("user_name	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("sdk	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sdk")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("model	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("model")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("line_number	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("phoneid	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phoneid")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("is_advance	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_advance")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("is_premium	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_premium")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("advance_count	 ="),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("advance_count")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("advance_expier_date	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("advance_expier_date")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("to_day_date	 ='"),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_date")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("to_day_insert	 ="),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("to_day_insert_advance	 ="),insertact.mostCurrent._main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert_advance")))));Debug.locals.put("updateQuery", _updatequery);Debug.locals.put("updateQuery", _updatequery);
 BA.debugLineNum = 935;BA.debugLine="DBUtils.ExecuteMemoryTable(Main.SQL1,  updateQuer";
Debug.ShouldStop(64);
insertact.mostCurrent._dbutils.runVoidMethod ("_executememorytable",insertact.mostCurrent.activityBA,(Object)(insertact.mostCurrent._main._sql1),(Object)(_updatequery),(Object)((insertact.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 937;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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