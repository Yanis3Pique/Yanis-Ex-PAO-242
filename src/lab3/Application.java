package lab3;

import lab3.model.Professor;
import lab3.model.Student;
import lab3.service.StorageService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        StorageService service = new StorageService();
        String alegere, cautaNume, comanda;
        String nume, telefon, mail;

        while(true) {
            System.out.println("Introduceti tipul de operatie: create, read, update, delete, quit:");
            comanda = cin.nextLine().toLowerCase();
            switch(comanda){
                case "create":
                    System.out.println("--- CREATE ---");
                    System.out.println("Profesor/Student?");
                    alegere = cin.nextLine().toLowerCase();
                    switch (alegere){
                        case "student":
                            System.out.print("Nume student=");
                            nume = cin.nextLine();
                            System.out.print("Telefon student=");
                            telefon = cin.nextLine();
                            System.out.print("Mail student=");
                            mail = cin.nextLine();
                            System.out.print("ID student=");
                            int nrMatricol = cin.nextInt();
                            System.out.print("Medie student=");
                            double medie = cin.nextDouble();
                            System.out.print("Clasa student=");
                            int clasa = cin.nextInt();
                            Student student = new Student(nume, telefon, mail, nrMatricol, medie, clasa);
                            service.addStudent(student);
                            cin.nextLine();
                            break;
                        case "profesor":
                            System.out.print("Nume profesor=");
                            nume = cin.nextLine();
                            System.out.print("Telefon profesor=");
                            telefon = cin.nextLine();
                            System.out.print("Mail profesor=");
                            mail = cin.nextLine();
                            System.out.print("Curs profesor=");
                            String curs = cin.nextLine();
                            System.out.print("An profesor=");
                            int an = cin.nextInt();
                            Professor profesor = new Professor(nume, telefon, mail, curs, an);
                            service.addProfessor(profesor);
                            cin.nextLine();
                            break;
                    }
                    break;
                case "read":
                    System.out.println("--- READ ---");
                    System.out.println("Profesor/Student?");
                    alegere = cin.nextLine().toLowerCase();
                    switch (alegere){
                        case "student":
                            System.out.println("Dati un nume de cautat:");
                            cautaNume = cin.nextLine();
                            System.out.println();
                            service.readStudent(cautaNume);
                            break;
                        case "profesor":
                            System.out.println("Dati un nume de cautat:");
                            cautaNume = cin.nextLine();
                            System.out.println();
                            service.readProfessor(cautaNume);
                            break;
                    }
                    break;
                case "update":
                    System.out.println("--- UPDATE ---");
                    System.out.println("Profesor/Student?");
                    alegere = cin.nextLine().toLowerCase();
                    switch (alegere){
                        case "student":
                            System.out.print("Dati nume de cautat=");
                            cautaNume = cin.nextLine();
                            System.out.println();
                            System.out.print("Nume=");
                            nume = cin.nextLine();
                            System.out.print("Telefon=");
                            telefon = cin.nextLine();
                            System.out.print("E-Mail=");
                            mail = cin.nextLine();
                            System.out.print("ID Student=");
                            int nrMatricol = cin.nextInt();
                            System.out.print("Medie=");
                            double medie = cin.nextDouble();
                            System.out.print("Clasa=");
                            int clasa = cin.nextInt();
                            Student studentUpdated = new Student(nume, telefon, mail, nrMatricol, medie, clasa);
                            service.updateStudent(studentUpdated, cautaNume);
                            break;
                        case "profesor":
                            System.out.print("Dati nume de cautat=");
                            cautaNume = cin.nextLine();
                            System.out.println();
                            System.out.print("Nume=");
                            nume = cin.nextLine();
                            System.out.print("Telefon=");
                            telefon = cin.nextLine();
                            System.out.print("E-Mail=");
                            mail = cin.nextLine();
                            System.out.print("Curs=");
                            String curs = cin.nextLine();
                            System.out.print("An=");
                            int an = cin.nextInt();
                            Professor profesorUpdated = new Professor(nume, telefon, mail, curs, an);
                            service.updateProfessor(profesorUpdated, cautaNume);
                            break;
                    }
                    break;
                case "delete":
                    System.out.println("--- DELETE ---");
                    System.out.println("Profesor/Student?");
                    alegere = cin.nextLine().toLowerCase();
                    switch (alegere){
                        case "student":
                            System.out.print("Dati nume de cautat=");
                            cautaNume = cin.nextLine();
                            System.out.println();
                            service.deleteStudent(cautaNume);
                            System.out.println("Student sters cu succes!");
                            break;
                        case "profesor":
                            System.out.print("Dati nume de cautat=");
                            cautaNume = cin.nextLine();
                            System.out.println();
                            service.deleteProfesor(cautaNume);
                            System.out.println("Profesor sters cu succes!");
                            break;
                    }
                    break;
                case "quit":
                    System.out.println("--- QUIT ---");
                    return;
                default:
                    System.out.println("Comanda invalida!");
            }
        }
    }
}