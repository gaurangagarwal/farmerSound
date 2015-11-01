<?php
 echo 'heloo';
if($_GET['date'])
{

$date=$_GET['date'];

mysql_connect("localhost", "root", "") OR die (mysql_error());
  mysql_select_db ("sound") or die(mysql_error());

$state = "Gujarat Telecom Circle";
$query= "SELECT * FROM FMLINKS WHERE date= '$date' AND state= '$state';

$result = mysql_query($query) or die (mysql_error());


$links =array('link1' => $result=>link1 ,
        'link2' => $result=>link2
        );
    array_push($json, $links);


$jsonstring = json_encode($json);
echo $jsonstring;

}
?>
