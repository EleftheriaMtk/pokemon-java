// Pokemon.java
public class Pokemon {
 private String type;
 private String name;
 private int damage;
 private int health;

 public Pokemon() {
 this.type="Undefined";
 this.name="Undefined";
 this.damage=0;
 this.health=0;
 }
 public Pokemon(String t, String n, int d, int h) {
 this.type=t;
 this.name=n;
 this.damage=d;
 this.health=h;
 }
 public String getType() {
 return this.type;
 }
 public void setType(String t) {
 this.type=t;
 }
 public String getName() {
 return this.name;
 }
 public void setName(String n) {
 this.name=n;
 }
 public int getDamage() {
 return this.damage;
 }
 public void setDamage(int d) {
 this.damage=d;
 }
 public int getHealth() {
 return this.health;
 }
 public void setHealth(int h) {
 this.health=h;
 }
 public void attack() {
 System.out.println("... generic Pokemon attack cry ...");
 }
}
// Pikachu.java
 class Pikachu extends Pokemon {
public Pikachu() {
 super();
 this.setType("Electric");
 }
 public Pikachu(String t, String n, int d, int h) {
 super(t, n, d, h);
 if (t!="Electric")
 this.setType("Electric");
 }
 public void attack() {
 System.out.println("Pikaaa! ... Pikachu used Thundershock. It was super effective.");
 }
}
// Charmander.java
 class Charmander extends Pokemon {
 public Charmander() {
 super();
 this.setType("Fire");
 }
 public Charmander(String t, String n, int d, int h) {
 super(t, n, d, h);
 if (t!="Fire")
 this.setType("Fire");
 }
 public void attack() {
 System.out.println("ChaaaRR! ... Charmander used Fire Blast !!! It was super effective.");
 }
}
// Squirtle.java

class Squirtle extends Pokemon {
 public Squirtle() {
 super();
 this.setType("Water");
 }
 public Squirtle(String t, String n, int d, int h) {
 super(t, n, d, h);
 if (t!="Water")
 this.setType("Water");
 }
 public void attack() {
 System.out.println("Squirrr! ... Squirtle used Water Cannon. It was super effective.");
 }
}
// Bulbasaur.java
 class Bulbasaur extends Pokemon {
 public Bulbasaur() {
 super();
 this.setType("Grass");
 }
 public Bulbasaur(String t, String n, int d, int h) {
 super(t, n, d, h);
 if (t!="Grass")
 this.setType("Grass");
 }
 public void attack() {
 System.out.println("SauRRR! ... Bulbasaur used Vine Whip. It was super effective.");
 }
}
// PokemonTrainer.java
class PokemonTrainer {
 private String name;
 public Pokemon team[]=new Pokemon[3];

 public PokemonTrainer() {
 this.name="Undefined";
 }
 public PokemonTrainer(String n) {
 this.name=n;
 }
 public String getName() {
 return this.name;
 }
 public void setName(String n) {
 this.name=n;
 }
 public void duel() {
 for (int i=0;i<3; i++)
 team[i].attack();
 }
}
// Main.java
class Main {
 public static void main(String[] args) {
 PokemonTrainer pt = new PokemonTrainer("Ash Ketchum");
 pt.team[0]=new Pikachu();
 pt.team[1]=new Charmander();
 pt.team[2]=new Bulbasaur();

 pt.duel();
 }
} 