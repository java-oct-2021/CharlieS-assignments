public class Mammal {
    protected int energyLevel;
    
    public Mammal(int energyLevel){
        this.energyLevel= energyLevel;
    }
    
    public int displayEnergy() {
        System.out.println("Energy Level: " + this.energyLevel);
        return this.energyLevel;
    }
    
    }
