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

	
	Private Panel2 As Panel
	Private ScrollView1 As ScrollView
	Private Label6 As Label
	Private Label1 As Label
	Private txtName As EditText
	Private Label2 As Label
	Private txtTag As EditText
	Private Label3 As Label
	Private txtDescription As EditText
	Dim navi As AHNavigationDrawer
	Dim pCantent As Panel 
	
	Private ImageView2 As ImageView
	Private ImageView1 As ImageView
End Sub
 

Sub btnMenu_Click
	navi.OpenDrawer2(navi.GRAVITY_RIGHT) 
End Sub 


Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:

 
	navi.Initialize2("navi",Activity,75%x,navi.GRAVITY_RIGHT)' جهت راس چین بودن ساید بار
	
	
	'navi.NavigationPanel.Initialize("")
	navi.NavigationPanel.LoadLayout("menu")
	
	pCantent.Initialize("")
	navi.ContentPanel.AddView(pCantent,0,0,100%x,100%y)
	pCantent.SendToBack	
	pCantent.LoadLayout("contact")
	
	Panel2.RemoveView
	ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width,Panel2.Height)
	ScrollView1.Panel.Height = 600dip

	Label6.TextColor= Colors.Black
	Label6.Typeface = Main.font
	Label6.Gravity= Gravity.RIGHT
	Label1.TextColor= Colors.Black
	Label1.Typeface = Main.font
	Label1.Gravity= Gravity.RIGHT
	txtName.TextColor= Colors.Black
	txtName.Typeface = Main.font
	txtName.Gravity= Gravity.RIGHT
	txtName.Color=Colors.RGB(179,229,252)
	
	Label2.TextColor= Colors.Black
	Label2.Typeface = Main.font
	Label2.Gravity= Gravity.RIGHT
	txtTag.TextColor= Colors.Black
	txtTag.Typeface = Main.font
	txtTag.Gravity= Gravity.RIGHT
	txtTag.Color=Colors.RGB(179,229,252)
	
	Label3.TextColor= Colors.Black
	Label3.Typeface = Main.font
	Label3.Gravity= Gravity.RIGHT
	txtDescription.TextColor= Colors.Black
	txtDescription.Typeface = Main.font
	txtDescription.Gravity= Gravity.RIGHT
	txtDescription.Color=Colors.RGB(179,229,252)
	
	
	ImageView1.Bitmap =LoadBitmap(File.DirAssets,"sticker_back.jpg")
	ImageView2.Bitmap =Main.groupIcon
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub




Sub ButtonSend_Click
	If(txtDescription.Text.Length < 5 )Then 
		Msgbox("لطفآ متن را وارد نمائید","نقص اطلاعات")
		Return
	End If 
	Try
		Dim job As HttpJob
		ProgressDialogShow("درحال ذخیره سازی")
		job.Initialize("saveing", Me)
	
		job.PostString("http://www.aloosalam.ir/index.php/mobile/index/insertComment","pass=1266"  &   _
				"&name=" & txtName.Text   &    _
				"&mobile=" & txtDescription.Text &   _
				"&text=" & txtTag.Text  &   _
				"&user=" & Main.userInfo.Get("user_id")  & _
				"&v=" & Application.VersionCode &	_
				"&line=" & Main.userInfo.Get("line_number") 	_
				)
	Catch
		Msgbox("خطا در ارسال اطلاعات   ","خطا")
		Activity.Finish
	End Try	
End Sub


Sub JobDone(Job As HttpJob)
	Try
		ProgressDialogHide
		If Job.Success Then
		Dim res As String
			res = Job.GetString
						
			Dim parser As JSONParser
			parser.Initialize(res)
			If Job.JobName= "saveing" Then 
					
					
				Msgbox("با تشکر از حسن توجه شما . نظر ارسال شد .","درخواست ")
				Activity.Finish
						
			End If
		Else
			ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .", True)
		End If
	Catch
		Msgbox("خطا در دریافت اطلاعات ذخیره سازی","خطا") 
		Activity.Finish
	End Try		
End Sub


Sub ButtonBack_Click
	Activity.Finish
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
	
End Sub
Sub btnPanel_Click
	Dim p As PhoneIntents
	Msgbox("نام کاربری شما :" & Main.userInfo.Get("user_name") & CRLF & _
	" رمز عبور اولیه شما " & Main.userInfo.Get("pass") & " می باشد","رمز عبور")
	
	StartActivity(p.OpenBrowser("http://aloosalam.ir/index.php/login/"))
	navi.CloseDrawer2(Gravity.RIGHT)  
End Sub