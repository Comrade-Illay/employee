CREATE TABLE IF NOT EXISTS employee_category(
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(200)
);

CREATE TABLE IF NOT EXISTS employee(
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR(200) NOT NULL,
  category_id BIGINT,
  FOREIGN KEY (category_id) REFERENCES employee_category(id)
);

INSERT INTO employee_category(id, name)
VALUES (1, 'Recruting');
INSERT INTO employee_category(id, name)
VALUES (2, 'Development');
INSERT INTO employee_category(id, name)
VALUES (3, 'QA Engeniring');

INSERT INTO employee(id, name, category_id)
VALUES (1, 'Mike', 1);
INSERT INTO employee(id, name, category_id)
VALUES (2, 'Nick', 1);
INSERT INTO employee(id, name, category_id)
VALUES (3, 'Ashley', 2);
INSERT INTO employee(id, name, category_id)
VALUES (4, 'Kate', 2);
INSERT INTO employee(id, name, category_id)
VALUES (5, 'Connor', 3);

ALTER SEQUENCE employee_category_id_seq RESTART with 4;
ALTER SEQUENCE employee_id_seq RESTART with 6;




