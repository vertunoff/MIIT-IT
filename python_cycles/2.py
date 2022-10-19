n, mx = int(input()), -10**1000
if n < 0:
    print('error')
    quit()
while n:
    mx = max(int(input()), mx)
    n -= 1
print(mx)