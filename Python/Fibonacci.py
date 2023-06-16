# numberOfTime = 10
# n1, n2 = 0, 1
# print("Fibonacci sequence:")
# print(n1)
# print(n2)

# for i in range(2, numberOfTime):
#     res = n1 + n2
#     print(res);
   
#     n1, n2 = n2, res;





fiborange=int(input("enter the range:- "))
n1=0
n2=1
print(n1)
print(n2)

for i in range(2,fiborange):
    res= n1+n2
    print(res)
    n1=n2
    n2=res


