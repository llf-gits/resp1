package com.bianyi.dao;

import org.apache.ibatis.annotations.Select;


import java.util.List;
public interface AccountDao {

    @Select("select * from account where id=#{id}")
    Account findAccountById(Integer id);
}
