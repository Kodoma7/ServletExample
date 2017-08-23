/**
Заполнение таблиц тестовыми данными
 */
START TRANSACTION;

INSERT INTO contact_book.users VALUES (NULL, 'Kira', 123);
INSERT INTO contact_book.users VALUES (NULL, 'Lila', 457);
INSERT INTO contact_book.users VALUES (NULL, 'Ronald', 357);

INSERT INTO contact_book.groups VALUES (NULL, 'A');
INSERT INTO contact_book.groups VALUES (NULL, 'B');
INSERT INTO contact_book.groups VALUES (NULL, 'C');

INSERT INTO contact_book.contacts VALUES (NULL, 'Lubov', 'Alekseeva', 'Kerchenskaya, 4', 2456841, 1, 1);
INSERT INTO contact_book.contacts VALUES (NULL, 'Olga', 'Yakovleva', 'Zimina, 39', 2384511, 1, 3);
INSERT INTO contact_book.contacts VALUES (NULL, 'Dmitry', 'Sokolov', 'Marshala Kazakova, 16', 2435247, 2, 2);

COMMIT;
# ROLLBACK