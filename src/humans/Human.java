package humans;

public abstract class Human {
    private String FirstName;
    private String LastName;
    private int age;
    private float balance;

    public Human(String firstName, String lastName, int age, float balance) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.balance = balance;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
