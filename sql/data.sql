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

----Заполнение таблицы студентов
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

----Заполнение таблицы курсов
insert into course(name, beginning, ending, teacher_id) values('JavaLab', '2021-09-01', '2022-05-31', 1);
insert into course(name, beginning, ending, teacher_id) values('Дискретная математика', '2020-09-01', '2021-05-31', 3);
insert into course(name, beginning, ending, teacher_id) values('Информатика', '2020-09-01', '2021-05-31', 2);
insert into course(name, beginning, ending, teacher_id) values('Алгебра и геометрия', '2020-09-01', '2021-05-31', 4);
insert into course(name, beginning, ending, teacher_id) values('Математичесикй анализ', '2020-09-01', '2021-05-31', 7);