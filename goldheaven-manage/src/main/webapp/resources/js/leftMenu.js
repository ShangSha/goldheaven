$(function(){
	InitLeftMenu();
	tabClose();
	tabCloseEven();
})
//初始化左侧
function InitLeftMenu(){
    $("#accordionMenu").empty();
    var menulist = "";
    $.each(_menus.menus, function(i, n) {
        menulist = '<div title="'+n.menuname+'" icon="icon-sys">';  //一级菜单
		menulist += '<ul>';
        $.each(n.menus, function(j, o) { //二级菜单
			if(o.menus!=null&&o.menus.length>0){ //有三级菜单
				menulist+='<li><div><a ref="'+o.menuid+'" href="#" rel="' + o.url + '" ><span class="nav">' + o.menuname + '</span></a><span class="menu-expand" onclick="cllapse(this)"></div><ul style="display:none">';
				$.each(o.menus, function(k, m) { //三级菜单
					menulist += '<li><div><a ref="'+m.menuid+'" href="#" rel="' + m.url + '" ><span class="nav">' + m.menuname + '</span></a></div></li> ';
				})
				menulist+="</ul></li>";
			}else{
				menulist += '<li><div><a ref="'+o.menuid+'" href="#" rel="' + o.url + '" ><span class="nav">' + o.menuname + '</span></a></div></li> ';
			}
        })
        menulist += '</ul></div>';
        
        $("#accordionMenu").accordion('add',{
            title:n.menuname,
            content:menulist
        });
    })
    
	$('.easyui-accordion li a').live("click",function(){
		var tabTitle = $(this).children('.nav').text();
		var url = $(this).attr("rel");
		if(url!=null&&url!="undefined"&&url!=""){
			var menuid = $(this).attr("ref");
			//var icon = getIcon(menuid,icon);  //获取了二级菜单的图标，需要修改成三级菜单
			addTab(tabTitle,url);
		}
		$('.easyui-accordion li div').removeClass("selected");
		$(this).parent().addClass("selected");
	}).hover(function(){
		$(this).parent().addClass("hover");
	},function(){
		$(this).parent().removeClass("hover");
	});
	
	$('#tabs').tabs({
		onSelect:function(title){
		//关闭非当前tab
		$('.tabs-inner span').each(function(i,n){
			var subtitle = $(n).text();
			//var tab = $('#tt').tabs('getSelected');
			if(title!=subtitle&&subtitle!="")
			$('#tabs').tabs('close',subtitle);
	  });
	  return false;
	} 
	});
}

//获取左侧导航的图标
function getIcon(menuid){
	var icon = 'icon ';
	$.each(_menus.menus, function(i, n) {
		 $.each(n.menus, function(j, o) {
		 	if(o.menuid==menuid){
				icon += o.icon;
			}
		 })
	})
	
	return icon;
}
//打开tab
function addTab(subtitle,url){
	if(!$('#tabs').tabs('exists',subtitle)){
		$('#tabs').tabs('add',{
			title:subtitle,
			content:createFrame(url),
			closable:true
		});
	}else{
		$('#tabs').tabs('select',subtitle);
	}
	tabClose();
}

//图标展开和收起
function cllapse(obj){
	var node = $(obj).parent().next("ul");
	if(node.css("display")=="none"){
		$(obj).removeClass("menu-expand");
		$(obj).addClass("menu-collapse");
		node.show("fast");
	}else {
		$(obj).removeClass("menu-collapse");
		$(obj).addClass("menu-expand");
		node.hide("fast");	
	}
}

function createFrame(url)
{
	var s = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
	return s;
}

function tabClose()
{
	/*双击关闭TAB选项卡*/
	$(".tabs-inner").dblclick(function(){
		var subtitle = $(this).children(".tabs-closable").text();
		$('#tabs').tabs('close',subtitle);
	})
	/*为选项卡绑定右键*/
	$(".tabs-inner").bind('contextmenu',function(e){
		$('#mm').menu('show', {
			left: e.pageX,
			top: e.pageY
		});
		
		var subtitle =$(this).children(".tabs-closable").text();
		
		$('#mm').data("currtab",subtitle);
		$('#tabs').tabs('select',subtitle);
		return false;
	});
}
//绑定右键菜单事件
function tabCloseEven()
{
	//关闭当前
	$('#mm-tabclose').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('#tabs').tabs('close',currtab_title);
	})
	//全部关闭
	$('#mm-tabcloseall').click(function(){
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			$('#tabs').tabs('close',t);
		});	
	});
	//关闭除当前之外的TAB
	$('#mm-tabcloseother').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			if(t!=currtab_title)
				$('#tabs').tabs('close',t);
		});	
	});
	//关闭当前右侧的TAB
	$('#mm-tabcloseright').click(function(){
		var nextall = $('.tabs-selected').nextAll();
		if(nextall.length==0){
			return false;
		}
		nextall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});
	//关闭当前左侧的TAB
	$('#mm-tabcloseleft').click(function(){
		var prevall = $('.tabs-selected').prevAll();
		if(prevall.length==0){
			return false;
		}
		prevall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});

	//退出
	$("#mm-exit").click(function(){
		$('#mm').menu('hide');
	})
}

//本地时钟
function clockon() {
    var now = new Date();
    var year = now.getFullYear(); //getFullYear getYear
    var month = now.getMonth();
    var date = now.getDate();
    var day = now.getDay();
    var hour = now.getHours();
    var minu = now.getMinutes();
    var sec = now.getSeconds();
    var week;
    month = month + 1;
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;
    if (hour < 10) hour = "0" + hour;
    if (minu < 10) minu = "0" + minu;
    if (sec < 10) sec = "0" + sec;
    var arr_week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
    week = arr_week[day];
    var time = "";
    time = year + "年" + month + "月" + date + "日" + " " + hour + ":" + minu + ":" + sec + " " + week;

    $("#bgclock").html(time);

    var timer = setTimeout("clockon()", 200);
}
