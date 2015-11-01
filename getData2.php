<?php 


$para= array();
$para = $_GET["digits"];

for($i=1;$i<8;$i++)
  $p1=$p1.$para[$i];

$yyyy=substr($p1,0,4);
$mm=substr($p1,4,2);
$dd=substr($p1,6,2);






$number= $_GET["From"];


$exotel_sid = "inout2alpha"; 
$exotel_token = "7fc77ef3c238053acbb9869cbf072c489ac01163"; 
 
$url = "https://$exotel_sid:$exotel_token@twilix.exotel.in/v1/Accounts/$exotel_sid/Numbers/$number";
 
$ch = curl_init();
curl_setopt($ch, CURLOPT_VERBOSE, 1);
curl_setopt($ch, CURLOPT_URL, $url);
curl_setopt($ch, CURLOPT_POST, 1);
curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
curl_setopt($ch, CURLOPT_FAILONERROR, 0);
curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, 0);



$resp = curl_exec($curl);

$string_data = $resp;
$xml = simplexml_load_string($string_data);


$State=(string)$xml['CircleName'];

  mysql_connect("localhost", "root", "") OR die (mysql_error());
  mysql_select_db ("sound") or die(mysql_error());

$type=2;

$query = "SELECT * FROM FMLINKS WHERE date='$date' AND type = '$type' AND state= '$state'";

  $result = mysql_query($query) or die (mysql_error());
  
  header('Content-type:plain/text');
  if($result) 
   {    
      echo $result['summary'];
}
   else
     { 
       echo "No result";  
     }
 ?>

