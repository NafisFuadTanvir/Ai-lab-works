

num1= int(input("enter the first range:- "));

num2= int(input("enter the second range:- "));

sum=0
for i in range(num1,num2):
    if i%3==0 and i%5!=0:
        sum=sum+i;

print(sum);
