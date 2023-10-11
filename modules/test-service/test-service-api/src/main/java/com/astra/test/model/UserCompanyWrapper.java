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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserCompany}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserCompany
 * @generated
 */
public class UserCompanyWrapper
	extends BaseModelWrapper<UserCompany>
	implements ModelWrapper<UserCompany>, UserCompany {

	public UserCompanyWrapper(UserCompany userCompany) {
		super(userCompany);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userCompanyId", getUserCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("email", getEmail());
		attributes.put("fullName", getFullName());
		attributes.put("screenName", getScreenName());
		attributes.put("companyId", getCompanyId());
		attributes.put("corporateId", getCorporateId());
		attributes.put("divisionId", getDivisionId());
		attributes.put("departmentId", getDepartmentId());
		attributes.put("deleted", isDeleted());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userCompanyId = (Long)attributes.get("userCompanyId");

		if (userCompanyId != null) {
			setUserCompanyId(userCompanyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String screenName = (String)attributes.get("screenName");

		if (screenName != null) {
			setScreenName(screenName);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long corporateId = (Long)attributes.get("corporateId");

		if (corporateId != null) {
			setCorporateId(corporateId);
		}

		Long divisionId = (Long)attributes.get("divisionId");

		if (divisionId != null) {
			setDivisionId(divisionId);
		}

		Long departmentId = (Long)attributes.get("departmentId");

		if (departmentId != null) {
			setDepartmentId(departmentId);
		}

		Boolean deleted = (Boolean)attributes.get("deleted");

		if (deleted != null) {
			setDeleted(deleted);
		}

		String createBy = (String)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		String modifiedBy = (String)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public UserCompany cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this user company.
	 *
	 * @return the company ID of this user company
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the corporate ID of this user company.
	 *
	 * @return the corporate ID of this user company
	 */
	@Override
	public long getCorporateId() {
		return model.getCorporateId();
	}

	/**
	 * Returns the create by of this user company.
	 *
	 * @return the create by of this user company
	 */
	@Override
	public String getCreateBy() {
		return model.getCreateBy();
	}

	/**
	 * Returns the create date of this user company.
	 *
	 * @return the create date of this user company
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the deleted of this user company.
	 *
	 * @return the deleted of this user company
	 */
	@Override
	public boolean getDeleted() {
		return model.getDeleted();
	}

	/**
	 * Returns the department ID of this user company.
	 *
	 * @return the department ID of this user company
	 */
	@Override
	public long getDepartmentId() {
		return model.getDepartmentId();
	}

	/**
	 * Returns the division ID of this user company.
	 *
	 * @return the division ID of this user company
	 */
	@Override
	public long getDivisionId() {
		return model.getDivisionId();
	}

	/**
	 * Returns the email of this user company.
	 *
	 * @return the email of this user company
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the full name of this user company.
	 *
	 * @return the full name of this user company
	 */
	@Override
	public String getFullName() {
		return model.getFullName();
	}

	/**
	 * Returns the modified by of this user company.
	 *
	 * @return the modified by of this user company
	 */
	@Override
	public String getModifiedBy() {
		return model.getModifiedBy();
	}

	/**
	 * Returns the modified date of this user company.
	 *
	 * @return the modified date of this user company
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this user company.
	 *
	 * @return the primary key of this user company
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the screen name of this user company.
	 *
	 * @return the screen name of this user company
	 */
	@Override
	public String getScreenName() {
		return model.getScreenName();
	}

	/**
	 * Returns the user company ID of this user company.
	 *
	 * @return the user company ID of this user company
	 */
	@Override
	public long getUserCompanyId() {
		return model.getUserCompanyId();
	}

	/**
	 * Returns the user ID of this user company.
	 *
	 * @return the user ID of this user company
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this user company.
	 *
	 * @return the user uuid of this user company
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this user company.
	 *
	 * @return the uuid of this user company
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this user company is deleted.
	 *
	 * @return <code>true</code> if this user company is deleted; <code>false</code> otherwise
	 */
	@Override
	public boolean isDeleted() {
		return model.isDeleted();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this user company.
	 *
	 * @param companyId the company ID of this user company
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the corporate ID of this user company.
	 *
	 * @param corporateId the corporate ID of this user company
	 */
	@Override
	public void setCorporateId(long corporateId) {
		model.setCorporateId(corporateId);
	}

	/**
	 * Sets the create by of this user company.
	 *
	 * @param createBy the create by of this user company
	 */
	@Override
	public void setCreateBy(String createBy) {
		model.setCreateBy(createBy);
	}

	/**
	 * Sets the create date of this user company.
	 *
	 * @param createDate the create date of this user company
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets whether this user company is deleted.
	 *
	 * @param deleted the deleted of this user company
	 */
	@Override
	public void setDeleted(boolean deleted) {
		model.setDeleted(deleted);
	}

	/**
	 * Sets the department ID of this user company.
	 *
	 * @param departmentId the department ID of this user company
	 */
	@Override
	public void setDepartmentId(long departmentId) {
		model.setDepartmentId(departmentId);
	}

	/**
	 * Sets the division ID of this user company.
	 *
	 * @param divisionId the division ID of this user company
	 */
	@Override
	public void setDivisionId(long divisionId) {
		model.setDivisionId(divisionId);
	}

	/**
	 * Sets the email of this user company.
	 *
	 * @param email the email of this user company
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the full name of this user company.
	 *
	 * @param fullName the full name of this user company
	 */
	@Override
	public void setFullName(String fullName) {
		model.setFullName(fullName);
	}

	/**
	 * Sets the modified by of this user company.
	 *
	 * @param modifiedBy the modified by of this user company
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}

	/**
	 * Sets the modified date of this user company.
	 *
	 * @param modifiedDate the modified date of this user company
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this user company.
	 *
	 * @param primaryKey the primary key of this user company
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the screen name of this user company.
	 *
	 * @param screenName the screen name of this user company
	 */
	@Override
	public void setScreenName(String screenName) {
		model.setScreenName(screenName);
	}

	/**
	 * Sets the user company ID of this user company.
	 *
	 * @param userCompanyId the user company ID of this user company
	 */
	@Override
	public void setUserCompanyId(long userCompanyId) {
		model.setUserCompanyId(userCompanyId);
	}

	/**
	 * Sets the user ID of this user company.
	 *
	 * @param userId the user ID of this user company
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this user company.
	 *
	 * @param userUuid the user uuid of this user company
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this user company.
	 *
	 * @param uuid the uuid of this user company
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected UserCompanyWrapper wrap(UserCompany userCompany) {
		return new UserCompanyWrapper(userCompany);
	}

}