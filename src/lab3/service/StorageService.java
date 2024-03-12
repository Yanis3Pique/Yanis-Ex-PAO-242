package lab3.service;

import lab3.model.Professor;
import lab3.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StorageService {
    private List<Professor> professorList;
    private List<Student> studentList;

    public StorageService() {
        this.professorList = new ArrayList<>();
        this.studentList = new ArrayList<>();
    }

    public List<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(List<Professor> professorList) {
        this.professorList = professorList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student s){
        for(Student student : studentList) {
            if(student.getName().equals(s.getName())) {
                System.out.println("Already existing!");
                return;
            }
        }
        studentList.add(s);
    }

    public void addProfessor(Professor p){
        for(Professor professor : professorList) {
            if(professor.getName().equals(p.getName())) {
                System.out.println("Already existing!");
                return;
            }
        }
        professorList.add(p);
    }

    public void readStudent(String nume){
        for(Student student : studentList) {
            if(student.getName().equals(nume)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Not existing!");
    }

    public void readProfessor(String nume){
        for(Professor profesor : professorList) {
            if(profesor.getName().equals(nume)) {
                System.out.println(profesor);
                return;
            }
        }
        System.out.println("Not existing!");
    }

    public void updateStudent(Student studentUpdate, String numeDeCautat){
        for(Student student : studentList) {
            if(student.getName().equals(numeDeCautat)){
                student.setStudentNumber(studentUpdate.getStudentNumber());
                student.setClass(studentUpdate.getClasa());
                student.setAverageMark(studentUpdate.getAverageMark());
                student.setName(studentUpdate.getName());
                student.setEmail(studentUpdate.getEmail());
                student.setPhoneNumber(studentUpdate.getPhoneNumber());
                return;
            }
        }
        System.out.println("Not existing!");
    }

    public void updateProfessor(Professor professorUpdate, String numeDeCautat){
        for(Professor professor : professorList) {
            if(professor.getName().equals(numeDeCautat)) {
                professor.setCourse(professorUpdate.getCourse());
                professor.setYear(professorUpdate.getYear());
                professor.setName(professorUpdate.getName());
                professor.setEmail(professorUpdate.getEmail());
                professor.setPhoneNumber(professorUpdate.getPhoneNumber());
                return;
            }
        }
        System.out.println("Not existing!");
    }

    public void deleteStudent(String numeDelete){
        for(Student student : studentList) {
            if(student.getName().equals(numeDelete)) {
                studentList.remove(student);
                return;
            }
        }
        System.out.println("Not existing!");
    }

    public void deleteProfesor(String numeDelete){
        for(Professor professor : professorList) {
            if(professor.getName().equals(numeDelete)) {
                professorList.remove(professor);
                return;
            }
        }
        System.out.println("Not existing!");
    }
}