DROP TABLE IF EXISTS client_core_service.client;

CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE IF NOT EXISTS client_core_service.client
(
    id                 uuid        NOT NULL DEFAULT public.gen_random_uuid(),
    name               text        NOT NULL,
    age                INTEGER     NOT NULL,
    emails             JSONB       NOT NULL,
    created_date       timestamptz NOT NULL,
    last_login_date    timestamptz,
    last_analysis_date timestamptz,
    roles              JSONB       NOT NULL
)