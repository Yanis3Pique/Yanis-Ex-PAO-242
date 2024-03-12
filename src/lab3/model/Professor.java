package lab3.model;

import javax.naming.Name;

public class Professor extends Person{
    private String Course;
    private int Year;

    public Professor() {
    }

    public Professor(String nume, String numar, String mail, String course, int year) {
        super(nume, numar, mail);
        Course = course;
        Year = year;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return  "Name: " + this.getName() + "\n" +
                "Phone Number: " + this.getPhoneNumber() + "\n" +
                "Email " + this.getEmail() + "\n" +
                "Course: " + this.getCourse() + "\n" +
                "Year: " + this.getYear() + "\n";
    }
}