/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.tables.Manager;
import jooq.generated.tables.pojos.JooqManager;
import jooq.generated.tables.records.ManagerRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4",
        "schema version:1.3"
    },
    date = "2020-12-28T06:17:05.627Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class ManagerRepository extends DAOImpl<ManagerRecord, JooqManager, Long> {

    /**
     * Create a new ManagerRepository without any configuration
     */
    public ManagerRepository() {
        super(Manager.MANAGER, JooqManager.class);
    }

    /**
     * Create a new ManagerRepository with an attached configuration
     */
    @Autowired
    public ManagerRepository(Configuration configuration) {
        super(Manager.MANAGER, JooqManager.class, configuration);
    }

    @Override
    public Long getId(JooqManager object) {
        return object.getManagerId();
    }

    /**
     * Fetch records that have <code>manager_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqManager> fetchRangeOfManagerId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Manager.MANAGER.MANAGER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>manager_id IN (values)</code>
     */
    public List<JooqManager> fetchByManagerId(Long... values) {
        return fetch(Manager.MANAGER.MANAGER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>manager_id = value</code>
     */
    public JooqManager fetchOneByManagerId(Long value) {
        return fetchOne(Manager.MANAGER.MANAGER_ID, value);
    }

    /**
     * Fetch records that have <code>manager_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqManager> fetchRangeOfManagerName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Manager.MANAGER.MANAGER_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>manager_name IN (values)</code>
     */
    public List<JooqManager> fetchByManagerName(String... values) {
        return fetch(Manager.MANAGER.MANAGER_NAME, values);
    }

    /**
     * Fetch records that have <code>manager_detail BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<JooqManager> fetchRangeOfManagerDetail(JsonNode lowerInclusive, JsonNode upperInclusive) {
        return fetchRange(Manager.MANAGER.MANAGER_DETAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>manager_detail IN (values)</code>
     */
    public List<JooqManager> fetchByManagerDetail(JsonNode... values) {
        return fetch(Manager.MANAGER.MANAGER_DETAIL, values);
    }
}
