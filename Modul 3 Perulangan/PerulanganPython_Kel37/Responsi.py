def fibonacci(n):

    fib_list = [0, 1]
    for i in range(2, n+1):
        fib_list.append(fib_list[i-1] + fib_list[i-2])
    return fib_list

start = int(input("Masukkan nilai awal: "))
end = int(input("Masukkan nilai akhir: "))
length = int(input("Masukkan panjang deret Fibonacci: "))


fib_list = fibonacci(end)


print(f"Deret Fibonacci dari {start} hingga {end} dengan panjang {length} adalah: {fib_list[start:start+length]}")
