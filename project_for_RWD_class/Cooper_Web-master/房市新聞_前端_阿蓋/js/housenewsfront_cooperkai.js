
		
		<!-- 解決文字overflow -->
			$(document).ready(function(){
	    		//限制字符个数
	    		$(".text_overflow").each(function(){
	        		var maxwidth=300;
	        		if($(this).text().length>maxwidth){
	            		$(this).text($(this).text().substring(0,maxwidth));
	            		$(this).html($(this).html()+'...');
	        		}
	    		});
			});