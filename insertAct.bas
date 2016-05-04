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
	Dim name As String 
	Dim desciption As String
	Dim address As String
	Dim searchResult  As List
'	Dim sendType As Int 
	Dim Ostan As String
	Dim Shahr As String 
	Dim Tag As String
	Dim admin As String 
	Dim cat As String 
	
	
	Dim groupIcon As Bitmap
End Sub

Sub Globals
	Dim selectedOstan As Int 
	Dim selectedShahr As Int 
	Dim selectedCat As Int 
	
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txtName As EditText
	Private txtAddress As EditText
	Private txtDescription As EditText
	
	Private LabelName As Label
	Private LabelDesc As Label
	Private LabelAddress As Label
	Private txtAdmin As EditText
	
	Private SpinnerOstan As Spinner
	
	Private SpinnerShahr As Spinner
	
	Private SpinnerCat As Spinner
	Private Label9 As Label
	Private Label8 As Label
	Private Label7 As Label
	Private Label5 As Label
	Private txtTag As EditText
	Private Label10 As Label
	Private ScrollView As ScrollView
	Private PanelInput As Panel
	Private Label6 As Label
	Private Label4 As Label
	Private btnInsert As Button
	
	
	Dim navi As AHNavigationDrawer
	Dim pCantent As Panel 
	Private btnMenu As Button
	 
	Private EditMemberCount As EditText
	Private ImageView1 As ImageView
End Sub

Sub btnMenu_Click
	navi.OpenDrawer2(navi.GRAVITY_RIGHT)
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	 
	navi.Initialize2("navi",Activity,75%x,navi.GRAVITY_RIGHT)' جهت راس چین بودن ساید بار
	
	navi.NavigationPanel.LoadLayout("menu")
	
	pCantent.Initialize("")
	navi.ContentPanel.AddView(pCantent,0,0,100%x,100%y)
	
	pCantent.LoadLayout("insertview")
	pCantent.SendToBack	
	
	
	btnInsert.TextSize= 15
	btnInsert.Gravity= Gravity.CENTER
	btnInsert.Typeface=Main.font
	
	LabelName.TextSize= 15
	LabelName.Gravity= Gravity.RIGHT
	LabelName.Typeface=Main.font
	
	txtName.TextSize=15
	txtName.Gravity=Gravity.RIGHT
	txtName.Typeface=Main.font
	txtName.Color=Colors.RGB(179,229,252)

	LabelDesc.TextSize= 15
	LabelDesc.Gravity= Gravity.RIGHT
	LabelDesc.Typeface=Main.font
	txtDescription.TextSize=15
	txtDescription.Gravity=Gravity.RIGHT
	txtDescription.Typeface=Main.font
	txtDescription.Color=Colors.RGB(179,229,252)
	
	LabelAddress.TextSize= 15
	LabelAddress.Gravity= Gravity.RIGHT
	LabelAddress.Typeface=Main.font
	txtAddress.TextSize=15
	txtAddress.Gravity=Gravity.RIGHT
	txtAddress.Typeface=Main.font
	txtAddress.Color=Colors.RGB(179,229,252)

	Label10.TextSize= 15
	Label10.Gravity= Gravity.RIGHT
	Label10.Typeface=Main.font
	txtTag.TextSize=15
	txtTag.Gravity=Gravity.RIGHT
	txtTag.Typeface=Main.font
	txtTag.Color=Colors.RGB(179,229,252)
	
	Label6.TextSize= 15
	Label6.Gravity= Gravity.RIGHT
	Label6.Typeface=Main.font

	
'	SpinnerCat.Color =Colors.RGB(179,229,252)
'	SpinnerOstan.Color =Colors.RGB(179,229,252)
'	SpinnerShahr.Color =Colors.RGB(179,229,252)

	
	
	SpinnerCat.TextColor =Colors.Black
	SpinnerOstan.TextColor =Colors.Black
	SpinnerShahr.TextColor =Colors.Black
	
	SpinnerCat.DropdownTextColor =Colors.White
	SpinnerOstan.DropdownTextColor =Colors.White
	SpinnerShahr.DropdownTextColor =Colors.White

	
	Label7.TextSize= 15
	Label7.Gravity= Gravity.RIGHT
	Label7.Typeface=Main.font
	
	
	Label8.TextSize= 15
	Label8.Gravity= Gravity.RIGHT
	Label8.Typeface=Main.font
	
	Label9.TextSize= 15
	Label9.Gravity= Gravity.RIGHT
	Label9.Typeface=Main.font
	txtAdmin.TextSize=15
	txtAdmin.Gravity=Gravity.RIGHT
	txtAdmin.Typeface=Main.font
	txtAdmin.Color=Colors.RGB(179,229,252)
	
	EditMemberCount.TextSize=15
	EditMemberCount.Gravity=Gravity.RIGHT
	EditMemberCount.Typeface=Main.font
	EditMemberCount.Color=Colors.RGB(179,229,252)
	
	Select Main.selectedType
		Case "group"
			 
			LabelName.Text = "اسم گروه:" 
			
			LabelDesc.Text="متن کوتاه درباره گروه:"
			LabelAddress.Text="آدرس گروه :  شبیه(https://telegram.me/joinchat/xasdsw) آدرس های غیر این باز نمی شوند"
			Label9.Text ="موبایل یا آی دی ادمین"
			btnInsert.Text="ثبت گروه"
		Case "id" 
			LabelName.Text = "نام :" 
			LabelDesc.Text="متن کوتاه درباره خودتون:"
			LabelAddress.Text="آی دی تلگرام :  شبیه(https://telegram.me/nasservb) یا @nasservb"
			Label9.Text ="موبایل یا آی دی ادمین"
			btnInsert.Text="ثبت آی دی"
		Case "sticker"
			LabelName.Text = "عنوان :" 
			LabelDesc.Text="توضیح کوتاه :"
			LabelAddress.Text="آدرس تلگرام:  شبیه(https://telegram.me/addstickers/ziba)  یا @ziba"
			Label9.Text ="موبایل یا آی دی سازنده "
			btnInsert.Text="ثبت استیکر"
		Case "robot"
			LabelName.Text = "عنوان :" 
			LabelDesc.Text="توضیح کوتاه :"
			LabelAddress.Text="آدرس تلگرام:  شبیه(https://telegram.me/bot_gard) یا @bot_gard"
			Label9.Text ="موبایل یا آی دی سازنده"
			btnInsert.Text="ثبت ربات"
		'5-zabanak , 6-telsite
		Case "channel"
			LabelName.Text = "عنوان :" 
			LabelDesc.Text="توضیح کوتاه :"
			LabelAddress.Text="آدرس تلگرام:  شبیه(https://telegram.me/mamadar_ir)  یا @mamadar_ir . "
			Label9.Text ="موبایل یا آی دی ادمین"
			btnInsert.Text="ثبت کانال"
		Case "ads"
			LabelName.Text = "عنوان تبلیغ:" 
			LabelDesc.Text="توضیح کوتاه :"
			LabelAddress.Text="آدرس :  شبیه(آدرس وب شبیه http://)  یا (آدرس تلگرام شبیه @mamadar_ir ) "
			Label9.Text ="موبایل یا آی دی ادمین"
			btnInsert.Text="ثبت و ادامه "	
		Case "order"
			LabelName.Text = "عنوان استیکر:" 
			LabelDesc.Text="  - متن توضیح کوتاه :"
			LabelAddress.Text="شماره استیکر های درخواستی- از لیست استیکر های نمونه تهیه کنید 1-2-... "
			Label9.Text ="موبایل یا آی دی تلگرام برای تحویل استیکر"
			btnInsert.Text="ثبت و ادامه "		
	End Select
	
	
	Label5.TextSize= 15
	Label5.Gravity= Gravity.RIGHT
	Label5.Typeface=Main.font
	
	If Main.isEdit = True Then 
		Label5.Text  = " ویرایش اطلاعات "  & Main.selectedTypeTitle 
		Activity.Title= " ویرایش اطلاعات "  & Main.selectedTypeTitle 
		
	Else If  Main.isSuperGroup=True Then
	
		
		Label5.Text =  "    .تعداد مجوز باقیمانده  : " _
		 				& (2 - Main.vipInsertCount)
		Activity.Title= "   ثبت اطلاعات سوپر گروه " 
		
		Label4.Color =Colors.rgb(236,64,122)
		
	Else 
		Label5.Text  = " ثبت اطلاعات "  & Main.selectedTypeTitle 
		Activity.Title= " ثبت اطلاعات "  & Main.selectedTypeTitle 
	
	End If
	

	If(Main.selectedType <>  "sticker" And Main.selectedType <> "robot" And Main.selectedType <> "id" And Main.selectedType <> "order"   )Then  'sticker and robot 
		
		
		Label7.Visible = True 
		SpinnerOstan.Visible= True 
		SpinnerShahr.Visible = True 
	

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
	
		Label6.Visible =True 
	
		
		'PanelInput.Initialize("")
		PanelInput.RemoveView()
		'PanelInput.Height=900dip
		'ScrollView.Panel.AddView(PanelInput,0,0,PanelInput.Width,PanelInput.Height)
		ScrollView.Panel.AddView(PanelInput,0,0,100%x,900dip)
		ScrollView.Panel.Height = 880dip
		ScrollView.Color = Colors.White
		
		If(Main.isEdit= True)Then
			txtName.Text = Main.selected_item.Get("title")
			txtDescription.Text= Main.selected_item.Get("description")
			txtTag.Text= Main.selected_item.Get("tag")
			txtAddress.Text= Main.selected_item.Get("telegramAddress")
			txtAdmin.Text= Main.selected_item.Get("ownerId")
			EditMemberCount.Text= Main.selected_item.Get("memberCount")
			
			ScrollView.Panel.Height = 970dip
		End If 
		
	Else 
		
		Label6.Visible = False  
		Label7.Visible = False  
		SpinnerOstan.Visible= False  
		SpinnerOstan.Visible = False  
		
		Label6.Visible =False 
	
		
	End If 
	
End Sub

Sub Activity_Resume
	If(Main.selected_item.IsInitialized=True And  Main.selected_item.Get("title") = txtName.Text And Main.isEdit =False ) Then 
		Activity.Finish
	End If
	
	If Main.isEdit = True Then 
		Label5.Text  = " ویرایش اطلاعات "  & Main.selectedTypeTitle 
		Activity.Title= " ویرایش اطلاعات "  & Main.selectedTypeTitle 
		
	Else If  Main.isSuperGroup=True Then
	
		
		Label5.Text = "  .تعداد مجوز باقیمانده : " &  _
				(1-Main.vipInsertCount)
		Activity.Title= " ثبت اطلاعات سوپر گروه"
		
		Label4.Color =Colors.rgb(236,64,122)
		
		
			
	Else 
		Label5.Text  = " ثبت اطلاعات "  & Main.selectedTypeTitle 
		Activity.Title= " ثبت اطلاعات "  & Main.selectedTypeTitle 
	
	End If
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnReturn_Click
	Activity.Finish
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
					
				Dim COUNTRIES As List
				COUNTRIES = parser.NextArray 'returns a list with maps
				
				
				Dim row As Map
				 	
				row.Initialize()
				'row=rows.Get(0)
				
				
				row.Initialize()
				row=COUNTRIES.Get(0)
				
				Job.Release
				Dim id As Int
				id= row.Get("id")
				If( id> 0 ) Then 
					Main.selected_item = row
					
					If(Main.isEdit=False _
						And (Main.selectedType = "group" Or Main.selectedType = "channel" ) _
						) Then 
						
						If (Main.isSuperGroup=False ) Then 
							Main.todayInsertCount = Main.todayInsertCount +1 
						Else 	
							Main.vipInsertCount = Main.vipInsertCount +1 
						end  if 	
						writeInfo
					End If 
					
					If (Main.isEdit=True ) Then
					
						StartActivity("groupViewAct")	
					End If 
						
					
				Else 
					Msgbox(row.Get("title") , "خطا")	
				End If
			else If( Job.JobName  = "broke_group") Then 
					
				Msgbox("با تشکر از حسن توجه شما . مورد حذف شد .","درخواست حذف")
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

Sub save

Try
		Dim job As HttpJob
		ProgressDialogShow("درحال ذخیره سازی")
		job.Initialize("saveing", Me)
		
		name = txtName.Text
		desciption  =  txtDescription.Text	
		address =  txtAddress.Text
		admin =  txtAdmin.Text
		Tag =  txtTag.Text
		Dim id As Int 	
		If(Main.isEdit = True And Main.selected_item.IsInitialized)Then 
			id = Main.selected_item.Get("id")
		Else 
			id =0 
		End If 		
		
			job.PostString("http://www.aloosalam.ir/index.php/mobile/index/insert","pass=1266"  &   _
				"&name=" & name   &    _
				"&description=" & desciption &   _
				"&address=" & address  &   _
				"&admin=" & admin  &   _
				"&cat=" & selectedCat &   _
				"&ostan=" & selectedOstan &   _
				"&shahr=" & selectedShahr &  _
				"&tag=" & Tag & _
				"&type=" & Main.selectedType  &   _
				"&isEdit=" & Main.isEdit &   _
				"&isSupper=" & Main.isSuperGroup &   _
				"&id=" & id &   _
				"&user=" & Main.userInfo.Get("user_id")  & _
				"&v=" & Application.VersionCode &	_
				"&line=" & Main.userInfo.Get("line_number") 	_
				)
		
	Catch
		Msgbox("خطا در ارسال اطلاعات   ","خطا")
		Activity.Finish
	End Try	
	
 End Sub 

Sub btnInsert_Click
	If(Main.isEdit=False _
	 	And (Main.selectedType = "group" Or Main.selectedType = "channel") _ 
	 	) Then
			If ((Main.isSuperGroup=False )And (Main.todayInsertCount >8 )) Then  
				
				Msgbox("روزانه امکان ثبت بیش از هشت گروه یا کانال وجود ندارد. ","عدم دسترسی")
				Return
			else If ((Main.isSuperGroup=True )And (Main.vipInsertCount >4 )) Then  	
				Msgbox("روزانه امکان ثبت بیش از چهار سوپر گروه وجود ندارد. ","عدم دسترسی")
				Return
			End If 
	End If 	
	
	If (txtName.Text.Length < 2 Or txtDescription.Text.Length<3 ) Then 
		Msgbox ("اطالاعات ورودی کم است-اسم ، توضیح" ,		"درج ورودی"	)
		Return 
	End If
	
	If (Main.selectedType<>"order" And Main.selectedType<>"ads" And txtAddress.Text.Length < 4 ) Then 
		Msgbox ("آدرس را بنویسید" , "آدرس خالی است" )
		Return 
	End If
	
	Dim content As String 
	content = 	txtName.Text & " " & txtDescription.Text & " " & txtTag.Text
	content = content.ToLowerCase 

		If( _ 
				(content.Contains("سکس") =  True )Or _
				(content.Contains("sex") =  True) Or _
				(content.Contains("کس ننه") =  True)Or _
				(content.Contains("کس ننه") =  True)Or _
				(content.Contains("بگا") =  True)Or _
				(content.Contains("سگس") =  True)Or _
				(content.Contains("ارضا") =  True)Or _
				(content.Contains("سکسی") =  True)Or _
				(content.Contains("سیکس") =  True)Or _
				(content.Contains("xxx") =  True)Or _
				(content.Contains("همجنس") =  True)Or _
				(content.Contains("شهو") =  True)Or _
				(content.Contains("سکس") =  True)Or _
				(content.Contains("کوس") =  True)Or _
				(content.Contains("کوص") =  True)Or _
				(content.Contains("جنده") =  True)Or _
				(content.Contains("ناف") =  True)Or _
				(content.Contains("کير") =  true)Or _
				(content.Contains("كير") =  true)Or _
				(content.Contains("کون") =  true)Or _
				(content.Contains("پورن") =  true)Or _
				(content.Contains("سوسکی") =  true)Or _
				(content.Contains("30") =  true)Or _
				(content.Contains("س ک س") =  true)Or _
				(content.Contains("gay") =  true)Or _
				(content.Contains("سکسي") =  true)Or _
				(content.Contains("85") =  true)Or _
				(content.Contains("کاندوم") =  true)Or _
				(content.Contains("کیر") =  true)Or _
				(content.Contains("ممه") =  true)Or _
				(content.Contains("پستان") =  true)Or _
				(content.Contains("س.ک.س") =  true)Or _
				(content.Contains("حشر") =  true)Or _
				(content.Contains("خاک") =  true)Or _
				(content.Contains("exi") =  true)Or _
				(content.Contains("exy") =  true)Or _
				(content.Contains("سسک") =  true)Or _
				(content.Contains("بکن") =  true)Or _
				(content.Contains("آبت") =  true)Or _
				(content.Contains("ابت") =  true)Or _
				(content.Contains("گوز") =  true)Or _
				(content.Contains("سیکتیر") =  true)Or _
				(content.Contains("فیلم سوپر") =  true)Or _
				(content.Contains("لاشی") =  true)Or _
				(content.Contains("داغ") =  true)Or _
				(content.Contains("سگس") =  true)Or _
				(content.Contains("ووف") =  true)Or _
				(content.Contains("جق") =  true)Or _
				(content.Contains("s") =  true And content.Contains("e") =  true And content.Contains("x") =  true ) _
	 ) Then
	 Msgbox("خواهش می کنیم مطالب ناهنجار درج نکنید ." & CRLF &  _ 
	  "هزاران کاربر با سلیقه ها و سن و سالهای مختلف از برنامه استفاده می کنند ."  & CRLF & _ 
	   "ما مجبوریم کاربران متخلف را تا 48 ساعت و در صورت تکرار دائم بلاک کنیم ." _
	   ,"  خطای محتوا")
		Return
	 
	End If

	
	If(  txtAddress.Text.StartsWith("http://telegram.me/")) Then 
		txtAddress.Text = txtAddress.Text.Replace("http","https")
	else if (txtAddress.Text.StartsWith("telegram.me/")) Then 	
		txtAddress.Text = "https://" & txtAddress.Text
	End If
	
		Select Main.selectedType
				
				Case "group"
					If(txtAddress.Text.StartsWith("https://telegram.me/") And txtAddress.Text.StartsWith("https://telegram.me/join")=False)  Then 
						Msgbox("آدرس ورودی مربوط به گروه نیست . برای ثبت کانال ، ربات و موارد دیگر از بخش مربوط به هرکدام استفاده کنید ","اشکال در ورود اطلاعات")	
					Else If( (txtAddress.Text.StartsWith("http://") _ 
							Or txtAddress.Text.StartsWith("wwww"))  ) Then 
						Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی")
						
						Return
					else If( txtAddress.Text.StartsWith("https://telegram.me/join")=True)  Then 	
						'//currect
					Else 
						Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات")
						Return
					End If 
					
					If IsNumber(EditMemberCount.Text)=False Then 
						EditMemberCount.Text="0"
					End If 
					
					
					
					
				Case "ads"
					If(txtAddress.Text.StartsWith("https://telegram.me/")=False And txtAddress.Text.Contains("@"))  Then 
						txtAddress.Text = txtAddress.Text.Replace("@","")
						txtAddress.Text = "https://telegram.me/" & txtAddress.Text
					
					End If 
					
						
				Case "id" 
					
					If(  txtAddress.Text.Contains("@") And txtAddress.Text.StartsWith("https://telegram.me/")=False )  Then 
						txtAddress.Text = txtAddress.Text.Replace("@","")
						txtAddress.Text = "https://telegram.me/" & txtAddress.Text
					Else If( (txtAddress.Text.StartsWith("http://") _ 
							Or txtAddress.Text.StartsWith("www"))   ) Then 
						Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی")
						
						Return
					else If( txtAddress.Text.StartsWith("https://telegram.me/")=True)  Then 	
						'//currect	
					Else 
						Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات")
						Return
					End If 
					
				Case "order"	
				
				Case "robot"	
					If(  txtAddress.Text.Contains("@") And _
						txtAddress.Text.StartsWith("https://telegram.me/")=False _
						And txtAddress.Text.ToLowerCase.Contains("bot"))  Then 
						
						txtAddress.Text = txtAddress.Text.Replace("@","")
						txtAddress.Text = "https://telegram.me/" & txtAddress.Text
						
					Else If( (txtAddress.Text.StartsWith("http://") _ 
							Or txtAddress.Text.StartsWith("www"))  ) Then 
						Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست .  برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی")
						
						Return
					else If( txtAddress.Text.StartsWith("https://telegram.me/bot_")=True)  Then 	
						'//currect	
					Else 
						Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات")
						Return
					End If 
					
					
				Case "channel"
					
					If(txtAddress.Text.StartsWith("https://telegram.me/")=False And txtAddress.Text.Contains("@"))  Then 
						txtAddress.Text = txtAddress.Text.Replace("@","")
						txtAddress.Text = "https://telegram.me/" & txtAddress.Text
						
					Else If( (txtAddress.Text.StartsWith("http://") _ 
							Or txtAddress.Text.StartsWith("www"))   ) Then 
						Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست . برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی")
						Return
					else If( txtAddress.Text.StartsWith("https://telegram.me/")=True)  Then 	
						'//currect	
					Else 
						Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات")
						Return
					End If 
					
				Case "sticker"  '1 or  othen "group"
					If(txtAddress.Text.StartsWith("https://telegram.me/") And txtAddress.Text.StartsWith("https://telegram.me/addstickers")=False)  Then 
						Msgbox("آدرس ورودی مربوط به استیکر نیست . برای ثبت کانال ، ربات و موارد دیگر از بخش مربوط به هرکدام استفاده کنید ","اشکال در ورود اطلاعات")	
						Return
					else If(txtAddress.Text.StartsWith("https://telegram.me/addstickers")=False And txtAddress.Text.Contains("@"))  Then 
						txtAddress.Text = txtAddress.Text.Replace("@","")
						txtAddress.Text = "https://telegram.me/addstickers/" & txtAddress.Text
						
					Else If( (txtAddress.Text.StartsWith("http://") _ 
							Or txtAddress.Text.StartsWith("www"))  ) Then 
						Msgbox("درج لینک تبلیغاتی در آدرس امکان پذیر نیست . برای ثبت تبلیغات از دکمه ثبت تبلیغ استفاده کنید"," استفاده تبلیغاتی")
						
						Return
					else If( txtAddress.Text.StartsWith("https://telegram.me/addstickers")=True)  Then 	
						'//currect	
					Else 
						Msgbox("آدرس وارد شده صحیح نمی باشد لطفآ در ورود اطلاعات دقت فرمائید . راهنما را مطالعه کنید."," درج اطلاعات")
						Return
					End If 
		End Select
			
	
	 name = txtName.Text
	 desciption=txtDescription.Text
	 address =txtAddress.Text
	 admin=txtAdmin.Text
	 Tag=txtTag.Text
	 save
End Sub

Sub SpinnerOstan_ItemClick (Position As Int, Value As Object)
	SpinnerShahr.Clear()
	 
'    SpinnerShahr.TextSize = 11
'    SpinnerShahr.TextColor = Colors.Black 
	selectedOstan =0
		Dim v As String 
		v= Value
		Ostan   = v 
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
	
	Shahr = Value 
	
	Dim row As Object
	Dim column() As String 
	row = result.Get(0)
	column = row
	selectedShahr = column(0) 
End Sub

Sub SpinnerCat_ItemClick (Position As Int, Value As Object)
	cat = Value 
	
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
	Msgbox("نام کاربری شما :" & Main.userInfo.Get("user_name") & CRLF & _
	" رمز عبور اولیه شما " & Main.userInfo.Get("pass") & " می باشد","رمز عبور")
	
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

Sub ButtonRemove_Click
	Dim id As Int
	id = Main.selected_item.Get("id")	
	Try
	
		Dim job As HttpJob
		ProgressDialogShow("درحال ارسال")
		job.Initialize("broke_group", Me)
								
		job.PostString("http://www.aloosalam.ir/index.php/mobile/index/linkBroken/" & (id*34) ,"pass=1266" & _
		"&user=" & Main.userInfo.Get("user_id")  & "&v=" & Application.VersionCode & "&delete=1" )
	Catch
		Msgbox("خطا در ارسال اطلاعات   ","خطا")
		
	End Try	
End Sub

Sub writeInfo 
	
	If(Main.userInfo.IsInitialized =False) Then 
		Main.userInfo.Initialize
	End If 	

	Dim line As String 
	
	Try 
		line = Main.phoneId.GetLine1Number
	Catch
		line = "need root"
	End Try 	
	
	Main.userInfo.Put("sdk",Main.phone.SdkVersion)
	Main.userInfo.Put("model",Main.phone.Manufacturer & ","& Main.phone.Product)
	Main.userInfo.Put("line_number",line)
	Main.userInfo.Put("phoneid",Main.phoneId.GetDeviceId)
	


	Main.userInfo.Put("to_day_insert_advance",Main.vipInsertCount)
	Main.userInfo.Put("to_day_insert",Main.todayInsertCount)

	Dim updateQuery As String  = "update  info set " &  _					
		"name  ='" & Main.userInfo.Get("name") & "'," & _                                         
		"phone	 ='" &  Main.userInfo.Get("phone") & "'," & _                              
		"user_id	 =" &  Main.userInfo.Get("user_id")  & "," & _                                   
		"pass	 ='" & Main.userInfo.Get("pass")  & "'," & _                                    
		"user_name	 ='" & Main.userInfo.Get("user_name")  & "'," & _                              
		"sdk	 ='" &   Main.userInfo.Get("sdk")  & "'," & _                                   
		"model	 ='" & Main.userInfo.Get("model")   & "'," & _                            
		"line_number	 ='" &  Main.userInfo.Get("line_number") & "'," & _                       
		"phoneid	 ='" &  Main.userInfo.Get("phoneid")  & "'," & _                                
		"is_advance	 ='" &  Main.userInfo.Get("is_advance") & "'," & _                         
		"is_premium	 ='" & Main.userInfo.Get("is_premium")  & "'," & _                        
		"advance_count	 =" & Main.userInfo.Get("advance_count")   & "," & _              
		"advance_expier_date	 ='" &  Main.userInfo.Get("advance_expier_date")  & "'," & _                  
		"to_day_date	 ='" & Main.userInfo.Get("to_day_date")   & "'," & _                  
		"to_day_insert	 =" & Main.userInfo.Get("to_day_insert") & "," & _              
		"to_day_insert_advance	 =" & Main.userInfo.Get("to_day_insert_advance") 
	
	DBUtils.ExecuteMemoryTable(Main.SQL1,  updateQuery , Null,0)
	
End Sub 
