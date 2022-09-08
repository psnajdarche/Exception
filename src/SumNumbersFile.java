import java.io.FileNotFoundException;

public class SumNumbersFile {
    public static void main(String[] args) throws Exception {
        try {
            var ints = FileParser.readFromTextFile("brojevi.txt"); //ovo je checked execution on complain time tako da nece da se po
            long sum=0;
            for(int x : ints)
            {
                sum+=x;
            }
            System.out.println("Sum=" +sum);
            }

        catch(FileException ex){
            System.out.println("Error file faild!");
            System.out.println("Line:"+ex.getBroj());
            System.out.println("Incorrect text:"+ex.getText());

        }
        catch (FileNotFoundException fnf)
        {
            System.out.println("FIle doesn't exist !");
        }
    }
}
