# Singleton Design Pattern

### Contextualization / Problem

For a given class, there should be only one instantiated object of that class at any given point in time.

### Intent

> Ensure a class only has one instance, and provide a global point of access to it.

### How does it work?

By hiding away instantiation of a class, and providing a public getter method for its' instance, the class itself can guarantee it will only allow a single instance of itself to exist. Furthermore, it can be built only upon first call on the getInstance method, if lazy instantiation is considered useful for saving resources.

### Pros

- Favors lazy initialization and serialization;
- Useful for global state management.

### Cons

- Sometimes a static class may be enough (when no instance is actually needed, only methods).
