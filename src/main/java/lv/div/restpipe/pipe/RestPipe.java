package lv.div.restpipe.pipe;

import lv.div.restpipe.validators.RestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class RestPipe {

    @Autowired
    List<? extends RestValidator> validators;



    public void runValidation(){
        int breakPointHere = 1+2; //TODO: Remove me!
    }


}
