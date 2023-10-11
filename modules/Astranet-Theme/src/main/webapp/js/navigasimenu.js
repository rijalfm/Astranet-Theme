$( document ).ready(function() {

$('.astra-menu-mobile ul li a').hover(function() {
  $('.astra-menu-mobile li').removeClass('active');
  $(this).closest('li').addClass('active');	
  var element = $(this).parent('li');
  if (element.hasClass('open')) {
	$(this).closest('li').removeClass('active');
    element.removeClass('open');
    element.find('li').removeClass('open');

  }
  else {
    element.addClass('open');
    element.children('ul').slideDown();
    element.siblings('li').children('ul').slideUp();
    element.siblings('li').removeClass('open');
    element.siblings('li').find('li').removeClass('open');
    element.siblings('li').find('ul').slideUp();
  }
});

$(".astra-menu-mobile ul li:has(ul)").find("a:first").before("<div class='arrow-sidebar2'></div>");


});

$(document).ready(function(){
	$(".arrow-sidebar2").click( function () {
	 $(this).closest("li").find("ul").slideToggle("slow");
	});
});