class film(object):
    # description of class
    __judul = ""
    __genre = ["", ""]
    __rate = 0.0
    __tahun = 0

    def __init__(self, judul, genre, rate, tahun):
        self.__judul = judul
        self.__genre = genre
        self.__rate = rate
        self.__tahun = tahun
        pass

    def setGenre(self, genreBaru):
        self.__genre = genreBaru
        pass

    def setRate(self, rateBaru):
        self.__rate = rateBaru
        pass

    def getJudul(self):
        return self.__judul

    def getGenre(self):
        for item in self.__genre:
            print(item)
        pass

    def getRate(self):
        return self.__rate

    def getTahun(self):
        return self.__tahun

ygbeneraje = film("The Avengers", ["Action"], 7.9, 2012)

print("Kelompok 37")
print("-- Tahun 2023 --")
print("Judul : " + ygbeneraje.getJudul())
print("Genre : ")
ygbeneraje.getGenre()
print("Rate : " + str(ygbeneraje.getRate()))
print("Tahun : " + str(ygbeneraje.getTahun()))

ygbeneraje.setGenre(["Action", "Alien"])
ygbeneraje.setRate(9.9)

print("\n-- Tahun 2024 --")
print("Judul : " + ygbeneraje.getJudul())
print("Genre : ")
ygbeneraje.getGenre()
print("Rate : " + str(ygbeneraje.getRate()))
print("Tahun : " + str(ygbeneraje.getTahun()))
