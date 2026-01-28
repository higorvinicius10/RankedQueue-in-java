public class RankedQueue {

    // Method to calculate the win balance
    public static int calculateBalance(int wins, int losses) {
        return wins - losses;
    }

    // Method to determine the hero level
    public static String determineLevel(int wins) {
        String level;

        if (wins < 10) {
            level = "Iron";
        } else if (wins >= 10 && wins <= 20) {
            level = "Bronze";
        } else if (wins >= 21 && wins <= 50) {
            level = "Silver";
        } else if (wins >= 51 && wins <= 80) {
            level = "Gold";
        } else if (wins >= 81 && wins <= 90) {
            level = "Diamond";
        } else if (wins >= 91 && wins <= 100) {
            level = "Legendary";
        } else {
            level = "Immortal";
        }

        return level;
    }

    public static void main(String[] args) {

        // Array of players
        Hero[] heroes = {
                new Hero("Hero1", 8, 2),
                new Hero("Hero2", 15, 5),
                new Hero("Hero3", 45, 20),
                new Hero("Hero4", 75, 40),
                new Hero("Hero5", 85, 10),
                new Hero("Hero6", 95, 15)
        };

        // Loop through heroes
        for (Hero hero : heroes) {
            int balance = calculateBalance(hero.wins, hero.losses);
            String level = determineLevel(hero.wins);

            System.out.println(
                    "The hero " + hero.name +
                            " has a win balance of: " + balance +
                            " and is at the level: " + level
            );
        }
    }
}

// Helper class to represent a hero
class Hero {
    String name;
    int wins;
    int losses;

    Hero(String name, int wins, int losses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
    }
}
