package com.vti.backend.Question3;

import com.vti.entity.Exercise1.Question3.Student;

import java.util.*;

import static com.vti.entity.Exercise1.Question3.Student.searchSameNameStudent;
import static com.vti.entity.Exercise1.Question3.Student.searchStudentName;
import static com.vti.entity.Exercise1.Question3.Student.addStudentFirst;
import static com.vti.entity.Exercise1.Question3.Student.*;

public class Question3 {
    public static Set<Student> studentSet = new LinkedHashSet<>();
    public static ArrayList<Student> studentArrayList = new ArrayList<>();
    public void Question3() {
        studentSet.add(new Student(1, "An"));
        studentSet.add(new Student(2, "Bac"));
        studentSet.add(new Student(3, "Cuong"));
        studentSet.add(new Student(4, "Duyen"));
        studentSet.add(new Student(5, "Phuong"));
        studentSet.add(new Student(6, "Hanh"));

        studentArrayList = new ArrayList<>(studentSet);

        boolean isValid = false;
        Scanner scanner = null;

        while (!isValid) {
            System.out.println("====== Menu ======");
            System.out.println("1. In ra tổng số phần tử của students ");
            System.out.println("2. Lấy phần tử thứ 4 của students");
            System.out.println("3. In ra phần tử đầu và phần tử cuối của students");
            System.out.println("4. Thêm 1 phần tử vào vị trí đầu của students");
            System.out.println("5. Thêm 1 phần tử vào vị trí cuối của students");
            System.out.println("6. Đảo ngược vị trí của students");
            System.out.println("7. Tạo 1 method tìm kiếm student theo id");
            System.out.println("8. Tạo 1 method tìm kiếm student theo name");
            System.out.println("9. Tạo 1 method để in ra các student có trùng tên");
            System.out.println("10. Xóa name của student có id = 2;");
            System.out.println("11. Delete student có id = 5;");
            System.out.println("12. Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies");
            System.out.println("13. Exit");

            scanner = new Scanner(System.in);
            System.out.println("Enter select: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    printAll();
                    break;
                case 1:
                    System.out.println("Number element set: " + numberStudent());
                    break;
                case 2:
                    System.out.println(numberStudent4());
                    break;
                case 3:
                    System.out.println("First and last element in Array List: ");
                    firstAndLastStudents(studentArrayList);
                    break;
                case 4:
                    addStudentFirst();
                    break;
                case 5:
                    addStudentLast();
                    break;
                case 6:
                    reverseStudent();
                    break;
                case 7:
                    Student result = searchStudentId();
                    if (result != null) {
                        System.out.println("Find: " + result);
                    } else {
                        System.out.println("Don't find student!...");
                    }
                    break;
                case 8: {
                    ArrayList<Student> results = Student.searchStudentName();
                    if(results.isEmpty()) {
                        System.out.println("Don't find");
                    }else {
                        System.out.println("Find " + results.size() + " student ");
                        for (Student student : results) {
                            System.out.println(student);
                        }
                    }
                }
                case 9: {
                    ArrayList<Student> duplicated = Student.searchSameNameStudent();
                    if(duplicated.isEmpty()) {
                        System.out.println("Don' fint same name!...");
                    } else {
                        System.out.println("Student same name: ");
                        for (Student student : duplicated) {
                            System.out.println(student);
                        }
                    }
                    break;
                }
                case 10:
                    deleteNameSudentId2(2);
                    break;
                case 11:
                    deleteStudentId5(5);
                    break;
                case 12:
                    printAll();
                    break;
                case 13:
                    exit();
                    break;
                default:
                    System.out.println();
            }
        }
    }
}
