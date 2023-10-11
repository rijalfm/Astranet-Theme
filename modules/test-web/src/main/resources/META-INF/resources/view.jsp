<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="testweb.caption"/></b>

	<clay:alert
			message="This is a danger message."
			cssClass="alert-danger"
			title="Failed"
	/>
</p>