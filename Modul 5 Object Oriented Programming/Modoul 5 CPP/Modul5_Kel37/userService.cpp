// header
#include <iostream>
#include <string>
using namespace std;

// class userService, tempat membuat constructor
class userService {

// data email & password dalam bentuk array string
private:
  	string data[2][3] = {
              	{"nama1kelompok37@gmail.com", "12345", "superadmin" },
              	{"nama2kelompok37@gmail.com", "12345", "user"  }
  	};
  	string email, password, roles;


public:
  	userService(string emails, string passwords) {
        	email = emails;
        	password = passwords;

  	}

  	void login() {
        	bool status = checkCredentials();
        	if (status == true) {
              	cout << "\n Welcome " << roles;
              	cout << "\n Logged it as user email " << email;
        	}
        	else {
              	cout << "\nInvalid Login";
        	}
  	}

  	bool checkCredentials() {
        	int rows = sizeof data / sizeof data[0];
        	for (int i = 0; i < rows; i++) {
              	if (data[i][0] == email && data[i][1] == password) {
                    	roles = data[i][2];
                    	return true;
        	  	}
        	}
        	return false;
  	}
};
