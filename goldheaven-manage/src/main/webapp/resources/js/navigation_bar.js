var steps=0;
$(function(){
	
	$("#image"+step).attr("src","step_Demol/images/red.png");
	$(".content"+step).css("color","#E31237");
	for(var i=2;i<=6-step;i++){
		$("#image"+i).attr("src","step_Demol/images/gray.png");
		}
	$(".nums").click(function(){
		if($(this).parents().parents().parents().attr("class")=="flow_step1"){
			if($(this).siblings(".pic").children(".ima").attr("src")=="step_Demol/images/green.png"){
				steps=step;
				step=Number(($(this).parents().parents().attr("class")).split("content")[1]);
				$(this).parents().parents().css("color","#E31237");
				$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/red.png");
				}else if($(this).siblings(".pic").children(".ima").attr("src")=="step_Demol/images/red.png"){
					$(this).parents().parents().css("color","#000000");
					$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/gray.png");
					}else{
						$(this).parents().parents().css("color","#60BC21");
						$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/green.png");
						}
			}else if($(this).parents().parents().parents().attr("class")=="flow_step2"){
				if($(this).siblings(".pic").children(".ima").attr("src")=="step_Demol/images/green.png"){
					steps=step;
					step=Number(($(this).parents().parents().attr("class")).split("content")[1]);
					$(this).parents().parents().css("color","#E31237");
					$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/red.png");
					for(var j=step+1;j<steps;j++){
						$("#image"+j).attr("src","step_Demol/images/gray.png");
						$(".content"+j).css("color","#000000");
						}
					}else if($(this).siblings(".pic").children(".ima").attr("src")=="step_Demol/images/red.png"){
						$(this).parents().parents().css("color","#000000");
						$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/gray.png");
						}else{
							$(this).parents().parents().css("color","#60BC21");
							$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/green.png");
							}
				}else if($(this).parents().parents().parents().attr("class")=="flow_step3"){
					if($(this).siblings(".pic").children(".ima").attr("src")=="step_Demol/images/green.png"){
						steps=step;
						step=Number(($(this).parents().parents().attr("class")).split("content")[1]);
						$(this).parents().parents().css("color","#E31237");
						$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/red.png");
						$("#image"+steps).attr("src","step_Demol/images/gray.png");
						$(".content"+steps).css("color","#000000");
						for(var j=step+1;j<steps;j++){
							$("#image"+j).attr("src","step_Demol/images/gray.png");
							$(".content"+j).css("color","#000000");
							}
						}else if($(this).siblings(".pic").children(".ima").attr("src")=="step_Demol/images/red.png"){
							$(this).parents().parents().css("color","#000000");
							$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/gray.png");
							}else{
								$(this).parents().parents().css("color","#60BC21");
								$(this).siblings(".pic").children(".ima").attr("src","step_Demol/images/green.png");
								}
					}else{
						return;
						}
		});
});
function next(num)
{
			step+=num;
			$("#image"+step).attr("src","step_Demol/images/red.png");
			$(".content"+step).css("color","#E31237");
			if(num>0){
					for(var i=1;i<step;i++){
						$("#image"+i).attr("src","step_Demol/images/green.png");
						$(".content"+i).css("color","#60BC21");
					}
				}else{
					$("#image"+(step+1)).attr("src","step_Demol/images/gray.png");
					$(".content"+(step+1)).css("color","#000000");
					}
}
function loaddata1(date){
	if(date==1){
		document.getElementById("test").className="flow_step1";
		$("#bt1").css("color","red");	
		$("#bt2").css("color","#000000");	
		$("#bt3").css("color","#000000");	
		$("#file1").css("display","block");
		$("#file2").css("display","none");
		$("#file3").css("display","none");
		}else if(date==2){
			document.getElementById("test").className="flow_step2";
			$("#bt2").css("color","red");	
			$("#bt1").css("color","#000000");	
			$("#bt3").css("color","#000000");
			$("#file2").css("display","block");
			$("#file1").css("display","none");
			$("#file3").css("display","none");
			}else{
				document.getElementById("test").className="flow_step3";
				$("#bt3").css("color","red");	
				$("#bt2").css("color","#000000");	
				$("#bt1").css("color","#000000");
				$("#file3").css("display","block");
				$("#file2").css("display","none");
				$("#file1").css("display","none");
				}
}
