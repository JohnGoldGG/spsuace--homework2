package StepikHomeWork;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {

    private static final Storage storage = new Storage();

    public static void main(String[] args) {
        String s = "11\n"
                + "1 Milk 10 120.0\n"
                + "2 Water 10 1.0\n"
                + "3\n"
                + "4\n"
                + "1 Bread 30 25.0\n"
                + "1 Chocolate 100 45.5\n"
                + "2 Juice 30 0.5\n"
                + "2 Chips 100 12.3\n"
                + "3\n"
                + "5\n"
                + "6";
        Scanner sc = new Scanner(s);
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            process(line);
        }
    }

    private static void process(String[] line) {
        switch (line[0]) {
            case "1":
                storage.add(new MarketItem(line[1], Integer.parseInt(line[2]), new BigDecimal(line[3])));
                break;
            case "2":
                storage.add(new StorageItem(line[1], Integer.parseInt(line[2]), new BigDecimal(line[3])));
                break;
            case "3":
                storage.findCheapestMarketItem().ifPresent(System.out::println);
                break;
            case "4":
                System.out.println(storage.getStorageItemsWeight());
                break;
            case "5":
                System.out.println(storage.getMarketItemsNames());
                break;
            case "6":
                System.out.println(storage.getLightStorageItemsNames());
                break;
            default:
                break;
        }
    }

}