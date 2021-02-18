package game.enemies;

/**
 * Created by johan on 2017-04-10.
 */
public class SkeletonBoss extends Enemy {

	public SkeletonBoss() {
		super("/enemies/skeletonboss.png", 9);
		this.speed = 30;
		this.health = 2000;
		this.maxHealth = health;
		this.gold = 1000;
	}
}
