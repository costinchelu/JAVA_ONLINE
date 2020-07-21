package MovieBridge.Abstraction;

import MovieBridge.ImplementationBase.Formatter;
import MovieBridge.Model.Detail;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();
}
