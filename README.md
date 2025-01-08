建立幣別對照表SQL語法：
CREATE TABLE currency_comparison  (
    id BIGINT PRIMARY KEY,
    currency VARCHAR NOT NULL UNIQUE,
    chinese_name VARCHAR NOT NULL
);
