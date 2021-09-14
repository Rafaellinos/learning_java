package fit;

import fit.core.Spend;
import fit.core.SpendRepository;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldValidateSpendStructureAndGettersAndSetters() {
        // arrange
        var spend = new Spend();
        var spendName = "Despesa inicial";
        var spendDate = LocalDate.of(2021, Calendar.FEBRUARY, 7);
        var spendValue = 1000.00;

        // act
        spend.setName(spendName);
        var actualDate = LocalDate.of(spendDate.getYear(),
                spendDate.getMonth(),
                spendDate.getDayOfMonth());
        spend.setDate(Date.from(
                actualDate
                    .atStartOfDay()
                    .atZone(ZoneId.systemDefault())
                    .toInstant()));
        spend.setValue(spendValue);

        // assert
        assertEquals(spendName, spend.getName());
        assertTrue(spendDate.isEqual(spend.getDate()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate()));
        assertEquals(spendValue, spend.getValue(), 0.01);
    }

    @Test
    public void shouldValidateSpendRepositoryListBehavior() {
        // arrange
        var spendRepository = new SpendRepository(new ArrayList<>());

        var spendNameExpected = "Despesa inicial";
        var spendDateExpected = Calendar.getInstance();
        spendDateExpected.set(2021, Calendar.FEBRUARY, 7);
        var spendValueExpected = 1000.00;
        var spendExpected = new Spend();
        spendExpected.setName(spendNameExpected);
        spendExpected.setDate(spendDateExpected.getTime());
        spendExpected.setValue(spendValueExpected);

        // act
        spendRepository.add(spendExpected);

        // assert
        assertEquals(1, spendRepository.size());
        assertTrue(spendRepository.contains(spendExpected));
    }
}
