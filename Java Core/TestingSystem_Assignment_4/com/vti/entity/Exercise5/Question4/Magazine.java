package com.vti.entity.Exercise5.Question4;

public class Magazine extends Document{
    protected int issueNumber;
    protected int releaseMonth;

    public Magazine(String id, String publisher, int numberOfProducts, int issueNumber, int releaseMonth) {
        super(id, publisher, numberOfProducts);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Magazine [issueNumber=" + issueNumber + ", releaseMonth=" + releaseMonth + "]";
    }
}
