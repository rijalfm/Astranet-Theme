/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.astra.test.service.impl;

import com.astra.test.model.UserCompany;
import com.astra.test.service.base.UserCompanyLocalServiceBaseImpl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.astra.test.model.UserCompany",
	service = AopService.class
)
public class UserCompanyLocalServiceImpl
	extends UserCompanyLocalServiceBaseImpl {

	public UserCompany saveNewUserCompany(long userId, String name, String email, String screenName, ThemeDisplay themeDisplay) throws PortalException, SystemException {
		Date now = new Date();

		UserCompany userCompany = createUserCompany(CounterLocalServiceUtil.increment(UserCompany.class.getName()));

		userCompany.setUserId(userId);
		userCompany.setFullName(name);
		userCompany.setEmail(email);
		userCompany.setScreenName(screenName);
		userCompany.setCreateDate(now);
		userCompany.setModifiedDate(now);
		userCompany.setCreateBy(themeDisplay.getUser().getEmailAddress());
		userCompany.setModifiedBy(themeDisplay.getUser().getEmailAddress());

		userCompanyPersistence.update(userCompany);

		return userCompany;
	}
}