<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="../header.jsp" />
    
	    <div class="page-header">
          <h1>Register a New Account</h1>
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
		              	<input class="xlarge" id="password" name="password" size="25" type="password" value="${requestScope.password}"/>
		            </div>
		            
		            <label class="defaultLabel" for="passwordConf">Confirm Password:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="passwordConf" name="passwordConf" size="25" type="password" value="${requestScope.passwordConf}"/>
		            </div>
		            
		            <label class="defaultLabel" for="email">Email:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="email" name="email" size="25" type="text" value="${requestScope.email}"/>
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
            		<c:when test="${!empty requestScope.success}">
	            		<div class="alert-message block-message success">
							<strong>${requestScope.success}</strong>
					    </div>
            		</c:when>
            	</c:choose>
          	</div>
       	</div>
		
    <jsp:include page="../footer.jsp" />