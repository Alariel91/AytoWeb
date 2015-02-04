package es.open4job.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.AparcamientoPDVO;
import dao.AparcamientoPD_DAO;

/**
 * Servlet implementation class ServletSesion2
 */
public class ServletSesion2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSesion2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		int id = ((Integer) session.getAttribute("id"));

		AparcamientoPD_DAO daoObj=new AparcamientoPD_DAO();
		
		AparcamientoPDVO aparcamiento=new AparcamientoPDVO();
		aparcamiento=daoObj.getAparcamientoPDbyId(id);
		
		session.setAttribute("aparcamiento", aparcamiento);
		
		request.getRequestDispatcher("MostrarDatos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
