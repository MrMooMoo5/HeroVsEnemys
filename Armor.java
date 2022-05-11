public class Armor {
    private String name;
    private int defence;
    private int mana;
    
    public Armor(){
        this.name = "Plain Cloths";
        this.defence = 2;
        this.mana = 50;
    }
    public Armor(String name, int defence, int mana){
        this.name = name;
        this.defence = defence;
        this.mana = mana;
    }
    
    public int getDefence(){
        return defence;
    }
    
}