import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TextEditor {
    private String filePath;
    private List<Character> content = new ArrayList<Character>();
    private HashMap<String, CharacterProperties> propertiesHashMap = new HashMap<>();

    public HashMap<String, CharacterProperties> getPropertiesHashMap() {
        return propertiesHashMap;
    }

    public TextEditor(String filePath) {
        this.filePath = filePath;
    }

    public void setContent(List<Character> content) {
        this.content = content;
    }

    public CharacterProperties getCharacterProperties(String properties) {
        CharacterProperties characterProps = (CharacterProperties) propertiesHashMap.get(properties);

        if (characterProps == null){
            String[] props = properties.split(",");
            characterProps = new CharacterProperties(props[0], props[1], Double.parseDouble(props[2]));
            propertiesHashMap.put(properties, characterProps);
        }
        return characterProps;
    }

    public boolean createDocument(){
        try {
            File newFile = new File(filePath);
            if(newFile.createNewFile()){
                return true;
            }
        }
        catch (IOException e) {
            System.out.println("Creating file failed");
        }
        return false;
    }

    public void editDocument(List<Character> characters) {
        try {
            FileWriter myWriter = new FileWriter(filePath, true);
            for (Character character : characters) {
                myWriter.write(character.toString() + "\n");
            }
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("Error when editing the document");
        }
    }

    public void saveDocument() {
        try {
            FileWriter myWriter = new FileWriter(filePath);
            for (Character character : content) {
                myWriter.write(character.toString() + "\n");
            }
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("Error when saving to document");
        }
    }

    public void loadDocument() {
        try {
            File file = new File(filePath);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] data = line.split(",");
                CharacterProperties props = new CharacterProperties(data[1], data[2], Double.parseDouble(data[3]));
                Character character = new Character(data[0], props);
                content.add(character);
            }
            myReader.close();
        }
        catch (IOException e) {
            System.out.println("Error when loading file to text editor");
        }
    }
}
