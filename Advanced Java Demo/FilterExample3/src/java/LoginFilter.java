
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter
{
    public void init(FilterConfig filterConfig) throws ServletException 
    {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
        String name = request.getParameter("name");
        if( name.equals("")||name.isEmpty())
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    public void destroy() {
    }
    
}
