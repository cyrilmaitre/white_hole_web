<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="/header.jsp" />
    
	    <div class="page-header">
          <h1>Add ammo</h1>
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
		            
		            <label class="defaultLabel" for="lifetime">Life time:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="lifetime" name="lifetime" size="25" type="text" value="2"/>
		            </div>
		            
		            <label class="defaultLabel" for="damage">Damage:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="damage" name="damage" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="splashradius">Splash Radius:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="splashradius" name="splashradius" size="25" type="text" value="0"/>
		            </div>
		            
		            <label class="defaultLabel" for="ammotype">Ammo type:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="ammotype" name="ammotype" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="velocity">Velocity:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="velocity" name="velocity" size="25" type="text" value="2500"/>
		            </div>
		            
		            <label class="defaultLabel" for="quickening">Quickening:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="quickening" name="quickening" size="25" type="text" value="99999"/>
		            </div>
		            
		            <label class="defaultLabel" for="projectiletype">Projectile type:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="projectiletype" name="projectiletype" size="25" type="text" value="0"/>
		            </div>
		            
		            <label class="defaultLabel" for="projectilecolor">Projectile color:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="projectilecolor" name="projectilecolor" size="25" type="text" value="#FFFFFF"/>
		            </div>
		            
		            <label class="defaultLabel" for="projectilescale">Projectile scale:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="projectilescale" name="projectilescale" size="25" type="text" value="1"/>
		            </div>
		            
		            <label class="defaultLabel" for="soundfire">Sound fire:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="soundfire" name="soundfire" size="25" type="text" value="weapon_kinetic_1.wav"/>
		            </div>
		            
		            <div class="defaultButtonForm"><button class="btn primary" type="submit">Submit</button></div>
				</form>
			</div>
        </div>
        
    <jsp:include page="/footer.jsp" />