package lab7.q3;

public class Book {
    private String name;
    private String author_name;
    private String genre;
    private int price;
    public Book() {
        this.name = null;
        this.author_name = null;
        this.genre = null;
        this.price = -1;
    }

    public Book(String name, String author_name, String genre, int price) {
        this.name = name;
        this.author_name = author_name;
        this.genre = genre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author_name='" + author_name + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                '}';
    }
}
