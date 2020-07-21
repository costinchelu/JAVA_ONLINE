package hr.taxes;

import hr.personnel.FullTimeEmployee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaxCalculatorTest {

    private TaxCalculator taxCalculator;

    @Before
    public void setUp() {
        taxCalculator = new TaxCalculator();
    }

    @Test
    public void testCalculateFull() {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Fanel", 2000);
        double rezultatAsteptat = 620;
        double rezultatPrimit = taxCalculator.calculate(fullTimeEmployee);
        assertEquals("Rezultat incorect", rezultatAsteptat, rezultatPrimit, 0.01);
    }
}