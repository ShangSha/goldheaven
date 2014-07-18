<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>淘金天堂后台管理系统</title>
<link rel="stylesheet" type="text/css" href="resources/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="resources/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="resources/css/default.css">

<script type="text/javascript" src="resources/easyui/jquery.min.js"></script>
<script type="text/javascript" src="resources/easyui/jquery.easyui.min.js"></script>

<script type="text/javascript">
$(function() {
	$('.easyui-accordion li a').click(function(){
		var tabTitle = $(this).text();
		var url = $(this).attr("href");
		addTab(tabTitle, url);
		$('.easyui-accordion li div').removeClass("selected");
		$(this).parent().addClass("selected");
	}).hover(function(){
		$(this).parent().addClass("hover");
	},function(){
		$(this).parent().removeClass("hover");
	});
});

function addTab(subtitle, url) {
	if (!$('#tabs').tabs('exists', subtitle)) {
		$('#tabs').tabs('add', {
			title : subtitle,
			content : createFrame(url),
			closable : true,
			width : $('#mainPanle').width() - 10,
			height : $('#mainPanle').height() - 26
		});
	} else {
		$('#tabs').tabs('select', subtitle);
	}
	tabClose();
}

function createFrame(url) {
	var s = '<iframe name="mainFrame" scrolling="auto" frameborder="0" src="' + url + '" style="width:100%;height:100%;"></iframe>';
	return s;
}
</script>
</head>
<body>
	<div class="easyui-layout" style="width: 100%; height: 100%;">
	    <!-- 头部  -->
		<div data-options="region:'north'" style="height: 60px;">
		  <span style="float:right; padding-right:20px;">欢迎 admin 
		    <a href="#" id="editpass">修改密码</a> 
		    <a href="#" id="loginOut">安全退出</a>
		  </span>
		</div>
		<!-- 尾部 -->
		<div data-options="region:'south',split:true" style="height: 30px; background: #D2E0F2; ">
           <div class="footer"></div>
        </div>
		<!-- 左侧 -->
		<div data-options="region:'west',split:true" title="系统主菜单" style="width: 180px;">
			<div class="easyui-accordion" data-options="fit:true,border:false">
				<div title="用户中心" data-options="selected:true">
				   <ul>
				     <li><div><a target="mainFrame" href="user/userlist.jsp" ><span class="icon icon-nav" ></span>用户管理</a></div></li>
				     <li><div><a target="mainFrame" href="account/accountlist.jsp" ><span class="icon icon-nav" ></span>用户账单管理</a></div></li>
				   </ul>
				</div>
				<div title="订单中心">
				   <ul>
				     <li><div><a target="mainFrame" href="order/orderlist.jsp" ><span class="icon icon-nav" ></span>订单管理</a></div></li>
				   </ul>
				</div>
				<div title="审计中心">
				   <ul>
				     <li><div><a target="mainFrame" href="convert/convertlist.jsp" ><span class="icon icon-nav" ></span>兑换审核</a></div></li>
				   </ul>
				</div>
				<div title="系统管理" >
				   <ul>
				     <li><div><a target="mainFrame" href="version/versionlist.jsp" ><span class="icon icon-nav" ></span>版本更新管理</a></div></li>
				     <li><div><a target="mainFrame" href="admin/adminlist.jsp" ><span class="icon icon-nav" ></span>管理员用户管理</a></div></li>
				     <li><div><a target="mainFrame" href="log/loglist.jsp" ><span class="icon icon-log" ></span>系统日志</a></div></li>
				   </ul>
				</div>
			</div>
		</div>
		<div id="mainPanle" data-options="region:'center'">
			<div class="easyui-tabs" fit="true" id="tabs">
				<div title="主页">
					<iframe width='100%' height='100%' id='iframe' frameborder='0' scrolling='auto'></iframe>
				</div>
			</div>
		</div>
	</div>
</body>
</html>