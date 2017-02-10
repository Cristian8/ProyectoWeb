package web.proyecto;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContadorPagina
 */
@WebServlet("/ContadorWeb")
public class ContadorWeb extends HttpServlet {
	private int contador = 0;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContadorWeb() {
		super();
       
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//PrintWriter pw = response.getWriter();
		//pw.write(contador);
		//pw.write("Visitas a la Pagina: " + contador);
		response.getWriter().append("Visitas a la pagina: " +contador);
		System.out.println("Visitas a la Pagina: " + contador);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		System.out.println("Visitas a la Pagina: " + contador);
	}

	@Override
	public void init() throws ServletException {
		contador = 0;
		super.init();
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		contador++;

		super.service(arg0, arg1);
	}
}
