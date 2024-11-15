<!DOCTYPE html>
<html>
<head>
    <title>Theater Ticket Booking</title>
</head>
<body>
    <h1>Book Your Tickets</h1>
    <form action="BookTicket" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="show">Select Show:</label>
        <select id="show" name="show" required>
            <option value="morning">Morning Show</option>
            <option value="evening">Evening Show</option>
        </select><br><br>
        
        <button type="submit">Book Now</button>
    </form>
</body>
</html>
