# Facade-Pattern-Team-4
Topic: The Façade Pattern 

Presented by Team 4 (in alphabetical order): Ziqi Fo, Xueyi Xie, Louie (Haobo) Zhang 

The Façade Pattern, as its name suggests, provides a front-facing side to clients and hides the complex subsystems behind the scenes, just like a building’s façade hides the rooms and facilities inside of the building.  

Façade Pattern is when there are complicated code structures, a single interface is used to represent certain functionalities of the subsystems while preserving their functionalities, and the client does not have to know the details of the implementation. For example, when we turn on our personal computer, there are a lot of things happening behind the scenes, such as the CPU starts, the hard drive is read, the memory is loaded, etc. These happen altogether as we give out the single instruction to turn on the PC, and we do not have to know the details of how this is done at lower levels.  

A façade object can have the following features:  

Process a series of operations involved with a fixed range of subclasses.  

We can add functionalities to the façade interface.  

The façade object does not encapsulate the subsystems.  

One subsystem can have multiple façade objects.  

Achieve loose coupling between the client and the subclass by enhancing maintainability, extensibility, testability, and reusability.  

It is a good idea to use this pattern when you want to mask a complex subsystem while still being able to access the subsystem’s full functionality. All the implementation details are hidden from the client, and the Façade provides a much simpler interface to users.  

Our code exemplifies the implementation of the Façade design pattern, which provides a simplified interface to a complex subsystem of classes. This is accomplished through the use of the "FacadeLivingRoom"(FacadeLivingRoom.java) and "FacadeBedroom"(FacadeBedroom.java) classes that encapsulate a series of operations involving a fixed range of subclasses, including "Light" (Light.java), "Curtain" (Curtain.java), "Speaker" (Speaker.java, NewSpeaker.java, OldSpeaker.java), and "Monitor" (Monitor.java). In the "FacadeLivingRoom" class, methods such as "sleep()", "work()", and "movie()" control other appliance classes like "Light", "Curtain", "Speaker", and "Monitor" accordingly depending on our need and the implementation details of the appliance classes. For example, in the sleep() method, (lines 29-34, FacadeLivingRoom.java), we have the close() method from Curtain class (line 22, Curtain.java), off() method from Speaker interface (line 16, Speaker.java), off() method from Monitor class (line 22, Monitor.java), and off() method from Light class (line 22, Light.java). With the help of a Façade, a user can simply call the sleep() method from the Façade to achieve the effect that would normally require calling several different methods from several different classes.  

These Façade classes can also facilitate the addition of new functionalities without adversely affecting clients that use them. For example, the "work()" method in "FacadeBedroom" in lines 40-50 can operate differently depending on the time of the day, which is controlled by the "currentTime()" method, and this part of the method is independent of any of the subsystem classes.   

Moreover, the subsystem components are not encapsulated by the Façade classes and are still accessible to the client if the client wishes to use specific methods from the subsystem classes, thereby allowing for flexibility and extensibility. In line 45 of "Main.java", we have a stand-alone command to directly control the monitor to display family photos, a method from the Monitor class that is not included in any part of the Façade classes.  

In addition, multiple Façade objects can be created to control the same subsystem components, enabling different configurations in the system. For example, thetFacadeBedroom" class, we can import the same subclass objects as the "FacadeLivingRoom" class, and the control over the subsystem is achieved using two different Facade classes.  

Lastly, the use of the Façade pattern enables loose coupling between the client code and the subsystem components, enhancing maintainability, extensibility, testability, and reusability of the system. Clients interact with the subsystem components through the facade classes, abstracting the complexity of the subsystem, and changes in the subsystem components can be isolated within the facade classes without affecting the client code. This allows the client-facing code to be easily tested and extended without dealing with the complexities of the subsystem components.  

To test all the above features of the Façade design pattern, one can simply run the "main()" method in the "Main.java" file. In the main() method, we first call the sleep() method of the FacadeLivingRoom object to invoke the sleep mode. The output indicates the status of all appliances in the living room in different modes using this single method in the "FacadeLivingRoom" class. The second part of the main() method calls on the work() method of the FacadeLivingRoom  class. The output demonstrates how the same "work()" method operates differently depending on the time. Next, the monitor displays the family photo upon the displayFamilyPhoto() method from the Monitor class being called, proving that the subclass is not encapsulated and can still be accessed directly. The final part of the main() method has demonstrates how a component in the Façade method can be easily replaced. Here we replace an OldSpeaker object with a NewSpeaker object, and our Façade class works the same.   

Overall, the Façade pattern provides a high-level interface that abstracts and simplifies the usage of a subsystem with multiple components, allowing the client to interact with them indirectly. Additionally, the Façade pattern hides implementation details, promoting clean separation of concerns and encapsulation. This is especially beneficial when the internal implementation of a subsystem is subject to change.  

 

 

 

 
 

References:  

E. Freeman, E. Robson, K. Sierra, and B. Bates, Head First Design Patterns. Sebastopol, CA: O'Reilly Media, 2005.  

“Facade pattern,” Wikipedia, 26-Jan-2023. [Online]. Available: https://en.wikipedia.org/wiki/Facade_pattern#:~:text=The%20facade%20pattern%20(also%20spelled,complex%20underlying%20or%20structural%20code. [Accessed: 15-Apr-2023]. 

“Facade design pattern: Introduction,” GeeksforGeeks, 06-Feb-2023. [Online]. Available: https://www.geeksforgeeks.org/facade-design-pattern-introduction/. [Accessed: 16-Apr-2023]. 

W. by: baeldung, “Facade design pattern in Java,” Baeldung, 19-Sep-2022. [Online]. Available: https://www.baeldung.com/java-facade-pattern. [Accessed: 16-Apr-2023]. 

“Facade,” Refactoring.Guru. [Online]. Available: https://refactoring.guru/design-patterns/facade. [Accessed: 16-Apr-2023]. 

 
