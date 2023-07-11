-- MySQL part 2
-- 41.1 (1 variant)
SELECT
    *
FROM
    online_school_db.students
ORDER BY student_surname;
-- 41.1 (2 variant)
SELECT
    student_id,
    student_name,
    student_surname,
    student_course_id,
    course.course_name,
    grade,
    completed_hw
FROM
    online_school_db.students
        INNER JOIN
    course ON course.course_id = students.student_course_id
ORDER BY student_surname;

-- 41.2
SELECT
    lecture_name, add_mat_number, lecture_date
FROM
    online_school_db.lecture
WHERE
        lecture_date < '2023-01-01 00:00:00'
ORDER BY lecture_date;

-- 41.3
SELECT
    *
FROM
    online_school_db.lecture
ORDER BY lecture_date , homework_number DESC
    LIMIT 1;

-- 41.4
SELECT
    additional_materials_id,
    COUNT(URL) AS url_count,
    COUNT(VIDEO) AS video_count,
    COUNT(BOOK) AS book_count
FROM
    online_school_db.additional_materials
GROUP BY additional_materials_id;

-- 41.5
SELECT
    *
FROM
    online_school_db.teachers
WHERE
        teacher_surname < 'N'
ORDER BY teacher_surname;

-- 41.6
SELECT
    student_name,
    student_surname,
    COUNT(student_course_id) AS count_course
FROM
    students
GROUP BY student_name , student_surname
HAVING count_course = 1
    OR count_course = 2
    OR count_course >= 3
ORDER BY student_surname;
