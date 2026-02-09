/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author Expedition 33
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== MENU LAB 2 =====");
            System.out.println("1. Bai 1: Kiem tra so nguyen");
            System.out.println("2. Bai 2: Diem trung binh va xep loai");
            System.out.println("3. Bai 3: Xac dinh mua theo thang");
            System.out.println("4. Bai 4: Thuc hien phep toan");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap vao 1 so: ");
                    int n = sc.nextInt();
                    System.out.println((n % 2 == 0) ? "So chan" : "So le");
                    if (n > 0) System.out.println("So nguyen duong");
                    else if (n < 0) System.out.println("So nguyen am");
                    else System.out.println("So 0");
                    break;

                case 2:
                    System.out.print("Nhap diem Toan: ");
                    double toan = sc.nextDouble();
                    System.out.print("Nhap diem Ly: ");
                    double ly = sc.nextDouble();
                    System.out.print("Nhap diem Hoa: ");
                    double hoa = sc.nextDouble();

                    double dtb = (toan * 2 + ly + hoa) / 4;
                    System.out.println("Diem trung binh: " + dtb);

                    if (dtb >= 8) System.out.println("Xep loai: Gioi");
                    else if (dtb >= 6.5) System.out.println("Xep loai: Kha");
                    else if (dtb >= 5.0) System.out.println("Xep loai: Trung binh");
                    else System.out.println("Xep loai: Yeu");
                    break;

                case 3:
                    System.out.print("Nhap thang (1-12): ");
                    int month = sc.nextInt();
                    switch (month) {
                        case 1: case 2: case 3:
                            System.out.println("Mua xuan"); break;
                        case 4: case 5: case 6:
                            System.out.println("Mua ha"); break;
                        case 7: case 8: case 9:
                            System.out.println("Mua thu"); break;
                        case 10: case 11: case 12:
                            System.out.println("Mua dong"); break;
                        default:
                            System.out.println("Thang khong hop le");
                    }
                    break;

                case 4:
                    System.out.print("Nhap so a: ");
                    double a = sc.nextDouble();
                    System.out.print("Nhap so b: ");
                    double b = sc.nextDouble();
                    System.out.print("Nhap phep toan (+, -, *, /): ");
                    char op = sc.next().charAt(0);

                    switch (op) {
                        case '+': System.out.println("Ket qua: " + (a + b)); break;
                        case '-': System.out.println("Ket qua: " + (a - b)); break;
                        case '*': System.out.println("Ket qua: " + (a * b)); break;
                        case '/':
                            if (b != 0) System.out.println("Ket qua: " + (a / b));
                            else System.out.println("Khong the chia cho 0");
                            break;
                        default: System.out.println("Phep toan khong hop le");
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
            System.out.println();
        } while (choice != 0);
    }
}