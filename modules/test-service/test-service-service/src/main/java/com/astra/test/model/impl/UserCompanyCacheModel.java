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

package com.astra.test.model.impl;

import com.astra.test.model.UserCompany;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserCompany in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserCompanyCacheModel
	implements CacheModel<UserCompany>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserCompanyCacheModel)) {
			return false;
		}

		UserCompanyCacheModel userCompanyCacheModel =
			(UserCompanyCacheModel)object;

		if (userCompanyId == userCompanyCacheModel.userCompanyId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userCompanyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userCompanyId=");
		sb.append(userCompanyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", email=");
		sb.append(email);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", screenName=");
		sb.append(screenName);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", corporateId=");
		sb.append(corporateId);
		sb.append(", divisionId=");
		sb.append(divisionId);
		sb.append(", departmentId=");
		sb.append(departmentId);
		sb.append(", deleted=");
		sb.append(deleted);
		sb.append(", createBy=");
		sb.append(createBy);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserCompany toEntityModel() {
		UserCompanyImpl userCompanyImpl = new UserCompanyImpl();

		if (uuid == null) {
			userCompanyImpl.setUuid("");
		}
		else {
			userCompanyImpl.setUuid(uuid);
		}

		userCompanyImpl.setUserCompanyId(userCompanyId);
		userCompanyImpl.setUserId(userId);

		if (email == null) {
			userCompanyImpl.setEmail("");
		}
		else {
			userCompanyImpl.setEmail(email);
		}

		if (fullName == null) {
			userCompanyImpl.setFullName("");
		}
		else {
			userCompanyImpl.setFullName(fullName);
		}

		if (screenName == null) {
			userCompanyImpl.setScreenName("");
		}
		else {
			userCompanyImpl.setScreenName(screenName);
		}

		userCompanyImpl.setCompanyId(companyId);
		userCompanyImpl.setCorporateId(corporateId);
		userCompanyImpl.setDivisionId(divisionId);
		userCompanyImpl.setDepartmentId(departmentId);
		userCompanyImpl.setDeleted(deleted);

		if (createBy == null) {
			userCompanyImpl.setCreateBy("");
		}
		else {
			userCompanyImpl.setCreateBy(createBy);
		}

		if (modifiedBy == null) {
			userCompanyImpl.setModifiedBy("");
		}
		else {
			userCompanyImpl.setModifiedBy(modifiedBy);
		}

		if (createDate == Long.MIN_VALUE) {
			userCompanyImpl.setCreateDate(null);
		}
		else {
			userCompanyImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			userCompanyImpl.setModifiedDate(null);
		}
		else {
			userCompanyImpl.setModifiedDate(new Date(modifiedDate));
		}

		userCompanyImpl.resetOriginalValues();

		return userCompanyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userCompanyId = objectInput.readLong();

		userId = objectInput.readLong();
		email = objectInput.readUTF();
		fullName = objectInput.readUTF();
		screenName = objectInput.readUTF();

		companyId = objectInput.readLong();

		corporateId = objectInput.readLong();

		divisionId = objectInput.readLong();

		departmentId = objectInput.readLong();

		deleted = objectInput.readBoolean();
		createBy = objectInput.readUTF();
		modifiedBy = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userCompanyId);

		objectOutput.writeLong(userId);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (fullName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (screenName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(screenName);
		}

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(corporateId);

		objectOutput.writeLong(divisionId);

		objectOutput.writeLong(departmentId);

		objectOutput.writeBoolean(deleted);

		if (createBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(createBy);
		}

		if (modifiedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modifiedBy);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long userCompanyId;
	public long userId;
	public String email;
	public String fullName;
	public String screenName;
	public long companyId;
	public long corporateId;
	public long divisionId;
	public long departmentId;
	public boolean deleted;
	public String createBy;
	public String modifiedBy;
	public long createDate;
	public long modifiedDate;

}