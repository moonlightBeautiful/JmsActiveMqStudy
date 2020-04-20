package com.ims.dao;


import com.ims.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer>, JpaSpecificationExecutor<Book> {
    //hql Ĭ��nativeQuery = false
    //?1 ��һ������
    @Query("select b from Book b where b.name like %?1%")
    List<Book> findByName(String name);

    //sql  nativeQuery = true
    //?1 ��һ������
    // RAND() �����ѯ
    @Query(value = "select * from t_book order by RAND() limit ?1", nativeQuery = true)
    List<Book> randomList(Integer n);

}
