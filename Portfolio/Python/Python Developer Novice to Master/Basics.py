# The full resource

# https://docs.python.org/3/library

# https://www.w3schools.com/python/python_ref_string.asp




# Data Types
# int
# float
# complex
# str
# bool
# list
# tuple
# set
# dict


#Operator precedence


#Similar to math, PEMDAS is the order of operations.
print()
print("_____________________")
print("Math Operations")
print("_____________________")
print((20-3+(2+2)*3-5**2)) # prints 4
print(2+2) # addition
print(2*2) # multiplication
print(2**2) # power
print(2/2) # division
print(2-2) # subtraction
print(3.14) # pi
print("And there are various trigonometric operators such as cos, tan, sin, Arc-tan etc.")


#Binary representation
print()
print("_____________________")
print("Binary Representation")
print("_____________________")
print(bin(5)) #prints 0b101
print(int('0b101', 2)) #converts from binary to int
print("_____________________")

# Variable use snake_case
print()
print("_____________________")
print("Variables and snake_case")
print("_____________________")
iq = 190
print('IQ:',iq)
print("_____________________")

# Expressions and statements
print()
print("_____________________")
print("Expressions and Statements")
print("_____________________")
this_is_a_statement = "The variable and the expression is the statement."
an_expression = "this last part inside of the quotations is an expression."
print(this_is_a_statement + " " + "And, " + an_expression)

# augmented assignment operator
print()
print("_____________________")
print("Augmented Assignment Operator")
print("_____________________")

some_num = 2 # assigns the variable some_num 2
some_num += 5 # some num prints 7
print(some_num)


# Strings
print()
print("_____________________")
print("Strings")
print("_____________________")

print("Hello World! is a:", type("Hello World!"))
print('Single quotes and' + " Double quotes both work." + " But using ' ' single quotes for a char is best practice.")


# Type Conversion

print()
print("_____________________")
print("Type Conversion")
print("_____________________")

a = "100"
b = int(a)
print(type(b))
print(b)



# Escape Sequences

print()
print("_____________________")
print("Escape Sequences")
print("_____________________")

double_quotes = "This is how we can use an apostrophe when using double quotes Max's."
quote_within_string = "This is a quote \"Within a string!\""
quote_within_string_and_new_line = "This is a quote \"Within a string!\" \nAnd, this is a new line!"
print(double_quotes)
print()
print(quote_within_string)
print()
print(quote_within_string_and_new_line)



# Formatted Strings

print()
print("_____________________")
print("Formatted Strings")
print("_____________________")

name1 = "Tom"
name2 = "Fran"
print(name1, " and ", name2) # this is not formatted
print(f"Hi {name1}. The love of your life is {name2}.") # Using f first, this is usually the easiest way to do this.
print()
print('Hi {}, the love of your life is {}'.format("Tom", "Fran.")) # empty brackets with .format
print()
print('Hi {}, the love of your life is {}'.format(name1, name2)) # empty brackets with.format and variables.
print()
print('Hi {1}, the love of your life is {0}'.format(name1, name2)) #prints Fran then Tom by calling the index.



# String Indexes

print()
print("_____________________")
print("String Indexes")
print("_____________________")

sentence = "mineminemine"
print(sentence[2:6:3]) # start:stop:step-over starts at 2 skips 3 = 5 ends at 6 doesn't print 6 gives ni
print(sentence[:4:])
print(sentence[::3])
print(sentence[-1:3:1]) # goes backwards
print(sentence[11:0:-1]) # prints this in reverse


# Some Built-In Functions
# Note that all can be found at the Python link at the start of this file

print()
print("_____________________")
print("Some Built-In Functions")
print("_____________________")

string1 = "Hello, how are you?"
print(len(string1))

for i in string1:
    print(i)

print(string1[0:5])
print(string1.upper())
print(string1.lower())
print(string1.capitalize())
print(string1.find('how'))
print(string1.replace('you?', 'poo!'))# creates a new string1 that has poo! instead of you!
# and then deletes it from memory.
print(string1) # prints the original variable string1



# Booleans

print()
print("_____________________")
print("Booleans")
print("_____________________")

new_name = "Tony"
is_cool = False
is_cool = True

print(new_name == "Tony", is_cool == False) # True, False




# Program that guesses your age and age calculator

is_Done = False

while is_Done == False:
    birth_year = input("What year were you born?")
    if birth_year == "1985":
        print("You guessed the correct year! Great Job")
        is_Done = True
    else:
        print("That is not the correct number.")

print()
print("_____________________")
print("Age Guesser and Name Calculator")
print("_____________________")


birth_year1 = input('What year were you born?')

birth_year1 = int(birth_year1)

age = 2025 - birth_year1

print(f"Your age is: {age}")




# Password Checker


print()
print("_____________________")
print("Password Checker")
print("_____________________")

username1 = input("Enter your username")
password1 = input("Enter a password") # this could be named original_Password or something
password1 = len(password1) * '*' # works for this challenge but later on we want to use a different variable
password_length = len(password1)



print(f'{username1}, your password {password1} is {password_length} letters long')



# LISTS

print()
print("_____________________")
print("LISTS")
print("_____________________")


li = [1,2,4,5,'a','b']
print(li)



# LIST SLICING

print()
print("_____________________")
print("LIST SLICING")
print("_____________________")

amazon_cart = [
    'Razor',
    'Pens',
    'Pencils',
    'Mouse Pad',
    'Computer Mouse',
    'Graphics Card',
    'Shoes'
]
print(amazon_cart)
amazon_cart.pop() # removes the last index
print(amazon_cart)
amazon_cart.append('Shoes')
print(amazon_cart)
new_cart = amazon_cart[0:6:3] # razor, mousepad
print(new_cart)


# Matrix, (THESE ARE CALLED LISTS IN PYTHON).

print()
print("_____________________")
print("MATRICES")
print("_____________________")

matrix1 = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
    [[10,11,12], 13, 14, 15, [16, [17, [18]], 19], 20]
]

print(matrix1)
print(matrix1[3][5]) # prints 20
print(matrix1[3][4][1][1]) # prints 18



# LIST METHODS

print()
print("_____________________")
print("LIST METHODS")
print("_____________________")

basket = [1,2,3,4,5,6,7,8,9,10]
basket.append(11)
print(basket)
basket.pop()
print(basket)
new_list = basket.append(12) # this will print none because according to python there is no basket.
print(new_list)
basket.append(12)
new_list = basket # now this will print the same list as basket.
print(new_list, type(new_list)) # this prints 12 12 at the end because if you look at the code
# we actually appended 12 to the basket list twice. Once when we ran new_list = basket.append(12)
# and a second time when we did basket.append(12) AFTER the print(new_list) that prints "None"
# hence we get 12, 12 at the end of the list.

# we can also use extend, or insert.

print(basket.count(3))
print(3 in basket)
basket.sort()
print(basket)
basket.reverse()
print(basket)
basket.sort()
print(basket)
print(list(range(100)))



# List Unpacking and String or List Join

list2 = ['hi', 'my', 'name', 'is']
empty_space = ' '
list3 = empty_space.join(list2)
print(list3)

a1, b1, c1, d1 = [1,2,3,4]
print(a1,b1,c1,d1)
a1, b1, c1, d1, * rest_of_list = [1,2,3,4,5,6,7,8,9,10]
print(a1,b1,c1,d1)
print(rest_of_list)


# None

weapons = None # in the case of a video game character starting with no weapons
print(weapons)



# DICTIONARY, they are now ordered, however, they used to be unordered
# and still are from a programming perspective

dictionary = {
    'a': 1, # 'key': value
    'b': 2, # 'key': value
    'c': 3  # 'key': value
} # the value can be string, int, float, bool, etc.

print(dictionary['c'])

list_dict = [{
    'a': [1,2,3],# 'key': value
    'b': 'hi', # 'key': value
    'c': True  # 'key': value
},
{
    'a': [4,5,6], # 'key': value
    'b': 'No', # 'key': value
    'c': False  # 'key': value
},
{
    'a': [7,8,9], # 'key': value
    'b': 'Yes', # 'key': value
    'c': True # 'key': value
}]

print(list_dict[2]['b'])



# DICTIONARY METHODS


user = {
    'basket': [1,2,3],
    'greet': 'hello',
    'age': 40
}

user2 = {
    'basket': [1,2,3],
    'greet': 'hello',
}

print(user.get('age'))
print(user2.get('age', 50)) # gives a default value of 50 and a default key of age if it doesn't exist.

# secondary way

user3 = dict(name2 = 'Anthony')
print(user3)

print('Anthony' in user3)
print('Anthony' in name2)



# TUPLES

this_tuple = ('hello', 123, True, False, 1.5, 'Run')
print(this_tuple) # we cannot change the values of this_tuple
# we would have to convert it to a list then change it and convert it back, if possible.

this_tuple2 = list(this_tuple)
print(type(this_tuple2)) # now we could change it, and assign it


user3 = {
    (3,100): [1,2,3],
    'greet': 'hello',
    'age': 40
}

print(user3[(3,100)]) # prints [1,2,3]

x2,y2,z2,*left_over = (1, 3, 7, 8,9,0,15, 'hello', True)
print(left_over)




#  SETS


my_set = {1,2,3,4,5,6,7,8} # unordered collection of unique objects
my_set.add(True)
my_set.add(500)
print(my_set)

my_set2 = [1,2,3,4,4,4,4,5,6,7]
print(my_set2)
print(set(my_set2))

my_set3 = {1,2,3,4,5}
my_set4 = {5,6,7,8,9,10}
print(my_set3.difference(my_set4))





def mystery(x):
    return x * 2 if x > 5 else x + 2
print(mystery(3)) # prints 5

# is_palindrome = list(input("Input a word to check if it's a palindrome!"))
def palindrome(palin):
    palindrome_check = list(palin)
    reversed_list = palindrome_check[:]
    reversed_list.reverse()
    return palindrome_check == reversed_list
print(palindrome('madam'))


# Tuples are immutable while lists are mutable

my_list = [1,2,3]
print(my_list[-1])

x1 = [1,2,3]
y1 = x1
y1.append(4)
print(x1)

# [1,2,3,4]

print(*range(0,22,2))


class Rectangle:
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

    def is_square(self):
        return self.width == self.height

box = Rectangle(6,7)
print(box.area())
print(box.is_square())

rec = Rectangle(7,7)
print(rec.area())
print(rec.is_square())






is_old = True
is_licensed = True

if is_old:
    print("You are old enough to drive")
elif is_licensed:
    print("You can drive now")
else:
    print("You are not old enough to drive")

print("okoko")


# Truthy and Falsy

print(bool("Hello")) #Truthy
print(bool("")) #Falsy
print(bool(5)) #Truthy
print(bool(0)) #Falsy

password = '123'
username = 'Antman'

if password and username:
    print("Truthy!")




is_magician = False
is_expert = True

if is_magician and is_expert:
    print("You are a master magician")


is_magician = False
is_expert = True

if is_magician and is_expert:
    print("You are a master magician")

elif is_magician and not is_expert:
    print("At least you're getting there")

elif not is_magician:
    print("You need magic powers")


a = [1,2,3]
b = [1,2,3]

print(a == b)
print(a is b)
print('1' is 1)
print('1' == 1)


for char in 'Zero to Mastery':
    print(char)

for i in range(1,10,1):
    for j in 'Mastery':
        for q in 'Love':
            print(i,j,q)


iterable_dict = {
    'name': 'Magico',
    'age': 'limitless',
    'face': 'smashed'
}

for key in iterable_dict.keys():
    print(key)

for value in iterable_dict.values():
    print(value)

for items in iterable_dict.items():
    print(items)


for key, value in iterable_dict.items():
    print(f"{key} => {value}")


characters ={
    'Magico': { # name
        'age': 'limitless', # details
        'power': 'Time Warp', # details
        'rank': 'S+' # details
    },
    'Athane': {
        'age': 3000,
        'power': 'Starfire Edge',
        'rank': 'A'
    },
    'Ongrin': {
        'age': 99999,
        'power': 'Elder Scrolls',
        'rank': 'SS'
    },
    'Gensho': {
        'age': 20000,
        'power': 'Reality\'s Edge',
        'rank': 'SS+'
    },
    'Jordak': {
        'age': 'Unknown',
        'power': 'Unknown',
        'rank': 'Unknown'
    }
}

for name, details in characters.items():
    print(f"\n{name}'s Stats:")
    for stat, value in details.items():
        print(f" {stat}: {value}")



# Tricky Counter

tricky_counter_list = list(range(1,11,1))
list_sum = 0
for i in tricky_counter_list:
    list_sum += i
    print(i)
print("The sum of the list items is: ", list_sum)



# RANGE()

my_range = range(1,100,1)
print(my_range)

my_range1 = list(my_range)
for num in my_range1:
    if num % 2 ==0:
        print(num)


my_range = range(100, 0,-1)
my_range1 = list(my_range)
for num in my_range1:
    if num % 2 == 0:
        print(num)




# ENUMERATION

for char in enumerate('Hello'):
    print(char)

for i,item in enumerate(list(range(100))):
    if item == 90:
        print(f'index of 90 is {i}')


# WHILE LOOPS, will continue running until condition is met

i = 0

while i < 50:
    print(i)
    i += 1
else:
    print('done')

while True:
    response = input("Say bye: ")
    if response.strip().lower() == 'bye':
        break

continue_list = [1,2,3]
for item in continue_list:
    print(item)
    continue
    print(item)


#  FIRST GUI

# EXERCISE

picture = [
    [0,0,0,1,0,0,0],
    [0,0,1,1,1,0,0],
    [0,1,1,1,1,1,0],
    [1,1,1,1,1,1,1],
    [0,0,0,1,0,0,0],
    [0,0,0,1,0,0,0]
]

for item in picture:
    for sub_item in item:
        if sub_item == 0:
            print(" ", end="")
        else:
            print("*", end="")
    print()


picture = [
    [0,0,0,0,1,0,0,0,0],
    [0,0,0,1,1,1,0,0,0],
    [0,0,1,1,1,1,1,0,0],
    [0,1,1,1,1,1,1,1,0],
    [0,0,0,0,1,0,0,0,0],
    [0,0,0,0,1,0,0,0,0]
]

for item in picture:
    for sub_item in item:
        if sub_item == 0:
            print("*", end="")
        else:
            print(" ", end="")
    print()

picture = [
    [0,0,0,1,0,0,0],
    [0,0,1,1,1,0,0],
    [0,1,1,1,1,1,0],
    [1,1,1,1,1,1,1],
    [0,0,0,1,0,0,0],
    [0,0,0,1,0,0,0]
]

for row in picture:
    for pixel in row:
        if pixel == 1:
            print("*", end="")
        else:
            print(" ", end="")
    print()  # move to the next line

some_list = ['a', 'b', 'c', 'd','a', 'b', 'b', 'd', 'd']

some_list2=set(some_list)
print(some_list)
print(sorted(list(some_list2)))


some_list = ['a', 'b', 'c', 'd','a', 'b', 'b', 'd', 'd']
unique_list = []

for item in some_list:
    if item not in unique_list:
        unique_list.append(item)
print(sorted(unique_list))

some_list = ['a', 'b', 'c', 'd','a', 'b', 'b', 'd', 'd']

some_list=set(some_list)
print(sorted(set(some_list)))

# as a one liner
print(sorted(set(['a', 'b', 'c', 'd','a', 'b', 'b', 'd', 'd'])))




# FUNCTIONS

def sort_set():
    print(sorted(set(['a', 'b', 'c', 'd','a', 'b', 'b', 'd', 'd'])))
sort_set()
sort_set()
sort_set()
sort_set()

def funct_name(param1, param2): # Positional argument, you can use param1 = <insert whatever> to have a default value
    print(f'You are doing great in python {param1}. Keep it up! {param2}')

funct_name('Anthony!', '(@\'_\')=@ * (X_X)')
funct_name('John!', '(@\'_\')=@ * (X_X)')
funct_name('Lisa!', '(@\'_\')=@ * (X_X)')
funct_name('Emily!', '(@\'_\')=@ * (X_X)')

# Keyword argument, considered bad practice by many

funct_name(param2 = '(O_O)', param1 = 'Ben')


# RETURN

def sum(n1, n2):
    return n1 + n2

def sub(n1, n2):
    return n1 - n2

def mult(n1,n2):
    return n1*n2

def div(n1,n2):
    return n1/n2

def modulus_Op(n1,n2):
    return n1 % n2

print(sum(1,5))
print(sub(1,5))
print(mult(1,5))
print(div(1,5))
print(modulus_Op(10,5))



def checkDriverAge(age = 0):
    if int(age) < 18:
	    print("Sorry, you are too young to drive this car. Powering off")
    elif int(age) > 18:
	    print("Powering On. Enjoy the ride!");
    elif int(age) == 18:
	    print("Congratulations on your first year of driving. Enjoy the ride!")

checkDriverAge(30)

#1. Wrap the above code in a function called checkDriverAge(). Whenever you call this function, you will get prompted for age.
# Notice the benefit in having checkDriverAge() instead of copying and pasting the function everytime?

#2 Instead of using the input(). Now, make the checkDriverAge() function accept an argument of age, so that if you enter:
#checkDriverAge(92);
#it returns "Powering On. Enjoy the ride!"
#also make it so that the default age is set to 0 if no argument is given.




#  *args, **kwargs

# rule :  params, *args, default params, **kwargs