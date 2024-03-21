package com.testproject.app.rest.repository;

import com.testproject.app.rest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> { //<dto, tipodatoclave>

}
