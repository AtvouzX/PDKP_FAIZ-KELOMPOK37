umur = int(input("Masukkan umur : "))
if umur  == 0:
    print ("Umur tidak valid")
elif umur <= 5:
    print ("balita")
elif umur <= 13:
    print ("anak-anak")
elif umur <= 20:
    print ("remaja")
elif umur <= 60:
    print ("dewasa")
else:
    print ("lansia")