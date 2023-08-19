package springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		System.out.println("running config");
		JDBCConnection connection =context.getBean("connection",JDBCConnection.class);
		connection.display();

	}

}
