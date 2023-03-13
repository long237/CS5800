public class File {
    private String fileName;
    private String fileType;
    private int fileSize;

    public File(String fileName, String fileType, int fileSize) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + this.getFileName() + '\'' +
                ", fileType='" + this.getFileType() + '\'' +
                '}' + '\n';
    }
}
