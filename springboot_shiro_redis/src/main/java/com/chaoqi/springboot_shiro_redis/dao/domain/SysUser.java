package com.chaoqi.springboot_shiro_redis.dao.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sys_user")
public class SysUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass_word")
    private String passWord;

    /**
     * 是否启用
     */
    @Column(name = "user_enable")
    private Integer userEnable;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return pass_word
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取是否启用
     *
     * @return user_enable - 是否启用
     */
    public Integer getUserEnable() {
        return userEnable;
    }

    /**
     * 设置是否启用
     *
     * @param userEnable 是否启用
     */
    public void setUserEnable(Integer userEnable) {
        this.userEnable = userEnable;
    }
}