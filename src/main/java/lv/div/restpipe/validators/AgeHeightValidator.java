package lv.div.restpipe.validators;

import lv.div.restpipe.contracts.AgeHeightContract;
import org.springframework.stereotype.Component;

@Component
public class AgeHeightValidator extends RestValidator<AgeHeightContract> {

    private AgeHeightContract t;

    public AgeHeightContract getT() {
        return t;
    }

    public void setT(AgeHeightContract t) {
        this.t = t;
    }

    public boolean validate() {
        return t.getAge() > 18 &&
               t.getHeight() > 100;
    }

}
