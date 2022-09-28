fr, day, kg = input(), input(), float(input())
ans = None
if day in ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"):
    if fr == "banana":
        ans = 2.5*kg
    elif fr == "apple":
        ans = 1.2*kg
    elif fr == "orange":
        ans = 0.85*kg
    elif fr == "grapefruit":
        ans = 1.45*kg
    elif fr == "kiwi":
        ans = 2.70*kg
    elif fr == "pineapple":
        ans = 5.5*kg
    elif fr == "grapes":
        ans = 3.85*kg
elif day in ("Saturday", "Sunday"):
    if fr == "banana":
        ans = 2.7*kg
    elif fr == "apple":
        ans = 1.25*kg
    elif fr == "orange":
        ans = 0.90*kg
    elif fr == "grapefruit":
        ans = 1.6*kg
    elif fr == "kiwi":
        ans = 3*kg
    elif fr == "pineapple":
        ans = 5.6*kg
    elif fr == "grapes":
        ans = 4.2*kg
print(f"{ans:.2f}" if ans else "error")