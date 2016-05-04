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
	Dim selectedOstan As String
	Dim tag As String 
	Dim shahr As String
	Dim cat(20) As String
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ListOstan As ListView
	Private txtTag As EditText
	Private lblOstan As Label
	Private ListShahr As ListView
	Private lblShahr As Label
	
	
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private Panel1 As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("insertlocation")
	
	ListOstan.Clear()

	Panel1.Width = Activity.Width
	Panel1.Height=Activity.Height
	
		
	ListOstan.SingleLineLayout.ItemHeight = 25dip
    ListOstan.SingleLineLayout.Label.TextSize = 14
    ListOstan.SingleLineLayout.Label.TextColor = Colors.Black
    ListOstan.SingleLineLayout.Label.Gravity = Gravity.CENTER
    ListOstan.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	ListOstan.ScrollingBackgroundColor = Colors.Gray
	
	Label1.TextSize= 15
	Label1.Gravity= Gravity.RIGHT
	Label1.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	Label2.TextSize= 15
	Label2.Gravity= Gravity.RIGHT
	Label2.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	Label3.TextSize= 15
	Label3.Gravity= Gravity.RIGHT
	Label3.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	
	txtTag.TextSize= 15
	txtTag.Gravity= Gravity.RIGHT
	txtTag.TextColor =Colors.Black
	txtTag.Color =Colors.White
	
	txtTag.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	lblOstan.TextSize= 15
	lblOstan.Gravity= Gravity.RIGHT
	lblOstan.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	
	
	lblShahr.TextSize= 15
	lblShahr.Gravity= Gravity.RIGHT
	lblShahr.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
	
	
	ListOstan.AddSingleLine2("آذربايجان شرقي",1)
	ListOstan.AddSingleLine2("آذربايجان غربي", 2)
	ListOstan.AddSingleLine2("اردبيل", 3)
	ListOstan.AddSingleLine2("اصفهان", 4)
	ListOstan.AddSingleLine2("ايلام", 5)
	ListOstan.AddSingleLine2("بوشهر", 6)
	ListOstan.AddSingleLine2("تهران", 7)
	ListOstan.AddSingleLine2("چهارمحال وبختياري", 8)
	ListOstan.AddSingleLine2("خراسان جنوبي", 9)
	ListOstan.AddSingleLine2("خراسان رضوي", 10)
	ListOstan.AddSingleLine2("خراسان شمالي", 11)
	ListOstan.AddSingleLine2("خوزستان", 12)
	ListOstan.AddSingleLine2("زنجان", 13)
	ListOstan.AddSingleLine2("سمنان", 14)
	ListOstan.AddSingleLine2("سيستان و بلوچستان", 15)
	ListOstan.AddSingleLine2("فارس", 17)
	ListOstan.AddSingleLine2("قزوين", 18)
	ListOstan.AddSingleLine2("قم", 19)
	ListOstan.AddSingleLine2("كردستان", 20)
	ListOstan.AddSingleLine2("كرمان", 21)
	ListOstan.AddSingleLine2("كرمانشاه", 22)
	ListOstan.AddSingleLine2("كهگيلويه وبوير احمد", 23)
	ListOstan.AddSingleLine2("گلستان", 24)
	ListOstan.AddSingleLine2("گيلان", 25)
	ListOstan.AddSingleLine2("لرستان", 26)
	ListOstan.AddSingleLine2("مازندران", 27)
	ListOstan.AddSingleLine2("مركزي", 28)
	ListOstan.AddSingleLine2("هرمزگان", 29)
	ListOstan.AddSingleLine2("همدان", 30)
	ListOstan.AddSingleLine2("يزد", 31)
	
	
	

End Sub

Sub Activity_Resume
	If(viewInsertedGroupAct.finishInserting = True) Then 
		Activity.Finish
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ListOstan_ItemClick (Position As Int, Value As Object)

	
	ListShahr.Clear()
	
	ListShahr.SingleLineLayout.ItemHeight =25dip
    ListShahr.SingleLineLayout.Label.TextSize = 11
    ListShahr.SingleLineLayout.Label.TextColor = Colors.Black
    ListShahr.SingleLineLayout.Label.Gravity = Gravity.CENTER
	
    ListShahr.SingleLineLayout.Label.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	ListShahr.ScrollingBackgroundColor =Colors.Gray
	
	selectedOstan =Value
	lblOstan.Text = Main.ostan(Value)
	
	Dim txt As String
	
	txt = "SELECT id, name  FROM " & Main.DBTableName & " where ostan_id = " & selectedOstan
	
	Dim result As List
	result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt, Null,0)
	
	For i =  0 To result.Size-1
		Dim row As Object
		Dim column() As String 
		row = result.Get(i)
		column = row
		ListShahr.AddSingleLine2(column(1),column(0))
	
	Next
	
	
End Sub
Sub btnReturn_Click
	Activity.Finish
End Sub
Sub btnInsert_Click
	
	tag = txtTag.Text
	StartActivity("finishInsert")
End Sub
Sub ListShahr_ItemClick (Position As Int, Value As Object)
	
	shahr = Value
	Dim txt As String
	
	txt = "SELECT   name  FROM " & Main.DBTableName & " where id = " & Value
	
	Dim result As List
	result= DBUtils.ExecuteMemoryTable(Main.SQL1, txt, Null,0)
	
	
	Dim row As Object
	Dim column() As String 
	row = result.Get(0)
	column = row
	
	lblShahr.Text = column(0)
		
End Sub