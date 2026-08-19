import random

choices = ["stone", "paper", "scissor"]

user = input("Enter your choice: ").lower()

computer = random.choice(choices)

print("User choice: ", user)
print( "Computer choice: ", computer)

if user == computer:
    print("It's a tie!")

elif (user == "stone" and computer == "scissor") or \
     (user == "scissor" and computer == "paper") or \
     (user == "paper" and computer == "stone"):
    print("You win!")

else:
    print("You lose!")

