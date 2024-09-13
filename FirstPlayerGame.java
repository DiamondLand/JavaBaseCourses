class Player {
    String name;
    int health;
    Weapon weapon;

    public Player(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(weapon.getDamage());
        System.out.println(name + " атаковал " + enemy.getName() + " с " + weapon.getName());
    }
}

class Enemy {
    String name;
    int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " нанесено " + damage + " урона!");
    }

    public String getName() {
        return name;
    }
}

class Weapon {
    String name;
    int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
