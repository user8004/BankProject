package springJdbc;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection 
{
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String username;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;

	public void display()
	{
		System.out.println(url+" is url"+username+"is the username" +password+ "is the password" +driver+ "is the driver");
	}
}
