package champion.zinx;

import factory.ChampionFactory;
import passive.Passive;
import skill.Skill;

public class ZinxFactory implements ChampionFactory {

    @Override
    public Skill skill() {
        return new ZinxSkill();
    }

    @Override
    public Passive passive() {
        return new ZinxPassive();
    }
}
