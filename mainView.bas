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

	Private btnInsert As Button
	Private btnSearch As Button
	Private btnHelp As Button
	Private btnExit As Button
	Private Panel1 As Panel
	Private Label1 As Label
	
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("mainview")
	
	Panel1.Width = Activity.Width
	Panel1.Height=Activity.Height
	
	Label1.TextSize= 15
	Label1.Gravity= Gravity.RIGHT
	
	Label1.Typeface=Typeface.LoadFromAssets("BKoodakBold.ttf")
	
End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnInsert_Click
	StartActivity("insertAct")
End Sub
Sub btnSearch_Click
	StartActivity("searchAct")
End Sub

Sub btnReturn_Click
	
End Sub

Sub btnLastGroup_Click
	StartActivity("lastGroupAct")
End Sub
Sub Label1_Click
	
End Sub