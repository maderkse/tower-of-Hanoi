# tower-of-Hanoi
Build with java	11, 
run program as follows:<br>
java Hanoi.java \<tower height\><br>
Where tower height is an integer representing the height of the starting tower.

Alternative for running program:<br>
javac Hanoi.java<br>
java Hanoi \<tower height\><br>

Example: java Hanoi.java 3<br>
The output shows how the stack must be replaced 
from A to C following the rules of the game:
1. move only one disc from the top at a time, 
2. you can not place a wider disc on a smaller one

Output of example:<br>
(The left side is the top of each stack)<br>
<br>
Tower height: 3<br>
A: [1, 2, 3]<br>
B: []<br>
C: []<br>
<br>
A: [2, 3]<br>
B: []<br>
C: [1]<br>
<br>
A: [3]<br>
B: [2]<br>
C: [1]<br>
<br>
A: [3]<br>
B: [1, 2]<br>
C: []<br>
<br>
A: []<br>
B: [1, 2]<br>
C: [3]<br>
<br>
A: [1]<br>
B: [2]<br>
C: [3]<br>
<br>
A: [1]<br>
B: []<br>
C: [2, 3]<br>
<br>
A: []<br>
B: []<br>
C: [1, 2, 3]<br>
