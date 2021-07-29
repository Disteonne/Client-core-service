package com.disteonne.application.core;

public class ApiConstants {

    public static final String CLIENT_CORE_SERVICE = "/client-core-service";
    public static final String V1 = "/v1";
    public static final String CLIENT = "/client";
    public static final String CLIENT_MANAGEMENT = "/clientManagement";
    public static final String ACCOUNT = "account";

    public static final String ID = "{id}";


    public static final String SLASH = "/";


    public enum Roles {
        ROLE_USER, ROLE_ADMIN
    }

    public enum InternalService {
        ANALYSIS_SERVICE("analysis-core-service");

        private final String domain;

        private InternalService(String domain) {
            this.domain = domain;
        }

        public String getDomain() {
            return this.domain;
        }
    }
}
