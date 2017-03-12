JDBC. Practice Task 1
===============

1 SQL Schema design
-------------------

Design database model that represents store. 
There should be following tables:

1. **category**: id, title, description. Categories should have unique titles.
2. **property**: id, name, value. Properties should have unique name-value pair.
3. **item**: id, title, description, price. Items should have unique titles.
4. **catalog**: id, name. Catalog should have unique names.

2 JDBC Storage
------------

Update JDBC Storage classes.

 1. Create implementations of RowMapper interface for all entities (Catalog, Category, Item, Property).
 2. Implement all method of JdbcTemplate class. For more details please read javadocs. Each executed sql statement **must** be logged with debug level. 
 3. Create storages for all entities (Catalog, Category, Item, Property) using JdbcTemplate. 
    * each storage should implement **Storage** interface from **storage** module;
    * all entities should contain all sub-entities (catalog should contain all items, items - should contain properties, etc);
    * saving, updating, deleting any entities must **not** be cascaded. 
    **Only relations** between entities should be modified. 
    E.g. you should prevent saving new items while saving catalog only relations between items and catalogs should be added.
    * be sure that multiple modifying operations (e.g. deleting/updating entities with relations) are executed inside the transaction 

3 Store
-------

Update **store** module to use **jdbc-storage** instead of **in-memory-storage**. 

 1. Include latest H2, jdbc-storage dependencies.
 2. Update **Runner** class to create StoreApp based on h2 jdbc storage.  
 3. Add examples that demonstrates update, delete, find by id operations.
