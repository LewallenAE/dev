# Object Oriented Programming




class BigObject: # Instantiate the class
    # Code here
    pass

obj1 = BigObject()
obj2 = BigObject()
obj3 = BigObject


class PlayerCharacter:
    def __init__(self,name, age): # Dunder / magic method
        self.name = name
        self.age = age

    def run(self):
        print('run')

player1 = PlayerCharacter('Anthony', 39)
player2 = PlayerCharacter('Cindy', 40)
player3 = PlayerCharacter('Will', 69)

print(player1.name, player1.age)
print(player2.name, player2.age)
print(player3.name, player3.age)


# Attributes and Methods

class PlayerCharacter:
    def __init__(self,name, age): # Dunder / magic method
        self.name = name
        self.age = age

    def run(self):
        print('run')

    name = input("Input your character's name: ")
    age = int(input("Input your character's age: "))

anthonyPlayer = PlayerCharacter(name, age)

print(anthonyPlayer.name, anthonyPlayer.age)



#Given the below class:
class Cat:
    species = 'mammal'
    def __init__(self, name, age):
        self.name = name
        self.age = age


# 1 Instantiate the Cat object with 3 cats
cat1 = Cat('Toby', 20)
cat2 = Cat('Tabby', 15)
cat3 = Cat('Mimi', 13)


# 2 Create a function that finds the oldest cat
def oldestCat(*cats):
    if cat1.age > cat2.age and cat1.age > cat3.age:
        return cat1
    elif cat2.age > cat1.age and cat2.age > cat3.age:
        return cat2
    else:
        return cat3

    # this can be shortened to just return max(cats)

oldest = oldestCat(cat1,cat2,cat3)


# 3 Print out: "The oldest cat is x years old.". x will be the oldest cat age by using the function in #2
print(f"The oldest cat is {oldest.age}, years old.")


class PlayerCharacter:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def shout(self):
        print(f"My name is {self.name}, and I'm {self.age}")

    @classmethod
    def adding_things(cls, num1, num2):
        return cls('Teddy', num1 + num2)

    @staticmethod
    def adding_things2(num1,num2): # no access to cls
        return num1 + num2

player_3 = PlayerCharacter.adding_things(5,20)
print(player_3.age)



class Character(object):
    def sign_in(self):
        print('logging in')

    def attack(self):
        print(' ')

class Wizard(Character): #Passing the parent class of Character into Wizard
    def __init__(self, name, power):
        self.name = name
        self.power = power

        Character.attack(self)
        print(f'Attacking with power of: {self.power}')

class Archer(Character):
    def __init__(self, name, arrows):
        self.name = name
        self.arrows = arrows

        Character.attack(self)
        print(f'Attacking with arrows: arrows left - {self.arrows}')


wizard1 = Wizard('Merlin', 50)
print(wizard1.sign_in())
print(wizard1.attack())

archer1 = Archer('Robin', 100)
print(archer1.sign_in())
print(archer1.attack())



# Proper Version


class Character:
    def sign_in(self):
        print('logging in')

    def attack(self):
        print('Basic attack')  # Default attack method


class Wizard(Character):
    def __init__(self, name, power):
        self.name = name
        self.power = power

    def attack(self):  # Override attack
        print(f'Attacking with power of: {self.power}')


class Archer(Character):
    def __init__(self, name, arrows):
        self.name = name
        self.arrows = arrows

    def attack(self):  # Override attack
        print(f'Attacking with arrows: arrows left - {self.arrows}')



# ENCAPSULATION

class BankAccount:
    def __init__(self):
        self.__balance = 0  # Private variable

    def deposit(self, amount):
        self.__balance += amount

    def get_balance(self):
        return self.__balance

acct = BankAccount()
acct.deposit(100)
print(acct.get_balance())  # ✅ Works
print(acct.__balance)      # ❌ Error



# ABSTRACTION

class Car:
    def start_engine(self):  # Hides the complexity
        print("Engine started")

my_car = Car()
my_car.start_engine()  # You don’t care *how* it starts, it just does



# INHERITANCE

class Animal:
    def speak(self):
        print("Makes sound")

class Dog(Animal):
    def speak(self):
        print("Bark")

dog = Dog()
dog.speak()  # Output: Bark



# POLYMORPHISM

class Cat:
    def speak(self):
        print("Meow")

class Dog:
    def speak(self):
        print("Bark")

def animal_speak(animal):
    animal.speak()

animal_speak(Cat())  # Meow
animal_speak(Dog())  # Bark
