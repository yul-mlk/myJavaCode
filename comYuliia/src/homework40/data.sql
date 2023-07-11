-- creation and filling of tables

CREATE TABLE `online_school_db`.`course` (
                                             `course_id` INT NOT NULL,
                                             `course_name` VARCHAR(45) NOT NULL,
                                             `lectures_number` INT NULL,
                                             `teachers_number` INT NULL,
                                             `students_number` INT NULL,
                                             PRIMARY KEY (`course_id`)
);
INSERT INTO online_school_db.course (course_id, course_name) VALUES ('1', 'Java_developer')
INSERT INTO online_school_db.course (course_id, course_name) VALUES ('2', 'JavaScript_developer')
INSERT INTO online_school_db.course (course_id, course_name) VALUES ('3', 'Pyton_developer')

SELECT * FROM online_school_db.course;


CREATE TABLE `online_school_db`.`lecture` (
                                              `lecture_id` INT NOT NULL,
                                              `lecture_name` VARCHAR(45) NULL,
                                              `course_id` INT NULL,
                                              `teacher_id` INT NULL,
                                              `add_mat_number` INT NULL,
                                              `homework_number` INT NULL,
                                              `date` DATETIME DEFAULT NULL,
                                              PRIMARY KEY (`lecture_id`)
);
ALTER TABLE `online_school_db`.`lecture`
    CHANGE COLUMN `course_id` `lecture_course_id` INT NULL DEFAULT NULL ,
    CHANGE COLUMN `teacher_id` `lecture_teacher_id` INT NULL DEFAULT NULL ,
    CHANGE COLUMN `date` `lecture_date` DATETIME NULL DEFAULT NULL ;

INSERT INTO online_school_db.lecture (lecture_id, lecture_name, lecture_course_id, lecture_teacher_id, add_mat_number, homework_number, lecture_date) VALUES ('1', 'Introduction to the Java', '1', '1', '2', '2', '2022-11-23 19:30:00');
INSERT INTO online_school_db.lecture (lecture_id, lecture_name, lecture_course_id, lecture_teacher_id, add_mat_number, homework_number, lecture_date) VALUES ('2', 'Variables', '1', '1', '3', '3', '2022-12-05 19:30:00');
INSERT INTO online_school_db.lecture (lecture_id, lecture_name, lecture_course_id, lecture_teacher_id, add_mat_number, homework_number, lecture_date) VALUES ('3', 'Access modifiers', '1', '1', '4', '2', '2023-01-09 19:30:00');
INSERT INTO online_school_db.lecture (lecture_id, lecture_name, lecture_course_id, lecture_teacher_id, add_mat_number, homework_number, lecture_date) VALUES ('4', 'Introduction to the JavaScript', '2', '2', '3', '1', '2022-12-14 19:30:00');
INSERT INTO online_school_db.lecture (lecture_id, lecture_name, lecture_course_id, lecture_teacher_id, add_mat_number, homework_number, lecture_date) values ('5', 'Introduction to the Python', '3', '3', '2', '2', '2023-02-15 18:00:00');

CREATE TABLE `online_school_db`.`students` (
                                               `student_id` INT NOT NULL,
                                               `student_name` VARCHAR(45) NOT NULL,
                                               `student_surname` VARCHAR(45) NOT NULL,
                                               `student_course_id` INT NOT NULL,
                                               `completed_hw` INT NULL,
                                               `grade` INT NULL,
                                               PRIMARY KEY (`student_id`)
);

INSERT INTO online_school_db.students (student_id, student_name, student_surname, student_course_id, completed_hw, grade) VALUES ('1', 'Yuliia', 'Malyk', '1', '3', '300');
INSERT INTO `online_school_db`.`students` (`student_id`, `student_name`, `student_surname`, `student_course_id`, `completed_hw`, `grade`) VALUES ('2', 'Alex', 'Ivanenko', '3', '1', '100');
INSERT INTO `online_school_db`.`students` (`student_id`, `student_name`, `student_surname`, `student_course_id`, `completed_hw`, `grade`) VALUES ('3', 'Yuliia', 'Malyk', '2', '1', '100');
INSERT INTO `online_school_db`.`students` (`student_id`, `student_name`, `student_surname`, `student_course_id`, `completed_hw`, `grade`) VALUES ('4', 'Oleg', 'Petrenko', '1', '2', '200');
INSERT INTO `online_school_db`.`students` (`student_id`, `student_name`, `student_surname`, `student_course_id`, `completed_hw`, `grade`) VALUES ('5', 'Anna', 'Klichuk', '1', '3', '300');

SELECT
    CONCAT(student_name, ' ', student_surname) AS full_name
FROM
    online_school_db.students
ORDER BY grade;


CREATE TABLE `online_school_db`.`teachers` (
                                               `teacher_id` INT NOT NULL,
                                               `teacher_name` VARCHAR(45) NOT NULL,
                                               `teacher_surname` VARCHAR(45) NOT NULL,
                                               `teacher_course_id` INT NOT NULL,
                                               `teacher_lectures_number` INT NULL,
                                               PRIMARY KEY (`teacher_id`)
);

INSERT INTO online_school_db.teachers (`teacher_id`, `teacher_name`, `teacher_surname`, `teacher_course_id`, `teacher_lectures_number`) VALUES ('1', 'Alex', 'Peterson', '1', '3');
INSERT INTO online_school_db.teachers (`teacher_id`, `teacher_name`, `teacher_surname`, `teacher_course_id`, `teacher_lectures_number`) VALUES ('2', 'Andrew', 'Mask', '2', '1');
INSERT INTO `online_school_db`.`teachers` (`teacher_id`, `teacher_name`, `teacher_surname`, `teacher_course_id`, `teacher_lectures_number`) VALUES ('3', 'Emma', 'Nelson', '3', '1');
INSERT INTO `online_school_db`.`teachers` (`teacher_id`, `teacher_name`, `teacher_surname`, `teacher_course_id`, `teacher_lectures_number`) VALUES ('4', 'Max', 'Jonson', '1', '2');


CREATE TABLE `online_school_db`.`homework` (

                                               `homework_id` INT NOT NULL,

                                               `homework_course_id` INT NOT NULL,

                                               `homeworK_lecture_id` INT NOT NULL,

                                               `homework_points` INT NULL,
                                               PRIMARY KEY (`homework_id`)
);
INSERT INTO `online_school_db`.`homework` (`homework_id`, `homework_course_id`, `homeworK_lecture_id`, `homework_points`, `homework_task`) VALUES ('1', '1', '1', '100', '1. Set up IDEA. 2. Create first project. 3. Print and display your name');
INSERT INTO `online_school_db`.`homework` (`homework_id`, `homework_course_id`, `homeworK_lecture_id`, `homework_points`) VALUES ('2', '1', '2', '100');
INSERT INTO `online_school_db`.`homework` (`homework_id`, `homework_course_id`, `homeworK_lecture_id`, `homework_points`) VALUES ('3', '1', '3', '100');
INSERT INTO `online_school_db`.`homework` (`homework_id`, `homework_course_id`, `homeworK_lecture_id`, `homework_points`) VALUES ('4', '2', '1', '100');
INSERT INTO `online_school_db`.`homework` (`homework_id`, `homework_course_id`, `homeworK_lecture_id`, `homework_points`) VALUES ('5', '3', '1', '100');


CREATE TABLE `online_school_db`.`additional_materials` (
                                                           `additional_materials_id` INT NOT NULL,
                                                           `additional_materials_course_id` INT NOT NULL,
                                                           `additional_materials_lect_id` INT NOT NULL,
                                                           `URL` MEDIUMTEXT NULL,
                                                           `BOOK` MEDIUMTEXT NULL,
                                                           `VIDEO` MEDIUMTEXT NULL,
                                                           PRIMARY KEY (`additional_materials_id`)
);

INSERT INTO `online_school_db`.`additional_materials` (`additional_materials_id`, `additional_materials_course_id`, `additional_materials_lect_id`, `URL`) VALUES ('1', '1', '1', 'https://www.jetbrains.com/idea/');
INSERT INTO `online_school_db`.`additional_materials` (`additional_materials_id`, `additional_materials_course_id`, `additional_materials_lect_id`, `URL`) VALUES ('2', '1', '2', 'https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html');


-- adding a foreign key
ALTER TABLE `online_school_db`.`lecture`

    ADD CONSTRAINT `lecture_course_id`

        FOREIGN KEY (`lecture_course_id`)

            REFERENCES `online_school_db`.`course` (`course_id`);
-- displaying information showing connection between tables
SELECT
    teacher_id,
    teacher_course_id,
    course.course_name,
    teacher_name,
    teacher_surname
FROM
    teachers
        INNER JOIN
    course ON course.course_id = teachers.teacher_course_id
ORDER BY teacher_id;

-- adding a foreign key
ALTER TABLE `online_school_db`.`lecture`

    ADD CONSTRAINT `lecture_teacher_id`

        FOREIGN KEY (`lecture_teacher_id`)

            REFERENCES

                `online_school_db`.`teachers` (`teacher_id`);
-- displaying information showing connection between tables
SELECT
    lecture_id,
    lecture_course_id,
    lecture_teacher_id,
    teachers.teacher_surname,
    teachers.teacher_name,
    lecture_name,
    lecture_date
FROM
    lecture
        INNER JOIN
    teachers ON teachers.teacher_id = lecture.lecture_teacher_id
ORDER BY lecture_id;

-- adding a foreign key
ALTER TABLE `online_school_db`.`students`

    ADD CONSTRAINT `student_course_id`

        FOREIGN KEY (`student_course_id`)

            REFERENCES `online_school_db`.`course` (`course_id`);
-- displaying information showing connection between tables
SELECT
    student_id,
    course.course_name,
    student_course_id,
    student_name,
    student_surname
FROM
    students
        INNER JOIN
    course ON course.course_id = students.student_course_id;

-- adding a foreign key
ALTER TABLE `online_school_db`.`teachers`
    ADD CONSTRAINT `teacher_course_id`
        FOREIGN KEY (`teacher_course_id`)
            REFERENCES

                `online_school_db`.`course` (`course_id`);
-- displaying information showing connection between tables
SELECT
    teacher_id,
    course.course_name,
    teacher_name,
    teacher_surname,
    teacher_lectures_number
FROM
    teachers
        INNER JOIN
    course ON course.course_id = teachers.teacher_course_id;

-- adding a foreign key
ALTER TABLE `online_school_db`.`homework`
    ADD INDEX `homework_course_id_idx` (`homework_course_id` ASC) VISIBLE;;
ALTER TABLE
    `online_school_db`.`homework`
    ADD CONSTRAINT `homework_course_id`
        FOREIGN KEY (`homework_course_id`)
            REFERENCES
                `online_school_db`.`course` (`course_id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION;
-- displaying information showing connection between tables
SELECT
    homework.homework_id,
    homework.homework_lecture_id,
    course.course_name
FROM
    homework
        INNER JOIN
    course ON course.course_id = homework.homework_course_id;

-- adding a foreign key
ALTER TABLE `online_school_db`.`homework`
    ADD CONSTRAINT `homework_lecture_id`
        FOREIGN KEY (`homework_lecture_id`)
            REFERENCES

                `online_school_db`.`lecture` (`lecture_id`)

-- displaying information showing connection between tables
SELECT
    *
FROM
    online_school_db.homework
        INNER JOIN
    lecture ON lecture.lecture_id = homework.homeworK_lecture_id;

-- adding a foreign key
ALTER TABLE `online_school_db`.`additional_materials`

    ADD CONSTRAINT `additional_materials_course_id`

        FOREIGN KEY (`additional_materials_course_id`)

            REFERENCES

                `online_school_db`.`course` (`course_id`);
-- adding a foreign key
ALTER TABLE `online_school_db`.`additional_materials`

    ADD CONSTRAINT `additional_materials_lect_id`

        FOREIGN KEY (`additional_materials_lect_id`)

            REFERENCES

                `online_school_db`.`lecture` (`lecture_id`);

-- drop foreign key (connection additional materials with course)
ALTER TABLE `online_school_db`.`additional_materials`

DROP
FOREIGN KEY `additional_materials_course_id`;

ALTER TABLE `online_school_db`.`additional_materials`

DROP INDEX `additional_materials_course_id`;
;

-- drop foreign key (connection homework with course)
ALTER TABLE `online_school_db`.`homework`

DROP
FOREIGN KEY `homework_course_id`;

ALTER TABLE `online_school_db`.`homework`

DROP INDEX `homework_course_id_idx`;
;

