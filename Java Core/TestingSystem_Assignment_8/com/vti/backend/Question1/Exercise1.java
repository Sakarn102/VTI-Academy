package com.vti.backend.Question1;

import com.vti.entity.Exercise1.Question1.Student;

import java.util.*;

import static com.vti.entity.Exercise1.Question1.Student.*;

public class Exercise1 {
    public static ArrayList<Student> studentArrayList = new ArrayList<>();
    public void Question1() {

        studentArrayList.add(new Student(1, "An"));
        studentArrayList.add(new Student(2, "An"));
        studentArrayList.add(new Student(3, "An"));
        studentArrayList.add(new Student(4, "Bac"));
        studentArrayList.add(new Student(5, "Chuong"));
        studentArrayList.add(new Student(6, "Dung"));

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
                    System.out.println("Number students in Array List: " + numberStudent());
                    break;
                case 2:
                    System.out.println("Fourth element in Array List Student: " + Student.numberStudent4().toString());
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
                case 7: {
                    Student result = searchStudentId();
                    if (result != null) {
                        System.out.println("Find: " + result);
                    } else {
                        System.out.println("Don't find student!...");
                    }
                    break;
                }
                case 8: {
                    ArrayList<Student> results = searchStudentName();
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
                    ArrayList<Student> duplicated = searchSameNameStudent();
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
                    addAll();
                    break;
                case 13:
                    exitProgram();
                    break;

                default:
                    System.out.println();
            }
        }
        scanner.close();
    }
    public void Question2() {
        Stack<String> studentStack = new Stack<>();
        studentStack.push("Nguyễn Văn Nam");
        studentStack.push("Nguyễn Văn Huyền");
        studentStack.push("Trần Văn Nam");
        studentStack.push("Nguyễn Văn A");
        System.out.println("Thứ tự từ muộn nhất đến sớm nhất (dùng Stack):");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }
        System.out.println();
        //Queue
        Queue<String> linkedList = new LinkedList<>();
        linkedList.add("Nguyễn Văn Nam");
        linkedList.add("Nguyễn Văn Huyền");
        linkedList.add("Trần Văn Nam");
        linkedList.add("Nguyễn Văn A");
        System.out.println("Thứ tự từ sớm nhất đến muộn nhất (dùng Queue):");
        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.poll());
        }
    }
    public void Question3() {

    }
    public void Question4() {
        Set<com.vti.entity.Exercise1.Question4.Student> studentSet = new HashSet<>();
        studentSet.add(new com.vti.entity.Exercise1.Question4.Student("Nguyễn Văn Nam"));
        studentSet.add(new com.vti.entity.Exercise1.Question4.Student("Nguyễn Văn Huyên"));
        studentSet.add(new com.vti.entity.Exercise1.Question4.Student("Trần Văn Nam"));
        studentSet.add(new com.vti.entity.Exercise1.Question4.Student("Nguyễn Văn Nam")); // trùng
        studentSet.add(new com.vti.entity.Exercise1.Question4.Student("Nguyễn Văn A"));

        for (com.vti.entity.Exercise1.Question4.Student student : studentSet) {
            System.out.println(student);
        }
    }
    public void Question5(){
        Set<com.vti.entity.Exercise1.Question5.Student> studentSet = new HashSet<>();
        studentSet.add(new com.vti.entity.Exercise1.Question5.Student("Ban"));
        studentSet.add(new com.vti.entity.Exercise1.Question5.Student("An"));
        studentSet.add(new com.vti.entity.Exercise1.Question5.Student("Han"));
        studentSet.add(new com.vti.entity.Exercise1.Question5.Student("Yen"));
        studentSet.add(new com.vti.entity.Exercise1.Question5.Student("Jack"));

        Set<String> stringSet = new TreeSet<>();
        for (com.vti.entity.Exercise1.Question5.Student student : studentSet) {
            stringSet.add(student.getName());
        }
        System.out.println(stringSet);
    }
    public void Question6() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Anh");
        students.put(2, "Luyen");
        students.put(3, "Trang");
        students.put(4, "Giang");

        //a
        List<Integer> listId = new ArrayList<>();
        System.out.println("Key: ");
        for (Integer id : students.keySet()) {
            listId.add(id);
        }
        System.out.println(listId);

        //b
        List<String> listName = new ArrayList<>();
        System.out.println("Value: ");
        for (String names : students.values()) {
            listName.add(names);
        }
        System.out.println(listName);

        // c) Print out the student list sorted by name
        System.out.println("Students sorted by name: ");
        List<Map.Entry<Integer, String>> list = new ArrayList<>(students.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for(Map.Entry<Integer, String> entry : list){
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // d) Convert map students to set students
        System.out.println("Set of students: ");
        Set<Map.Entry<Integer, String>> studentSet = students.entrySet();
        for (Map.Entry<Integer,String> entry : studentSet) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
