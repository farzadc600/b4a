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

	Dim selectedOstan As Int 
	Dim selectedShahr As Int 
	Dim selectedCat As Int 
End Sub

Sub Globals
	Private txtName As EditText
	Private txtDescription As EditText
	Private txtTag As EditText
	 
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private Label5 As Label
	Private PanelInputs As Panel 
	Private Label6 As Label
	Private Label7 As Label
	
	Private ScrollView As ScrollView
	Private SpinnerOstan As Spinner
	Private SpinnerShahr As Spinner
	Private SpinnerCat As Spinner
	Private txtAddress As EditText
	
	Private btnMenu As Button
	
	Private btnReturn As Button
	Private LabelMessage As Label
	
	
	Dim navi As AHNavigationDrawer
	Dim pCantent As Panel
End Sub


Sub btnMenu_Click
	navi.OpenDrawer2(navi.GRAVITY_RIGHT)
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	navi.Initialize2("navi",Activity,75%x,navi.GRAVITY_RIGHT)' جهت راس چین بودن ساید بار
	
	
	'navi.NavigationPanel.Initialize("")
	navi.NavigationPanel.LoadLayout("menu")
	
	pCantent.Initialize("")
	navi.ContentPanel.AddView(pCantent,0,0,100%x,100%y)
	pCantent.SendToBack	
	pCantent.LoadLayout("searchView")
	
	
	Label1.TextSize= 15
	Label1.Gravity= Gravity.RIGHT
	Label1.Typeface=Main.font
	
	Label2.TextSize= 15
	Label2.Gravity= Gravity.RIGHT
	Label2.Typeface=Main.font
	
	Label3.TextSize= 15
	Label3.Gravity= Gravity.RIGHT
	Label3.Typeface=Main.font
	
	Label5.TextSize= 15
	Label5.Gravity= Gravity.RIGHT
	Label5.Typeface=Main.font
	Label5.Text  = "جستجو در "  & Main.selectedTypeTitle & " ها "
	Activity.Title = "جستجو در "  & Main.selectedTypeTitle & " ها "
	
	
	txtName.TextSize= 15
	txtName.Gravity= Gravity.RIGHT
	txtName.TextColor= Colors.Black
	txtName.Color= Colors.White
	txtName.Typeface=Main.font
	txtName.Color=Colors.RGB(179,229,252)
	
	txtDescription.TextSize= 15
	txtDescription.Gravity= Gravity.RIGHT
	txtDescription.TextColor= Colors.Black
	txtDescription.Color = Colors.White
	txtDescription.Typeface=Main.font
	txtDescription.Color=Colors.RGB(179,229,252)
	
	
	txtTag.TextSize= 15
	txtTag.Gravity= Gravity.RIGHT
	txtTag.TextColor= Colors.Black
	txtTag.Color= Colors.White
	txtTag.Typeface=Main.font
	txtTag.Color=Colors.RGB(179,229,252)
	
	
	If(Main.selectedType <>  "sticker" And Main.selectedType <> "robot" )Then  'sticker and robot 
		PanelInputs.RemoveView()
		ScrollView.Panel.AddView(PanelInputs,0,0,PanelInputs.Width,PanelInputs.Height)
		ScrollView.Panel.Height =580dip
		ScrollView.Panel.Color=Colors.White
		
		
		
		Label6.Visible = True 
		Label7.Visible = True 
		SpinnerOstan.Visible= True 
		SpinnerShahr.Visible = True 
		
		Label6.TextSize= 15
		Label6.Gravity= Gravity.RIGHT
		Label6.Typeface=Main.font
		
		Label7.TextSize= 15
		Label7.Gravity= Gravity.RIGHT
		Label7.Typeface=Main.font
		
		
		LabelMessage.TextSize= 15
		LabelMessage.Gravity= Gravity.RIGHT
		LabelMessage.Typeface=Main.font
		
		SpinnerOstan.Add("آذربايجان شرقي")
		SpinnerOstan.Add("آذربايجان غربي")
		SpinnerOstan.Add("اردبيل")
		SpinnerOstan.Add("اصفهان")
		SpinnerOstan.Add("ايلام")
		SpinnerOstan.Add("بوشهر")
		SpinnerOstan.Add("تهران")
		SpinnerOstan.Add("چهارمحال وبختياري")
		SpinnerOstan.Add("خراسان جنوبي")
		SpinnerOstan.Add("خراسان رضوي")
		SpinnerOstan.Add("خراسان شمالي")
		SpinnerOstan.Add("خوزستان")
		SpinnerOstan.Add("زنجان")
		SpinnerOstan.Add("سمنان")
		SpinnerOstan.Add("سيستان و بلوچستان")
		SpinnerOstan.Add("فارس")
		SpinnerOstan.Add("قزوين")
		SpinnerOstan.Add("قم")
		SpinnerOstan.Add("كردستان")
		SpinnerOstan.Add("كرمان")
		SpinnerOstan.Add("كرمانشاه")
		SpinnerOstan.Add("كهگيلويه وبوير احمد")
		SpinnerOstan.Add("گلستان")
		SpinnerOstan.Add("گيلان")
		SpinnerOstan.Add("لرستان")
		SpinnerOstan.Add("مازندران")
		SpinnerOstan.Add("مركزي")
		SpinnerOstan.Add("هرمزگان")
		SpinnerOstan.Add("همدان")
		SpinnerOstan.Add("يزد")
		
		SpinnerOstan.DropdownTextColor = Colors.White
		SpinnerOstan.TextColor = Colors.Black
		
		SpinnerCat.Add("دسته بندی نشده")
		SpinnerCat.Add("رسمی")
		SpinnerCat.Add("علمی")
		SpinnerCat.Add("آموزش-تحصیلی")
		SpinnerCat.Add("طنز و سرگرمی")
		SpinnerCat.Add("اجتماعی-خبری")
		SpinnerCat.Add("پزشکی-سلامت")
		SpinnerCat.Add("دوستان شخصی")
		SpinnerCat.Add("تجاری")
		SpinnerCat.Add("ادبی-هنری")
		SpinnerCat.Add("عشق-دلنوشته")
		SpinnerCat.Add("اعتقادی")
		SpinnerCat.Add("شرکت ها-دفتر ها")
		SpinnerCat.Add("مشاغل و صنفی")
		SpinnerCat.Add("ورزشی")
		SpinnerCat.Add("مد و زیبایی")
	
		SpinnerCat.DropdownTextColor = Colors.White
		SpinnerCat.TextColor = Colors.Black
		
		SpinnerShahr.DropdownTextColor = Colors.White
		SpinnerShahr.TextColor = Colors.Black
		

		Label6.Visible =True 
		
		
		
	Else 
		
		Label6.Visible = False  
		Label7.Visible = False  
		SpinnerOstan.Visible= False  
		SpinnerOstan.Visible = False  
		
		Label6.Visible =False 
		
		
		'PanelInputs.Height = 290
	End If 
	
	
	
End Sub

Sub Activity_Resume

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
				Case "search_group"
					
					Dim COUNTRIES As List
					COUNTRIES = parser.NextArray 'returns a list with maps
					
					
					Main.searchResult.Initialize()
					Main.searchResult.Clear()
					
					Dim rows As List
					rows= COUNTRIES.Get(0)
					
					If(rows.Size > 0 ) Then 
						
						For i= 0 To rows.Size-1
							Dim row As Map
							
							row.Initialize()
							row=rows.Get(i)
							Main.searchResult.Add(row)
						Next 
						
						Job.Release
						StartActivity("searchResultAct")
					Else 
						Msgbox("موردی با مشخصات درخواستی شما یافت نشد . از بخش آخرین "  &  Main.selectedTypeTitle & "  ها هم می توانید  " & Main.selectedTypeTitle & " مورد نظر خود را پیدا کنید  . ","جستجو")
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
		Msgbox("خطا در دریافت اطلاعات جستجو  ","خطا")
	
	End Try		
End Sub

Sub ButtonReturn_Click
	Activity.Finish
End Sub
Sub ButtonSearch_Click
	
	
	Try
	
		If (txtName.Text.Length <3 And  txtDescription.Text.Length < 3 And txtTag.Text.Length<3) Then 
			Msgbox("برای جستجو اطلاعات بیشتری مورد نیاز است","اطلاعات بیشتر")
			Return 
		End If
		Dim job As HttpJob
		ProgressDialogShow("درحال جستجو")
		job.Initialize("search_group", Me)
		Main.query="http://www.aloosalam.ir/index.php/mobile/index/search"
		Main.parameter = "pass=1266"  &   _
			"&q=" & txtName.Text   &    _
			"&description=" & txtDescription.Text &   _
			"&tag=" & txtTag.Text &  _
			"&type=" & Main.selectedType & _
			"&ostan=" & selectedOstan & _
			"&shahr=" & selectedShahr & _
			"&cat=" & selectedCat	& _
			"&user=" & Main.userInfo.Get("user_id") & _
			"&v=" & Application.VersionCode	  & _
			"&line=" & Main.userInfo.Get("line_number") 				
		job.PostString(Main.query,Main.parameter )
	Catch
		Msgbox("خطا در ارسال اطلاعات جستجو  ","خطا")
		
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


Sub SpinnerOstan_ItemClick (Position As Int, Value As Object)
	SpinnerShahr.Clear()
	 
	selectedOstan =0
		Dim v As String 
		v= Value
		Select v  
			Case "آذربايجان شرقي"
				selectedOstan =1
			Case "آذربايجان غربي"
				selectedOstan =2
			Case "اردبيل"
				selectedOstan =3
			Case "اصفهان"
				selectedOstan =4
			Case "ايلام"
				selectedOstan =5
			Case "بوشهر"
				selectedOstan =6
			Case "تهران"
				selectedOstan =7
			Case "چهارمحال وبختياري"
				selectedOstan =8
			Case "خراسان جنوبي"
				selectedOstan =9
			Case "خراسان رضوي"
				selectedOstan =10
			Case "خراسان شمالي"
				selectedOstan =11
			Case "خوزستان"
				selectedOstan =12
			Case "زنجان"
				selectedOstan =13
			Case "سمنان"
				selectedOstan =14
			Case "سيستان و بلوچستان"
				selectedOstan =15
			Case "فارس"
				selectedOstan =17
			Case "قزوين"
				selectedOstan =18
			Case "قم"
				selectedOstan =19
			Case "كردستان"
				selectedOstan =20
			Case "كرمان"
				selectedOstan =21
			Case "كرمانشاه"
				selectedOstan =22
			Case "كهگيلويه وبوير احمد"
				selectedOstan =23
			Case "گلستان"
				selectedOstan =24
			Case "گيلان"
				selectedOstan =25
			Case "لرستان"
				selectedOstan =26
			Case "مازندران"
				selectedOstan =27
			Case "مركزي"
				selectedOstan =28
			Case "هرمزگان"
				selectedOstan =29
			Case "همدان"
				selectedOstan =30
			Case "يزد"
				selectedOstan =31
		End Select
		
	
	Dim txt As String
	
	txt = "SELECT id, name  FROM " & Main.DBTableName & " where ostan_id = " & selectedOstan
	
	Dim result As List
	result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt, Null,0)
	
	For i =  0 To result.Size-1
		Dim row As Object
		Dim column() As String 
		row = result.Get(i)
		column = row
		SpinnerShahr.Add(column(1))
	Next
End Sub
Sub SpinnerShahr_ItemClick (Position As Int, Value As Object)
	
	Dim txt As String
	
	txt = "SELECT   id  FROM " & Main.DBTableName & " where name = '" & Value & "'"
	
	Dim result As List
	result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt, Null,0)
	
	
	Dim row As Object
	Dim column() As String 
	row = result.Get(0)
	column = row
	selectedShahr = column(0) 
	
End Sub

Sub SpinnerCat_ItemClick (Position As Int, Value As Object)

	Select Value
		Case "دسته بندی نشده"
			selectedCat =1
		Case "رسمی"
			selectedCat =2
		Case "علمی"
			selectedCat =3
		Case "آموزش-تحصیلی"
			selectedCat =4
		Case "طنز و سرگرمی"
			selectedCat =5
		Case "اجتماعی-خبری"
			selectedCat =6
		Case "پزشکی-سلامت"
			selectedCat =7
		Case "دوستان شخصی"
			selectedCat =8
		Case "تجاری"
			selectedCat =9
		Case "ادبی-هنری"
			selectedCat =10
		Case "عشق-دلنوشته"
			selectedCat =11
		Case "اعتقادی"
			selectedCat =12
		Case "شرکت ها-دفتر ها"
			selectedCat =13
		Case "مشاغل و صنفی"
			selectedCat =14
		Case "ورزشی"
			selectedCat =15
		Case "مد و زیبایی"
			selectedCat =16
	End Select
End Sub
Sub Button1_Click
	Activity.Finish
End Sub