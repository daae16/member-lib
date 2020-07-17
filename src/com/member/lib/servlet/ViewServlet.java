package com.member.lib.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PREFIX="/WEB-INF";
	private static final String SUFIX=".jsp";

    public ViewServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();//.substring(6);
		//PrintWriter pw = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher(PREFIX + uri + SUFIX);
		rd.forward(request, response);
		//pw.println(uri);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if("mamber/insert".equals(uri)) {
			
		}
		doGet(request, response);
	}

}
