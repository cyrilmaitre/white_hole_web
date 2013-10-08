package com.space.umad.tools;


public class Constants 
{
	/*
	 * LINK
	 */	
	// User
	public static final String LINK_USER_REGISTER			= "/guest/register";
	public static final String LINK_USER_REGISTER_STATIC	= "/user/register.jsp";
	public static final String LINK_USER_LOGIN				= "/guest/login";
	public static final String LINK_USER_LOGIN_STATIC		= "/user/login.jsp";
	public static final String LINK_USER_LOGOUT				= "/logged/logout";
	
	// Patch Note
	public static final String LINK_PATCHNOTE_LIST			= "/patchnote/list";
	public static final String LINK_PATCHNOTE_LIST_STATIC	= "/patchnote/listpatchnote.jsp";
	public static final String LINK_PATCHNOTE_ADD			= "/admin/patchnote/add";
	public static final String LINK_PATCHNOTE_ADD_STATIC	= "/patchnote/addpatchnote.jsp";
	
	// Db Init
	public static final String LINK_DBINIT					= "/admin/dbinit";
	
	// Admin
	public static final String LINK_CONFIGSELECT			= "/admin/config/select";
	public static final String LINK_CONFIGSELECT_STATIC		= "/admin/config/configselect.jsp";
	public static final String LINK_CONFIGAMMO				= "/admin/config/ammo";
	public static final String LINK_CONFIGITEM				= "/admin/config/item";
	public static final String LINK_CONFIGITEMTPE			= "/admin/config/itemtype";
	public static final String LINK_CONFIGWEAPON			= "/admin/config/weaponmodel";
	public static final String LINK_AMMO_ADD				= "/admin/ammo/add";
	public static final String LINK_AMMO_ADD_STATIC			= "/admin/ammo/ammoadd.jsp";
	public static final String LINK_ITEMTYPE_ADD			= "/admin/itemtype/add";
	public static final String LINK_ITEMTYPE_ADD_STATIC		= "/admin/itemtype/itemtypeadd.jsp";
	public static final String LINK_WEAPONMODEL_ADD			= "/admin/weaponmodel/add";
	public static final String LINK_WEAPONMODEL_ADD_STATIC	= "/admin/weaponmodel/weaponmodeladd.jsp";
	
	// Divers
	public static final String LINK_ABSOLUTE_PREFIXE 		= "/SpaceUMad";
	public static final String PROJECT_NAME			 		= "/SpaceUMad";
	
	// Redirect
	public static final String LINK_NOTGUEST_REDIRECT 		= LINK_ABSOLUTE_PREFIXE;
	public static final String LINK_NOTLOGGED_REDIRECT 		= LINK_ABSOLUTE_PREFIXE + LINK_USER_LOGIN;
	public static final String LINK_NOTADMIN_REDIRECT 		= LINK_ABSOLUTE_PREFIXE;
	public static final String LINK_COMMON_ERROR_REDIRECT	= LINK_ABSOLUTE_PREFIXE;
	
	// Rest
	public static final String RESULT_KEY					= "result";
	public static final String RESULT_OK					= "ok";
	public static final String RESULT_FAIL					= "fail";
	public static final String RESULT_FAILJSON				= "fail_json";
	
	/*
	 * DAO
	 */
	public enum TypeDao 
	{
		TYPE_DAO_JPA, 
		TYPE_DAO_JDBC, 
		TYPE_DAO_JAXB
	}
	public static final TypeDao TYPE_DAO_USED = TypeDao.TYPE_DAO_JPA;
}
