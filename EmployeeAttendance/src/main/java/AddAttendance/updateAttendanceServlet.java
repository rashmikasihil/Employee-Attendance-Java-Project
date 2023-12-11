package AddAttendance;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateAttendanceServlet")
public class updateAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public updateAttendanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String EmpID = request.getParameter("id");
		String Date = request.getParameter("date");
		String firstHalf = request.getParameter("fh");
		String secondHalf = request.getParameter("sh");
		
		boolean isTrue;
		
		isTrue = EmployeeDBUtill.updateAttendance(EmpID, Date, firstHalf, secondHalf);
		
		if(isTrue == true) {
			
			List<attendance> attDetails = EmployeeDBUtill.getAttendanceDetails(EmpID, Date);
			request.setAttribute("attDetails", attDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("attendanceView.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis1 = request.getRequestDispatcher("unsuccess.jsp");
			dis1.forward(request, response);
		}
	}

}
