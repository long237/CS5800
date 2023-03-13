import java.lang.reflect.Array;
import java.util.ArrayList;

public class Folder {
    private String folderName;
    private ArrayList<File> files = new ArrayList<>();
    private ArrayList<Folder> subFolders = new ArrayList<>();
    private int folderSize = 0;

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public Folder(String folderName, ArrayList<File> files, int folderSize) {
        this.folderName = folderName;
        this.files = files;
        this.folderSize = folderSize;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public int getFolderSize() {
        return folderSize;
    }

    public void setFolderSize(int folderSize) {
        this.folderSize = folderSize;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(ArrayList<Folder> folders) {
        this.subFolders = folders;
    }

    public void addSubFolders (Folder folder) {
        this.subFolders.add(folder);
    }

    public void removeSubFolder (Folder folder) {
        this.subFolders.remove(folder);
    }

    public void addFiles (File file){
        this.files.add(file);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "folderName='" + this.getFolderName() + '\'' + '\n' +
                "\t, files=" + this.getFiles() + '\n' +
                "\t, subfolders=" + this.getSubFolders() +
                '}' + '\n';
    }
}
