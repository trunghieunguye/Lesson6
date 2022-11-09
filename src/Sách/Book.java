package Sách;

import java.util.Scanner;

public class Book {
    protected int id;
    protected String name;
    protected String authorName;
    protected int yearBorn;
    protected String type;
//    ----------------------------------------------------------------------------------

    private static int Auto_id = 0;
    public Book(){
        if (Auto_id == 0){
            Auto_id = 9999;
        }
        Auto_id++;
        this.id = Auto_id;
    }
//    --------------------------------------------------------------------------------------------



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //    -------------------------------------------------------------------------------------------
    public void nhapSach(){
        System.out.println("Nhập id:");
        this.id = Auto_id;
        System.out.println("Nhập tên sách:");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên tác giả:");
        this.authorName = new Scanner(System.in).nextLine();
        System.out.println("Nhập năm xuất bản:");
        this.yearBorn = new Scanner(System.in).nextInt();
        System.out.println("Nhập tên khoa: ");
        System.out.println("Vui lòng chọn 1 trong các loại dưới đây: ");
        System.out.println("1. Khoa học tự nhiên.");
        System.out.println("2. Văn học - Nghệ thuật.");
        System.out.println("3. Điện tử viễn thông.");
        System.out.println("4. Công nghệ thông tin.");
        int bookTypeTemp;
        do {
            bookTypeTemp = new Scanner(System.in).nextInt();
            if (bookTypeTemp >= 1 && bookTypeTemp <= 4) {
                break;
            }
            System.out.print("Tên khoa không hợp lệ, vui lòng nhập lại: ");
        } while (true);
        switch (bookTypeTemp) {
            case 1:
                this.type = TenKhoa.KHTN;
                break;
            case 2:
                this.type = TenKhoa.VHNT;
                break;
            case 3:
                this.type = TenKhoa.DTVT;
                break;
            case 4:
                this.type = TenKhoa.CNTT;
                break;
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearBorn=" + yearBorn +
                ", type='" + type + '\'' +
                '}';
    }
}
