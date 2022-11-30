n = int(input())
if n <= 0:
    print('error')
    quit()
for i in range(n):
    for j in range(i):
        print('*', end=' ')
    for j in range(i+1, n+1):
        print(j, end=' ')
    print()