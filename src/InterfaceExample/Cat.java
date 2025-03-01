package InterfaceExample;

public class Cat implements TestInterface {
    private int legs=0;

    @Override
    public void getSpecies() {
        System.out.println("Different cat has different species");
    }

    @Override
    public void sound() {
     System.out.println("Meow");
    }
    @Override
    public void getLegs()
    {
        legs=4;
        System.out.println("Printing the Cat legs" + legs);
    }

}
