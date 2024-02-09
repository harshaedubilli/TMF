package banking.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import banking.DAO.UserDAO;
import banking.DTO.UserDTO;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		String fullname = request.getParameter("Fullname");
		String email = request.getParameter("EmailID");
		String mobileNo = request.getParameter("MobileNo");
		String address = request.getParameter("Address");
		
		UserDTO user = new UserDTO(username,password,fullname,email,mobileNo,address);
		UserDAO ud = new UserDAO();
		try {
			if(ud.insertUserDetails(user))
			{
				response.sendRedirect("Login.html");
			}
			else
			{
				response.sendRedirect("Registration.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
