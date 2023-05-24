numbers=[10,11,12,13,14,15,16,17,18,19,20];
sumOfEven=0;
sumOfOdd=0;

for i in numbers:
    if i%2==0:
     sumOfEven=sumOfEven+i;

print("sum of even number is:- " , sumOfEven);

for i in numbers:
    if i%2!=0:
     sumOfOdd=sumOfOdd+i;
print("sum of Odd number is:- " ,  sumOfOdd);