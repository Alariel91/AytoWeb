package es.open4job.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.AparcamientoPDVO;
import dao.AparcamientoPD_DAO;

/**
 * Servlet implementation class ServletAyto
 */
public class ServletAyto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAyto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt(request.getParameter("id"));
		AparcamientoPD_DAO daoObj=new AparcamientoPD_DAO();
		AparcamientoPDVO aparcamiento=new AparcamientoPDVO();
		aparcamiento=daoObj.getAparcamientoPDbyId(id);
		
		String idaparcamiento=String.valueOf(aparcamiento.getId());
		double latitud=aparcamiento.getLatitud();
		double longitud=aparcamiento.getLongitud();
		String titulo=aparcamiento.getTitulo();
		String icono=aparcamiento.getIcono();
		 
		PrintWriter out= response.getWriter();
		 out.println("<html>");
		 out.println("<body>");
		 out.println("<h1>Aparcamiento/h1>");
		 out.println("<h2> La id recibida es " +idaparcamiento+ "</h2>");
		 out.println("<h2> Latitud es " +latitud+ "</h2>");
		 out.println("<h2> Longitud es " +longitud+ "</h2>");
		 out.println("<h2> Titulo es " +titulo+ "</h2>");
		 out.println("<h2> EL icono es " +icono+ "</h2>");
		 out.println("</body>");
		 out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
