import java.util.Arrays;

public class Category {
    private String name;
    private Product[] products;


    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void addProducts(Product product) {
        if (this.products != null) {
            Product[] array = new Product[this.products.length + 1];
            System.arraycopy(this.products, 0, array, 0, this.products.length);
            array[this.products.length] = product;
            this.products = array;
        } else {
            this.products = new Product[1];
            this.products[0] = product;
        }
    }

    public void deleteProducts(Product product) {
        if (this.products != null) {
            if (Arrays.asList(this.products).contains(product)) {
                Product[] array = new Product[this.products.length - 1];
                for (int i = 0; i < this.products.length; i++) {
                    if (this.products[i] == product) {
                        this.products[i] = this.products[this.products.length - 1];
                    }
                }
                System.arraycopy(this.products, 0, array, 0, this.products.length - 1);
                this.products = array;
            } else {
                System.out.println("В данной категории нет такого товара");
            }
        } else {
            System.out.println("Данная категория пустая, из неё нечего удалять");
        }
    }

    @Override
    public String toString() {
        if (this.products != null && this.products.length != 0) {
            String result = this.name + ": \n";
            for (int i = 0; i < products.length; i++) {
                String prod = products[i].getName();
                int price = products[i].getPrice();
                double rait = products[i].getRating();
                result += "[" + prod + ", Цена: " + price + ", Рейтинг товара = " + rait + "] \n";

            }
            return result;
        } else {
            return this.name + " - В данной категории ничего нет";
        }
    }
}
