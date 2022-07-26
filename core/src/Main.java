import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) 
	{

ApplicationContext bea=new FileSystemXmlApplicationContext("classpath:springconfig.xml");
 
		
 //XmlBeanFactory bea = new XmlBeanFactory(new ClassPathResource("springconfig.xml"));
		
		Student demo=(Student) bea.getBean("mybean");
		
		Student demo1 = (Student) bea.getBean("mybean");
		
		System.out.println(demo==demo1);
		
	System.out.println("-------------------");
		System.out.println(demo.getAge());
		System.out.println(demo1.getAge());
		
		demo1.setAge(55);
		
		System.out.println("-------------------");
		System.out.println(demo.getAge());
		System.out.println(demo1.getAge());
		
			Student demo3 = (Student) bea.getBean("mybean");
		
		System.out.println("-------------------");	

		
		System.out.println(demo3.getAge());

		System.out.println("-------------------");	
		System.out.println(demo.getAge());
		System.out.println(demo.getCompany());
		System.out.println(demo.getCourses());
		System.out.println(demo.getAddress().getStreet());
	}
}