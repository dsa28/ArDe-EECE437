The classes present in this folder describe the Type Abstraction hierarchy.

The hierarchy is built in a way to take advantage of object oriented programming properties,
especially polymorphihsm and is defined as follows:

1)TAObject is an abstract class from which all other classes inherit.
It defines functions which will be needed in all other classes such as:
*type() which returns the object's type
*copyType() which generates a new TAObject of the type of the TAObject being currently evaluted.
(This function will be used when evaluating arithmetic equations because the answer's type depends on the operand's types)

2)TAOperator inherits from TAObject but contains an attribute: TAObject value, which will hold the result of the operation.
This value's type defines the operation's type (which allows nested operations such as the one present in the example)
From TAOperator inherit the following classes:
*TAAddition
*TAMultiplication
*TADivision
*TAMinus
*TALessThan
*TAGreaterThan
*TAEquals
*TAImplies
*TAAnd
*TAOr
*TAXor
*TAFloor
*TACeiling
*TANot

with the appropriate constructors.
The constructors throw appropriate errors (TAException) when invalid arguments are passed
(Mixing types, or using types that do not support the operation)

**Note: TAMinus is both a unary and binary operator, but, because -x is equivalent to 0-x
we can define it as a binary operator and take care of this case in a constructor that only takes one argument**


3)We have our three data types:
TAInt (type="int")
TABool (type="bool")
TADouble (type="double")


4) The class main contains the method main() with the code that was used to test the abstraction.



Future developpement:
*The presence of the type() method (which returns a String) will be later used to make sure all the data in an array is from
the same type
*The fact that all classes inherit from TAObject helps in creating Pairs of different types.
*Finally, the list() method can be very easily implemented using recursion.

*In addition, my code seems to have a lot of redundency. I'm going to try fixing this issue as modifying or adding code for each class
is time consuming and not very efficient. (Without taking into consideration that it is very easy to forget modifying a class which could create bugs).