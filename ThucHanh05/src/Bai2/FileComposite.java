package Bai2;

import java.util.ArrayList;
import java.util.List;

public class FileComposite implements FileComponent{
    private String nameFolder;
    private List<FileComponent> files = new ArrayList<>();

    public FileComposite() {
    }

    public FileComposite(String nameFolder) {
        this.nameFolder = nameFolder;
    }

    public FileComposite(List<FileComponent> files) {
        this.files = files;
    }

    public String getNameFolder() {
        return nameFolder;
    }

    // duyet cac phan tu trong thu muc
    @Override
    public void open() {
        for (FileComponent f : files) {
            if (f instanceof FileComposite) {
                System.out.println(((FileComposite) f).getNameFolder());
                FileComposite temp = (FileComposite) f;
                //goi de quy
                temp.open();
            }
            else if (f instanceof FileLeaf) {
                f.open();
            }
        }

//        for (FileComponent f : files) {
//            if (f instanceof FileLeaf) {
//                f.open();
//            }
//        }
    }

    public void add(FileComponent fileComponent){
        files.add(fileComponent);
    }

    public FileComponent getChild(int i){
        return files.get(i);
    }

    public void remove(int i){
        files.remove(files.get(i));
    }

    // duyet cac phan tu trong thu muc
//    public void browseFolder(){
//        for (FileComponent f : files) {
//            if (f instanceof FileLeaf){
//                f.open();
//            }else if (f instanceof FileComposite){
//                f.open();
//                FileComposite temp = (FileComposite) f;
//                //goi de quy
//                temp.browseFolder();
//            }
//        }
//    }
}
