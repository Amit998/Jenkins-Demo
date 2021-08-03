<%@page import="springmvc.model.Calculator"%>
<%@page import="org.springframework.ui.Model"%>
<%@page isELIgnored="false" %>


<%



String isEmpty=(String) request.getAttribute("isEmpty");


String errMsg=(String) request.getAttribute("errMsg");

Double result1=(Double) request.getAttribute("calculatedValue");


%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Contact</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    

</head>
<body>


    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Assignment</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <ul class="nav navbar-nav">



                         <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                        <li class="nav-item">
                            <a class="nav-link" href="calculate">Calculator</a>
                        </li>
                    </ul>

                </div>
            </div>
        </div>
    </nav>



    <div class="container body-content">
    
    <h3 class="text-center">Calculator</h3>
    
 
    
    <% if( isEmpty=="true" ){%>
   		<div class="alert alert-danger" role="alert">
  			<%=errMsg %>
		</div>
    <%} %>
    
    
    
    
    <form action="calculate" method="post">
	
	<div class="mb-3">
	    <label for="exampleInputName" class="form-label">First Number</label>
	    <input min=0 type="number" class="form-control" id="num1" name="fNumber">
	    
	  </div>
	  <div class="mb-3">
	    <label for="exampleInputEmail1" class="form-label">Second Number</label>
	    <input min=0 type="number" class="form-control" id=num2 name="sNumber">
	    
	  </div>
	  
	 
	   
	  <button type="submit" class="btn btn-success" name="btn" value="+" id="add">+</button>
	  <button type="submit" class="btn btn-success" name="btn"  value="-" id="sub">-</button>
	  <button type="submit" class="btn btn-success" name="btn"  value="/" id="div">/</button>
	  <button type="submit" class="btn btn-success" name="btn"  value="*" id="mul">*</button>
	
	
	</form>
	
	
	

    <% if(result1 != null){%>
    	<h1>Reuslt is <%=result1 %></h1>
    <%} %>
    </div>
    
   





    <footer class="page-footer font-small" style="background-color:black; color:snow;">

        <!-- Copyright -->
        <div class="footer-copyright text-center py-3">
            © 2021 Copyright:
            <a href="#" style="color:snow;">Amit Dutta</a>
        </div>
        <!-- Copyright -->

    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>




</body>
</html>