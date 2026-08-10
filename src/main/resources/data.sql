INSERT INTO flights
(flight_number, airline, source, destination, departure_time, arrival_time, price, available_seats, status)
VALUES

-- Delhi → Mumbai
('AI101', 'Air India', 'Delhi', 'Mumbai',
 '2026-08-15 08:00:00', '2026-08-15 10:15:00', 5500.00, 45, 'AVAILABLE'),

('6E203', 'IndiGo', 'Delhi', 'Mumbai',
 '2026-08-15 12:30:00', '2026-08-15 14:40:00', 4800.00, 28, 'AVAILABLE'),

('UK821', 'Vistara', 'Delhi', 'Mumbai',
 '2026-08-15 18:00:00', '2026-08-15 20:15:00', 6200.00, 12, 'AVAILABLE'),

('6E411', 'IndiGo', 'Delhi', 'Mumbai',
 '2026-08-15 21:30:00', '2026-08-15 23:40:00', 5100.00, 7, 'AVAILABLE'),

-- Delhi → Bangalore
('AI205', 'Air India', 'Delhi', 'Bangalore',
 '2026-08-16 09:00:00', '2026-08-16 11:45:00', 6100.00, 35, 'AVAILABLE'),

('6E451', 'IndiGo', 'Delhi', 'Bangalore',
 '2026-08-16 15:30:00', '2026-08-16 18:10:00', 5200.00, 20, 'AVAILABLE'),

('UK733', 'Vistara', 'Delhi', 'Bangalore',
 '2026-08-16 19:30:00', '2026-08-16 22:15:00', 6800.00, 9, 'AVAILABLE'),

-- Mumbai → Bangalore
('6E789', 'IndiGo', 'Mumbai', 'Bangalore',
 '2026-08-16 10:00:00', '2026-08-16 11:40:00', 4500.00, 30, 'AVAILABLE'),

('AI622', 'Air India', 'Mumbai', 'Bangalore',
 '2026-08-16 14:00:00', '2026-08-16 15:45:00', 5100.00, 18, 'AVAILABLE'),

('UK612', 'Vistara', 'Mumbai', 'Bangalore',
 '2026-08-16 20:00:00', '2026-08-16 21:45:00', 5700.00, 5, 'AVAILABLE'),

-- Mumbai → Delhi
('AI302', 'Air India', 'Mumbai', 'Delhi',
 '2026-08-17 07:30:00', '2026-08-17 09:40:00', 5300.00, 40, 'AVAILABLE'),

('6E555', 'IndiGo', 'Mumbai', 'Delhi',
 '2026-08-17 13:00:00', '2026-08-17 15:10:00', 4900.00, 25, 'AVAILABLE'),

('UK904', 'Vistara', 'Mumbai', 'Delhi',
 '2026-08-17 19:00:00', '2026-08-17 21:10:00', 6100.00, 11, 'AVAILABLE'),

-- Delhi → Hyderabad
('6E301', 'IndiGo', 'Delhi', 'Hyderabad',
 '2026-08-18 06:30:00', '2026-08-18 08:50:00', 4700.00, 32, 'AVAILABLE'),

('AI511', 'Air India', 'Delhi', 'Hyderabad',
 '2026-08-18 12:00:00', '2026-08-18 14:20:00', 5600.00, 22, 'AVAILABLE'),

('UK812', 'Vistara', 'Delhi', 'Hyderabad',
 '2026-08-18 18:30:00', '2026-08-18 20:45:00', 6300.00, 8, 'AVAILABLE'),

-- Delhi → Chennai
('6E601', 'IndiGo', 'Delhi', 'Chennai',
 '2026-08-19 07:00:00', '2026-08-19 09:50:00', 5800.00, 27, 'AVAILABLE'),

('AI431', 'Air India', 'Delhi', 'Chennai',
 '2026-08-19 14:00:00', '2026-08-19 16:50:00', 6500.00, 15, 'AVAILABLE'),

('UK845', 'Vistara', 'Delhi', 'Chennai',
 '2026-08-19 20:00:00', '2026-08-19 22:50:00', 7200.00, 6, 'AVAILABLE'),

-- Mumbai → Goa
('6E701', 'IndiGo', 'Mumbai', 'Goa',
 '2026-08-20 08:00:00', '2026-08-20 09:15:00', 3200.00, 38, 'AVAILABLE'),

('AI677', 'Air India', 'Mumbai', 'Goa',
 '2026-08-20 13:30:00', '2026-08-20 14:45:00', 3900.00, 20, 'AVAILABLE'),

('6E711', 'IndiGo', 'Mumbai', 'Goa',
 '2026-08-20 19:00:00', '2026-08-20 20:15:00', 3500.00, 14, 'AVAILABLE'),

-- Bangalore → Delhi
('AI802', 'Air India', 'Bangalore', 'Delhi',
 '2026-08-21 06:00:00', '2026-08-21 08:45:00', 6000.00, 33, 'AVAILABLE'),

('6E820', 'IndiGo', 'Bangalore', 'Delhi',
 '2026-08-21 14:30:00', '2026-08-21 17:15:00', 5100.00, 21, 'AVAILABLE'),

('UK902', 'Vistara', 'Bangalore', 'Delhi',
 '2026-08-21 20:30:00', '2026-08-21 23:15:00', 6700.00, 4, 'AVAILABLE'),

-- Bangalore → Mumbai
('6E901', 'IndiGo', 'Bangalore', 'Mumbai',
 '2026-08-22 08:30:00', '2026-08-22 10:10:00', 4300.00, 29, 'AVAILABLE'),

('AI711', 'Air India', 'Bangalore', 'Mumbai',
 '2026-08-22 15:00:00', '2026-08-22 16:40:00', 5000.00, 17, 'AVAILABLE'),

('UK744', 'Vistara', 'Bangalore', 'Mumbai',
 '2026-08-22 19:30:00', '2026-08-22 21:10:00', 5600.00, 10, 'AVAILABLE'),

-- Hyderabad → Delhi
('6E951', 'IndiGo', 'Hyderabad', 'Delhi',
 '2026-08-23 09:00:00', '2026-08-23 11:20:00', 4600.00, 31, 'AVAILABLE'),

('AI921', 'Air India', 'Hyderabad', 'Delhi',
 '2026-08-23 16:00:00', '2026-08-23 18:20:00', 5400.00, 19, 'AVAILABLE'),

-- One unavailable flight for testing
('6E999', 'IndiGo', 'Delhi', 'Mumbai',
 '2026-08-15 05:30:00', '2026-08-15 07:40:00', 4200.00, 0, 'SOLD_OUT');