<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	<head>
	    <meta charset="utf-8">
	    <title>Space U Mad</title>
	    <meta name="description" content="SpaceUMad">
	    <meta name="author" content="Cyril MAITRE">
	
	    <!-- Le styles -->
	    <link href="${requestScope.linkPrefixe}/css/bootstrap.css" rel="stylesheet">
	    <link href="${requestScope.linkPrefixe}/css/design.css" rel="stylesheet">
	    <link href="${requestScope.linkPrefixe}/css/jquery-ui.css" rel="stylesheet">
	    <link href="${requestScope.linkPrefixe}/css/ui.theme.css" rel="stylesheet">
	    
	    <!-- Le JS -->
	    <script type="text/javascript" src="${requestScope.linkPrefixe}/js/jquery.min.js"></script>
	    <script type="text/javascript" src="${requestScope.linkPrefixe}/js/jquery.ui.datepicker-fr.js"></script>
	    <script type="text/javascript" src="${requestScope.linkPrefixe}/js/jquery-ui.min.js"></script>
	    <script type="text/javascript" src="${requestScope.linkPrefixe}/js/jquery.tablesorter.min.js"></script>
	    <script type="text/javascript" src="${requestScope.linkPrefixe}/js/bootstrap-dropdown.js"></script>
  	</head>
  	
  	<body>
  	
		<div class="topbar">
		  	<div class="fill">
		    	<div class="container">

		      		<a class="brand" href="${requestScope.linkPrefixe}/">Space U Mad</a>
		      		
                	<ul class="nav">
                		<li class="divider-vertical"></li>
                		<li class="dropdown">
                    		<a href="${requestScope.linkPrefixe}/"><i class="icon-home icon-white"></i> Home</a>
                    	</li>
                    	
                    	<li class="divider-vertical"></li>
                  		<li class="dropdown">
                    	<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-cog icon-white"></i> Game <b class="caret"></b></a>
                    		<ul class="dropdown-menu">
                      			<li><a href="${requestScope.linkPrefixe}/admin/dishtype/add">About the game</a></li>
                      			<li><a href="${requestScope.linkPrefixe}/admin/dishtype/add">How to play</a></li>
                      			<li><a href="${requestScope.linkPrefixe}/admin/dishtype/add">Credits</a></li>
                    		</ul>
                  		</li>
                  		
                  		<li class="divider-vertical"></li>
                		<li class="dropdown">
                    		<a href="${requestScope.linkPrefixe}/patchnote/list"><i class="icon-circle-arrow-down icon-white"></i> Download</a>
                    	</li>
                  		                   		
                  		<c:choose>
							<c:when test="${requestScope.isLogged == true}">
								<li class="divider-vertical"></li>
								<li class="dropdown">
		                    		<a href="${requestScope.linkPrefixe}/logged/waitercall/list"><i class="icon-user icon-white"></i> Profil</a>
		                    	</li>	
							</c:when>
						</c:choose>
						
						<c:choose>
							<c:when test="${requestScope.isAdmin == true}">
								<li class="divider-vertical"></li>
								<li class="dropdown">
		                    	<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-cog icon-white"></i> Admin <b class="caret"></b></a>
		                    		<ul class="dropdown-menu">
		                      			<li><a href="${requestScope.linkPrefixe}/admin/ammo/add">Add ammo model </a></li>
		                      			<li><a href="${requestScope.linkPrefixe}/admin/weaponmodel/add">Add weapon model</a></li>
		                      			<li><a href="${requestScope.linkPrefixe}/admin/itemtype/add">Add item type</a></li>
		                      			<li><a href="${requestScope.linkPrefixe}/admin/config/select">Generation config</a></li>
		                    		</ul>
		                  		</li>
							</c:when>
						</c:choose>
						<li class="divider-vertical"></li>
                	</ul>	
                	
                	<c:choose>
						<c:when test="${requestScope.isLogged == true}">
							<ul class="nav pull-right">
		                    	<li class="divider-vertical"></li>
		                    	<li class="dropdown">
		                    		<a href="${requestScope.linkPrefixe}/logged/logout">Logout</a> 
		                    	</li>
		                    	<li class="divider-vertical"></li>
							</ul>		
						</c:when>
						<c:otherwise>
							<ul class="nav pull-right">
								<li class="divider-vertical"></li>
								<li class="dropdown">
		                    		<a href="${requestScope.linkPrefixe}/guest/login">Login</a>
		                    	</li>
		                    	<li class="divider-vertical"></li>
		                    	<li class="dropdown">
		                    		<a href="${requestScope.linkPrefixe}/guest/register">Register</a> 
		                    	</li>
		                    	<li class="divider-vertical"></li>
							</ul>
						</c:otherwise>
					</c:choose>
		    	</div>
		  	</div>
		</div>
		

 		<div class="container">
   			<div class="content">