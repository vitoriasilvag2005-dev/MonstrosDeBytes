package aprendizado;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * PrimeiroRobo - a robot by (your name here)
 * Push para teste de webhook
 */
public class PrimeiroRobo extends Robot
{
	/**
	 * run: PrimeiroRobo's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		out.println("PrimeiroRobo iniciado! Teste de pipeline funcionando! 🚀"); // mensagem de teste

		setColors(Color.green, Color.green, Color.blue); // body, gun, radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(1);
			back(1);
			turnLeft(10000);
			turnRight(1);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(2);
		out.println("Inimigo detectado! Atirando!"); // mensagem de teste
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		out.println("Ai! Fui atingido!"); // mensagem de teste
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		out.println("Bateu na parede!"); // mensagem de teste
	}	
}
