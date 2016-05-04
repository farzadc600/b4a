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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ListViewResult As ListView
	Private groupIcon As Bitmap
	Private Panel1 As Panel
	Private Label1 As Label
	Private Label2 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lastresultview")
	
	
	Panel1.Width = Activity.Width
	Panel1.Height=Activity.Height

	Label1.TextSize= 15
	Label1.Gravity= Gravity.RIGHT
	Label1.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	Label2.TextSize= 15
	Label2.Gravity= Gravity.RIGHT
	Label2.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	
'	ListViewResult.Initialize("ListViewResult")
'	ListViewResult.Clear()
	Try
		
		Dim job As HttpJob
		ProgressDialogShow("درحال دریافت")
		job.Initialize("last_group", Me)
								
		job.PostString("http://www.mamadar.ir/index.php/mobile/index/lastGroup","pass=1266" )
	Catch
		Msgbox("خطا در دریافت اطلاعات آخرین گروه ها  ","خطا")
		Activity.Finish
	End Try	

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
			
			
			Dim parser As JSONParser
			parser.Initialize(res)
			Select Job.JobName
				Case "last_group"
					
					Dim COUNTRIES As List
					COUNTRIES = parser.NextArray 'returns a list with maps
					
					Dim rows As List
					rows= COUNTRIES.Get(0)
		
					groupIcon.Initialize(File.DirAssets, "icongroup.png")
					'Bitmap.Initialize(LoadBitmapSample(File.DirAssets,"Ax.jpg",100%x,100%y))
					
					
					ListViewResult.Clear()
					
				    ListViewResult.TwoLinesAndBitmap.Label.TextSize = 15
				    ListViewResult.TwoLinesAndBitmap.Label.TextColor = Colors.Black
				    ListViewResult.TwoLinesAndBitmap.Label.Gravity = Gravity.CENTER
					
					ListViewResult.ScrollingBackgroundColor=Colors.Gray
				    ListViewResult.TwoLinesAndBitmap.SecondLabel.TextSize = 12
				    ListViewResult.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Blue
				    ListViewResult.TwoLinesAndBitmap.SecondLabel.Gravity = Gravity.CENTER
					
					'result = "<table dir='rtl'>" 
					
					For i= 0 To rows.Size -1
						Dim row As Map
						Dim tag As String 
						row.Initialize()
						
						
						row.Initialize()
						row=rows.Get(i)
						
						tag=Main.ostan(row.Get("ostanId"))
						ListViewResult.AddTwoLinesAndBitmap2( _
										row.Get("title"), _
										tag & "#" & row.Get("tag"), _
										groupIcon,row)
										
					Next 
					
					
				
					Job.Release
					
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
		Msgbox("خطا در دریافت اطلاعات  آخرین گروه ها    ","خطا")
		Activity.Finish
	End Try		
End Sub

Sub ListViewResult_ItemClick (Position As Int, Value As Object)
	Main.selected_item = Value
	StartActivity("groupViewAct")
End Sub
Sub btnReturn_Click
	Activity.Finish
End Sub