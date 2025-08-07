SELECT fh.flavor
FROM FIRST_HALF FH
    left outer JOIN JULY J
    ON FH.flavor = J.flavor
group by FH.flavor
order by fh.total_order + sum(j.total_order) desc
limit 3