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
insert into fitness_class (title, category, price, starts_at, room_id) values
    ('Poranna Joga', 'YOGA', 35.00, '2026-11-23 08:00:00', 1),
    ('Turbo Spinning', 'CARDIO', 45.00, '2026-11-23 17:30:00', 2),
    ('Zdrowy Kręgosłup', 'PILATES', 30.00, '2026-11-24 10:00:00', 1);

-- ===== LAB 02 · member =====
insert into member (full_name, phone, joined_on, contact_name, contact_phone, user_account_id) values
    ('Anna Nowak', '500100200', '2026-09-01', 'Marek Nowak', '500100201', 1),
    ('Piotr Kowalski', '600200300', '2026-10-15', null, null, 2),
    ('Katarzyna Wiśniewska', null, '2026-11-02', 'Jan Wiśniewski', '700300400', null);

-- ===== LAB 03 · class_reservation =====
insert into class_reservation (member_id, fitness_class_id, booked_at, confirmed) values
    (1, 1, '2026-11-20 12:00:00', true),
    (2, 2, '2026-11-20 14:15:00', true),
    (3, 1, '2026-11-21 09:30:00', false);

-- ===== LAB 03 · equipment =====
insert into equipment (name, brand, total_stock, available) values
    ('Mata do jogi', 'Reebok', 30, true),
    ('Rower stacjonarny', 'Schwinn', 15, true),
    ('Piłka gimnastyczna', 'TheraBand', 20, true);

-- ===== LAB 03 · class_equipment =====
insert into class_equipment (fitness_class_id, equipment_id, quantity, notes) values
    (1, 1, 20, 'Maty rozłożone przed zajęciami'),
    (2, 2, 15, null),
    (3, 3, 12, 'Piłki średnie 65 cm');