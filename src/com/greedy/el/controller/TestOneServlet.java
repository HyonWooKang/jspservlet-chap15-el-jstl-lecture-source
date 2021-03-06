package com.greedy.el.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestOneServlet
 */
@WebServlet("/test1")
public class TestOneServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("name", "홍길동");
		request.setAttribute("age", new Integer(20));
		request.setAttribute("phone", "010-1234-5678");
		
		/* (가장 흔한 방법: controller ) 데이터 받아서 다른 jsp로 전달 */
		List<String> items = new ArrayList<>();
		items.add(new String("apple"));
		items.add(new String("banana"));
		items.add(new String("melon"));
		
		request.setAttribute("items", items);
		
		/* Forward 처리 */
		RequestDispatcher view = request.getRequestDispatcher("views/el/testEl1.jsp");
		view.forward(request, response);
		
	}

}
