s = input()
x = 12 if s == "Premiere" else 7.5 if s == "Normal" else 5 if s == "Discount" else None
if x:
    print(f"{x*int(input())*int(input()):.2f} $")
else:
    print("wrong type")