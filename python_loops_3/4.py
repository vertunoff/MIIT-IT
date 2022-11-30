primes = nonprimes = 0
s = input()
while s.lower() != 'stop':
    s = int(s)
    prime = True
    if s < 0:
        print('Number is negative')
    elif s == 0:
        print('Number is zero')
    elif s == 1:
        print('One is niether prime nor non prime')
    else:
        for i in range(2, s//2 + 1):
            if s % i == 0:
                prime = False
        if prime:
            primes += s
        else:
            nonprimes += s
    s = input()
print(f'Sum of all prime numbers is: {primes}')
print(f'Sum of all non prime numbers is: {nonprimes}')

