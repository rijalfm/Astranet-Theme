<div class="blue-menu container">
    <div aria-expanded="false" class="collapse navbar-collapse" id="navigationCollapse">
        <#if has_navigation && is_setup_complete>

            <nav class="${nav_css_class} site-navigation" id="navigation" role="navigation">
                <@liferay.navigation_menu />
            </nav>

        </#if>
    </div>
</div>