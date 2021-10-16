package com.amr.project.dao.impl;

import com.amr.project.dao.abstracts.RoleDao;
import com.amr.project.model.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleDaoImpl extends ReadWriteDaoImpl<Role, Long> implements RoleDao {
    public Role getRoleById(Long id) {
        return em.createQuery("select Role from Role as r where r.id=:id", Role.class)
                .setParameter("id", id).getSingleResult();
    }
}
