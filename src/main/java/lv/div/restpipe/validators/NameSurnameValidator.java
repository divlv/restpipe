package lv.div.restpipe.validators;

import lv.div.restpipe.contracts.NameSurnameContract;
import org.springframework.stereotype.Component;

@Component
public class NameSurnameValidator extends RestValidator<NameSurnameContract> {

    @Override
    public boolean validate(NameSurnameContract nameSurnameContract) {
        // Dummy validation
        return nameSurnameContract.getName().equalsIgnoreCase("n") &&
               nameSurnameContract.getSurname().equalsIgnoreCase("s");

    }

}
