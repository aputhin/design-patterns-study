# Abstract Factory Design Pattern

### Contextualization / Problem

A class can’t anticipate the class of objects it must create/implement, and there are a few combinations of related classes that could be used together for each family.

### Intent

"Provide an interface for creating families of related or dependent objects without specifying their concrete classes."

### How does it work?

This pattern may be used one abstraction level above the [**Factory Method**](http://github.com/aputhin/java-sandbox/tree/master/design-patterns-study/creational-patterns/factory-method) pattern, but might as well be used alongside the [**Prototype**](http://github.com/aputhin/java-sandbox/tree/master/design-patterns-study/creational-patterns/prototype) pattern.

All factories must ```implement```/```extend``` the same ```interface```/```abstract class``` that provides the outline for the base class construction. The abstract factory itself is responsible for defining which factory will be used, and setting up the relationship between the objects created as needed.

### Pros

- Provides a higher abstraction level over Factory Method;
- Hides away construction from the client;
- Allows for complex object interactions.

### Cons

- Makes use of dependency injection, which can lead to runtime errors that would have been caught at compile time otherwise;
- Inherits most of the cons of using interfaces or abstract classes (i.e. some changes must be replicated among all implementations of a class).
