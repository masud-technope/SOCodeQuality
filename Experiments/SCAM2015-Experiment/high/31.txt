<%-- Set up the current user --%>
<%
    session.setAttribute("current.user", "Me");
%>

<%-- scriptlets --%>
<%@ page import="com.example.Constants" %>
<h1>Using scriptlets</h1>
<h3>Constants.ATTR_CURRENT_USER</h3>
<%=Constants.ATTR_CURRENT_USER%> <br />
<h3>Session[Constants.ATTR_CURRENT_USER]</h3>
<%=session.getAttribute(Constants.ATTR_CURRENT_USER)%>

<%-- JSTL --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="cons" class="com.example.Constants" scope="session"/>

<h1>Using JSTL</h1>
<h3>Constants.getATTR_CURRENT_USER_FUNC()</h3>
<c:out value="${cons.ATTR_CURRENT_USER_FUNC}"/>
<h3>Session[Constants.getATTR_CURRENT_USER_FUNC()]</h3>
<c:out value="${sessionScope[cons.ATTR_CURRENT_USER_FUNC]}"/>
<h3>Constants.ATTR_CURRENT_USER</h3>
<c:out value="${sessionScope[Constants.ATTR_CURRENT_USER]}"/>
<%--
Commented out, because otherwise will error:
The class 'com.example.Constants' does not have the property 'ATTR_CURRENT_USER'.

<h3>cons.ATTR_CURRENT_USER</h3>
<c:out value="${sessionScope[cons.ATTR_CURRENT_USER]}"/>
--%>
<hr />