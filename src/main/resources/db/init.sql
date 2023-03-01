create table if not exists timers(
                                     id serial primary key,
                                     type_object varchar(1000),
                                     start_date timestamp,
                                     total_time integer
);

-- delete from timers where id notnull;

-- insert into timers(type_object, start_date, total_time) values ('dumpling', '2023-02-25 20:32:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'dumpling', '2023-02-25 20:35:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'dumpling', '2023-02-25 20:40:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'dumpling', '2023-02-25 20:55:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'dumpling', '2023-02-16 20:55:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'dumpling', '2023-02-16 20:55:59', 123123123);
--
-- insert into timers(type_object, start_date, total_time) values ( 'cake', '2023-02-25 20:32:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'cake', '2023-02-25 20:35:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'cake', '2023-02-25 20:40:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'cake', '2023-02-25 20:55:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'cake', '2023-02-16 20:55:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'cake', '2023-02-16 20:55:59', 123123123);
--
-- insert into timers(type_object, start_date, total_time) values ( 'stake', '2023-02-25 20:32:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'stake', '2023-02-25 20:35:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'stake', '2023-02-25 20:40:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'stake', '2023-02-25 20:55:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'stake', '2023-02-16 20:55:59', 123123123);
-- insert into timers(type_object, start_date, total_time) values ( 'stake', '2023-02-16 20:55:59', 123123123);

-- select row_number() over () as id,  type_object, count(*) as count_timers, sum(total_time) as total_time
-- from timers
-- where start_date > now() + interval '-1 weeks'
-- group by type_object;

-- drop table timers;