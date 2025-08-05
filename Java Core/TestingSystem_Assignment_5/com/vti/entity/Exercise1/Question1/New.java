package com.vti.entity.Exercise1.Question1;

public class New implements Inews{
    private int id;
    String title;
    String publishDate;
    String author;
    String content;
    float avarageRate;

    public New() {

    }

    public New(int id, String title, String publishDate, String author, String content, int[] rates) {
        super();
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.avarageRate = Caculate(rates);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public float getAvarageRate() {
        return avarageRate;
    }
    @Override
    public void Display() {
        System.out.println(
                "Title: " + this.title +
                        "Publish Date: " + this.publishDate +
                        "Author: " + this.author +
                        "Content: " + this.content +
                        "Average rate: " + this.avarageRate
        );

    }
    @Override
    public float Caculate(int[] rates) {
        int length = rates.length;
        if(length==0) return 0;
        float sum=0;
        for(int i = 0; i < length; i++) {
            sum += rates[i];
        }
        return sum/length;
    }

    @Override
    public String toString() {
        return "New [id=" + id + ", title=" + title + ", publishDate=" + publishDate + ", author=" + author
                + ", content=" + content + ", avarageRate=" + avarageRate + "]";
    }
}
