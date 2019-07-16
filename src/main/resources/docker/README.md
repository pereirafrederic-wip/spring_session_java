Stack docker
------------

- Dockerfile:
    - Tomcat
    - Postgres DB

- docker-compose

- configuration file, init.Sql etc

Usage
- Installer docker (nouvelle version nécessite linux/windows 10 pro)
- cd racine de ce repertoire
- docker-compose up -d
- docker ps pour bien voir les deux conteneurs alfred-tomcat, alfred-postgres tournent normalement
- user admin pour tomcat : admin, pwd: alfred
- user non admin pour postgres : docker, pwd : s3cret
- user admin pour postgres : root, pwd: alfred
