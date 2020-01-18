package JavaSE.Serialization;

import java.io.Serializable;

public class SerObject implements Serializable {
    // if serial version ID is different, wil throw error during deserialization
    private static final long serialVersionUID=2; // read only variable (final)

    // age
    private int age;

    // name
    private String name;

    // sex
    private String sex;

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
