n = input()
rest = 0
while n.lower()!='end':
    s = input()
    if s.lower() == 'end':
        break
    s = int(s)
    ss = 0
    while ss<s:
        x = input()
        if x.lower() == 'end':
            rest = ss
            break
        x = int(x) + rest
        if x - rest < 0:
            print('can not be negative, enter again')
            continue
        ss += x
    if ss>=s:
        print(f'Going to {n}!')
        rest = ss-s
    n = input()