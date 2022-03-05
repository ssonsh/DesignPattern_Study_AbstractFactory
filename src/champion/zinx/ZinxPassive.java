package champion.zinx;

import passive.Passive;

public class ZinxPassive implements Passive {
    @Override
    public String defaultPassive() {
        return "Zinx Default Passive";
    }

    @Override
    public String specificPassive() {
        return "Zinx Specific Passive";
    }
}
