package com.cashapona.repository;
  
import org.springframework.data.repository.CrudRepository;  
import com.cashapona.model.Books;  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  