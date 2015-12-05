#Week 2

<b>1.</b>Write a program that prints the quadrant number of a point (x,y) on a plane. Recall that points in quadrant 1 have positive x and y values, points in quadrant 2 have a negative x value and a positive y value, points in quadrant 3 have negative x and y values, and the remaining points are in the quadrant 4. If a point is on an axis, choose the quadrant with the lower quadrant number.      

Name the source code of this program as P1.java and the compiled class code as P1.class (this is automatically done after compilation) inside the sub-directory lab1.       

Test cases: 4 points : each from one of the four quadrants, e.g., (1,1), (-1, 1), (-1, -1), (1, -1).   

Expected outputs: (1,1) – quadrant 1; (-1, 1) – quadrant 2; (-1, -1) – quadrant 3; (1, -1) – quadrant 4.   
   

<b>2.</b>Write a program that reads a character from the user and then uses a switch statement to achieve what the following if statement does.      
   
if ((choice == ‘A’) || (choice == ‘a’))   
    printf(“Action movie fan\n”);   
else if ((choice == ‘C’) || (choice == ‘c’))   
    printf(“Comedy movie fan\n”);   
else if ((choice == ‘D’) || (choice == ‘d’))   
    printf(“Drama movie fan\n”);   
else   
    printf(“Invalid choice\n”);   


Name the source code of this program as P2.java and name the compiled class code as P2.class inside the sub-directory lab1.   

Test cases: ‘a’, ‘A’, ‘c’, ‘C’, ‘d’, ‘D’, ‘b’, ‘B’.   

Expected outputs: ‘a’, ‘A’ – Action movie fan; ‘c’, ‘C’ – Comedy movie fan; ‘d’, ‘D’ – Drame movie fan; ‘b’, ‘B’ – Invalid choice.


Question 3
The salary scheme for a company is given as follows:
Salary range for grade A: $700 - $899
Salary range for grade B: $600 - $799
Salary range for grade C: $500 - $649

A person whose salary is between $600 and $649 is in grade C if his merit points are below 10, otherwise he is in grade B. A person whose salary is between $700 and $799 is in grade B if his merit points are below 20, otherwise, he is in grade A. Write a program to read in a person’s salary and his merit points, and displays his grade.

Name the source code of this program as P3.java and name the compiled class code as P3.class inside the sub-directory lab1.

Test cases: (1) salary : $500, merit : 10; (2) salaray : $610, merit : 5; (3) salary : $610, merit : 10; (4) salary : $710, merit : 15; (5) salary : $710, merit : 20; (6) salary : 800, merit : 30.

Expected outputs: (1) salary : $500, merit : 10 – Grade C; (2) salary : $610, merit : 5 – Grade C; (3) salary : $610, merit : 10 – Grade B; (4)
salary : $710, merit : 15 – Grade B; (5) salary : $710, merit : 20 – Grade A; (6) salary : 800, merit : 30 – Grade A.
