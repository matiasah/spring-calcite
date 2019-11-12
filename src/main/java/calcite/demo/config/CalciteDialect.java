/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcite.demo.config;

import java.sql.Types;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.dialect.function.VarArgsSQLFunction;
import org.hibernate.type.StringType;

/**
 *
 * @author Matías
 */
public class CalciteDialect extends Dialect {

    public CalciteDialect() {
        registerColumnType(Types.BIT, "BOOLEAN");
        registerColumnType(Types.TINYINT, "TINYINT");
        registerColumnType(Types.SMALLINT, "SMALLINT");
        registerColumnType(Types.INTEGER, "INT");
        registerColumnType(Types.BIGINT, "BIGINT");
        registerColumnType(Types.FLOAT, "FLOAT");
        registerColumnType(Types.REAL, "REAL");
        registerColumnType(Types.DOUBLE, "DOUBLE");
        registerColumnType(Types.NUMERIC, "NUMERIC");
        registerColumnType(Types.DECIMAL, "DECIMAL");
        registerColumnType(Types.CHAR, "CHAR");
        registerColumnType(Types.VARCHAR, "VARCHAR");
        registerColumnType(Types.LONGVARCHAR, "VARCHAR");
        registerColumnType(Types.DATE, "DATE");
        registerColumnType(Types.TIME, "TIME");
        registerColumnType(Types.TIMESTAMP, "TIMESTAMP");
        registerColumnType(Types.BINARY, "BINARY");
        registerColumnType(Types.VARBINARY, "VARBINARY");
        registerColumnType(Types.LONGVARBINARY, "VARBINARY");
        registerColumnType(Types.NULL, "NULL");
        registerColumnType(Types.BLOB, "VARBINARY");
        registerColumnType(Types.CLOB, "VARBINARY");
        registerColumnType(Types.BOOLEAN, "BOOLEAN");

        registerFunction("concat", new VarArgsSQLFunction(StringType.INSTANCE, "", "||", ""));
        registerFunction("mod", new SQLFunctionTemplate(StringType.INSTANCE, "?1 % ?2"));
        registerFunction("substr", new StandardSQLFunction("substring", StringType.INSTANCE));
        registerFunction("substring", new StandardSQLFunction("substring", StringType.INSTANCE));
    }

    @Override
    public boolean supportsLimit() {
        return true;
    }

    @Override
    protected String getLimitString(String query, boolean hasOffset) {
        return new StringBuffer(query.length() + 20).
                append(query).
                append(hasOffset ? " limit ? offset ?" : " limit ?").
                toString();
    }

    @Override
    public boolean supportsCurrentTimestampSelection() {
        return true;
    }

    @Override
    public boolean isCurrentTimestampSelectStringCallable() {
        return false;
    }

    @Override
    public String getCurrentTimestampSelectString() {
        return "select CURRENT_TIMESTAMP";
    }

    @Override
    public boolean supportsUnionAll() {
        return true;
    }

    @Override
    public boolean hasAlterTable() {
        return false;
    }

    @Override
    public boolean dropConstraints() {
        return false;
    }

    @Override
    public String getAddColumnString() {
        return "add column";
    }

    @Override
    public String getForUpdateString() {
        return "";
    }

    @Override
    public boolean supportsOuterJoinForUpdate() {
        return false;
    }

    @Override
    public String getDropForeignKeyString() {
        throw new UnsupportedOperationException("No drop foreign key syntax supported by SQLiteDialect");
    }

    @Override
    public String getAddForeignKeyConstraintString(String constraintName,
            String[] foreignKey, String referencedTable, String[] primaryKey,
            boolean referencesPrimaryKey) {
        throw new UnsupportedOperationException("No add foreign key syntax supported by SQLiteDialect");
    }

    @Override
    public String getAddPrimaryKeyConstraintString(String constraintName) {
        throw new UnsupportedOperationException("No add primary key syntax supported by SQLiteDialect");
    }

    @Override
    public boolean supportsIfExistsBeforeTableName() {
        return true;
    }

    @Override
    public boolean supportsCascadeDelete() {
        return false;
    }
}
