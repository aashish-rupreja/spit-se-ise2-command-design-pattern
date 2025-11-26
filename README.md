Compiled in Java 21

Definition:
Command Design Pattern is a behavioral pattern that encapsulates a request as an object, decoupling the sender from the receiver. It allows requests to be queued, logged, parameterized, or undone/redone, providing flexibility and extensibility in executing operations.

Breaking down the definition:
1. encapsulates a request as an object
    TVSwitchOnCommand, TVSwitchOffCommand

2. decoupling the sender from the receiver
    Sender is the Main class, it doesn't know the specifics of how the TV is switched on/off, it just knows that on pressing the button on slot 0 switches the TV on/off

3. It allows requests to be queued, logged, parameterized, or undone/redone
    PENDING