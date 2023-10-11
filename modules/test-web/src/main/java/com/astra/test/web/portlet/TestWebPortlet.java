package com.astra.test.web.portlet;

import com.astra.test.service.UserCompanyLocalServiceUtil;
import com.astra.test.web.constants.TestWebPortletKeys;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

/**
 * @author root
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=TestWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TestWebPortletKeys.TESTWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TestWebPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();

		try {
			DynamicQuery dynamicQuery = UserCompanyLocalServiceUtil.dynamicQuery();
			dynamicQuery.add(RestrictionsFactoryUtil.eq("userId", user.getUserId()));
			dynamicQuery.add(RestrictionsFactoryUtil.eq("deleted", false));
			long countUser = UserCompanyLocalServiceUtil.dynamicQueryCount(dynamicQuery);

			System.out.println("Count User Company: " + countUser);

			if (countUser <= 20L) {
				UserCompanyLocalServiceUtil
						.saveNewUserCompany(
								user.getUserId(),
								user.getFullName(),
								user.getEmailAddress(),
								user.getScreenName(),
								themeDisplay
						);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		super.render(renderRequest, renderResponse);
	}
}