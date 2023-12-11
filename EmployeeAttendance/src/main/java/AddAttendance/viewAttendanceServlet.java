package AddAttendance;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewAttendanceServlet")
public class viewAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String EmpID = request.getParameter("id");
		String date = request.getParameter("date");
		
		try {
			List <attendance> attDetails = EmployeeDBUtill.validate(EmpID, date);
			request.setAttribute("attDetails", attDetails);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("attendanceView.jsp");
		dis.forward(request, response);
	}

}
