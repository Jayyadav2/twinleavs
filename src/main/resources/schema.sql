CREATE TABLE product (
    product_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(255),
    created_on DATE
);

CREATE TABLE gtin (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    gtin VARCHAR(255),
    product_id BIGINT,
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE batch (
    batch_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    mrp INTEGER,
    sp INTEGER,
    purchase_price INTEGER,
    available_quantity INTEGER,
    inwarded_on DATE,
    gtin_id BIGINT,
    FOREIGN KEY (gtin_id) REFERENCES gtin(id)
);
