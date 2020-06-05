package StepikHomeWork;

//import lombok.Getter;
//import lombok.ToString;

import java.math.BigDecimal;

//@Getter
//@ToString(callSuper = true)
public class StorageItem extends Item {
    private final BigDecimal weight;

    public StorageItem(String name, int quantity, BigDecimal weight) {
        super(name, quantity);
        this.weight = weight;
    }
}
