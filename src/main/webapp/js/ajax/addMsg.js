$(document).ready(function(){
				$.ajaxSetup({
					type : 'POST',
					dataType : 'json',
					contentType : 'application/json',
					cache : false,
					async : false
				});
			    $("#clothestype").change(function(){
			    	var sex = $("#sex option:selected").val();
					var clothestype = $("#clothestype option:selected").val();
			    	if(sex!=0&&clothestype!=0){
			    		var clothestypeJson = $.toJSON($("#clothestype").serializeObject());
				    	var sexJson = $.toJSON($("#sex").serializeObject());
				    	var paramsJson = $.toJSON($.extend({},$.parseJSON(sexJson),$.parseJSON(clothestypeJson)));
				       $.post("getPinming.do",paramsJson,function(msg){
				    	   $("#clothesname").empty();
				    	   $("#size").empty();
				    	   $("#changesize").empty();
								msg = eval("(" + msg + ")");
								var data = msg.queryParam;
								if(data != null){
									$.each(data,function(i,item){
						                  $("#clothesname").append("<option value="+item.clothesname+">"+item.clothesname+"</option>");
						                  if($("#size option").length==0){
							                  for(var key in item){
							                	  if(key!="clothesname"&&key!="clothesnum"&&key!="id"){
							                		  $("#size").append("<option value="+key+">"+key+"</option>");
								                	  $("#changesize").append("<option value="+key+">"+key+"</option>");
							                	  }
							                  }
						                  }
						              });
								}
				              
				           });
			    	}else{
			    		alert("请选择性别，服装类型");
			    	}
			    	
			       });
			    });