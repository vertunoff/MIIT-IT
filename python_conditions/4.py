t, day = int(input()), input()
if t < 10:
    raise Exception("Error")
elif 10<=t<=18:
    if day == "Morning":
        Outfit = "Sweatshirt"
        Shoes = "Sneakers"
    elif day == "Afternoon":
        Outfit = 'Shirt'
        Shoes = 'Moccasins'
    elif day == 'Evening':
        Outfit = 'Shirt'
        Shoes = 'Moccasins'
elif 18<=t<=24:
    if day == "Morning":
        Outfit = 'Shirt'
        Shoes = 'Moccasins'
    elif day == "Afternoon":
        Outfit = 'T-Shirt'
        Shoes = 'Sandals'
    elif day == 'Evening':
        Outfit = 'Shirt'
        Shoes = 'Moccasins'
elif t >=25:
    if day == "Morning":
        Outfit = 'T-Shirt'
        Shoes = 'Sandals'
    elif day == "Afternoon":
        Outfit = 'Swim Suit'
        Shoes = 'Barefoot'
    elif day == 'Evening':
        Outfit = 'Shirt'
        Shoes = 'Moccasins'
print(f"It's {t} degrees, get your {Outfit} and {Shoes}." )
