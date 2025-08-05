package com.vti.entity.Exercise3.Question2;

public class Car {
    public String name;
    public String type;

    public Car(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public class Engine {
        protected String engineType;

        public Engine(String engineType) {
            super();
            this.engineType = engineType;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

    }
}
