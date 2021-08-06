public class MarketGood {
    // 코드를 입력하세요.
    // 상품명, 상품원가, 할인율
    private String name;
    private int retailPrice;
    private int discountRate;

    // 생성자1
    public MarketGood(String name, int retailPrice, int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        if(discountRate < 0|| discountRate > 100) {
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }
    // 생성자2
    public MarketGood(String name, int retailPrice) {
        this(name,retailPrice,0);
    }

    // getter
    public String getName(){
        return name;
    }
    public int getRetailPrice(){
        return retailPrice;
    }
    public int getDiscountRate(){
        return discountRate;
    }

    // setter
    public void setDiscountRate(int discountRate){
         this.discountRate = discountRate;
    }

    // 할인된 값을 리턴하는 함수
    public int getDiscountedPrice() {
        // 원가 * (할인율 / 100) = 할인될 가격
        // 원가 - 할인될 가격 = 할인된 가격

        if(discountRate <= 0) {
            return retailPrice;
        }else {
            return (int)(retailPrice - (retailPrice * ((double)discountRate / 100)));
        }
    }
}
