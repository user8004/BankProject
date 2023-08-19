<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><center>Admin registration</center></h1>

<form action="process.jsp" method="post">

First name:<br>
<input type="text" name="firstname">
<br><br>

Last name:<br>
<input type="text" name="lastname">
</br><br>

Email address:
<input type="text" name="emailaddress">
<br><br>

mobile number:
<input type="text" name="mobnumber">
<br><br>

Address1:
<input type="text" name="address1">
<br><br>

Address2(optional):
<input type="text" name="address2">
<br><br>

city:
<input type="text" name="city">
<br><br>

state:
<label for="state">State</label>
<br><br>

<select id="country-state" name="state">
	<option value="AN">Andaman and Nicobar Island</option>
	<option value="AP">Andhra Pradesh</option>
	<option value="AS">Assam</option>
	<option value="BR">Bihar</option>
	<option value="CG">Chattisgarh</option>
	<option value="Goa">Goa</option>
	<option value="GJ">Gujarat</option>
	<option value="HR">Haryana</option>
	<option value="HP">Himachal Pradesh</option>
	<option value="JK">Jammu and Kashmir</option>
	<option value="JH">Jharkhand</option>
	<option value="KA">Karnataka</option>
	<option value="KL">Kerala</option>
	<option value="MP">Madhya Pradesh</option>
	<option value="MH">Maharashtra</option>
	<option value="MN">Manipur</option>
	<option value="ML">Meghalaya</option>
	<option value="MZ">Mizoram</option>
	<option value="NL">NagaLand</option>
	<option value="OR">Orissa</option>
	<option value="PB">Punjab</option>
	<option value="RJ">Rajasthan</option>
	<option value="SK">Sikkim</option>
	<option value="TN">Tamil Nadu</option>
	<option value="UK">Uttarakhand</option>
	<option value="UP">Uttar Pradesh</option>
	<option value="WB">West Bengal</option>
	<option value="TN">Tamil Nadu</option>
	<option value="TR">Tripura</option>
	<option value="CH">Chandigarh</option>
	<option value="DH">Dadra and Nagar Haveli</option>
	<option value="DD"">Daman and Diu</option>
	<option value="DL">Delhi</option>
	<option value="LK">Lakshdweep</option>
	<option value="PY">Pondicherry</option>
</select>
<br>

Zipcode:
<input type="text" name="zipcode">
<br><br>

<input type="submit" value="submit">
</form>

</body>
</html>