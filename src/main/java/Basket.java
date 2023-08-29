public class Basket {
    private Product[] purchase;

    public Basket(Product[] purchase) {
        this.purchase = purchase;
    }

    public Basket() {
    }

    public Product[] getPurchase() {
        return purchase;
    }

    public void setPurchase(Product[] purchase) {
        this.purchase = purchase;
    }

    public void addPurchase(Product products) {
        if (this.purchase != null) {
            Product[] array = new Product[this.purchase.length + 1];
            System.arraycopy(this.purchase, 0, array, 0, this.purchase.length);
            array[this.purchase.length] = products;
            this.purchase = array;
        } else {
            this.purchase = new Product[1];
            this.purchase[0] = products;
        }


    }


    @Override
    public String toString() {
        if (this.purchase != null) {
            int count = 0;
            String result = "Корзина: \n";
            for (int i = 0; i < purchase.length; i++) {
                String prod = purchase[i].getName();
                int price = purchase[i].getPrice();
                count += price;
                result += "[" + prod + ", Цена: " + price + "] \n";

            }
            result += "Итого: " + count + "\n";
            return result;
        } else {
            return "В корзине ничего нет";
        }
    }
}
