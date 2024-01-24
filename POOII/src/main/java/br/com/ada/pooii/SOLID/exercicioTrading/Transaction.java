package POOII.src.main.java.br.com.ada.pooii.SOLID.exercicioTrading;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Locale;

public class Transaction {

    private BigDecimal amount;
    private String stock;
    private LocalDateTime created;

    public Transaction(BigDecimal amount, String stock) {
        this.amount = amount;
        this.stock = stock;
        this.created = LocalDateTime.now();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getStock() {
        return stock;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
