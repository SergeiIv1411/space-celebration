INSERT INTO users (id, archive, email, name, password, role, created, bucket_id)
values (1, false, 's9153104109@gmail.com', 'admin', 'admin', 'ADMIN', current_timestamp, null);

ALTER SEQUENCE user_seq RESTART WITH 2;