# Design Patterns

## Creational Design Patterns

### Factory Pattern
As per factory pattern, we create an interface or an abstract class and let the subclasses decide which class to initiate. 
The Factory Pattern is also called as Virtual Constructor. 

#### Advantages
It promotes loose coupling. 

#### Usage
When we have to choose between a group of similar objects as per a certain criteria


### Abstract Factory Pattern
Abstract Factory Pattern is also called as factory of factories. While factory pattern returns from a group of similar objects, abstract factory pattern returns from a group of similar factories. 

### Singleton Pattern
As per singleton pattern, we create a class that has only one instance to it and provide a global point of access to it. In other words, the class should ensure that only a single instance of it is created and used by all other classes. There are two types of singleton design patter
1. Early Instantiation
2. Lazy Instantiation

#### Advantages
Only one instance of the object is created and thus memory is saved

#### Usage
Singleton pattern can be used to create non functional classes whose behavior don't change with data across the application. It is usually used for logging, auditing or to mention common functionality.
We can make a certain class as singleton by making the constructor private and define a static object of the class inside the class itself.

### Prototype Pattern
This pattern is used when we need to take a copy of a heavy weighted object. Prototype pattern creates a duplicate object keeping the performance in mind. For the object that we want to close, we create an abstract class implementing clonable. All the child classes of this abstract class can be cloned using the clone() method of the super class.

### Builder Pattern
Builder pattern builds complex objects using simple objects by following a step by step approach. 

## Structural Design Patterns
### Adapter Pattern
Adapter Pattern is used to bridge between two incompatible interfaces. This pattern involves creating a single class which joins the functionality of both the interfaces.

AdvancedMediaPlayer interface containing two methods. playVlc, playMp4
VlcPlayer implementing AdvancedMediaPlayer. Add implementation for Vlc
Mp4Player implementing AdvancedMediaPlayer. Add implementation for Mp4.

Here VlcPlayer and Mp4Player are the incompatible interfaces. 
Create a MediaBridge interface with only a play method.
Create MediaBridgeImpl implementing MediaBridge interface. MediaBridgeImpl will contain one attribute of AdvancedMediaPlayer. 
In the parameterized constructor of MediaBridgeImpl, instantiate AdvancedMediaPlayer with either VlcPlayer or Mp4Player based on audio type.
In the play method, pass the file to be played, play the relevant format based on audioType.
### Bridge Pattern
Bridge pattern can be used when we want to decouple an abstraction from its implementation so that the two can vary independently. 

Bridge pattern can be used to progressively add new functionality while seperating out major differences using abstract classes.  

### Filter / Criteria Pattern
Filter Pattern or Criteria Pattern is a design pattern that enables the developers to filter a set of objects using different criteria classes. These criteria classes can be chained to enable complex criteria queries.
Person class with attributes name, gender and maritalStatus

Criteria interface with a single method meetCriteria
CriteriaMale implementing Criteria with meetCriteria method filtering only male
CriteriaFemale implementing Criteria with meetCriteria method filtering only female
CriteriaSingle  implementing Criteria with meetCriteria method filtering only single
AndCriteria implementing Criteria. Here, in the constructor pass two arguments (for example CriteriaMale and CriteriaSingle). In meetCriteria. Filter with first criteria and filter the resultant set with second criteria.

### Composite Pattern
Composite Pattern involves creating a class that contains a group of objects belonging to the same class. This pattern is used to represent a hierarchical structure such as Employee and his subordinates.

### Decorator Pattern
Decorator Pattern involves adding additional functionality to existing objects without altering its structure. This pattern involves creating a decorator class which wraps the original class and provide new functionality. 

Shape interface with a method draw
Circle implementing Shape
Rectangle implementing Shape

Create a ShapeDecorator abstract class implementing Shape. This has a single parameter called decoratedShape.
Create a RedShapeDecorator extending ShapeDecorator. Add a new method called color and color the shape with Red colour. 

### Facade Pattern
Facade Pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. 

### Flyweight Pattern

### Proxy Pattern

## Behaviorial Deisgn Patterns
### Chain of Responsibility Pattern
Chain of Responsibility Pattern creates a chain of receiver objects. In this pattern, generally, a receiver contains a reference to the next receiver. If the current receiver is not able to handle the request, the request is sent to the next Receiver. (Check code for implementation)

### Command Pattern
The command design pattern is a behavorial design pattern in which an object is used to encapsulate all the information required to call a method at a later time. The information includes the method name, the object that owns the method and the values for the method parameters. 

Command Pattern allows us to store lists of code that is executed at a later point of time or many times. Command pattern supports undoable operations. In command design pattern, when we define a command, we also define the inverse of the command. 

Command Pattern comes with two types of classes. 1. Invoker 2. Receiver
Invoker class invokes the command (or a list of commands) which gets executed on the Receiver. 

Command Pattern generally contains an interface (ICommand) which contains two methods. execute(), unexecute(). 

Invoker contains a list of (ICommand) as an argument. 

Implementations of ICommand (Command) has the receiver as an argument. This way, the command object will have full access to the receiver object to perform actions. These implementations implement the methods execute() and unexecute() which does the required actions on the receiver object.  

### Interpreter Pattern
Interpreter is used to convert one representation of data into another. Interpreter is useful if combined with java reflection techniques. Interpreter pattern is mainly comprised of 3 pieces. 
1. Context
Context contains the information that needs to be interpreted (converted).  

2. Expression
Expression is an abstract class that contains all the methods that are required to perform the conversion.
 
3. Terminal or Concrete Expressions
Terminal or Concrete Expressions provides specific implementations of the Expression abstract class. 

### Iterator Pattern
Iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. 

Iterator pattern allows us to iterate over multiple types of lists without actually worrying about the concrete implementation of the  list. For example, we should be able to iterate over a list or an arraylist using the same iterator. 

Collections in Java or C# implements the iterator pattern. 

Iterator pattern can be used to iterate over any type of pre-defined or user-defined collections.
Iterator pattern will not give us all the elements of the list at once. It instead, provides the elements one after the other. This encapsulates the underlying representation of the list. 

Iterator pattern provides lazy evaluation. The entire list need not be ordered / fetched at once as we provide only one element at a time. 

Using Iterator pattern, we can keep track of where we are in the iteration, pause it whenever we want and continue whenever we want. We can also achieve this using indexes in loops, but this is far more simple in the iterator pattern.

Iterator pattern contains the below elements
1. Iterable: The aggregate object which is required to be iterated.
2. Concrete Iterable: Concrete Iterable implements Iterable.
3. Iterator: The object which iterates the Iterable.
4. Concrete Iterator: Concrete Iterator implements the Iterator. 

Methods in Iterable:

Iterator getIterator()

Methods in Iterator:
1. boolean hasNext()
2. void next()
3. Item current()

getIterator is a factory method which makes the Iterable class a factory class? 

![Picture1](https://user-images.githubusercontent.com/65855896/148752119-11489d2e-7311-4986-be4b-4f226aa4cbe7.jpg)


Client uses Iterable and Iterator.
 
### Mediator Pattern
### Memento Pattern
### Observer Pattern
### State Pattern
### Strategy Pattern
Strategy pattern solves the composition problem (Code duplication) that is introduced by Inheritance. If multiple sub classes of a parent class has the same implementation of a parent method that is different from the parent method, we can only achieve this by duplicating the code in each of the sub classes. 

Strategy pattern solves the above problem. Strategy pattern decouples the behavior from objects. In Strategy pattern, we identify different and unique types of behaviors that all the child classes can possess and we define them in the implementations of a separate strategy interface. We plugin the strategy interface in the parent class instead of the behavior methods.

We can further extend the strategy pattern by providing strategies for every method available in the parent class. By doing so, we will be eliminating the need to define concrete sub classes and we eliminate the entire need for inheritance itself. We will be eliminating the inheritance and replacing it with max and max of multiple strategy classes, with each mix and max defining a separate concrete class. 

Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangable. Strategy lets the algorithms vary independently from the clients that use it. 
Strategy pattern decouples the algorithms from the client that use it.
Strategy pattern is about using composition rather than inheritance. Inheritance is not intended for code reuse. 

![Strtegy](https://user-images.githubusercontent.com/65855896/149647227-aa5c971e-207e-4046-9e84-3309fd46252f.jpg)

### Template Pattern
### Visitor Pattern
