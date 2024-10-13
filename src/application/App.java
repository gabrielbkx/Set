import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full patch: ");
        String patch = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(patch))) {
            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();
            while (line != null) {
                String[] vect = line.split(" ");
                String username = vect[0];
                Date moment = Date.from(Instant.parse(vect[1]));
                set.add(new LogEntry(username, moment));
                line = br.readLine();
            }
            System.out.println("Total users " + set.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}