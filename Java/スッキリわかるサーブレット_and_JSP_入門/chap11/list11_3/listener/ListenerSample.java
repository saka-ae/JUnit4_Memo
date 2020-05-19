package chap11.list11_3.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerSample implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { }

    public void contextInitialized(ServletContextEvent arg0)  {
    	Integer count = 0;

    	ServletContext context = arg0.getServletContext();
    	context.setAttribute("count", count);
    }

}
