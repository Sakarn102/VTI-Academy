package com.vti.backend;

import com.vti.entity.Exercise5.Question1.Officer;
import com.vti.entity.Exercise5.Question1.OfficerManager;
import com.vti.entity.Exercise5.Question3.HighSchoolStudent;
import com.vti.entity.Exercise5.Question4.*;


public class Exercise5 {
    public void Question1(){

    }
    public void Question2(){
        OfficerManager manager = new OfficerManager();

        Officer off1 = new Officer("Tuan Anh", 20, Officer.Gender.Nam, "Ha Noi");
        Officer off2 = new Officer("Name2", 15, Officer.Gender.Nam, "Ha Noi");
        Officer off3 = new Officer("Name3", 25, Officer.Gender.Nu, "Ha Noi");
        Officer off4 = new Officer("Name4", 25, Officer.Gender.Nu, "Ha Noi");

        manager.addOfficer(off1);
        manager.addOfficer(off2);
        manager.addOfficer(off3);
        manager.addOfficer(off4);

        manager.searchOfficer("Tuan Anh");

        manager.deleteOfficer("Name4");

        manager.officerList();
    }
    public void Question3(){
        HighSchoolStudent student = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại học công nghệ");
        System.out.println(student.toString());
    }
    public void Question4(){
        DocumentManager manager = new DocumentManager();

        Document document1 = new Document("Document1", "NXB1", 200);
        Document document2 = new Document("Document2", "NXB2", 300);
        Document document3 = new Document("Document3", "NXB3", 500);
        Document document4 = new Document("Document4", "NXB3", 500);

        manager.addDocument(document1);
        manager.addDocument(document2);
        manager.addDocument(document3);
        manager.addDocument(document4);
        manager.addDocument(new Book("Document1", "NXB1", 200, "Tacgia Book", 250));

        manager.searchDocument("book");

        manager.printDocument();
    }
}
