package FileIO;

import java.io.File;
import java.util.Date;

public class FileLists {
    public static void main(String[] args){
        File file= new File("C:\\Users\\admin");
        String[] fileLis= file.list();
        for (String i:fileLis){
            System.out.println(i);
        }
    }
}
