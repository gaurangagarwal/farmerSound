<?php 

$p1= array();
$p1 = $_GET["digits"];

  
$yyyy=substr($p1,1,4);
$mm=substr($p1,5,2);
$dd=substr($p1,7,2);

$date=$yyyy."/".$mm."/".$dd;

$number= $_GET["From"];
$exotel_sid = "inout2alpha"; 
$exotel_token = "7fc77ef3c238053acbb9869cbf072c489ac01163"; 
 
//$url = "https://$exotel_sid:$exotel_token@twilix.exotel.in/v1/Accounts/$exotel_sid/Numbers/$number";
mysql_connect("localhost", "root", "") OR die (mysql_error());
  mysql_select_db ("sound") or die(mysql_error());
$type=1;
$state="Gujarat Telecom Circle";
  $query = "SELECT * FROM FMLINKS WHERE date='$date' AND type = '$type' AND state= '$state'";

  $result = mysql_query($query) or die (mysql_error());
  

  if($result) 
   {    
      echo $result['summary'];
}
   else
     { 
       echo "No result";  
     }
 ?>
