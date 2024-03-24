angka = float(input("Masukkan angka yang Anda inginkan : "))

# if-else if-else untuk cek angka merupakan bilangan ganjil atau genap
if angka % 2 == 0:
    print ("Angka yang Anda masukkan merupakan bilangan Genap yaitu %s" %angka)
elif angka % 2 == 1:
    print ("Angka yang Anda masukkan merupakan bilangan Ganjil yaitu %s" %angka)
else:
    print ("Angka yang Anda masukkan bukan bilangan Bulat yaitu %s" %angka)