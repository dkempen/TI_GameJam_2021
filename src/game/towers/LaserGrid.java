package game.towers;

import game.enemies.Enemy;
import game.projectiles.Laser;

public class LaserGrid extends Tower {
    public LaserGrid()
    {
        super("/towers/ArrowTower2.png");
        this.cost = 50;
        this.range = 300;
        this.fireDelay = 0.05;
        this.dmg = 1;
        this.upgradeCost = this.cost;
    }

    @Override
    public void shoot(Tower t) {
        //e.damage(10);
        shoot(new Laser(t.x, t.y, this.dmg));
    }
}
