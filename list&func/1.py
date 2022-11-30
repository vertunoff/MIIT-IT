lst = lst2 = input().split(', ')
lst = lst[::-1]
for i in range(len(lst2)):
    lst2.insert(i, lst2.pop())
def out(a):
    print(', '.join(a))
out(lst)
out(lst2)