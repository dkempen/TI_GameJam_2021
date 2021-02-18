package game.enemies;

/**
 * Created by johan on 2017-04-10.
 */
public class Skeleton extends Enemy {

	public Skeleton() {
		super("/enemies/skeleton.png", 9);
		this.speed = 50;
		this.health = 100;
		this.maxHealth = health;
		this.gold = 50;
	}
}
