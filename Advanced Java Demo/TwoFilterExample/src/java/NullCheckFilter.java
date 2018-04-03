
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NullCheckFilter implements Filter
{

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
        String user = request.getParameter("user");
        String password = request.getParameter("pass");
        
        if(user!=null||user.equals(""))
        {
            System.out.println("Passed filter 1 ");
            chain.doFilter(request, response);
            System.out.println("After filter 1");
        }
        else
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    public void destroy() {
        System.out.println("Null check Filter Destroyed");
    }
    
}
