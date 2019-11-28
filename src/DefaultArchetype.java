import java.util.Random;

public class DefaultArchetype
{
    private String characterName;
    private String archetypeName;
    private int damage;
    private int life;
    private int maxLife;
    private int initiative;


    /**
     * Archetype constructor.
     * @see #damage int attack of the archetype
     * @see #life   int life  of the archetype
     * @see #initiative int initiative of the archetype
     */
    public DefaultArchetype (String name, int damage, int life, int initiative)
    {
        this.characterName = name;
        this.archetypeName = "default";
        this.damage = damage;
        this.life = life;
        this.maxLife = life;
        this.initiative = initiative;
    }

    public void reset()
    {
        //this.life = 100;
    }

    /**
     * Method getName.
     * @return String name of the archetype
     */
    public String getName()
    {
        return this.characterName;
    }

    /**
     * Method getAttack.
     * @return int Attack of the archetype
     */
    public int getDamage()
    {
        return this.damage;
    }

    public int attack ()
    {
        return getDamage();
    }

    /**
     * Method getLife.
     * @return int life of the archetype
     */
    public int getLife ()
    {
        return this.life;
    }

    public int getMaxLife ()
    {
        return this.maxLife;
    }

    public void setLife (int value)
    {
        this.life = value;
    }

    /**
     * Method getInitiative.
     * @return int initiative of the archetype
     */
    public int getInitiative ()
    {
        return this.initiative;
    }

    /**
     * Method setDamageReceived.
     * @param damageReceived quantity of damage received
     * update life after receiving damage
     */
    public void setDamageReceived(int damageReceived)
    {
        this.life -= damageReceived;
    }

    /**
     * Method toString.
     * @return String all archetype's attributes
     */
    public String toString()
    {
        return  this.characterName + " is a " + this.archetypeName + ", had " + this.life + " HP, " + this.damage + " strength and " + this.initiative + " initiative.";
    }

    public String getArchetypeName()
    {
        return this.archetypeName;
    }

    public void setArchetypeName(String value)
    {
        this.archetypeName = value;
    }
}