import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 100);
        Product sugar = new Product("Сахар", 300);
        Product wine = new Product("Вино", 10_000);
        Product cheese = new Product("Сыр", 400);
        milk.setRating(5);
        milk.setRating(4);
        cheese.setRating(5);
        wine.setRating(4);
        sugar.setRating(6);

        Category Drinks = new Category("Напитки");
        Category Dairy = new Category("Молочные изделия");
        Category Cereals = new Category("Крупы");

        Basket basket1 = new Basket();
        User person1 = new User("Тимофей", "111", basket1);

        Dairy.addProducts(milk);
        Dairy.addProducts(cheese);
        Cereals.addProducts(sugar);
        Drinks.addProducts(wine);

        System.out.println(Dairy);
        System.out.println(Cereals);
        System.out.println(Drinks);

        System.out.println(person1);

        basket1.addPurchase(milk);
        Dairy.deleteProducts(milk);

        System.out.println(Dairy);
        System.out.println(Cereals);
        System.out.println(Drinks);

        System.out.println(person1);








    }
}
