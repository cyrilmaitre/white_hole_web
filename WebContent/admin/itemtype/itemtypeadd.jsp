<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="/header.jsp" />
    
	    <div class="page-header">
          <h1>Add item type</h1>
        </div>

		<div class="row">
          	<div class="span10">
				<form method="post" action="" accept-charset="ISO-8859-1">
					<label class="defaultLabel" for="name">Name:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="name" name="name" size="25" type="text"/>
		            </div>
		            
		          	<label class="defaultLabel" for="description">Description:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="description" name="description" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="icon">Icon:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="icon" name="icon" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="parent">Parent:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="parent" name="parent" size="25" type="text" value="0"/>
		            </div>
		            		            
		            <div class="defaultButtonForm"><button class="btn primary" type="submit">Submit</button></div>
				</form>
			</div>
        </div>
        
    <jsp:include page="/footer.jsp" />