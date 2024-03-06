-- Initialisation des tables
INSERT INTO Country(code, name) VALUES
    ('FR', 'France'), -- Les clés sont auto-générées
    ('UK', 'United Kingdom'),
    ('US', 'United States of America');

INSERT INTO Seance(num_Seance, date_Seance, debut_Seance, fin_Seance, distance, denivele, formulaire_Fin_Seance) VALUES
    ('1', '2024-03-06', '12:00:00', '14:00:00', '6,7', '230', '')
