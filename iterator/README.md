# Iterator Design Pattern

### Contextualization / Problem

You have a collection of objects (or some other aggregation structure), and your client has to access these objects without knowing how this collection is structured.

### Intent

> Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

### How does it work?

You provide a separate iterator class, which is responsible for two main things: Validating if the there is another element available in the sequence (a.k.a. has next); Providing access for that element (a.k.a. return the next).

### Pros

- Favors immutability in the aggregate structure;

### Cons

- 
