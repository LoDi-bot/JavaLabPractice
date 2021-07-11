--Заполнение таблицы преподавателей
insert into teacher(first_name, last_name, experience)
values ('Марсель', 'Сидиков', 10);
insert into teacher(first_name, last_name, experience)
values ('Михаил', 'Абрамсикй', 14);
insert into teacher(first_name, last_name, experience)
values ('Максим', 'Зубков', 22);
insert into teacher(first_name, last_name, experience)
values ('Марат', 'Арсланов', 30);
insert into teacher(first_name, last_name, experience)
values ('Елена', 'Широкова', 26);
insert into teacher(first_name, last_name, experience)
values ('Светлана', 'Жаркова', 28);
insert into teacher(first_name, last_name, experience)
values ('Елена', 'Бородова', 25);

--Заполнение таблицы студентов
insert into student(first_name, last_name, group_id)
values ('Искандер', 'Асадуллин', 2);
insert into student(first_name, last_name, group_id)
values ('Раушан', 'Садриев', 2);
insert into student(first_name, last_name, group_id)
values ('Камиль', 'Гареев', 2);
insert into student(first_name, last_name, group_id)
values ('Виктория', 'Федорчук', 2);
insert into student(first_name, last_name, group_id)
values ('Алсу', 'Юмадилова', 2);
insert into student(first_name, last_name, group_id)
values ('Камилла', 'Саммерханова', 2);
insert into student(first_name, last_name, group_id)
values ('Дмитрий', 'Беденьгов', 5);
insert into student(first_name, last_name, group_id)
values ('Григорий', 'Хайкин', 5);
insert into student(first_name, last_name, group_id)
values ('Данил', 'Коробов', 5);
insert into student(first_name, last_name, group_id)
values ('Камиль', 'Аксанов', 5);
insert into student(first_name, last_name, group_id)
values ('Игорь', 'Кузьмин', 5);
insert into student(first_name, last_name, group_id)
values ('Антон', 'Давыдов', 1);
insert into student(first_name, last_name, group_id)
values ('Семён', 'Марус', 1);
insert into student(first_name, last_name, group_id)
values ('Ильдар', 'Мухаев', 1);
insert into student(first_name, last_name, group_id)
values ('Марсель', 'Юсупов', 1);

--Заполнение таблицы курсов
insert into course(name, beginning, ending, teacher_id)
values ('JavaLab', '2021-09-01', '2022-05-31', 1);
insert into course(name, beginning, ending, teacher_id)
values ('Дискретная математика', '2020-09-01', '2021-05-31', 3);
insert into course(name, beginning, ending, teacher_id)
values ('Информатика', '2020-09-01', '2021-05-31', 2);
insert into course(name, beginning, ending, teacher_id)
values ('Алгебра и геометрия', '2020-09-01', '2021-05-31', 4);
insert into course(name, beginning, ending, teacher_id)
values ('Математичесикй анализ', '2020-09-01', '2021-05-31', 7);

--Заполнение таблицы уроков
insert into lesson(name, day_of_week, time, course_id)
values ('JavaLab-1', 'Понедельник', '14:00-15:30', 1);
insert into lesson(name, day_of_week, time, course_id)
values ('JavaLab-2', 'Четверг', '10:10-11:40', 1);
insert into lesson(name, day_of_week, time, course_id)
values ('JavaLab-3', 'Пятница', '10:10-11:40', 1);
insert into lesson(name, day_of_week, time, course_id)
values ('Дискретная математика(лекция)', 'Пятница', '11:50-13:20', 2);
insert into lesson(name, day_of_week, time, course_id)
values ('Дискретная математика(практика)', 'Пятница', '14:00-15:30', 2);
insert into lesson(name, day_of_week, time, course_id)
values ('Информатика(лекция)', 'Среда', '14:00-15:30', 3);
insert into lesson(name, day_of_week, time, course_id)
values ('Информатика(практика)', 'Вторник', '10:10-11:40', 3);
insert into lesson(name, day_of_week, time, course_id)
values ('Алгебра и геометрия(лекция)', 'Понедельник', '10:10-11:40', 4);
insert into lesson(name, day_of_week, time, course_id)
values ('Алгебра и геометрия(практика)', 'Среда', '08:30-10:00', 4);
insert into lesson(name, day_of_week, time, course_id)
values ('Мат-анализ(лекция)', 'Среда', '10:10-11:40', 5);
insert into lesson(name, day_of_week, time, course_id)
values ('Мат-анализ(практика)', 'Среда', '11:50-13:20', 5);

--Заполнение таблицы студентов на курсах
insert into course_student(course_id, student_id)
values (1, 1);
insert into course_student(course_id, student_id)
values (1, 2);
insert into course_student(course_id, student_id)
values (1, 4);
insert into course_student(course_id, student_id)
values (1, 5);
insert into course_student(course_id, student_id)
values (1, 7);
insert into course_student(course_id, student_id)
values (1, 9);
insert into course_student(course_id, student_id)
values (2, 1);
insert into course_student(course_id, student_id)
values (2, 15);
insert into course_student(course_id, student_id)
values (2, 9);
insert into course_student(course_id, student_id)
values (2, 10);
insert into course_student(course_id, student_id)
values (3, 1);
insert into course_student(course_id, student_id)
values (3, 2);
insert into course_student(course_id, student_id)
values (3, 3);
insert into course_student(course_id, student_id)
values (3, 4);
insert into course_student(course_id, student_id)
values (3, 5);
insert into course_student(course_id, student_id)
values (3, 6);
insert into course_student(course_id, student_id)
values (3, 8);
insert into course_student(course_id, student_id)
values (3, 10);
insert into course_student(course_id, student_id)
values (3, 12);
insert into course_student(course_id, student_id)
values (4, 1);
insert into course_student(course_id, student_id)
values (4, 5);
insert into course_student(course_id, student_id)
values (4, 8);
insert into course_student(course_id, student_id)
values (4, 9);
insert into course_student(course_id, student_id)
values (4, 15);
insert into course_student(course_id, student_id)
values (5, 1);
insert into course_student(course_id, student_id)
values (5, 9);
insert into course_student(course_id, student_id)
values (5, 15);
