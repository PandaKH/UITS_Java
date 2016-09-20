
package jv1607.homeworks.task_0.task_3;

public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private String phone;
    private int numCard;
    private String diagnostic;

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

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Patient() {
    }

    public Patient(int id, String firstName, String lastName, String patronymic, String address, String phone, int numCard, String diagnostic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.numCard = numCard;
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", patronymic=" + patronymic + ", address=" + address + ", phone=" + phone + ", numCard=" + numCard + ", diagnostic=" + diagnostic + '}';
    }
    
}
