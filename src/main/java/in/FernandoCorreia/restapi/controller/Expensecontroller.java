package in.FernandoCorreia.restapi.controller;

import in.FernandoCorreia.restapi.dto.ExpenseDTO;
import in.FernancoCorreia.restapi.io.ExpenseResponse;
import in.FernandoCorreia.restapi.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
/**
 * This is controller class for Expense module
 * @author J Fernando Correia
 * */
@RestController
@RequiredArgsConstructor
@Slf4j
public class Expensecontroller {

    private final ExpenseService expenseService;
    private final ModelMapper modelMapper;

    /**
     * It will fetch the expenses from database
     * @return list
     * */
    @GetMapping("/expenses")
    public List<ExpenseResponse> getExpenses() {
        log.info("API GET /expenses called");
        //Call the service method
        List<ExpnseDTO> list = expenseService.getAllExpenses();
        log.info("Printing the data from service {}", list);
        //Convert the Expense DTO to Expense Response
        List<ExpenseResponse> response = list.stream().map(expenseDTO -> mapToExpenseResponse(expenseDTO)).collect(Collectors.toList());
        //Return the list/response
        return response;
    }

    /**
     * Mapper method for converting expense dto object to expense response
     * @param expenseDTO
     * @return ExpenseResponse
     * */
    private ExpenseResponse mapToExpenseResponse(ExpenseDTO expenseDTO) {
        return modelMapper.map(expenseDTO, ExpenseResponse.class);
    }
}