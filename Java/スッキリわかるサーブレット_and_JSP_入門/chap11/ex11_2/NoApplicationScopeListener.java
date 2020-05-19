package chap11.ex11_2;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class NoApplicationScopeListener implements ServletContextAttributeListener {

    public void attributeAdded(ServletContextAttributeEvent arg0)  {
    	System.out.println("アプリケーションスコープの利用は禁止されている");
    }

    public void attributeRemoved(ServletContextAttributeEvent arg0)  { }

    public void attributeReplaced(ServletContextAttributeEvent arg0)  { }

}
