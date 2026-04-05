package org.Exam;

public class Lesson1 {
    // Đoạn mã sai:
    //public RechargeService() {
        // Lỗi: Tự khởi tạo thủ công (Hard-code dependency)
     //   this.gateway = new InternalPaymentGateway();
    //}
    //Cách viết này làm mất đi tính linh hoạt vì class này tự tạo dependecy và khiến cho không thể thay đổi từ bên ngoài và khó mở rộng, khó tết
}
