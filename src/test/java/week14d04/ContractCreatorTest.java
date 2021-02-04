package week14d04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContractCreatorTest {

@Test
public void testCreate() {
        List<Integer> monthlyPrices = Arrays.asList(1, 2, 3, 4);
        ContractCreator contractCreator = new ContractCreator("John Doe", monthlyPrices);
        Contract contract = contractCreator.create("Jane Doe");
        Contract contractOther = contractCreator.create("Jack Doe");

        assertEquals("Jane Doe", contract.getClient());
        assertEquals(2, contract.getMonthlyPrices().get(1));
        assertEquals("Jack Doe", contractOther.getClient());
        assertEquals(2, contractOther.getMonthlyPrices().get(1));

        contract.getMonthlyPrices().set(1, 5);

        assertEquals("Jane Doe", contract.getClient());
        assertEquals(5, contract.getMonthlyPrices().get(1));
        assertEquals("Jack Doe", contractOther.getClient());
        assertEquals(2, contractOther.getMonthlyPrices().get(1));
        }
        }
