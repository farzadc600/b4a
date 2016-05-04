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
	Private Label1 As Label
	Private ListViewResult As ListView
	 
	Private btnMenu As Button
	 
	Dim resultCount As Int 
	Dim pageNumber As Int
	Private LabelPage As Label
	Private btnNext As Button
	Private btnPrev As Button
	
	Dim navi As AHNavigationDrawer
	Dim pCantent As Panel 
	Private ImageView1 As ImageView
	
End Sub

Sub btnMenu_Click
	navi.OpenDrawer2(navi.GRAVITY_RIGHT)
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	'Activity.LoadLayout("searchresultview")
	navi.Initialize2("navi",Activity,75%x,navi.GRAVITY_RIGHT)' جهت راس چین بودن ساید بار
	

	'navi.NavigationPanel.Initialize("")
	navi.NavigationPanel.LoadLayout("menu")
	
	pCantent.Initialize("")
	navi.ContentPanel.AddView(pCantent,0,0,100%x,100%y)
	pCantent.SendToBack	
	pCantent.LoadLayout("searchresultview")
	
	Activity.Title="نمایش نتایج جستجو"
	
	 

		'Do not forget to load the layout file created with the visual designer. For example:
		
		
		pageNumber = 1 
			
		
	Label1.TextSize= 15
	Label1.Gravity= Gravity.RIGHT
	Label1.Typeface=Main.font
	
	
	LabelPage.TextSize= 15
	LabelPage.Gravity= Gravity.RIGHT
	LabelPage.Typeface=Main.font
	
	ImageView1.Bitmap = Main.rightBitmap
	
	ListViewResult.Clear()
	
    ListViewResult.TwoLinesAndBitmap.Label.TextSize = 15
    ListViewResult.TwoLinesAndBitmap.Label.TextColor = Colors.Black
    ListViewResult.TwoLinesAndBitmap.Label.Gravity = Gravity.CENTER
    ListViewResult.TwoLinesAndBitmap.Label.Typeface=Main.font
	ListViewResult.Color=Colors.rgb(187,222,251)
	
    ListViewResult.TwoLinesAndBitmap.SecondLabel.TextSize = 12
    ListViewResult.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Blue
    ListViewResult.TwoLinesAndBitmap.SecondLabel.Gravity = Gravity.CENTER
    ListViewResult.TwoLinesAndBitmap.SecondLabel.Typeface=Main.font
	
	ListViewResult.ScrollingBackgroundColor = Colors.RGB(10,144,156)
	
	
	
	loadResult
	
	
End Sub

Sub loadResult
	Dim selectedType As Int 
	Dim itemTitle As String 
	Dim itemDesc As String
	Dim i As Int 
	LabelPage.Text = pageNumber
	
	resultCount = Main.searchResult.Size
	Try
		ListViewResult.Clear
		For i= 0 To Main.searchResult.Size -1
		
			Dim extract As Map
			Dim tag As String 
			
			Dim vip As Int 
			Dim super As Int 
					
			extract.Initialize()
			
			extract  = Main.searchResult.Get(i)
			tag=Main.ostan(extract.Get("ostanId"))
			
			selectedType=extract.Get("telgroupTypeId")
			
			itemDesc = extract.Get("description")
			If itemDesc.Length > 20 Then 
				itemDesc=itemDesc.SubString(20)
			End If
			itemTitle= extract.Get("title")
			
			
			Select selectedType
				
				Case 2 '"id"
				
					ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							Main.idIcon,extract)
				Case 3  '"sticker"
					ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							Main.stickerIcon,extract)
				Case 11  '"sticker"
					ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							Main.stickerIcon,extract)			
				Case 4 '"robot"	
					ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							Main.robotIcon,extract)
				Case 7 '"channel"
					
					super =extract.Get("isSuperGroup")
					vip =extract.Get("isVIP")
					
					If(vip = 1  )Then
						ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							LoadBitmap(File.DirAssets,"vip_channel.png") _
							,extract)
							
					Else If( super = 1) Then 
						ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							LoadBitmap(File.DirAssets,"gov_channel.png") _
							,extract)	
					Else 
						ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							Main.channelIcon,extract)
							
					End If 		
				Case 9 
					ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							LoadBitmap(File.DirAssets,"adsicon.png"),extract)
				Case 10 'admin comment 
					ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							LoadBitmap(File.DirAssets,"comment.png"),extract)		
									
				Case Else  '1"group"
					
					super =extract.Get("isSuperGroup")
					vip =extract.Get("isVIP")
					
					If(vip = 1  )Then
						ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							LoadBitmap(File.DirAssets,"adsicon.png") _
							,extract)
					Else If( super = 1) Then 			
						ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							LoadBitmap(File.DirAssets,"ispremium.png") _
							,extract)
					Else 
						ListViewResult.AddTwoLinesAndBitmap2( _
							itemTitle, _
							tag & "#" & itemDesc , _
							Main.groupIcon,extract)	
					End If 				
			End Select
								
		Next 
		
	Catch 
		
		Msgbox("خطا در نمایش نتایج جستجو","خطا")
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

Sub ListViewResult_ItemClick (Position As Int, Value As Object)
	Main.selected_item = Value
	If Main.isEdit = True Then
		Dim itemType As Int 
		itemType = Main.selected_item.Get("telgroupTypeId")  
		Select (itemType )
			'Case 1 
			Case 2
				Main.selectedType="id"
			Case 3 
				Main.selectedType="sticker"
				
			Case 4 
				Main.selectedType="robot"
			Case 7 
				Main.selectedType="channel"
			Case Else 
				Main.selectedType="group"
		End Select		
		StartActivity("insertAct")
	Else  
		StartActivity("groupViewAct")
	End If 
	
End Sub

Sub JobDone(Job As HttpJob)
	Main.searchResult.Initialize()
	Main.searchResult.Clear()

	Try
		ProgressDialogHide
		If Job.Success Then
			Dim res As String
			res = Job.GetString
			Dim parser As JSONParser
			parser.Initialize(res)
		
			If 	Job.JobName= "next" Or Job.JobName= "prev" Then 
					
					Dim COUNTRIES As List
					COUNTRIES = parser.NextArray 'returns a list with maps
					
					Dim rows As List
					rows= COUNTRIES.Get(0)
					
					If(rows.Size > 0 ) Then 
						
						For i= 0 To rows.Size-1
							Dim row As Map
							
							row.Initialize()
							row=rows.Get(i)
							Main.searchResult.Add(row)
						Next 
						
						loadResult
					Else 
						Msgbox("موردی با مشخصات درخواستی شما یافت نشد . از بخش آخرین " & Main.selectedTypeTitle & "ها هم می توانید " & Main.selectedTypeTitle  & " مورد نظر خود را پیدا کنید  . ","جستجو")
					End If 	
				
			End If
		Else
			ToastMessageShow("خطا در ارتباط با سرور: اتصال اینترنت خود را بررسی کنید .", True)
		End If
	Catch
		Msgbox("خطا در دریافت اطلاعات جستجو  ","خطا")
	
	End Try		
End Sub

Sub btnPrev_Click
	
	If(pageNumber = 0 )Then 
		Return
	End If 
	Try	
		Dim job As HttpJob
		ProgressDialogShow("درحال دریافت")
		job.Initialize("prev", Me)
		pageNumber = pageNumber -1
		job.PostString(Main.query & "/" & ((pageNumber-1)* 15) & "/" & (pageNumber* 15) ,Main.parameter)
		
	Catch
		Msgbox("خطا در دریافت اطلاعات ","خطا")
	End Try		
End Sub
Sub btnNext_Click
	
	If(resultCount < 15 )Then 
		Return
	End If 
	Try	
		Dim job As HttpJob
		ProgressDialogShow("درحال دریافت")
		job.Initialize("next", Me)
		
		job.PostString(Main.query & "/" & (pageNumber* 15) & "/" & ((pageNumber+1)* 15) ,Main.parameter)
		pageNumber = pageNumber +1
		
	Catch
		Msgbox("خطا در دریافت اطلاعات ","خطا")
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
