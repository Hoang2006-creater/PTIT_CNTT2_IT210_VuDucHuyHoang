package org.Exam.Lesson3;

public interface UserAccountRepository {
    double getBalance(String username);
    void deductBalance(String username, double amount);
}

