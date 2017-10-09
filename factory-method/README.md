# Factory Method Design Pattern

### Contextualization / Problem

A class can't anticipate the class of objects it must create.

### Intent

> Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

### How does it work?

For a given class, a Factory class is created - which may be a [**Singleton**](http://github.com/aputhin/java-sandbox/tree/master/design-patterns-study/creational-patterns/singleton) or even a ```static class```. Whenever an instance of the subject class has to be created, the factory is called, instead of a constructor.

The factory method may receive, as a parameter, an indicator of which sub-class should be instantiated, when applicable. The generic class properties can be passed down as parameters as well, but this is also not required for the pattern.

### Pros

- Effective when a class can assume many different shapes;
- Abstracts away construction logic, hiding it from client classes.

### Cons

- Depending on how complex the class instantiation is, or how its' subclasses differentiate, the factory may just become another layer of abstraction, not really avoiding any pitfalls.
