import sys

arr = []

n = int(sys.stdin.readline().strip())

for x in range(n):
    arr.append(list(map(int, sys.stdin.readline().strip().split())))


arr.sort(key = lambda x : (x[1] , x[0]))


for x in arr:
    print(x[0], x[1])