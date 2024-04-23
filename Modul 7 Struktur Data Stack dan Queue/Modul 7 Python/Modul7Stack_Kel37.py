count = 0
size = -1
stack = []
while count == 0:
    print("---Ini Stack---")
    print("1. PUSH Item")
    print("2. POP Item")
    print("3. Lihat Daftar Data")
    print("4. Lihat Data Teratas")
    print("5. Keluar")
    pilihan = int(input("Masukkan Pilihan : "))
    if pilihan == 1:
        data = int(input("Data yang ditambahkan : "))
        stack.append(data)
        size+=1
        print ("")
    if pilihan == 2:
        stack.pop()
        size-=1
        print ("")
    if pilihan == 3:
        print(stack)
        print ("")
    if pilihan == 4:
        print(stack[size])
        print ("")
    if pilihan == 5:
        count = 1
