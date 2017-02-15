# ArDe-EECE437

This project contains classes to abstract data types and their operations.
In order to do so, the following classes were created:



In the Problem1 folder:

TAObject-from which all other classes derive 

TAInt, TADouble, TABool- primitive types

TAAnd, TAOr, TAXor, TANot, TAImplies, TALessThan, TAGreaterThan, TALessThan, TAEquals, TAPlus, TAMinus, TADivide, TAMultiply, TAFloor, TACeiling- operations on data types.

TAPlusInt, TAPlusDouble, TAMinusInt, TAMinusDouble, TADivideInt, TADivideDouble, TAMultiplyInt, TAMultiplyDouble, TACeilingInt, TAFloorInt, TACeilingDouble, TAFloorDouble, TALessThanInt, TALessThanDouble, TAGreaterThanInt, TAGreaterThanDouble, TAEqualInt, TAEqualDouble, TAEqualBool- Some operations on datatypes are overloaded (act on different datatype), which means that for the abstraction to work, different versions of the operator should be created, hence the necessity for these classes.

TAValue, TAIntValue and TADoubleValue- interfaces to restrict operations to one primitive type.

main- as the name suggests, the class main is used to test the statements.



In the Problem2 folder:

Because problem 2 only involved adding properties to the already existing classes, this folder only contains a class main2 to test these properties.




In the Problem3 folder:

TAPair- This class allows the instanciation of pairs of objects.

TAConstant- Contains a constant integer value. (May be modified to contain a double or boolean value if required).

TAArray- Class to instanciate array objects

TAArrayAccess- operator to access array elements
