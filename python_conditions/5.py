money, season, n = int(input()), input(), int(input())
if season == "Spring":
    cost = 3000
elif season in ("Summer", "Autumn"):
    cost = 4200
elif season == "Winter":
    cost = 2600
else:
    print("Error")
    quit()
if not (4<=n<=18) or not (1<=money<=8000):
    print("Error")
    quit()
if n <= 6:
    cost *=0.9
elif 7<=n<=11:
    cost*=0.85
else:
    cost*=0.75
if n % 2 == 0 and season != "Autumn":
    cost*=0.95
if cost > money:
    print(f"Not enough money! You need {cost - money:.2f} rubles.")
else:
    print(f"Yes! You have {money - cost:.2f} rubles left")
