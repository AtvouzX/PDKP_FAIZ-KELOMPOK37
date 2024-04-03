# mengimpor class userService dari file userService
from userService import userService

print("System Login Kelompok xx!\n")

# Mengambil masukan email & password melalui console
email = input("Email: ")
password = input("Password: ")

# Membuat objek logininfo dengan blueprint atribut dan method dari class userService
logininfo = userService(email,password)
logininfo.login()
