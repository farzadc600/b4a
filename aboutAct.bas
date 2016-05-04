Type=Activity
Version=5.5
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Private btnMenu As Button
	
	Private Label1 As Label
	Private Label5 As Label
	 
	
	Dim navi As AHNavigationDrawer
	Dim pCantent As Panel 
	Private ImageView1 As ImageView
	Private ImageView2 As ImageView
	Private Panel2 As Panel
	Private ScrollView1 As ScrollView
End Sub
 
Sub btnMenu_Click
	 navi.OpenDrawer2(navi.GRAVITY_RIGHT)
End Sub 

Sub Activity_Create(FirstTime As Boolean)
		
	navi.Initialize2("navi",Activity,75%x,navi.GRAVITY_RIGHT)' جهت راس چین بودن ساید بار
		
	navi.NavigationPanel.LoadLayout("menu")
	
	pCantent.Initialize("")
	navi.ContentPanel.AddView(pCantent,0,0,100%x,100%y)
	pCantent.SendToBack	
	pCantent.LoadLayout("aboutview")
	Activity.Title="درباره برنامه"
	ImageView1.Bitmap = Main.groupIcon
	
	Label1.TextSize=15
	Label1.Gravity=Gravity.RIGHT
	Label1.Typeface =Main.font
	Label1.TextColor =Colors.Black
	
	ImageView2.Initialize("")
	ImageView1.Initialize("")
	
	ImageView2.Bitmap =LoadBitmap(File.DirAssets,"robo_back.jpg")
	ImageView1.Bitmap = Main.groupIcon
	
	Panel2.RemoveView 
	
	ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width,Panel2.Height)
	ScrollView1.Panel.Height = 760dip
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnBack_Click
	Activity.Finish
End Sub

Sub btnOpenPage_Click

	 
	Dim p As PhoneIntents
	Try
		
		Dim oIntent As Intent
		oIntent.Initialize(oIntent.ACTION_VIEW,"bazaar://details?id=Telegram.Group")
		oIntent.SetComponent("com.farsitel.bazaar")
		StartActivity(oIntent)

	Catch
		StartActivity(p.OpenBrowser("http://aloosalam.ir"))
		
	End Try
End Sub

Sub MenuHelp_Click
	StartActivity("helpAct")
	navi.CloseDrawer2(Gravity.RIGHT) 
End Sub
Sub MenuAbout_Click
	StartActivity("AboutAct")
	navi.CloseDrawer2(Gravity.RIGHT) 
End Sub
Sub ButtonChannel_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("https://telegram.me/mamadar_ir" ))
	
End Sub

Sub MenuExit_Click
	 
	ExitApplication
	

End Sub
Sub MenuOrder_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://aloosalam.ir/index.php/login/index/1"))
	navi.CloseDrawer2(Gravity.RIGHT)  
End Sub 
Sub MenuContact_Click
	StartActivity("contactAct")
	navi.CloseDrawer2(Gravity.RIGHT) 
End Sub
Sub btnPanel_Click
	Dim p As PhoneIntents
	Msgbox("نام کاربری شما :" & Main.userInfo.Get("user_name") & CRLF & _
	" رمز عبور اولیه شما " & Main.userInfo.Get("pass") & " می باشد","رمز عبور")
	
	StartActivity(p.OpenBrowser("http://aloosalam.ir/index.php/login/"))
	navi.CloseDrawer2(Gravity.RIGHT)  
End Sub