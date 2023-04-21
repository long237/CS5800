import java.util.HashMap;

public class CharacterFactory {
    private HashMap<String, CharacterProperties> propertiesHashMap = new HashMap<>();

    public HashMap<String, CharacterProperties> getPropertiesHashMap() {
        return propertiesHashMap;
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
}
