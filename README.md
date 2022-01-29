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

Abstract Factory can be used when we have to use platform specific classes. For example, let us assume we have a factory of UI objects. We can create an abstract factory which contains factories of different operating system specific objects. We can have a factory of Windows UI objects and another factory of Mac OS UI Objects. We can create an abstract factory which returns either windows factory or Mac OS factory depending upon the OS.

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
Proxy pattern provides a surrogate or a placeholder for another object to control access to it. 

Using Proxy pattern, we interact with an object, by not directly using it, but by using another object which acts as a proxy to that object. 

Proxy pattern solves access related problems. By keeping a proxy in front of another object, we control how to access the object. 

There are three ways we can use proxy pattern.
1. Remote Proxy
Remote Proxy can be used to access an object that is remote. We can use this proxy to access an object that is on other server or on other namespace.
2. Virtual Proxy
Virtual Proxy controls access to a resource that is expensive to create. Virtual proxy is like caching. After retrieving an expensive object, we cache the object such that further retrievals of the object can happen from the cache.
3. Protection Proxy
Protection proxy can be used to control access management. Protection proxy provides access to user only the items that the user has access to. 

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
Observer Patter defines a one to many dependency between objects so that, when one object changes, all of its dependent objects are notified and updated automaticlly.

Observer Pattern can be used when the change in the state of an entity needs to be notified to range of subscribers. 

Observer Pattern mandates that the entity (Observable) needs to PUSH the change in state to the subscribers (Observers) rather than the observers POLL the observable to check the change in state.
### State Pattern
State Pattern allows an object to change its behavior when its internal state changes. The object will appear to change its class at runtime. 
State Pattern contains an object that behaves differently based on the state it is. In state pattern we replace a conditional with polymorphism. 

State Pattern can be used when we have an object which can be in different states and there are multiple actions which can move the object between different states.

In State Pattern, we delegate actions from the object to the state (interface) by defining each of the action in both the object and the interface. By doing so, we will force all the the different states (implementations of the state interface) to implement each and everyone of the actions. So, if any state don't handle any of the action, a compile error is thrown.

In the below UML Diagram, The Context is the object that can change states


### Strategy Pattern
Strategy pattern solves the composition problem (Code duplication) that is introduced by Inheritance. If multiple sub classes of a parent class has the same implementation of a parent method that is different from the parent method, we can only achieve this by duplicating the code in each of the sub classes. 

Strategy pattern solves the above problem. Strategy pattern decouples the behavior from objects. In Strategy pattern, we identify different and unique types of behaviors that all the child classes can possess and we define them in the implementations of a separate strategy interface. We plug-in the strategy interface in the parent class instead of the behavior methods.

We can further extend the strategy pattern by providing strategies for every method available in the parent class. By doing so, we will be eliminating the need to define concrete sub classes and we eliminate the entire need for inheritance itself. We will be eliminating the inheritance and replacing it with max and max of multiple strategy classes, with each mix and max defining a separate concrete class. 

Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangable. Strategy lets the algorithms vary independently from the clients that use it. 
Strategy pattern decouples the algorithms from the client that use it.
Strategy pattern is about using composition rather than inheritance. Inheritance is not intended for code reuse. 

![Strtegy](https://user-images.githubusercontent.com/65855896/149647227-aa5c971e-207e-4046-9e84-3309fd46252f.jpg)

### Template Pattern
The Template method pattern defines the skeleton of an algorithm, deferring some steps to subclasses. Template method pattern lets the subclasses redefine certain parts of the algorithm without altering the algorithm structure.

Template method pattern is used when some of the portions of the algorithm do not vary across sub classes. The not-varying part of the algorithm is defined in the base class ad the varying part of the algorithm is defined in the sub classes. 
 
Template pattern is a pattern about a method, which is not actually a method, but a template method. Template method is a method with some slots missing. These slots are required to be filled by the clients. As the clients fill these slots, the template method, becomes an actual method. 

Template pattern can be used when we have to design components which contains two types of parts, one that vary and one that don't vary. We create a template with the non varying parts and the clients fill in the varying parts. By creating a template for non varying parts, we would avoid duplication of code. 

We can implement template pattern by defining an abstract super class. This abstract super class will have the template method and a set of abstract methods which would be implemented by the super classes. Template method will call these abstract methods along with its own code non-varying code. We can make the template method as final so that its logic will not be modified by the sub classes.

Use template method pattern only when it is absolutely required. Use this pattern only if you are absolutely sure that the algorithm contains both non-variant parts and variant parts. Also, almost, all use cases of template pattern can be achieved using strategy pattern. We can make each non-variant and variant part of the code as a strategy. 

Another disadvantage of template pattern is that, we are using one slot of inheritance. If the language we code don't allow multiple inheritance, we will not be able to inherit any other super class.
### Visitor Pattern

# Some cool stuff
## Premature optimization
Don't try to solve a performance problem before we encounter the performance problem. 

## Code Readability Paradox
The more readable the code is, the less performant it would be. The more performant a code is, the less readable it would be.
