package cn.itcast.service;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author: ck
 * @date: 2019/5/30 20:18
 * @description:
 */
public interface AccountService {
    /**
     * 保存用户
     * @param account
     */
    public void saveAccount(Account account);

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Account findById(Integer id);
}
