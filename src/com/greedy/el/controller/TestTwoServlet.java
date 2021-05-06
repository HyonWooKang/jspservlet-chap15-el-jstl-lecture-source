package com.greedy.el.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.greedy.el.model.dto.MemberDTO;

/**
 * Servlet implementation class TestTwoServlet
 */
@WebServlet("/test2")
public class TestTwoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("test2 Servlet 동작 확인용");
		
		// id, pw 받음 --> 정보를 조회 --> 한 사용자 정보 --> 출력 페이지로 전달
		MemberDTO member = new MemberDTO("홍길동",20,"010-1234-5678","hong@greedy.com");
		
		request.setAttribute("member", member);
		
		// forward 방식으로 전달
		RequestDispatcher view = request.getRequestDispatcher("views/el/testEl2.jsp");
		view.forward(request, response);
		
		
	}

}
