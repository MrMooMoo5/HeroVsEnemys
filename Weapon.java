public class Weapon {
    /////////////////////////////////////////////////////
    // Instance Variables
    /////////////////////////////////////////////////////
    private String name;
    private int speed;
    private int defence;
    private int baseDamage;
    private int cost;
    private int range;
    private boolean mage;
    /////////////////////////////////////////////////////
    // Constructors - add as you see fit
    /////////////////////////////////////////////////////

    // Default Constructor
    public Weapon() {
        this.name = "Firey Fists of Fury";
        this.speed = 3;
        this.defence = 100;
        this.baseDamage = 100;
    }

    // Constructor with all parameters
    public Weapon(String name, int baseDamage, int speed, int defence) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.speed = speed;
        this.defence = defence;
        
    }
    public Weapon(String name, int baseDamage, int speed, int cost, boolean mage) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.cost = cost;
        this.speed = speed;
        this.mage = mage;
    }

    /////////////////////////////////////////////////////
    // Methods
    /////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int durability) {
        this.defence = defence;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}