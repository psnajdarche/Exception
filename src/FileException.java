public class FileException extends  Exception{
    private int  broj;
    private String text;
    public FileException(String message,int broj,String text) {
        super(message + " Line " + broj + " Text(" +text+")");
        this.broj=broj;
        this.text=text;
    }

    public int getBroj() {
        return broj;
    }

    public String getText() {
        return text;
    }
}
