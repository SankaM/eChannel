create table public.user (id  bigserial not null, email varchar(100) not null, first_name varchar(65) not null, last_name varchar(65), password varchar(128) not null, primary key (id))
create table public.user_profile (id  bigserial not null, address1 varchar(100), address2 varchar(100), city varchar(100), country varchar(100), dob date, gender varchar(10), phone_number varchar(15), state varchar(100), street varchar(100), zip_code varchar(32), user_id int8 not null, primary key (id))
alter table public.user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table public.user_profile add constraint UK_ebc21hy5j7scdvcjt0jy6xxrv unique (user_id)
alter table public.user_profile add constraint FK6kwj5lk78pnhwor4pgosvb51r foreign key (user_id) references public.user
