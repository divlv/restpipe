package lv.div.restpipe.validators;

public abstract class RestValidator<T> {

    public abstract boolean validate(T t);

}
