package com.github.changerequest.store.h2storage;

import com.github.changerequest.store.h2storage.mapper.RowMapper;
import com.github.changerequest.store.persistenceapi.StoredEntity;

import java.util.List;

import javax.sql.DataSource;

/**
 * This is the central class for working with JDBC. It simplifies the use of JDBC and helps to avoid common errors.
 * It executes core JDBC workflow, leaving application code to provide SQL and extract results. This class executes SQL
 * queries or updates, initiating iteration over ResultSets and catching JDBC exceptions.
 */
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Execute select query for one entity.
     * @param sql - sql to be executed
     * @param params - sql parameters
     * @param mapper - mapper to map single entity
     * @return result entity
     */
    public <T extends StoredEntity<Long>> T queryForObject(String sql, Object[] params, RowMapper<T> mapper) {
        return null;
    }

    /**
     * Execute select query which should get multiple rows.
     * @param sql - sql to be executed
     * @param params - sql parameters
     * @param mapper - mapper to map single entity
     * @return result list of entities
     */
    public <T extends StoredEntity<Long>> List<T> queryForList(String sql, Object[] params, RowMapper<T> mapper) {
        return null;
    }

    /**
     * Execute insert query.
     * @param sql - sql to be executed
     * @param params - sql parameters
     * @return generated primary key
     */
    public Long executeInsertQuery(String sql, Object[] params) {
        return null;
    }

    /**
     * Executes update/delete queries.
     * @param sql - sql to be executed
     * @param params - sql parameters
     */
    public void executeUpdateOrDeleteQuery(String sql, Object[] params) {

    }

}
