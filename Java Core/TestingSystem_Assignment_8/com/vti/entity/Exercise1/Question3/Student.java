package com.vti.entity.Exercise1.Question3;

import com.vti.backend.Question1.Exercise1;

import java.util.*;

import static com.vti.backend.Question3.Question3.studentArrayList;
import static com.vti.backend.Question3.Question3.studentSet;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static int numberStudent() {
        return studentSet.size();
    }

    public static Student numberStudent4() {
        return studentArrayList.get(3);
    }

    public static void printAll() {
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }

    public static void firstAndLastStudents(ArrayList<Student> studentList) {
        if (studentList != null) {
            System.out.println("First element: " + studentList.get(0));
            System.out.println("Last element: " + studentList.get(studentList.size() - 1));
        } else {
            System.out.println("Array List is null or empty");
        }
    }

    public static Student addStudentFirst() {
        Student newstudent = new Student(0, "Element First");
        studentArrayList.add(0, newstudent);
        studentSet = new LinkedHashSet<>(studentArrayList);
        System.out.println("Add Student Firt succesfully: " + newstudent);
        return newstudent;
    }

    public static Student addStudentLast() {
        Student newStudent = new Student(7, "Element Last");
        studentArrayList.add(studentArrayList.size(), newStudent);
        studentSet = new LinkedHashSet<>(studentArrayList);
        System.out.println("Add Student Last succesfully: " + newStudent);
        return newStudent;
    }

    public static void reverseStudent() {
        for (int i = studentArrayList.size() - 1; i >= 0; i--) {
            System.out.println(studentArrayList.get(i));
        }
    }

    public static Student searchStudentId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int idStudent = scanner.nextInt();

        for (Student student : studentArrayList) {
            if (student.getId() == idStudent) {
                return student;
            }
        }
        return null;
    }
    public static ArrayList<Student> searchStudentName(){
        ArrayList<Student> reList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String nameStudent = scanner.nextLine();
        for (Student student : studentArrayList) {
            if (student.getName().equalsIgnoreCase(nameStudent)) {
                reList.add(student);
            }
        }
        return reList;
    }
    public static ArrayList<Student> searchSameNameStudent(){
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0; i < Exercise1.studentArrayList.size(); i++) {
            for (int j = i + 1; j < Exercise1.studentArrayList.size(); j++) {
                if (Objects.equals(studentArrayList.get(i).getName(), studentArrayList.get(j).getName())) {
                    if(!arrayList.contains(studentArrayList.get(i))) {
                        arrayList.add(studentArrayList.get(i));
                    }
                    if (!arrayList.contains(studentArrayList.get(j))) {
                        arrayList.add(studentArrayList.get(j));
                    }
                }
            }
        }
        return arrayList;
    }
    public static void deleteNameSudentId2(int id) {
        for (Student student : studentArrayList) {
            if(student.getId() == id) {
                student.setName("");
                System.out.println("Delete succesfully name have id = " + id);
                return;
            }
        }
        System.out.println("Don't find student have id = " + id);
    }
    public static void deleteStudentId5(int  id) {
        for(int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId() == id) {
                studentArrayList.remove(i);
                studentSet = new LinkedHashSet<>(studentArrayList);
                System.out.println("Delete succesfully student have id = " + id);
                return;
            }
        }
        System.out.println("Don't find student have id = " + id);
    }
    public static void addAll() {
        ArrayList<Student> studentCopies = new ArrayList<>();
        studentCopies.addAll(studentArrayList);
        System.out.println("====== Student Copies ======");
        for (Student student : studentCopies) {
            System.out.println(student);
        }
    }
    public static void exit() {
        System.exit(0);
    }

}
