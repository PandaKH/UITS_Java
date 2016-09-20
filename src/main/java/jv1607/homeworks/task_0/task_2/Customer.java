
package jv1607.homeworks.task_0.task_2;

public class Customer implements Comparable<Customer>{
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private int numCard;
    private int numAccount;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String patronymic, String address, int numCard, int numAccount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.numCard = numCard;
        this.numAccount = numAccount;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", Name=" + firstName +" "+ lastName + " " + patronymic + ", address=" + address + ", numCard=" + numCard + ", numAccount=" + numAccount + '}';
    }

    @Override
    public int compareTo(Customer o) {
        return this.firstName.compareTo(o.firstName);
    }
}
