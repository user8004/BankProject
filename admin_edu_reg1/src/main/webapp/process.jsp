<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
           Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/admin","postgres","Root9935");
           Statement st=conn.createStatement();
           
           if(conn != null)
           {
        	   System.out.println("Connection>>>>>");
           } else{
        	   
        	   System.out.println("Connection fail>>>>");
           }        //
          int i=st.executeUpdate("insert into registration(firstname,lastname,emailaddress,mobnumber,address1,address2,city,state,zipcode)values('"+firstname+"','"+lastname+"','"+emailaddress+"','"+mobnumber+"','"+address1+"','"+address2+"','"+city+"','"+state+"','"+zipcode+"')");
                System.out.println("Success");
         
            
            
             conn.close();
        }

catch(Exception e)
        {
        System.out.print(e);
        e.printStackTrace();
        }

 %>
 
 