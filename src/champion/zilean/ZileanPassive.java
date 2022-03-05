package champion.zilean;

import passive.Passive;

public class ZileanPassive implements Passive {
    @Override
    public String defaultPassive() {
        return "Zilean Default Passive";
    }

    @Override
    public String specificPassive() {
        return "Zilean Specific Passive";
    }
}
