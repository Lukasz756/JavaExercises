package Interfejsy.Exercise1;

public class Ex1 {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[] result = UserValidator.validateEmails("pb@", "@yahoo.com");
        String[] result2 = UserValidator.validateEmails("wookie756@gmail.com","wookson756@gmail.com");
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result2[0]);
        System.out.println(result2[1]);


    }

}
