package servlets;

import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Beneficiary extends HttpServlet {

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
         * Collect all parameters as strings from the
         * request object that is coming from the 
         */
        String firstName = request.getParameter("firstName");
        String middle = request.getParameter("middle");
        String lastName = request.getParameter("lastName");
        String relationship_owner = request.getParameter("relationship");
        String address = request.getParameter("address");
        String aptNum = request.getParameter("aptNum");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");        
        String phone = request.getParameter("phone");
        String fName2 = request.getParameter("firstNameContingent");
        String lName2 = request.getParameter("lastNameContingent");
        String relationContingent_owner = request.getParameter("relatContin_owner");
        
        String[] params = new String[13];
        params[0] = firstName;
        params[1] = middle;
        params[2] = lastName;
        params[3] = relationship_owner;
        params[4] = address;
        params[5] = aptNum;
        params[6] = city;
        params[7] = state;
        params[8] = zip;
        params[9] = phone;
        params[10] = fName2;
        params[11] = lName2;
        params[12] = relationContingent_owner;
        
        //Connects to database
        DBUtils connect = new DBUtils();
        connect.getConnected();
        
        if(connect.isConnected()){
            DAO dao = new DAO();
          
            //make tables if not already exist
            dao.setStatment("/home/philip/NetBeansProjects/ClientApp/src/java/sql/CreateTableBeneficiary.sql");
            dao.runSQL();
            
            /**
             * Bug here needs to be fixed!
             */           
            dao.setStatment("/home/philip/NetBeansProjects/ClientApp/src/java/sql/InsertBenefit.sql");
            dao.setData(params);            
            dao.runSQL();
            
            request.setAttribute("data", params);
            RequestDispatcher dispatcher = request.getRequestDispatcher("benefitInfo.jsp");
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
