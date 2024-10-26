package	in.FernandoCorreia.restapi.DTO;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseDTO {

    private String expenseId;

    private String name;

    private String note;

    private String category;

    private Date date;

    private BigDecimal amount;

    private Timestamp createdAt;

    private Timestamp updatedAt;

}