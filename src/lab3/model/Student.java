package lab3.model;

public class Student extends Person{
    private int StudentNumber;
    private double AverageMark;
    private int Clasa;

    public Student() {
    }

    public Student(String nume, String numar, String mail, int studentNumber, double averageMark, int clasa) {
        super(nume, numar, mail);
        StudentNumber = studentNumber;
        AverageMark = averageMark;
        Clasa = clasa;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        StudentNumber = studentNumber;
    }

    public double getAverageMark() {
        return AverageMark;
    }

    public void setAverageMark(double averageMark) {
        AverageMark = averageMark;
    }

    public int getClasa() {
        return Clasa;
    }

    public void setClass(int clasa) {
        Clasa = clasa;
    }

    @Override
    public String toString() {
        return  "Name: " + getName() + "\n" +
                "Phone Number: " + getPhoneNumber() + "\n" +
                "Email " + getEmail() + "\n" +
                "Student Number: " + getStudentNumber() + "\n" +
                "Average Mark: " + getAverageMark() + "\n" +
                "Class: " + getClasa() + "\n";
    }
}
