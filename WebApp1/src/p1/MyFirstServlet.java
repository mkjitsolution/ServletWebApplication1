package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ....www.abc.com/MyFirstServlet
public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html"); // inform to browser about incoming data
		PrintWriter out = resp.getWriter();

		String username = req.getParameter("username");
		String gender = req.getParameter("gender");
		String suffix = "";
		String color = "";

		if (gender.equals("male"))
			{suffix = "Mr. ";
			color="blue";
			}
		else
		{
			suffix = "Miss";
			color="pink";
		}
		out.print("<html><body style='background-color: "+color+"'>");
		out.print("Hello <b>" + suffix + " " + username + "</b>");
		out.print("Gender " + gender);
		out.print("<br/>Hello");
		out.print("<H3>Hello</H3>");
		out.print("<u><i>Hello</i></u>");
		out.print("</body></html>");
		

	}

}// end class
