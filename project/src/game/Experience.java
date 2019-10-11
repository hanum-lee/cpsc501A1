package game;

public class Experience {
    private int level = 1;
    private int experience = 0;
    private int expToLvl = 1;


    public Experience(int level, int currentExp, int expToLvl){
        this.level = level;
        experience = currentExp;
        this.expToLvl = expToLvl;
    }
    public Experience(int experience){
        this.experience = experience;
    }

    public int getExperience(){return experience;}

    public int getCurrentLevel(){return level;}

    public void setLevel(int level){
        if (level > 0)
        {
            this.level = level;
        }
    }

    public boolean checkExp()
    {
        if (experience >= expToLvl)
        {
            levelUp();
            return true;
        }else{
            return false;
        }
    }

    private void levelUp()
    {
        level += 1;
        if (experience > expToLvl)
        {
            experience -= expToLvl;
        }
        expToLvl *= 2;

    }

    public int getExpToLvl()
    {
        return expToLvl;
    }

    public void setExpToLvl(int expVal)
    {
        if (expVal > 0)
        {
            expToLvl = expVal;
        }
    }

    public int getCurrentExp()
    {
        return experience;
    }

    public void setCurrentExp(int expVal)
    {
        if (expVal > 0)
        {
            experience = expVal;
        }
    }
}
