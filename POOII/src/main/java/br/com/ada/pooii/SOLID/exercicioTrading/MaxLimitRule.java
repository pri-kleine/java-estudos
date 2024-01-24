package POOII.src.main.java.br.com.ada.pooii.SOLID.exercicioTrading;

import java.math.BigDecimal;

public class MaxLimitRule implements TransactionValidate{
    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");

    @Override
    public void validate(Transaction transaction) {

        if (transaction.getAmount().compareTo(MAX_DAILY_LIMIT) > 0) {
            throw new RuntimeException("invalid transaction: max limit");
        }
    }
}
