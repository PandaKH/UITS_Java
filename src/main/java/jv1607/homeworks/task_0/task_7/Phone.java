
package jv1607.homeworks.task_0.task_7;

public class Phone implements Comparable<Phone>{
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private int numCard;
    private int debit;
    private int credit;
    private int urbanCalls;
    private int longDistCall;

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

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getUrbanCalls() {
        return urbanCalls;
    }

    public void setUrbanCalls(int urbanCalls) {
        this.urbanCalls = urbanCalls;
    }

    public int getLongDistCall() {
        return longDistCall;
    }

    public void setLongDistCall(int longDistCall) {
        this.longDistCall = longDistCall;
    }

    public Phone() {
    }

    public Phone(int id, String firstName, String lastName, String patronymic, String address, int numCard, int debit, int credit, int urbanCalls, int longDistCall) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.numCard = numCard;
        this.debit = debit;
        this.credit = credit;
        this.urbanCalls = urbanCalls;
        this.longDistCall = longDistCall;
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", Name=" + firstName + " " + lastName + " " + patronymic + ", address=" + address + ", numCard=" + numCard + ", debit=" + debit + ", credit=" + credit + ", urbanCalls=" + urbanCalls + "минут, longDistCall=" + longDistCall + "минут" + '}';
    }

    @Override
    public int compareTo(Phone o) {
        return this.firstName.compareTo(o.firstName);
    }
    
}
