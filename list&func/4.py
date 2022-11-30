def isip(s):
    try:
        a = [int(i) for i in s.split('.')]
        if a[0] == 0 or len(a) != 4:
            return False
        for i in a:
            if not (0 <= i <= 255):
                return False
        return a
    except:
        return False

def islocal(ip):
    if (ip[0], ip[1]) in ((10, 0), (172, 16), (192, 168)):
        return True
    return False

def todecimal(ip):
    return ip[0] * 256**3 + ip[1] * 256**2 + ip[2] * 256**1 + ip[3]

try:
    n = int(input())
    if n < 0:
        print('Error')
        quit()
except:
    quit()

ips = []
for i in range(n):
    s = isip(input())
    if not s:
        print('Incorrect IP')
        quit()
    if islocal(s):
        print('The list contains the local IP!')
        quit()
    ips.append((s, todecimal(s)))

print()

ips = sorted(ips, key=lambda x: x[1])
for i in ips:
    i = i[0]
    print(f'{i[0]}.{i[1]}.{i[2]}.{i[3]}')
