package lucrul_cu_fisiere;

import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

public class Scriere {

    public static final String CALE_FISIER_IO = "lista.txt";

    public static void scriere(List<String> listaDeScris) {

        FileWriter fWriter = null;

        try {
            fWriter = new FileWriter(CALE_FISIER_IO);
            for (String linie : listaDeScris) {
                fWriter.write(linie + "\n");
            }

        } catch (IOException e) {
            System.out.println("Eroare la scrierea în fișier. " + e.getMessage());
        } finally {
            if (fWriter != null) {
                try {
                    fWriter.close();

                } catch (IOException e) {
                    System.out.println("Eroare la închiderea fișierului. " + e.getMessage());
                }
            }
        }
    }
}
