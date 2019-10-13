package lv.div.restpipe.validators;

import lv.div.restpipe.contracts.AgeHeightContract;
import org.springframework.stereotype.Component;

@Component
public class AgeHeightValidator extends RestValidator<AgeHeightContract> {

    @Override
    public boolean validate(AgeHeightContract ageHeightContract) {
        return ageHeightContract.getAge() > 18 &&
               ageHeightContract.getHeight() > 100;

    }

}
