package lv.div.restpipe.pipe;

import lv.div.restpipe.validators.RestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import java.util.List;

@Component
public class RestPipe<T> {

    @Autowired
    List<? extends RestValidator> validators;

    /**
     * Main process "pipe". Validates and then processes incoming data
     *
     * @param t typed class parameter
     */
    public void process(T t) {

        // Iterate through all validators to find the type-matched one:
        for (RestValidator validator : validators) {
            final Type genericSuperclass = validator.getClass().getGenericSuperclass();
            final Type[] actualTypeArguments = ((ParameterizedTypeImpl) genericSuperclass).getActualTypeArguments();

            // We've got only 1 type argument, so - getting the 1st:
            final Type actualTypeArgument = actualTypeArguments[0];

            if (t.getClass().equals(actualTypeArgument)) {
                System.out.println(validator.validate(t));
            }
        }

        // Send control to service(s)...

    }

}
