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
### Interpreter Pattern
### Mediator Pattern
### Memento Pattern
### Observer Pattern
### State Pattern
### Strategy Pattern
### Template Pattern
### Visitor Pattern