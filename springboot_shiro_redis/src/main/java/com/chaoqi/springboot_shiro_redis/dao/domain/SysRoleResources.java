package com.chaoqi.springboot_shiro_redis.dao.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "sys_role_resources")
public class SysRoleResources implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "resources_id")
    private Integer resourcesId;

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
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return resources_id
     */
    public Integer getResourcesId() {
        return resourcesId;
    }

    /**
     * @param resourcesId
     */
    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }
}