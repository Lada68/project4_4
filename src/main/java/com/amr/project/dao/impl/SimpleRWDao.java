package com.amr.project.dao.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class SimpleRWDao<T, ID> extends ReadWriteDaoImpl<T, ID> {
}
