package com.greedy.el.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.greedy.el.model.dto.MemberDTO;

/**
 * Servlet implementation class TestFourServlet
 */
@WebServlet("/test4")
public class TestFourServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MemberDTO requestMember = new MemberDTO("홍길동",20,"010-1234-5678","hong@greedy.com");
		MemberDTO sessionMember = new MemberDTO("유승제",20,"010-5678-1234","ysj@greedy.com");
		
		HttpSession session = request.getSession(); // session ID를 가지고 있다/
		
		// session이 request보다 더 상위, 넓은 개념이기 때문에 request를 어떤 방법으로 보내도
		// request에 이미 session 값이 들어가 있고 함께 전달된다.
		// Servlet 전달방식 2가지: forward, sendRedirect
		request.setAttribute("member", requestMember);
		session.setAttribute("member", sessionMember);
		
		RequestDispatcher view = request.getRequestDispatcher("views/el/testEl4.jsp");
		view.forward(request, response);
		
	}

}
