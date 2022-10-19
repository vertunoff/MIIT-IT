while True:
    x = float(input())
    if -300<=x<=300 or 1000<=x<=1600:
        print(f'The number is: {x if int(x)!=x else int(x)}')
        break
    print('Invalid number!')