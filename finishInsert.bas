Type=Activity
Version=5.02
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
	Dim insertedGroup As Map
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ListCat As ListView
	Private txtMember As EditText
	Private txtAdmin As EditText
	Private catItem As String
	Private lblCat As Label
	Private Panel1 As Panel
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private SpinnerCat As Spinner
	Private SpinnerOstan As Spinner
	Private SpinnerShahr As Spinner
	Private LabelCat As Label
	Private lblShahr As Label
	Private lblOstan As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("finishinsert")
	
	Panel1.Width = Activity.Width
	Panel1.Height=Activity.Height

	Label1.TextSize= 15
	Label1.Gravity= Gravity.RIGHT
	Label1.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	
	Label2.TextSize= 15
	Label2.Gravity= Gravity.RIGHT
	Label2.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	
	Label3.TextSize= 15
	Label3.Gravity= Gravity.RIGHT
	Label3.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	lblCat.TextSize= 15
	lblCat.Gravity= Gravity.RIGHT
	lblCat.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	txtMember.TextSize= 15
	txtMember.Gravity= Gravity.RIGHT
	txtMember.TextColor =Colors.Black
	txtMember.Color = Colors.White
	txtMember.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
		
	txtAdmin.TextSize= 15
	txtAdmin.Gravity= Gravity.RIGHT
	txtAdmin.TextColor =Colors.Black
	txtAdmin.Color = Colors.White
	txtAdmin.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
			
	ListCat.SingleLineLayout.ItemHeight = 30dip
    ListCat.SingleLineLayout.Label.TextSize = 14
    ListCat.SingleLineLayout.Label.TextColor = Colors.Black
    ListCat.SingleLineLayout.Label.Gravity = Gravity.CENTER
    ListCat.SingleLineLayout.Label.Typeface = Typeface.LoadFromAssets("BKoodakBold.ttf")
	ListCat.ScrollingBackgroundColor = Colors.Gray
	
	ListCat.AddSingleLine("دسته بندی نشده")'1
	ListCat.AddSingleLine("رسمی")'2
	ListCat.AddSingleLine("علمی")'3
	ListCat.AddSingleLine("آموزش-تحصیلی")'4
	ListCat.AddSingleLine("طنز و سرگرمی")'5
	ListCat.AddSingleLine("اجتماعی-خبری")'6
	ListCat.AddSingleLine("پزشکی-سلامت")'7
	ListCat.AddSingleLine("دوستان شخصی")'8
	ListCat.AddSingleLine("تجاری")'9
	ListCat.AddSingleLine("ادبی-هنری")'10
	ListCat.AddSingleLine("عشق-دلنوشته")'11
	ListCat.AddSingleLine("اعتقادی")'12
	ListCat.AddSingleLine("شرکت ها-دفتر ها")'13
	ListCat.AddSingleLine("مشاغل و صنفی")'14
	ListCat.AddSingleLine("ورزشی")'15
	ListCat.AddSingleLine("مد و زیبایی")'16
	
	

End Sub

Sub Activity_Resume
	If(viewInsertedGroupAct.finishInserting = True) Then 
		Activity.Finish
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub JobDone(Job As HttpJob)
	Try
		ProgressDialogHide
		If Job.Success Then
		Dim res As String
			res = Job.GetString
			
			Log("Response from server: " & res)
			Dim parser As JSONParser
			parser.Initialize(res)
			Select Job.JobName
				Case "insert_group"
					Dim COUNTRIES As List
					COUNTRIES = parser.NextArray 'returns a list with maps
					
					insertedGroup = COUNTRIES.Get(0)
					
					If(insertedGroup.Get("id") <> 0 )Then 
						Msgbox("تبریک ! گروه به خوبی ثبت شد ","نتیجه")
						Job.Release
						StartActivity("viewInsertedGroupAct")
					Else 
						Msgbox(insertedGroup.Get("title"),"خطا")
						
					End If
					
					
					
				Case ""
					Dim l As List
					l = parser.NextArray
					If l.Size = 0 Then
						'lblPopulation.Text = "N/A"
					Else
						Dim m As Map
						m = l.Get(0)
						'lblPopulation.Text = NumberFormat2(m.Get("population"),0, 0, 0, True) & " (K)"
					End If
			End Select
		Else
			ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .", True)
		End If
	Catch
		Msgbox("خطا در دریافت اطلاعات  ","خطا")
		
	End Try		
End Sub

Sub btnInsert_Click
	Try
	
		If (insertAct.adress.Length<10 AND txtAdmin.Text.Length< 3) Then 
			Msgbox ("یکی از مقادیر آدرس گروه  یا آی دی ادمین را بنویسید" , "آدرس گروه  و آی دی ادمین" )
			Return 
		End If
		
		Dim job As HttpJob
		ProgressDialogShow("درحال بررسی برای ثبت گروه")
		job.Initialize("insert_group", Me)

								
		job.PostString("http://www.mamadar.ir/index.php/mobile/index/insert","pass=1266"  &   _
				"&name=" & insertAct.name   &    _
				"&description=" & insertAct.desciption  &   _
				"&address=" & insertAct.adress  &   _
				"&admin=" & txtAdmin.Text  &   _
				"&member=" & txtMember.Text  &   _
				"&cat=" & catItem &   _
				"&ostan=" & locationAct.selectedOstan &   _
				"&shahr=" & locationAct.shahr &  _
				"&tag=" & locationAct.tag  _
				)

		'job.PostString("http://www.mamadar.ir/index.php/mobile/index/search","pass=1266&q=قایش")
		'job.PostString("http://www.niazy.ir/1.php","pass=1266&q=قایش")
		
	Catch
		Msgbox("خطا در ارسال اطلاعات  ","خطا")
		ProgressDialogHide
	End Try							
								
End Sub
Sub btnReturn_Click
	Activity.Finish
End Sub
Sub ListCat_ItemClick (Position As Int, Value As Object)
	lblCat.Text =Main.cat(Position+1)
	catItem = Position
End Sub


Sub SpinnerCat_ItemClick (Position As Int, Value As Object)
	
End Sub
Sub SpinnerOstan_ItemClick (Position As Int, Value As Object)
	
End Sub
Sub SpinnerShahr_ItemClick (Position As Int, Value As Object)
	
End Sub