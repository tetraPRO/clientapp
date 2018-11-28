package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class applicant_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AppInfo\" method=\"POST\">\n");
      out.write("    <center>\n");
      out.write("        <h1>Welcome to our simple 1 page app!</h1>\n");
      out.write("    <table border=\"0\" cellspacing=\"1\" cellpadding=\"1\">\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>First Name:</td>\n");
      out.write("                <td><input type=\"text\" name=\"firstName\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Last Name:</td>\n");
      out.write("                <td><input type=\"text\" name=\"lastName\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Address:</td>\n");
      out.write("                <td><input type=\"text\" name=\"address\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Apt. Number</td>\n");
      out.write("                <td><input type=\"text\" name=\"aptNum\" /></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>City:</td>\n");
      out.write("                <td><input type=\"text\" name=\"city\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>State:</td>\n");
      out.write("                <td><input type=\"text\" name=\"state\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Zipcode:</td>\n");
      out.write("                <td><input type=\"text\" name=\"zip\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Phone Number:</td>\n");
      out.write("                <td><input type=\"text\" name=\"phone\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Social Security:</td>\n");
      out.write("                <td><input type=\"text\" name=\"socialNum\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Date of Birth:</td>\n");
      out.write("                <td><input type=\"text\" name=\"birthDate\" required=\"true\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Relationship to Owner:</td>\n");
      out.write("                <td><input type=\"checkbox\" name=\"self\" value=\"self\"/>Self</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Sex:</td>\n");
      out.write("                <td><input type=\"checkbox\" name=\"sex\" value=\"male\"/>Male\n");
      out.write("                <input type=\"checkbox\" name=\"sex\" value=\"female\"/>Female</td>\n");
      out.write("            </tr>             \n");
      out.write("            <tr>\n");
      out.write("                 <td><input type=\"submit\" value=\"Got it!\"/></td>                            \n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("    </center>\n");
      out.write("</form>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
