import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PokemonTester {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokeList = new ArrayList<>();

        try {
            File file = new File("D:/codinggg/Java Projects/Pokemon/src/pokemonlist.txt");
            Scanner scan = new Scanner(file);
            scan.nextLine();
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                Pokemon p = new Pokemon(data[1].substring(1, data[1].length() - 1), Integer.parseInt(data[data.length - 1]), data[data.length - 10].substring(1, data[3].length() - 1), data[data.length - 9].substring(1, data[4].length() - 1), Integer.parseInt(data[data.length - 8]));
                pokeList.add(p);
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file");
        }

        printPokemon(pokeList);
    }

    public static void printPokemon(ArrayList<Pokemon> pokeList) {
        for (Pokemon p : pokeList) {
            System.out.println(p.getName());
        }
    }
}
