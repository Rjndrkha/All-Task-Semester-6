package Practicum.Exercise;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health = (int) (this.health + (this.health * 0.1));
                break;
            case 2:
                this.health = (int) (this.health + (this.health * 0.3));
                break;
            case 3:
                this.health = (int) (this.health + (this.health * 0.4));
                break;
        }
    }

    @Override
    public void destroyed() {
        int destroy = (int) (this.health * 0.2);
        this.health = this.health - destroy;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = " + "\n"
                + "Health = " + health + "\n"
                + "Level = " + level + "\n";
    }
}
