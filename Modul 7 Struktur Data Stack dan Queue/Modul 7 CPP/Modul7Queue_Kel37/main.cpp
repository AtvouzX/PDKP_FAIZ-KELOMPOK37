#include <iostream>
#define MAX 20 //maksimum data queue
using namespace std;

//Deklarasi struct antrian
struct Queue {
	int front, rear, data[MAX];
}Q;

//cek apakah antrian penuh
bool isFull() {
	return Q.rear == MAX;
}

//cek apakah antrian kosong
bool isEmpty() {
	return Q.rear == 0;
}

//Menampilkan Queue
void printQueue() {
	if (isEmpty()) {
        cout << "Antrian kosong"<<endl;
	}
	else {
		cout << "QUEUE : ";
		for (int i = Q.front; i < Q.rear; i++)
		//menambahkan koma jika data tidak terdapat di antrian pertama
			cout << Q.data[i] << ((Q.rear-1 == i) ? "" : ",");
		cout << endl;
  }
}
//manambahkan data ke antrian
void enqueue() {
	if (isFull())
	{
		cout << "Antrian penuh!"<<endl;
	}
	else {
		int data;
		//menambahkan data ke antrian
		cout << "Masukkan Data : ";cin >> data;
		Q.data[Q.rear] = data;
		//menempatkan tail pada elemen data terakhir yang ditambahkan
		Q.rear++;
		cout << "Data ditambahkan\n";
		printQueue();
	}
}

// mengambil data dari antrian
void dequeue() {
	if (isEmpty())
	{
		cout << "Antrian masih kosong"<<endl;
	}
	else{
		cout << "Mengambil data \"" << Q.data[Q.front] << "\"..." << endl;
		//menggeser antrian data ke head
		for (int i = Q.front; i < Q.rear; i++)
			Q.data[i] = Q.data[i + 1];
		//menempatkan tail pada data terakhir yang digeser
		Q.rear--;
		printQueue();
	}
}

int main() {
	int choose;
	do
	{
		//Tampilan menu
		cout << "-------------------\n"
			<< "   Menu Pilihan\n"
			<< "-------------------\n"
			<< " [1] Enqueue \n"
			<< " [2] Dequeue\n"
			<< " [3] Keluar \n\n"
			<< "-------------------\n"
			<< "Masukkan pilihan : "; cin >> choose;
		switch (choose)
		{
		case 1:
			enqueue();
			break;
		case 2:
			dequeue();
			break;
		default:
			cout << "Pilihan tidak tersedia";
			break;
		}
	} while (choose !=3);
	return 0;
}
