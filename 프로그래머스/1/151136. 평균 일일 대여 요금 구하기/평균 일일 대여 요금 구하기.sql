SELECT TRUNCATE(ROUND(AVG(DAILY_FEE),1),0) AS AVERAGE_FEE 
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'
