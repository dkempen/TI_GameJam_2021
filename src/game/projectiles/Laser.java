package game.projectiles;

import game.enemies.Enemy;

public class Laser extends AreaProjectile {
    public Laser(double x, double y, int damage) {
        super("/projectiles/arrow.png", x, y, 150);
        speed = 50;
        freezeTime = 0.0;
        dmg = damage;
    }


    public void onHit(Enemy enemy)
    {
        enemy.damage(dmg);
    }
}
