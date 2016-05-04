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
	 

	
	
	Private Panel1 As Panel 
	Private btnJoin As Button 
	Private btnBrokeLink As Button
	
	Private btnMenu As Button
	
	Private LabelDesc As Label
	
	Dim itemType As Int 
	Private ImagePreivew As ImageView
	Private Label5 As Label
	
	Private ImageBackground As ImageView
	
	Dim navi As AHNavigationDrawer
	Dim pCantent As Panel 
	Private btnCopy As Button
	Private EditTextComment As EditText
	Private ListViewComment As ListView
	Private LabelInsertDate As Label
	Private LabelShahr As Label
	Private LabelOstan As Label
	Private LabelMember As Label
	Private LabelAdmin As Label
	Private LabelTag As Label
	Private LabelAddress As Label
	Private LabelName As Label
	Private LabelLike As Label
	Private LabelCat As Label
	Private LabelAllert As Label
	Private ScrollView1 As ScrollView
	Private Panel2 As Panel
	Private ButtonMinus As Button
	Private LabelLikeTitle As Label
	Private btnInstagram As Button
	Private ImageViewAll As ImageView
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
	pCantent.LoadLayout("groupview")
	
	Label5.Text=Main.selected_item.Get("title")
	Activity.Title="نمایش اطلاعات"
	
	
		
	Panel1.Width = Activity.Width
	Panel1.Height=Activity.Height
	
	Panel2.Color =Colors.rgb(236,239,241)
	Panel2.RemoveView 
	ScrollView1.Panel.AddView(Panel2,0,0,Panel2.Width,810dip)
	ScrollView1.Panel.Height = 820dip
		
	LabelDesc.TextSize= 15
	LabelDesc.Gravity= Gravity.CENTER
	LabelDesc.Typeface=Main.font
	LabelDesc.TextColor=Colors.Black
	LabelDesc.Color=Colors.RGB(179,229,252)

	LabelAddress.TextSize= 15
	LabelAddress.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT)
	LabelAddress.Typeface=Main.font
	LabelAddress.TextColor=Colors.Black
	LabelAddress.Color=Colors.RGB(179,229,252)
	
	LabelLikeTitle.TextSize= 15
	LabelLikeTitle.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT)
	LabelLikeTitle.Typeface=Main.font
	LabelLikeTitle.TextColor=Colors.Black
	LabelLikeTitle.Color=Colors.RGB(179,229,252)
	
	LabelInsertDate.TextSize= 15			
	LabelInsertDate.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT)			
	LabelInsertDate.Typeface=Main.font			
	LabelInsertDate.TextColor=Colors.Black	
	LabelInsertDate.Color=Colors.RGB(179,229,252)
			
	LabelShahr.TextSize= 15 				
	LabelShahr.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 				
	LabelShahr.Typeface=Main.font 				
	LabelShahr.TextColor=Colors.Black
	LabelShahr.Color=Colors.RGB(179,229,252)
	 				
	LabelOstan.TextSize= 15 				
	LabelOstan.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 				
	LabelOstan.Typeface=Main.font 				
	LabelOstan.TextColor=Colors.Black 				
	LabelOstan.Color=Colors.RGB(179,229,252)			
	
	LabelMember.TextSize= 15 			
	LabelMember.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 			
	LabelMember.Typeface=Main.font 			
	LabelMember.TextColor=Colors.Black 	
	LabelMember.Color=Colors.RGB(179,229,252)
			
	LabelAdmin.TextSize= 15				
	LabelAdmin.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT)				
	LabelAdmin.Typeface=Main.font				
	LabelAdmin.TextColor=Colors.Black
	LabelAdmin.Color=Colors.RGB(179,229,252)
					
	LabelTag.TextSize= 15 	
	LabelTag.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 	
	LabelTag.Typeface=Main.font 	
	LabelTag.TextColor=Colors.Black
	LabelTag.Color=Colors.RGB(179,229,252)
	 	
	LabelName.TextSize= 15 				
	LabelName.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 				
	LabelName.Typeface=Main.font 				
	LabelName.TextColor=Colors.Black 				
	LabelName.Color=Colors.RGB(179,229,252)				
	
    LabelLike.TextSize= 15 				
    LabelLike.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 				
    LabelLike.Typeface=Main.font 				
    LabelLike.TextColor=Colors.Black
    LabelLike.Color=Colors.RGB(179,229,252)
	 				
	LabelCat.TextSize= 15 				
	LabelCat.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 				
	LabelCat.Typeface=Main.font 				
	LabelCat.TextColor=Colors.Black 
	LabelCat.Color=Colors.RGB(179,229,252)
					
	LabelAllert.TextSize= 15 			
	LabelAllert.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 			
	LabelAllert.Typeface=Main.font 			
	LabelAllert.TextColor=Colors.Black 			
	LabelAllert.Color=Colors.RGB(179,229,252) 			
	
	EditTextComment.TextSize= 15 			
	EditTextComment.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT) 			
	EditTextComment.Typeface=Main.font 			
	EditTextComment.TextColor=Colors.Black 		
	EditTextComment.Color=Colors.RGB(229,229,242)
	
	'btnBrokeLink.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT)
	btnBrokeLink.Typeface=Main.font

	btnJoin.TextSize= 15
	'btnJoin.Gravity= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.RIGHT)
	btnJoin.Typeface=Main.font

	Dim txt As String
	Dim shahr As String
	Dim ostan As String
	Dim category As String
	Dim job1 As HttpJob	
	
	itemType =  Main.selected_item.Get("telgroupTypeId")
	
	Try
		If(itemType <> 4 And itemType <> 3) Then 
			If(Main.selected_item.Get("shahrId") <> 0 )Then 
				txt = "SELECT name  FROM " & Main.DBTableName & " where id = " & _
				Main.selected_item.Get("shahrId")
			
				Dim result As List
				result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt, Null,0)
				
				If (result.Size > 0  )Then 
					Dim row As Object
					Dim column() As String 
					row = result.Get(0)
					column = row
					shahr = column(0)
				Else 
					shahr = "همه شهر ها" 
				End If
			Else
				shahr = "همه شهر ها" 
			End If
			
			If(Main.selected_item.Get("ostanId") <> 0 )Then 
				ostan = Main.ostan(Main.selected_item.Get("ostanId"))
			Else 
				ostan = "همه استان ها" 
			End If
		End If 	
		
		
		If( Main.selected_item.Get("telgroupCategoryId") <> 0 ) Then 
			category = Main.cat(Main.selected_item.Get("telgroupCategoryId"))
		Else 
			category =	" همه دسته ها  "
		End If  
			
		Dim desc As String 
		desc=Main.selected_item.Get("description")
		
		 
		If (desc.Length > 100 )Then 
			LabelDesc.Text= desc.SubString2(0,100)
		End If
		
		
		
		ListViewComment.Clear()
		
		ListViewComment.TwoLinesLayout.ItemHeight =70dip
	    ListViewComment.TwoLinesLayout.Label.TextSize = 14
	    ListViewComment.TwoLinesLayout.Label.TextColor = Colors.Black
	    ListViewComment.TwoLinesLayout.Label.Gravity = Gravity.CENTER
	    ListViewComment.TwoLinesLayout.Label.Typeface=Main.font
	    ListViewComment.TwoLinesLayout.Label.Color= Colors.rgb(219,239,242)
		
		ListViewComment.TwoLinesLayout.SecondLabel.TextSize = 14
	    ListViewComment.TwoLinesLayout.SecondLabel.TextColor = Colors.Black
	    ListViewComment.TwoLinesLayout.SecondLabel.Gravity = Gravity.CENTER
	    ListViewComment.TwoLinesLayout.SecondLabel.Typeface=Main.font
	    ListViewComment.TwoLinesLayout.SecondLabel.Color= Colors.rgb(179,229,222)
		
		
		ListViewComment.ScrollingBackgroundColor =Colors.Gray
		ListViewComment.Color=Colors.rgb(187,222,251)
		ListViewComment.ScrollingBackgroundColor = Colors.RGB(10,144,156)
		
	   
		LabelName.Text =  "عنوان :" & Main.selected_item.Get("title")
		LabelDesc.Text =  desc  
		
		LabelTag.Text = "هشتگ :" & Main.selected_item.Get("tag") 
		LabelAddress.Text = "آدرس:" & Main.selected_item.Get("telegramAddress")
		
		
		LabelCat.Text= "دسته بندی :" & category
		
		LabelInsertDate.Text= "تاریخ ثبت :" & Main.selected_item.Get("insertDate")
		
		If Main.selected_item.Get("memberCount")<> Null Then
			LabelMember.Text= "تعداد اعضا :" & Main.selected_item.Get("memberCount")
		Else 
			LabelMember.Text= "تعداد اعضا :0"
		End If 
		
		If(itemType =1 Or itemType =7) Then
			LabelAllert.Text="اگر لینک باز نشد حتمآ نسخه تلگرام خود را بروز کنید." 
		End If 
		
		'If(itemType <> 4 And itemType <> 3) Then 
			If Main.selected_item.Get("ownerId")<> Null Then
				LabelAdmin.Text=  "ادمین :" & Main.selected_item.Get("ownerId")
			Else 
				LabelAdmin.Text=  "ادمین :"
			End If 
			
			LabelOstan.Text="استان :" & ostan
			LabelShahr.Text="شهر :" & shahr 
		'End If 	
		
		Dim iconPic As Int  
		iconPic = Main.selected_item.Get("iconPictureId")
		
		If (Main.selected_item.Get("likeCount") = Null) Then 			
			LabelLike.Text= "0"
		Else 
			LabelLike.Text= Main.selected_item.Get("likeCount")
		End If 
		
		If(itemType = 11)Then 
			btnBrokeLink.Visible=False
			btnCopy.Visible =False
			btnJoin.Visible=False
			btnInstagram.Visible =False
		end  if 
		
'		ImagePreivew.Initialize("")
'		ImageBackground.Initialize("")
		Dim vip As Int 
		Dim super As Int 
			
		If( iconPic= 0 Or Main.selected_item.Get("isVIP") = False) Then 
			'load pictue code
			Select itemType
				Case 2 '"id"
					ImagePreivew.Bitmap= Main.idIcon
					ImageBackground.Bitmap= LoadBitmap(File.DirAssets,"id_back.jpg")
					
				Case 3 '"sticker"
					ImagePreivew.Bitmap= Main.stickerIcon 
					ImageBackground.Bitmap= LoadBitmap(File.DirAssets,"sticker_back.jpg")
				Case 4 '"robot"	
					ImagePreivew.Bitmap= Main.robotIcon 
					ImageBackground.Bitmap= LoadBitmap(File.DirAssets,"robot_back.jpg")
				Case 7 '"channel"
					'ImagePreivew.Bitmap= Main.channelIcon 
					ImageBackground.Bitmap= LoadBitmap(File.DirAssets,"channel_back.jpg")
					
					super =Main.selected_item.Get("isSuperGroup")
					vip =Main.selected_item.Get("isVIP")
					
					If(vip = 1  )Then
						ImagePreivew.Bitmap=LoadBitmap(File.DirAssets,"vip_channel.png") 
					Else If( super = 1) Then 
						ImagePreivew.Bitmap=LoadBitmap(File.DirAssets,"gov_channel.png") 
					Else 
						ImagePreivew.Bitmap=Main.channelIcon
							
					End If 		
				Case 9 
					
					ImageBackground.Bitmap= LoadBitmap(File.DirAssets,"sticker_back.jpg")
					ImagePreivew.Bitmap=LoadBitmap(File.DirAssets,"adsicon.png")
					
				Case 10 'admin comment 
					
					ImagePreivew.Bitmap=  LoadBitmap(File.DirAssets,"comment.png")
					ImageBackground.Bitmap= LoadBitmap(File.DirAssets,"id_back.jpg") 
						
				Case Else  '1 or  othen "group"
					
					ImageBackground.Bitmap= LoadBitmap(File.DirAssets,"group_back.jpg")	
					'ImagePreivew.Bitmap= Main.groupIcon
					
					super =Main.selected_item.Get("isSuperGroup")
					vip =Main.selected_item.Get("isVIP")
					
					If(vip = 1  )Then
						ImagePreivew.Bitmap=LoadBitmap(File.DirAssets,"adsicon.png")
					Else If( super = 1) Then 			
						ImagePreivew.Bitmap=LoadBitmap(File.DirAssets,"ispremium.png")
					Else 
						ImagePreivew.Bitmap=Main.groupIcon
					End If 				
			End Select
			
		Else 
			job1.Initialize("download_icon", Me)
			If (itemType = 11 ) Then 
				ProgressDialogShow("درحال دریافت ")
			End If 
    		job1.Download("http://aloosalam.ir/index.php/index/iconGroupView/" & iconPic & "/" & itemType)		
		End If
		
		Dim comment As Int =Main.selected_item.Get("commentCount")
		If( comment > 0  )Then
			Dim id As Int
			id = Main.selected_item.Get("id")	
			Try
				Dim job As HttpJob
				ProgressDialogShow("درحال دریافت نظرات")
				job.Initialize("getComments", Me)
										
				job.PostString("http://www.aloosalam.ir/index.php/mobile/index/getComments/" & id ,"pass=1266" _
					& "&user=" & Main.userInfo.Get("user_id")& "&v=" & Application.VersionCode  & "&line=" & Main.userInfo.Get("line_number")  )
			Catch
				Msgbox("خطا در دریافت اطلاعات   ","خطا")
				
			End Try	
		Else 
			ListViewComment.AddTwoLines("نظری داده نشده است . ", _
			"اولین نفری باشید که نظر می دهد")	
		End If 
		
	Catch
		Msgbox("خطا در نمایش اطلاعات","خطا")
		Activity.Finish
	End Try
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnReturn_Click
	Activity.Finish
End Sub

Sub btnJoin_Click
	Dim address As String 
	Dim p As PhoneIntents
	address= Main.selected_item.Get("telegramAddress")
	
	address=address.Replace("{userid}",Main.userInfo.Get("user_id"))
	
	If (address.StartsWith("https://telegram.me") Or address.StartsWith("telegram.me") Or address.Contains("telegram.me"))Then '---group or etc
		joinTelegram(address)
	Else if(address.StartsWith("http://aloosalam.ir") Or address.StartsWith("http://")) Then '---site notification or ads
		StartActivity(p.OpenBrowser(address))
	Else if (itemType =11 )Then
		'joinTelegram(address)
	Else 
		Msgbox("آدرس گروه صحیح نیست . گزینه دیگری را امتحان کنید .","خطا")
	End If
End Sub

Sub joinTelegram(address As String  )
	
	Dim p As PhoneIntents

	Try
		
		Dim telAddress As String
		
		Select itemType
				
				Case 2 '"id"
					telAddress=address.Replace("https://telegram.me/","")
					telAddress=telAddress.Replace("http://telegram.me/","")
					telAddress=telAddress.Replace("telegram.me/","")
					telAddress=telAddress.Replace("@","")
			    	StartActivity(p.OpenBrowser("tg://resolve?domain=" & telAddress))
					
				Case 3 '"sticker"tg://addstickers/?\\?set=
					telAddress=address.Replace("https://telegram.me/addstickers/","")
					telAddress=telAddress.Replace("http://telegram.me/addstickers/","")
					telAddress=telAddress.Replace("telegram.me/addstickers/","")
					
			    	StartActivity(p.OpenBrowser("tg://addstickers/?set=" & telAddress))
					
				Case 4 '"robot"	
					telAddress=address.Replace("https://telegram.me/","")
					telAddress=telAddress.Replace("http://telegram.me/","")
					telAddress=telAddress.Replace("telegram.me/","")
					telAddress=telAddress.Replace("@","")
			    	StartActivity(p.OpenBrowser("tg://resolve?domain=" & telAddress))
					
					
				Case 7 '"channel"
					telAddress=address.Replace("https://telegram.me/","")
					telAddress=telAddress.Replace("http://telegram.me/","")
					telAddress=telAddress.Replace("telegram.me/","")
					
			    	StartActivity(p.OpenBrowser("tg://resolve?domain=" & telAddress))
					
				Case Else  '1 or  othen "group"
					telAddress=address.Replace("https://telegram.me/joinchat/","")
					telAddress=telAddress.Replace("http://telegram.me/joinchat/","")
					telAddress=telAddress.Replace("telegram.me/joinchat/","")
					
			    	StartActivity(p.OpenBrowser("tg://join?invite=" & telAddress))
		End Select
			
		
			
	Catch
		Msgbox("نرم افزار تلگرام نصب نیست.","خطا")
		StartActivity(p.OpenBrowser(address))
		
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
				
			If( Job.JobName  = "download_icon") Then 	
				Try 
					ImagePreivew.Bitmap = Job.GetBitmap
				Catch
					ImagePreivew.Bitmap=Main.groupIcon
				End Try	
				ProgressDialogHide
				Job.Release
			else If( Job.JobName  = "getComments") Then 
				Dim COUNTRIES As List
				COUNTRIES = parser.NextArray 'returns a list with maps
				
				Dim rows As List
				rows= COUNTRIES.Get(0)
				
				If(rows.Size > 0 ) Then 
					
					For i= 0 To rows.Size-1
						Dim row As Map
						
						row.Initialize()
						row=rows.Get(i)
						ListViewComment.AddTwoLines(row.Get("name") & "-" & row.Get("createDate"),row.Get("content"))
					Next
				Else 
					ListViewComment.AddTwoLines("نظری داده نشده است . ","")	 
				End If 
				Job.Release
			
			else If( Job.JobName  = "insertComment") Then 
			
				Msgbox("با تشکر از حسن توجه شما . نظر شما ثبت شد .","ثبت نظر")
				Job.Release
				Activity.Finish
				
			else If( Job.JobName  = "sendLike") Then 
			
				Msgbox("با تشکر از حسن توجه شما . امتیاز شد .","گزارش خطا")
				Job.Release
				Activity.Finish
				
			else If( Job.JobName  = "broke_group") Then 
					
				Msgbox("با تشکر از حسن توجه شما . گزارش ثبت شد .","گزارش خطا")
				Job.Release
				Main.vipInsertCount = Main.vipInsertCount +1 
				writeInfo
				Activity.Finish
				
			End If
		Else
			ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .", True)
		End If
	Catch
		Job.Release
		Msgbox("خطا در دریافت اطلاعات جستجو  ","خطا")
		
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

Sub btnInstagram_Click
	Try 
		Dim inten As Intent
		Dim tmpt As String 
		tmpt  =  Main.selected_item.Get("telegramAddress")
		
		Dim u As Uri
		u.Parse(tmpt)
		inten.Initialize(inten.ACTION_SEND,"")
		inten.SetType("image/*")
		inten.PutExtra("android.intent.extra.STREAM",u)
		inten.PutExtra("android.intent.extra.TEXT",Main.selected_item.Get("title") & CRLF & Main.selected_item.Get("description")& CRLF & "http://aloosalam.ir")
		inten.SetComponent("com.instagram.android/.activity.ShareHandlerActivity")
		StartActivity(inten)
	Catch 
		Msgbox("اینستاگرام نصب نیست .","اینستاگرام")
	End Try 
End Sub
Sub btnCopy_Click
	Try
		
		Dim tmpt As String 
		Dim bc As BClipboard 
		bc.clrText
		tmpt  =  Main.selected_item.Get("telegramAddress")
		
		bc.setText(tmpt)
		Msgbox("آدرس کپی شد . اکنون می توانید آن را هر جا خواستید بچسبانید .","آدرس ")
	Catch 
		Msgbox(tmpt,"آدرس ")
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
Sub ButtonComment_Click
	Dim id As Int
	id = Main.selected_item.Get("id")	
	Try
	
		Dim job As HttpJob
		ProgressDialogShow("درحال ارسال")
		job.Initialize("insertComment", Me)
								
		job.PostString("http://www.aloosalam.ir/index.php/mobile/index/insertComment/" & id  ,"pass=1266" _
			& "&text=" & EditTextComment.Text  _
			& "&type=" & itemType  _
			& "&name=" & Main.userInfo.Get("name")      _
			& "&user=" & Main.userInfo.Get("user_id")  _
			& "&v=" & Application.VersionCode  _
			& "&line=" & Main.userInfo.Get("line_number") 	_
			 )
	Catch
		Msgbox("خطا در ارسال اطلاعات   ","خطا")
		
	End Try	
End Sub
Sub ButtonMinus_Click
	Dim id As Int
	id = Main.selected_item.Get("id")	
	Try
	
		Dim job As HttpJob
		ProgressDialogShow("درحال ارسال")
		job.Initialize("sendLike", Me)
								
		job.PostString("http://www.aloosalam.ir/index.php/mobile/index/sendLike/" & id  ,"pass=1266" _
			& "&liek=minus" & _
			"&user=" & Main.userInfo.Get("user_id")& _
			"&v=" & Application.VersionCode & _
			"&line=" & Main.userInfo.Get("line_number") 	_
				)
	Catch
		Msgbox("خطا در ارسال اطلاعات   ","خطا")
		
	End Try	
End Sub
Sub ButtonPlus_Click
	Dim id As Int
	id = Main.selected_item.Get("id")	
	Try
	
		Dim job As HttpJob
		ProgressDialogShow("درحال ارسال")
		job.Initialize("sendLike", Me)
								
		job.PostString("http://www.aloosalam.ir/index.php/mobile/index/sendLike/" & id  ,"pass=1266" _
			& "&liek=plus" & _
			"&user=" & Main.userInfo.Get("user_id")& _
			"&v=" & Application.VersionCode & _
			"&line=" & Main.userInfo.Get("line_number") 	_
				 )
	Catch
		Msgbox("خطا در ارسال اطلاعات   ","خطا")
		
	End Try	
End Sub


Sub btnBrokeLink_Click
	
	Dim id As Int
	id = Main.selected_item.Get("id")	
	Try
	
		Dim job As HttpJob
		ProgressDialogShow("درحال ارسال")
		job.Initialize("broke_group", Me)
								
		job.PostString("http://www.aloosalam.ir/index.php/mobile/index/linkBroken/" & (id*34) ,"pass=1266" _
			& "&user=" & Main.userInfo.Get("user_id")& _
			"&v=" & Application.VersionCode & _
			"&line=" & Main.userInfo.Get("line_number") 	_
				)
	Catch
		Msgbox("خطا در ارسال اطلاعات   ","خطا")
		
	End Try	
End Sub


Sub ImageViewAll_Click
	ImageViewAll.Visible=False
End Sub
Sub ImagePreivew_Click
	ImageViewAll.Left=0
	ImageViewAll.Top=0
	ImageViewAll.Bitmap = ImagePreivew.Bitmap 
	ImageViewAll.Visible=True
	
End Sub