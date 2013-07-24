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
import javax.servlet.http.HttpServletResponse;

import com.space.umad.tools.Constants;
import com.space.umad.tools.Tools;


@WebFilter(urlPatterns="/guest/*")
public class GuestFilter implements Filter
{
	public GuestFilter()
	{
		
	}
	
	@Override
	public void destroy() 
	{
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		// Check if user is logged Off
        if(!Tools.isLoggedOn((HttpServletRequest)request))
        {
            chain.doFilter(request, response);
        }
        else
        {
            ((HttpServletResponse)response).sendRedirect(Constants.LINK_NOTGUEST_REDIRECT);
        }
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException 
	{
	}
}