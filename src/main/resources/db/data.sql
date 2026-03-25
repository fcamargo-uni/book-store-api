INSERT INTO categories(id, name) values (1, 'Ciencia Ficcion'),
(2, 'Terror'),
(3, 'Novelas Romanticas'),
(4, 'Deportes'),
(5, 'Policial') ON CONFLICT (id) DO NOTHING;