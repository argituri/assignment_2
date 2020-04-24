# Assignment part 2

A program to determine the smallest amount of numbers 
that fit inbetween (the smallest difference between) two numbers in an array.

E.g for [1,4,10] the program should return 2 (numbers 2,3 fit between 1 and 4).

Rules
* It can be assumed that all numbers are natural integers
* Functions return value must not depend on the order of the integers
* It should not matter if there are many numbers of the same magnitude
* It should not matter if there are many pairs with the same difference between them e.g. [1,3,5]

## Classes
"Main" class in src/main/java/

* NumsBetween

Contains the static method howManyBetween(int[])

"Test" class in src/test/java/

* NumsBetweenTest

Contains unit tests (Junit 5). First test makes sure the function works and returns an integer using a random int array, 
the other tests expect a determined result for different arrays. 

Compiling:

> mvn clean compile

Run:

> mvn clean test

to run tests with maven/Junit.

To run the "main program" after compilation run (from project root):

> java -cp target\classes NumsBetween <ARRAY>

Where <Array> is your comma separated integer array in quotes for example:

> java -cp target\classes NumsBetween "10,4,1"

>> Result: 2

 ### Note!
 
 The program assumes the use of int and depends on the use of Integer.MAX_VALUE (= 2147483647).
 However same program logic could be applied for long/BigInteger, if you were to need this logic for bigger numbers.
 
 Also, some might argue that zero is the smallest amount that could fit between two numbers. 
 In that case simply remove the '&& Math.abs(arr[i] - arr[j]) > 1  from NumsBetween at:
 > if (Math.abs(arr[i] - arr[j]) < difference && Math.abs(arr[i] - arr[j]) > 1){ 

Also note that this breaks the unit tests.