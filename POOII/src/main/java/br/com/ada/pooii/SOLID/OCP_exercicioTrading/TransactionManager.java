package POOII.src.main.java.br.com.ada.pooii.SOLID.OCP_exercicioTrading;

import java.util.List;

public class TransactionManager {


    void executeTrade(Transaction transaction, List<? extends TransactionValidate> rules) {

        for (TransactionValidate rule : rules) {
            rule.validate(transaction);
        }
        transact(transaction);
    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeed: " + transaction);
    }
}
