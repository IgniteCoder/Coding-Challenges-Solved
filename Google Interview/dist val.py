a = int(input('enter the number of input for a list :'))
n = []
for i in range(a):
    a = int(input('add to the list:'))
    n.append(a)
n.sort()
low1 = n[0]
high1 = n[len(n) - 1]
print(f'low value :{low1},high value:{high1}')

c = []
d = []
s = []
m = []
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
print(
    f'the values obtained after filtering the common values which are obtained by dividing the every element in input array and dividing with their range resptively is: {final_list}')


def function(arr, low, high):

    mid = low+(high-low)/2
    mid = int(mid)
    a = arr[mid]

    for every in n:
        every = every/a
        every = int(every)
        d.append(every)
        k = sum(d)
        s.append(k)
        s.sort()
        m.append(a)
        m.sort()
    print(
        f'the values obtained by dividing input array with with mid values of above list is :{m}')
    print(f'the sum of the values of the list obtained is: {s}')
    f = {'sum of the values is': s,
         'the mid values respectively is ': m}

    print(f'the ditionary values are:{f}')

    if(k == len(n)):
        return (f' maximum portion that can be removed from a cake is {a}')
    if(arr[low] == arr[mid] or arr[mid] == arr[high]):
        return(f'maximum value that can be removed from each cake is {a}')
    if(low1 == high1):
        return (f'maximum that can be removed from a cake is{float(min(n))}')

    if(k > len(n)):

        d.clear()
        low = mid

        return function(arr, low, high)

    elif(k < len(n)):
        d.clear()
        high = mid
        return function(arr, low, high)


print(function(final_list, 0, len(final_list)-1))
