package sample.gradle.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import sample.gradle.api.SampleService;
import sample.gradle.impl.SampleImpl;
import sample.gradle.util.Logger;

public class SampleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        Logger.log("doGet() method");
        final SampleService service = new SampleImpl();

        final PrintWriter out = response.getWriter();
        out.println(service.sayHello());
    }
}