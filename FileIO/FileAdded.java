package FileIO;


import java.io.File;
import java.io.IOException;

public class FileAdded {
    public static void main(String[] args){
        File file= new File("test.pdf");
        try {
        if(file.createNewFile()){
            System.out.println("the file created");
        }
        else{
            System.out.println("the file already exist");
        }

        }catch (IOException e){
            System.out.println("The error Occured");
        }
    }

}
