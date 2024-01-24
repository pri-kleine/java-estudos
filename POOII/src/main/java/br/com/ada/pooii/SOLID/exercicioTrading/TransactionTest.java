package POOII.src.main.java.br.com.ada.pooii.SOLID.exercicioTrading;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TransactionTest {
    public static void main(String[] args) {

        TransactionManager manager = new TransactionManager();

        var t1 = new Transaction(new BigDecimal("800"), "ADA");
        List<? extends TransactionValidate> rules = Arrays.asList(
                new MaxLimitRule(),
                new MinLimitRule(),
                new StockAvailableRule(),
                new WorkingHoursLimitRule()
        );

        manager.executeTrade(t1, rules);

    }
}
