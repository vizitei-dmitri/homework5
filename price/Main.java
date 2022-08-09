package price;

public class Main {
    public static void main(String[] args){
        Price toBuy = new Price(89, "Dollar", "product", 29);
        toBuy.get_a_price();
        toBuy.buyProduct();
    }

}
