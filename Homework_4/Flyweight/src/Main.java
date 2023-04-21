import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] fonts = {"Arial", "Calibri", "Verdana"};
        String[] color = {"red", "blue", "black"};
        int[] size = {12, 14, 16};

        CharacterFactory charFactory = new CharacterFactory();

//        Character h = new Character("h", charFactory.getCharacterProperties("Arial,red,12"));
//        Character e = new Character("e", charFactory.getCharacterProperties("Calibri,blue,14"));
//        Character l = new Character("l", charFactory.getCharacterProperties("Verdana,black,16"));
//        Character l2 = new Character("l", charFactory.getCharacterProperties("Verdana,black,16"));
//        Character o = new Character("o", charFactory.getCharacterProperties("Arial,blue,12"));

//        System.out.println(h);
//        System.out.println(charFactory.getPropertiesHashMap());

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

        textEditor.setContent(content);
        textEditor.saveDocument();
        System.out.println(textEditor.getPropertiesHashMap());
    }
}