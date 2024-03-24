<?php 

declare(strict_types=1);

//class pendefinisi method
class pendefinisi {

public function akar(float $angka) : float {
return sqrt($angka);
}

public function staysafe (string $noun1, string $noun2) {
echo "Jangan lupa cuci tangan dengan $noun1 dan $noun2";
}

}

//code pemanggil method

$angka = 64;
//$objek merupakan instance dari class pendefinisi
$objek = new pendefinisi(); 

// OOP pada PHP menggunakan -> bukan . 
echo "akar dari $angka adalah ".$objek -> akar($angka);
echo "<hr>";
$objek -> staysafe('air', 'sabun');
