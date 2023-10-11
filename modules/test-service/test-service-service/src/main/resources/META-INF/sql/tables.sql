create table AstraTestProject_UserCompany (
	uuid_ VARCHAR(75) null,
	userCompanyId LONG not null primary key,
	userId LONG,
	email VARCHAR(75) null,
	fullName VARCHAR(75) null,
	screenName VARCHAR(75) null,
	companyId LONG,
	corporateId LONG,
	divisionId LONG,
	departmentId LONG,
	deleted BOOLEAN,
	createBy VARCHAR(75) null,
	modifiedBy VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);