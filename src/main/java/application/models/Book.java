package application.models;

public class Book {
  private String id;
  private String title;
  private String author;
  private float reviewScore;
  private int stock;

  public Book(String id, String title, String author, int stock){
    this.id = id;
    this.title = title;
    this.author = author;
    this.stock = stock;
    this.reviewScore = 0;
  }

  public String getId() {
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
