package lv.div.restpipe.contracts;

public class AgeHeightContract extends NumbersContract {

    Integer age;

    Integer height;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
