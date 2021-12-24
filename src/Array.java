import java.util.Scanner;

public class Array {
    public String[] setArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu muon khoi tao");
        int n = scanner.nextInt();

        scanner.nextLine();

        String[] a = new String[n];
        System.out.println("Nhap phan tu cho mang");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            a[i] = scanner.nextLine();
        }
        return a;
    }

    public void printArray(String[] arr) {
        System.out.println("Mang vua nhap");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i] + " ");
        }
        System.out.println();
    }

    public void countString(String[] arr) {
        int count = 0;
        for (String ele : arr) {
            if (ele.equals("java"))
                count++;
        }
        System.out.println("Tu java xuat hien " + count + " lan");
    }

    public void indexString(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu muon tim vi tri");
        String n = scanner.nextLine();

        for (int i = 0; i < arr.length; i++) {
            if (n.equals(arr[i]))
                System.out.println("chuỗi " + n + " ở vị trí " + i);
        }
    }
}
