try:
    lst = [float(i) for i in input().split(', ')]
except:
    print("Error")
    quit()
    
def sumx(a):
    s = 0
    for i in a:
        s += i
    return s

def mult(a):
    s = 1
    for i in a:
        s *= i
    return s

print(f'Сумма: {sumx(lst)}')
print(f'Произведение: {mult(lst)}')