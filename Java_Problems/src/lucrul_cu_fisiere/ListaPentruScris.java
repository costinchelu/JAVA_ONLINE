package lucrul_cu_fisiere;

import java.util.ArrayList;
import java.util.List;

public class ListaPentruScris {

    private List<String> listaDeString;

    public ListaPentruScris() {
        listaDeString = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            StringBuilder sb = new StringBuilder();
            for (int it = 1; it <= i; it++) {
                sb.append("A");
            }
            listaDeString.add(sb.toString());
        }
    }

    public List<String> getListaDeString() {
        return listaDeString;
    }
}
/*

hardcoded list

 */