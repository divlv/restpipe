package lv.div.restpipe.validators;

import lv.div.restpipe.contracts.NameSurnameContract;
import org.springframework.stereotype.Component;

@Component
public class NameSurnameValidator extends RestValidator<NameSurnameContract> {

    private NameSurnameContract t;

    public NameSurnameContract getT() {
        return t;
    }

    public void setT(NameSurnameContract t) {
        this.t = t;
    }

    public boolean validate() {
        return t.getName().equalsIgnoreCase("n") &&
               t.getSurname().equalsIgnoreCase("s");
    }

}
