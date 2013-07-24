<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="../header.jsp" />
    
	    <div class="page-header">
          <h1>Login</h1>
        </div>
		
		<div class="row">
	
          	<div class="span10">
				<form method="post" action="" accept-charset="ISO-8859-1">
		            <label class="defaultLabel" for="username">Username:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="username" name="username" size="25" type="text" value="${requestScope.username}"/>
		            </div>
		            
		            <label class="defaultLabel" for="password">Password:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="password" name="password" size="25" type="password"/>
		            </div>
		        	
		            <div class="defaultButtonForm"><button class="btn primary" type="submit">Submit</button></div>
				</form>
			</div>
			
          	<div class="span7">
            	<c:choose>
            		<c:when test="${!empty requestScope.error}">
            			<div class="alert-message block-message error">
            				${requestScope.error}
            			</div>
            		</c:when>
            	</c:choose>
          	</div>
         	
       	</div>
		
    <jsp:include page="../footer.jsp" />