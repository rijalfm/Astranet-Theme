<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key=" lang.dir " />" lang="${w3c_language_id}">

<head>
    <title>${the_title} - ${company_name}</title>

    <meta content="initial-scale=1.0, width=device-width" name="viewport" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />

    <@liferay_util["include"] page=top_head_include />

    <!-- Chatbot Script -->

    <#--  <style type="text/css">
    .dolphin-chat-icon{
    	bottom: 30px !important;
    }
    button.dolphin-message-unmute{
		display: none !important;
	}
	button.dolphin-message-logout{
		display: none !important;
	}
	button.dolphin-message-close{
		right: 17px !important;
	}
    </style>
    <script type="text/javascript">

    	var userNameChatbot = '${user.getFirstName()}';
    	var userEmailChatbot = '${user.getEmailAddress()}';
    	var userPhoneChatbot = '081233334444';

    	console.log('username : '+userNameChatbot);
    	console.log('useremail : '+userEmailChatbot);
    	console.log('userphone : '+userPhoneChatbot);

    	$(document).ready(function(){
    		$.getScript( "${javascript_folder}/chatbot/jquery.stylesheet.js").done(function() {
			var css = [ "${css_folder}/chatbot/blue.css",
				"${css_folder}/chatbot/widget.css",
				"${css_folder}/chatbot/lightslider.css"]
			$.getCss(css, function() {
				$.when(
					//$.getScript("https://maps.googleapis.com/maps/api/js?key=AIzaSyAnDdTmQAozPcMpKcPN06jD5cy0B5xt8Fw&libraries=places"),
					$.getScript("https://www.google.com/recaptcha/api.js" ),
					$.getScript("${javascript_folder}/chatbot/responsivevoice.js" ),
					$.getScript("${javascript_folder}/chatbot/iframeResizer.contentWindow.js" ),
					$.getScript("${javascript_folder}/chatbot/iframeResizer.js" ),
					$.getScript("${javascript_folder}/chatbot/lightslider.js" ),
					$.getScript("${javascript_folder}/chatbot/lazyload.min.js" ),
					$.getScript("${javascript_folder}/chatbot/cryptojs/pbkdf2.js" ),
					$.getScript("${javascript_folder}/chatbot/cryptojs/aes.js" ),
					$.getScript("${javascript_folder}/chatbot/cipher/aes-util.js" ),
					$.getScript("${javascript_folder}/chatbot/stp.js" ),
					$.getScript("${javascript_folder}/chatbot/sjs.js" ),
					$.getScript("${javascript_folder}/chatbot/fuse.js" ),
					$.getScript("${javascript_folder}/chatbot/speech.js" ),
					$.getScript("${javascript_folder}/chatbot/chat.js" ),
					$.Deferred(function( deferred ){
						$( deferred.resolve );
					})
				).done(function(){
					Chat.init({
						header: 'Welcome to Livechat-NPC',
						login_sub_header: 'Please tell us about yourself',
						//connect_message: 'Do you have questions ? <br>Come chat with us, we are here to help you',
						chat_sub_header: 'Astra International',

						//url: 'https://devbot.astra.co.id:11443',
                    	//client_id: '6d843937d5e9db961650d7dac4ef83e5',
                    	//client_secret: '9d72c0286ece593d98aa08c244677461',

                    	url: 'https://uatbot.astra.co.id:11443',
                    	client_id: '6d843937d5e9db961650d7dac4ef83e5',
                    	client_secret: 'e4af518508b31efe74cd1864939fea64',

						type_placeholder: 'Type message...',
						avatar: '${images_folder}/chatbot/sri_face.png',
						agent_avatar: '${images_folder}/chatbot/sri_face.png',
						icon_avatar: '${images_folder}/chatbot/ic_chat.png',
						enable_voice: false,
						enable_speech: false,
						triggerMenu: 'Main Menu',
						//queue_text: "NOMOR URUT: ",
						quick_reply_flat:"0",
						name: userNameChatbot,
						email: userEmailChatbot,
						phone: userPhoneChatbot
					});
					Chat.initToken(Chat);
					if (at == null) {
						at = JSON.parse(localStorage.getItem("at"));
					}
				});
			});
		});
    	})
    </script>  -->

    <!-- End of Chatbot Script -->
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<#assign navigationColor = getterUtil.getString(theme_settings["base-color"]!"",null) />
<#assign journalArticleLocalService = serviceLocator.findService("com.liferay.journal.service.JournalArticleLocalService")>
<#if is_signed_in>
    <#assign roles = user.getRoles()
    showcontrolmenu = false
    />
    <#list roles as role>
        <#if role.getName() == "Administrator" || role.getName() == "Other Role" >
            <#assign showcontrolmenu = true />
            <#break>
        </#if>
    </#list>
    <#if showcontrolmenu>
        <@liferay.control_menu />
    </#if>
</#if>


<#if navigationColor!="">
    <style>
        .astra-menu-mobile > ul > li {
            background: ${navigationColor} !important;
        }
        #backtotop{
            background-color: ${navigationColor} !important;
        }
        .astra-menu-mobile {
            background-color: ${navigationColor} !important;
        }
        .astra-menu ul ul {
            background-color: ${navigationColor} !important;
        }
        .blue ul.mega-menu {
            background-color: ${navigationColor} !important;
        }
    </style>
</#if>
<#assign footerText = getterUtil.getString(theme_settings["footer-text"]!"",null) />
<#assign footerSosmed = getterUtil.getString(theme_settings["footer-social-cms-id"]!"",null) />
<#assign isHome = getterUtil.getString(theme_settings["is-home"]!"",null) />
<#assign articleText = "">
<#assign articleSosmed = "">
<#if footerText?? && footerText?has_content>
    <!--Check is article exist -->
    <#assign hasArticle = journalArticleLocalService.hasArticle(group_id, footerText)>
    <#if hasArticle>
        <#assign articleText = journalArticleLocalService.fetchArticle(group_id, footerText)>
    </#if>
</#if>
<#if footerSosmed?? && footerSosmed?has_content>
    <!--Check is article exist -->
    <#assign hasArticleSosmed = journalArticleLocalService.hasArticle(group_id, footerSosmed)>
    <#if hasArticleSosmed>
        <#assign articleSosmed = journalArticleLocalService.fetchArticle(group_id, footerSosmed)>
    </#if>
</#if>
<div id="wrapper">
    <header class="container" id="banner" role="banner">
        <@liferay_portlet["runtime"]
        portletName="Cookies_INSTANCE_eqavr1hD14aG"
        />

        <@liferay_portlet["runtime"]
        portletName="com_astra_epp_portlet_EPPCheckAgreement"
        />

        <div class="cx-head row">
            <div class="col-md-3">
                <div class="head-left">
                    <a class="${logo_css_class}" href="${site_default_url}" title="<@liferay.language_format arguments=" ${site_name} " key="go-to-x " />">
                        <img alt="${logo_description}" src="${site_logo}" />
                    </a>

                    <#if show_site_name>
                        <span class="site-name" title="<@liferay.language_format arguments=" ${site_name} " key="go-to-x " />">
									${site_name}
								</span>
                    </#if>

                    <#if is_setup_complete>
                        <button aria-controls="navigation" aria-expanded="false" class="collapsed navbar-toggle mob-ico-pos" data-target="#navigationCollapse" data-toggle="collapse" type="button">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>

                    </#if>
                </div>
            </div>
            <div class="col-md-9 text-right cxrus-iconic">
                <div class="des-head">
                    <div class="new-search">
                        <@liferay.search />
                    </div>
                    <div class="new-search">
                        <@liferay_portlet["runtime"]
                        portletName="Astra_Notification_Portlet_INSTANCE_MhzwZQeCwxwI"
                        />
                    </div>
                    <div class="new-search">
                        <@liferay_portlet["runtime"]
                        portletName="Astra_Inbox_Portlet_INSTANCE_rPpBYQ3ytNKK"
                        />
                    </div>
                    <div class="new-search dropdown">
                        <button class="btn btn-txthead dropdown-toggle" style="border-right:0" type="button" data-toggle="dropdown">
                            <span><img src="${images_folder}/icon/user-black.png" class="ico-head"></span>
                            ${user_first_name} <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu list-unstyled">
                            <li><a class="dropdown-item" href="/group/guest/personal-info">Personal Info</a></li>
                            <li><a class="dropdown-item" href="/web/${user.getScreenName()}">MyProfile</a></li>
                            <li><a class="dropdown-item" href="/user/${user.getScreenName()}">MyDashboard</a></li>
                            <li><a class="dropdown-item" href="/group/guest/change-password">Change Password</a></li>
                            <li><a class="dropdown-item" href="/group/guest/change-phone-number">Change Phone Number</a></li>
                            <li><a class="dropdown-item" href="/group/guest/add-alternative-phone-number">Add Alternative Number</a></li>
                            <li><a class="dropdown-item" href="/c/portal/logout">Logout</a></li>
                        </ul>
                    </div>
                    <!--
		                        <a href="/group/guest/personal-info" class="btn btn-txthead"><img src="${images_folder}/icon/user.png" class="ico-head">${user_first_name}</a>
		                        <a href="${sign_out_url}" class="btn btn-grey"><img src="${images_folder}/icon/logout.png" class="ico-head"><@liferay.language key="logout" /></a>
	                     		-->
                </div>
                <div class="mob-head">
                    <div class="btn-group btn-group-justified">
                        <div class="btn-group">
                            <a href="/group/guest/personal-info"><button class="btn btn-mobile" type="button"><@liferay.language key="user" /></button></a>
                        </div>
                        <div class="btn-group" role="group">
                            <@liferay_portlet["runtime"]
                            portletName="Astra_Inbox_Mobile_Portlet_INSTANCE_z9zsPLSCLlg8"
                            />
                        </div>
                        <div class="btn-group">
                            <@liferay_portlet["runtime"]
                            portletName="Astra_Notification_Mobile_Portlet_INSTANCE_bbb5ZiZBna0m"
                            />
                        </div>
                        <div class="btn-group">
                            <a href="${logout_url}"><button class="btn btn-mobile" type="button"><@liferay.language key="Logout" /></button></a>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </header>

    <#include "${full_templates_path}/navigation.ftl" />

    <div class="box-content content">
        <section class="${portal_content_css_class} flex-fill" id="content">
            <#assign x = "/group/guest/home?_com_liferay_portal_search" />
            <#if isHome == "false" || currentUrl?contains(x)>
                <section class="banner-sub-page">
                    <div class="title">
                        <h3>&nbsp;</h3>
                    </div>
                </section>
            </#if>

            <nav id="breadcrumbs">
                <#if !isForum>
                    <@liferay.breadcrumbs />
                </#if>
            </nav>

<#--            <#if selectable>-->
<#--                <@liferay_util["include"] page=content_include />-->
<#--            <#else>-->
<#--                ${portletDisplay.recycle()}-->
<#--                ${portletDisplay.setTitle(the_title)}-->
<#--                <@liferay_theme["wrap-portlet"] page="portlet.ftl">-->
<#--                    <@liferay_util["include"] page=content_include />-->
<#--                </@>-->
<#--            </#if>-->
            <!-- MAIN PORTLET SECTION -->
            <h2 class="sr-only">${htmlUtil.escape(the_title)}</h2>
            <#if selectable>
                <@liferay_util["include"] page=content_include />
            <#else>
                ${portletDisplay.recycle()}

                ${portletDisplay.setTitle(the_title)}

                <@liferay_theme["wrap-portlet"] page="portlet.ftl">
                    <@liferay_util["include"] page=content_include />
                </@>
            </#if>
        </section>
    </div>
    <footer id="footer" role="contentinfo">
        <div class="bg-change-footer">
            <div class="container">
                <div class="row">
                    <@liferay_portlet["runtime"]
                    portletName="Astra_Calendar_Event_INSTANCE_wlJsidLW1cQa"
                    />
                </div>
            </div>
        </div>
        <div class="copyright">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <span>PT Astra International Tbk &copy; <span id="footerYear">2023</span> . All Right Reserved</span>
                    </div>
                    <div class="col-md-4">
                        <center>
                            <div class="sosmed-footer"><a href="<@liferay.language key="astra-fb" />"><img alt="facebook" src="${images_folder}/sosmed/facebook.png" /></a></div>
                            <div class="sosmed-footer"><a href="<@liferay.language key="astra-twitter" />"><img alt="twitter" src="${images_folder}/sosmed/twitter.png" /></a></div>
                            <div class="sosmed-footer"><a href="<@liferay.language key="astra-instagram" />"><img alt="instagram" src="${images_folder}/sosmed/instagram.png" /></a></div>
                            <div class="sosmed-footer"><a href="<@liferay.language key="astra-youtube" />" target="_blank"><img alt="youtube" src="${images_folder}/sosmed/youtube.png" /></a></div>
                            <div class="sosmed-footer"><a href="<@liferay.language key="astra-linkedin" />"><img alt="linkedin" src="${images_folder}/sosmed/linkedin.png" /></a></div>
                        </center>
                    </div>
                    <div class="col-md-4">
                        <ul>
                            <li><a href="#">IT Care Chat Online</a></li>
                            |
                            <li><a href="#">IT Self Service - Web</a></li>
                            |
                            <li><a href="mailto:itcare@ai.astra.co.id">itcare@ai.astra.co.id</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div id="backtotop"></div>
    </footer>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

<script type="text/javascript" src="${javascript_folder}/jquery-mTab-min.js"></script>

<script type="text/javascript">
    $(document).ready(function(e) {
        $('.tabbing').mTab({
            navigation: ".tabNav"
            ,container: ".tabContainer"
            ,activeTab: 0
            ,activeClass: "active"
            ,scrollOffset: false
            ,accordScreen: 4000
            ,toggleClose: true
            ,animation: false
            ,openWithUrl: true
            ,callbackonclick:  function() {  }
            ,callback: function() {  }
        });
    });

</script>
<script type="text/javascript" src="${javascript_folder}/jquery.bxslider.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $('.bxslider').bxSlider({
            auto: true,
            autoControls: false,
            controls: true,
            mouseDrag: true
        });
    });
</script>
<#-- <script type="text/javascript" src="${javascript_folder}/jquery.dataTables.min.js"></script> -->
<script type="text/javascript">
    $(function(){
        $(".astra-menu ul li ul li:has(ul)").find("a:first").append(" &raquo; ");
    });
</script>

<script type="text/javascript" src="${javascript_folder}/jquery.hoverIntent.minified.js"></script>

<script type="text/javascript" src="${javascript_folder}/jquery.dcmegamenu.1.3.3.js"></script>

<script type="text/javascript">
    //	$(document).ready(function($){

    //		$('#mega-menu').dcMegaMenu({
    //			rowItems: '5',
    //			speed: 'fast',
    //			effect: 'fade'
    //		});

    //	});
</script>

<script type="text/javascript" src="${javascript_folder}/navigasimenu.js"></script>
<script type="text/javascript" src="${javascript_folder}/navigasisidebar.js"></script>
<script type="text/javascript" src="${javascript_folder}/plugin/owl.carousel.min.js"></script>
<script type="text/javascript" src="${javascript_folder}/plugin/main-slider.min.js"></script>
<script type="text/javascript" src="${javascript_folder}/plugin/thumbnail-slider.min.js"></script>

<script type="text/javascript">
    $(document).ready(function() {

        $('#new-mega-menu').dcMegaMenu({
            rowItems: '5',
            speed: 'fast',
            effect: 'fade',
            event: 'click',
            fullWidth: true
        });

        $(".dc-mega-li").click(function(event){
            $("ul.menu-level-3").add(".container-level-4")
                .add(".menu-level-4").add("ul.menu-level-5").add("ul.menu-level-6").add("ul.menu-level-7")
                .css('display', 'none');
        })

        $(".mega-unit.mega-hdr").click(function(event) {
            var display = $(this).children("ul.menu-level-3").css('display');
            $("ul.menu-level-3").add(".container-level-4").add(".menu-level-4").add("ul.menu-level-5").add("ul.menu-level-6").add("ul.menu-level-7").css('display', 'none');
            if(display == 'none'){
                $(this).children("ul.menu-level-3").css('display', 'block');
            }
            event.stopPropagation();
        });

        $(".menu-level-3 li").click(function(event) {
            var cls = $(event.currentTarget).attr("class");
            if (cls == "mega-hover-black") {
                var displayContainer = $(this).children(".container-level-4").css('display');
                var displayMenu = $(this).children().find(".menu-level-4").css('display');
                $(".container-level-4").add(".menu-level-4").add("ul.menu-level-5").add("ul.menu-level-6").add("ul.menu-level-7").css('display', 'none');
                if(displayContainer == 'none' && displayMenu == 'none'){
                    $(this).children(".container-level-4").css('display', 'block');
                    $(this).children().find(".menu-level-4").css('display', 'block');
                }
            }
            event.stopPropagation();
        });

        $(".menu-level-4 li.li-level-4").click(function(event) {
            var cls = $(event.currentTarget).attr("class");
            if (cls == "li-level-4 active") {
                var display = $(this).children("ul.menu-level-5").css('display');
                $("ul.menu-level-5").add("ul.menu-level-6").add("ul.menu-level-7").css('display', 'none');
                if(display == 'none'){
                    $(this).children("ul.menu-level-5").css('display', 'block');
                }
            }
        });

        $(".menu-level-5 li").click(function(event) {
            var cls = $(event.currentTarget).attr("class");
            if (cls == "li-level-5 active") {
                var display = $(this).children("ul.menu-level-6").css('display');
                $("ul.menu-level-6").add("ul.menu-level-7").css('display', 'none');
                if(display == 'none'){
                    $(this).children("ul.menu-level-6").css('display', 'block');
                }
            }
            event.stopPropagation();
        });

        $(".menu-level-6 li").click(function(event) {
            var cls = $(event.currentTarget).attr("class");
            if (cls == "li-level-6 active") {
                var display = $(this).children("ul.menu-level-7").css('display');
                $("ul.menu-level-7").css('display', 'none');
                if(display == 'none'){
                    $(this).children("ul.menu-level-7").css('display', 'block');
                }
            }
            event.stopPropagation();
        });


        $(".mega-unit.mega-hdr").hover(function(){
            $(this).addClass("mega-hover-white");
        }, function(){
            $(this).removeClass("mega-hover-white");
        });

        $(".blue ul.mega-menu .sub ul.menu-level-3 li").hover(function(){
            $(this).addClass("mega-hover-black");
            var count = $(".mega-hover-black").find(".menu-level-4").children().length;
            var heightMenu;
            if($(window).width() < 1281) {
                heightMenu = count * 54;
            } else {
                heightMenu = count * 50;
            }
            $(".mega-hover-black").find(".menu-level-4").css("height", heightMenu);
            $(".mega-hover-black").find(".menu-level-5").css("height", heightMenu - 20);
            $(".mega-hover-black").find(".menu-level-6").css("height", heightMenu - 20);
            $(".mega-hover-black").find(".menu-level-7").css("height", heightMenu - 20);
            $(".mega-hover-black").find(".container-level-4").css("height", heightMenu + 5);
        }, function(){
            $(this).removeClass("mega-hover-black");
        });

        $(".menu-level-4 li").hover(function(){
            $(this).addClass("active");
            var count1 = $(".mega-hover-black").find(".menu-level-4").children().length;
            var count2 = $(".li-level-4.active").find(".menu-level-5").children().length;
            var count3 = $(".li-level-5.active").find(".menu-level-6").children().length;
            var heightMenu;
            if($(window).width() < 1281) {
                if(count1 >= count2 && count1 >= count3) {
                    //console.log("count1");
                    heightMenu = count1 * 48;
                } else if(count2 >= count1 && count2 >= count3) {
                    //console.log("count2");
                    heightMenu = count2 * 48;
                } else if(count3 >= count1 && count3 >= count2) {
                    console.log("count3");
                    heightMenu = count3 * 48;
                }
            } else {
                if(count1 >= count2 && count1 >= count3) {
                    //console.log("count1");
                    heightMenu = count1 * 44;
                } else if(count2 >= count1 && count2 >= count3) {
                    //console.log("count2");
                    heightMenu = count2 * 44;
                } else if(count3 >= count1 && count3 >= count2) {
                    //console.log("count3");
                    heightMenu = count3 * 44;
                }
            }
            $(".mega-hover-black").find(".menu-level-4").css("height", heightMenu);
            $(".mega-hover-black").find(".menu-level-5").css("height", heightMenu - 20);
            $(".mega-hover-black").find(".menu-level-6").css("height", heightMenu - 20);
            $(".mega-hover-black").find(".menu-level-7").css("height", heightMenu - 20);
            $(".mega-hover-black").find(".container-level-4").css("height", heightMenu + 5);
            $(this).removeClass("mega-hover-black");
        }, function(){
            $(this).removeClass("active");
        });

        $(".mega-menu li").hover(function(){
            var lengthMenu = $(this).find(".non-mega .sub li").length;
            var widthSubMenu = lengthMenu*230;
            $(this).find(".non-mega .sub li").wrapAll('<div class="non-mega-container"></div>');
            $(this).find(".non-mega .sub .non-mega-container").css("width", widthSubMenu);
        });

        $(".menu-level-5").hover(function(){
            $(this).parent().addClass("active");
        }, function(){
            $(this).parent().removeClass("active");
        });

        $(".menu-level-6").hover(function(){
            $(this).parent().addClass("active");
        }, function(){
            $(this).parent().removeClass("active");
        });

        $(".menu-level-7").hover(function(){
            $(this).parent().addClass("active");
        }, function(){
            $(this).parent().removeClass("active");
        });

        $(".breadcrumb").clone().insertAfter(".banner-sub-page");
        $(".breadcrumb").addClass("container");

        /*Remove URL if Has Child*/
        $('li.mega-unit.mega-hdr:has(> ul.menu-level-3)').find('.mega-hdr-a').attr("href", "javascript:void(0)");
        $('.menu-level-3 li:has(> .container-level-4 ul.menu-level-4)').find('.mega-hdr-a2').attr("href", "javascript:void(0)");
        $('.menu-level-4 li:has(> ul.menu-level-5)').find('.mega-hdr-a3').attr("href", "javascript:void(0)");
        $('.menu-level-5 li:has(> ul.menu-level-6)').find('.mega-hdr-a4').attr("href", "javascript:void(0)");
        $('.menu-level-6 li:has(> ul.menu-level-7)').find('.mega-hdr-a5').attr("href", "javascript:void(0)");
        $(".breadcrumb li a").attr("href", "javascript:void(0)");

        var isMobile = window.matchMedia("only screen and (max-width: 760px)");

        if (isMobile.matches) {
            $('<div class="menu-line"></div>' ).insertBefore('.mega-menu .sub ul.menu-level-3 li ul.menu-level-4 .li-level-4:first-child');
            /*Menu Level 3 Function*/
            $('.menu-level-3').css("display", "none");
            $('li.mega-unit.mega-hdr:has(> ul.menu-level-3) .mega-hdr-a').addClass('has-child');
            $('.rowi li.mega-unit.mega-hdr>a').on('click', function(){
                var element = $(this).parent('li');
                //var element = $(this);
                element.children('ul.menu-level-3').slideToggle("slow");
                event.stopPropagation();
            });

            /*Menu Level 4 Function*/
            $('.menu-level-4').css("display", "none");
            $('.menu-level-4').unwrap();
            $('.menu-level-3 li:has(> ul.menu-level-4) .mega-hdr-a2').addClass('has-child');
            $('.menu-level-3 li:has(> ul.menu-level-4)').find('.mega-hdr-a2').attr("href", "javascript:void(0)");
            $('.menu-level-3 li>a').on('click', function(){
                var element = $(this).parent('li');
                //var element = $(this);
                element.children('ul.menu-level-4').slideToggle("slow");
                event.stopPropagation();
            });

            /*Menu Level 5 Function*/
            $('.menu-level-5').css("display", "none");
            $('.menu-level-4 li:has(> ul.menu-level-5)').find('.mega-hdr-a3').attr("href", "javascript:void(0)");
            $('.menu-level-4 li>a').on('click', function(){
                var element = $(this).parent('li');
                //var element = $(this);
                element.children('ul.menu-level-5').slideToggle("slow");
                event.stopPropagation();
            });

            /*Menu Level 6 Function*/
            $('.menu-level-6').css("display", "none");
            $('.menu-level-5 li:has(> ul.menu-level-6)').find('.mega-hdr-a4').attr("href", "javascript:void(0)");
            $('.menu-level-5 li>a').on('click', function(){
                var element = $(this).parent('li');
                //var element = $(this);
                element.children('ul.menu-level-6').slideToggle("slow");
                event.stopPropagation();
            });

            /*Menu Level 7 Function*/
            $('.menu-level-7').css("display", "none");
            $('.menu-level-6 li:has(> ul.menu-level-7)').find('.mega-hdr-a5').attr("href", "javascript:void(0)");
            $('.menu-level-6 li>a').on('click', function(){
                var element = $(this).parent('li');
                //var element = $(this);
                element.children('ul.menu-level-7').slideToggle("slow");
                event.stopPropagation();

            });
        } else {
            $('<div class="menu-line"></div>' ).insertBefore('.mega-menu .sub ul.menu-level-3 li ul.menu-level-4');
        }

        var newCarousel = $(".new-carousel").owlCarousel({
            margin: 0,
            nav: true,
            loop: true,
            animateOut: 'fadeOut',
            mouseDrag: false,
            autoplay:true,
            autoplayTimeout:5000,
            autoplayHoverPause:true,
            dots : false,
            navText : ["<i class='fa fa-arrow-left' aria-hidden='true'></i>","<i class='fa fa-arrow-right' aria-hidden='true'></i>"],
            responsive: {
                0: {
                    items: 1
                },
                600: {
                    items: 1
                },
                1000: {
                    items: 1
                }
            }
        });

        $('#latest').owlCarousel({
            margin: 10,
            items: 6,
            autoplay: true,
            autoplayTimeout: 5000,
            nav: true,
            navText: ["<div class='prevbtn-slide'></div>", "<div class='nextbtn-slide'></div>"],
            loop: true,
            responsive: {
                0: {
                    items: 2,
                    nav: false,
                },
                640: {
                    items: 4,
                    nav: false,
                },
                1169: {
                    nav: false,
                },
                1269: {
                    items: 6,
                    nav: true,
                }
            }
        });

        $(".sites-control-group").click(function(){
            $(this).delay(520).queue(function() {
                newCarousel.trigger('refresh.owl.carousel');
                $(this).dequeue();
            });
        });

        $(".wrap-three-columns .item>a, .wrap-shortcut-othernews .item").find('img').each(function(n, image){
            var image = $(image);
            var thisurl = $(this).attr('src');
            image.parent(".wrap-three-columns .item>a, .wrap-shortcut-othernews .item").css('background-image', 'url(' + thisurl + ')');
        });

        $('#backtotop').click(function() {
            $('html, body').animate({scrollTop: 0}, 600);
        });
        $(window).scroll(function() {
            var btt = $('#backtotop');
            if ($(document).scrollTop() > 200) {
                btt.fadeIn();
            }else{
                btt.fadeOut();
            }
        });

        $('.sub-container').css({'left':'auto', 'margin-left':'auto', 'right':'auto', 'margin-right':'auto'});
        $(".new-carousel").find(".owl-nav").wrap("<div class='container'></div>");
        $(".collapse-basic-search").addClass("container");
        $(".calendar-portlet-column-parent").addClass("container");
        $(".main-content-body").addClass("container");
        $(".essa").addClass("container");
    });
</script>

</body>

</html>