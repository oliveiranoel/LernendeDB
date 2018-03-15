# Console Application

Lernendenerfassungsprogramm, mit div. Angaben inkl. Projektort.

#### Voraussetzungen
* Java Version 1.8.0_151

#### Projekt Setup
#####DB Schema: 

CREATE DATABASE IF NOT EXISTS LFA_Lernende;

use LFA_Lernende;

CREATE TABLE lernende (
id INT AUTO_INCREMENT PRIMARY KEY,
nachname VARCHAR(50),
vorname VARCHAR(50),
lebensalter INT,
lernbegleiter VARCHAR(80),
qpa VARCHAR(80),
projekt VARCHAR(80)
);

INSERT INTO lernende (nachname, vorname, lebensalter, lernbegleiter, qpa, projekt)
VALUES ("Oliveira", "Noel", 18, "Martin Näf", "Jan Minder", "LFA"),
		("Bruggmann", "Delano", 17, "Adrian Burkhalter", "Jan Minder", "LFA")
		;

#### Useranleitung
Dieses Programm dient dazu, Lernende erfassen zu können. Dabei werden Name, 
Vorname, Alter, Lernbegleiter, QPA und Projekt gespeichert. Die Lernende 
werden in einer Datenbank gespeichert. Von dort aus können sie auch wieder mittel ID
gelöscht werden. Zusätzlich gibt es noch eine Funktion, welchen den Benutzer erlaubt, alle
Lernende in einer Tabelle auszugeben. 

#### Autor
* Noel Oliveira

#### Datum
* 1.3.18
