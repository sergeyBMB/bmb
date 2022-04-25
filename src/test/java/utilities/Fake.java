package utilities;

import com.github.javafaker.Faker;

public class Fake {
    private static final Faker FAKER = new Faker();

    private Fake() {}

    public static String firstName() {
        return FAKER.name().firstName();
    }

    public static String lastName() {
        return FAKER.name().lastName();
    }

    public static String phoneUS() {
        return new Faker().numerify("1212#######");
    }

    public static String email() {
        return String.format("user+test%s@gmail.com",
                FAKER.number().randomNumber(10, false));
    }

    public static String password() {
        return FAKER.internet().password(8, 12, true,
                false, true);
    }
}
