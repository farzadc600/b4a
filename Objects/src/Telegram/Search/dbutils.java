package Telegram.Search;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbutils {
private static dbutils mostCurrent = new dbutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
public Telegram.Search.main _main = null;
public Telegram.Search.httputils2service _httputils2service = null;
public Telegram.Search.aboutact _aboutact = null;
public Telegram.Search.searchresultact _searchresultact = null;
public Telegram.Search.helpact _helpact = null;
public Telegram.Search.contactact _contactact = null;
public Telegram.Search.insertact _insertact = null;
public Telegram.Search.groupviewact _groupviewact = null;
public Telegram.Search.viewinsertedgroupact _viewinsertedgroupact = null;
public Telegram.Search.searchact _searchact = null;
public static String  _copydbfromassets(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("copydbfromassets"))
	return (String) Debug.delegate(null, "copydbfromassets", new Object[] {_ba,_filename});
String _targetdir = "";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub CopyDBFromAssets (FileName As String) As Strin";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim TargetDir As String";
_targetdir = "";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="If File.ExternalWritable Then TargetDir = File.Di";
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()) { 
_targetdir = anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal();}
else {
_targetdir = anywheresoftware.b4a.keywords.Common.File.getDirInternal();};
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="If File.Exists(TargetDir, FileName) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_targetdir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="File.Copy(File.DirAssets, FileName, TargetDir, F";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,_targetdir,_filename);
 };
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="Return TargetDir";
if (true) return _targetdir;
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("executemap"))
	return (anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executemap", new Object[] {_ba,_sql,_query,_stringargs});
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _res = null;
int _i = 0;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub ExecuteMap(SQL As SQL, Query As String, String";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="Log(\"ExecuteMap: \" & Query)";
anywheresoftware.b4a.keywords.Common.Log("ExecuteMap: "+_query);
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="If cur.RowCount = 0 Then";
if (_cur.getRowCount()==0) { 
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.Log("No records found.");
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null));
 };
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="cur.Position = 0";
_cur.setPosition((int) (0));
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step15 = 1;
final int limit15 = (int) (_cur.getColumnCount()-1);
for (_i = (int) (0) ; (step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15); _i = ((int)(0 + _i + step15)) ) {
RDebugUtils.currentLine=7340048;
 //BA.debugLineNum = 7340048;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=7340050;
 //BA.debugLineNum = 7340050;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7340051;
 //BA.debugLineNum = 7340051;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=7340052;
 //BA.debugLineNum = 7340052;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("executememorytable"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "executememorytable", new Object[] {_ba,_sql,_query,_stringargs,_limit});
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
int _row = 0;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub ExecuteMemoryTable(SQL As SQL, Query As String";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="Log(\"ExecuteMemoryTable: \" & Query)";
anywheresoftware.b4a.keywords.Common.Log("ExecuteMemoryTable: "+_query);
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
if (_limit>0) { 
_limit = (int) (anywheresoftware.b4a.keywords.Common.Min(_limit,_cur.getRowCount()));}
else {
_limit = _cur.getRowCount();};
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="For row = 0 To Limit - 1";
{
final int step11 = 1;
final int limit11 = (int) (_limit-1);
for (_row = (int) (0) ; (step11 > 0 && _row <= limit11) || (step11 < 0 && _row >= limit11); _row = ((int)(0 + _row + step11)) ) {
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="cur.Position = row";
_cur.setPosition(_row);
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
for (_col = (int) (0) ; (step14 > 0 && _col <= limit14) || (step14 < 0 && _col >= limit14); _col = ((int)(0 + _col + step14)) ) {
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
 }
};
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="End Sub";
return null;
}
public static String  _createtable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("createtable"))
	return (String) Debug.delegate(null, "createtable", new Object[] {_ba,_sql,_tablename,_fieldsandtypes,_primarykey});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub CreateTable(SQL As SQL, TableName As String, F";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
for (_i = (int) (0) ; (step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4); _i = ((int)(0 + _i + step4)) ) {
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="sb.Append(\"[\").Append(field).Append(\"] \").Append";
_sb.Append("[").Append(_field).Append("] ").Append(_ftype);
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS [\" & TableNam";
_query = "CREATE TABLE IF NOT EXISTS ["+_tablename+"] "+_sb.ToString();
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.Log("CreateTable: "+_query);
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("droptable"))
	return (String) Debug.delegate(null, "droptable", new Object[] {_ba,_sql,_tablename});
String _query = "";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub DropTable(SQL As SQL, TableName As String)";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="query = \"DROP TABLE IF EXISTS [\" & TableName & \"]";
_query = "DROP TABLE IF EXISTS ["+_tablename+"]";
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Log(\"DropTable: \" & query)";
anywheresoftware.b4a.keywords.Common.Log("DropTable: "+_query);
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,boolean _clickable) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("executehtml"))
	return (String) Debug.delegate(null, "executehtml", new Object[] {_ba,_sql,_query,_stringargs,_limit,_clickable});
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub ExecuteHtml(SQL As SQL, Query As String, Strin";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.Log("ExecuteHtml: "+_query);
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
if (_limit>0) { 
_limit = (int) (anywheresoftware.b4a.keywords.Common.Min(_limit,_cur.getRowCount()));}
else {
_limit = _cur.getRowCount();};
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="sb.Append(\"<table><tr>\").Append(CRLF)";
_sb.Append("<table><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step15 = 1;
final int limit15 = (int) (_cur.getColumnCount()-1);
for (_i = (int) (0) ; (step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15); _i = ((int)(0 + _i + step15)) ) {
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=7602194;
 //BA.debugLineNum = 7602194;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=7602195;
 //BA.debugLineNum = 7602195;BA.debugLine="For row = 0 To Limit - 1";
{
final int step19 = 1;
final int limit19 = (int) (_limit-1);
for (_row = (int) (0) ; (step19 > 0 && _row <= limit19) || (step19 < 0 && _row >= limit19); _row = ((int)(0 + _row + step19)) ) {
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="cur.Position = row";
_cur.setPosition(_row);
RDebugUtils.currentLine=7602197;
 //BA.debugLineNum = 7602197;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=7602198;
 //BA.debugLineNum = 7602198;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=7602202;
 //BA.debugLineNum = 7602202;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step26 = 1;
final int limit26 = (int) (_cur.getColumnCount()-1);
for (_i = (int) (0) ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
RDebugUtils.currentLine=7602203;
 //BA.debugLineNum = 7602203;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=7602204;
 //BA.debugLineNum = 7602204;BA.debugLine="If Clickable Then";
if (_clickable) { 
RDebugUtils.currentLine=7602205;
 //BA.debugLineNum = 7602205;BA.debugLine="sb.Append(\"<a href='http://\").Append(i).Append";
_sb.Append("<a href='http://").Append(BA.NumberToString(_i)).Append(".");
RDebugUtils.currentLine=7602206;
 //BA.debugLineNum = 7602206;BA.debugLine="sb.Append(row)";
_sb.Append(BA.NumberToString(_row));
RDebugUtils.currentLine=7602207;
 //BA.debugLineNum = 7602207;BA.debugLine="sb.Append(\".com'>\").Append(cur.GetString2(i)).";
_sb.Append(".com'>").Append(_cur.GetString2(_i)).Append("</a>");
 }else {
RDebugUtils.currentLine=7602209;
 //BA.debugLineNum = 7602209;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
 };
RDebugUtils.currentLine=7602211;
 //BA.debugLineNum = 7602211;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=7602213;
 //BA.debugLineNum = 7602213;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }
};
RDebugUtils.currentLine=7602215;
 //BA.debugLineNum = 7602215;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7602216;
 //BA.debugLineNum = 7602216;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=7602217;
 //BA.debugLineNum = 7602217;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=7602218;
 //BA.debugLineNum = 7602218;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("executejson"))
	return (anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "executejson", new Object[] {_ba,_sql,_query,_stringargs,_limit,_dbtypes});
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
int _row = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub ExecuteJSON (SQL As SQL, Query As String, Stri";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery2(_query,_stringargs)));
 }else {
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery(_query)));
 };
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.Log("ExecuteJSON: "+_query);
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="If Limit > 0 Then Limit = Min(Limit, cur.RowCount";
if (_limit>0) { 
_limit = (int) (anywheresoftware.b4a.keywords.Common.Min(_limit,_cur.getRowCount()));}
else {
_limit = _cur.getRowCount();};
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="For row = 0 To Limit - 1";
{
final int step12 = 1;
final int limit12 = (int) (_limit-1);
for (_row = (int) (0) ; (step12 > 0 && _row <= limit12) || (step12 < 0 && _row >= limit12); _row = ((int)(0 + _row + step12)) ) {
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="cur.Position = row";
_cur.setPosition(_row);
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step16 = 1;
final int limit16 = (int) (_cur.getColumnCount()-1);
for (_i = (int) (0) ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
RDebugUtils.currentLine=7536657;
 //BA.debugLineNum = 7536657;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=7536661;
 //BA.debugLineNum = 7536661;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=7536663;
 //BA.debugLineNum = 7536663;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=7536665;
 //BA.debugLineNum = 7536665;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.Log("Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)));
 break; }
}
;
 }
};
RDebugUtils.currentLine=7536668;
 //BA.debugLineNum = 7536668;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
 }
};
RDebugUtils.currentLine=7536670;
 //BA.debugLineNum = 7536670;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=7536671;
 //BA.debugLineNum = 7536671;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7536672;
 //BA.debugLineNum = 7536672;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=7536673;
 //BA.debugLineNum = 7536673;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=7536674;
 //BA.debugLineNum = 7536674;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=7536675;
 //BA.debugLineNum = 7536675;BA.debugLine="End Sub";
return null;
}
public static String  _executelistview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.ListViewWrapper _listview1,boolean _twolines) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("executelistview"))
	return (String) Debug.delegate(null, "executelistview", new Object[] {_ba,_sql,_query,_stringargs,_limit,_listview1,_twolines});
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub ExecuteListView(SQL As SQL, Query As String, S";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="ListView1.Clear";
_listview1.Clear();
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="If TwoLines Then";
if (_twolines) { 
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="ListView1.AddTwoLines2(Cols(0), Cols(1), Cols)";
_listview1.AddTwoLines2(_cols[(int) (0)],_cols[(int) (1)],(Object)(_cols));
 }else {
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="ListView1.AddSingleLine2(Cols(0), Cols)";
_listview1.AddSingleLine2(_cols[(int) (0)],(Object)(_cols));
 };
 }
};
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="End Sub";
return "";
}
public static String  _executespinner(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.SpinnerWrapper _spinner1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("executespinner"))
	return (String) Debug.delegate(null, "executespinner", new Object[] {_ba,_sql,_query,_stringargs,_limit,_spinner1});
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub ExecuteSpinner(SQL As SQL, Query As String, St";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Spinner1.Clear";
_spinner1.Clear();
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_ba,_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_table.getSize()-1);
for (_i = (int) (0) ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="Spinner1.Add(Cols(0))";
_spinner1.Add(_cols[(int) (0)]);
 }
};
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="End Sub";
return "";
}
public static int  _getdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("getdbversion"))
	return (Integer) Debug.delegate(null, "getdbversion", new Object[] {_ba,_sql});
int _count = 0;
String _version = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub GetDBVersion (SQL As SQL) As Int";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="count = SQL.ExecQuerySingleResult(\"SELECT count(*";
_count = (int)(Double.parseDouble(_sql.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE Type='table' AND name='DBVersion'")));
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="If count > 0 Then";
if (_count>0) { 
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="version = SQL.ExecQuerySingleResult(\"SELECT vers";
_version = _sql.ExecQuerySingleResult("SELECT version FROM DBVersion");
 }else {
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="m.Put(\"version\", DB_INTEGER)";
_m.Put((Object)("version"),(Object)(_db_integer));
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="CreateTable(SQL, \"DBVersion\", m, \"version\")";
_createtable(_ba,_sql,"DBVersion",_m,"version");
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="SQL.ExecNonQuery(\"INSERT INTO DBVersion VALUES (";
_sql.ExecNonQuery("INSERT INTO DBVersion VALUES (1)");
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="version = 1";
_version = BA.NumberToString(1);
 };
RDebugUtils.currentLine=7667729;
 //BA.debugLineNum = 7667729;BA.debugLine="Return version";
if (true) return (int)(Double.parseDouble(_version));
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="End Sub";
return 0;
}
public static String  _insertmaps(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("insertmaps"))
	return (String) Debug.delegate(null, "insertmaps", new Object[] {_ba,_sql,_tablename,_listofmaps});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i2 = 0;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub InsertMaps(SQL As SQL, TableName As String, Li";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.Log("Same Map found twice in list. Each item in the list should include a different map object.");
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="ToastMessageShow(\"Same Map found twice in list.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Same Map found twice in list. Each item in the list should include a different map object.",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="Try";
try {RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_listofmaps.getSize()-1);
for (_i1 = (int) (0) ; (step9 > 0 && _i1 <= limit9) || (step9 < 0 && _i1 >= limit9); _i1 = ((int)(0 + _i1 + step9)) ) {
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="m = ListOfMaps.Get(i1)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="For i2 = 0 To m.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (_m.getSize()-1);
for (_i2 = (int) (0) ; (step18 > 0 && _i2 <= limit18) || (step18 < 0 && _i2 >= limit18); _i2 = ((int)(0 + _i2 + step18)) ) {
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="Dim col As String";
_col = "";
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="col = m.GetKeyAt(i2)";
_col = BA.ObjectToString(_m.GetKeyAt(_i2));
RDebugUtils.currentLine=7143447;
 //BA.debugLineNum = 7143447;BA.debugLine="value = m.GetValueAt(i2)";
_value = _m.GetValueAt(_i2);
RDebugUtils.currentLine=7143448;
 //BA.debugLineNum = 7143448;BA.debugLine="If i2 > 0 Then";
if (_i2>0) { 
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=7143450;
 //BA.debugLineNum = 7143450;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=7143452;
 //BA.debugLineNum = 7143452;BA.debugLine="columns.Append(\"[\").Append(col).Append(\"]\")";
_columns.Append("[").Append(_col).Append("]");
RDebugUtils.currentLine=7143453;
 //BA.debugLineNum = 7143453;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=7143454;
 //BA.debugLineNum = 7143454;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=7143456;
 //BA.debugLineNum = 7143456;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=7143457;
 //BA.debugLineNum = 7143457;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.Log("InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString());};
RDebugUtils.currentLine=7143458;
 //BA.debugLineNum = 7143458;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=7143460;
 //BA.debugLineNum = 7143460;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e78) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e78);RDebugUtils.currentLine=7143462;
 //BA.debugLineNum = 7143462;BA.debugLine="ToastMessageShow(LastException.Message, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(anywheresoftware.b4a.keywords.Common.LastException(_ba).getMessage(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7143463;
 //BA.debugLineNum = 7143463;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)));
 };
RDebugUtils.currentLine=7143465;
 //BA.debugLineNum = 7143465;BA.debugLine="SQL.EndTransaction";
_sql.EndTransaction();
RDebugUtils.currentLine=7143466;
 //BA.debugLineNum = 7143466;BA.debugLine="End Sub";
return "";
}
public static String  _setdbversion(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,int _version) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("setdbversion"))
	return (String) Debug.delegate(null, "setdbversion", new Object[] {_ba,_sql,_version});
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub SetDBVersion (SQL As SQL, Version As Int)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE DBVersion set version =";
_sql.ExecNonQuery2("UPDATE DBVersion set version = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_version)}));
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate("updaterecord"))
	return (String) Debug.delegate(null, "updaterecord", new Object[] {_ba,_sql,_tablename,_field,_newvalue,_wherefieldequals});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub UpdateRecord(SQL As SQL, TableName As String,";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="sb.Append(\"UPDATE [\").Append(TableName).Append(\"]";
_sb.Append("UPDATE [").Append(_tablename).Append("] SET [").Append(_field).Append("] = ? WHERE ");
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.Log("WhereFieldEquals map empty!");
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="args.Add(NewValue)";
_args.Add(_newvalue);
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_wherefieldequals.getSize()-1);
for (_i = (int) (0) ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
if (_i>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKeyAt(";
_sb.Append("[").Append(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i))).Append("] = ?");
RDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
anywheresoftware.b4a.keywords.Common.Log("UpdateRecord: "+_sb.ToString());
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=7208979;
 //BA.debugLineNum = 7208979;BA.debugLine="End Sub";
return "";
}
}