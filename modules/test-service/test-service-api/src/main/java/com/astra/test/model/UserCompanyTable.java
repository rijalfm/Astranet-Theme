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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;AstraTestProject_UserCompany&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see UserCompany
 * @generated
 */
public class UserCompanyTable extends BaseTable<UserCompanyTable> {

	public static final UserCompanyTable INSTANCE = new UserCompanyTable();

	public final Column<UserCompanyTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, Long> userCompanyId = createColumn(
		"userCompanyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<UserCompanyTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, String> fullName = createColumn(
		"fullName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, String> screenName = createColumn(
		"screenName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, Long> corporateId = createColumn(
		"corporateId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, Long> divisionId = createColumn(
		"divisionId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, Long> departmentId = createColumn(
		"departmentId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, Boolean> deleted = createColumn(
		"deleted", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, String> createBy = createColumn(
		"createBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, String> modifiedBy = createColumn(
		"modifiedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UserCompanyTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private UserCompanyTable() {
		super("AstraTestProject_UserCompany", UserCompanyTable::new);
	}

}