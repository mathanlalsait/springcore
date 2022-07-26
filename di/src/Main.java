import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		
		MySpringBeanWithDependency test = (MySpringBeanWithDependency) context
				.getBean("nwriter");
		
		IWriter iw=test.getWritermem();
		iw.writer("hai");
		
	}
}

