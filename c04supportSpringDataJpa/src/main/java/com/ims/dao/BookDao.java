package com.ims.dao;


import com.ims.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer>, JpaSpecificationExecutor<Book> {
    //hql 默认nativeQuery = false
    //?1 第一个参数
    @Query("select b from Book b where b.name like %?1%")
    List<Book> findByName(String name);

    //sql  nativeQuery = true
    //?1 第一个参数
    // RAND() 随机查询
    @Query(value = "select * from t_book order by RAND() limit ?1", nativeQuery = true)
    List<Book> randomList(Integer n);

}
