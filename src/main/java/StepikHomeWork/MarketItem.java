package StepikHomeWork;

//import lombok.Getter;
//import lombok.ToString;

import java.math.BigDecimal;

//@Getter
//@ToString(callSuper = true)
public class MarketItem extends Item {
    private final BigDecimal price;

    public MarketItem(String name, int quantity, BigDecimal price) {
        super(name, quantity);
        this.price = price;
    }

    public static <U extends Comparable<? super U>, T> void getPrice(T t) {
    }

    @Override
    public BigDecimal getWeight() {
        return null;
    }

    @Override
    public long getQuantity() {
        return 0;
    }
}
