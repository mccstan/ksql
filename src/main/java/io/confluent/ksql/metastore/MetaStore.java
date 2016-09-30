package io.confluent.ksql.metastore;

import io.confluent.ksql.planner.Schema;

public interface MetaStore {
    public DataSource getSource(String sourceName);
    public void putSource(DataSource dataSource);
}