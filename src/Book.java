import javax.swing.*;
import java.util.Scanner;

public class Book {
    private int pagesCount;
    private String title;
    private String coverColor;
    private Author author;
    private int price;
    private String publisher;

    public Book() {
        this.author=author;

    }

    public Book(int pagesCount, String title, String coverColor, String author, int price, String publisher) {
        this.pagesCount = pagesCount;
        this.title = title;
        this.coverColor = coverColor;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public String getTitle() {
        return title;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
