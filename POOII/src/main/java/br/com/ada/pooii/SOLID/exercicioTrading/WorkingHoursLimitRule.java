package POOII.src.main.java.br.com.ada.pooii.SOLID.exercicioTrading;

import java.time.LocalDateTime;
public class WorkingHoursLimitRule implements TransactionValidate{
    @Override
    public void validate(Transaction transaction) {
        if (isAfterWorkingHours(transaction)) {
            throw new RuntimeException("invalid transaction: after working hours");
        }
    }

    private boolean isAfterWorkingHours(Transaction transaction) {
        // lógica para verificar a hora
        LocalDateTime limit = LocalDateTime.of(2024, 1, 25, 22, 0, 0);
        return transaction.getCreated().isAfter(limit);
    }
}
