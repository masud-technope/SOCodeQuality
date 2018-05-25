public class Character
    public static void main(String[] args) {
        System.out.println("Enter your new character's name.");
        System.out.println("\t");
        new Character(input.nextLine());
    }

    public Character(String name) {
        this.name = name;
    }

    String name;
    int level = 1;
    int XP = 0;
    int maxHP = 20;
    int HP = maxHP;
    int gold = 100;
    int potions = 0;
}