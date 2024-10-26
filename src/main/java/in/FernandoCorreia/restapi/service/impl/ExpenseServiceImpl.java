package in.FernandoCorreia.restapi.service.impl;

import in.FernandoCorreia.restapi.dto.ExpenseDTO;
import in.FernandoCorreia.restapi.service.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service implementation for Expense module
 * @author J Fernando Correia
 * */
@Service
@RequiredArgsConstructor
@Slf4j
public class ExpenseServiceImpl implements ExpenseService{

    private final ExpenseRepository expenseRepository;
    private final ModelMapper modelMapper;

    /**
     * It will fetch the expenses from database
     * @return list
     * */
    @Override
    public List<ExpenseDTO> getAllExpenses(); {
       //Call the repository method
       List<ExpenseEntity> list = expenseRepository.findAll();
       log.info("Printing the data from repository {}", list);
       //Convert the Entity object to DTO object
       List<ExpenseDTO> listOfExpenses = list.stream().map(expenseEntity -> mapToExpenseDTO(expenseEntity)).collect(Collectors.toList());
       //Return the list
       return listExpenses;
    }

    /**
     * Mapper method to convert expense entity to expense DTO
     * @param expenseEntity
     * @return ExpenseDTO
     * */
    private ExpenseDTO mapToExpenseDTO(ExpenseEntity expenseEntity) {
        return modelMapper.map(expenseEntity, ExpenseDTO.class);
    }
}