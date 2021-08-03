<%@page import="org.springframework.ui.Model"%>
<%@page isELIgnored="false" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <title>Home Page</title>
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
                            <a class="nav-link" href="calculate" id="calBtn">Calculator</a>
                        </li>

                       
                    </ul>

                </div>
            </div>
        </div>
    </nav>



    <div class="container body-content">
    
    <h1 class="text-center">Home Page</h1>
    
    
  
  <div class="cover-container d-flex h-100 p-3 mx-auto flex-column">
    

    <main role="main" class="inner cover">
        <h1 class="cover-heading">Cover your page.</h1>
        <p class="lead">Cover is a one-page template for building simple and beautiful home pages. Download, edit the text, and add your own fullscreen background photo to make it your own.</p>
        <p class="lead">
            <a href="#" class="btn btn-lg btn-secondary">Learn more</a>
        </p>
    </main>
</div>
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