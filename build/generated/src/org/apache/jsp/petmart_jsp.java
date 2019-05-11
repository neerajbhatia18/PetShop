package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class petmart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Pet Shop | PetMart</title>\r\n");
      out.write("<meta charset=\"iso-8859-1\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<!--[if IE 6]><link href=\"css/ie6.css\" rel=\"stylesheet\" type=\"text/css\"><![endif]-->\r\n");
      out.write("<!--[if IE 7]><link href=\"css/ie7.css\" rel=\"stylesheet\" type=\"text/css\"><![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\"> <a href=\"#\" id=\"logo\"><img src=\"images/logo.gif\" width=\"310\" height=\"114\" alt=\"\"></a>\r\n");
      out.write("  <ul class=\"navigation\">\r\n");
      out.write("    <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("    <li class=\"active\"><a href=\"petmart.html\">PetMart</a></li>\r\n");
      out.write("    <li><a href=\"about.html\">About us</a></li>\r\n");
      out.write("    <li><a href=\"petguide.html\">PetGuide</a></li>\r\n");
      out.write("    <li><a href=\"contact.html\">Contact us</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("  <div id=\"content\">\r\n");
      out.write("    <div class=\"search\">\r\n");
      out.write("      <input type=\"text\" name=\"s\" value=\"Find\">\r\n");
      out.write("      <button>&nbsp;</button>\r\n");
      out.write("      <label for=\"articles\">\r\n");
      out.write("        <input type=\"radio\" id=\"articles\">\r\n");
      out.write("        Articles</label>\r\n");
      out.write("      <label for=\"products\">\r\n");
      out.write("        <input type=\"radio\" id=\"products\" checked>\r\n");
      out.write("        PetMart Products</label>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("      <ul>\r\n");
      out.write("      \t<li> <a href=\"#\"><img src=\"images/cat3.jpg\" width=\"140\" height=\"250\" alt=\"\"></a>\r\n");
      out.write("          <h2>Animals</h2>\r\n");
      out.write("          <span><a href=\"#\">Dogs</a></span> <span><a href=\"#\">Fishes</a></span> <span><a href=\"#\">Cats</a></span> <span><a href=\"#\">Birds</a></span> <span><a href=\"#\"></a></span> <span><a href=\"#\"></a></span> <span><a href=\"#\"></a></span><span><a href=\"#\">Reptiles</a></span> <span><a href=\"#\">Small Pet</a></span> <span><a href=\"#\">Large Pet</a></span></li></li>\r\n");
      out.write("        <li> <a href=\"#\"><img src=\"images/koi2.jpg\" width=\"140\" height=\"250\" alt=\"\"></a>\r\n");
      out.write("          <h2>Food Area</h2>\r\n");
      out.write("          <span><a href=\"#\">Dog Food</a></span> <span><a href=\"#\">Cat Food</a></span> <span><a href=\"#\">Bird Food</a></span> <span><a href=\"#\">Fish Food</a></span> <span><a href=\"#\">Reptile Food</a></span> <span><a href=\"#\">Small Pet Food</a></span> <span><a href=\"#\">Large Pet Food</a></span></li>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <li> <a href=\"#\"><img src=\"images/bird-in-cage.jpg\" width=\"140\" height=\"250\" alt=\"\"></a>\r\n");
      out.write("          <h2>Travel Essentials</h2>\r\n");
      out.write("          <span><a href=\"#\">Car Barriers</a></span> <span><a href=\"#\">Car Seat Covers</a></span> <span><a href=\"#\">Car Seats</a></span> <span><a href=\"#\">ramps</a></span> <span><a href=\"#\">Seat Belts & Harnesses</a></span> <span><a href=\"#\">Strollers</a></span> <span><a href=\"#\">Travel Creates & Carrier</a></span>  </li>\r\n");
      out.write("        <li> <a href=\"#\"><img src=\"images/puppy3.jpg\" width=\"140\" height=\"240\" alt=\"\"></a>\r\n");
      out.write("          <h2>Grooming</h2>\r\n");
      out.write("          <span><a href=\"#\">Brushes & Combs</a></span> <span><a href=\"#\">Deodorizers</a></span> <span><a href=\"#\">Cologne</a></span> <span><a href=\"#\">Ear & Eya Cleaners</a></span> <span><a href=\"#\">Nail Clippers</a></span> <span><a href=\"#\">Shampoo</a></span> <span><a href=\"#\">Conditioners</a></span> <span><a href=\"#\">Shed Controls</a></span></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"sidebar\"> <a href=\"#\"><img src=\"images/discount.jpg\" width=\"300\" height=\"790\" alt=\"\"></a> </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"featured\">\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"#\"><img src=\"images/organic-and-chemical-free.jpg\" width=\"300\" height=\"90\" alt=\"\"></a></li>\r\n");
      out.write("      <li><a href=\"#\"><img src=\"images/good-food.jpg\" width=\"300\" height=\"90\" alt=\"\"></a></li>\r\n");
      out.write("     \r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("  \r\n");
      out.write("  <div id=\"footnote\">\r\n");
      out.write("    <div class=\"section\">Copyright@PetMart.All rights reserved </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
