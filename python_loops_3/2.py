n = input()
while n.lower()!='end':
    s = int(input())
    while s>0:
        x = int(input())
        if x < 0:
            print('can not be negative, enter again')
            continue
        s -= x
    print(f'Going to {n}!')
    n = input()