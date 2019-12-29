a = int(input('enter the number of input for a list :'))
n = []
for i in range(a):
    a = int(input('add to the list:'))
    n.append(a)
n.sort()
low1 = n[0]
high1 = len(n) - 1
high1 = n[high1]
print(f'low value :{low1},high value:{high1}')
c = []
d = []
f = {}

for i in n:
    for j in range(i):
        j = j + 1
        e = i / j
        c.append(e)
        c.sort()
        final_list = []
for num in c:
    if num not in final_list:
        final_list.append(num)
print(f'the values obtained are {final_list}')


def function(arr, low, high):
    mid = low+(high-low)/2
    mid = int(mid)
    a = arr[mid]
    for every in n:
        every = every/a
        every = int(every)
        d.append(every)
        k = sum(d)

    if(k == len(n)):
        return (f' maximum portion that can be removed from a cake is {a}')
    elif(k == len(n)+1 and not(k > len(n)+1 and k == len(n))):
        return(a)
    elif(k > len(n)+1 and not (k == len(n)+1 and k == len(n))):
        return(float(min(n)))

    elif(k > len(n)):
        d.clear()
        low = mid
        return function(arr, low, high)

    elif(k < len(n)):
        d.clear()
        high = mid
        return function(arr, low, high)


print(function(final_list, 0, len(final_list)-1))
