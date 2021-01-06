import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    public void readFile(String filePath) {
        BufferedReader bufferedReader = null;
        int sum = 0;
        try {
            File file = new File(filePath);
            // kiểm tra sự tồn tại của file theo đường dẫn
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum +=Integer.parseInt(line);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                bufferedReader.close();
                System.out.println("sum is: "+sum);
            }catch (Exception e){}
        }
    }
}
