# Parking-Schedular

This is a Java Swing application that allows users to manage vehicle parking in a parking lot. The system uses JDBC to connect to a MySQL database and stores information about the vehicles, parking slots, and parking charges.

_Note:_ Implementation of admin and parking receipts is not completed yet.

## Features

The Vehicle Parking Management System has the following features:

- Login and registration for users
- Adding new vehicles to the parking lot
- Displaying the list of parked user vehicles
- Assigning parking slots to vehicles
- Removing vehicles from the parking lot
- Calculating parking charges based on the duration of parking
- Generating parking receipts for customers
- Admin access to view parking statistics and generate reports

## Technologies Used

- Java 8
- Java Swing for GUI
- JDBC for database connectivity
- MySQL database

## Requirements

To run this application, you need:

- Java 8 or higher
- MySQL database server
- MySQL JDBC driver

## How to Run

Clone the repository to your local machine.
Create a new MySQL database using the parking_lot.sql script provided in the sql folder.
Open the project in your preferred Java IDE.
Set the database connection properties in the DBConnection.java file.
Run the Main.java file to start the application.
Screenshots
Login Screen
Vehicle Parking Screen
Parking Receipt

Contributors
This project was created by [Your Name] and [Other Contributors]. Please feel free to contribute by submitting bug reports or feature requests.

License
This project is licensed under the MIT License. See the LICENSE file for more information.
