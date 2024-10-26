package in.FernandoCorreia.restapi.IO;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseResponse {

    private String expenseId;

    private String name;

    private String note;

    private String category;

    private Date date;

    private BigDecimal amount;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}