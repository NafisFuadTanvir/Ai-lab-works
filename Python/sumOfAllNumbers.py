firstnum = 50
answer = 0
while firstnum <= 100:
    if firstnum % 3 == 0 and firstnum % 5 == 0:

        answer = answer+firstnum

    firstnum = firstnum+1

print("sum of all numbers between 50 and 100 that are divisible by 3 and 5 is:", answer)
