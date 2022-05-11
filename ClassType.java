public class ClassType {
    private String typeClass = "";
    
    public ClassType(){
        typeClass = "";
    }
    
    public void pickClass(){
    System.out.println("Pick A Number For Your Class:");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("1. Archer: Uses bow to take down foes (not done)");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("2. Warrior: Uses sword and shield to take down foes");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("3. Mage: Can use spells healing and destruction for combat (not done)");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    //String classtype = input.nextLine();    
    }
    public void WarriorWeapon(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Steel Longsword: \nAttack: 10 \nSpeed: 3 \nDefense: 3 \nCost: 500g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Cursed Blade: \nAttack: 100 \nSpeed: 3 \nDefense: 1 \nCost: 100g");
        //Spawns Mega boss that can one shot you be aware
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Steel Shield: \nAttack: 0 \nSpeed: 1 \nDefense: 50 \nCost: 500g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void WarriorArmor(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Steel Armor: \nDefence: 15 \nCost: 300g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Armor of The Dragons: \nDefence: 120 \nCost: 10000g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Plain Cloths: \nDefence 2 \nCost: 100g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void ArcherWeapon(){
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bow: \nAttack: 25 \nDraw Speed: 1 \nAccuracy: 60% \nCost: 200g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Crossbow: \nAttack: 30 \nDraw Speed: 1 \nAccuracy: 70% \nCost: 400g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Iron Dagger: \nAttack: 5 \nSpeed: 5 \nDefence: 0 \nCost: 1000g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void ArcherArmor(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Leather Armor: \nDefence: 5 \nCost: 300g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Chainmail Armor: \nDefence: 10 \nCost: 500g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Plain Cloths: \nDefence: 2 \nCost: 100g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void MageWeapon(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Scroll of the Elements: \nAttack: 20 \nMana Cost: 10 \nSuccess Rate: 80% \nCost: 200g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Scroll of Ice: \nAttack: 50 \nMana Cost: 10\nSuccess Rate: 70% \nCost: 400g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Scroll of True Damage: \nAttack: 50000 \nMana Cost: 5 \nSuccess Rate: 1% \nCost: 1000g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void MageArmor(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Magic Robes: \nDefence: 0 \nMana Pool: 230 \nCost: 300g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Battle Robes: \nDefence: 5 \nMana Pool: 150 \nCost: 600g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Plain Cloths: \nDefence: 2 \nMana Pool: 50 \nCost: 50g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    /*public void InvalidWeapon(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("All I can offer you is a stick since I dont know your class");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Stick: \nAttack: 0 \nSpeed: 0 \nDefence: 0 \nCost: 100000g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void InvalidArmor(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Plain Cloths: \nDefence 2 \nCost: 100g");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }*/
}