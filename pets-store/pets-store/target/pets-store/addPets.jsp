<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fact Program</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height: 30px;background-color: aquamarine">
    <h3>Welcome to petsore!!!!!!!</h3>
</header>


<div class="container">
    <br/><br/><br/><br/>
    <img src="images/ndog.jpg" style="height: 200px;">
    <h4>Upload Petstore</h4>
    <form action="add-pets" method="Post">
        <div class="form-group">
            <label>Name:</label>
            <input type="text" class="form-control"  name="name" style="width: 400px;">
        </div>

        <div class="form-group">
            <label>Color:</label>
            <select name="color" class="form-control" style="width: 50%">
                <option>White</option>
                <option>Brown</option>
                <option>Purple</option>
                <option>Yellow</option>
            </select>
        </div>

        <div class="form-group">
            <label>Price:</label>
            <input type="text" class="form-control"  name="price" style="width: 400px;">
        </div>

        <button type="submit" name="btValue" value="login" class="btn btn-danger">Add Pet</button>
        <button type="clear" name="btValue" value="clear" class="btn btn-danger">Clear</button>
    </form>

    <br/><br/>

</div>


<footer style="height: 20px;background-color: darkcyan;margin-top: 500px;">
    @Copyright!!!!!!!!!!!!!!!
</footer>
</body>
</html>