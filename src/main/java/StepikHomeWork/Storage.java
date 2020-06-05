package StepikHomeWork;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Storage {
    private final List<MarketItem> marketItems = new ArrayList<>();
    private final List<StorageItem> storageItems = new ArrayList<>();

    public MarketItem add(MarketItem item) {
        marketItems.add(item);
        return item;
    }

    public StorageItem add(StorageItem item) {
        storageItems.add(item);
        return item;
    }

    public Optional<MarketItem> findCheapestMarketItem() {
        return marketItems.stream().min(Comparator.comparing(MarketItem::getPrice));
    }

    public BigDecimal getStorageItemsWeight() {
        return storageItems.stream()
                .map(item -> item.getWeight().multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public String getMarketItemsNames() {
        return (String) marketItems.stream().map(Item::getName).collect(Collectors.joining(", "));
    }

    public Object getLightStorageItemsNames() {
        return storageItems.stream()
                .filter(item -> item.getWeight().compareTo(BigDecimal.valueOf(10)) < 0)
                .map(Item::getName).collect(Collectors.joining(", "));
    }
}
