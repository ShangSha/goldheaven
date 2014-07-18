<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>兑奖记录列表</title>
<link rel="stylesheet" type="text/css" href="../resources/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../resources/easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="../resources/css/default.css">

<script type="text/javascript" src="../resources/easyui/jquery.min.js"></script>
<script type="text/javascript" src="../resources/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../resources/easyui/locale/easyui-lang-zh_CN.js"></script>
<style type="text/css">
*{font-size:12px; font-family:Tahoma,Verdana,微软雅黑,新宋体}
a{ color:Black; text-decoration:none;}
a:hover{ color:Red; text-decoration:underline;}
</style>
<script type="text/javascript">
$(function(){
	createDataGrid(1);//初始化页面
});
function createDataGrid(page){
	$('#convertList').datagrid({
		loadMsg:'正在加载兑奖记录列表,请稍侯……', 
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
			     {field:'id',title:"兑奖记录ID",width:40,align:'center'},
			     {field:'balance',title:"用户账户余额",width:40,align:'center'},
			     {field:'convertGoldcoin',title:"兑换积分",width:40,align:'center'},
			     {field:'convertType',title:"兑换方式",width:40,align:'center'},
			     {field:'convertMoney',title:"兑换金额",width:50,align:'center'},
			     {field:'convertTime',title:"兑换时间",width:50,align:'center'},
			     {field:'status',title:"审核状态",width:50,align:'center'},
			     {field:'reviewTime',title:"审核时间",width:50,align:'center'},
			     {field:'userId',title:"用户ID",width:50,align:'center'},
			     {field:'opt',title:'操作',width:100,align:'center', rowspan:2,
			     formatter:function(value,rowData,rowIndex) {
						return '<a href="#" class="btnyew"><span>审　核</span></a>';
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
		    <span>ID: <input type="text" style="width: 90px"></span>　
		    <span>兑换方式: 
		    <select class="easyui-combobox" panelHeight="auto" style="width:100px">
                <option value="1">支付宝</option>
                <option value="2">话费充值</option>
            </select>
		    </span>	　		
            <span>申请兑换时间: <input class="easyui-datebox" style="width: 90px">
			-- <input class="easyui-datebox" style="width: 90px"></span>
	
			<span>　审核状态：
			<select class="easyui-combobox" panelHeight="auto" style="width:100px">
                <option value="1">未审核</option>
                <option value="2">兑换成功</option>
                <option value="3">兑换失败</option>
            </select>
            </span>
            <span>　审核时间: <input class="easyui-datebox" style="width: 90px">
			-- <input class="easyui-datebox" style="width: 90px">&nbsp;&nbsp;</span>
			<span><a href="#" class="easyui-linkbutton" iconCls="icon-search">　查　询</a></span>
		</div>
	</div>
	
	<!--兑奖记录列表start-->
	<div style="padding-top: 5px;">
	    <table class="easyui-datagrid" id="convertList"></table>
	</div>
</body>
</html>