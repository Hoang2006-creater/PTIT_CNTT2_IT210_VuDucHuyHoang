package org.Exam.Lesson3;

public class OrderFoodService {

    private final InventoryRepository inventoryRepo;
    private final UserAccountRepository userRepo;

    public OrderFoodService(InventoryRepository inventoryRepo,
                            UserAccountRepository userRepo) {
        this.inventoryRepo = inventoryRepo;
        this.userRepo = userRepo;
    }

    public String orderFood(String username, String foodName, int quantity) {
        int stock = inventoryRepo.getStock(foodName);
        if (stock <= 0) {
            return "Hết hàng";
        }

        double price = 30000;
        double total = price * quantity;

        double balance = userRepo.getBalance(username);
        if (balance < total) {
            return "Không đủ tiền";
        }

        inventoryRepo.decreaseStock(foodName, quantity);
        userRepo.deductBalance(username, total);

        return "Đặt món thành công";
    }
}
