# 2024 Question 2

## This question is about...
- Create a *Socreboard* class
  - Create a constructor
    - Emits two String parameter with the name of team 1 and team 2 *(t1 and t2)*
    - The *active* team always begins with *t1*
  - Create a *getScore* method
    - Returns a String that looks like: *t1Score-t2Score-active*
  - Create a *recordPlay* method
    - If no points was earned in the active team the inactive team will be recorded to *active*
    - If theres one or more points earned the active teams score will be updated and *active* doesn't change

## Struggles with this question...
- The *recordPlay* method is hard to code out because theres a use of nested if statemnets

## Prior experiences that helped...
- The practice of nested if statemnets

## What I learned by doing this question...
- The String *active* would be more easier to use if it's a boolean where when the active team is t1 then it's true, and when the active team is t2 then it's false 
