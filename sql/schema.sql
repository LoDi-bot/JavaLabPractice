create table teacher
(
    id         serial primary key,
    first_name varchar(30) not null default 'FIRST_NAME',
    last_name  varchar(30) not null default 'LAST_NAME',
    experience integer     not null default 0
);

create table course
(
    id         serial primary key,
    name       varchar(30) not null default 'NAME',
    beginning  varchar(10) not null default 'BEGINNING',
    ending     varchar(10) not null default 'ENDING',
    teacher_id integer,
    foreign key (teacher_id) references teacher (id)
);

create table lesson
(
    id          serial primary key,
    name        varchar(30) not null default 'NAME',
    day_of_week varchar(20) not null default 'DAY_OF_WEEK',
    time        varchar(11) not null default 'TIME',
    course_id   integer,
    foreign key (course_id) references course (id)
);

create table student
(
    id         serial primary key,
    first_name varchar(20) not null default 'FIRST_NAME',
    last_name  varchar(20) not null default 'LAST_NAME',
    group_id   integer     not null
);

create table course_student
(
    course_id  integer,
    student_id integer,
    foreign key (course_id) references course (id),
    foreign key (student_id) references student (id)
);

create table course_teacher
(
    course_id  integer,
    teacher_id integer,
    foreign key (course_id) references course (id),
    foreign key (teacher_id) references teacher (id)
);