# 2024 Question 1

## This question is about...
- Create a *simulateOneDay* method in the Feeder class
  - Every bird (*numBirds*) eats the same randomized amount from 10 to 50 of food each day
  - Theres a 5% chance that a bear would eat all the food and leave the *currentFood* empty
  - Updates the *currentFood* instance variables as each day passes on
- Create a *simulateManyDays* method in the Feeder class
  - Uses the simulateOneDay method to update the amount of food conusmed for consecutive days (*numDays*)
  - Create a loop for *numDays* times if *currentFood* is not empty
  - Returns the amount of days had passed in the simulation

## Struggles with this question...
- In the *simulateManyDays* method I was planning to use a while loop that looks like:
  `While(currentFood!=0){/* to be implemented */}`
  I realized that I could not use this code because it didn't include the requirement of simulate for consecutive days
  The while loop that I wrote will keep on repeating itself until the *currentFood* is empty

## Prior experiences that helped...
-

## What I learned by doing this question...
-
