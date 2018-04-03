
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NumberCheckFilter implements Filter
{

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Number check filter invoked");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
        
        String phone = request.getParameter("phone");
        
        try
        {
            int phoneNumber = Integer.parseInt(phone);
            System.out.println("Passed filter 2");
            chain.doFilter(request, response);
            System.out.println("After filter 2");
        }
        catch(NumberFormatException ne)
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    public void destroy() {
        System.out.println("Number check filter destroyed");
    }
    
}
