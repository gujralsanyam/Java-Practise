package InterfaceExample;

public class Dog implements TestInterface, Speed {

    private int legs;

    @Override
    public void getSpecies() {
        System.out.println("Different dogs has different species");
    }

    @Override
    public void sound() {
        System.out.println("Different dogs species has different sounds");
    }

    public void SetHeight()
    {
      System.out.println("Printing the height"+ Height);
    }

    public void getLegs()
    {
        legs=4;
        System.out.println("Printing the dogs leg"+ legs);
    }

    @Override
    public void getSpeed() {
     System.out.println("The Dog is running 5km per hour");
    }
}


