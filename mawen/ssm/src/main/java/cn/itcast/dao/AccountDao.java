package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author: ck
 * @date: 2019/5/30 20:17
 * @description:
 */
public interface AccountDao {
    /**
     * 保存用户
     * @param account
     */
    @Update("insert into account values(null,#{name},#{money})")
    public void saveAccount(Account account);

    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @Select("select *from account where id=#{id}")
    public Account findById(Integer id);

    /**
     * 修改账户信息
     * @param account
     */
    public void updateAccount(Account account);

}
