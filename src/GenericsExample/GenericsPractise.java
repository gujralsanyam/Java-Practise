package GenericsExample;
import java.util.HashMap;
import java.util.Map;

class GST<T extends Number> {
    private T amount;
    private String itemType;
    private  static final Map<String, Double> gstRates = intializedGSTRates();

    // Separate method to intialize GST rates
    private static  Map<String, Double> intializedGSTRates()
    {
        Map<String,Double> rates = new HashMap<>();
        rates.put("Electronics", 18.0);
        rates.put("Clothing", 12.0);
        rates.put("Furniture", 28.0);
        rates.put("Food", 30.0);
        return rates;
    }
    public GST(T amount, String itemType)
    {
        validateInput(amount, itemType);
        this.amount = amount;
        this.itemType = itemType;
    }

    private void validateInput(T amount, String itemType)
    {
        if(amount.doubleValue() < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if(!gstRates.containsKey(itemType)) {
            throw new IllegalArgumentException("Invalid item type:" + itemType);
        }
    }

    public double calculateGST()
    {
        return amount.doubleValue() * gstRates.get(itemType)/100;
    }

    public double getTotalAmount()
    {
        return amount.doubleValue() + calculateGST();
    }

    public void displayDetails()
    {
        System.out.println("Item Type: " + itemType);
        System.out.println("Orignal Amount:" + amount);
        System.out.println("GST Rate:" + gstRates.get(itemType) + "%");
        System.out.println("GST Amount:" + calculateGST());
        System.out.println("Total Amount: "+ getTotalAmount());
    }

    public static void main(String[] args) {
    GST<Integer> electronics = new GST<>(10000, "Electronics");
    electronics.displayDetails();

    System.out.println("-----------");
    GST<Double> clothing = new GST<>(2500.75, "Clothing");
    clothing.displayDetails();
    }
}

