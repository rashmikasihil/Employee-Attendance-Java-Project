package AddAttendance;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddAttendanceServlet")
public class AddAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddAttendanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String EmpID = request.getParameter("id");
		String Date = request.getParameter("date");
		String firstHalf = request.getParameter("fh");
		String secondHalf = request.getParameter("sh");
		
		boolean isTrue;
		
		isTrue = EmployeeDBUtill.addAttendance(EmpID, Date, firstHalf, secondHalf);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis1 = request.getRequestDispatcher("unsuccess.jsp");
			dis1.forward(request, response);
		}
	}

}
