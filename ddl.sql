-- 1. 创建各省份库

-- 2. 创建受理表
create table t_ds_accept (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    province_code VARCHAR(10) NOT NULL,
    accept_id VARCHAR(50) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
-- 3. 创建业务表
create table t_ds_business (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    province_code VARCHAR(10) NOT NULL,
    accept_id varchar(50) NOT NULL,
    business_name VARCHAR(255) NOT NULL,
    business_code VARCHAR(50) NOT NULL UNIQUE,
    delete_flag int DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);