package chapter11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns={"/chapter11/Count-Thread"})
public class CountThread extends HttpServlet {
	int count;

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);

		int i=count;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		count=i+1;
		out.println(count);

		Page.footer(out);
	}
}
