package lab2fixed;
import java.util.Scanner;

public class Lab2fixed {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            menu();
            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số!");
                sc.nextLine(); // xóa rác
                continue;
            }
            sc.nextLine();
            switch (choice) {
                case 1: giaiPTB1(); break;
                case 2: giaiPTB2(); break;
                case 3: tinhTienDien(); break;
                case 4:
                    System.out.println("\nĐã thoát chương trình. Cảm ơn bạn!");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 → 4.");
            }
            System.out.println("\nNhấn Enter để quay lại menu...");
            sc.nextLine();
        }
    }
    static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println(" MENU CHƯƠNG TRÌNH ");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Chọn chức năng: ");
    }
    static void giaiPTB1() {
        System.out.println("\n>>> GIẢI PHƯƠNG TRÌNH BẬC NHẤT ax + b = 0 <<<");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble(); sc.nextLine();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble(); sc.nextLine();
        if (Math.abs(a) < 1e-9) {
            if (Math.abs(b) < 1e-9) {
                System.out.println("→ Phương trình có **vô số nghiệm**");
            } else {
                System.out.println("→ Phương trình **vô nghiệm**");
            }
        } else {
            double x = -b / a;
            System.out.printf("→ Nghiệm: x = %.4f\n", x);
        }
    }
    static void giaiPTB2() {
        System.out.println("\n>>> GIẢI PHƯƠNG TRÌNH BẬC HAI ax² + bx + c = 0 <<<");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble(); sc.nextLine();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble(); sc.nextLine();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble(); sc.nextLine();
        if (Math.abs(a) < 1e-9) {
            System.out.println("→ a = 0 → Đây không phải phương trình bậc 2!");
            System.out.println(" Chuyển sang giải phương trình bậc nhất:");
            if (Math.abs(b) < 1e-9) {
                if (Math.abs(c) < 1e-9) {
                    System.out.println("→ Vô số nghiệm");
                } else {
                    System.out.println("→ Vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.printf("→ Nghiệm: x = %.4f\n", x);
            }
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("→ Delta < 0 → Phương trình **vô nghiệm**");
        } else if (Math.abs(delta) < 1e-9) {  // so sánh delta == 0 an toàn hơn
            double x = -b / (2 * a);
            System.out.printf("→ Nghiệm kép: x = %.4f\n", x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("→ Phương trình có 2 nghiệm phân biệt:");
            System.out.printf(" x₁ = %.4f\n", x1);
            System.out.printf(" x₂ = %.4f\n", x2);
        }
    }
    static void tinhTienDien() {
        System.out.println("\n>>> TÍNH TIỀN ĐIỆN THEO BẬC THANG <<<");
        System.out.print("Nhập số điện đã sử dụng (kWh): ");
        int soDien;
        try {
            soDien = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("→ Vui lòng nhập số nguyên hợp lệ!");
            sc.nextLine();
            return;
        }
        if (soDien < 0) {
            System.out.println("→ Số điện không thể âm!");
            return;
        }
        long tien = 0;
        if (soDien <= 50) {
            tien = soDien * 1000L;
        } else {
            tien = 50 * 1000L + (soDien - 50) * 1200L;
        }
        System.out.printf("→ Số điện: %d kWh\n", soDien);
        System.out.printf("→ Tiền điện phải trả: %,d VNĐ\n", tien);
    }
}