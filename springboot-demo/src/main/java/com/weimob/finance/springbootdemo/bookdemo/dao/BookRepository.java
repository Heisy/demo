package com.weimob.finance.springbootdemo.bookdemo.dao;

import com.weimob.finance.springbootdemo.bookdemo.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByReader(String reader);
}
