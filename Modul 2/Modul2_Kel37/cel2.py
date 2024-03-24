# Get user input for height (in meters) and weight (in kg)
tinggi = float(input("Masukkan tinggi badan (meter): "))
berat = float(input("Masukkan berat badan (kg): "))

# Calculate BMI
bmi = berat / (tinggi ** 2)

# Display BMI value
print(f"BMI Anda adalah: {bmi:.2f}")

# Categorize BMI
if bmi < 18.5:
    print("You are underweight.")
elif 18.5 <= bmi < 24.9:
    print("You have a healthy weight.")
elif 25.0 <= bmi < 29.9:
    print("You are overweight.")
else:
    print("You are obese.")