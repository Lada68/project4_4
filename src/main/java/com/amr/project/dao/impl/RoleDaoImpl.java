package com.amr.project.dao.impl;

import com.amr.project.dao.abstracts.RoleDao;
import com.amr.project.model.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends ReadWriteDaoImpl<Role, Long> implements RoleDao {
}
