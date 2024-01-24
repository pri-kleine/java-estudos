package POOII.src.main.java.br.com.ada.pooii.SOLID.exercicioTrading;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class StockAvailableRule implements TransactionValidate{

    List<String> stockArrayList = Arrays.asList("NATURA", "PETROBRAS", "MAGALU", "AMBEV", "ADA");

    @Override
    public void validate(Transaction transaction) {
        if (!stockArrayList.contains(transaction.getStock())){
            throw new RuntimeException("invalid transaction: " + transaction.getStock() + " is not on the list of traded stock.");
        }
    }
}
