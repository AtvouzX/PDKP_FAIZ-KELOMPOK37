import datetime
import abc

class BukuAbstrak(abc.ABC):
    #Abstraction
    @abc.abstractmethod
    def get_judul(self):
        pass

    @abc.abstractmethod
    def get_penulis(self):
        pass

    @abc.abstractmethod
    def get_jumlah_halaman(self):
        pass
    
class Buku(BukuAbstrak):
    #Constructor
    def __init__(self, judul, penulis, jumlah_halaman):
        self.__judul = judul
        self.__penulis = penulis
        self.__jumlah_halaman = jumlah_halaman
        self.__status = "Tersedia"  # Default status buku

    # Setter dan Getter

    def set_judul(self, judul):
        self.__judul = judul
        
    def set_penulis(self, penulis):
        self.__penulis = penulis
        
    def set_jumlah_halaman(self, jumlah_halaman):
        self.__jumlah_halaman = jumlah_halaman

    def set_status(self, status):
        self.__status = status
        
    def get_judul(self):
        return self.__judul

    def get_penulis(self):
        return self.__penulis

    def get_jumlah_halaman(self):
        return self.__jumlah_halaman
    
    def get_status(self):
        return self.__status

# Inheritance
class Peminjaman(Buku):
    # Constructor
    def __init__(self, judul, penulis, jumlah_halaman, peminjam, tanggal_pinjam):
        super().__init__(judul, penulis, jumlah_halaman)
        self.__peminjam = peminjam
        self.__tanggal_pinjam = tanggal_pinjam
        self.set_status("Dipinjam")  # Ubah status buku menjadi "Dipinjam"

    # Getter dan Setter
    def get_peminjam(self):
        return self.__peminjam

    def set_peminjam(self, peminjam):
        self.__peminjam = peminjam

    def get_tanggal_pinjam(self):
        return self.__tanggal_pinjam

    def set_tanggal_pinjam(self, tanggal_pinjam):
        self.__tanggal_pinjam = tanggal_pinjam

    # Polymorphism
    def info_peminjaman(self):
        print(f"Judul Buku: {self.get_judul()}")
        print(f"Penulis: {self.get_penulis()}")
        print(f"Jumlah Halaman: {self.get_jumlah_halaman()}")
        print(f"Peminjam: {self.get_peminjam()}")
        print(f"Tanggal Peminjaman: {self.get_tanggal_pinjam().strftime('%Y-%m-%d')}")
        print(f"Status: {self.get_status()}")

daftar_buku = []
daftar_peminjaman = []

# Set buku default
buku1 = Buku("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 320)
buku2 = Buku("The Lord of the Rings", "J.R.R. Tolkien", 1178)
daftar_buku.append(buku1)
daftar_buku.append(buku2)

def menu():
    print("\nSistem Manajemen Perpustakaan Kelompok 37")
    print("1. Lihat Daftar Buku")
    print("2. Tambah Buku")
    print("3. Pinjam Buku")
    print("4. Lihat Daftar Peminjaman")
    print("5. Kembalikan Buku")
    print("6. Keluar")

    choice = input("Masukkan pilihan Anda: ")
    return choice

def lihat_daftar_buku():
    if not daftar_buku:
        print("\n=====Tidak ada buku tersedia.=====")
    else:
        print("\nDaftar Buku:")
        for i, buku in enumerate(daftar_buku, start=1):
            print(f"\n{i}.")
            print(f"Judul: {buku.get_judul()}")
            print(f"Penulis: {buku.get_penulis()}")
            print(f"Jumlah Halaman: {buku.get_jumlah_halaman()}")
            status = "Tersedia"
            for peminjaman in daftar_peminjaman:
                if peminjaman.get_judul() == buku.get_judul():
                    status = "Dipinjam"
                    break
            print(f"Status: {status}")

def tambah_buku():
    judul = input("Masukkan judul buku: ")
    penulis = input("Masukkan nama penulis: ")
    jumlah_halaman = int(input("Masukkan jumlah halaman: "))

    buku_baru = Buku(judul, penulis, jumlah_halaman)
    daftar_buku.append(buku_baru)

    print("\n=====Buku berhasil ditambahkan.=====")

def tambah_peminjaman():
    lihat_daftar_buku()
    pilihan_buku = int(input("\nMasukkan nomor buku yang ingin dipinjam: "))
    if pilihan_buku > 0 and pilihan_buku <= len(daftar_buku):
        buku_dipinjam = daftar_buku[pilihan_buku - 1]
        if buku_dipinjam.get_status() == "Tersedia":
            peminjam = input("Masukkan nama peminjam: ")
            tanggal_pinjam = datetime.datetime.now()

            peminjaman = Peminjaman(buku_dipinjam.get_judul(), buku_dipinjam.get_penulis(),
                                    buku_dipinjam.get_jumlah_halaman(), peminjam, tanggal_pinjam)
            daftar_peminjaman.append(peminjaman)
            buku_dipinjam.set_status("Dipinjam")

            print("\n=====Peminjaman buku berhasil ditambahkan.=====")
        else:
            print("\n=====Buku sedang dipinjam. Tidak dapat melakukan peminjaman.=====")
    else:
        print("\n=====Pilihan buku tidak valid.=====")

def lihat_daftar_peminjaman():
    if not daftar_peminjaman:
        print("\n=====Tidak ada data peminjaman.=====")
    else:
        print("\n=====Daftar Peminjaman=====")
        for i, peminjaman in enumerate(daftar_peminjaman, start=1):
            print(f"\n{i}.")
            peminjaman.info_peminjaman()

def kembalikan_buku():
    lihat_daftar_peminjaman()
    pilihan_peminjaman = int(input("\nMasukkan nomor peminjaman untuk mengembalikan buku: "))
    if pilihan_peminjaman > 0 and pilihan_peminjaman <= len(daftar_peminjaman):
        peminjaman = daftar_peminjaman[pilihan_peminjaman - 1]
        for buku in daftar_buku:
            if buku.get_judul() == peminjaman.get_judul():
                buku.set_status("Tersedia")
                print("\n=====Buku berhasil dikembalikan.=====")
        daftar_peminjaman.remove(peminjaman)
    else:
        print("\n=====Pilihan peminjaman tidak valid.=====")

if __name__ == "__main__":
    while True:
        choice = menu()

        if choice == "1":
            lihat_daftar_buku()
        elif choice == "2":
            tambah_buku()
        elif choice == "3":
            tambah_peminjaman()
        elif choice == "4":
            lihat_daftar_peminjaman()
        elif choice == "5":
            kembalikan_buku()
        elif choice == "6":
            print("\n=====Terima kasih.=====")
            break
        else:
            print("\n=====Pilihan tidak valid. Silakan coba lagi.=====")
