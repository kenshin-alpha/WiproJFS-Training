package BookShop.JFSBookShop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBook obj = context.getBean(MyBook.class);
        obj.show();
        obj.display();
        ((AbstractApplicationContext) context).close();
    }
}
