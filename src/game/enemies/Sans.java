package game.enemies;

/**
 * Created by johan on 2017-04-10.
 */
public class Sans extends Enemy {

	public Sans() {
		super("/enemies/sans.png", 3);
		this.speed = 100;
		this.health = 300;
		this.maxHealth = health;
		this.gold = 100;
	}
}
