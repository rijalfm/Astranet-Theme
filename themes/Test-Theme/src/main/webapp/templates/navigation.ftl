<ul style="display: block;" class="nav navbar-nav navbar-main">
    <#list nav_items as nav_item>

        <#assign
        nav_item_attr_has_popup = ""
        nav_item_attr_selected = ""
        nav_item_css_class = ""
        nav_item_layout = nav_item.getLayout()
        />
        <#if nav_item.isSelected()>
            <#assign
            nav_item_attr_has_popup = "aria-haspopup='true'"
            nav_item_attr_selected = "aria-selected='true'"
            />

            <#if nav_item.hasBrowsableChildren()>
                <#assign
                nav_item_css_class = "btn-active dropdown"
                />
            <#else>
                <#assign
                nav_item_css_class = "btn-active"
                />
            </#if>
        <#elseif nav_item.hasBrowsableChildren()>
            <#assign nav_item_css_class = "dropdown" />
        <#else>
            <#assign nav_item_css_class = "" />
        </#if>

        <#if nav_item.hasBrowsableChildren() >
            <#assign
            parent_has_child = true
            caret_css = "<b class='caret'></b>"
            class_toggle = "class='dropdown-toggle'"
            data_toggle = "data-toggle='dropdown'"
            />
        <#else>
            <#assign
            parent_has_child = false
            caret_css = ""
            class_toggle = ""
            data_toggle = ""
            />
        </#if>

        <li class="${nav_item_css_class}">
            <a ${class_toggle} ${data_toggle} href="${nav_item.getURL()}">${nav_item.getName()} ${caret_css}</a>
            <#if parent_has_child>
                <ul class="dropdown-menu custom_child_nav">
                    <#list nav_item.getBrowsableChildren() as nav_child>
                        <#if nav_child.isSelected()>
                            <li class="active"><a class="active" href="${nav_child.getURL()}">${nav_child.getName()}</a></li>
                        <#else>
                            <li><a href="${nav_child.getURL()}">${nav_child.getName()}</a></li>
                        </#if>
                    </#list>
                </ul>
            </#if>
        </li>

    </#list>
</ul>