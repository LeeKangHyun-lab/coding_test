import sys

n = int(sys.stdin.readline().strip())

num = 666
cnt = 0

while(True):
    if "666" in str(num):
        cnt += 1
        

    if cnt == n:
        print(num)
        break
    
    num += 1