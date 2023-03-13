public class Main {
    public static void main(String[] args) {

        Folder php_demo1 = new Folder("php_demo1");

        //Sub Folders of php_demo1
        Folder source_file = new Folder("Source Files");
        Folder include_path = new Folder("Include Path");
        Folder remove_files = new Folder("Remote Files");

        //Source Files subfolders
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        File htaccess = new File("htaccess", "", 12);
        File htrouter = new File("htrouter", ".php", 24);
        File index = new File("index", "html", 69);

        //app subfolders
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        // Adding folders and files to app folder
        app.addSubFolders(config);
        app.addSubFolders(controllers);
        app.addSubFolders(library);
        app.addSubFolders(migrations);
        app.addSubFolders(models);
        app.addSubFolders(views);

        // Add folders and files to Source_files
        source_file.addSubFolders(phalcon);
        source_file.addSubFolders(app);
        source_file.addSubFolders(cache);
        source_file.addSubFolders(publicFolder);
        source_file.addFiles(htaccess);
        source_file.addFiles(htrouter);
        source_file.addFiles(index);

        // Add folders and files to php_demo1
        php_demo1.addSubFolders(source_file);
        php_demo1.addSubFolders(include_path);
        php_demo1.addSubFolders(remove_files);

        // Print the file tree
        System.out.println(php_demo1);

        //Remove the app folder from the full structure
        System.out.println("-------------------------");
        System.out.println("Entire folder tree after removing app folder");
        Folder sourceFile = php_demo1.getSubFolders().get(0);
        sourceFile.removeSubFolder(app);

        System.out.println(php_demo1);

        System.out.println("-------------------------");
        System.out.println("Entire folder tree after removing public folder");
        sourceFile.removeSubFolder(publicFolder);
        System.out.println(php_demo1);

    }
}