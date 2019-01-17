package designpattern.single;

/**
 * Created by Rt on 2018/7/23.
 */
public enum SingleEnum {

    INSTANCE;
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
