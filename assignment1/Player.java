
public class Player {
	private Monster monster;

	public Monster getMonster() {
		return monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
	public boolean hasLost()
	{
		if(monster.getHP() <= 0)
		{
			return true;
		}
		
		return false;
	}
	
	public Move getMove(int move) {
		if(move == 1)
		{
			return getMonster().getMove1();
		}
		else if(move ==2)
		{
			return getMonster().getMove2();
		}
		else if(move ==3)
		{
			return getMonster().getMove3();
		}
		else
		{
			return getMonster().getMove4();
		}
	}
}
