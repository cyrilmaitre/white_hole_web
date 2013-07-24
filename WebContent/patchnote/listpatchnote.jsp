<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="../header.jsp" />
    
	    <div class="page-header">
          <h1>Patch Notes</h1>
        </div>
		
		<div class="row">
			<div class="span16">
				<c:if test="${requestScope.isAdmin == true}">
					<a href="${requestScope.linkPrefixe}/admin/patchnote/add">Add Patch Note</a>
				</c:if>
			</div>
       	</div>
		
		
		<div class="row">
			<div class="span16">
    
				Download toussa
	
			
          	</div>
       	</div>
		
    <jsp:include page="../footer.jsp" />