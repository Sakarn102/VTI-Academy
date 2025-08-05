package com.vti.entity.Exercise5.Question4;

public class Newspaper extends Document{
    protected int releaseDate;

    public Newspaper(String id, String publisher, int numberOfProducts, int releaseDate) {
        super(id, publisher, numberOfProducts);
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper [releaseDate=" + releaseDate + "]";
    }
}
