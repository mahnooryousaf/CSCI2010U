public class Battle {

    public Battle(
        String chikapuName,
        float chikapuAttack,
        float chikapuDefense,
        float chikapuHP,
        String zarichardName,
        float zarichardAttack,
        float zarichardDefense,
        float zarichardHP)
    {
        this.chikapuName = chikapuName;
        this.chikapuAttack = chikapuAttack;
        this.chikapuDefense = chikapuDefense;
        this.chikapuHP = chikapuHP;
        this.zarichardName = zarichardName;
        this.zarichardAttack = zarichardAttack;
        this.zarichardDefense = zarichardDefense;
        this.zarichardHP = zarichardHP;
        this.round_num = 0;
    }

    String chikapuName;
    float chikapuAttack;
    float chikapuDefense;
    float chikapuHP;
    String zarichardName;
    float zarichardAttack;
    float zarichardDefense;
    float zarichardHP;
    int round_num;

    public boolean isMonster1Dead()
    {
        if(this.chikapuHP <= 0) return true;
        return false;
    }

    public boolean isMonster2Dead()
    {
        if(this.zarichardHP <= 0) return true;
        return false;
    }

    public String getMonster1Name()
    {
        return this.chikapuName;
    }

    public String getMonster2Name()
    {
        return this.zarichardName;
    }

    public void simulateRound()
    {
        this.round_num++;
        System.out.println("Round " + this.round_num);

        float damage = this.chikapuAttack - this.zarichardDefense;
        this.zarichardHP -= damage;
        System.out.println(this.chikapuName + " does " + damage + " points of damage to " + this.zarichardName);

        damage = this.zarichardAttack - this.chikapuDefense;
        this.chikapuDefense -= damage;
        System.out.println(this.zarichardDefense + " does " + damage + " points of damage to " + this.chikapuName);

        System.out.println(this.chikapuName + ": " + this.chikapuHP);
        System.out.println(this.zarichardName + ": " + this.zarichardHP);
        System.out.println();
    }
}