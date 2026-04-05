package org.Exam.Lesson3;

public interface InventoryRepository {
    int getStock(String foodName);
    void decreaseStock(String foodName, int quantity);
}