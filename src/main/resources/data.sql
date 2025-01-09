INSERT INTO product (product_name, created_on) VALUES ('Product1', '2024-01-01');
INSERT INTO gtin (gtin, product_id) VALUES ('G1', 1);
INSERT INTO batch (mrp, sp, purchase_price, available_quantity, inwarded_on, gtin_id)
VALUES (100, 90, 80, 100, '2025-01-01', 1);
