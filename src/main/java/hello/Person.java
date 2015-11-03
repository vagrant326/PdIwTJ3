package hello;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Size(min=4, max=30)
    private String password;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return this.name;
    }

}