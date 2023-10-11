<#assign show_header_search = getterUtil.getBoolean(themeDisplay.getThemeSetting("show-header-search"))>

<#assign rService = serviceLocator.findService("com.liferay.portal.kernel.service.RoleService")>
<#assign usrRoles  = rService.getUserRoles(user_id) >

<#assign siteService = serviceLocator.findService("com.liferay.portal.kernel.service.UserGroupRoleLocalService") >
<#assign siteRoles  = rService.getUserGroupRoles(user_id, theme_display.getScopeGroupId()) >
<#assign showControlMenu  = false >
<#assign currentUrl = htmlUtil.escape(theme_display.getURLCurrent())>
<#assign logout_url = htmlUtil.escape(theme_display.getURLSignOut())>
<#assign isForum = false>
<#list usrRoles as uRole>
    <#if uRole.getName() == "Administrator">
        <#assign showControlMenu = true />
    </#if>
</#list>
<#if siteRoles??>
    <#list siteRoles as sRole>
        <#if sRole??>
            <#if sRole.getName() == "Site Administrator">
                <#assign showControlMenu = true />
            <#elseif sRole.getName() == "Site Content Reviewer">
                <#assign showControlMenu = true />
            </#if>
        </#if>
    </#list>
</#if>
<#if currentUrl?contains("/forum") || currentUrl?contains("message-board")>
    <#assign isForum = true />
</#if>

<#assign
wrap_widget_page_content = getterUtil.getBoolean(themeDisplay.getThemeSetting("wrap-widget-page-content"))
/>

<#if wrap_widget_page_content && ((layout.isTypeContent() && themeDisplay.isStateMaximized()) || (layout.getType() == "portlet"))>
    <#assign portal_content_css_class = "container" />
<#else>
    <#assign portal_content_css_class = "" />
</#if>
