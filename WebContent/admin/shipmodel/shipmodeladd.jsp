<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<jsp:include page="/header.jsp" />
    
	    <div class="page-header">
          <h1>Add ship model</h1>
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
		            
		            <label class="defaultLabel" for="spriteitem">Sprite item:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="spriteitem" name="spriteitem" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="itemtype">Item type:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="itemtype" name="itemtype" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="itemtier">Item tier:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="itemtier" name="itemtier" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="hitbox_width">Hitbox width:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="hitbox_width" name="hitbox_width" size="25" type="text"/>
		            </div>
		           
		            <label class="defaultLabel" for="hitbox_height">Hitbox height:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="hitbox_height" name="hitbox_height" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="sprite">Sprite:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="sprite" name="sprite" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="sprite_wreck">Sprite wreck:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="sprite_wreck" name="sprite_wreck" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="sprite_wreckember">Sprite wreck ember:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="sprite_wreckember" name="sprite_wreckember" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="sprite_wreckelec">Sprite wreck elec:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="sprite_wreckelec" name="sprite_wreckelec" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="sprite_shield">Sprite shield:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="sprite_shield" name="sprite_shield" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="explosion_sound">Explosion sound:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="explosion_sound" name="explosion_sound" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="levelconf">Level conf:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="levelconf" name="levelconf" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="reactors">Reactors:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="reactors" name="reactors" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="reactor_sound">Reactor sound:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="reactor_sound" name="reactor_sound" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="flashinglights">Flashing lights:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="flashinglights" name="flashinglights" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="weapons">Weapons:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="weapons" name="weapons" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="turrets">Turrets:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="turrets" name="turrets" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="radars">Radars:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="radars" name="radars" size="25" type="text"/>
		            </div>
		            
		            <label class="defaultLabel" for="weapontype_allowed">Weapon type allowed:</label>
		            <div class="clearfix">
		              	<input class="xlarge" id="weapontype_allowed" name="weapontype_allowed" size="25" type="text"/>
		            </div>
		           
		            <div class="defaultButtonForm"><button class="btn primary" type="submit">Submit</button></div>
				</form>
			</div>
        </div>
        
    <jsp:include page="/footer.jsp" />