<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台用户管理</title>
<link rel="stylesheet" type="text/css" href="../resources/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../resources/easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="../resources/css/default.css">

<script type="text/javascript" src="../resources/easyui/jquery.min.js"></script>
<script type="text/javascript" src="../resources/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../resources/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">

/**
 * 用户列表
 */
$(function(){
	createDataGrid(1);//初始化页面
});
function createDataGrid(page){
	$('#userList').datagrid({
		loadMsg:'正在加载用户列表,请稍侯……', 
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
		         {field:'userName',title:"管理员用户名",width:40,align:'center'},
		         {field:'createTime',title:"更新时间",width:50,align:'center'},
		         {field:'opt',title:'操作',width:100,align:'center', rowspan:2,
				 formatter:function(value,rowData,rowIndex) {
					if(rowData.userName=='${user.userName}'){//不能删除当前用户
						return '<a href="javascript:updateUser()"><span>编辑</span></a><a>&nbsp;&nbsp;|&nbsp;&nbsp;</a>';
					}else{
						return '<a href="javascript:openUpdate()">编辑</a>&nbsp;&nbsp;|&nbsp;&nbsp;'+
							   '<a href="javascript:delAdmin('+rowData.id+')"><span>删除</span></a>';
					}
				 }
		         }
			   ]],
		onLoadSuccess:function(data){
     		currentNum=data.rows.length;
	    	if(data.total==0){
	    		$.messager.show({  
                      title: 'Error',  
                      msg:"无数据！"
                  }); 
	    	}
	    },
		onClickRow: function(rowIndex, rowData){//当用户点击一行时触发，参数包括：rowIndex：被点击行的索引，从 0 开始。rowData：被点击行对应的记录。
	    }	
	});
}

/**
 * 添加用户
 */
//打开添加用户对话框
function addUser(){
	$('#addUser').dialog({ closed: false, cache: false, modal: true });  
}
//关闭添加用户对话框
function closeAddUser(){
	$("#name").val("")
	$("#userName").val("");
	$("#passWord").val("");
	$("#addUser").dialog('close');
	
}
//添加用户
function addAdmin(){
	$('#addAdminForm').form('submit', {
		url:'save',
		onSubmit: function() {
			return $(this).form('validate');   
		},
		success:function(result){
			var json = $.parseJSON(result);
			
		    if(json.code == 0) {
		    	closeAddUser(); 
		    	msgShow('系统提示', "添加成功！", 'warning',function(){ $('#userList').datagrid('reload');});
		    }else if(json.code == 1002){
		    	msgShow('系统提示', "两次密码输入不一致！", 'warning');	 
		    }else{
		    	msgShow('系统提示', "添加失败！", 'warning');	
		    }
		}   
	}); 
}

/**
 * 编辑用户
 */
//打开编辑用户对话框
function openUpdate() {
	var rowData = $("#userList").datagrid("getSelected");

		$('#updateUser').dialog({  
	    closed: false,  
	    cache: false,  
	    modal: true  
		}); 
}

//关闭编辑用户对话框
function closeUpdateUser(){
	$("#updateUser").dialog('close');
}
//编辑用户
function update(id){
	$('#updateUserForm').form('submit',{
		      url:'updateUser.action',   
		      onSubmit: function(){
		          return $(this).form('validate');   
		  	},
		     success:function(result){
		    	 var json = $.parseJSON(result);
		    	 if(json=="updateSuccess"){
		    		 closeUpdateUser();
		    		 msgShow('系统提示', "修改成功！", 'warning',function(){$('#userList').datagrid('reload');});
		    	 }else{
		    		 msgShow('系统提示', "添加失败！", 'warning');	  
		    	 }
		    }   
		 }); 
}
/**
 * 删除用户
 */
 
//删除用户
function delAdmin(){
	$.messager.confirm("提示","确定删除此用户?",function(r){
		if(r) {
			$.get("delete",{'id':id}, function(result){
			    if(result.code == 0){
			    	msgShow('系统提示', "删除成功！", 'warning', function(){ $('#userList').datagrid('reload');});
			    }
			    else {
				    msgShow('系统提示', '删除失败！', 'warning');
			    }
		    });
		}
	});
}

function msgShow(title, msgString, msgType, fn) {
	$.messager.alert(title, msgString, msgType, fn);
}
</script>
</head>
<body>
	<div style="position:relative; top:5px; width:auto; height:auto; margin:4px 50px;">
	<table>
	<tr>
	<td align="right" width="5%">
	<a class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="addUser()"><span>添加用户</span></a>
	</td>
	</tr>
	</table>
	</div>
<!--用户列表start-->
	<div>
	<table class="easyui-datagrid" id="userList">
	</table>
	</div>

<!--添加用户start-->
	<div id="addUser" class="easyui-dialog" style="width:400px;height:220px;padding:10px 20px"  
        title="添加用户"    closed="true"> 
        <div align="center">
        <form id="addAdminForm" method="post" >  
          	<table cellpadding=3 >
				<tr>
					<td>用户名：</td>
					<td><input id="userName" class="easyui-validatebox" data-options="required:true,validType:'length[1,20]'" type="text" name="userName" maxlength="20"/></td>
				</tr>
				<tr height="15px">
								<td></td>
				</tr>
				<tr>
					<td>密&nbsp;&nbsp;&nbsp;码：</td>
					<td><input id="passWord" name="passWord" type="password" class="easyui-validatebox" data-options="required:true,validType:'length[1,20]'" maxlength="20"/></td>
				</tr>
				
				<tr>
					<td>确认密码：</td>
					<td><input id="passWord2" name="passWord2" type="password" class="easyui-validatebox" data-options="required:true,validType:'length[1,20]'" maxlength="20"/></td>
				</tr>
			</table>
        </form>  
        </div>
         <!--	操作	-->
		<div align="center">
		<table align="center">	
				<tr height="10px">
				<td></td>
				</tr>	
				<tr>
				<td align="center"><a id="add" class="easyui-linkbutton" icon="icon-ok"  onclick="addAdmin()"> 确定</a></td>
				<td align="center"><a class="easyui-linkbutton" icon="icon-cancel"href="javascript:void(0)" onclick="closeAddUser()">取消</a></td> 
				</tr> 
		</table>
		</div>
    </div>  
<!--添加用户end -->
<!--编辑用户start-->
	<div id="updateAdmin" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"  
        title="编辑用户"    closed="true">  
        <div align="center">
        <form id="updateAdminForm" method="post" >  
          	<table cellpadding=3 align="center">
          		<tr><td><font color="blue">修改管理员信息</font></td></tr>
          		<tr style="display: none">
					<td>用户id：</td>
					<td><input class="easyui-validatebox" data-options="required:true,validType:'length[1,20]'" type="text" name="id" maxlength="20"/></td>
				</tr>
				<tr>
					<td>用户名：</td>
					<td><input class="easyui-validatebox" data-options="required:true,validType:'length[1,20]'" type="text" name="name" maxlength="20"/></td>
				</tr>
				<tr height="15px">
								<td></td>
				</tr>
				<tr><td><font color="blue">修改密码</font></tr>
				<tr id="newPass">
					<td>新密码：</td>
					<td><input id="passWord1" name="passWord" type="password" class="easyui-validatebox" data-options="required:true,validType:'length[1,20]'" maxlength="20"/></td>
				</tr>
			</table>
        </form>  
       </div>
       <!--	操作	-->
		<div align="center">
		<table align="center">	
				<tr height="10px">
								<td></td>
				</tr>	
				<tr>
				<td align='center'><a id='add' class='easyui-linkbutton' icon='icon-ok'  onclick='update()'> 确定</a></td>
				<td align='center'><a class='easyui-linkbutton' icon='icon-cancel' href='javascript:void(0)' onclick='closeUpdateUser()'>取消</a></td> 
				</tr>
		</table>
		</div>
    </div>  
<!--编辑用户end -->
</body>
</html>