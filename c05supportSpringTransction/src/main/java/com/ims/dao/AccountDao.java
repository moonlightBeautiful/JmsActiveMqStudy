package com.ims.dao;


import com.ims.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 账户Dao接口
 *
 * @author Administrator
 */
public interface AccountDao extends JpaRepository<Account, Integer> {

}
