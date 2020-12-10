package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        if (hitPoint > 0) {
            return true;
        }
        return false;
    }
    protected int getActualPrimaryDamage() {
        return random.nextInt(11);
    }

    private int getActualDefence() {
        return random.nextInt(6);
    }

    protected void hit(Character enemy, int damage) {
        int actualDefence = enemy.getActualDefence();
        if (actualDefence < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

        public void primaryAttack(Character enemy) {
            hit(enemy,getActualPrimaryDamage());
        }

        private void decreaseHitPoint(int diff) {
            this.hitPoint -= diff;
        }

        public abstract void secondaryAttack(Character enemy);

        public int getHitPoint() {
            return hitPoint;
        }

        public Point getPosition() {
            return position;
        }


        public Random getRandom() {
            return random;
    }
}
