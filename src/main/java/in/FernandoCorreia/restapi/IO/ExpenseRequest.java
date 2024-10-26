package in.FernandoCorreia.restapi.IO;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseRequest {

    private String name;

    private String note;

    private String category;

    private Date date;

    private BigDecimal amount;
}