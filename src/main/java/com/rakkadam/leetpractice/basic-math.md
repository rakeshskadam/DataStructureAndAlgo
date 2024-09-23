
<b>Note: Refactor</b>
## Basic Math and other formulas: 

### Celsius to farhenheit 
```java
F = (c * 9/5) + 32

where c is celsius value.
```

## Arithmetic Progression and Geometric Progression
### 1. Arithmetic Progression (AP)

>a<sub>n</sub> = a + (n - 1)d <br/>
// where a first number,  d is difference between first and second.

### 2. Geometric Progression (GP) or Geometric Series (GS)

>a<sub>n</sub> =  a<sub>1</sub> . r<sup>(n-1)</sup>

###### Sum of geometric series.
 
                
>S<sub>n</sub> = a (1 - r<sup>n</sup>) / (1 - r)


LCM and HCF(GCD)
----------------
Factors and Multiples : All numbers that divide a number completely, i.e., without leaving any remainder, are called factors of that number. For example, 24 is completely divisible by 1, 2, 3, 4, 6, 8, 12, 24. Each of these numbers is called a factor of 24 and 24 is called a multiple of each of these numbers.

HCF : The term HCF stands for Highest Common Factor. The largest number that divides two or more numbers is the highest common factor (HCF) for those numbers. For example, consider the numbers 30 (2 x 3 x 5), 36 (2 x 2 x 3 x 3), 42 (2 x 3 x 7), 45 (3 x 3 x 5). 3 is the largest number that divides each of these numbers, and hence, is the HCF for these numbers.
[HCF by Euclidian Algorithm](https://youtu.be/JUzYl1TYMcU) <br/>

###### HCF by Euclidian Algorithm:

1. If we subtract the smaller number from larger (we reduce larger number), GCD doesn't change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.
2. Now instead of subtraction, if we divide the smaller number, the algorithm stops when the remainder is found to be 0.

Basic Idea:
consider two numbers 10 and 45. 

**Dividend =  divisor  *  quotient + reminder;**


>step.1) 
>       45 = 10 * 4 + 5; 
>
>step.2) now assign the values as below. and continume same process until remider become zero.
       dividend = divisor, divisor = reminder
>
>       10 = 5 * 2 + 0;
>In this step reminder become zero, so the GCD of both the numbers is previous step reminder that is 5
Hence the GCD of 10 and 45 is 5

<br/>


LCM : LCM stands for Least Common Multiple. The lowest number which is exactly divisible by each of the given numbers is called the least common multiple of those numbers. For example, consider the numbers 3, 31 and 62 (2 x 31). The LCM of these numbers would be 2 x 3 x 31 = 186.
[LCM video](https://youtu.be/JVK9qKwkg_g)

we can calculate LCM with the use of GCD.
 
>LCD(a,b) = (a*b) / GCD(a,b)

**General Note**: LCM will be always greater than or equal the larger of two numbers.

Is the number prime?
------------------- 

If we write all divisors of number those divisors will always appears in pairs. <br/>
For ex: <br/>
30: (1, 30), (2, 15), (3,10)
<br/>
65: (1, 65), (5, 13)
<br/>
25: (1, 25), (5, 5)
```java
Now if the x, y is a pair. then,

    x * y = n 
    
and if x =< y;

    x * x =< n 
    x^2 =< n
    x =< sqrt(n) 
```

Now for number **N** if we find any divisor between **2** to **sqrt(N)** then the number **N** is composite or non prime number. if no divisors found then it is a prime number.
 

What is Fibonacci Number?
-----------------
Every element is sum of previous two elements is called as Fibonacci Number/Series<br/>
Ex: 0,1, 1, 2, 3, 5, 8, 13, 21,........

Similarly the N-bonacci number is the sum of previous N numbers.
<br/>
In the n-bonacci numer the first N-1 elements are always zero.
<br/>
Example of 4-bonacci number:
0,0,0,1,1,2,4,8,15,......





