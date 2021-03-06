package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Usuario;


public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.getRequestDispatcher("home.html").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Usuario user = new Usuario(request.getParameter("nome"), request.getParameter("email"), request.getParameter("senha"));
		
		PrintWriter out = response.getWriter();

		out.println(
				"<!DOCTYPE html>" + 
				"<html>" + 
				"<head>" + 
				"<meta charset='ISO-8859-1'>" + 
				"<title>App2021 - Carlos</title>" + 
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">" + 
				"</head>" + 
				"<body>" + 
				"	<div class=\"container\">" + 
				"		<form action=\"usuario\" method=\"get\">" + 
				"			<h3>Aluno "+ user.getNome() + " (" + user.getEmail() + ") cadastrado com sucesso!!!</h3>" + 
				"			<button class=\"btn btn-primary\" type=\"submit\">Voltar</button>" + 
				"		</form>"); 
	}
}
