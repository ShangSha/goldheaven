<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="resources/css/main.css" />
<link href="resources/css/default.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="resources/js/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="resources/js/themes/icon.css" />
<link rel="stylesheet" href="resources/css/demo.css" type="text/css">
<script type="text/javascript" src="resources/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="resources/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="resources/js/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="resources/js/datagrid-detailview.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		document.getElementById('userName').focus();
	});

	document.onkeydown = function() {
		if (event.keyCode == 13 && event.srcElement.type != 'submit') {
			event.keyCode = 9;
			document.getElementById('passWord').blur();
			document.getElementById('loginsubmit').focus();
			checkforLogin();
		}
	};

	document.onkeypress = function() {
		if (event.keyCode == 13 && event.srcElement.type != 'submit') {
			event.keyCode = 9;
			document.getElementById('passWord').blur();
			document.getElementById('loginsubmit').focus();
			CheckforLogin();
		}
	}

	function getRandomNum() {
		var ran = parseInt(Math.random() * 10000);
		return ran;
	}

	var checkforLogin = function() {
		$('#loginForm').form(
				'submit',
				{
					url : 'login/check',
					onSubmit : function() {
						return $(this).form('validate');
					},
					success : function(result) {
						var json = $.parseJSON(result);
						if(json.code != 0) {
							$("#errorMessage").html("<font color='red'>用户名或密码错误！</font>");
							$("#userName").val("");
							$("#passWord").val("");
						} else {
							location.href = "index.jsp";
						}
					}
				});

	};
	
	function errorMessageOut() {
		$("#errorMessage").html("");
	}
	if (window != top)
		top.location.href = location.href;
</script>


</head>
<body style="height: 100%; width: 100%; overflow: hidden; border: none; visibility: visible; background: url(resources/css/images/wwwww.jpg) repeat-x;">

	<div style="position: absolute; left: 500px; top: 220px; width: 472px; height: 380px; overflow: hidden; background: #E0ECFF; background: url(resources/css/images/login_bg.png)"
		title="登录系统">
		<div style="position: absolute; left: 220px; top: 100px; width: 472px; height: 74px;">
			<span id="errorMessage"></span>
		</div>
		<div style="position: absolute; left: 70px; top: 130px; width: 472px; height: 74px;">
			<form method="post" id="loginForm">
				<div style="padding-left: 150px">
					<table>
						<tr>
							<td width="82" height="28" style="font-size: 18px">用户名:</td>
							<td><input name="userName" id="userName" style="width: 120px;" class="easyui-validatebox"
								data-options="required:true,validType:'length[1,20]'" maxlength="20" onfocus="errorMessageOut()"></input></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td width="82" height="28" style="font-size: 18px">密&nbsp;&nbsp;&nbsp;码:</td>
							<td><input type="password" name="passWord" id="passWord" style="width: 120px;" class="easyui-validatebox"
								data-options="required:true,validType:'length[1,20]'" maxlength="20" onfocus="errorMessageOut()"></input></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td></td>
						</tr>
					</table>
				</div>
			</form>
		</div>
		<div style="position: absolute; left: 275px; top: 220px; width: 472px; height: 74px;">
			<a class="btnblue" id="loginsubmit" onClick="checkforLogin();"><span>登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</span></a>
		</div>
	</div>
</body>
</html>