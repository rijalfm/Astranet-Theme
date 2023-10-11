$( document ).ready(function() {

$('.astra-menu-sidebar ul li a').hover(function() {
  $('.astra-menu-sidebar li').removeClass('active');
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

$(".astra-menu-sidebar li:has(ul)").find("a:first").before("<div class='arrow-sidebar'></div>");
$(".leftmenuipod li:has(ul)").find("a:first").after("<a class='toggle' href='javascript:void(0);'><span class='glyphicon glyphicon-chevron-down' aria-hidden='true'></span></a>");    
});

$(document).ready(function(){
	$(".arrow-sidebar").click( function () {
	 $(this).closest("li").find("ul").slideToggle("slow");
	});
});

$( document ).ready(function() {
	$('.toggle').click(function(e) {
	  	e.preventDefault();
	  
	    var $this = $(this);
	  
	    if ($this.next().hasClass('show')) {
	        $this.next().removeClass('show');
	        $this.next().slideUp(350);
	    } else {
	        $this.parent().parent().find('li .inner').removeClass('show');
	        $this.parent().parent().find('li .inner').slideUp(350);
	        $this.next().toggleClass('show');
	        $this.next().slideToggle(350);
	    }
	});

});

