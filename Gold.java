public class Gold {
    private int gold;
    
    
    // Default Constructor
    public Gold() {
        int gold = 1500;
    }
    public Gold(int gold) {
        this.gold = gold;
    }
    
    public void printGold(){
        System.out.println("Gold: " + gold);
    }
    public void getGold(int newGold) {
        System.out.println(gold += newGold);
    }
    
    public void useGold(int cost) {
        if (gold >= cost){
            System.out.println("Gold: " + (gold -= cost));    
        }
        else{
            System.out.println("Your to broke to afford this");
        }
    }
    public int returnGold(){
        return gold;
    }
}