package storm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import storm.javaBean.StormBean;
import storm.service.StormService;

public class Myservlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String  method = request.getParameter("method");
		if(method!=null){
			
			list(request, response);
		}
	}
	public void list(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		StormService sto=new StormService();
		List<StormBean> list=sto.findAll();
		
//		for(StormBean s:list){
//			Double lat=s.getLng();
//			Double lng=s.getLat();
//			String address=s.getAddress();
//			request.setAttribute("lng", lng);
//			request.setAttribute("lat", lat);
//			request.setAttribute("address", address);
//			//request.getRequestDispatcher("index.jsp").forward(request, response);
//		}
		//request.setAttribute("StormList", list);	
		request.setAttribute("StormList", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
