public class Gorilla extends Mammal{
    
    public Gorilla(int energyLevel)
    {
        super(energyLevel);
    }

    public void throwSomething()
    {
        System.out.println("The Gorilla threw something.");
        energyLevel -= 5;
    }
    
    public void eatBanana()
    {
        System.out.println("The Gorilla ate a banana.");
        energyLevel += 10;
    }

    public void climb()
    {
        System.out.println("The Gorilla climbed the tree.");
        energyLevel -= 10;
    }
    
}
