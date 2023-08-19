<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%@page import="java.sql.*,java.util.*"%>

<%
String firstname=request.getparameter("firstname");
String lastname=request.getparameter("lastname");
String emailaddress=request.getparameter("emailaddress");
String mobnumber=request.getparameter("mobnumber");
String address1=request.getparameter("address1");
String address2=request.getparameter("address2");
String city=request.getparameter("city");
String state=request.getparameter("state");
String zipcode=request.getparameter("zipcode");

try
		{
           Class.forName("org.postgresql.Driver");
           Connection conn = DriverManager.getConnection("jdbc:postgres://localhost:5432/admin","postgres", "Root9935");
           String q1="insert into registration values(?,?,?,?,?,?,?,?,?)";
           PreparedStatement st=conn.prepareStatement(q1);
           
         	st.setString("firstname");
         	st.setString("lastname");
         	st.setString("emailaddress");
         	st.setString("mobnumber");
         	st.setString("address1");
         	st.setString("address2");
         	st.setString("city");
         	st.setString("state");
         	st.setString("zipcode"); 	
         	int i=st.executeUpdate();
            if(i>0)
            {
                System.out.println("Success");
            }
            else
            {
                System.out.println("Fail");
            }
            
            
            conn.close();
        }

catch(Exception e)
        {
        System.out.print(e);
        e.printStackTrace();
        }

 %>








