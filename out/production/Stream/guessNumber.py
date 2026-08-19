import random

user = int(input("Enter a number between 1 to 10: "))
computer = random.randint(1,10)

if(user > 10 or user < 1):
    print("Invalid number")
    exit()
if(user == computer):
    print("You win! The number was: ", computer)
else:
    print("You lose! The number was: ", computer)
