
## Class Hierarchy

There exist 2(two) root objects which are **Human** and **Vehicles** these are meant to represent pieces of the simulation that differ on the most fundamental of levels

The following is meant to represent the Hierarchy based on the level of the cascade the object is situated

> Human 
>>Traveler  

>>Personal
>>>Pilot  
>>>Security

>Vehicles
>>Ground
>>>Vehicle
>>>>Car  
>>>>Hoverboard  

>>Flying  
>>>Airplane  
>>>Helicopter

### Object Description

The Objects that I defined include the people and vehicles meant for transportation you might find at an airport, all centered around the atomic goal of such an infrastructure: flying planes, thus there are passangers and pilots all interacting with the plane and secondary actors like security and cars. For Vehicles there 2(two) abstract classes: Ground and Flying meant to indicate the fundamental separation between the vehicles at an airport.

### The logic

First of all I have implemented the code in such a way that only a pilot object can fly an airplane no passanger or security can do just that also there exists a method for Travelers to be deported so that they cannot board a plane afterwards. The fields are also somewhat characteristic, a plane has unique ID and fuel stat, travelers document ID and some generic attributes like age, name and surname which all that inherit from Human class have. I have tried to implement generic attributes for the parent classes adding more descriptive attributes and methods on the descending levels. 