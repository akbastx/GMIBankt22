package gmiBank_team22.pojos;

import com.github.javafaker.Faker;

public class Admins_pojo {
    public String firstName;
    public String lastName;

    public Admins_pojo() {
        Faker faker = new Faker();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
    }


}
