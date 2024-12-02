package Lab1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Game[] games = new Game[12];
        games[0] = new Game("Dawn of War - Soulstorm", "RTS", 2008);
        games[0].setPrice(2.0F);
        games[1] = new Game("HELLDIVERS 2", "TPS", 2024, 19.99F);
        games[2] = new Game("Garry's Mod", "Sandbox", 2006, 9.99F);
        games[3] = new Game("People Playground", "Sandbox", 2019, 9.99F);
        games[4] = new Game("Terraria", "Adventure", 2011);
        games[4].setPrice(4.99F);
        games[5] = new Game("BEEP", "Adventure", 2011, 0.99F);
        games[6] = new Game("Castle Crashers", "Beat 'em up", 2008, 1.49F);
        games[7] = new Game("TES V Skyrim", "RPG", 2011, 19.99F);
        games[8] = new Game("Magicka", "Adventure", 2011, 2.49F);
        games[9] = new Game("Mirror's Edge", "Action-Adventure", 2009, 3.99F);
        games[10] = new Game("Deathtrap", "Tower Defence", 2015, 1.99F);
        games[11] = new Game("Scrap Mechanic", "Sandbox", 2016, 13.39F);

        for(int i = 0; i < games.length; ++i) {
            int j_max = i;

            for(int j = i + 1; j < games.length; ++j) {
                if (games[j_max].price < games[j].price) {
                    j_max = j;
                }
            }

            Game temp = games[i];
            games[i] = games[j_max];
            games[j_max] = temp;
        }

        try {
            PrintStream out = new PrintStream(new File("C:/Users/terty/Desktop/мага/OOP/src/Lab1/data.txt"));

            for(Game game : games) {
                game.printToFile(out);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
