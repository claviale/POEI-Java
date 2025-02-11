CREATE TABLE contacts (
	id INT PRIMARY KEY IDENTITY,
	nom VARCHAR(50) NOT NULL,
	prenom VARCHAR(50) NOT NULL,
	date_naissance DATE,
	telephone VARCHAR(16),
	url_reseau VARCHAR(255),
	poste VARCHAR(50),
	specialite VARCHAR(50),
);

INSERT INTO contacts (nom, prenom, date_naissance, telephone, url_reseau, poste, specialite)
	VALUES  ('CASSIN',	 'Etienne',	 DATEADD(YEAR, -32, GETDATE()),	'0122334477', 'facebook.com/ECassin', 'Formateur', 'Fullstack'),
			('MUGNIERY','Jean', DATEADD(YEAR, -32, GETDATE()),	'0011223344', 'myspace.com/JMU', 'Formateur', 'Bug Creator'),
			('BATOR', 'Al', DATEADD(YEAR, -32, GETDATE()),	'0154987546', 'Discord', 'Pirate', 'Spaceships'),
			('CULA', 'Alphonse', DATEADD(YEAR, -32, GETDATE()), '1235497546', 'Carrier Pidgeon', 'Doctor', 'Bloodworks');