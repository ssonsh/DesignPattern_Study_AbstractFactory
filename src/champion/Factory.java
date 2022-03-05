package champion;

import factory.ChampionFactory;
import champion.zilean.ZileanFactory;
import champion.zinx.ZinxFactory;

public class Factory {
    ChampionFactory championFactory;

    public Factory(Champion type){
        switch (type){
            case ZINX :
                championFactory = new ZinxFactory();
                break;
            case ZILEAN:
                championFactory = new ZileanFactory();
                break;
        }
    }

    public ChampionFactory get(){
        return this.championFactory;
    }
}
