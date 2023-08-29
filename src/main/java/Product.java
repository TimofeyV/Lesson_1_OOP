import lombok.Data;

@Data
public class Product {

    private String name;
    private int price;
    private double rating;
    private int numberOfRating;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.numberOfRating = 0;
    }

    public Product() {
        this.numberOfRating = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.numberOfRating++;
        if (rating > 5) {
            this.rating = (this.rating + 5) / this.numberOfRating;
        } else if(rating < 0){
            throw new IllegalArgumentException();
        } else {
            this.rating = (this.rating + rating) / this.numberOfRating;
        }
    }
}
