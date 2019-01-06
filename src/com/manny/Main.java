package com.manny;

public class Main {

    public static void main(String[] args) {
	// Composition is another component of OOP and is very useful in day-to-day programming
    // Composition is modeling parts of the greater whole.
    // If you use the extends option in Java, you can only inherit from one Java class at a time
    // Obvious advantage to using Composition: The PC class comprises of three other classes:Case,
    // Monitor and Motherboard.  The PC is going to have the Objects we create based off the PC class
    // which will include Case, Monitor and Motherboard in each instance that we create.
        //Composition is creating Objects within Objects (Master Object = PC monitoring and looking
        // after using Composition as opposed to inheritance.
        // As a general rule when designing programs in Java, you probably want to look at composition first.

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case thecase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(thecase, theMonitor, theMotherboard);
        thePC.powerUp();
    }

    // Challenge!
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house, but furniture as well.
    // Add at least one method to access an object via a getter and
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class.
}
