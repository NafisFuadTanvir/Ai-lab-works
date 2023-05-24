numbers=[10,11,12,13,5,15,16,17,18,19,20];

maxNumber = max(numbers);
numbers.remove(maxNumber);
secondmaxNumber = max(numbers);

print("The second highest number is:", secondmaxNumber);