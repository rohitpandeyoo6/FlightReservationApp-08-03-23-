<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details</h2>
Flight Number: ${flight.flightNumber}<br>
Operating Airlines: ${flight.operatingAirlines}<br>
Departure City: ${flight.departureCity}<br>
Arrival City: ${flight.arrivalCity}<br>
Departure Date: ${flight.dateOfDeparture}<br>
<h2>Enter passenger Details</h2>
<form action="confirmReservation" method="post">

<pre>
first name <input type="text" name="firstName">
middle name <input type="text" name="middleName">
last name <input type="text" name="lastName">
email <input type="text" name="email">
phone <input type="text" name="phone">
<input type="hidden" name="flightId" value="${flight.id}">
<h2>Enter the payment details</h2>
Name:<input type="text" name="name">
Card Number:<input type="text" name="cardNumber">
cvv code:<input type="text" name="cvvCode">
Expiry Date:<input type="text" name="expiryDate">
<input type="submit" value="complete reservation">
</pre>

</form>
</body>
</html>