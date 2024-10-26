package in.FernandoCorreia;

import in.FernandoCorreia.restapi.dto.ExpenseDTO;

import java.util.List;

/**
 * Service interface for Expense module
 * @author J Fernando Correia
 * */
public interface ExpenseService {

    /**
     * It wi    ll fetch the expenses from database
     * @return list
     * */
    List<ExpenseDTO> getAllExpenses();
}