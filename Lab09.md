* Create a package __com.jpmc.lab09__
* Create a __Counter__ class that will have a value initialized to 0.
* The value can be __incremented__ or __decremented__
* The value can be from circles between __0 to 3__.
* If the value is 0 and you decrement, the value becomes 3
* If the value is 3 and you increment, the value becomes 0
* Counter maintains a total number of objects created.

* Here's how the output will look like

```

> Enter 'n' to create a new Counter object, 'i' to increment, 'd' to Decrement, 'c' for object count, 'q' to quit.

> n
_Counter object created_
> i
_Counter value: 1_
> i
_Counter value: 2_
> d
_Counter value: 1_
> d
_Counter value: 0_
> d
_Counter value: 3_
> n
_Counter object created_
> c
_Object count: 2_
> i
_Counter value: 1_
> ZZ
__Invalid input.__ 
Enter 'n' to create a new Counter object, 'i' to increment, 'd' to Decrement, 'c' for object count, 'q' to quit.
> q
_Bye bye_

```