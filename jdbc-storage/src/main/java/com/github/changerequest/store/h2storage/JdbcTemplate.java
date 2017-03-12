package com.github.changerequest.store.h2storage;

import com.github.changerequest.store.h2storage.mapper.RowMapper;
import com.github.changerequest.store.persistenceapi.StoredEntity;

import java.sql.Connection;
import java.util.List;

/**
 * This is the central class for working with JDBC. It simplifies the use of JDBC and helps to avoid common errors.
 * It executes core JDBC workflow, leaving application code to provide SQL and extract results. This class executes SQL
 * queries or updates, initiating iteration over ResultSets and catching JDBC exceptions.
 */
public class JdbcTemplate {

    /**
     * Execute select query for one entity.
     * @param sql - sql to be executed
     * @param params - sql parameters
     * @param mapper - mapper to map single entity
     * @param connection - connection which should be used
     * @return result entity
     */
    public <T extends StoredEntity<Long>> T queryForObject(String sql, Object[] params, RowMapper<T> mapper,
            Connection connection) {
        return null;
    }

    /**
     * Execute select query which should get multiple rows.
     * @param sql - sql to be executed
     * @param params - sql parameters
     * @param mapper - mapper to map single entity
     * @param connection - connection which should be used
     * @return result list of entities
     */
    public <T extends StoredEntity<Long>> List<T> queryForList(String sql, Object[] params, RowMapper<T> mapper,
            Connection connection) {
        return null;
    }

    /**
     * Execute insert query.
     * @param sql - sql to be executed
     * @param params - sql parameters
     * @param connection - connection which should be used
     * @return generated primary key
     */
    public Long executeInsertQuery(String sql, Object[] params, Connection connection) {
        return null;
    }

    /**
     * Executes update/delete queries.
     * @param sql - sql to be executed
     * @param params - sql parameters
     * @param connection - connection which should be used
     */
    public void executeUpdateOrDeleteQuery(String sql, Object[] params, Connection connection) {

    }

}
