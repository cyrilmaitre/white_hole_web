<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="/header.jsp" />
    
	    <div class="page-header">
          <h1>Add weapon model</h1>
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
		            
		            <label class="defaultLabel" for="volume">Volume:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="volume" name="volume" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="price">Price:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="price" name="price" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="sprite">Sprite:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="sprite" name="sprite" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="itemtype">Item Type:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="itemtype" name="itemtype" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="itemtier">Item Tier:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="itemtier" name="itemtier" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="damagemultiplier">Damage multiplier:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="damagemultiplier" name="damagemultiplier" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="ammomax">Ammo max:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="ammomax" name="ammomax" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="range">Range:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="range" name="range" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="rangeangle">Range angle:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="rangeangle" name="rangeangle" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="reloadingspeed">Reloading speed:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="reloadingspeed" name="reloadingspeed" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="firerate">Firerate:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="firerate" name="firerate" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="soundreload">Sound reload:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="soundreload" name="soundreload" size="25" type="text" value="weapon_kinetic_reload.wav"/>
		            </div>
		            
		            <label class="defaultLabel" for="ammotypeallowed">Ammo type allowed:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="ammotypeallowed" name="ammotypeallowed" size="25" type="text" value="0"/>
		            </div>
		            
		            <div class="defaultButtonForm"><button class="btn primary" type="submit">Submit</button></div>
				</form>
			</div>
        </div>
        
    <jsp:include page="/footer.jsp" />