abstract  class Superhero{
    String heroName;
    int powerLevel;
    public Superhero(String heroName, int powerLevel){
        this.heroName = heroName;
        this.powerLevel = powerLevel;
    }
    public void usePower(){
        System.out.println("The power level:");

    }
    public int powerBoost(int boostLevel){
        powerLevel += boostLevel;
        System.out.println(heroName + " is increased level "+ powerLevel);
        return powerLevel;

    }
}

class FlyingHero extends Superhero{
    public  FlyingHero(String heroName, int powerLevel){
        super(heroName, powerLevel);
    }
    public void usePower(){
        System.out.println("An extraordinary ability");
    }
}

class StrengthHero extends Superhero{
    public StrengthHero(String heroName, int powerLevel){
        super(heroName, powerLevel);
    }
    public void usePower(){
        System.out.println("Physical power and resilience.");
    }
}

class SpeedHero extends Superhero{
    public SpeedHero(String heroName, int powerLevel){
        super(heroName, powerLevel);
    }
    public void usePower(){
        System.out.println("The ability of super speed, which allows them to move");
    }
}

public class Superhero_4_5 {
    static class Main{
        public static void main(String[] args) {
            Superhero[] superHeroList = new Superhero[5];
            superHeroList[0] = new StrengthHero("Spider-Man",80);
            superHeroList[1] = new FlyingHero("Iron-Man",75);
            superHeroList[2] = new SpeedHero("The Flash",70);
            superHeroList[3] = new SpeedHero("Speed Freak",89);
            superHeroList[4] = new StrengthHero("Hulk",95);

            for(Superhero s : superHeroList){
                s.powerBoost(3);
            }

        }
    }
}
