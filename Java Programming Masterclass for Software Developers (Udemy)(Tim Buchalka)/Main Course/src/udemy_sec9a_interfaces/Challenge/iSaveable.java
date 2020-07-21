package udemy_sec9a_interfaces.Challenge;

import java.util.List;

public interface iSaveable {

    List write();

    void read(List<String> savedValues);
}
