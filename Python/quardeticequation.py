
import cmath


a = float(input("Enter  a: "))
b = float(input("Enter  b: "))
c = float(input("Enter  c: "))

equation= (b**2)-(4*a*c)

sol1 = (-b-cmath.sqrt(equation))/(2*a)
sol2 = (-b+cmath.sqrt(equation))/(2*a)


print("The ans is:- " , sol1,sol2);