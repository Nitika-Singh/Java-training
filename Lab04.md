* Create a class called __Account__ in a package __com.lab04__ that does the following. Don't worry about packages concept. Just use the IDE's facilities to create a package.

### Part I

* It has a balance that needs to be initialized with a value greater than 10000
* Methods to __deposit, withdraw__. If there isn't sufficient balance don't allow withdraw.
* You can withdraw only 3 times. After that you will be charged 0.5% of the amount as Fees.

* Create an object of __Account(20000)__ from main() in __AccountUser.java__ and call deposit twice and withdraw 5-6 times. Print the Balance


### Part II

* Implement a method __printStatement__ that prints the list of transactions performed. 
* This method will display the __account number, amount, type of transaction(Credit or Debit)__ and the __time__.
* Instead of using arrays, you can create an instance of __java.util.ArrayList__ and use methods like __size(), get()__ for storing the transactions. Sample code is here

``` java
//If you want to store a collection of strings
ArrayList<String> transactions = new ArrayList<>();
	
//If you want to store a collection of Transaction class objects
ArrayList<Transaction> transactions = new ArrayList<>();
	
transactions.add(...);
transactions.add(...);
transactions.add(...);

```

* Follow the basic design constructs in Java language in this lab.