n, mn = int(input()), 10**1000
if n < 0:
    print('error')
    quit()
while n:
    mn = min(int(input()), mn)
    n -= 1
print(mn)