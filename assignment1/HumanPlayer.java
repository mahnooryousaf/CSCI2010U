import java.util.Random;
import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(Monster monster) {
		this.setMonster(monster);
	}
	
	public boolean isFasterThan(CPUPlayer enemy)
	{
		if(getMonster().getSpeed() > enemy.getMonster().getSpeed()) {
			return true;
		}
		return false;
	}
	
	public int chooseMove()
	{
		System.out.print("Which move? ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		return n;
	}

	public void attack(CPUPlayer enemy, int playerMove) {
		Random rand = new Random();
		double accuracy = rand.nextDouble();
		Move move = getMove(playerMove);
		System.out.println(getMonster().getName()+ " uses "+ move.getName()+".");
		int damageDealt;
		if(accuracy > move.getAccuracy())
		{
			damageDealt =0;;
		}
		else
		{
			damageDealt = getMonster().getAttack() + move.getPower() - enemy.getMonster().getDefence();
		}
		
		int currentHp = enemy.getMonster().getHP();
		enemy.getMonster().setHP(currentHp - damageDealt);
		System.out.println(getMonster().getName()+" hit for "+ damageDealt+" points of damage.");
	}

	

}
