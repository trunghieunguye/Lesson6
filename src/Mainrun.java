import Sách.Book;
import java.util.Scanner;

public class Mainrun {
    public static Book[] books = new Book[100];
    public static void main(String[] args) {
        while (true){
            showMenu();
            int chucnang = chonChucnang();
            switch (chucnang){
                case 1:
                    System.out.println("Nhập số sách muốn thêm: ");
                    int addBook = new Scanner(System.in).nextInt();
                    for (int i = 0; i < addBook; i++) {
                        Book book = new Book();
                        book.nhapSach();
                        for (int j = 0; j < books.length; i++) {
                            if(books[j] == null){
                                books[j] = book;
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < books.length; i++) {
                        if(books[i] != null){
                            System.out.println(books[i]);
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Bạn đã đăng xuất!");
                    return;
            }
        }
    }
    public static void showMenu(){
        System.out.println("1. Nhập danh sách các sách:");
        System.out.println("2. In danh sách các sách:");
        System.out.println("3. Nhập danh sách người đọc:");
        System.out.println("4. In danh sách người đọc:");
        System.out.println("5. Thoát chương trình:");
    }
    public static int chonChucnang(){
        int numberChoice;
        do {
            System.out.println("Nhập chức năng: ");
            numberChoice = new Scanner(System.in).nextInt();
            if(numberChoice >= 1 && numberChoice <= 5){
                break;
            }
            System.out.println("Không hợp lệ, vui lòng nhập lại");
        }
        while (true);
        return numberChoice;
    }

}



