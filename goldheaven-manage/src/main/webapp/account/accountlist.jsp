<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户账单列表</title>
<link rel="stylesheet" type="text/css" href="../resources/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../resources/easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="../resources/css/default.css">

<script type="text/javascript" src="../resources/easyui/jquery.min.js"></script>
<script type="text/javascript" src="../resources/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../resources/easyui/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript">
$(function(){
	createDataGrid(1);//初始化页面
});
function createDataGrid(page){
	$('#userAccountList').datagrid({
		loadMsg:'正在加载用户账单列表,请稍侯……', 
		url: 'list',
		idField: 'id',
		width:'100%',
		height: '400',
		collapsible: false,//可缩放
		striped: true,//奇偶行使用默认的不同背景色
		fitColumns:true,//自适应列宽
		pagination:true,//显示分页栏
		rownumbers:true,//显示行号
		singleSelect:true,//只允许一次选择一行
		pageNumber:page,
		
		columns:[[
			     {field:'id',title:"账单记录ID",width:40,align:'center'},
			     {field:'totalGoldcoin',title:"账户总金币",width:40,align:'center'},
			     {field:'freeGoldcoin',title:"可兑换金币",width:40,align:'center'},
			     {field:'paidMoney',title:"已支付金额",width:40,align:'center'},
			     {field:'userId',title:"用户ID",width:50,align:'center'},
			     {field:'opt',title:'操作',width:100,align:'center', rowspan:2,
			     formatter:function(value,rowData,rowIndex) {
				 }
			     }
				 ]],
		onLoadSuccess:function(data) {
     		currentNum = data.rows.length;
	    	if(data.total==0){
	    		msgShow('Error', "无数据！", 'warning');	
	    	}
	    },
		onClickRow: function(rowIndex, rowData){//当用户点击一行时触发，参数包括：rowIndex：被点击行的索引，从 0 开始。rowData：被点击行对应的记录。
	    }	
	});
}

function msgShow(title, msgString, msgType, fn) {
	$.messager.alert(title, msgString, msgType, fn);
}
</script>
</head>
<body>
	<div id="tb" style="padding: 5px; height: auto">
	    <div>
		    <span>账单ID: <input type="text" style="width: 90px"></span>　
		    <span>用户ID: <input type="text" style="width: 90px"></span>　
			<span><a href="#" class="easyui-linkbutton" iconCls="icon-search">　查　询</a></span>
		</div>
	</div>
	
	<!--用户账单列表start-->
	<div style="padding-top: 5px;">
	    <table class="easyui-datagrid" id="userAccountList"></table>
	</div>
</body>
</html>