package working_w_files;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;


public class Program {

    public static void main(String[] args) {

        cumSeSeteazaOCale();

        ListaPentruScris lista = new ListaPentruScris();

        System.out.println("Scriem un fisier");
        Scriere.scriere(lista.getListaDeString());

        System.out.println("Citim dintr-un fisier");
        List<String> listaDinFisier = Citire.citire();
        for(String linie : listaDinFisier) {
            System.out.println(linie);
        }

    }

    public static void cumSeSeteazaOCale() {

        // CALEA RELATIVA A PROIECTULUI:
        Path cale = FileSystems.getDefault().getPath("");

        // tipărim valoarea absolută a căii proiectului
        System.out.println("Calea absolută a proiectului este: " + cale.toAbsolutePath());
    }

}