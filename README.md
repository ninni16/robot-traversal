# robot-traversal
The robot can travel on a rectangular plane :
1. The rectangular plane is represented by a X-Y plane with bottom left as (0,0) and top right as
(M,N)
2. The rectangular plane contains multiple particles. A particle's position is represented by x and
y coordinates

The robot's movement :
1. Its position is represented by x and y coordinates and a letter representing one of the four
directions (N/S/E/W)
2. It takes in commands in the form of single letters. The possible letters are 'L', 'R' and 'M'.
'L' and 'R' makes the robot turn 90 degrees left or right respectively, without moving from
its current position.
'M' means move forward one position and maintain the same direction.
3. It stops walking
3.1 If it finds any particle on its way
3.2 If it encounters any coordinate on its path which it had travelled earlier
3.3 If the next command leads to a position outside rectangular plane

INPUT:
**Input to be provided through a text file stored under the codebase with file name : request.txt**

Input format : 
1. The first line of input is the top-right coordinates of the rectangular plan (M, N),
2. Next two lines of input are about the robot
first line gives the robot's starting position, X,Y coordinates and a letter, all 3 separated by
spaces
second line is a series of commands for the robot

Test Input
4 4

0 0 N

MMMRMMLM

Problem:
Where would the robot stop travelling?
OUTPUT:
Robot's final coordinates and direction.
