def sumOfParameters(*numbers):
    sum = 0;
    for i in numbers:
        sum=sum+i;
    
    return sum;

print(sumOfParameters(10,50,60,700))
