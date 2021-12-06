package com.mossle.disk.persistence.manager;

import com.mossle.core.hibernate.HibernateEntityDao;

import com.mossle.disk.persistence.domain.DiskVersion;

import org.springframework.stereotype.Service;

@Service
public class DiskVersionManager extends HibernateEntityDao<DiskVersion> {
}
