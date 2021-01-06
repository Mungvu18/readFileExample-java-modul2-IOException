import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadFile readFile = new ReadFile();
        System.out.println("Mời bạn nhập tên đường dẫn");
        String filePath = sc.next();
        readFile.readFile(filePath);
    }
}
