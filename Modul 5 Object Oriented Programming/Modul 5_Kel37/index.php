<?php
include("userService.php");

$user = new userService($_POST['email'], $_POST['password']);

if($get_user = $user->login()) {
    echo 'Selamat Datang '.$user->getRole();
    echo ', Masuk Sebagai email: '.$get_user;
} else {
    echo 'Invalid Login';
}
