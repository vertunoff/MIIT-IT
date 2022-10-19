a, b = int(input()), int(input())
if not ((1<=a<=1000) and (1<=b<=1000)):
    print('error')
    quit()
size = a * b
while True:
    n = input()
    if n == 'STOP':
        print(f'{size} pieces are left.')
        break
    n = int(n)
    size -= n
    if size < 0:
        print(f'No more cake left! You need {abs(size)} pieces more.')
        break