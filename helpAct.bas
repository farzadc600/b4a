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

	 
	Dim navi As AHNavigationDrawer
	Dim pCantent As Panel 
	
	Private btnMenu As Button
	Private btnReturn As Button
	
	Private Panel1 As Panel
	Private Label3 As Label
	Private Panel2 As Panel
	Private Label2 As Label
	Private Label1 As Label
	Private ScrollView1 As ScrollView
End Sub
 

Sub btnMenu_Click
	navi.OpenDrawer2(navi.GRAVITY_RIGHT) 
End Sub 

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	 
	 
	
	'Activity.LoadLayout("searchresultview")
	navi.Initialize2("navi",Activity,75%x,navi.GRAVITY_RIGHT)' جهت راس چین بودن ساید بار
	
	
	'navi.NavigationPanel.Initialize("")
	navi.NavigationPanel.LoadLayout("menu")
	
	pCantent.Initialize("")
	navi.ContentPanel.AddView(pCantent,0,0,100%x,100%y)
	pCantent.SendToBack	
	pCantent.LoadLayout("helpView")
	
	Panel1.Color = Colors.White
	
	Label2.Typeface = Main.font 
	Label2.TextSize = 15
	Label2.TextColor = Colors.Black 
	Label2.Gravity = Gravity.RIGHT
	Label1.Typeface = Main.font
	Label1.TextSize = 15
	Label1.TextColor= Colors.Black
	Label1.Gravity = Gravity.RIGHT
	Label3.Typeface = Main.font
	Label3.TextSize = 15
	Label3.TextColor = Colors.Black
	Label3.Gravity = Gravity.RIGHT
	Panel2.RemoveView
	ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width,Panel2.Height)
	ScrollView1.Panel.Height = 1180dip
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub



Sub MenuHelp_Click
	StartActivity("helpAct")
	navi.CloseDrawer2(Gravity.RIGHT) 
End Sub
Sub MenuAbout_Click
	StartActivity("AboutAct")
	navi.CloseDrawer2(Gravity.RIGHT) 
End Sub

Sub MenuExit_Click
	 
	ExitApplication
	

End Sub
Sub MenuOrder_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://aloosalam.ir/index.php/login/index/1"))
	navi.CloseDrawer2(Gravity.RIGHT)  
End Sub
Sub btnReturn_Click
	Activity.Finish
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

Sub btnOpenPage_Click
	Dim p As PhoneIntents
	StartActivity(p.OpenBrowser("http://aloosalam.ir/"))
End Sub

