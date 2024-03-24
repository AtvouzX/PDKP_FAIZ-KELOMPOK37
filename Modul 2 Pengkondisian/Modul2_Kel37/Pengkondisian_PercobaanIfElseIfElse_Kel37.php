<?php
    echo "<h2>pilih perguruan Tinggi negeri : </h2>";
    echo "1. UGM<br>";
    echo "2. UNDIP<br><hr>";

    $ptn = 2;
    if ($ptn==1){
        echo $ptn."<br>Universitas Gadjah Mada</br>";
    }
    else if( $ptn==2){
        echo $ptn."<br>Universitas Diponegoro</br>";
    }else{
        echo $ptn."<br>Bukan keduanya</br>";
        };
    echo "Program Selesai";
?>