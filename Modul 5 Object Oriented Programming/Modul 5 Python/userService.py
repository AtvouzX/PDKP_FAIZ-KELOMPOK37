# class userService, sebagai class dimana kita akan membuat constructor dan method untuk objek user
class userService:
	# def __init__ method adalah constructor dalam Python
	# Dalam constructor, objek kita inisialisasikan memiliki atribut email & password
	# Selain inisialisasi, kita masukkan data melalui memory dengan membuat python dictionary self.data
	# Penggunan self disini adalah syntax python, dimana self sebagai penunjuk objek yang sedang dipakai
    def __init__(self, email, password):
        self.email = email 
        self.password = password
        self.data = {
            "nama1kelompok37@gmail.com" : {
                "email" 	: "nama1kelompok37@gmail.com",
                "password"  : "12345",
                "role"  	: "superadmin"
            },
            "nama2kelompok37@gmail.com" : {
                "email" 	: "nama2kelompok37@gmail.com",
                "password"  : "12345",
                "role"  	: "user"
            }
        }
	
	# Method untuk pengecekan kesesuaian input dengan data di dictionary yang telah kita buat
    def checkCredentials(self):
        for value in self.data:
            if value == self.email:
                get_data_user = self.data[value]
                if self.password == get_data_user['password']:
                    return get_data_user
                else:
                    return False
	# Method untuk proses login dalam console
    def login(self):
        get_data = self.checkCredentials()
        if get_data:
            print("\nWelcome ",get_data['role'])
            print("Logged it as user email: ",get_data['email'])
        else:
            print("\nInvalid Login!\n")
