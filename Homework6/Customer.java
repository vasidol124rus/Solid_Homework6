package Homework6;

public class Customer {
    private String name;
    private double totalSpent;

    public Customer(String name, double totalSpent) {
        this.name = name;
        this.totalSpent = totalSpent;
    }

    public String getName() {
        return name;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public double calculateDiscount() {
        // Расчет скидки на основе общей суммы потраченных средств
        if (totalSpent >= 1000) {
            return totalSpent * 0.1; // 10% скидка
        } else {
            return 0;
        }
    }
}