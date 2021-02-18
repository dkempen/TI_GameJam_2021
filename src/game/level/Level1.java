package game.level;


/**
 * Created by johan on 2017-04-10.
 */
public class Level1 extends Level {

	public Level1() {

		map = "map1.json";

		waves.add(new Wave(2f, 20, game.enemies.Skeleton.class));
		waves.add(new Wave(1f, 20, game.enemies.Sans.class));
		waves.add(new Wave(1f, 1, game.enemies.SkeletonBoss.class));
	}
}
