s = input()
x = 12 if s == "Premiere" else 7.5 if s == "Normal" else 5 if s == "Discount" else None
if x:
    a, b = int(input()), int(input())
    if a < 0 or b < 0:
        print("error")
    else:
        print(f"{x*a*b:.2f} $")
else:
    print("wrong type")
