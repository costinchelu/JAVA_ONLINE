package working_w_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Citire {

    public static List<String> citire() {

        List<String> list = new ArrayList<>();

        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(Paths.get(Scriere.CALE_FISIER_IO));

            String linie;
            while ((linie = reader.readLine()) != null) {
                list.add(linie);
            }

        } catch (IOException e) {
            System.out.println("Eroare la citirea din fișier. " + e.getMessage());
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Eroare la închiderea fișierului. " + e.getMessage());
                }
            }
        }


        return list;
    }

}
