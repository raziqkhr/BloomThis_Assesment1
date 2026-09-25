SELECT DISTINCT u.name, u.email
FROM Users u
JOIN Orders o ON u.id = o.user_id
WHERE o.order_total > 100;