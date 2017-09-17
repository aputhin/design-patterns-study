# Chain of Responsibility Design Pattern

### Contextualization / Problem

When the client makes a request, the handler may vary, and it isn't known a priori which one will have to respond.

### Intent

> Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

### How does it work?

Ideally, the handlers should extend a base class to warrant the same chaining structure. Each one of them should have a pointer to the next one in the chain. 

The client sends a request to the root handler. Each handler in the chain does its' processing, checks if there's still processing to be done in the request, and when/if needed, pass it on to the next handler.

### Pros

- 

### Cons

- 
