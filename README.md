# ArDe-EECE437

This project contains classes to abstract data types and their operations.
In order to do so, the following classes were created:



In the Problem1 folder:

TAObject-from which all other classes derive 

TAInt, TADouble, TABool- primitive types

TAAnd, TAOr, TAXor, TANot, TAImplies, TALessThan, TAGreaterThan, TALessThan, TAEquals, TAPlus, TAMinus, TADivide, TAMultiply, TAFloor, TACeiling- operations on data types.

TAPlusInt, TAPlusDouble, TAMinusInt, TAMinusDouble, TADivideInt, TADivideDouble, TAMultiplyInt, TAMultiplyDouble, TACeilingInt, TAFloorInt, TACeilingDouble, TAFloorDouble, TALessThanInt, TALessThanDouble, TAGreaterThanInt, TAGreaterThanDouble, TAEqualInt, TAEqualDouble, TAEqualBool- Some operations on datatypes are overloaded (act on different datatype), which means that for the abstraction to work, different versions of the operator should be created, hence the necessity for these classes.

main- as the name suggests, the class main is used to test the statements.


In the Problem2 folder:

Because problem 2 only involved adding properties to the already existing classes, this folder only contains a class main2 to test the architecture.




In the Problem3 folder:

TAPair- This class allows the instanciation of pairs of objects.
