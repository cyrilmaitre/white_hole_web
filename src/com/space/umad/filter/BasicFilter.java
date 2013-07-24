package com.space.umad.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.space.umad.tools.Constants;
import com.space.umad.tools.Tools;


@WebFilter(urlPatterns="/*")
public class BasicFilter implements Filter
{
	public BasicFilter()
	{
		
	}

	@Override
	public void destroy() 
	{
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// Get pageName and isLoggedOn
		((HttpServletRequest)request).setAttribute("isLogged", Tools.isLoggedOn((HttpServletRequest)request));
		((HttpServletRequest)request).setAttribute("isAdmin", Tools.isAdmin((HttpServletRequest)request));
		((HttpServletRequest)request).setAttribute("linkPrefixe", Constants.LINK_ABSOLUTE_PREFIXE);
		
		// Chain
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException 
	{

	}
}
