package Bai2;

// file van ban
public class FielText extends FileLeaf{
    private String text;

    public FielText(String nameFile) {
        super(nameFile);
    }

    public FielText(String nameFile, String text) {
        super(nameFile);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void open() {
        System.out.println(getNameFile() + " : " + getText());
    }
}
