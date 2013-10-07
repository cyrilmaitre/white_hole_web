<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="/header.jsp" />
    
	    <div class="page-header">
          <h1>Generate config</h1>
        </div>

		<div class="row">
          	<div class="span10">
	            <div class="clearfix">
	                <ul>
				    	<li><a href="${requestScope.linkPrefixe}/admin/config/ammo">Ammo Model config</a></li>
	              		<li><a href="${requestScope.linkPrefixe}/admin/config/item">Item config</a></li>
				    </ul>
	            </div>
			</div>
        </div>
        
    <jsp:include page="/footer.jsp" />