package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {

    private int parseParam(String s, int def) {
        try { return Integer.parseInt(s); } catch (Exception e) { return def; }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int a = parseParam(req.getParameter("a"), 2);
        int b = parseParam(req.getParameter("b"), 3);

        Calculator calc = new Calculator();
        int sum = calc.add(a, b);
        int diff = calc.subtract(a, b);

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!doctype html><html><head><meta charset='utf-8'><title>Calculator</title></head><body>");
            out.println("<h1>Calculator Servlet</h1>");
            out.printf("<p>%d + %d = %d</p>%n", a, b, sum);
            out.printf("<p>%d - %d = %d</p>%n", a, b, diff);
            out.println("<p>Usage example: <a href=\"/myapp/calc?a=5&b=4\">/myapp/calc?a=5&b=4</a></p>");
            out.println("</body></html>");
        }
    }
}
