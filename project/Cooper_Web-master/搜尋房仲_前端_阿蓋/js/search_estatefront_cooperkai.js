
		<!-- 加入最愛 -->
			(function() {
			    $(document).on("click", ".heart_main", function(e) {
			        e.preventDefault();
			        $(this).toggleClass("active");
			    });
			})();
		
		<!-- 解決文字overflow -->
			$(document).ready(function(){
	    		//限制字符个数
	    		$(".text_overflow").each(function(){
	        		var maxwidth=100;
	        		if($(this).text().length>maxwidth){
	            		$(this).text($(this).text().substring(0,maxwidth));
	            		$(this).html($(this).html()+'...');
	        		}
	    		});
			});