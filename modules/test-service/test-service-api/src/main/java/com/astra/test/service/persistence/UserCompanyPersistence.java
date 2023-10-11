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

package com.astra.test.service.persistence;

import com.astra.test.exception.NoSuchUserCompanyException;
import com.astra.test.model.UserCompany;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the user company service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserCompanyUtil
 * @generated
 */
@ProviderType
public interface UserCompanyPersistence extends BasePersistence<UserCompany> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserCompanyUtil} to access the user company persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user companies where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user companies
	 */
	public java.util.List<UserCompany> findByUuid(String uuid);

	/**
	 * Returns a range of all the user companies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @return the range of matching user companies
	 */
	public java.util.List<UserCompany> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the user companies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user companies
	 */
	public java.util.List<UserCompany> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user companies where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user companies
	 */
	public java.util.List<UserCompany> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user company in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user company
	 * @throws NoSuchUserCompanyException if a matching user company could not be found
	 */
	public UserCompany findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
				orderByComparator)
		throws NoSuchUserCompanyException;

	/**
	 * Returns the first user company in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user company, or <code>null</code> if a matching user company could not be found
	 */
	public UserCompany fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator);

	/**
	 * Returns the last user company in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user company
	 * @throws NoSuchUserCompanyException if a matching user company could not be found
	 */
	public UserCompany findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
				orderByComparator)
		throws NoSuchUserCompanyException;

	/**
	 * Returns the last user company in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user company, or <code>null</code> if a matching user company could not be found
	 */
	public UserCompany fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator);

	/**
	 * Returns the user companies before and after the current user company in the ordered set where uuid = &#63;.
	 *
	 * @param userCompanyId the primary key of the current user company
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user company
	 * @throws NoSuchUserCompanyException if a user company with the primary key could not be found
	 */
	public UserCompany[] findByUuid_PrevAndNext(
			long userCompanyId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
				orderByComparator)
		throws NoSuchUserCompanyException;

	/**
	 * Removes all the user companies where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of user companies where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user companies
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the user companies where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching user companies
	 */
	public java.util.List<UserCompany> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the user companies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @return the range of matching user companies
	 */
	public java.util.List<UserCompany> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the user companies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user companies
	 */
	public java.util.List<UserCompany> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user companies where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user companies
	 */
	public java.util.List<UserCompany> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user company
	 * @throws NoSuchUserCompanyException if a matching user company could not be found
	 */
	public UserCompany findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
				orderByComparator)
		throws NoSuchUserCompanyException;

	/**
	 * Returns the first user company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user company, or <code>null</code> if a matching user company could not be found
	 */
	public UserCompany fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator);

	/**
	 * Returns the last user company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user company
	 * @throws NoSuchUserCompanyException if a matching user company could not be found
	 */
	public UserCompany findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
				orderByComparator)
		throws NoSuchUserCompanyException;

	/**
	 * Returns the last user company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user company, or <code>null</code> if a matching user company could not be found
	 */
	public UserCompany fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator);

	/**
	 * Returns the user companies before and after the current user company in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param userCompanyId the primary key of the current user company
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user company
	 * @throws NoSuchUserCompanyException if a user company with the primary key could not be found
	 */
	public UserCompany[] findByUuid_C_PrevAndNext(
			long userCompanyId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
				orderByComparator)
		throws NoSuchUserCompanyException;

	/**
	 * Removes all the user companies where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of user companies where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching user companies
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the user company in the entity cache if it is enabled.
	 *
	 * @param userCompany the user company
	 */
	public void cacheResult(UserCompany userCompany);

	/**
	 * Caches the user companies in the entity cache if it is enabled.
	 *
	 * @param userCompanies the user companies
	 */
	public void cacheResult(java.util.List<UserCompany> userCompanies);

	/**
	 * Creates a new user company with the primary key. Does not add the user company to the database.
	 *
	 * @param userCompanyId the primary key for the new user company
	 * @return the new user company
	 */
	public UserCompany create(long userCompanyId);

	/**
	 * Removes the user company with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userCompanyId the primary key of the user company
	 * @return the user company that was removed
	 * @throws NoSuchUserCompanyException if a user company with the primary key could not be found
	 */
	public UserCompany remove(long userCompanyId)
		throws NoSuchUserCompanyException;

	public UserCompany updateImpl(UserCompany userCompany);

	/**
	 * Returns the user company with the primary key or throws a <code>NoSuchUserCompanyException</code> if it could not be found.
	 *
	 * @param userCompanyId the primary key of the user company
	 * @return the user company
	 * @throws NoSuchUserCompanyException if a user company with the primary key could not be found
	 */
	public UserCompany findByPrimaryKey(long userCompanyId)
		throws NoSuchUserCompanyException;

	/**
	 * Returns the user company with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userCompanyId the primary key of the user company
	 * @return the user company, or <code>null</code> if a user company with the primary key could not be found
	 */
	public UserCompany fetchByPrimaryKey(long userCompanyId);

	/**
	 * Returns all the user companies.
	 *
	 * @return the user companies
	 */
	public java.util.List<UserCompany> findAll();

	/**
	 * Returns a range of all the user companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @return the range of user companies
	 */
	public java.util.List<UserCompany> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the user companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user companies
	 */
	public java.util.List<UserCompany> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user companies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserCompanyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user companies
	 * @param end the upper bound of the range of user companies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user companies
	 */
	public java.util.List<UserCompany> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserCompany>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user companies from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user companies.
	 *
	 * @return the number of user companies
	 */
	public int countAll();

}