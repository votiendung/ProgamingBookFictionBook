import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book[] listBook = new Book[10];
        listBook[0] = new ProgrammingBook("sach1", "vo tien dung ", 123, 100000, "php", "a");
        listBook[1] = new ProgrammingBook("sach2", "vo tien dung ", 125, 700000, "javascript", "c");
        listBook[2] = new ProgrammingBook("sach3", "vo tien dung ", 124, 500000, "java", "b");
        listBook[3] = new ProgrammingBook("sach4", "vo tien dung ", 126, 900000, "C++", "e");
        listBook[4] = new ProgrammingBook("sach5", "vo tien dung ", 127, 1100000, "ruby", "f");
        listBook[5] = new FictionBook("sach6", "nguyen kim bao", 128, 600000, "thuat toan1");
        listBook[6] = new FictionBook("sach7", "nguyen kim bao", 129, 800000, "thuat toan2");
        listBook[7] = new FictionBook("sach8", "nguyen kim bao", 130, 1000000, "thuat toan3");
        listBook[8] = new FictionBook("sach9", "nguyen kim bao", 131, 1200000, "thuat toan4");
        listBook[9] = new FictionBook("sach10", "nguyen kim bao", 132, 1400000, "thuat toan5");

//      tinh tong
        long sum = 0;
        for (Book book : listBook) {
            sum += book.getPrice();
        }
        System.out.println("tong so tien gia sach la: " + sum);

//        dem so sach
        int count = 0;
        for (Book book : listBook) {
            boolean check = book instanceof ProgrammingBook;
            if (check) {
                if (((ProgrammingBook) book).getLanguage().equals("java")) {
                    count++;
                }
            }
        }
//      nhap ten sach in ra gia
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String nameSearch = sc.nextLine();
        for (int i = 0; i < listBook.length; i++) {
            if (nameSearch.equals(listBook[i].name)){
                System.out.println(listBook[i].price);
                break;
            }
        }

//    sap xep gia cua sach theo 3 giai thuat
        // sắp xếp theo giá kiểu nổi bọt
        for (int i = 0; i < listBook.length; i++) {
            for (int j = i + 1; j < listBook.length - 1; j++) {
                if (listBook[i].getPrice() > listBook[j].getPrice()) {
                    Book temp = listBook[i];
                    listBook[i] = listBook[j];
                    listBook[j] = temp;
                }
            }
        }
        for (Book book : listBook) {
            System.out.println(book);

        }

//        // sắp xếp theo giá kiểu chèn
        for (int i = 1; i < listBook.length; i++) {
            Book temp = listBook[i];
            int j = i - 1;
            while (j >= 0 && temp.getPrice() < listBook[j].getPrice()) {
                listBook[j + 1] = listBook[j];
                j--;
            }
            listBook[j + 1] = temp;
        }
        for (Book book : listBook) {
            System.out.println(book);

        }

//        // sắp xếp theo giá kiểu chọn
        for (int i = 0; i < listBook.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < listBook.length; j++) {
                if (listBook[j].getPrice() < listBook[min].getPrice()) {
                    min = j;
                }
            }
            if (min != i) {
                Book temp = listBook[min];
                listBook[min] = listBook[i];
                listBook[i] = temp;
            }
        }
        for (Book book : listBook) {
            System.out.println(book);
        }

    }
}
