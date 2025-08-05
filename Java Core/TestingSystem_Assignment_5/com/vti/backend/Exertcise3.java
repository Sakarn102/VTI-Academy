package com.vti.backend;

import com.vti.entity.Exercise3.Question1.CPU;
import com.vti.entity.Exercise3.Question2.Car;

public class Exertcise3 {
    public void Question1(){
        CPU cpu = new CPU();

        System.out.println("====== Ram ======");
        CPU.Processor processor = cpu.new Processor(16, "menuFacture1");
        System.out.println("Core Amount: " + processor.coreAmount);
        System.out.println("Menu Facture: " + processor.menuFacturer);
        System.out.println("Cache: " + processor.getCache());

        System.out.println("====== Ram ======");
        CPU.Ram ram = cpu.new Ram(64, "Ram1");
        System.out.println("Memory: " + ram.memory);
        System.out.println("Menu Facture: " + ram.menuFacturer);
        System.out.println("clock Speed: " + ram.getClockSpeed());
    }
    public void Question2(){
        Car car = new Car("Mazda", "8WD");

        Car.Engine engine = car.new Engine("Crysler");
        System.out.println("Name: " + car.name);
        System.out.println("type: " + car.type);
        System.out.println("Engine Type: " +engine.getEngineType());
    }
}
