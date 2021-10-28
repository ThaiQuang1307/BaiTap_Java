package Bai2;

// file la. Bao gom file text va file run
public class FileLeaf implements FileComponent{
    private String nameFile;

    public FileLeaf(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    @Override
    public void open() {
        System.out.println(getNameFile());
    }

}
