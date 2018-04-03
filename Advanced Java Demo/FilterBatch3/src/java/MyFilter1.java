
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter1 implements Filter
{

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
    {
        String name = request.getParameter("name").trim();
        String pass = request.getParameter("pass").trim();
        
        if(name==null)
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if(name.equals("")||name.isEmpty())
        {
                 request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        else
        {
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
    }
    
}
