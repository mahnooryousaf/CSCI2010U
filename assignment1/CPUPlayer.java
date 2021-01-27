import java.util.Random;

public class CPUPlayer extends Player{

	public CPUPlayer(Monster monster) {
		this.setMonster(monster);
	}
	
	public int chooseMove()
	{
		Random rand = new Random();
		// return random number between 1-4
		int random = rand.nextInt(4)+1;
		return random;
	}

	public void attack(HumanPlayer player, int enemyMove) {
		Random rand = new Random();
		double accuracy = rand.nextDouble();
		Move move = getMove(enemyMove);
		System.out.println(getMonster().getName()+ " uses "+ move.getName()+".");
		int damageDealt;
		if(accuracy > move.getAccuracy())
		{
			damageDealt =0;
		}
		else
		{
			damageDealt= getMonster().getAttack() + move.getPower() - player.getMonster().getDefence();
		}
		 
		int currentHp = player.getMonster().getHP();
		player.getMonster().setHP(currentHp - damageDealt);
		System.out.println(getMonster().getName()+" hit for "+ damageDealt+" points of damage.");
		
	}

}
