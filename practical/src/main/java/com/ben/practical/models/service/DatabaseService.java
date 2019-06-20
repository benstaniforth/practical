package com.ben.practical.models.service;


import org.jdbi.v3.core.Jdbi;

public abstract class DatabaseService {

    private final String hostname = "localhost";
    private final String database = "practical";
    private final String user = "root";
    private final String password = "password";
    private final String connectionString = "jdbc:mysql://" + hostname + "/" + database + "?user=" + user + "&password=" + password + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT&allowPublicKeyRetrieval=true&useSSL=false";

    protected final Jdbi jdbi = Jdbi.create(connectionString);

}
