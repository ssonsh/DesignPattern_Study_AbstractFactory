package factory;

import passive.Passive;
import skill.Skill;

public interface ChampionFactory {
    Skill skill();
    Passive passive();
}
