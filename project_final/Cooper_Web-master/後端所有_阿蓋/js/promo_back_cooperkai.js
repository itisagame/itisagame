


			function setBstModalMaxHeight(element) {
			  this.$element          = $(element);
			  this.$modalContent     = this.$element.find('.modal-content');
			  var $window            = $(window);
			  var $modalContentOH    = this.$modalContent.outerHeight();
			  var $modalContentIH    = this.$modalContent.innerHeight();
			  var _modalBorderWidth   = $modalContentOH - $modalContentIH;
			  var _modalDialogMargin  = $window.width() < 768 ? 20 : 60;
			  var _modalContentHeight = $window.height() - (_modalDialogMargin + _modalBorderWidth);
			  var _modalHeaderHeight  = this.$element.find('.modal-header').outerHeight() || 0;
			  var _modalFooterHeight  = this.$element.find('.modal-footer').outerHeight() || 0;
			  var _modalMaxHeight     = _modalContentHeight - (_modalHeaderHeight + _modalFooterHeight);
			
			  this.$modalContent.css({
			      'overflow': 'hidden'
			  });
			  
			  this.$element
			    .find('.modal-body').css({
			      'max-height': _modalMaxHeight,
			      'overflow-y': 'auto'
			  });
			}
			
			$('.modal').on('show.bs.modal', function() {
			  $(this).show();
			  setBstModalMaxHeight(this);
			});
			
			$(window).resize(function() {
			  if ($('.modal.in').length != 0) {
			    setBstModalMaxHeight($('.modal.in'));
			  }
			});




		$(function() {
			$("#promo_period_from").datepicker({
				// defaultDate: "+1w",
				changeMonth: true,
				numberOfMonths: 2,
				showButtonPanel: true,
				maxDate: "+1M +10D",
				minDate: 0,
				changeYear: true,
				dateFormat: 'yy-mm-dd',//自己加的轉格式用，預設是//yy/mm/dd
				onClose: function(selectedDate) {
					$("#promo_period_to").datepicker("option", "minDate", selectedDate);
				}
			});
			
			$("#promo_period_to").datepicker({
				// defaultDate: "+1w",
				changeMonth: true,
				numberOfMonths: 2,
				showButtonPanel: true,
				maxDate: "+1M +10D",
				minDate: 0,
				changeYear: true,
				dateFormat: 'yy-mm-dd',//自己加的轉格式用，預設是//yy/mm/dd
				onClose: function(selectedDate) {
					$("#promo_period_from").datepicker("option", "maxDate", selectedDate);
				}
			});
		});
