# 2024 Question 4

## This question is about...
- Create a *getNextLoc* method in the GridPath class
  - Returns a Location of a neighboor to the right or below in the *grid*
  - If both neighboors exist then return the one with the smaller value
- Create a *sumPath* method in the GridPath class
  - Returns the sum of all values in a path on *grid* (Stops until the last row and column reached)
  - Uses the *getNextLoc* to find the next path

## Struggles with this question...
- The creation of a new Loaction in the *getNextLoc* method and when to return
- The updation of a Location in the *sumPath* method

## Prior experiences that helped...
- The practice of when to use a for loop and a while loop and the borders to stop the loop

## What I learned by doing this question...
- How a class variable can be updated repeated times like:
  ```
  Location a=getNextLoc(row,col);
  ```
