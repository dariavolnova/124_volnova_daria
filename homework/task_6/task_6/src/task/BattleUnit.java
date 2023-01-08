package task;

public class BattleUnit {

    private int strength, armor, health, x, y;
    
    public BattleUnit(int strength, int armor, int health, int x, int y){
        this.strength = strength;
        this.armor = armor;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public int getStrength(){
        return strength;
    }
    public int getArmor(){
        return armor;
    }
    public int getHealth(){
        return health;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void attacked(BattleUnit enemy){
        if (armor > 0) {
            int damage;
            if (enemy.strength >= armor) {
                damage = enemy.strength - armor;
                health -= damage;
            } else {
                health = health;
            }
        } else {
            health -= enemy.strength;}
            }

    public void moveUp() {
        y--;
    }
    public void moveDown() {
        y++;
    }
    public void moveLeft() {
        x--;
    }
    public void moveRight() {
        x++;
    }
    public  boolean isAlive(){
        return health > 0;
    }
}
