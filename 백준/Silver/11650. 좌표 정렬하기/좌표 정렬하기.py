import sys

point = []

n = int(sys.stdin.readline().strip())

for x in range(n):
    value = list(map(int, sys.stdin.readline().strip().split()))
    point.append(value)

point.sort(key = lambda x : (x[0],x[1]))

for y in point:
    print(y[0], y[1]);