lst, lst2 = input().split(), input().split()

def matches(a1, a2):
    a = []
    for i in a2:
        if i in a1:
            a.append(i)
    return ' '.join(a) if a else 'No matches'


print(matches(lst, lst2))
