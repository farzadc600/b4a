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
	Dim finishInserting As Boolean
	Dim firs As Boolean  
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	 

	Private Label1 As Label
	Private Panel1 As Panel
	
	Private btnReturn As Button
	Private txtName As EditText
	Private EditTextMobile As EditText
	
	Private Label2 As Label
	Private Label3 As Label
	Private Label5 As Label
	
	
End Sub


Sub Activity_Create(FirstTime As Boolean)

	Activity.LoadLayout("insertedgroupview")

		 
	Panel1.Width = Activity.Width
	Panel1.Height=Activity.Height

	Label1.TextSize= 15
	Label1.Typeface=Main.font
	
	Label1.Gravity= Gravity.RIGHT
	
	Label2.TextSize= 15
	Label2.Typeface=Main.font
	Label2.TextColor=Colors.Black
	
	Label2.Gravity= Gravity.RIGHT

	Label3.TextSize= 15
	Label3.TextColor=Colors.Black
	Label3.Typeface=Main.font
	
	Label3.Gravity= Gravity.RIGHT

	Label5.TextSize= 15
	Label5.Typeface=Main.font
	
	Label5.Gravity= Gravity.RIGHT
	
	txtName.Color= Colors.rgb(179,229,252)
	txtName.TextSize= 15
	txtName.Typeface=Main.font
	
	txtName.Gravity= Gravity.RIGHT
	
	EditTextMobile.Color= Colors.rgb(179,229,252)
	EditTextMobile.TextSize= 15
	EditTextMobile.Typeface=Main.font
	
	EditTextMobile.Gravity= Gravity.RIGHT


	Dim line As String 
	Try 
		line = Main.phoneId.GetLine1Number
	Catch
		line = "need root"
	End Try 	
	Dim job As HttpJob
	ProgressDialogShow("درحال بررسی")
	job.Initialize("register", Me)
	firs=True
	job.PostString("http://www.aloosalam.ir/index.php/mobile/index/register","pass=1266"  &   _
		"&name="   &  _
		"&mobile="  & _
		"&sdk=" & Main.phone.SdkVersion & _
		"&model=" & Main.phone.Manufacturer & ","& Main.phone.Product &  _
		"&line=" & line  & _ 
		"&phone=" & Main.phoneid.GetDeviceId  & _
		"&v=" & Application.VersionCode  & _
		"&line=" & Main.userInfo.Get("line_number") _
		)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub



Sub btnReturn_Click
	
	
	ExitApplication
End Sub

Sub btnInsert_Click
	Dim line As String 
	Try 
		line = Main.phoneId.GetLine1Number
	Catch
		line = "need root"
	End Try 	
	Try
		 
		Dim job As HttpJob
		ProgressDialogShow("درحال ثبت نام")
		job.Initialize("register", Me)
		firs=False
		job.PostString("http://www.aloosalam.ir/index.php/mobile/index/register","pass=1266"  &   _
			"&name="  & txtName.Text &  _
			"&mobile=" & EditTextMobile.Text & _
			"&sdk=" & Main.phone.SdkVersion & _
			"&model=" & Main.phone.Manufacturer & ","& Main.phone.Product &  _
			"&line=" & line  & _ 
			"&phone=" & Main.phoneid.GetDeviceId  _
			& "&v=" & Application.VersionCode  & _
			"&line=" & Main.userInfo.Get("line_number")  _
			)				
			
		
	Catch
		Msgbox("خطا در اتصال به اینترنت  ","خطا")
		
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
			Select Job.JobName
				Case "register"
					
					'Dim COUNTRIES As Map
					'COUNTRIES = parser.NextObject 'returns a list with maps
					
					'Dim rows As List
					'rows= COUNTRIES.Get(0)
		
					Dim row As Map
					
					Dim userId As Int 
					'--
					Dim pass As String 
					
					row.Initialize()
					
					
					row=parser.NextObject
					
					userId=row.Get("id")
					pass=row.Get("password")
					
					If(userId > 0 )Then 
						
						If(Main.userInfo.IsInitialized =False) Then 
							Main.userInfo.Initialize
						End If 	
						Main.userInfo.Put("user_name",row.Get("userName") )
						Main.userInfo.Put("pass",row.Get("password") )
						Main.userInfo.Put("user_id",row.Get("id"))
						Main.userInfo.Put("line_number",row.Get("line"))
						
						'CallSub(Main,"writeInfo")
						

						Msgbox2(row.Get("name")   _
									,row.Get("family") , _
									 "شروع استفاده از برنامه " _
									 ,"","" ,Main.groupIcon)
									 
						CallSubDelayed(Main , "writeInfo")	
						Job.Release		 
						Activity.Finish
						Return
					Else 
						If firs=False Then
							Msgbox(row.Get("name"),row.Get("family"))	
						End If 
					End If 
						
					Job.Release
					
				
			End Select
		Else
			ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .", True)
		End If
	Catch
		Msgbox("خطا در دریافت اطلاعات ثبت نام    ","خطا")
		 
		
	End Try		
	
End Sub


Sub EditTextMobile_EnterPressed
	btnInsert_Click
End Sub