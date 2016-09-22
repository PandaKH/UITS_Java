
package jv1607.homeworks.task_0.task_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student{

    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private Date  birthday;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    Student() {
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", Name=" + firstName +" "+ lastName + " " + patronymic + ", birthday=" + dateFormat.format(birthday) + ", address=" + address + ", phone=" + phone + ", faculty=" + faculty + ", course=" + course + ", group=" + group + '}';
    }
    
    public Student(int id, String firstName, String lastName, String patronymic, String birthday, String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            this.birthday=sdf.parse(birthday);
        }catch (ParseException e) {
            e.printStackTrace();
        }
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
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

    public String getBirthday() {
        return dateFormat.format(birthday);
    }

    public void setBirthday(String birthday) {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            this.birthday=sdf.parse(birthday);
        }catch (ParseException e){
            e.printStackTrace();
        }   
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
}