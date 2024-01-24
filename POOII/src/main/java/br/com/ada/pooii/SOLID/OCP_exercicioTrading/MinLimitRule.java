package POOII.src.main.java.br.com.ada.pooii.SOLID.OCP_exercicioTrading;

import java.math.BigDecimal;

public class MinLimitRule implements TransactionValidate{
    private static final BigDecimal MIN_DAILY_LIMIT = new BigDecimal("50");

    @Override
    public void validate(Transaction transaction) {

        if (transaction.getAmount().compareTo(MIN_DAILY_LIMIT) < 0) {
            throw new RuntimeException("invalid transaction: min limit");
        }
    }
}
