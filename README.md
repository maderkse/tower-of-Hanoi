# tower-of-Hanoi
build with java	11
run program as follows:
java Hanoi.java <1> <2>...<n>. Where n is last and widest disc of the stack.
or
javac Hanoi.java
java Hanoi <1> <2>...<n>

example: java Hanoi.java 1 2 3
The output shows how the stack must be replaced 
from A to C following the rules of the game:
1. move only one disc from the top at the time, 
2. you can not place a wider disc on a smaller one
The left side is the top of each stack.

output of example:
Tower height: 3
A: [1, 2, 3]
B: []
C: []


A: [2, 3]
B: []
C: [1]


A: [3]
B: [2]
C: [1]


A: [3]
B: [1, 2]
C: []


A: []
B: [1, 2]
C: [3]


A: [1]
B: [2]
C: [3]


A: [1]
B: []
C: [2, 3]


A: []
B: []
C: [1, 2, 3]


