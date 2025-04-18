class GameObject {
    private String Name;
    private int x;
    private int y;

    public GameObject(String name, int x, int y) {
        this.Name = name;
        this.x = x;
        this.Y = y;
    }

    public void draw() {
        System.out.println(Name + " drawn at (" + X + ", " + Y + ")");
    }
}

class Player extends GameObject {
    private int health;

    public Player(String name, int x, int y, int health) {
        super(name, x, y);
        this.health = health;
    }

    public int getHealth() {
        return Health;
    }

    public void sethealth(int health) {
        this.health = health;
    }

    @Override
    public void draw() {
        System.out.println(Name + " drawn as player at (" + X + ", " + Y + ") with health " + health);
    }

//    public boolean equals(Player other) {
//        return Health == other.Health;
//    }
}

class Enemy extends GameObject {
    private int damage;

    public Enemy(String name, int x, int y, int damage) {
        super(name, x, y);
        this.damage = damage;
    }

    public int getdamage() {
        return damage;
    }

    public void setDamage(int damage) {
        damage = damage;
    }

    @Override
    public void draw() {
        System.out.println(Name + " drawn as enemy at (" + X + ", " + Y + ") with damage " + damage);
    }
}

class PowerUp extends GameObject {
    private String Effect;

    public PowerUp(String name, int x, int y, String Effect) {
        super(name, x, y);
        this.Effect = Effect;
    }

    public String getEffect() {
        return Effect;
    }

    public void setEffect(String effect) {
        Effect = effect;
    }

    @Override
    public void draw() {
        System.out.println(Name + " drawn as power-up at (" + X + ", " + Y + ") with effect " + Effect);
    }
}

class Game {
    private GameObject[] GO;
    int j=0;
    public Game(int size) {
        GameObject[] GO = new GameObject[size];
    }

    public void addGameObject(GameObject GO, int i) {
        GO[i] = GO;
    }

    public void drawAll() {
        for (int j = 1; j <= objects.length; j++) {
            GO[j].draw();
        }
    }
}

public class A2_Q4_22k4029 {
    public static void main(String[] args) {
        Player pl = new Player("22k4029",4,8,100);
        Enemy en = new Enemy("22k4029", 14, 10, 150);
        PowerUp pu = new PowerUp("22k4029", 15, 15, "More effct");

        Game game = new Game(3);
        game.addGameObject(pl, 0);
        game.addGameObject(en, 1);
        game.addGameObject(pu, 2);
        game.drawAll();
        Player pl2 = new Player("22k4029", 20, 10, 150);
        if(object.equals(pl.getHealth(),pl2.getHealth())){
            System.out.println("Players have equal health ");}
        else{System.out.println("Players does not have equal health ")}
    }
}
