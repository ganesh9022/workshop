<?php
	
	session_start();
	
	
	unset($_SESSION['SESS_MEMBER_ID']);
	unset($_SESSION['SESS_FIRST_NAME']);
	unset($_SESSION['SESS_LAST_NAME']);
?>
<html>
<head>
<title>
HOSTEL PORTAL
</title>
<style>
.head{
	font:bold;
	width;20;
}
	</style>
<!-- <header class="head"><h2>HOSTLE PORTAL<h2></header> -->
    <link rel="shortcut icon" href="main/images/pos.jpg">

  <link href="main/css/bootstrap.css" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="main/css/DT_bootstrap.css">
  
  <link rel="stylesheet" href="main/css/font-awesome.min.css">
    <style type="text/css">
      body {
		background-color : #D6ACE6;
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }
    </style>
    <link href="main/css/bootstrap-responsive.css" rel="stylesheet">

<link href="style.css" media="screen" rel="stylesheet" type="text/css" />
</head>
<body style=" background:url(img/hostel.jpg); background-size:cover;">
    <div class="container-fluid">
      <div class="row-fluid">
		<div class="span4">
		</div>
	
</div>

<div id="login" >

<?php
if( isset($_SESSION['ERRMSG_ARR']) && is_array($_SESSION['ERRMSG_ARR']) && count($_SESSION['ERRMSG_ARR']) >0 ) {
	foreach($_SESSION['ERRMSG_ARR'] as $msg) {
		echo '<div style="color: red; text-align: center;">',$msg,'</div><br>'; 
	}
	unset($_SESSION['ERRMSG_ARR']);
}
?>
<form action="login.php" method="post">

			<font style=" font:bold 44px 'Aleo'; color:#fff;"><center>ADMIN LOGIN</center></font>
		<br>

		
<div class="input-prepend">
		<input style="height:40px;" type="text" name="username" Placeholder="Username" required/><br>
</div>
		<div class="input-prepend">
			<input type="password" style="height:40px;" name="password" Placeholder="Password" required/><br>
		</div>
		<br>
		<div class="qwe">
		 <button class="btn btn-large btn-primary btn-block pull-right" href="dashboard.html" type="submit"><i class="icon-signin icon-large"></i>Login</button><br><br>
</div>
		 </form><button class="btn btn-large btn-primary "><a href="user.php">User Login</a></button>
</div>
</div>
<style>
	.copyright-agileinfo{
		text-align: center;
		margin-top: 300px;
		color: white;
	}
</style>
<footer >
        <p class="copyright-agileinfo"> &copy; 2023 Hostel Portal Project. All Rights Reserved | Design by <a href="https://www.linkedin.com/in/ritesh-jadhav-289026206/">Ritesh-Aditya-Ganesh-Mahesh</a></p>
    </footer>
</div>

</div>

</body>
</html>