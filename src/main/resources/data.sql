-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('damian@example.com',       'Damian', 'USER', current_timestamp),
    ('dominik@example.com',       'Dominik', 'USER', current_timestamp),
    ('hubert.michaluk@student.merito.pl',       'Hubert', 'USER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

-- ===== LAB 02 · training_room =====
insert into training_room (name, capacity, floor, active) values
    ('Sala Jogi', 20, 1, true),
    ('Sala Rowerowa', 15, 1, true),
    ('Sala Funkcjonalna', 25, 0, false);

-- ===== LAB 02 · fitness_class =====
insert into fitness_class (title, category, price, starts_at) values
    ('Poranna Joga', 'YOGA', 35.00, '2026-11-23 08:00:00'),
    ('Turbo Spinning', 'CARDIO', 45.00, '2026-11-23 17:30:00'),
    ('Zdrowy Kręgosłup', 'PILATES', 30.00, '2026-11-24 10:00:00');

-- ===== LAB 02 · member =====
insert into member (full_name, phone, joined_on, contact_name, contact_phone) values
    ('Anna Nowak', '500100200', '2026-09-01', 'Marek Nowak', '500100201'),
    ('Piotr Kowalski', '600200300', '2026-10-15', null, null),
    ('Katarzyna Wiśniewska', null, '2026-11-02', 'Jan Wiśniewski', '700300400');