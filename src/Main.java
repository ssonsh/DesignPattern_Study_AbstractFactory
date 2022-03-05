import factory.ChampionFactory;
import passive.Passive;
import skill.Skill;
import champion.Factory;
import champion.Champion;

public class Main {

    public static void main(String[] args) {

        for (Champion type : Champion.values()) {
            Factory factory = new Factory(type);
            ChampionFactory championFactory = factory.get();

            Skill skill = championFactory.skill();
            Passive passive = championFactory.passive();

            System.out.println("skill q : " + skill.Q());
            System.out.println("skill w : " + skill.W());
            System.out.println("skill e : " + skill.E());
            System.out.println("skill r : " + skill.R());

            System.out.println("passive default : " + passive.defaultPassive());
            System.out.println("passive specific : " + passive.specificPassive());
        }
    }
}
