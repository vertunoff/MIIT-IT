n = int(input())
if n <= 1:
    print('error')
    quit()
truesum = n * (1 + n)//2
sum = 0
for i in range(n-1):
    q = int(input())
    if not (1<=q<=n):
        print('error')
        quit()
    sum += q
print(truesum-sum)
