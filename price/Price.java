package price;

public class Price {
    int money;
    String currency;
    String product;
    int price;


    static int count = 0;

    public Price(int money, String currency, String product, int price) {
        this.money = money;
        this.currency = currency;
        this.product = product;
        this.price = price;

    }

    void get_a_price() {
        if (this.currency.equals("Dollar")) {
            count += 1;
            this.price = price * 68;}
        else if (this.currency.equals("Pound")){
            count += 1;
            this.price = price * 88;}
        else if (this.currency.equals("Euro")){
            count += 1;
            this.price = price * 70;}
        else System.out.println("Your currency cannot be taken, please choose one from following options: \"Dollar\", \"Pound\", or \"Euro\" ");
    }


    void buyProduct(){
        if (this.product.equals(product) && count == 1)
            if (this.price - money >= 0)
                System.out.println("your purchase was successful, your charge is" + (this.price - money));
            else System.out.println("u r poor");
        else System.out.println("Please get a price first");


    }
}

