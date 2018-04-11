package application.models;

import javax.persistence.*;

@Entity
public class Book {

  @Id
  @GeneratedValue
  private int id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String author;

  @Column(nullable = false)
  private float reviewScore;

  @Column(nullable = false)
  private int stock;

  public Book(String title, String author, int stock){
    this.title = title;
    this.author = author;
    this.stock = stock;
    this.reviewScore = 0;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public float getReviewScore() {
    return reviewScore;
  }

  public int getStock() {
    return stock;
  }
}
