/**
 * 
 */
package com.example.servlet;

import com.example.model.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * @author library
 *
 */
public class ColdDrinkSelect extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Cold Drink Color Page <br>");
		
		String str = request.getParameter("color");
		
		//ColdDrinksBrands b1 = new ColdDrinksBrands();u
		
		
		
		//List L2 = b1.getBrands(str);
		
	//	Iterator itr = L2.iterator();
		
		//while(itr.hasNext())
		//{
		//	pw.println("<br> You Selected : " + itr.next());
		//}
		
		
		
		//pw.println("<br> You Select : " + str );
		
		
		ColdDrinksBrands cdb = new ColdDrinksBrands();
		
		List L1 = cdb.getBrands(str);
		
		request.setAttribute("abc",L1);
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		
		rd.forward(request, response);
		
		
	}
	
	

}
