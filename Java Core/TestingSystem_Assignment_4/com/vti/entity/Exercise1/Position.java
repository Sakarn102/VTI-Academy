package com.vti.entity.Exercise1;

public class Position {
    public int id;
    public PositionName name;
    public enum PositionName {
        Dev, Test, Scrum_Master, PM
    }
    public Position(int id, PositionName name) {
        this.id = id;
        this.name = name;
    }
}
