SELECT 
    PT_NAME AS 환자이름, 
    PT_NO AS 환자번호, 
    GEND_CD AS 성별코드, 
    AGE AS 나이, 
    COALESCE(TLNO, 'NONE') AS 전화번호
FROM 
    PATIENT
WHERE 
    AGE <= 12 AND GEND_CD = 'W'
ORDER BY 
    AGE DESC, PT_NAME ASC;