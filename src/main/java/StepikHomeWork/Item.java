package StepikHomeWork;

import java.math.BigDecimal;

public abstract class Item {
    private final String name;
    private final int quantity;

    protected Item(String name, int quantity) {
        this.name = null;
        this.quantity = 0;
    }

    public abstract BigDecimal getWeight();

    public abstract long getQuantity();

    public static <R> R getName(MarketItem marketItem) {
    }

    public static Object getName(StorageItem storageItem) {
    }
}
