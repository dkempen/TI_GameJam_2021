package game.towers;

import game.Game;
import game.GameObject;
import game.projectiles.Projectile;
import game.enemies.Enemy;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by johan on 2017-04-10.
 */
public abstract class Tower extends GameObject {
	private Game game;

	public int cost = 75;
	protected double fireDelay = 0.25;
	protected int dmg = 6;
	public int upgradeCost;
	public int level = 1;
	public double speedIncrease= 1.2;
	public double dmgIncrease = 1;
	public double costIncrease = 1.5;
	protected double range = 200;
	private double fireTimer = 0;


	public Tower(String image) {
		super(image, 1,1);
	}

	@Override
	public void update(double elapsedTime) {
		fireTimer -= elapsedTime;
		if(fireTimer < 0)
		{

			ArrayList<Enemy> inRange = game.getEnemiesNear(new Point((int)x,(int)y), range);
			if(!inRange.isEmpty())
				shoot(inRange.get(0)); //TODO: pick random ones?


			ArrayList<Tower> inRangeTower = game.getTowersNear(new Point((int)x, (int)y), range);
			inRangeTower.remove(this);
			if(!inRangeTower.isEmpty())
				shoot(inRangeTower.get(0));
			fireTimer = fireDelay;
		}
	}
	public void shoot(Enemy e) {};

	public void shoot(Tower t) {};

	protected void shoot(Projectile projectile)
	{
		projectile.x = x;
		projectile.y = y;
		game.addProjectile(projectile);
	}
	public void levelUp(){
		level++;
		upgradeCost *= costIncrease;
		fireDelay /= speedIncrease;
		dmg += dmgIncrease;
	}


	public void setGame(Game game) { this.game = game; }

	public void setDamage(int dmg)
	{
		this.dmg = dmg;
	}

	public int getDamage()
	{
		return dmg;
	}


}
