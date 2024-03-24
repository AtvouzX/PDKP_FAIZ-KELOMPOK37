<?php
//ini return type
function hitung ($bil1, $bil2) {
return $bil1 + $bil2 * $bil2;
}

$bil1 = 7;
$bil2 = 8;
$hasil = hitung($bil1, $bil2);
echo "ini dikerjakan oleh function hitung <br>";
echo "angka yang akan dihitung adalah $bil1 dan $bil2 <br>";
echo "hasil hitung menggunakan function hitung yaitu : $hasil";

echo "<hr>";

//ini non return type
function hitung2 ($bil1, $bil2) {
    $hasil = hitung($bil1, $bil2);
    echo "angka yang akan dihitung adalah $bil1 dan $bil2 <br>";
    echo "hasil hitung menggunakan function hitung yaitu : $hasil";		
    }
    
    echo "ini dikerjakan oleh function hitung2 <br>";
    hitung2($bil1, $bil2);
    