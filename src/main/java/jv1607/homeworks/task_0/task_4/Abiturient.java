
package jv1607.homeworks.task_0.task_4;

public class Abiturient {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private String phone;
    private int mark1;
    private int mark2;
    private int mark3;
    private int mark4;
    private int mark5;

    public Abiturient() {
    }

    public Abiturient(int id, String firstName, String lastName, String patronymic, String address, String phone, int mark1, int mark2, int mark3, int mark4, int mark5) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
    }

    @Override
    public String toString() {
        return "Abiturient{" + "id=" + id + ", Name=" + firstName + " " + lastName + " " + patronymic + ", address=" + address + ", phone=" + phone + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", mark4=" + mark4 + ", mark5=" + mark5 + '}';
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public int getMark4() {
        return mark4;
    }

    public void setMark4(int mark4) {
        this.mark4 = mark4;
    }

    public int getMark5() {
        return mark5;
    }

    public void setMark5(int mark5) {
        this.mark5 = mark5;
    }
    
}
