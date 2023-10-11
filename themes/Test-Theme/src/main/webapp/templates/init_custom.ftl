<#assign
show_footer = getterUtil.getBoolean(themeDisplay.getThemeSetting("show-footer"))
show_header = getterUtil.getBoolean(themeDisplay.getThemeSetting("show-header"))
wrap_widget_page_content = getterUtil.getBoolean(themeDisplay.getThemeSetting("wrap-widget-page-content"))
/>

<#if wrap_widget_page_content && ((layout.isTypeContent() && themeDisplay.isStateMaximized()) || (layout.getType() == "portlet"))>
    <#assign portal_content_css_class = "container" />
<#else>
    <#assign portal_content_css_class = "" />
</#if>