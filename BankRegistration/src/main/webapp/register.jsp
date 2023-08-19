<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*,java.util.*,com.pgcon.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	Long mobileNo=Long.parseLong(request.getParameter("mobileNo"));
	String userName=request.getParameter("userName");
	String password=request.getParameter("password");
	Long amount=Long.parseLong(request.getParameter("amount"));
%>

<%=name %>
<%=address %>
<%=mobileNo %>
<%=password %>
<%=amount %>

<%
	Connection con=null;
	Connect ob=new Connect();
	con=ob.getConnect();
	

	if(con!=null)
	{
		String q1=" insert into registration_form (name,address,mobile_no,acct_no,user_name,password,amout) values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(q1);
		ps.setString(1, name);
		ps.setString(2, address);
		ps.setLong(3, mobileNo);
		ps.setLong(4, 1234); 
		ps.setString(5, userName);
		ps.setString(6, password);
		ps.setLong(7, amount);
		
		ps.executeUpdate();
		out.println("data has been inserted");
	 }
	else
	{
		out.println("not connected");
	}
%>
</body>
</html>