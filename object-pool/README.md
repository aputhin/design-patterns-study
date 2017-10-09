# Object Pool Design Pattern

### Contextualization / Problem

The cost of creating a object is high, the instantiation rate is high and the number of instances in use at any point in time is low.

### Intent

> Provide a cache for instantiated objects, tracking which ones are in use and which are available.

### How does it work?

A pool class should be used, implementing methods to create (eagerly or lazyly), check-in and check-out objects of its' kind, using data structures to keep track of currently available and in-use objects.

When needed, the client should require (check-out) an object from the pool, use it for whatever reason, and then return it (check-in) back to the pool.

### Pros

- Plays well with concurrency;
- Specially useful when dealing with I/O related objects, like database connections, socket connections, threads, LOBs, etc.
- Like other creational patterns, raises the level of abstraction of the pooled object, as the client doesn't need to know its' implementation.

### Cons

- Objects in the pool need their state managed closely, or have it be stateless;
- Objects checked-out have to be checked-in, otherwise they will not be available to other clients and will become wasted resource;
- May require a timeout to be set, to avoid having unnecessary resources allocated in the pool.
