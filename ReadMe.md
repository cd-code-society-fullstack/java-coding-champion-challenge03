## Problem: Queue Bribes Count

Given a list of integers `q` representing the order of people in a queue, return the minimum number of bribes that have taken place for the queue to reach its current state. If someone has bribed more than two people, print "Too chaotic".

Each person in the queue can bribe the person directly in front of them to swap positions. Each person is represented by an integer and wears a sticker indicating their initial position in the queue. A person can bribe at most two others. 

The function `minimumBribes(List<Integer> q)` accepts a list of integers and prints the minimum number of bribes or "Too chaotic" if someone has bribed more than two people.

### Example 1:

Input: q = "1,2,3,5,4,6,7,8"
Output: 1
Explanation: One bribe took place: person 5 bribed person 4 to move ahead.

{Try it}(sh .guides/runner.sh javac Result.java java -cp . Result "1,2,3,5,4,6,7,8")

### Example 2:

Input: q = "4,1,2,3"
Output: "Too chaotic"
Explanation: Person 4 had to bribe 3 people to get to the current position. 

{Try it}(sh .guides/runner.sh javac Result.java java -cp . Result "4,1,2,3")

Constraints:

1 <= q.size() <= 10^5
q consists of distinct integers.
The integers in q are in the range [1, q.size()].

## Submit


1. Test Case 1: 
    Input: "1,2,3,4,5"
    Expected Output: 0

2. Test Case 2: 
    Input: "2,1,5,3,4"
    Expected Output: 3

3. Test Case 3: 
    Input: "2,5,1,3,4"
    Expected Output: "Too chaotic"

4. Test Case 4: 
    Input: "5,1,2,3,7,8,6,4"
    Expected Output: "Too chaotic"

5. Test Case 5: 
    Input: "1,2,5,3,7,8,6,4"
    Expected Output: 7
