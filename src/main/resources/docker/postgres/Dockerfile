FROM postgres:9.4

ENV  POSTGRES_PASSWORD root
ENV  POSTGRES_USER root
ENV  POSTGRES_DB docker
COPY ./init.sql /docker-entrypoint-initdb.d/init.sql