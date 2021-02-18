package game.powerups;

public class SlowPowerUp extends PowerUp {

    public SlowPowerUp()
    {
        super("/powerups/slowdown.png", 10, 400, 100, 100);
        this.rechargeTime = 10;
        this.activeTime = 5;
    }

    @Override
    public void effect()
    {
        this.game.slowed = true;
    }

    @Override
    public void deActivate()
    {
        this.game.slowed = false;
    }
}
