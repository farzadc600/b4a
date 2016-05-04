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
	
	Private ScrollView1 As ScrollView
	Private Panel2 As Panel
	Private btnJoin2 As Button
	Private btnJoin1 As Button
	
	Private ImageBackground As ImageView
	
	Private lastProductBuy As String 
	 
	Private LabelDesc2 As Label
	Private LabelDesc1 As Label
	Private LabelTitle2 As Label
	Private LabelTitle1 As Label
	
	Private ImagePreivew As ImageView
	Private ImageView2 As ImageView
	Private ImageView1 As ImageView
	
	Private btnMenu As Button
	
	Dim navi As AHNavigationDrawer
	Dim pCantent As Panel 
	Private LabelPrice1 As Label
	Private Label3 As Label
	Private Label1 As Label
	Private ImageView3 As ImageView
	Private Label2 As Label
	Private ButtonJoin3 As Button
	Private LabelPrice2 As Label
	Private LabelDesc As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	
	'Activity.LoadLayout("searchresultview")
	navi.Initialize2("navi",Activity,75%x,navi.GRAVITY_RIGHT)' جهت راس چین بودن ساید بار
	
	
	'navi.NavigationPanel.Initialize("")
	navi.NavigationPanel.LoadLayout("menu")
	
	pCantent.Initialize("")
	navi.ContentPanel.AddView(pCantent,0,0,100%x,100%y)
	pCantent.SendToBack	
	pCantent.LoadLayout("buy_product_view")
	
	Panel2.RemoveView 
	ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width,Panel2.Height) 
	ScrollView1.Panel.Height=1250dip	
	
	Panel2.Color = Colors.rgb(187,222,251)
	
	 LabelDesc.Typeface =Main.font 
	 LabelDesc.TextSize =17 
	 LabelDesc.Gravity = Gravity.CENTER
	 
	 LabelDesc2.Typeface =Main.font  
	 LabelDesc2.TextSize =15  
	 LabelDesc2.Gravity = Gravity.RIGHT 
	 
	 LabelDesc1.Typeface =Main.font  
	 LabelDesc1.TextSize =15  
	 LabelDesc1.Gravity = Gravity.RIGHT 
	 
	 LabelTitle2.Typeface =Main.font 
	 LabelTitle2.TextSize =17
	 LabelTitle2.Gravity = Gravity.CENTER
	 LabelTitle2.Color = Colors.rgb(187,222,251)
	 LabelTitle2.TextColor =  Colors.rgb(0,105,92)
	 
	 LabelTitle1.Typeface =Main.font 
	 LabelTitle1.TextSize =17 
	 LabelTitle1.Gravity = Gravity.CENTER
	 LabelTitle1.Color = Colors.rgb(187,222,251)
	 LabelTitle1.TextColor =  Colors.rgb(0,105,92)
	 
	 Label1.Typeface =Main.font  
	 Label1.TextSize =15  
	 Label1.Gravity = Gravity.RIGHT
	 
	 
	 Label2.Typeface =Main.font  
	 Label2.TextSize =15  
	  
	 Label3.Typeface =Main.font  
	 Label3.TextSize =15  
	 Label3.Color = Colors.rgb(187,222,251)
	 Label3.TextColor =  Colors.rgb(0,105,92)
	 
	 ButtonJoin3.Typeface =Main.font  
	 ButtonJoin3.TextSize =15  
	 
	 
	 LabelDesc1.Color=Colors.rgb(187,222,251)
	 Label1.Color = Colors.rgb(187,222,251)
	 Label1.TextColor =  Colors.rgb(0,105,92)
	 LabelDesc2.Color=Colors.rgb(187,222,251)
	 
	 Dim back,img1,img2 As Bitmap
	 back.Initialize(File.DirAssets,"channel_back.jpg")
	 img1.Initialize(File.DirAssets,"adsIcon.png")
	 img2.Initialize(File.DirAssets,"adsIcon.png")
	 
	 LabelPrice1.Color =Colors.rgb(128,203,196)
	 LabelPrice2.Color =Colors.rgb(128,203,196)
	 Label2.Color = Colors.rgb(128,203,196)
	 
	 LabelPrice1.TextColor =Colors.rgb(0,105,92)
	 LabelPrice2.TextColor =Colors.rgb(0,105,92)
	 Label2.TextColor = Colors.rgb(0,105,92)
	 
	 
	 ImagePreivew.Bitmap = Main.groupIcon
	 
	
	 If(Main.selectedType= "order")Then
	 	
		 back.Initialize(File.DirAssets,"sticker_back.jpg")
		ImagePreivew.Bitmap =Main.stickerIcon
		
		img1=Main.stickerIcon
		img2=Main.stickerIcon
		
	 	LabelTitle1.Text = "بسته استیکر پنج تایی"
	 	Label3.Text = "بسته استیکر ده تایی"
	 	LabelTitle2.Text = "بسته استیکر بیست تایی"
		
		LabelDesc1.Text = "پنج عدد استیکر سفارشی زیبا " & "کار گرافیکی عالی"& "بدون تبلیغات درون استیکر" & CRLF & _
		"این استیکر ها پس از سفارش توسط تیم گرافیکی ما طبق توضیحات و انتخاب های شما ساخته می شوند . پس از ساخته شدن لینک مجموعه استیکر ساخته شده در برنامه تلگرام به چت خصوصی شما ارسال می شود ."
		
		Label1.Text = "ده عدد استیکر سفارشی زیبا " & "کار گرافیکی عالی"& "بدون تبلیغات درون استیکر" & CRLF & _
		"این استیکر ها پس از سفارش توسط تیم گرافیکی ما طبق توضیحات و انتخاب های شما ساخته می شوند . پس از ساخته شدن لینک مجموعه استیکر ساخته شده در برنامه تلگرام به چت خصوصی شما ارسال می شود ."
		
		LabelDesc2.Text ="بیست عدد استیکر سفارشی زیبا " & "کار گرافیکی عالی"& "بدون تبلیغات درون استیکر" & CRLF & _
		"این استیکر ها پس از سفارش توسط تیم گرافیکی ما طبق توضیحات و انتخاب های شما ساخته می شوند . پس از ساخته شدن لینک مجموعه استیکر ساخته شده در برنامه تلگرام به چت خصوصی شما ارسال می شود ."
		
		
		LabelPrice1.Text = "قیمت این بسته پنج هزار تومان است"
		Label2.Text = "قیمت این بسته هفت هزار تومان است"
		LabelPrice2.Text = "قیمت این بسته نه هزار تومان است"
		
		
		btnJoin1.Text="خرید بسته استیکر پنج تایی"
		ButtonJoin3.Text="خرید بسته استیکر ده تایی"
		btnJoin2.Text="خرید بسته استیکر بیست تایی"
		
		
		LabelDesc.Text = ""
	 End If 
	 ImageView1.Bitmap =img1
	 ImageView2.Bitmap = img2
	 ImageView3.Bitmap = img2
	 ImageBackground.Bitmap = back
End Sub



Sub btnMenu_Click
	navi.OpenDrawer2(navi.GRAVITY_RIGHT) 
End Sub 

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnReturn_Click
	Activity.Finish
End Sub



Sub ButtonFinish_Click
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
	StartActivity(p.OpenBrowser("http://mamadar.ir/index.php/login/index/1"))
	navi.CloseDrawer2(Gravity.RIGHT)  
End Sub

Sub MenuContact_Click
	
End Sub
Sub btnPanel_Click
	Dim p As PhoneIntents
	Msgbox(" رمز عبور اولیه شما " & Main.userInfo.Get("password") & " می باشد","رمز عبور")
	
	StartActivity(p.OpenBrowser("http://mamadar.ir/index.php/login/"))
	navi.CloseDrawer2(Gravity.RIGHT)  
End Sub

Sub ButtonJoin3_Click
	If (Main.selectedType="order")Then
		lastProductBuy = "10_sticker"
		Main.buymanager.RequestPayment(lastProductBuy,"inapp","سفارش بسته استیکر ده تایی ")
	Else
		lastProductBuy = "2_week_ads_search"
		Main.buymanager.RequestPayment(lastProductBuy,"inapp","دو هفته نمایش آگهی ")
	End If
End Sub

Sub btnJoin1_Click
	If (Main.selectedType="order")Then
		lastProductBuy = "5_sticker"
		Main.buymanager.RequestPayment(lastProductBuy,"inapp","سفارش بسته استیکر پنج تایی  ")
	Else
		lastProductBuy = "1_week_ads_search"
		Main.buymanager.RequestPayment(lastProductBuy,"inapp","یک هفته نمایش آگهی ")
	End If
End Sub

Sub btnJoin2_Click
	If (Main.selectedType="order")Then
		lastProductBuy = "20_sticker"
		Main.buymanager.RequestPayment(lastProductBuy,"inapp","سفارش بسته استیکر بیست تایی  ")
	Else
		lastProductBuy="3_week_ads_search"
		Main.buymanager.RequestPayment(lastProductBuy,"inapp","سه هفته نمایش آگهی  ")
	End If
End Sub

'Rise when a purchase completed
Sub BillingManager_PurchaseCompleted(Success As Boolean, Product As Purchase)
	If Success Then
		If(Product.ProductId = "1_week_ads"  Or Product.ProductId = "2_week_ads" Or Product.ProductId = "4_week_ads" ) Then 
			Try	
				Dim job As HttpJob
				ProgressDialogShow("درحال ذخیره")
				job.Initialize("registerAds", Me)
				Main.selectedProduct =Product
				
				Main.query = "http://www.mamadar.ir/index.php/mobile/index/registerAds/" & Main.selected_item.Get("id")
				Main.parameter="pass=1266&type=ads&plan="& Product.ProductId & "&user=" & Main.userInfo.Get("user_id") & "&v=" & Application.VersionCode 
				job.PostString(Main.query, Main.parameter)
				
			Catch
				Msgbox("خطا در ارسال اطلاعات . از منو گزینه ارتباط با پشتیبانی را بزنید .","خطا")
				ProgressDialogHide
				Return
			End Try	
			
		Else if (Product.ProductId = "5_sticker" Or Product.ProductId = "10_sticker" Or  Product.ProductId = "20_sticker") Then 
			
			Try
				Dim job As HttpJob
				ProgressDialogShow("درحال ذخیره")
				job.Initialize("registerOrder", Me)
				Main.selectedProduct = Product
				
				Main.query = "http://www.mamadar.ir/index.php/mobile/index/registerOrder/" & Main.selected_item.Get("id")
				Main.parameter="pass=1266&type=ads&plan="& Product.ProductId & "&user=" & Main.userInfo.Get("user_id") & "&v=" & Application.VersionCode 
				job.PostString(Main.query, Main.parameter)
			Catch
				Msgbox("خطا در ارسال اطلاعات . از منو گزینه ارتباط با پشتیبانی را بزنید .","خطا")
				ProgressDialogHide
				Return
			End Try	
			
		End If
	     
		
	Else
		
	End If

End Sub
 
 
 
Sub JobDone(Job As HttpJob)
	Dim message As String
	Try
		ProgressDialogHide
		If Job.Success Then
			Dim res As String
			res = Job.GetString
			Dim parser As JSONParser
			parser.Initialize(res)
		
			If (Job.JobName="registerAds") Then
				Dim row2 As Map
					
				Dim userId As Int 
				row2.Initialize()
				row2=parser.NextObject
				
				userId=row2.Get("id")
				message=row2.Get("description")
				
				If (userId>0 )Then 
			 		Main.buymanager.ConsumeProduct(Main.selectedProduct)
					Msgbox(message,"ثبت آگهی")
				Else 
					Msgbox(message,"عدم ثبت آگهی")
				End If 	
				Job.Release
				Activity.Finish
			else if (Job.JobName="registerOrder") Then 
				Dim row3 As Map
				 
					
				Dim userId3 As Int 
				row3.Initialize() 
				row3=parser.NextObject
				message=row3.Get("description")
				userId3=row3.Get("id")
				
				If (userId3>0 )Then 
			 		Main.buymanager.ConsumeProduct(Main.selectedProduct)
					Msgbox(message,"ثبت سفارش")
				Else 
					Msgbox(message,"عدم ثبت سفارش")
				End If 	
				Job.Release
				Activity.Finish
			End If
		Else
			Msgbox("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .", "خطا")
		End If
	Catch
		Msgbox("خطا در دریافت اطلاعات جستجو  ","خطا")
	
	End Try		
End Sub

 
Sub BillingManager_ProductConsumed (Success As Boolean, Product As Purchase)
'	Log("Product ( " & Product.Sku & " ) Consume : " & Success )
'	ToastMessageShow("Product ( " & Product.Sku & " ) Consume : " & Success , False)
'	If Success = True Then
'		Add_Gas
'		Show_Gas
'	End If
End Sub

