public interface Discounter {
  public double applyDiscount(double itemTotal);
}

public class OrderProcessor {
  private Map<Char, Discounter> discounts = new HashMap<Char, Discounter>();

  public void addDiscounter(Char discountCode, Discounter discounter) {
    discounts.put(discountCode, discounter);
  }

  public Double calculateTotalPriceWithDiscountCode(Order order, char discountCode) {
    double itemTotal = order.getItemTotal();
    double discountAmount = 0.0;

    if (discounts.hasKey(discountCode))
      discountAmount = discounter.applyDiscount(itemTotal);

    return itemTotal - discountAmount;
  }
}