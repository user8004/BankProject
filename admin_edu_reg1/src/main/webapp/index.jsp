<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<body>
<form method="post" action="process.jsp">
First name:<br>
<input type="text" name="firstname">
<br>
Last name:<br>
<input type="text" name="lastname">
<br>
<br>
Email Id:<br>
<input type="email" name="emailaddress">
<br>
<br>
MobileNumber:<br>
<input type="text" name="mobnumber">
<br>

Address1:<br>
<input type="text" name="address1">
<br>
Address2:<br>
<input type="text" name="address2">
<br>
City name:<br>
<input type="text" name="city">
<br>




State:<br>
<select name="state" style="width:155px">
<option>Andhra_Pradesh</option>
<option>Bihar</option>
<option>Arunachal_Pradesh</option>
<option>Goa</option>
<option>Gujarat</option>
<option>others</option>
</select>
<br>

zip_code:<br>
<input type="text" name="zipcode">
<br>

<input type="submit" value="submit">
</form>
</body>
</html>



