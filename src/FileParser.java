import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileParser {
    static List<Integer> readFromTextFile(String fileName) throws IOException, FileException {
        BufferedReader reader=new BufferedReader(new FileReader(fileName));
        List<Integer> ints=new ArrayList<Integer>();
        String line="";
        int lineNumber=1;
        try {

            while ((line=reader.readLine())!=null)
            {
                if(line.length()>0)
                ints.add(Integer.parseInt(line));
                lineNumber++;
            }
        }
        catch (Exception ex){
            throw new FileException("Error parsing file" + fileName, lineNumber,line);
        }
        finally {
            reader.close();
        }
        return ints;
    }
}
