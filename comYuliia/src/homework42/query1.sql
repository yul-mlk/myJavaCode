-- MySQL part 3
-- 42.1
SELECT
    lecture_name,
    teachers.teacher_surname,
    teachers.teacher_name,
    lecture_date
FROM
    lecture
        INNER JOIN
    teachers ON teachers.teacher_id = lecture.lecture_teacher_id
ORDER BY lecture_date;

--42.2
SELECT
    teacher_surname,
    teacher_name,
    COUNT(lecture.lecture_teacher_id) AS teachers_lect_count
FROM
    teachers
        INNER JOIN
    lecture ON lecture.lecture_teacher_id = teachers.teacher_id
GROUP BY lecture_teacher_id
ORDER BY teacher_surname;

-- 42.3
SELECT
    lecture_name,
    teachers.teacher_surname,
    teachers.teacher_name,
    lecture_teacher_id,
    lecture_date
FROM
    lecture
        INNER JOIN
    teachers ON
            teachers.teacher_id = lecture_teacher_id
where lecture_teacher_id = 3
order by lecture_date;

-- 42.4
SELECT
    course.course_name,
    COUNT(DISTINCT lecture.lecture_id) AS lecture_count,
    COUNT(DISTINCT teachers.teacher_id) AS teacher_count,
    COUNT(DISTINCT students.student_id) AS student_count,
    COUNT(DISTINCT homework.homework_id) AS hw_count,
    COUNT(DISTINCT additional_materials.additional_materials_id) AS add_mat_count
FROM
    course
        INNER JOIN
    teachers ON teachers.teacher_course_id = course.course_id
        INNER JOIN
    lecture ON lecture.lecture_course_id = course.course_id
        INNER JOIN
    students ON students.student_course_id = course.course_id
        INNER JOIN
    additional_materials ON additional_materials.additional_materials_course_id = course.course_id
        INNER JOIN
    homework ON homework.homework_course_id = course.course_id
GROUP BY course.course_name;

-- 42.5
SELECT
    DATE_FORMAT(lecture_date, '%M') AS month_of_lecture,
    COUNT(*) AS lecture_count
FROM
    lecture
GROUP BY month_of_lecture;

-- 42.6
SELECT name, COUNT(*) AS amount
FROM (SELECT 'add_materials' AS name
      FROM additional_materials
      UNION ALL
      SELECT 'homeworks' AS name
      FROM homework)
      AS union_table
GROUP BY name
ORDER BY amount DESC;
