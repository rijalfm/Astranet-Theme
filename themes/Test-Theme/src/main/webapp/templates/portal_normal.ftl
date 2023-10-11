<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

    <head>
        <title>${the_title} - ${company_name}</title>
        <meta content="initial-scale=1.0, width=device-width" name="viewport" />
        <@liferay_util["include"] page=top_head_include />
    </head>

    <body class="${css_class}">
        <@liferay_ui["quick-access"] contentId="#main-content" />
        <@liferay_util["include"] page=body_top_include />

        <!-- MAIN CONTAINER -->
        <div class="d-flex flex-column min-vh-100">
            <@liferay.control_menu />


            <nav class="navbar navbar-custom" id="wrapper">
                <div class="container">
                    <div class="navbar-header">
                        <#if show_site_name>
                            <a class="${logo_css_class} align-items-center d-md-inline-flex d-sm-none d-none logo-md" href="${site_default_url}" title="<@liferay.language_format arguments="" key="go-to-x" />">
							<span class="site-name" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
								<img class="img-responsive" style="max-width: 150px; max-height: 24px;" src="${site_logo}" alt="Site Logo">
							</span>
                            </a>
                        </#if>
                    </div>

                    <div class="position-relative" id="myNavbar">
                        <a href="javascript:void(0);" class="toggle-nav" data-toggle="main-nav"></a>
                        <#if show_header && is_setup_complete>
                            <#include "${full_templates_path}/navigation.ftl" />
                        </#if>
                        <ul class="nav navbar-nav navbar-right">
                            <li>
                                <div class="autofit-col">
                                    <@liferay.user_personal_bar />
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>


            <!-- MAIN PORTLET SECTION -->
            <div class="container-fluid content">
                <section class="${portal_content_css_class} flex-fill" id="content">
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
            </div> <!-- END OF MAIN PORTLET -->
        </div> <!-- END OF MAIN CONTAINER -->

        <!-- FOOTER SECTION -->
        <#if show_footer>
            <footer id="footer">
                <div class="footer-block">PT Astra International Tbk &copy; <span id="copyright-year">2018</span> . All Right Reserved</div>
            </footer>
        </#if> <!-- END OF FOOTER SECTION -->

        <@liferay_util["include"] page=body_bottom_include />
        <@liferay_util["include"] page=bottom_include />

        <script>
            $(document).ready(function(){
                var today = new Date();
                $("#copyright-year").text(today.getFullYear());
            });
        </script>
    </body>

</html>