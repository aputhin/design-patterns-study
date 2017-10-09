# Prototype Design Pattern

### Contextualization / Problem

Creating a new object may be costly and/or complicated. Instead, you have a couple base objects you can use as base for new ones as needed.

### Intent

> Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

### How does it work?

The class should implement the ```Cloneable``` interface and ```@Override``` the ```clone()``` method publicly, exposing it.

Furthermore, the application may implement a [**Singleton**](http://github.com/aputhin/java-sandbox/tree/master/design-patterns-study/creational-patterns/singleton) or some other pattern that keeps track of the base object(s) (a.k.a. registry/cache) for specific use-cases.

### Pros

- Abstracts creation complexity;
- Works well with other creational patterns.

### Cons

- Classes with circular references can't really be cloned;
- If the base object is being used outside of the prototyping scope (i.e. being mutated), this could lead to unexpected behavior on its' children.
