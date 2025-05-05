package Composition;

public class Car {

    private Engine engine = new Engine(); //composition

    // Car controls the lifecycle of Engine

   //If the Car object is destroyed, the Engine it created and owns is also gone.
}
