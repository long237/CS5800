public class Character {
    private String data;
    private CharacterProperties characterProperties;

    public Character(String data, CharacterProperties characterProperties) {
        this.data = data;
        this.characterProperties = characterProperties;
    }

    @Override
    public String toString() {
        return "" + data + "," + characterProperties.toString();
    }
}
