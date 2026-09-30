-- Write your query below
SELECT DISTINCT c.title AS title
FROM tv_program t JOIN content c
    on c.content_id = t.content_id
WHERE c.kids_content = 'Y' AND c.content_type = 'Movies' AND t.program_date LIKE '2020-06%'