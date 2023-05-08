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

- Java 12
- Java Swing for GUI
- JDBC for database connectivity
- MySQL database

## Requirements

To run this application, you need:

- Java 12 or higher
- MySQL database server
- MySQL JDBC driver

## How to Run

1. Clone the repository to your local machine.
2. Create a new MySQL database using the script.sql script provided in the sql folder.
3. Open the project in your preferred Java IDE.
4. Set the database connection properties in the server.java file.
5. Run the ParkingSchedular.java file to start the application.

## Screenshots

Login Screen

![image](https://user-images.githubusercontent.com/43448844/236745186-de381d12-e656-476f-b4bd-653409050678.png)

Registration Screen

![image](https://user-images.githubusercontent.com/43448844/236745274-b6ec85ba-3ca9-431f-91aa-c5730954bf5f.png)

User Dashboard Screen

![image](https://user-images.githubusercontent.com/43448844/236745552-5f2bcc96-a3c4-444d-87ad-e27d6eab5dd1.png)

Slot Release Screenshot

![image](https://user-images.githubusercontent.com/43448844/236745663-8fc27254-5c8c-45a3-aa47-870f8dfd03b1.png)

### Please feel free to contribute by submitting bug reports or feature requests.
