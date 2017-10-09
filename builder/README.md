# Builder Design Pattern

### Contextualization / Problem

For a single class, you want to create different representation objects, but you can't do that with a single construction process.

### Intent

> Separate the construction of a complex object from its representation so that the same construction process can create different representations.

### How does it work?

Upon creation of a given object, instead of directly calling the class' constructor, a builder is instantiated and reduces each of its' target class properties to a setter method, which can be chained down. At the end of the process, the builder should return an instance object.

### Pros

- Specially powerful when dealing with Immutable objects;
- Prevents the anti-pattern of Telescoping Constructors;
- Explicit method calling makes it easy to keep track of properties being passed on to the builder;

### Cons

- May introduce unnecessary overhead when used with simple objects;
- Loss of static analysis;
- Hard to track mandatory properties.
