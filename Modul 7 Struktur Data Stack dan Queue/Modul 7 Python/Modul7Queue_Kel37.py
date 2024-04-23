from collections import deque
count = 0
queue = deque()
while count == 0:
    print("---Ini Queue---")
    print("1. Enqueue Item")
    print("2. Dequeue Item")
    print("3. Lihat Daftar Data")
    print("4. Lihat Data Teratas")
    print("5. Keluar")
    pilihan = int(input("Masukkan Pilihan : "))
    if pilihan == 1:
        data = int(input("Data yang ditambahkan : "))
        queue.append(data)
        print ("")
    if pilihan == 2:
        queue.popleft()
        print ("")
    if pilihan == 3:
        print(queue)
        print ("")
    if pilihan == 4:
        print(queue[0])
        print ("")
    if pilihan == 5:
        count = 1
