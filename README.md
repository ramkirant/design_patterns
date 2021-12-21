# Design Patterns

## Creational Design Patterns

### Factory Pattern
As per factory pattern, we create an interface or an abstract class and let the subclasses decide which class to initiate. 
The Factory Pattern is also called as Virtual Constructor. 

#### Advantages
It promotes loose coupling. 

### Usage
When we have to choose between a group of similar objects as per a certain criteria


### Abstract Factory Pattern
Abstract Factory Pattern is also called as factory of factories. While factory pattern returns from a group of similar objects, abstract factory pattern returns from a group of similar factories. 

### Singleton Pattern
As per singleton pattern, we create a class that has only one instance to it and provide a global point of access to it. In other words, the class should ensure that only a single instance of it is created and used by all other classes. There are two types of singleton design patter
1. Early Instantiation
2. Lazy Instantiation

### Advantages
Only one instance of the object is created and thus memory is saved

### Usage
Singleton pattern can be used to create non functional classes whose behavior don't change with data across the application. It is usually used for logging, auditing or to mention common functionality.
We can make a certain class as singleton by making the constructor private and define a static object of the class inside the class itself.
### Prototype Pattern
### Builder Pattern