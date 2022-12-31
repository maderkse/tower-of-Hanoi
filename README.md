# tower-of-Hanoi
Build with java	11, 
run program as follows:
java Hanoi.java <1> <2>...\<n\>.<br>
Where n is the last and widest disc of the stack.

Alternative for running program:<br>
javac Hanoi.java<br>
java Hanoi <1> <2>...\<n\><br>

Example: java Hanoi.java 1 2 3<br>
The output shows how the stack must be replaced 
from A to C following the rules of the game:
1. move only one disc from the top at a time, 
2. you can not place a wider disc on a smaller one
The left side is the top of each stack.

Output of example:<br>
(The left side is the top of each stack)<br>
<br>
Tower height: 3<br>
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


