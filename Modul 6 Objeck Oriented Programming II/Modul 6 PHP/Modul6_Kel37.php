<?php
class PemainBola {
    private $nama;
    private $club;
    private $posisi;    

    public function __construct($nama, $club, $posisi){
    $this->nama = $nama;
    $this->club = $club;
    $this->posisi = $posisi;
    }

    public function setClub($clubBaru){
    $this->club = $clubBaru;
    }

    public function setPosisi($posisiBaru){
    $this->posisi = $posisiBaru;
    }

    public function getNama(){
    return $this->nama;
    }

    public function getClub(){
    return $this->club;
    }

    public function getPosisi(){
    return $this->posisi;
    }
}

$mangeak = new PemainBola("Cristian Ronaldo Siuuuuuu", "Manchester United", "Striker");

echo "-- Tahun 2023 -- <br>";
echo $mangeak->getNama() . "<br>";
echo $mangeak->getClub() . "<br>";
echo $mangeak->getPosisi() . "<br>";

$mangeak->setClub("Al-Nasr");
$mangeak->setPosisi("Kiper");

echo "-- Tahun 2024 -- <br>";
echo $mangeak->getNama() . "<br>";
echo $mangeak->getClub() . "<br>";
echo $mangeak->getPosisi() . "<br>";

?>
