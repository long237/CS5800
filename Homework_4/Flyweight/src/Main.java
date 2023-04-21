import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] fonts = {"Arial", "Calibri", "Verdana"};
        String[] color = {"red", "blue", "black"};
        int[] size = {12, 14, 16};

        CharacterFactory charFactory = new CharacterFactory();

        // Create New Document
        TextEditor textEditor = new TextEditor("helloWorld.txt");
        textEditor.createDocument();

        List<Character> content = new ArrayList<Character>();
        Character h = new Character("H", textEditor.getCharacterProperties("Arial,red,12"));
        Character e = new Character("e", textEditor.getCharacterProperties("Calibri,blue,14"));
        Character l = new Character("l", textEditor.getCharacterProperties("Verdana,black,16"));
        Character l2 = new Character("l", textEditor.getCharacterProperties("Verdana,black,16"));
        Character o = new Character("o", textEditor.getCharacterProperties("Arial,blue,12"));

        Character w = new Character("W", textEditor.getCharacterProperties("Arial,black,12"));
        Character o2 = new Character("o", textEditor.getCharacterProperties("Calibri,blue,16"));
        Character r = new Character("r", textEditor.getCharacterProperties("Calibri,black,12"));
        Character l3 = new Character("l", textEditor.getCharacterProperties("Verdana,blue,12"));
        Character d = new Character("d", textEditor.getCharacterProperties("Verdana,red,14"));

        Character c = new Character("C", textEditor.getCharacterProperties("Arial,blue,16"));
        Character s = new Character("S", textEditor.getCharacterProperties("Calibri,black,16"));
        Character five = new Character("5", textEditor.getCharacterProperties("Arial,red,16"));
        Character eight = new Character("8", textEditor.getCharacterProperties("Verdana,red,12"));
        Character zero = new Character("0", textEditor.getCharacterProperties("Calibri,black,12"));
        Character zero2 = new Character("0", textEditor.getCharacterProperties("Arial,blue,14"));

        content.add(h);
        content.add(e);
        content.add(l);
        content.add(l2);
        content.add(o);
        content.add(w);
        content.add(o2);
        content.add(r);
        content.add(l3);
        content.add(d);
        content.add(c);
        content.add(s);
        content.add(five);
        content.add(eight);
        content.add(zero);
        content.add(zero2);

        // Save Document
        textEditor.setContent(content);
        textEditor.saveDocument();
        System.out.println(textEditor.getPropertiesHashMap());

        // Load Existing Document
        TextEditor editDocument = new TextEditor("helloWorld.txt");
        editDocument.loadDocument();

        // Edit Document
        content.clear();
        Character h2 = new Character("h", textEditor.getCharacterProperties("Arial,blue,16"));
        Character i = new Character("i", textEditor.getCharacterProperties("Calibri,red,12"));
        Character exclaimation = new Character("!", textEditor.getCharacterProperties("Verdana,red,12"));
        content.add(h2);
        content.add(i);
        content.add(exclaimation);
        editDocument.editDocument(content);
    }
}