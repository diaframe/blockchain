package com.nwnu.blockchain.mapper;

import com.nwnu.blockchain.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

/**
 * Mapper接口
 * @author cyt
 * @since 2019-05-13
 * */
public interface UserMapper extends BaseMapper<User> {
    /**
    *根据姓名查找
    * @param username
     * @return
    * */
    @Select("select * from user where Name=#{username}")
    public User selectByUsername(String username);

    /**
    * 根据Email查找
    * @param useremail
     * @return
    * */
    @Select("select * from user where Email=#{useremail}")
    public User selectByUseremail(String useremail);

    /**
     * 根据用户ID查找
     * @param userId
     * @return
     */
    @Select("select * from user where UserId=#{userId}")
    public User selectByUserId(int userId);

    /**
     * 根据电话查找
     * @param userphone
     * @return
     */
    @Select("select * from user where Phone=#{userphone}")
    public User selectByUserPhone(String userphone);

    /**
     * 根据邮箱与密码查询
     * @return
     * */
    @Select("select * from user where Username=#{username} and Password=#{password}")
    public User selectYZLogin(@Param("username") String username, @Param("password") String password);

}
