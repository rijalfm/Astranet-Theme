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

package com.astra.test.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the UserCompany service. Represents a row in the &quot;AstraTestProject_UserCompany&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.astra.test.model.impl.UserCompanyModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.astra.test.model.impl.UserCompanyImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserCompany
 * @generated
 */
@ProviderType
public interface UserCompanyModel
	extends BaseModel<UserCompany>, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user company model instance should use the {@link UserCompany} interface instead.
	 */

	/**
	 * Returns the primary key of this user company.
	 *
	 * @return the primary key of this user company
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this user company.
	 *
	 * @param primaryKey the primary key of this user company
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this user company.
	 *
	 * @return the uuid of this user company
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this user company.
	 *
	 * @param uuid the uuid of this user company
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the user company ID of this user company.
	 *
	 * @return the user company ID of this user company
	 */
	public long getUserCompanyId();

	/**
	 * Sets the user company ID of this user company.
	 *
	 * @param userCompanyId the user company ID of this user company
	 */
	public void setUserCompanyId(long userCompanyId);

	/**
	 * Returns the user ID of this user company.
	 *
	 * @return the user ID of this user company
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this user company.
	 *
	 * @param userId the user ID of this user company
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this user company.
	 *
	 * @return the user uuid of this user company
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this user company.
	 *
	 * @param userUuid the user uuid of this user company
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the email of this user company.
	 *
	 * @return the email of this user company
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this user company.
	 *
	 * @param email the email of this user company
	 */
	public void setEmail(String email);

	/**
	 * Returns the full name of this user company.
	 *
	 * @return the full name of this user company
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this user company.
	 *
	 * @param fullName the full name of this user company
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the screen name of this user company.
	 *
	 * @return the screen name of this user company
	 */
	@AutoEscape
	public String getScreenName();

	/**
	 * Sets the screen name of this user company.
	 *
	 * @param screenName the screen name of this user company
	 */
	public void setScreenName(String screenName);

	/**
	 * Returns the company ID of this user company.
	 *
	 * @return the company ID of this user company
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this user company.
	 *
	 * @param companyId the company ID of this user company
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the corporate ID of this user company.
	 *
	 * @return the corporate ID of this user company
	 */
	public long getCorporateId();

	/**
	 * Sets the corporate ID of this user company.
	 *
	 * @param corporateId the corporate ID of this user company
	 */
	public void setCorporateId(long corporateId);

	/**
	 * Returns the division ID of this user company.
	 *
	 * @return the division ID of this user company
	 */
	public long getDivisionId();

	/**
	 * Sets the division ID of this user company.
	 *
	 * @param divisionId the division ID of this user company
	 */
	public void setDivisionId(long divisionId);

	/**
	 * Returns the department ID of this user company.
	 *
	 * @return the department ID of this user company
	 */
	public long getDepartmentId();

	/**
	 * Sets the department ID of this user company.
	 *
	 * @param departmentId the department ID of this user company
	 */
	public void setDepartmentId(long departmentId);

	/**
	 * Returns the deleted of this user company.
	 *
	 * @return the deleted of this user company
	 */
	public boolean getDeleted();

	/**
	 * Returns <code>true</code> if this user company is deleted.
	 *
	 * @return <code>true</code> if this user company is deleted; <code>false</code> otherwise
	 */
	public boolean isDeleted();

	/**
	 * Sets whether this user company is deleted.
	 *
	 * @param deleted the deleted of this user company
	 */
	public void setDeleted(boolean deleted);

	/**
	 * Returns the create by of this user company.
	 *
	 * @return the create by of this user company
	 */
	@AutoEscape
	public String getCreateBy();

	/**
	 * Sets the create by of this user company.
	 *
	 * @param createBy the create by of this user company
	 */
	public void setCreateBy(String createBy);

	/**
	 * Returns the modified by of this user company.
	 *
	 * @return the modified by of this user company
	 */
	@AutoEscape
	public String getModifiedBy();

	/**
	 * Sets the modified by of this user company.
	 *
	 * @param modifiedBy the modified by of this user company
	 */
	public void setModifiedBy(String modifiedBy);

	/**
	 * Returns the create date of this user company.
	 *
	 * @return the create date of this user company
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this user company.
	 *
	 * @param createDate the create date of this user company
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this user company.
	 *
	 * @return the modified date of this user company
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this user company.
	 *
	 * @param modifiedDate the modified date of this user company
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	public UserCompany cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}