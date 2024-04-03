#include <iostream>
#include "userService.cpp"
using namespace std;

// Main function di C++
int main()
{
	string email, password;
	cout << "Email : ";
	cin >> email;
	cout << "Password : ";
	cin >> password;
	userService data(email, password);
	data.login();
}
