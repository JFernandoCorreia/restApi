package in.FernandoCorreia.restapi.repository;

import in.FernandoCorreia.resapi.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {
}