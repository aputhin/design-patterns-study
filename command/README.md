# Command Design Pattern

### Contextualization / Problem

The client wants to defer execution of a method to a receiver, which can decide on the details of such execution (when, for instance).

### Intent

> Encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests, and support undoable operations.

### How does it work?

The starting point is a Command interface with a method signature for the execution handler (commonly ```execute```). For each deferred request, a new command object is instantiated accordingly and passed on to be handled and executed by the receiver.

***IT'S LIKE CALLBACKS, BUT OBJECT ORIENTED! FP FTW!***

### Pros

- 

### Cons

- 
