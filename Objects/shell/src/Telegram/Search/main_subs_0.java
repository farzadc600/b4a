package Telegram.Search;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,162);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 162;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 164;BA.debugLine="navi.Initialize2(\"navi\",Activity,75%x,navi.GRAVIT";
Debug.ShouldStop(8);
main.mostCurrent._navi.runVoidMethod ("Initialize2",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("navi")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), main.mostCurrent._activity.getObject()),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 166;BA.debugLine="navi.NavigationPanel.LoadLayout(\"menu\")";
Debug.ShouldStop(32);
main.mostCurrent._navi.runMethod(false,"getNavigationPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menu")),main.mostCurrent.activityBA);
 BA.debugLineNum = 168;BA.debugLine="pCantent.Initialize(\"\")";
Debug.ShouldStop(128);
main.mostCurrent._pcantent.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 169;BA.debugLine="navi.ContentPanel.AddView(pCantent,0,0,100%x,100%";
Debug.ShouldStop(256);
main.mostCurrent._navi.runMethod(false,"getContentPanel").runVoidMethod ("AddView",(Object)((main.mostCurrent._pcantent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 171;BA.debugLine="pCantent.LoadLayout(\"main_view\")";
Debug.ShouldStop(1024);
main.mostCurrent._pcantent.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main_view")),main.mostCurrent.activityBA);
 BA.debugLineNum = 172;BA.debugLine="pCantent.SendToBack";
Debug.ShouldStop(2048);
main.mostCurrent._pcantent.runVoidMethod ("SendToBack");
 BA.debugLineNum = 175;BA.debugLine="Activity.Title=\"جستجوی گروه تلگرام\"";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runMethod(false,"setTitle",RemoteObject.createImmutable(("جستجوی گروه تلگرام")));
 BA.debugLineNum = 178;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(131072);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="DBFileDir = DBUtils.CopyDBFromAssets(DBFileName)";
Debug.ShouldStop(262144);
main._dbfiledir = main.mostCurrent._dbutils.runMethod(true,"_copydbfromassets",main.mostCurrent.activityBA,(Object)(main._dbfilename));
 };
 BA.debugLineNum = 182;BA.debugLine="SQL1.Initialize(DBFileDir, DBFileName, True)";
Debug.ShouldStop(2097152);
main._sql1.runVoidMethod ("Initialize",(Object)(main._dbfiledir),(Object)(main._dbfilename),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 185;BA.debugLine="cat(1)=(\"دسته بندی نشده\")'1";
Debug.ShouldStop(16777216);
main._cat.setArrayElement ((RemoteObject.createImmutable("دسته بندی نشده")),BA.numberCast(int.class, 1));
 BA.debugLineNum = 186;BA.debugLine="cat(2)=(\"رسمی\")'2";
Debug.ShouldStop(33554432);
main._cat.setArrayElement ((RemoteObject.createImmutable("رسمی")),BA.numberCast(int.class, 2));
 BA.debugLineNum = 187;BA.debugLine="cat(3)=(\"علمی\")'3";
Debug.ShouldStop(67108864);
main._cat.setArrayElement ((RemoteObject.createImmutable("علمی")),BA.numberCast(int.class, 3));
 BA.debugLineNum = 188;BA.debugLine="cat(4)=(\"آموزش-تحصیلی\")'4";
Debug.ShouldStop(134217728);
main._cat.setArrayElement ((RemoteObject.createImmutable("آموزش-تحصیلی")),BA.numberCast(int.class, 4));
 BA.debugLineNum = 189;BA.debugLine="cat(5)=(\"طنز و سرگرمی\")'5";
Debug.ShouldStop(268435456);
main._cat.setArrayElement ((RemoteObject.createImmutable("طنز و سرگرمی")),BA.numberCast(int.class, 5));
 BA.debugLineNum = 190;BA.debugLine="cat(6)=(\"اجتماعی-خبری\")'6";
Debug.ShouldStop(536870912);
main._cat.setArrayElement ((RemoteObject.createImmutable("اجتماعی-خبری")),BA.numberCast(int.class, 6));
 BA.debugLineNum = 191;BA.debugLine="cat(7)=(\"پزشکی-سلامت\")'7";
Debug.ShouldStop(1073741824);
main._cat.setArrayElement ((RemoteObject.createImmutable("پزشکی-سلامت")),BA.numberCast(int.class, 7));
 BA.debugLineNum = 192;BA.debugLine="cat(8)=(\"دوستان شخصی\")'8";
Debug.ShouldStop(-2147483648);
main._cat.setArrayElement ((RemoteObject.createImmutable("دوستان شخصی")),BA.numberCast(int.class, 8));
 BA.debugLineNum = 193;BA.debugLine="cat(9)=(\"تجاری\")'9";
Debug.ShouldStop(1);
main._cat.setArrayElement ((RemoteObject.createImmutable("تجاری")),BA.numberCast(int.class, 9));
 BA.debugLineNum = 194;BA.debugLine="cat(10)=(\"ادبی-هنری\")'10";
Debug.ShouldStop(2);
main._cat.setArrayElement ((RemoteObject.createImmutable("ادبی-هنری")),BA.numberCast(int.class, 10));
 BA.debugLineNum = 195;BA.debugLine="cat(11)=(\"عشق-دلنوشته\")'11";
Debug.ShouldStop(4);
main._cat.setArrayElement ((RemoteObject.createImmutable("عشق-دلنوشته")),BA.numberCast(int.class, 11));
 BA.debugLineNum = 196;BA.debugLine="cat(12)=(\"اعتقادی\")'12";
Debug.ShouldStop(8);
main._cat.setArrayElement ((RemoteObject.createImmutable("اعتقادی")),BA.numberCast(int.class, 12));
 BA.debugLineNum = 197;BA.debugLine="cat(13)=(\"شرکت ها-دفتر ها\")'13";
Debug.ShouldStop(16);
main._cat.setArrayElement ((RemoteObject.createImmutable("شرکت ها-دفتر ها")),BA.numberCast(int.class, 13));
 BA.debugLineNum = 198;BA.debugLine="cat(14)=(\"مشاغل و صنفی\")'14";
Debug.ShouldStop(32);
main._cat.setArrayElement ((RemoteObject.createImmutable("مشاغل و صنفی")),BA.numberCast(int.class, 14));
 BA.debugLineNum = 199;BA.debugLine="cat(15)=(\"ورزشی\")'15";
Debug.ShouldStop(64);
main._cat.setArrayElement ((RemoteObject.createImmutable("ورزشی")),BA.numberCast(int.class, 15));
 BA.debugLineNum = 200;BA.debugLine="cat(16)=(\"مد و زیبایی\")'16";
Debug.ShouldStop(128);
main._cat.setArrayElement ((RemoteObject.createImmutable("مد و زیبایی")),BA.numberCast(int.class, 16));
 BA.debugLineNum = 203;BA.debugLine="ostan(0)=\"همه استانها\"";
Debug.ShouldStop(1024);
main._ostan.setArrayElement (BA.ObjectToString("همه استانها"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 204;BA.debugLine="ostan(1)=\"آذربايجان شرقي\"";
Debug.ShouldStop(2048);
main._ostan.setArrayElement (BA.ObjectToString("آذربايجان شرقي"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 205;BA.debugLine="ostan(2)=\"آذربايجان غربي\"";
Debug.ShouldStop(4096);
main._ostan.setArrayElement (BA.ObjectToString("آذربايجان غربي"),BA.numberCast(int.class, 2));
 BA.debugLineNum = 206;BA.debugLine="ostan(3)=\"اردبيل\"";
Debug.ShouldStop(8192);
main._ostan.setArrayElement (BA.ObjectToString("اردبيل"),BA.numberCast(int.class, 3));
 BA.debugLineNum = 207;BA.debugLine="ostan(4)=\"اصفهان\"";
Debug.ShouldStop(16384);
main._ostan.setArrayElement (BA.ObjectToString("اصفهان"),BA.numberCast(int.class, 4));
 BA.debugLineNum = 208;BA.debugLine="ostan(5)=\"ايلام\"";
Debug.ShouldStop(32768);
main._ostan.setArrayElement (BA.ObjectToString("ايلام"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 209;BA.debugLine="ostan(6)=\"بوشهر\"";
Debug.ShouldStop(65536);
main._ostan.setArrayElement (BA.ObjectToString("بوشهر"),BA.numberCast(int.class, 6));
 BA.debugLineNum = 210;BA.debugLine="ostan(7)=\"تهران\"";
Debug.ShouldStop(131072);
main._ostan.setArrayElement (BA.ObjectToString("تهران"),BA.numberCast(int.class, 7));
 BA.debugLineNum = 211;BA.debugLine="ostan(8)=\"چهارمحال وبختياري\"";
Debug.ShouldStop(262144);
main._ostan.setArrayElement (BA.ObjectToString("چهارمحال وبختياري"),BA.numberCast(int.class, 8));
 BA.debugLineNum = 212;BA.debugLine="ostan(9)=\"خراسان جنوبي\"";
Debug.ShouldStop(524288);
main._ostan.setArrayElement (BA.ObjectToString("خراسان جنوبي"),BA.numberCast(int.class, 9));
 BA.debugLineNum = 213;BA.debugLine="ostan(10)=\"خراسان رضوي\"";
Debug.ShouldStop(1048576);
main._ostan.setArrayElement (BA.ObjectToString("خراسان رضوي"),BA.numberCast(int.class, 10));
 BA.debugLineNum = 214;BA.debugLine="ostan(11)=\"خراسان شمالي\"";
Debug.ShouldStop(2097152);
main._ostan.setArrayElement (BA.ObjectToString("خراسان شمالي"),BA.numberCast(int.class, 11));
 BA.debugLineNum = 215;BA.debugLine="ostan(12)=\"خوزستان\"";
Debug.ShouldStop(4194304);
main._ostan.setArrayElement (BA.ObjectToString("خوزستان"),BA.numberCast(int.class, 12));
 BA.debugLineNum = 216;BA.debugLine="ostan(13)=\"زنجان\"";
Debug.ShouldStop(8388608);
main._ostan.setArrayElement (BA.ObjectToString("زنجان"),BA.numberCast(int.class, 13));
 BA.debugLineNum = 217;BA.debugLine="ostan(14)=\"سمنان\"";
Debug.ShouldStop(16777216);
main._ostan.setArrayElement (BA.ObjectToString("سمنان"),BA.numberCast(int.class, 14));
 BA.debugLineNum = 218;BA.debugLine="ostan(15)=\"سيستان و بلوچستان\"";
Debug.ShouldStop(33554432);
main._ostan.setArrayElement (BA.ObjectToString("سيستان و بلوچستان"),BA.numberCast(int.class, 15));
 BA.debugLineNum = 219;BA.debugLine="ostan(17)=\"فارس\"";
Debug.ShouldStop(67108864);
main._ostan.setArrayElement (BA.ObjectToString("فارس"),BA.numberCast(int.class, 17));
 BA.debugLineNum = 220;BA.debugLine="ostan(18)=\"قزوين\"";
Debug.ShouldStop(134217728);
main._ostan.setArrayElement (BA.ObjectToString("قزوين"),BA.numberCast(int.class, 18));
 BA.debugLineNum = 221;BA.debugLine="ostan(19)=\"قم\"";
Debug.ShouldStop(268435456);
main._ostan.setArrayElement (BA.ObjectToString("قم"),BA.numberCast(int.class, 19));
 BA.debugLineNum = 222;BA.debugLine="ostan(20)=\"كردستان\"";
Debug.ShouldStop(536870912);
main._ostan.setArrayElement (BA.ObjectToString("كردستان"),BA.numberCast(int.class, 20));
 BA.debugLineNum = 223;BA.debugLine="ostan(21)=\"كرمان\"";
Debug.ShouldStop(1073741824);
main._ostan.setArrayElement (BA.ObjectToString("كرمان"),BA.numberCast(int.class, 21));
 BA.debugLineNum = 224;BA.debugLine="ostan(22)=\"كرمانشاه\"";
Debug.ShouldStop(-2147483648);
main._ostan.setArrayElement (BA.ObjectToString("كرمانشاه"),BA.numberCast(int.class, 22));
 BA.debugLineNum = 226;BA.debugLine="ostan(23)=\"كهگيلويه وبوير احمد\"";
Debug.ShouldStop(2);
main._ostan.setArrayElement (BA.ObjectToString("كهگيلويه وبوير احمد"),BA.numberCast(int.class, 23));
 BA.debugLineNum = 227;BA.debugLine="ostan(24)=\"گلستان\"";
Debug.ShouldStop(4);
main._ostan.setArrayElement (BA.ObjectToString("گلستان"),BA.numberCast(int.class, 24));
 BA.debugLineNum = 228;BA.debugLine="ostan(25)=\"گيلان\"";
Debug.ShouldStop(8);
main._ostan.setArrayElement (BA.ObjectToString("گيلان"),BA.numberCast(int.class, 25));
 BA.debugLineNum = 229;BA.debugLine="ostan(26)=\"لرستان\"";
Debug.ShouldStop(16);
main._ostan.setArrayElement (BA.ObjectToString("لرستان"),BA.numberCast(int.class, 26));
 BA.debugLineNum = 230;BA.debugLine="ostan(27)=\"مازندران\"";
Debug.ShouldStop(32);
main._ostan.setArrayElement (BA.ObjectToString("مازندران"),BA.numberCast(int.class, 27));
 BA.debugLineNum = 231;BA.debugLine="ostan(28)=\"مركزي\"";
Debug.ShouldStop(64);
main._ostan.setArrayElement (BA.ObjectToString("مركزي"),BA.numberCast(int.class, 28));
 BA.debugLineNum = 232;BA.debugLine="ostan(29)=\"هرمزگان\"";
Debug.ShouldStop(128);
main._ostan.setArrayElement (BA.ObjectToString("هرمزگان"),BA.numberCast(int.class, 29));
 BA.debugLineNum = 233;BA.debugLine="ostan(30)=\"همدان\"";
Debug.ShouldStop(256);
main._ostan.setArrayElement (BA.ObjectToString("همدان"),BA.numberCast(int.class, 30));
 BA.debugLineNum = 234;BA.debugLine="ostan(31)=\"يزد\"";
Debug.ShouldStop(512);
main._ostan.setArrayElement (BA.ObjectToString("يزد"),BA.numberCast(int.class, 31));
 BA.debugLineNum = 236;BA.debugLine="font =Typeface.LoadFromAssets(\"yekan.ttf\")";
Debug.ShouldStop(2048);
main._font.setObject(main.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("yekan.ttf"))));
 BA.debugLineNum = 241;BA.debugLine="Sticker.Typeface =font";
Debug.ShouldStop(65536);
main.mostCurrent._sticker.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 242;BA.debugLine="Sticker.TextSize =15";
Debug.ShouldStop(131072);
main.mostCurrent._sticker.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 243;BA.debugLine="Group.Typeface =font";
Debug.ShouldStop(262144);
main.mostCurrent._group.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 244;BA.debugLine="Group.TextSize =15";
Debug.ShouldStop(524288);
main.mostCurrent._group.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 245;BA.debugLine="Channel.Typeface = font";
Debug.ShouldStop(1048576);
main.mostCurrent._channel.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 246;BA.debugLine="Channel.TextSize = 15";
Debug.ShouldStop(2097152);
main.mostCurrent._channel.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 250;BA.debugLine="ButtonSearchId.Typeface=font";
Debug.ShouldStop(33554432);
main.mostCurrent._buttonsearchid.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 251;BA.debugLine="ButtonSearchId.TextSize=15";
Debug.ShouldStop(67108864);
main.mostCurrent._buttonsearchid.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 252;BA.debugLine="ButtonAddId.Typeface=font";
Debug.ShouldStop(134217728);
main.mostCurrent._buttonaddid.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 253;BA.debugLine="ButtonAddId.TextSize=15";
Debug.ShouldStop(268435456);
main.mostCurrent._buttonaddid.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 254;BA.debugLine="ButtonTopJoinGroup.Typeface=font";
Debug.ShouldStop(536870912);
main.mostCurrent._buttontopjoingroup.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 255;BA.debugLine="ButtonTopJoinGroup.TextSize=15";
Debug.ShouldStop(1073741824);
main.mostCurrent._buttontopjoingroup.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 256;BA.debugLine="ButtonTopGroup.Typeface=font";
Debug.ShouldStop(-2147483648);
main.mostCurrent._buttontopgroup.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 257;BA.debugLine="ButtonTopGroup.TextSize=15";
Debug.ShouldStop(1);
main.mostCurrent._buttontopgroup.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 258;BA.debugLine="ButtonLastGroup.Typeface=font";
Debug.ShouldStop(2);
main.mostCurrent._buttonlastgroup.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 259;BA.debugLine="ButtonLastGroup.TextSize=15";
Debug.ShouldStop(4);
main.mostCurrent._buttonlastgroup.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 260;BA.debugLine="ButtonSearchGroup.Typeface=font";
Debug.ShouldStop(8);
main.mostCurrent._buttonsearchgroup.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 261;BA.debugLine="ButtonSearchGroup.TextSize=15";
Debug.ShouldStop(16);
main.mostCurrent._buttonsearchgroup.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 262;BA.debugLine="ButtonAddGroup.Typeface=font";
Debug.ShouldStop(32);
main.mostCurrent._buttonaddgroup.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 263;BA.debugLine="ButtonAddGroup.TextSize=15";
Debug.ShouldStop(64);
main.mostCurrent._buttonaddgroup.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 265;BA.debugLine="ButtonVIPChannel.Typeface=font";
Debug.ShouldStop(256);
main.mostCurrent._buttonvipchannel.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 266;BA.debugLine="ButtonVIPChannel.TextSize=15";
Debug.ShouldStop(512);
main.mostCurrent._buttonvipchannel.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 268;BA.debugLine="ButtonSuperGroup.Typeface=font";
Debug.ShouldStop(2048);
main.mostCurrent._buttonsupergroup.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 269;BA.debugLine="ButtonSuperGroup.TextSize=15";
Debug.ShouldStop(4096);
main.mostCurrent._buttonsupergroup.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 273;BA.debugLine="ButtonInsertSuperGroup.Typeface=font";
Debug.ShouldStop(65536);
main.mostCurrent._buttoninsertsupergroup.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 274;BA.debugLine="ButtonInsertSuperGroup.TextSize=15";
Debug.ShouldStop(131072);
main.mostCurrent._buttoninsertsupergroup.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 277;BA.debugLine="ButtonMyGroup.Typeface=font";
Debug.ShouldStop(1048576);
main.mostCurrent._buttonmygroup.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 278;BA.debugLine="ButtonMyGroup.TextSize=15";
Debug.ShouldStop(2097152);
main.mostCurrent._buttonmygroup.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 281;BA.debugLine="ButtonMyChannel.Typeface=font";
Debug.ShouldStop(16777216);
main.mostCurrent._buttonmychannel.runMethod(false,"setTypeface",(main._font.getObject()));
 BA.debugLineNum = 282;BA.debugLine="ButtonMyChannel.TextSize=15";
Debug.ShouldStop(33554432);
main.mostCurrent._buttonmychannel.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 287;BA.debugLine="groupIcon.Initialize(File.DirAssets, \"group_icon.";
Debug.ShouldStop(1073741824);
main._groupicon.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("group_icon.png")));
 BA.debugLineNum = 288;BA.debugLine="stickerIcon.Initialize(File.DirAssets, \"sticker_i";
Debug.ShouldStop(-2147483648);
main._stickericon.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("sticker_icon.png")));
 BA.debugLineNum = 289;BA.debugLine="idIcon.Initialize(File.DirAssets, \"id_icon.png\")";
Debug.ShouldStop(1);
main._idicon.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("id_icon.png")));
 BA.debugLineNum = 290;BA.debugLine="robotIcon.Initialize(File.DirAssets, \"robot_icon.";
Debug.ShouldStop(2);
main._roboticon.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("robot_icon.png")));
 BA.debugLineNum = 291;BA.debugLine="channelIcon.Initialize(File.DirAssets, \"channel_i";
Debug.ShouldStop(4);
main._channelicon.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("channel_icon.png")));
 BA.debugLineNum = 292;BA.debugLine="rightBitmap.Initialize(File.DirAssets,\"right237.p";
Debug.ShouldStop(8);
main._rightbitmap.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("right237.png")));
 BA.debugLineNum = 295;BA.debugLine="ImageView1.Bitmap = rightBitmap";
Debug.ShouldStop(64);
main.mostCurrent._imageview1.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 296;BA.debugLine="ImageView21.Bitmap = rightBitmap";
Debug.ShouldStop(128);
main.mostCurrent._imageview21.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 297;BA.debugLine="ImageView22.Bitmap = rightBitmap";
Debug.ShouldStop(256);
main.mostCurrent._imageview22.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 298;BA.debugLine="ImageView23.Bitmap = rightBitmap";
Debug.ShouldStop(512);
main.mostCurrent._imageview23.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 299;BA.debugLine="ImageView24.Bitmap = rightBitmap";
Debug.ShouldStop(1024);
main.mostCurrent._imageview24.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 300;BA.debugLine="ImageView25.Bitmap = rightBitmap";
Debug.ShouldStop(2048);
main.mostCurrent._imageview25.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 301;BA.debugLine="ImageView26.Bitmap = rightBitmap";
Debug.ShouldStop(4096);
main.mostCurrent._imageview26.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 302;BA.debugLine="ImageView15.Bitmap = rightBitmap";
Debug.ShouldStop(8192);
main.mostCurrent._imageview15.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 303;BA.debugLine="ImageView16.Bitmap = rightBitmap";
Debug.ShouldStop(16384);
main.mostCurrent._imageview16.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 304;BA.debugLine="ImageView17.Bitmap = rightBitmap";
Debug.ShouldStop(32768);
main.mostCurrent._imageview17.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 305;BA.debugLine="ImageView18.Bitmap = rightBitmap";
Debug.ShouldStop(65536);
main.mostCurrent._imageview18.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 306;BA.debugLine="ImageView19.Bitmap = rightBitmap";
Debug.ShouldStop(131072);
main.mostCurrent._imageview19.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 307;BA.debugLine="ImageView20.Bitmap = rightBitmap";
Debug.ShouldStop(262144);
main.mostCurrent._imageview20.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 308;BA.debugLine="ImageView10.Bitmap = rightBitmap";
Debug.ShouldStop(524288);
main.mostCurrent._imageview10.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 309;BA.debugLine="ImageView11.Bitmap = rightBitmap";
Debug.ShouldStop(1048576);
main.mostCurrent._imageview11.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 310;BA.debugLine="ImageView12.Bitmap = rightBitmap";
Debug.ShouldStop(2097152);
main.mostCurrent._imageview12.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 311;BA.debugLine="ImageView13.Bitmap = rightBitmap";
Debug.ShouldStop(4194304);
main.mostCurrent._imageview13.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 312;BA.debugLine="ImageView14.Bitmap = rightBitmap";
Debug.ShouldStop(8388608);
main.mostCurrent._imageview14.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 313;BA.debugLine="ImageView6.Bitmap = rightBitmap";
Debug.ShouldStop(16777216);
main.mostCurrent._imageview6.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 314;BA.debugLine="ImageView7.Bitmap = rightBitmap";
Debug.ShouldStop(33554432);
main.mostCurrent._imageview7.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 315;BA.debugLine="ImageView8.Bitmap = rightBitmap";
Debug.ShouldStop(67108864);
main.mostCurrent._imageview8.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 316;BA.debugLine="ImageView9.Bitmap = rightBitmap";
Debug.ShouldStop(134217728);
main.mostCurrent._imageview9.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 317;BA.debugLine="ImageView2.Bitmap = rightBitmap";
Debug.ShouldStop(268435456);
main.mostCurrent._imageview2.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 318;BA.debugLine="ImageView3.Bitmap = rightBitmap";
Debug.ShouldStop(536870912);
main.mostCurrent._imageview3.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 319;BA.debugLine="ImageView4.Bitmap = rightBitmap";
Debug.ShouldStop(1073741824);
main.mostCurrent._imageview4.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 320;BA.debugLine="ImageView5.Bitmap = rightBitmap";
Debug.ShouldStop(-2147483648);
main.mostCurrent._imageview5.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 322;BA.debugLine="ImageView27.Bitmap = rightBitmap";
Debug.ShouldStop(2);
main.mostCurrent._imageview27.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 324;BA.debugLine="ImageView29.Bitmap = rightBitmap";
Debug.ShouldStop(8);
main.mostCurrent._imageview29.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 325;BA.debugLine="ImageView30.Bitmap = rightBitmap";
Debug.ShouldStop(16);
main.mostCurrent._imageview30.runMethod(false,"setBitmap",(main._rightbitmap.getObject()));
 BA.debugLineNum = 328;BA.debugLine="PanelGroupContainer.RemoveView()";
Debug.ShouldStop(128);
main.mostCurrent._panelgroupcontainer.runVoidMethod ("RemoveView");
 BA.debugLineNum = 329;BA.debugLine="ScrollViewGroup.Panel.AddView(PanelGroupContainer";
Debug.ShouldStop(256);
main.mostCurrent._scrollviewgroup.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((main.mostCurrent._panelgroupcontainer.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._panelgroupcontainer.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panelgroupcontainer.runMethod(true,"getHeight")));
 BA.debugLineNum = 330;BA.debugLine="ScrollViewGroup.Panel.Height =450dip";
Debug.ShouldStop(512);
main.mostCurrent._scrollviewgroup.runMethod(false,"getPanel").runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 450))));
 BA.debugLineNum = 331;BA.debugLine="ScrollViewGroup.Panel.Color=Colors.White";
Debug.ShouldStop(1024);
main.mostCurrent._scrollviewgroup.runMethod(false,"getPanel").runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 333;BA.debugLine="PanelStickerContainer.RemoveView";
Debug.ShouldStop(4096);
main.mostCurrent._panelstickercontainer.runVoidMethod ("RemoveView");
 BA.debugLineNum = 334;BA.debugLine="ScrollViewSticker.Panel.AddView(PanelStickerConta";
Debug.ShouldStop(8192);
main.mostCurrent._scrollviewsticker.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((main.mostCurrent._panelstickercontainer.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._panelstickercontainer.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panelstickercontainer.runMethod(true,"getHeight")));
 BA.debugLineNum = 335;BA.debugLine="ScrollViewSticker.Panel.Height =410dip";
Debug.ShouldStop(16384);
main.mostCurrent._scrollviewsticker.runMethod(false,"getPanel").runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 410))));
 BA.debugLineNum = 336;BA.debugLine="ScrollViewSticker.Panel.Color=Colors.White";
Debug.ShouldStop(32768);
main.mostCurrent._scrollviewsticker.runMethod(false,"getPanel").runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 338;BA.debugLine="PanelChannelContainer.RemoveView()";
Debug.ShouldStop(131072);
main.mostCurrent._panelchannelcontainer.runVoidMethod ("RemoveView");
 BA.debugLineNum = 339;BA.debugLine="ScrollViewChannel.Panel.AddView(PanelChannelConta";
Debug.ShouldStop(262144);
main.mostCurrent._scrollviewchannel.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((main.mostCurrent._panelchannelcontainer.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent._panelchannelcontainer.runMethod(true,"getWidth")),(Object)(main.mostCurrent._panelchannelcontainer.runMethod(true,"getHeight")));
 BA.debugLineNum = 340;BA.debugLine="ScrollViewChannel.Panel.Height =410dip";
Debug.ShouldStop(524288);
main.mostCurrent._scrollviewchannel.runMethod(false,"getPanel").runMethod(true,"setHeight",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 410))));
 BA.debugLineNum = 341;BA.debugLine="ScrollViewChannel.Panel.Color=Colors.White";
Debug.ShouldStop(1048576);
main.mostCurrent._scrollviewchannel.runMethod(false,"getPanel").runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 345;BA.debugLine="If(FirstTime = True ) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_firsttime,main.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 346;BA.debugLine="checkRegister";
Debug.ShouldStop(33554432);
_checkregister();
 };
 BA.debugLineNum = 351;BA.debugLine="readInfo";
Debug.ShouldStop(1073741824);
_readinfo();
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,621);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 621;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 623;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,617);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 617;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
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
public static RemoteObject  _btnabout_click() throws Exception{
try {
		Debug.PushSubsStack("btnAbout_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,158);
if (RapidSub.canDelegate("btnabout_click")) return main.remoteMe.runUserSub(false, "main","btnabout_click");
 BA.debugLineNum = 158;BA.debugLine="Sub btnAbout_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="StartActivity(\"aboutAct\")";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("aboutAct"))));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlastgroup_click() throws Exception{
try {
		Debug.PushSubsStack("btnLastGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,625);
if (RapidSub.canDelegate("btnlastgroup_click")) return main.remoteMe.runUserSub(false, "main","btnlastgroup_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 625;BA.debugLine="Sub btnLastGroup_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 626;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 627;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(262144);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 628;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 629;BA.debugLine="job.Initialize(\"last_group\", Me)";
Debug.ShouldStop(1048576);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("last_group")),(Object)(main.getObject()));
 BA.debugLineNum = 631;BA.debugLine="query =\"http://www.aloosalam.ir/index.php/mobile";
Debug.ShouldStop(4194304);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 632;BA.debugLine="parameter  = \"pass=1266&type=group&sort=last\" &";
Debug.ShouldStop(8388608);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=group&sort=last"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 634;BA.debugLine="job.PostString(query, parameter)";
Debug.ShouldStop(33554432);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e380) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e380.toString()); BA.debugLineNum = 636;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 638;BA.debugLine="End Sub";
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
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,153);
if (RapidSub.canDelegate("btnmenu_click")) return main.remoteMe.runUserSub(false, "main","btnmenu_click");
 BA.debugLineNum = 153;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="navi.OpenDrawer2(navi.GRAVITY_RIGHT)";
Debug.ShouldStop(33554432);
main.mostCurrent._navi.runVoidMethod ("OpenDrawer2",(Object)(main.mostCurrent._navi.getField(true,"GRAVITY_RIGHT")));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
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
public static RemoteObject  _btnpanel_click() throws Exception{
try {
		Debug.PushSubsStack("btnPanel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1000);
if (RapidSub.canDelegate("btnpanel_click")) return main.remoteMe.runUserSub(false, "main","btnpanel_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 1000;BA.debugLine="Sub btnPanel_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1001;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 1002;BA.debugLine="Msgbox(\"نام کاربری شما :\" & userInfo.Get(\"user_na";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("نام کاربری شما :"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" رمز عبور اولیه شما "),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable(" می باشد"))),(Object)(RemoteObject.createImmutable("رمز عبور")),main.mostCurrent.activityBA);
 BA.debugLineNum = 1005;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/"))))));
 BA.debugLineNum = 1006;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(8192);
main.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 1007;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonaddchannel_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAddChannel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,770);
if (RapidSub.canDelegate("buttonaddchannel_click")) return main.remoteMe.runUserSub(false, "main","buttonaddchannel_click");
 BA.debugLineNum = 770;BA.debugLine="Sub ButtonAddChannel_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 772;BA.debugLine="If (todayInsertCount >8 ) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean(">",main._todayinsertcount,BA.numberCast(double.class, 8)))) { 
 BA.debugLineNum = 773;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از هشت گروه یا کانا";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("روزانه امکان ثبت بیش از هشت گروه یا کانال وجود ندارد. ")),(Object)(RemoteObject.createImmutable("عدم دسترسی")),main.mostCurrent.activityBA);
 BA.debugLineNum = 774;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 776;BA.debugLine="isEdit =False";
Debug.ShouldStop(128);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 777;BA.debugLine="selectedType = \"channel\"";
Debug.ShouldStop(256);
main._selectedtype = BA.ObjectToString("channel");
 BA.debugLineNum = 778;BA.debugLine="selectedTypeTitle = \"کانال\"";
Debug.ShouldStop(512);
main._selectedtypetitle = BA.ObjectToString("کانال");
 BA.debugLineNum = 780;BA.debugLine="isEdit =False";
Debug.ShouldStop(2048);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 781;BA.debugLine="StartActivity(\"insertAct\")";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("insertAct"))));
 BA.debugLineNum = 783;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonaddgroup_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAddGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,922);
if (RapidSub.canDelegate("buttonaddgroup_click")) return main.remoteMe.runUserSub(false, "main","buttonaddgroup_click");
 BA.debugLineNum = 922;BA.debugLine="Sub ButtonAddGroup_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 923;BA.debugLine="isEdit =False";
Debug.ShouldStop(67108864);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 924;BA.debugLine="If (todayInsertCount >8 ) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean(">",main._todayinsertcount,BA.numberCast(double.class, 8)))) { 
 BA.debugLineNum = 925;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از هشت گروه یا کانا";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("روزانه امکان ثبت بیش از هشت گروه یا کانال  وجود ندارد.این مورد برای جلوگیری از اسپم می باشد .  ")),(Object)(RemoteObject.createImmutable("عدم دسترسی")),main.mostCurrent.activityBA);
 BA.debugLineNum = 927;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 929;BA.debugLine="isSuperGroup=False";
Debug.ShouldStop(1);
main._issupergroup = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 930;BA.debugLine="selectedType = \"group\"";
Debug.ShouldStop(2);
main._selectedtype = BA.ObjectToString("group");
 BA.debugLineNum = 931;BA.debugLine="selectedTypeTitle = \"گروه \"";
Debug.ShouldStop(4);
main._selectedtypetitle = BA.ObjectToString("گروه ");
 BA.debugLineNum = 932;BA.debugLine="StartActivity(\"insertAct\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("insertAct"))));
 BA.debugLineNum = 933;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonaddid_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAddId_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,878);
if (RapidSub.canDelegate("buttonaddid_click")) return main.remoteMe.runUserSub(false, "main","buttonaddid_click");
 BA.debugLineNum = 878;BA.debugLine="Sub ButtonAddId_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 881;BA.debugLine="isEdit =False";
Debug.ShouldStop(65536);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 882;BA.debugLine="selectedType = \"id\"";
Debug.ShouldStop(131072);
main._selectedtype = BA.ObjectToString("id");
 BA.debugLineNum = 883;BA.debugLine="selectedTypeTitle = \"آی دی \"";
Debug.ShouldStop(262144);
main._selectedtypetitle = BA.ObjectToString("آی دی ");
 BA.debugLineNum = 884;BA.debugLine="StartActivity(\"insertAct\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("insertAct"))));
 BA.debugLineNum = 886;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonaddrobot_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAddRobot_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,819);
if (RapidSub.canDelegate("buttonaddrobot_click")) return main.remoteMe.runUserSub(false, "main","buttonaddrobot_click");
 BA.debugLineNum = 819;BA.debugLine="Sub ButtonAddRobot_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 821;BA.debugLine="isEdit =False";
Debug.ShouldStop(1048576);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 822;BA.debugLine="selectedType = \"robot\"";
Debug.ShouldStop(2097152);
main._selectedtype = BA.ObjectToString("robot");
 BA.debugLineNum = 823;BA.debugLine="selectedTypeTitle = \"ربات\"";
Debug.ShouldStop(4194304);
main._selectedtypetitle = BA.ObjectToString("ربات");
 BA.debugLineNum = 825;BA.debugLine="isEdit =False";
Debug.ShouldStop(16777216);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 826;BA.debugLine="isEdit =False";
Debug.ShouldStop(33554432);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 827;BA.debugLine="StartActivity(\"insertAct\")";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("insertAct"))));
 BA.debugLineNum = 828;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonaddsticker_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonAddSticker_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,712);
if (RapidSub.canDelegate("buttonaddsticker_click")) return main.remoteMe.runUserSub(false, "main","buttonaddsticker_click");
 BA.debugLineNum = 712;BA.debugLine="Sub ButtonAddSticker_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 714;BA.debugLine="isEdit =False";
Debug.ShouldStop(512);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 715;BA.debugLine="selectedType = \"sticker\"";
Debug.ShouldStop(1024);
main._selectedtype = BA.ObjectToString("sticker");
 BA.debugLineNum = 717;BA.debugLine="selectedTypeTitle = \"استیکر\"";
Debug.ShouldStop(4096);
main._selectedtypetitle = BA.ObjectToString("استیکر");
 BA.debugLineNum = 718;BA.debugLine="StartActivity(\"insertAct\")";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("insertAct"))));
 BA.debugLineNum = 719;BA.debugLine="End Sub";
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
public static RemoteObject  _buttoninsertsupergroup_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonInsertSuperGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1070);
if (RapidSub.canDelegate("buttoninsertsupergroup_click")) return main.remoteMe.runUserSub(false, "main","buttoninsertsupergroup_click");
 BA.debugLineNum = 1070;BA.debugLine="Sub ButtonInsertSuperGroup_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1072;BA.debugLine="If (vipInsertCount >4 ) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean(">",main._vipinsertcount,BA.numberCast(double.class, 4)))) { 
 BA.debugLineNum = 1073;BA.debugLine="Msgbox(\"روزانه امکان ثبت بیش از چهار سوپر گروه و";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("روزانه امکان ثبت بیش از چهار سوپر گروه وجود ندارد. ")),(Object)(RemoteObject.createImmutable("عدم دسترسی")),main.mostCurrent.activityBA);
 BA.debugLineNum = 1074;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1076;BA.debugLine="isEdit =False";
Debug.ShouldStop(524288);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1077;BA.debugLine="selectedType = \"group\"";
Debug.ShouldStop(1048576);
main._selectedtype = BA.ObjectToString("group");
 BA.debugLineNum = 1078;BA.debugLine="selectedTypeTitle = \"سوپر گروه \"";
Debug.ShouldStop(2097152);
main._selectedtypetitle = BA.ObjectToString("سوپر گروه ");
 BA.debugLineNum = 1080;BA.debugLine="isEdit =False";
Debug.ShouldStop(8388608);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1081;BA.debugLine="isSuperGroup=True";
Debug.ShouldStop(16777216);
main._issupergroup = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1082;BA.debugLine="StartActivity(\"insertAct\")";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("insertAct"))));
 BA.debugLineNum = 1083;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonlastchannel_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLastChannel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,791);
if (RapidSub.canDelegate("buttonlastchannel_click")) return main.remoteMe.runUserSub(false, "main","buttonlastchannel_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 791;BA.debugLine="Sub ButtonLastChannel_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 792;BA.debugLine="isEdit =False";
Debug.ShouldStop(8388608);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 793;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 794;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(33554432);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 795;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 796;BA.debugLine="job.Initialize(\"last_channel\", Me)";
Debug.ShouldStop(134217728);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("last_channel")),(Object)(main.getObject()));
 BA.debugLineNum = 797;BA.debugLine="query =\"http://www.aloosalam.ir/index.php/mobile";
Debug.ShouldStop(268435456);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 798;BA.debugLine="parameter=\"pass=1266&type=channel&sort=last\"  &";
Debug.ShouldStop(536870912);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=channel&sort=last"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 799;BA.debugLine="job.PostString(query,parameter)";
Debug.ShouldStop(1073741824);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e500) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e500.toString()); BA.debugLineNum = 801;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 803;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonlastgroup_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLastGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,941);
if (RapidSub.canDelegate("buttonlastgroup_click")) return main.remoteMe.runUserSub(false, "main","buttonlastgroup_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 941;BA.debugLine="Sub ButtonLastGroup_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 942;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 943;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(16384);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 944;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 945;BA.debugLine="job.Initialize(\"last_group\", Me)";
Debug.ShouldStop(65536);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("last_group")),(Object)(main.getObject()));
 BA.debugLineNum = 946;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(131072);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 947;BA.debugLine="parameter=\"pass=1266&type=group&sort=last\" & \"&u";
Debug.ShouldStop(262144);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=group&sort=last"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 948;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(524288);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e633) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e633.toString()); BA.debugLineNum = 950;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 952;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonlastid_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLastId_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,894);
if (RapidSub.canDelegate("buttonlastid_click")) return main.remoteMe.runUserSub(false, "main","buttonlastid_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 894;BA.debugLine="Sub ButtonLastId_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 895;BA.debugLine="isEdit =False";
Debug.ShouldStop(1073741824);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 896;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 897;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 898;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 899;BA.debugLine="job.Initialize(\"last_id\", Me)";
Debug.ShouldStop(4);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("last_id")),(Object)(main.getObject()));
 BA.debugLineNum = 900;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(8);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 901;BA.debugLine="parameter=\"pass=1266&type=id&sort=last\" & \"&user";
Debug.ShouldStop(16);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=id&sort=last"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 902;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(32);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e591) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e591.toString()); BA.debugLineNum = 904;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 906;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonlastrobot_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLastRobot_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,837);
if (RapidSub.canDelegate("buttonlastrobot_click")) return main.remoteMe.runUserSub(false, "main","buttonlastrobot_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 837;BA.debugLine="Sub ButtonLastRobot_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 838;BA.debugLine="isEdit =False";
Debug.ShouldStop(32);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 839;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 840;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(128);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 841;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 842;BA.debugLine="job.Initialize(\"last_robot\", Me)";
Debug.ShouldStop(512);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("last_robot")),(Object)(main.getObject()));
 BA.debugLineNum = 843;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(1024);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 844;BA.debugLine="parameter=\"pass=1266&type=robot&sort=last\" & \"&u";
Debug.ShouldStop(2048);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=robot&sort=last"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 845;BA.debugLine="job.PostString(query, parameter)";
Debug.ShouldStop(4096);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e540) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e540.toString()); BA.debugLineNum = 847;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
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
public static RemoteObject  _buttonlaststicker_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonLastSticker_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,729);
if (RapidSub.canDelegate("buttonlaststicker_click")) return main.remoteMe.runUserSub(false, "main","buttonlaststicker_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 729;BA.debugLine="Sub ButtonLastSticker_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 730;BA.debugLine="isEdit =False";
Debug.ShouldStop(33554432);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 731;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 732;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(134217728);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 733;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 734;BA.debugLine="job.Initialize(\"last_sticker\", Me)";
Debug.ShouldStop(536870912);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("last_sticker")),(Object)(main.getObject()));
 BA.debugLineNum = 735;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(1073741824);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 737;BA.debugLine="parameter  =\"pass=1266&type=sticker&sort=last\" &";
Debug.ShouldStop(1);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=sticker&sort=last"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 738;BA.debugLine="job.PostString(query,parameter)";
Debug.ShouldStop(2);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e444) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e444.toString()); BA.debugLineNum = 740;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 742;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonmenu_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMenu_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,968);
if (RapidSub.canDelegate("buttonmenu_click")) return main.remoteMe.runUserSub(false, "main","buttonmenu_click");
 BA.debugLineNum = 968;BA.debugLine="Sub ButtonMenu_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 972;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonmychannel_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMyChannel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1084);
if (RapidSub.canDelegate("buttonmychannel_click")) return main.remoteMe.runUserSub(false, "main","buttonmychannel_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 1084;BA.debugLine="Sub ButtonMyChannel_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1086;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 1087;BA.debugLine="isEdit =True";
Debug.ShouldStop(1073741824);
main._isedit = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1088;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(-2147483648);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1089;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 1090;BA.debugLine="job.Initialize(\"my_channel\", Me)";
Debug.ShouldStop(2);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("my_channel")),(Object)(main.getObject()));
 BA.debugLineNum = 1091;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(4);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 1092;BA.debugLine="parameter=\"pass=1266&type=channel&sort=my\" & \"&u";
Debug.ShouldStop(8);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=channel&sort=my"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 1093;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(16);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e755) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e755.toString()); BA.debugLineNum = 1095;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1097;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonmygroup_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonMyGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1056);
if (RapidSub.canDelegate("buttonmygroup_click")) return main.remoteMe.runUserSub(false, "main","buttonmygroup_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 1056;BA.debugLine="Sub ButtonMyGroup_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1057;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 1058;BA.debugLine="isEdit =True";
Debug.ShouldStop(2);
main._isedit = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1059;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(4);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1060;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 1061;BA.debugLine="job.Initialize(\"my_group\", Me)";
Debug.ShouldStop(16);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("my_group")),(Object)(main.getObject()));
 BA.debugLineNum = 1062;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(32);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 1063;BA.debugLine="parameter=\"pass=1266&type=group&sort=my\" & \"&use";
Debug.ShouldStop(64);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=group&sort=my"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 1064;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(128);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e730) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e730.toString()); BA.debugLineNum = 1066;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1068;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonsearchchannel_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSearchChannel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,784);
if (RapidSub.canDelegate("buttonsearchchannel_click")) return main.remoteMe.runUserSub(false, "main","buttonsearchchannel_click");
 BA.debugLineNum = 784;BA.debugLine="Sub ButtonSearchChannel_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 785;BA.debugLine="isEdit =False";
Debug.ShouldStop(65536);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 786;BA.debugLine="selectedType = \"channel\"";
Debug.ShouldStop(131072);
main._selectedtype = BA.ObjectToString("channel");
 BA.debugLineNum = 787;BA.debugLine="selectedTypeTitle = \"کانال\"";
Debug.ShouldStop(262144);
main._selectedtypetitle = BA.ObjectToString("کانال");
 BA.debugLineNum = 788;BA.debugLine="StartActivity(\"searchAct\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("searchAct"))));
 BA.debugLineNum = 790;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonsearchgroup_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSearchGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,935);
if (RapidSub.canDelegate("buttonsearchgroup_click")) return main.remoteMe.runUserSub(false, "main","buttonsearchgroup_click");
 BA.debugLineNum = 935;BA.debugLine="Sub ButtonSearchGroup_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 936;BA.debugLine="isEdit =False";
Debug.ShouldStop(128);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 937;BA.debugLine="selectedType = \"group\"";
Debug.ShouldStop(256);
main._selectedtype = BA.ObjectToString("group");
 BA.debugLineNum = 938;BA.debugLine="selectedTypeTitle = \"گروه \"";
Debug.ShouldStop(512);
main._selectedtypetitle = BA.ObjectToString("گروه ");
 BA.debugLineNum = 939;BA.debugLine="StartActivity(\"searchAct\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("searchAct"))));
 BA.debugLineNum = 940;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonsearchid_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSearchId_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,887);
if (RapidSub.canDelegate("buttonsearchid_click")) return main.remoteMe.runUserSub(false, "main","buttonsearchid_click");
 BA.debugLineNum = 887;BA.debugLine="Sub ButtonSearchId_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 888;BA.debugLine="isEdit =False";
Debug.ShouldStop(8388608);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 889;BA.debugLine="selectedType = \"id\"";
Debug.ShouldStop(16777216);
main._selectedtype = BA.ObjectToString("id");
 BA.debugLineNum = 890;BA.debugLine="selectedTypeTitle = \"آی دی \"";
Debug.ShouldStop(33554432);
main._selectedtypetitle = BA.ObjectToString("آی دی ");
 BA.debugLineNum = 891;BA.debugLine="StartActivity(\"searchAct\")";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("searchAct"))));
 BA.debugLineNum = 893;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonsearchrobot_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSearchRobot_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,829);
if (RapidSub.canDelegate("buttonsearchrobot_click")) return main.remoteMe.runUserSub(false, "main","buttonsearchrobot_click");
 BA.debugLineNum = 829;BA.debugLine="Sub ButtonSearchRobot_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 831;BA.debugLine="isEdit =False";
Debug.ShouldStop(1073741824);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 832;BA.debugLine="selectedType = \"robot\"";
Debug.ShouldStop(-2147483648);
main._selectedtype = BA.ObjectToString("robot");
 BA.debugLineNum = 833;BA.debugLine="selectedTypeTitle = \"ربات\"";
Debug.ShouldStop(1);
main._selectedtypetitle = BA.ObjectToString("ربات");
 BA.debugLineNum = 834;BA.debugLine="StartActivity(\"searchAct\")";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("searchAct"))));
 BA.debugLineNum = 836;BA.debugLine="End Sub";
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
public static RemoteObject  _buttonsearchsticker_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSearchSticker_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,721);
if (RapidSub.canDelegate("buttonsearchsticker_click")) return main.remoteMe.runUserSub(false, "main","buttonsearchsticker_click");
 BA.debugLineNum = 721;BA.debugLine="Sub ButtonSearchSticker_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 722;BA.debugLine="isEdit =False";
Debug.ShouldStop(131072);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 723;BA.debugLine="selectedType = \"sticker\"";
Debug.ShouldStop(262144);
main._selectedtype = BA.ObjectToString("sticker");
 BA.debugLineNum = 725;BA.debugLine="selectedTypeTitle = \"استیکر\"";
Debug.ShouldStop(1048576);
main._selectedtypetitle = BA.ObjectToString("استیکر");
 BA.debugLineNum = 726;BA.debugLine="StartActivity(\"searchAct\")";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("searchAct"))));
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
public static RemoteObject  _buttonsupergroup_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonSuperGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1028);
if (RapidSub.canDelegate("buttonsupergroup_click")) return main.remoteMe.runUserSub(false, "main","buttonsupergroup_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 1028;BA.debugLine="Sub ButtonSuperGroup_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1030;BA.debugLine="isEdit =False";
Debug.ShouldStop(32);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1031;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 1032;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(128);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1033;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 1034;BA.debugLine="job.Initialize(\"super_group\", Me)";
Debug.ShouldStop(512);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("super_group")),(Object)(main.getObject()));
 BA.debugLineNum = 1035;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(1024);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 1036;BA.debugLine="parameter=\"pass=1266&type=group&sort=super\" & \"&";
Debug.ShouldStop(2048);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=group&sort=super"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 1037;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(4096);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e704) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e704.toString()); BA.debugLineNum = 1039;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1041;BA.debugLine="End Sub";
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
public static RemoteObject  _buttontopchannellike_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopChannelLike_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1118);
if (RapidSub.canDelegate("buttontopchannellike_click")) return main.remoteMe.runUserSub(false, "main","buttontopchannellike_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 1118;BA.debugLine="Sub ButtonTopChannelLike_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1120;BA.debugLine="isEdit =False";
Debug.ShouldStop(-2147483648);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1121;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 1122;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1123;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 1124;BA.debugLine="job.Initialize(\"topJoin_channel\", Me)";
Debug.ShouldStop(8);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topJoin_channel")),(Object)(main.getObject()));
 BA.debugLineNum = 1125;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(16);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 1126;BA.debugLine="parameter=\"pass=1266&type=channel&sort=topJoin\"";
Debug.ShouldStop(32);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=channel&sort=topJoin"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 1127;BA.debugLine="job.PostString(query, parameter)";
Debug.ShouldStop(64);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e785) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e785.toString()); BA.debugLineNum = 1129;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1131;BA.debugLine="End Sub";
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
public static RemoteObject  _buttontopchannelview_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopChannelView_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1104);
if (RapidSub.canDelegate("buttontopchannelview_click")) return main.remoteMe.runUserSub(false, "main","buttontopchannelview_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 1104;BA.debugLine="Sub ButtonTopChannelView_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1106;BA.debugLine="isEdit =False";
Debug.ShouldStop(131072);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1107;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1108;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(524288);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1109;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 1110;BA.debugLine="job.Initialize(\"topView_channel\", Me)";
Debug.ShouldStop(2097152);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topView_channel")),(Object)(main.getObject()));
 BA.debugLineNum = 1111;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(4194304);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 1112;BA.debugLine="parameter=\"pass=1266&Type=channel&sort=topView\"";
Debug.ShouldStop(8388608);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&Type=channel&sort=topView"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 1113;BA.debugLine="job.PostString(query,parameter)";
Debug.ShouldStop(16777216);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e772) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e772.toString()); BA.debugLineNum = 1115;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1117;BA.debugLine="End Sub";
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
public static RemoteObject  _buttontopgroup_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,953);
if (RapidSub.canDelegate("buttontopgroup_click")) return main.remoteMe.runUserSub(false, "main","buttontopgroup_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 953;BA.debugLine="Sub ButtonTopGroup_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 955;BA.debugLine="isEdit =False";
Debug.ShouldStop(67108864);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 956;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 957;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(268435456);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 958;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 959;BA.debugLine="job.Initialize(\"topView_group\", Me)";
Debug.ShouldStop(1073741824);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topView_group")),(Object)(main.getObject()));
 BA.debugLineNum = 960;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(-2147483648);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 961;BA.debugLine="parameter=\"pass=1266&type=group&sort=topView\" &";
Debug.ShouldStop(1);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=group&sort=topView"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 962;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(2);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e646) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e646.toString()); BA.debugLineNum = 964;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 966;BA.debugLine="End Sub";
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
public static RemoteObject  _buttontopid_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopId_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,907);
if (RapidSub.canDelegate("buttontopid_click")) return main.remoteMe.runUserSub(false, "main","buttontopid_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 907;BA.debugLine="Sub ButtonTopId_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 909;BA.debugLine="isEdit =False";
Debug.ShouldStop(4096);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 910;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 911;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(16384);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 912;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 913;BA.debugLine="job.Initialize(\"topView_id\", Me)";
Debug.ShouldStop(65536);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topView_id")),(Object)(main.getObject()));
 BA.debugLineNum = 914;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobi";
Debug.ShouldStop(131072);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 915;BA.debugLine="parameter=\"pass=1266&type=id&sort=topView\" & \"&";
Debug.ShouldStop(262144);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=id&sort=topView"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 916;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(524288);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e604) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e604.toString()); BA.debugLineNum = 918;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 920;BA.debugLine="End Sub";
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
public static RemoteObject  _buttontopjoingroup_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopJoinGroup_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,805);
if (RapidSub.canDelegate("buttontopjoingroup_click")) return main.remoteMe.runUserSub(false, "main","buttontopjoingroup_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 805;BA.debugLine="Sub ButtonTopJoinGroup_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 807;BA.debugLine="isEdit =False";
Debug.ShouldStop(64);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 808;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 809;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(256);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 810;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 811;BA.debugLine="job.Initialize(\"topMember_channel\", Me)";
Debug.ShouldStop(1024);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topMember_channel")),(Object)(main.getObject()));
 BA.debugLineNum = 812;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(2048);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 813;BA.debugLine="parameter=\"pass=1266&type=group&sort=topJoin\" &";
Debug.ShouldStop(4096);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=group&sort=topJoin"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 814;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(8192);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e513) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e513.toString()); BA.debugLineNum = 816;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 818;BA.debugLine="End Sub";
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
public static RemoteObject  _buttontopjoinrobot_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopJoinRobot_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,864);
if (RapidSub.canDelegate("buttontopjoinrobot_click")) return main.remoteMe.runUserSub(false, "main","buttontopjoinrobot_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 864;BA.debugLine="Sub ButtonTopJoinRobot_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 866;BA.debugLine="isEdit =False";
Debug.ShouldStop(2);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 867;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 868;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(8);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 869;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 870;BA.debugLine="job.Initialize(\"topJoin_group\", Me)";
Debug.ShouldStop(32);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topJoin_group")),(Object)(main.getObject()));
 BA.debugLineNum = 871;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(64);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 872;BA.debugLine="parameter=\"pass=1266&type=group&sort=topJoin\" &";
Debug.ShouldStop(128);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=group&sort=topJoin"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 873;BA.debugLine="job.PostString(query,parameter)";
Debug.ShouldStop(256);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e566) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e566.toString()); BA.debugLineNum = 875;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 877;BA.debugLine="End Sub";
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
public static RemoteObject  _buttontopjoinsticker_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopJoinSticker_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,756);
if (RapidSub.canDelegate("buttontopjoinsticker_click")) return main.remoteMe.runUserSub(false, "main","buttontopjoinsticker_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 756;BA.debugLine="Sub ButtonTopJoinSticker_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 758;BA.debugLine="isEdit =False";
Debug.ShouldStop(2097152);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 759;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 760;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(8388608);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 761;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 762;BA.debugLine="job.Initialize(\"topJoin_sticker\", Me)";
Debug.ShouldStop(33554432);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topJoin_sticker")),(Object)(main.getObject()));
 BA.debugLineNum = 763;BA.debugLine="query =\"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(67108864);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 764;BA.debugLine="parameter=\"pass=1266&type=sticker&sort=topJoin\"";
Debug.ShouldStop(134217728);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=sticker&sort=topJoin"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 765;BA.debugLine="job.PostString(query, parameter)";
Debug.ShouldStop(268435456);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e470) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e470.toString()); BA.debugLineNum = 767;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 769;BA.debugLine="End Sub";
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
public static RemoteObject  _buttontoprobot_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopRobot_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,850);
if (RapidSub.canDelegate("buttontoprobot_click")) return main.remoteMe.runUserSub(false, "main","buttontoprobot_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 850;BA.debugLine="Sub ButtonTopRobot_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 852;BA.debugLine="isEdit =False";
Debug.ShouldStop(524288);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 853;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 854;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2097152);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 855;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 856;BA.debugLine="job.Initialize(\"topView_robot\", Me)";
Debug.ShouldStop(8388608);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topView_robot")),(Object)(main.getObject()));
 BA.debugLineNum = 857;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(16777216);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 858;BA.debugLine="parameter=\"pass=1266&type=robot&sort=topView\" &";
Debug.ShouldStop(33554432);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=robot&sort=topView"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 859;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(67108864);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e553) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e553.toString()); BA.debugLineNum = 861;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 863;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttontopsticker_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonTopSticker_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,743);
if (RapidSub.canDelegate("buttontopsticker_click")) return main.remoteMe.runUserSub(false, "main","buttontopsticker_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 743;BA.debugLine="Sub ButtonTopSticker_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 744;BA.debugLine="isEdit =False";
Debug.ShouldStop(128);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 745;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 746;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(512);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 747;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 748;BA.debugLine="job.Initialize(\"topView_sticker\", Me)";
Debug.ShouldStop(2048);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("topView_sticker")),(Object)(main.getObject()));
 BA.debugLineNum = 749;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(4096);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 750;BA.debugLine="parameter=\"pass=1266&type=sticker&sort=topView\"";
Debug.ShouldStop(8192);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=sticker&sort=topView"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 751;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(16384);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e457) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e457.toString()); BA.debugLineNum = 753;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
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
public static RemoteObject  _buttonvipchannel_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonVIPChannel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1042);
if (RapidSub.canDelegate("buttonvipchannel_click")) return main.remoteMe.runUserSub(false, "main","buttonvipchannel_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 1042;BA.debugLine="Sub ButtonVIPChannel_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1043;BA.debugLine="isEdit =False";
Debug.ShouldStop(262144);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1044;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1045;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1048576);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1046;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 1047;BA.debugLine="job.Initialize(\"vip_channel\", Me)";
Debug.ShouldStop(4194304);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("vip_channel")),(Object)(main.getObject()));
 BA.debugLineNum = 1048;BA.debugLine="query = \"http://www.aloosalam.ir/index.php/mobil";
Debug.ShouldStop(8388608);
main._query = BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search");
 BA.debugLineNum = 1049;BA.debugLine="parameter=\"pass=1266&type=channel&sort=vip\" & \"&";
Debug.ShouldStop(16777216);
main._parameter = RemoteObject.concat(RemoteObject.createImmutable("pass=1266&type=channel&sort=vip"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))));
 BA.debugLineNum = 1050;BA.debugLine="job.PostString(query,parameter )";
Debug.ShouldStop(33554432);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(main._query),(Object)(main._parameter));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e717) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e717.toString()); BA.debugLineNum = 1052;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1054;BA.debugLine="End Sub";
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
public static RemoteObject  _channel_click() throws Exception{
try {
		Debug.PushSubsStack("Channel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,517);
if (RapidSub.canDelegate("channel_click")) return main.remoteMe.runUserSub(false, "main","channel_click");
 BA.debugLineNum = 517;BA.debugLine="Sub Channel_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 521;BA.debugLine="PanelGroup.Visible=False";
Debug.ShouldStop(256);
main.mostCurrent._panelgroup.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 523;BA.debugLine="PanelChannel.Visible= True";
Debug.ShouldStop(1024);
main.mostCurrent._panelchannel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 524;BA.debugLine="PanelSticker.Visible=False";
Debug.ShouldStop(2048);
main.mostCurrent._panelsticker.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 526;BA.debugLine="Group.Color = Colors.RGB(30,136,229)";
Debug.ShouldStop(8192);
main.mostCurrent._group.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 527;BA.debugLine="Sticker.Color = Colors.RGB(30,136,229)";
Debug.ShouldStop(16384);
main.mostCurrent._sticker.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 529;BA.debugLine="Group.TextColor= Colors.RGB(207,216,220)";
Debug.ShouldStop(65536);
main.mostCurrent._group.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 530;BA.debugLine="Sticker.TextColor = Colors.RGB(207,216,220)";
Debug.ShouldStop(131072);
main.mostCurrent._sticker.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 533;BA.debugLine="Channel.Color = Colors.White";
Debug.ShouldStop(1048576);
main.mostCurrent._channel.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 534;BA.debugLine="Channel.TextColor= Colors.rgb(96,125,139)";
Debug.ShouldStop(2097152);
main.mostCurrent._channel.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 96)),(Object)(BA.numberCast(int.class, 125)),(Object)(BA.numberCast(int.class, 139))));
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkregister() throws Exception{
try {
		Debug.PushSubsStack("checkRegister (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,471);
if (RapidSub.canDelegate("checkregister")) return main.remoteMe.runUserSub(false, "main","checkregister");
RemoteObject _model = RemoteObject.createImmutable("");
RemoteObject _sdk = RemoteObject.createImmutable(0);
RemoteObject _phone_id = RemoteObject.createImmutable("");
 BA.debugLineNum = 471;BA.debugLine="Sub checkRegister";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 474;BA.debugLine="readInfo";
Debug.ShouldStop(33554432);
_readinfo();
 BA.debugLineNum = 483;BA.debugLine="Dim model As String = userInfo.Get(\"model\")";
Debug.ShouldStop(4);
_model = BA.ObjectToString(main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("model")))));Debug.locals.put("model", _model);Debug.locals.put("model", _model);
 BA.debugLineNum = 484;BA.debugLine="Dim sdk As Int = userInfo.Get(\"sdk\")";
Debug.ShouldStop(8);
_sdk = BA.numberCast(int.class, main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sdk")))));Debug.locals.put("sdk", _sdk);Debug.locals.put("sdk", _sdk);
 BA.debugLineNum = 486;BA.debugLine="Dim phone_id As String = userInfo.Get(\"phoneid\")";
Debug.ShouldStop(32);
_phone_id = BA.ObjectToString(main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phoneid")))));Debug.locals.put("phone_id", _phone_id);Debug.locals.put("phone_id", _phone_id);
 BA.debugLineNum = 488;BA.debugLine="If(IsNumber( userInfo.Get(\"user_id\"))=False Or _";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id"))))))),main.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable((0))) || RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name"))))))),main.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("n",main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name"))))) || RemoteObject.solveBoolean("!",_sdk,BA.numberCast(double.class, main._phone.runMethod(true,"getSdkVersion"))) || RemoteObject.solveBoolean("!",_model,RemoteObject.concat(main._phone.runMethod(true,"getManufacturer"),RemoteObject.createImmutable(","),main._phone.runMethod(true,"getProduct"))) || RemoteObject.solveBoolean("!",_phone_id,main._phoneid.runMethod(true,"GetDeviceId")))) { 
 BA.debugLineNum = 496;BA.debugLine="userInfo.Put(\"is_advance\",False)";
Debug.ShouldStop(32768);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_advance"))),(Object)((main.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 497;BA.debugLine="userInfo.Put(\"is_premium\",False)";
Debug.ShouldStop(65536);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_premium"))),(Object)((main.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 498;BA.debugLine="userInfo.Put(\"to_day_insert_advance\",0)";
Debug.ShouldStop(131072);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_insert_advance"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 500;BA.debugLine="writeInfo";
Debug.ShouldStop(524288);
_writeinfo();
 BA.debugLineNum = 501;BA.debugLine="StartActivity(\"viewInsertedGroupAct\")";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("viewInsertedGroupAct"))));
 BA.debugLineNum = 502;BA.debugLine="writeInfo";
Debug.ShouldStop(2097152);
_writeinfo();
 BA.debugLineNum = 504;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 508;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 510;BA.debugLine="End Sub";
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
public static RemoteObject  _editsearch_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditSearch_EnterPressed (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1025);
if (RapidSub.canDelegate("editsearch_enterpressed")) return main.remoteMe.runUserSub(false, "main","editsearch_enterpressed");
 BA.debugLineNum = 1025;BA.debugLine="Sub EditSearch_EnterPressed";
Debug.ShouldStop(1);
 BA.debugLineNum = 1026;BA.debugLine="Search_Click";
Debug.ShouldStop(2);
_search_click();
 BA.debugLineNum = 1027;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 64;BA.debugLine="Private PanelSticker As Panel";
main.mostCurrent._panelsticker = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private PanelChannel As Panel";
main.mostCurrent._panelchannel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private PanelGroup As Panel";
main.mostCurrent._panelgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private Group As Button";
main.mostCurrent._group = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private Sticker As Button";
main.mostCurrent._sticker = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private Channel As Button";
main.mostCurrent._channel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Dim navi As AHNavigationDrawer";
main.mostCurrent._navi = RemoteObject.createNew ("de.amberhome.navdrawer.NavigationDrawer");
 //BA.debugLineNum = 76;BA.debugLine="Dim pCantent As Panel";
main.mostCurrent._pcantent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private ButtonTopId As Button";
main.mostCurrent._buttontopid = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private ButtonLastId As Button";
main.mostCurrent._buttonlastid = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private ButtonSearchId As Button";
main.mostCurrent._buttonsearchid = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private ButtonAddId As Button";
main.mostCurrent._buttonaddid = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private ButtonTopJoinGroup As Button";
main.mostCurrent._buttontopjoingroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private ButtonTopGroup As Button";
main.mostCurrent._buttontopgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private ButtonLastGroup As Button";
main.mostCurrent._buttonlastgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private ButtonSearchGroup As Button";
main.mostCurrent._buttonsearchgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private ButtonAddGroup As Button";
main.mostCurrent._buttonaddgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private btnMenu As Button";
main.mostCurrent._btnmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private Search As ImageView";
main.mostCurrent._search = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private EditSearch As EditText";
main.mostCurrent._editsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private ButtonSuperGroup As Button";
main.mostCurrent._buttonsupergroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private ButtonVIPChannel As Button";
main.mostCurrent._buttonvipchannel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private ImageView21 As ImageView";
main.mostCurrent._imageview21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private ImageView22 As ImageView";
main.mostCurrent._imageview22 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private ImageView23 As ImageView";
main.mostCurrent._imageview23 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private ImageView24 As ImageView";
main.mostCurrent._imageview24 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private ImageView25 As ImageView";
main.mostCurrent._imageview25 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private ImageView26 As ImageView";
main.mostCurrent._imageview26 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private ImageView15 As ImageView";
main.mostCurrent._imageview15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private ImageView16 As ImageView";
main.mostCurrent._imageview16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Private ImageView17 As ImageView";
main.mostCurrent._imageview17 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 110;BA.debugLine="Private ImageView18 As ImageView";
main.mostCurrent._imageview18 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private ImageView19 As ImageView";
main.mostCurrent._imageview19 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Private ImageView20 As ImageView";
main.mostCurrent._imageview20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 113;BA.debugLine="Private ImageView10 As ImageView";
main.mostCurrent._imageview10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 114;BA.debugLine="Private ImageView11 As ImageView";
main.mostCurrent._imageview11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private ImageView12 As ImageView";
main.mostCurrent._imageview12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private ImageView13 As ImageView";
main.mostCurrent._imageview13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private ImageView14 As ImageView";
main.mostCurrent._imageview14 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private ImageView6 As ImageView";
main.mostCurrent._imageview6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 119;BA.debugLine="Private ImageView7 As ImageView";
main.mostCurrent._imageview7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 120;BA.debugLine="Private ImageView8 As ImageView";
main.mostCurrent._imageview8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 121;BA.debugLine="Private ImageView9 As ImageView";
main.mostCurrent._imageview9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 122;BA.debugLine="Private ImageView2 As ImageView";
main.mostCurrent._imageview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 123;BA.debugLine="Private ImageView3 As ImageView";
main.mostCurrent._imageview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Private ImageView4 As ImageView";
main.mostCurrent._imageview4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 125;BA.debugLine="Private ImageView5 As ImageView";
main.mostCurrent._imageview5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 127;BA.debugLine="Private ImageView30 As ImageView";
main.mostCurrent._imageview30 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private ImageView27 As ImageView";
main.mostCurrent._imageview27 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Private LabelBack As Label";
main.mostCurrent._labelback = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private ButtonInsertSuperGroup As Button";
main.mostCurrent._buttoninsertsupergroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private ButtonMyGroup As Button";
main.mostCurrent._buttonmygroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 136;BA.debugLine="Private ScrollViewChannel As ScrollView";
main.mostCurrent._scrollviewchannel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 138;BA.debugLine="Private ButtonMyChannel As Button";
main.mostCurrent._buttonmychannel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 139;BA.debugLine="Private ScrollViewGroup As ScrollView";
main.mostCurrent._scrollviewgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 140;BA.debugLine="Private PanelGroupContainer As Panel";
main.mostCurrent._panelgroupcontainer = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 141;BA.debugLine="Private PanelChannelContainer As Panel";
main.mostCurrent._panelchannelcontainer = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 143;BA.debugLine="Private ButtonTopChannelView As Button";
main.mostCurrent._buttontopchannelview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 145;BA.debugLine="Private ImageView29 As ImageView";
main.mostCurrent._imageview29 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 147;BA.debugLine="Private PanelStickerContainer As Panel";
main.mostCurrent._panelstickercontainer = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 148;BA.debugLine="Private ScrollViewSticker As ScrollView";
main.mostCurrent._scrollviewsticker = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _group_click() throws Exception{
try {
		Debug.PushSubsStack("Group_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,599);
if (RapidSub.canDelegate("group_click")) return main.remoteMe.runUserSub(false, "main","group_click");
 BA.debugLineNum = 599;BA.debugLine="Sub Group_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 601;BA.debugLine="PanelGroup.Visible= True";
Debug.ShouldStop(16777216);
main.mostCurrent._panelgroup.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 603;BA.debugLine="PanelChannel.Visible=False";
Debug.ShouldStop(67108864);
main.mostCurrent._panelchannel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 604;BA.debugLine="PanelSticker.Visible=False";
Debug.ShouldStop(134217728);
main.mostCurrent._panelsticker.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 606;BA.debugLine="Channel.Color=Colors.RGB(30,136,229)";
Debug.ShouldStop(536870912);
main.mostCurrent._channel.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 607;BA.debugLine="Sticker.Color= Colors.RGB(30,136,229)";
Debug.ShouldStop(1073741824);
main.mostCurrent._sticker.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 609;BA.debugLine="Channel.TextColor=Colors.RGB(207,216,220)";
Debug.ShouldStop(1);
main.mostCurrent._channel.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 610;BA.debugLine="Sticker.TextColor = Colors.RGB(207,216,220)";
Debug.ShouldStop(2);
main.mostCurrent._sticker.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 613;BA.debugLine="Group.Color = Colors.White";
Debug.ShouldStop(16);
main.mostCurrent._group.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 614;BA.debugLine="Group.TextColor= Colors.rgb(96,125,139)";
Debug.ShouldStop(32);
main.mostCurrent._group.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 96)),(Object)(BA.numberCast(int.class, 125)),(Object)(BA.numberCast(int.class, 139))));
 BA.debugLineNum = 615;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _id_click() throws Exception{
try {
		Debug.PushSubsStack("ID_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,579);
if (RapidSub.canDelegate("id_click")) return main.remoteMe.runUserSub(false, "main","id_click");
 BA.debugLineNum = 579;BA.debugLine="Sub ID_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 581;BA.debugLine="PanelGroup.Visible=False";
Debug.ShouldStop(16);
main.mostCurrent._panelgroup.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 583;BA.debugLine="PanelChannel.Visible=False";
Debug.ShouldStop(64);
main.mostCurrent._panelchannel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 584;BA.debugLine="PanelSticker.Visible=False";
Debug.ShouldStop(128);
main.mostCurrent._panelsticker.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 587;BA.debugLine="Channel.Color=Colors.RGB(30,136,229)";
Debug.ShouldStop(1024);
main.mostCurrent._channel.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 588;BA.debugLine="Group.Color = Colors.RGB(30,136,229)";
Debug.ShouldStop(2048);
main.mostCurrent._group.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 589;BA.debugLine="Sticker.Color = Colors.RGB(30,136,229)";
Debug.ShouldStop(4096);
main.mostCurrent._sticker.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 591;BA.debugLine="Channel.TextColor=Colors.RGB(207,216,220)";
Debug.ShouldStop(16384);
main.mostCurrent._channel.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 592;BA.debugLine="Group.TextColor= Colors.RGB(207,216,220)";
Debug.ShouldStop(32768);
main.mostCurrent._group.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 593;BA.debugLine="Sticker.TextColor = Colors.RGB(207,216,220)";
Debug.ShouldStop(65536);
main.mostCurrent._sticker.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 597;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,640);
if (RapidSub.canDelegate("jobdone")) return main.remoteMe.runUserSub(false, "main","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _countries = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 640;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 641;BA.debugLine="searchResult.Initialize()";
Debug.ShouldStop(1);
main._searchresult.runVoidMethod ("Initialize");
 BA.debugLineNum = 642;BA.debugLine="searchResult.Clear()";
Debug.ShouldStop(2);
main._searchresult.runVoidMethod ("Clear");
 BA.debugLineNum = 644;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 645;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 646;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(32);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 647;BA.debugLine="Dim res As String";
Debug.ShouldStop(64);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 648;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(128);
_res = _job.runClassMethod (Telegram.Search.httpjob.class, "_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 649;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 650;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 652;BA.debugLine="If 	Job.JobName= \"topJoin_group\" Or  _ 				Job.";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topJoin_group")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("last_group")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topView_group")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topJoin_id")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("last_id")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topView_id")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topJoin_sticker")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("last_sticker")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topView_sticker")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topJoin_robot")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("last_robot")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topView_robot")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topJoin_channel")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("last_channel")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topView_channel")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("topMember_channel")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("my_channel")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("my_group")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("super_group")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("vip_channel")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("order_sticker")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("search_all"))) { 
 BA.debugLineNum = 675;BA.debugLine="Dim COUNTRIES As List";
Debug.ShouldStop(4);
_countries = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 676;BA.debugLine="COUNTRIES = parser.NextArray 'returns a list";
Debug.ShouldStop(8);
_countries = _parser.runMethod(false,"NextArray");Debug.locals.put("COUNTRIES", _countries);
 BA.debugLineNum = 678;BA.debugLine="Dim rows As List";
Debug.ShouldStop(32);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 679;BA.debugLine="rows= COUNTRIES.Get(0)";
Debug.ShouldStop(64);
_rows.setObject(_countries.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 681;BA.debugLine="If(rows.Size > 0 ) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean(">",_rows.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 683;BA.debugLine="For i= 0 To rows.Size-1";
Debug.ShouldStop(1024);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_rows.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 684;BA.debugLine="Dim row As Map";
Debug.ShouldStop(2048);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("row", _row);
 BA.debugLineNum = 686;BA.debugLine="row.Initialize()";
Debug.ShouldStop(8192);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 687;BA.debugLine="row=rows.Get(i)";
Debug.ShouldStop(16384);
_row.setObject(_rows.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 688;BA.debugLine="searchResult.Add(row)";
Debug.ShouldStop(32768);
main._searchresult.runVoidMethod ("Add",(Object)((_row.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 691;BA.debugLine="Job.Release";
Debug.ShouldStop(262144);
_job.runClassMethod (Telegram.Search.httpjob.class, "_release");
 BA.debugLineNum = 692;BA.debugLine="StartActivity(\"searchResultAct\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("searchResultAct"))));
 }else {
 BA.debugLineNum = 694;BA.debugLine="If(Job.JobName=\"my_channel\" Or _ 							Job.";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("my_channel")) || RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),RemoteObject.createImmutable("my_group")))) { 
 BA.debugLineNum = 696;BA.debugLine="Msgbox(\"شما هنوز موردی ثبت نکرده اید. از دک";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("شما هنوز موردی ثبت نکرده اید. از دکمه ثبت گروه یا ثبت کانال استفاده کنید.")),(Object)(RemoteObject.createImmutable("ثبت مورد")),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 698;BA.debugLine="Msgbox(\"موردی با مشخصات درخواستی شما یافت ن";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("موردی با مشخصات درخواستی شما یافت نشد . از بخش آخرین "),main._selectedtypetitle,RemoteObject.createImmutable("ها هم می توانید "),main._selectedtypetitle,RemoteObject.createImmutable(" مورد نظر خود را پیدا کنید  . "))),(Object)(RemoteObject.createImmutable("جستجو")),main.mostCurrent.activityBA);
 };
 };
 };
 }else {
 BA.debugLineNum = 704;BA.debugLine="ToastMessageShow(\"خطا در ارتباط با سرور: اتصال";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e419) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e419.toString()); BA.debugLineNum = 707;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات جستجو  \",\"خطا\")";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات جستجو  ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 710;BA.debugLine="End Sub";
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
public static RemoteObject  _loadmenu() throws Exception{
try {
		Debug.PushSubsStack("loadMenu (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,512);
if (RapidSub.canDelegate("loadmenu")) return main.remoteMe.runUserSub(false, "main","loadmenu");
 BA.debugLineNum = 512;BA.debugLine="Sub loadMenu";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 515;BA.debugLine="End Sub";
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
public static RemoteObject  _menuabout_click() throws Exception{
try {
		Debug.PushSubsStack("MenuAbout_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,979);
if (RapidSub.canDelegate("menuabout_click")) return main.remoteMe.runUserSub(false, "main","menuabout_click");
 BA.debugLineNum = 979;BA.debugLine="Sub MenuAbout_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 980;BA.debugLine="StartActivity(\"AboutAct\")";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("AboutAct"))));
 BA.debugLineNum = 981;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(1048576);
main.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 982;BA.debugLine="End Sub";
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
public static RemoteObject  _menucontact_click() throws Exception{
try {
		Debug.PushSubsStack("MenuContact_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,996);
if (RapidSub.canDelegate("menucontact_click")) return main.remoteMe.runUserSub(false, "main","menucontact_click");
 BA.debugLineNum = 996;BA.debugLine="Sub MenuContact_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 997;BA.debugLine="StartActivity(\"contactAct\")";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("contactAct"))));
 BA.debugLineNum = 998;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(32);
main.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 999;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("MenuExit_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,984);
if (RapidSub.canDelegate("menuexit_click")) return main.remoteMe.runUserSub(false, "main","menuexit_click");
 BA.debugLineNum = 984;BA.debugLine="Sub MenuExit_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 986;BA.debugLine="ExitApplication";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 989;BA.debugLine="End Sub";
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
public static RemoteObject  _menuhelp_click() throws Exception{
try {
		Debug.PushSubsStack("MenuHelp_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,975);
if (RapidSub.canDelegate("menuhelp_click")) return main.remoteMe.runUserSub(false, "main","menuhelp_click");
 BA.debugLineNum = 975;BA.debugLine="Sub MenuHelp_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 976;BA.debugLine="StartActivity(\"helpAct\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("helpAct"))));
 BA.debugLineNum = 977;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(65536);
main.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 978;BA.debugLine="End Sub";
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
public static RemoteObject  _menuorder_click() throws Exception{
try {
		Debug.PushSubsStack("MenuOrder_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,990);
if (RapidSub.canDelegate("menuorder_click")) return main.remoteMe.runUserSub(false, "main","menuorder_click");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 990;BA.debugLine="Sub MenuOrder_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 991;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 992;BA.debugLine="StartActivity(p.OpenBrowser(\"http://aloosalam.ir/";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.createImmutable("http://aloosalam.ir/index.php/login/index/1"))))));
 BA.debugLineNum = 993;BA.debugLine="navi.CloseDrawer2(Gravity.RIGHT)";
Debug.ShouldStop(1);
main.mostCurrent._navi.runVoidMethod ("CloseDrawer2",(Object)(main.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")));
 BA.debugLineNum = 994;BA.debugLine="End Sub";
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
public static RemoteObject  _panelid_click() throws Exception{
try {
		Debug.PushSubsStack("PanelID_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1101);
if (RapidSub.canDelegate("panelid_click")) return main.remoteMe.runUserSub(false, "main","panelid_click");
 BA.debugLineNum = 1101;BA.debugLine="Sub PanelID_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1103;BA.debugLine="End Sub";
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
public static RemoteObject  _panelrobot_click() throws Exception{
try {
		Debug.PushSubsStack("PanelRobot_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1098);
if (RapidSub.canDelegate("panelrobot_click")) return main.remoteMe.runUserSub(false, "main","panelrobot_click");
 BA.debugLineNum = 1098;BA.debugLine="Sub PanelRobot_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 1100;BA.debugLine="End Sub";
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
httputils2service_subs_0._process_globals();
aboutact_subs_0._process_globals();
searchresultact_subs_0._process_globals();
dbutils_subs_0._process_globals();
helpact_subs_0._process_globals();
contactact_subs_0._process_globals();
insertact_subs_0._process_globals();
groupviewact_subs_0._process_globals();
viewinsertedgroupact_subs_0._process_globals();
searchact_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("Telegram.Search.main");
httputils2service.myClass = BA.getDeviceClass ("Telegram.Search.httputils2service");
aboutact.myClass = BA.getDeviceClass ("Telegram.Search.aboutact");
searchresultact.myClass = BA.getDeviceClass ("Telegram.Search.searchresultact");
dbutils.myClass = BA.getDeviceClass ("Telegram.Search.dbutils");
helpact.myClass = BA.getDeviceClass ("Telegram.Search.helpact");
contactact.myClass = BA.getDeviceClass ("Telegram.Search.contactact");
insertact.myClass = BA.getDeviceClass ("Telegram.Search.insertact");
groupviewact.myClass = BA.getDeviceClass ("Telegram.Search.groupviewact");
viewinsertedgroupact.myClass = BA.getDeviceClass ("Telegram.Search.viewinsertedgroupact");
searchact.myClass = BA.getDeviceClass ("Telegram.Search.searchact");
httpjob.myClass = BA.getDeviceClass ("Telegram.Search.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim ostan(40) As String";
main._ostan = RemoteObject.createNewArray ("String", new int[] {40}, new Object[]{});
 //BA.debugLineNum = 20;BA.debugLine="Dim cat(20) As String";
main._cat = RemoteObject.createNewArray ("String", new int[] {20}, new Object[]{});
 //BA.debugLineNum = 22;BA.debugLine="Dim DBFileName As String";
main._dbfilename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="DBFileName = \"shahr.db\"";
main._dbfilename = BA.ObjectToString("shahr.db");
 //BA.debugLineNum = 25;BA.debugLine="Dim DBFileDir As String";
main._dbfiledir = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim DBTableName As String";
main._dbtablename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="DBTableName = \"shahr\"";
main._dbtablename = BA.ObjectToString("shahr");
 //BA.debugLineNum = 30;BA.debugLine="Dim SQL1 As SQL";
main._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 31;BA.debugLine="Dim selected_item As Map";
main._selected_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 32;BA.debugLine="Dim searchResult  As List";
main._searchresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 34;BA.debugLine="Dim groupIcon As Bitmap";
main._groupicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim stickerIcon As Bitmap";
main._stickericon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Dim idIcon As Bitmap";
main._idicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Dim robotIcon As Bitmap";
main._roboticon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim channelIcon As Bitmap";
main._channelicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Dim selectedType As String";
main._selectedtype = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Dim selectedTypeTitle As String";
main._selectedtypetitle = RemoteObject.createImmutable("");
 //BA.debugLineNum = 43;BA.debugLine="Dim query As String";
main._query = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Dim parameter As String";
main._parameter = RemoteObject.createImmutable("");
 //BA.debugLineNum = 46;BA.debugLine="Dim userInfo As Map";
main._userinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 47;BA.debugLine="Dim phone As Phone";
main._phone = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 48;BA.debugLine="Dim phoneId  As PhoneId";
main._phoneid = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneId");
 //BA.debugLineNum = 50;BA.debugLine="Dim font As Typeface";
main._font = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Dim rightBitmap As Bitmap";
main._rightbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Dim isEdit As Boolean";
main._isedit = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 55;BA.debugLine="Dim isSuperGroup As Boolean";
main._issupergroup = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 57;BA.debugLine="Dim vipInsertCount As Int";
main._vipinsertcount = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 58;BA.debugLine="Dim todayInsertCount As Int";
main._todayinsertcount = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _readinfo() throws Exception{
try {
		Debug.PushSubsStack("readInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,356);
if (RapidSub.canDelegate("readinfo")) return main.remoteMe.runUserSub(false, "main","readinfo");
RemoteObject _day = RemoteObject.createImmutable(0);
RemoteObject _today = RemoteObject.createImmutable(0);
 BA.debugLineNum = 356;BA.debugLine="Sub readInfo";
Debug.ShouldStop(8);
 BA.debugLineNum = 357;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 358;BA.debugLine="userInfo.Initialize";
Debug.ShouldStop(32);
main._userinfo.runVoidMethod ("Initialize");
 BA.debugLineNum = 359;BA.debugLine="userInfo= DBUtils.ExecuteMap(SQL1,  \"SELECT *";
Debug.ShouldStop(64);
main._userinfo = main.mostCurrent._dbutils.runMethod(false,"_executemap",main.mostCurrent.activityBA,(Object)(main._sql1),(Object)(BA.ObjectToString("SELECT *   FROM  info ")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 361;BA.debugLine="If userInfo.Get(\"to_day_insert_advance\") = Null";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("n",main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert_advance")))))) { 
 BA.debugLineNum = 362;BA.debugLine="vipInsertCount = 0";
Debug.ShouldStop(512);
main._vipinsertcount = BA.numberCast(int.class, 0);
 }else {
 BA.debugLineNum = 364;BA.debugLine="vipInsertCount = userInfo.Get(\"to_day_insert_ad";
Debug.ShouldStop(2048);
main._vipinsertcount = BA.numberCast(int.class, main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert_advance")))));
 };
 BA.debugLineNum = 367;BA.debugLine="If userInfo.Get(\"to_day_insert\") = Null Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("n",main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert")))))) { 
 BA.debugLineNum = 368;BA.debugLine="todayInsertCount = 0";
Debug.ShouldStop(32768);
main._todayinsertcount = BA.numberCast(int.class, 0);
 }else {
 BA.debugLineNum = 370;BA.debugLine="todayInsertCount = userInfo.Get(\"to_day_insert\"";
Debug.ShouldStop(131072);
main._todayinsertcount = BA.numberCast(int.class, main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert")))));
 };
 BA.debugLineNum = 373;BA.debugLine="Dim day  As Int  =  DateTime.GetDayOfMonth(DateT";
Debug.ShouldStop(1048576);
_day = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("day", _day);Debug.locals.put("day", _day);
 BA.debugLineNum = 374;BA.debugLine="Dim today As Int";
Debug.ShouldStop(2097152);
_today = RemoteObject.createImmutable(0);Debug.locals.put("today", _today);
 BA.debugLineNum = 375;BA.debugLine="If IsNumber( userInfo.Get(\"to_day_date\")) =False";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_date"))))))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 376;BA.debugLine="today = 0";
Debug.ShouldStop(8388608);
_today = BA.numberCast(int.class, 0);Debug.locals.put("today", _today);
 }else {
 BA.debugLineNum = 378;BA.debugLine="today = userInfo.Get(\"to_day_date\")";
Debug.ShouldStop(33554432);
_today = BA.numberCast(int.class, main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_date")))));Debug.locals.put("today", _today);
 };
 BA.debugLineNum = 380;BA.debugLine="If (today <> day )Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("!",_today,BA.numberCast(double.class, _day)))) { 
 BA.debugLineNum = 381;BA.debugLine="todayInsertCount = 0";
Debug.ShouldStop(268435456);
main._todayinsertcount = BA.numberCast(int.class, 0);
 BA.debugLineNum = 382;BA.debugLine="vipInsertCount = 0";
Debug.ShouldStop(536870912);
main._vipinsertcount = BA.numberCast(int.class, 0);
 BA.debugLineNum = 383;BA.debugLine="userInfo.Put(\"to_day_date\",day)";
Debug.ShouldStop(1073741824);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_date"))),(Object)((_day)));
 BA.debugLineNum = 384;BA.debugLine="writeInfo";
Debug.ShouldStop(-2147483648);
_writeinfo();
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e270) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e270.toString()); BA.debugLineNum = 388;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 389;BA.debugLine="userInfo=DBUtils.ExecuteMap(SQL1,  _ 				\"CREAT";
Debug.ShouldStop(16);
main._userinfo = main.mostCurrent._dbutils.runMethod(false,"_executemap",main.mostCurrent.activityBA,(Object)(main._sql1),(Object)(RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE info (             "),RemoteObject.createImmutable("name	TEXT,                      "),RemoteObject.createImmutable("phone	TEXT,                  "),RemoteObject.createImmutable("user_id	INTEGER,               "),RemoteObject.createImmutable("pass	TEXT,                      "),RemoteObject.createImmutable("user_name	TEXT,              "),RemoteObject.createImmutable("sdk	TEXT,                      "),RemoteObject.createImmutable("model	TEXT,                  "),RemoteObject.createImmutable("line_number	TEXT,              "),RemoteObject.createImmutable("phoneid	TEXT,                  "),RemoteObject.createImmutable("is_advance	INTEGER,           "),RemoteObject.createImmutable("is_premium	INTEGER,           "),RemoteObject.createImmutable("advance_count	INTEGER,       "),RemoteObject.createImmutable("advance_expier_date	TEXT,      "),RemoteObject.createImmutable("to_day_date	TEXT,              "),RemoteObject.createImmutable("to_day_insert	INTEGER,       "),RemoteObject.createImmutable("to_day_insert_advance 	INTEGER"),RemoteObject.createImmutable(")"))),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e273) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e273.toString()); };
 BA.debugLineNum = 412;BA.debugLine="DBUtils.ExecuteMap(SQL1,  _ 			\"insert into info";
Debug.ShouldStop(134217728);
main.mostCurrent._dbutils.runVoidMethod ("_executemap",main.mostCurrent.activityBA,(Object)(main._sql1),(Object)(BA.ObjectToString("insert into info (name,is_advance,is_premium)VALUES('temp','false','false') ")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 415;BA.debugLine="userInfo= DBUtils.ExecuteMap(SQL1,  \"SELECT *";
Debug.ShouldStop(1073741824);
main._userinfo = main.mostCurrent._dbutils.runMethod(false,"_executemap",main.mostCurrent.activityBA,(Object)(main._sql1),(Object)(BA.ObjectToString("SELECT *   FROM  info ")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 416;BA.debugLine="Dim day  As Int  =  DateTime.GetDayOfMonth(DateT";
Debug.ShouldStop(-2147483648);
_day = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("day", _day);Debug.locals.put("day", _day);
 BA.debugLineNum = 417;BA.debugLine="userInfo.Put(\"to_day_date\",day)";
Debug.ShouldStop(1);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_date"))),(Object)((_day)));
 BA.debugLineNum = 418;BA.debugLine="todayInsertCount = 0";
Debug.ShouldStop(2);
main._todayinsertcount = BA.numberCast(int.class, 0);
 BA.debugLineNum = 420;BA.debugLine="writeInfo";
Debug.ShouldStop(8);
_writeinfo();
 };
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _robot_click() throws Exception{
try {
		Debug.PushSubsStack("Robot_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,537);
if (RapidSub.canDelegate("robot_click")) return main.remoteMe.runUserSub(false, "main","robot_click");
 BA.debugLineNum = 537;BA.debugLine="Sub Robot_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 539;BA.debugLine="PanelChannel.Visible = False";
Debug.ShouldStop(67108864);
main.mostCurrent._panelchannel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 540;BA.debugLine="PanelGroup.Visible=False";
Debug.ShouldStop(134217728);
main.mostCurrent._panelgroup.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 542;BA.debugLine="PanelSticker.Visible = False";
Debug.ShouldStop(536870912);
main.mostCurrent._panelsticker.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 547;BA.debugLine="Channel.Color=Colors.RGB(30,136,229)";
Debug.ShouldStop(4);
main.mostCurrent._channel.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 548;BA.debugLine="Group.Color = Colors.RGB(30,136,229)";
Debug.ShouldStop(8);
main.mostCurrent._group.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 550;BA.debugLine="Sticker.Color = Colors.RGB(30,136,229)";
Debug.ShouldStop(32);
main.mostCurrent._sticker.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 552;BA.debugLine="Channel.TextColor=Colors.RGB(207,216,220)";
Debug.ShouldStop(128);
main.mostCurrent._channel.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 553;BA.debugLine="Group.TextColor= Colors.RGB(207,216,220)";
Debug.ShouldStop(256);
main.mostCurrent._group.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 555;BA.debugLine="Sticker.TextColor = Colors.RGB(207,216,220)";
Debug.ShouldStop(1024);
main.mostCurrent._sticker.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 558;BA.debugLine="End Sub";
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
public static RemoteObject  _search_click() throws Exception{
try {
		Debug.PushSubsStack("Search_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,1009);
if (RapidSub.canDelegate("search_click")) return main.remoteMe.runUserSub(false, "main","search_click");
RemoteObject _job = RemoteObject.declareNull("Telegram.Search.httpjob");
 BA.debugLineNum = 1009;BA.debugLine="Sub Search_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1010;BA.debugLine="isEdit =False";
Debug.ShouldStop(131072);
main._isedit = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1011;BA.debugLine="If EditSearch.Text.Length <2 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",main.mostCurrent._editsearch.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1012;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1014;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 1015;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(4194304);
_job = RemoteObject.createNew ("Telegram.Search.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1016;BA.debugLine="ProgressDialogShow(\"درحال دریافت\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("درحال دریافت")));
 BA.debugLineNum = 1017;BA.debugLine="job.Initialize(\"search_all\", Me)";
Debug.ShouldStop(16777216);
_job.runClassMethod (Telegram.Search.httpjob.class, "_initialize",main.processBA,(Object)(BA.ObjectToString("search_all")),(Object)(main.getObject()));
 BA.debugLineNum = 1018;BA.debugLine="job.PostString(\"http://www.aloosalam.ir/index.ph";
Debug.ShouldStop(33554432);
_job.runClassMethod (Telegram.Search.httpjob.class, "_poststring",(Object)(BA.ObjectToString("http://www.aloosalam.ir/index.php/mobile/index/search")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pass=1266"),RemoteObject.createImmutable("&type=all"),RemoteObject.createImmutable("&q="),main.mostCurrent._editsearch.runMethod(true,"getText"),RemoteObject.createImmutable("&user="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable("&v="),main.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),RemoteObject.createImmutable("&line="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e688) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e688.toString()); BA.debugLineNum = 1022;BA.debugLine="Msgbox(\"خطا در دریافت اطلاعات \",\"خطا\")";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("خطا در دریافت اطلاعات ")),(Object)(RemoteObject.createImmutable("خطا")),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1024;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sticker_click() throws Exception{
try {
		Debug.PushSubsStack("Sticker_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,560);
if (RapidSub.canDelegate("sticker_click")) return main.remoteMe.runUserSub(false, "main","sticker_click");
 BA.debugLineNum = 560;BA.debugLine="Sub Sticker_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 562;BA.debugLine="PanelGroup.Visible=False";
Debug.ShouldStop(131072);
main.mostCurrent._panelgroup.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 564;BA.debugLine="PanelChannel.Visible=False";
Debug.ShouldStop(524288);
main.mostCurrent._panelchannel.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 565;BA.debugLine="PanelSticker.Visible=True";
Debug.ShouldStop(1048576);
main.mostCurrent._panelsticker.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 567;BA.debugLine="Channel.Color=Colors.RGB(30,136,229)";
Debug.ShouldStop(4194304);
main.mostCurrent._channel.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 568;BA.debugLine="Group.Color = Colors.RGB(30,136,229)";
Debug.ShouldStop(8388608);
main.mostCurrent._group.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 229))));
 BA.debugLineNum = 571;BA.debugLine="Channel.TextColor=Colors.RGB(207,216,220)";
Debug.ShouldStop(67108864);
main.mostCurrent._channel.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 572;BA.debugLine="Group.TextColor= Colors.RGB(207,216,220)";
Debug.ShouldStop(134217728);
main.mostCurrent._group.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 207)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 220))));
 BA.debugLineNum = 575;BA.debugLine="Sticker.Color=  Colors.White";
Debug.ShouldStop(1073741824);
main.mostCurrent._sticker.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 576;BA.debugLine="Sticker.TextColor= Colors.rgb(96,125,139)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._sticker.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 96)),(Object)(BA.numberCast(int.class, 125)),(Object)(BA.numberCast(int.class, 139))));
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
public static RemoteObject  _writeinfo() throws Exception{
try {
		Debug.PushSubsStack("writeInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,425);
if (RapidSub.canDelegate("writeinfo")) return main.remoteMe.runUserSub(false, "main","writeinfo");
RemoteObject _updatequery = RemoteObject.createImmutable("");
 BA.debugLineNum = 425;BA.debugLine="Sub writeInfo";
Debug.ShouldStop(256);
 BA.debugLineNum = 427;BA.debugLine="If(userInfo.IsInitialized =False) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",main._userinfo.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 428;BA.debugLine="userInfo.Initialize";
Debug.ShouldStop(2048);
main._userinfo.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 439;BA.debugLine="userInfo.Put(\"sdk\",phone.SdkVersion)";
Debug.ShouldStop(4194304);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sdk"))),(Object)((main._phone.runMethod(true,"getSdkVersion"))));
 BA.debugLineNum = 440;BA.debugLine="userInfo.Put(\"model\",phone.Manufacturer & \",\"& ph";
Debug.ShouldStop(8388608);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("model"))),(Object)((RemoteObject.concat(main._phone.runMethod(true,"getManufacturer"),RemoteObject.createImmutable(","),main._phone.runMethod(true,"getProduct")))));
 BA.debugLineNum = 442;BA.debugLine="userInfo.Put(\"phoneid\",phoneId.GetDeviceId)";
Debug.ShouldStop(33554432);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("phoneid"))),(Object)((main._phoneid.runMethod(true,"GetDeviceId"))));
 BA.debugLineNum = 446;BA.debugLine="userInfo.Put(\"to_day_insert_advance\",vipInsertCou";
Debug.ShouldStop(536870912);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_insert_advance"))),(Object)((main._vipinsertcount)));
 BA.debugLineNum = 447;BA.debugLine="userInfo.Put(\"to_day_insert\",todayInsertCount)";
Debug.ShouldStop(1073741824);
main._userinfo.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("to_day_insert"))),(Object)((main._todayinsertcount)));
 BA.debugLineNum = 449;BA.debugLine="Dim updateQuery As String  = \"update  info set \"";
Debug.ShouldStop(1);
_updatequery = RemoteObject.concat(RemoteObject.createImmutable("update  info set "),RemoteObject.createImmutable("name  ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("phone	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("user_id	 ="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("pass	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pass")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("user_name	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_name")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("sdk	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sdk")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("model	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("model")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("line_number	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("line_number")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("phoneid	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phoneid")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("is_advance	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_advance")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("is_premium	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_premium")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("advance_count	 ="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("advance_count")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("advance_expier_date	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("advance_expier_date")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("to_day_date	 ='"),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_date")))),RemoteObject.createImmutable("',"),RemoteObject.createImmutable("to_day_insert	 ="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert")))),RemoteObject.createImmutable(","),RemoteObject.createImmutable("to_day_insert_advance	 ="),main._userinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("to_day_insert_advance")))));Debug.locals.put("updateQuery", _updatequery);Debug.locals.put("updateQuery", _updatequery);
 BA.debugLineNum = 467;BA.debugLine="DBUtils.ExecuteMemoryTable(SQL1,  updateQuery , N";
Debug.ShouldStop(262144);
main.mostCurrent._dbutils.runVoidMethod ("_executememorytable",main.mostCurrent.activityBA,(Object)(main._sql1),(Object)(_updatequery),(Object)((main.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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