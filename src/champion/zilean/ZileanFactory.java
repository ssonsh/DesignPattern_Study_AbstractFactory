package champion.zilean;

import factory.ChampionFactory;
import passive.Passive;
import skill.Skill;

public class ZileanFactory implements ChampionFactory {

    @Override
    public Skill skill() {
        return new ZileanSkill();
    }

    @Override
    public Passive passive() {
        return new ZileanPassive();
    }
}
