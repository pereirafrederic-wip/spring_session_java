DROP TABLE IF EXISTS "spring_session"."user";


DROP SCHEMA  IF EXISTS spring_session CASCADE;
DROP SEQUENCE  IF EXISTS spring_session.ID_SEQ;


CREATE SCHEMA spring_session;
CREATE SEQUENCE spring_session.ID_SEQ;
