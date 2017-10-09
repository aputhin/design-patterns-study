# Proxy Design Pattern

### Contextualization / Problem

You need to control access to an object, because of either expensive instantiation or some other validation that has to be applied before providing access to it.

### Intent

> Provide a surrogate or placeholder for another object to control access to it.

### How does it work?

The proxy provides a layer of abstraction for one or more objects, and any class willing to access said object should communicate with the proxy instead. The proxy itself may store a representation of the respective object or keep a collection of represented objects.

### Pros

- Helps preventing access to remote objects, keeping a local representative (Remote Proxy);
- Helps preventing repeating expensive operations like I/O (Virtual Proxy);
- Provides a validation layer for controlled access (Protection Proxy);
- Easy to apply middleware.

### Cons

- May disguise resources already instantiated as available or updated when they are not.
