package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * Servlet implementation class FormData
 */
@WebServlet(description = "to capture username and age", urlPatterns = { "/acceptdata" })
public class FormData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String user=request.getParameter("user");
		String age=request.getParameter("age");
		PrintWriter out=response.getWriter();
		out.print(" user name is " + user + " and age is " + age);
		//connect to DB
		Connection conn;
		PreparedStatement prp;
		String qry="insert into studData values(?,?)";
		MysqlDataSource ds= new MysqlDataSource();
		ds.setUser("root");
		ds.setPassword("pass1010");
		ds.setDatabaseName("nikhil");
		ds.setServerName("localhost");
		ds.setPortNumber(3306);
		try {
		conn=ds.getConnection();
		prp=conn.prepareStatement(qry);
		prp.setString(1, user);
		prp.setInt(2,Integer.parseInt(age));
		prp.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
