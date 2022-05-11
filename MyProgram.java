import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        /*
        ok basic rules dont choose any class but warrior didnt develop those and steel shield 
        is broken dont use it i mean if you want to be unkillable go for it but its a bit strong rn
        nothing has been balenced enjoy -Caleb
        */
        Gold enemyGold = new Gold(20);
        Gold robberGold = new Gold(100000);
        Gold bobGold = new Gold(5000);
        Weapon Club = new Weapon("Club", 8, 1, 10);
        // Armor variableName = new Armor("Armor name",  defence, mana){
        // Melee Weapon variableName = new Weapon("weapon name", damage, speed, defence);
        // Ranged Weapon varibleName = new Weapon("weapon name", damage, range, mana cost, speed, mage or not mage);
        Weapon Dagger = new Weapon("Poisoned Dagger", 10, 1, 10);
        Weapon TheAnnialator = new Weapon("The Annialator", 100, 1, 3);
        //Warrior
        Weapon SteelLongsword = new Weapon("Steel Longsword", 10, 3, 3);
        Weapon TheCursedBlade = new Weapon("The Cursed Blade", 100, 3, 1);
        Weapon SteelShield = new Weapon("Steel Shield", 0, 1, 50);
        Weapon Fist = new Weapon("Fist", 3, 3, 0);
        //Mage
        Weapon ScrollOfTheElements = new Weapon("Scroll of the Elements", 1, 1, 10, true);
        Weapon ScrollOfIce = new Weapon("Scroll of Ice", 1, 1, 10, true);
        Weapon ScrollOfTrueDamage = new Weapon("Scroll of True Damage", 1, 1, 10, true);
        Weapon Fireball = new Weapon("Fireball", 10, 3, 10, true);
        //Archer
        Weapon Bow = new Weapon("Bow", 25, 1, 60, false);
        Weapon Crossbow = new Weapon("Crossbow", 1, 1, 10, false);
        Weapon IronDagger = new Weapon("Iron Dagger", 1, 1, 10);
        //Default Armor
        Armor PlainCloths = new Armor();
        
        //Archers Armor
        Armor LeatherArmor = new Armor("Leather Armor", 5, 0);
        Armor ChainmailArmor = new Armor("Chainmail Armor", 10, 0);
        
        //Warriors Armor
        Armor SteelArmor = new Armor("Steel Armor" ,15,0);
        Armor ArmorOfTheDragons = new Armor("Armor of The Dragons", 120, 0);
        
        //Mages Armor
        Armor MagicRobes = new Armor("Magic Robes", 0, 230);
        Armor BattleRobes = new Armor("Battle Robes", 5, 150);


        //Enemies
        BadGuy Goblin = new BadGuy("Goblin", Club, 30, enemyGold);
        BadGuy Robber = new BadGuy("Robber", Dagger, 100, robberGold);
        BadGuy Boss = new BadGuy("Bob", TheAnnialator, 10, bobGold);
        
        Scanner input = new Scanner(System.in);
        Gold gold = new Gold(1500);
        ClassType typeClass = new ClassType();
        System.out.print("Give Your Character A Name: ");
        String name = input.nextLine();
        Hero hero = new Hero(name, Fist, 100, PlainCloths, gold);
        typeClass.pickClass();
        int classType = input.nextInt();
        while (classType != 1 && classType != 2 && classType != 3){
        System.out.println("Try Again");
        classType = input.nextInt();
        }
        
        if (classType == 2){
            gold.printGold();
            typeClass.WarriorWeapon();
            int weapon = input.nextInt();
            if (weapon == 1){
                if (gold.returnGold() >= 500){
                    gold.useGold(500);
                    System.out.println("Enjoy your Steel Sword");
                    hero.setWeapon(SteelLongsword);
                }
                else{
                    System.out.println("You cannot Afford this use your fist");
                }
            }
            if (weapon == 2){
                if (gold.returnGold() >= 100){
                    gold.useGold(100);
                    System.out.println("Enjoy your Cursed Blade");
                    hero.setWeapon(TheCursedBlade);
                }
                else{
                    System.out.println("You cannot Afford this use your fist");
                }
            }
            if (weapon == 3){
                if(gold.returnGold() >= 500){
                    gold.useGold(500);
                    System.out.println("Enjoy your Steel Shield dont know how you will deal dmg though");
                    hero.setWeapon(SteelShield);
                }
                else{
                    System.out.println("You cannot Afford this use your fist");
                }
            
            }
            
            typeClass.WarriorArmor();
            int armor = input.nextInt();
            if (armor == 1){
                if (gold.returnGold() >= 300){
                    gold.useGold(300);
                    System.out.println("Enjoy your Steel Armor");
                    
                }
                else{
                    System.out.println("You cannot Afford this use your current cloths");
                }
            }
            if (armor == 2){
                if (gold.returnGold() >= 10000){
                    gold.useGold(10000);
                    System.out.println("Enjoy your Dragon Armor");
                }
                else{
                    System.out.println("You cannot Afford this use your current cloths");
                }
            }
            if (armor == 3){
                if(gold.returnGold() >= 0){
                    gold.useGold(0);
                    System.out.println("Enjoy your Plain Cloths");
                }
                else{
                    System.out.println("You cannot Afford this use your current cloths");
                }
            }
        }
        else if (classType == 3){
            gold.printGold();
            typeClass.MageWeapon();
            String weapon = input.nextLine();
            typeClass.MageArmor();
            String armor = input.nextLine();
        }
        else if (classType == 1){
            gold.printGold();
            typeClass.ArcherWeapon();
            String weapon = input.nextLine();
            typeClass.ArcherArmor();
            String armor = input.nextLine();
        }
        System.out.println("Time For Adventure!!");
        hero.setHitPoints(100);
        Goblin.setHitPoints(100);
        Robber.setHitPoints(100);
        int randomEnemy = (int) (Math.random() * (3 - 1) + 1);
        boolean wantToPlay = true;
        while (wantToPlay){
            randomEnemy = (int) (Math.random() * (3 - 1) + 1);
            if(randomEnemy == 1){ // Goblin
                Goblin.setHitPoints(100);
                System.out.println("You spot a " + Goblin.getName() +" in the distance");
                while(Goblin.getHitPoints() > 0 && hero.getHitPoints() > 0){
                    for(int i = hero.getWeapon().getSpeed(); i > 0; i--){
                        Goblin.setHitPoints(Goblin.getHitPoints() - (hero.getWeapon().getBaseDamage() + Goblin.getWeapon().getDefence()));
                    }
                    for(int i = Goblin.getWeapon().getSpeed(); i > 0; i--){
                        hero.setHitPoints(hero.getHitPoints() - (Goblin.getWeapon().getBaseDamage() - (hero.getWeapon().getDefence() + hero.getArmor().getDefence()) ));
                    }    
                    
                    System.out.println("Goblins Health: "+ Goblin.getHitPoints());
                    System.out.println("Your Health:" + hero.getHitPoints());
                }
            }
            if(randomEnemy == 2){ //Robber
                Robber.setHitPoints(100);
                System.out.println("You get jumped by a " + Robber.getName());
                while(Robber.getHitPoints() > 0 && hero.getHitPoints() > 0){
                    for(int i = hero.getWeapon().getSpeed(); i > 0; i--){
                        Robber.setHitPoints(Robber.getHitPoints() - (hero.getWeapon().getBaseDamage() + Robber.getWeapon().getDefence()));
                        System.out.println("Robbers Health: " + Robber.getHitPoints());
                        System.out.println("You attack the robber with " + hero.getWeapon().getName());
                    }
                    for(int i = Robber.getWeapon().getSpeed(); i > 0; i--){
                        hero.setHitPoints(hero.getHitPoints() - (Robber.getWeapon().getBaseDamage() - (hero.getWeapon().getDefence() + hero.getArmor().getDefence()) ));
                        System.out.println("The Robber stabs you with " + Robber.getWeapon().getName());
                        System.out.println("Your Health: " + hero.getHitPoints());
                    }
                    System.out.println("Robbers Health: " + Robber.getHitPoints());
                    System.out.println("Your Health: " + hero.getHitPoints());
                    
                }
            if (hero.getHitPoints() <= 0){
                System.out.println("you have died");
                wantToPlay = false;
            }
            System.out.println("Return to town or adventure");
            String adventure = input.nextLine();
            if (adventure.equals("town")){
                System.out.println("well this adventure has been fun and i made a bit of money.");
                wantToPlay = false;
                }
            }
                
            }
            
            //System.out.println("Keep Playing?");
            
    }
}