package com.mossle.user.persistence.manager;

import com.mossle.core.hibernate.HibernateEntityDao;

import com.mossle.user.persistence.domain.AccountAlias;

import org.springframework.stereotype.Repository;

@Repository
public class AccountAliasManager extends HibernateEntityDao<AccountAlias> {
}
