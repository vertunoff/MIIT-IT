n = int(input())
if n <= 0:
    print('error')
    quit()
same, max_dif = True, -1
q1, q2 = int(input()), int(input())
old_sumq = q1 + q2
for i in range(n-1):
    q1, q2 = int(input()), int(input())
    sumq = q1 + q2
    dif = abs(sumq-old_sumq)
    if dif > 0:
        same = False
        max_dif = max(max_dif, dif)
    old_sumq = sumq
if same:
    print(f'Yes, value={old_sumq}')
else:
    print(f'No, maxdiff={max_dif}')
