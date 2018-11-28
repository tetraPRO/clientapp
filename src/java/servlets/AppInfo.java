
package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.DAO;
import utils.DBUtils;

/**
 *
 * @author philip
 */
public class AppInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        /**
         * Collect all the parameters as strings
         */
        String firstName = request.getParameter("firstName");
        String middleInitial = request.getParameter("middle");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String aptNum = request.getParameter("aptNum");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String phone = request.getParameter("phone");
        String social = request.getParameter("socialNum");
        String dateOfBirth = request.getParameter("birthDate");
        String isSelf = request.getParameter("self");
        String sex = request.getParameter("sex");

        if(isSelf.equals("self")){
            isSelf = "true";
        }

        //sets the parameters to pass through
        //to the proper handler 
        String[] params = new String[13];
        params[0] = firstName;
        params[1] = middleInitial;
        params[2] = lastName;
        params[3] = address;    
        params[4] = city;
        params[5] = state;    
        params[6] = phone;
        params[7] = social;
        params[8] = dateOfBirth;
        params[9] = isSelf;
        params[10] = sex;
        params[11] = zip;
        params[12] = aptNum;

        //Connects to database
        DBUtils connect = new DBUtils();
        connect.getConnected();
        
        if(connect.isConnected()){
            DAO dao = new DAO();
            
            //create table if not alread exists
            dao.setStatment("home/philip/NetBeansProjects/ClientApp/src/java/sql/CreateTableApplicant.sql");
            dao.runSQL();
            
            /**
             * this is a **bug** that needs to be addressed!***
             * the path should be a relative path that is local
             * to the program NOT the users complete path
             */
            dao.setStatment("/home/philip/NetBeansProjects/ClientApp/src/java/sql/InsertApplicant.sql");
            dao.setData(params);            
            dao.runSQL();
            /**
             * at this point in the program the data 
             * should(if it worked correctly) be
             * successfully saved in the database
             */
            
            request.setAttribute("data", params);
            RequestDispatcher dispatcher = request.getRequestDispatcher("appInfo.jsp");
            dispatcher.forward(request, response);
            
        }

     }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
