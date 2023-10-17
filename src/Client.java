public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private static int counter;

    {
        id = ++counter;
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
