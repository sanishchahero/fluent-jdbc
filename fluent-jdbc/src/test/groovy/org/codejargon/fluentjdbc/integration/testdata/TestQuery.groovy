package org.codejargon.fluentjdbc.integration.testdata;

class TestQuery {
    public static final String insertSqlPositional = "INSERT INTO DUMMY(id, string, dateLocalDate, dateSqlDate, nullString) VALUES(?, ?, ?, ?, ?)";
    public static final String insertSqlNamed = "INSERT INTO DUMMY(id, string, dateLocalDate, dateSqlDate, nullString) VALUES(:id, :string, :dateLocalDate, :dateSqlDate, :nullString)";
    public static final String selectAllSql = "SELECT * FROM DUMMY";
    public static final String selectIds = "SELECT * FROM DUMMY where id in (:ids)";
    public static final String createDummyTable = "CREATE TABLE DUMMY (id VARCHAR(255) PRIMARY KEY, string VARCHAR(255), dateLocalDate DATE, dateSqlDate DATE, nullString VARCHAR(255))";
    public static final String dropDummyTable = "DROP TABLE DUMMY"
}
