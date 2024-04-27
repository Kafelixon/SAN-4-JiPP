**Shape Area Calculator**
==========================

A simple Java program that demonstrates method overloading, calculating the area of various shapes, packaged as a Docker image.

**Method Overloading**
-------------------

This program showcases method overloading, a fundamental concept in Java, where multiple methods with the same name can be defined, but with different parameter lists. In this case, the `calculateArea` method is overloaded to accept different shape objects as parameters, allowing for a more flexible and reusable implementation.

**Usage**
-----

### Running the Docker Image

1. Install Docker on your system if you haven't already.
2. Clone this repository and navigate to the project directory.
3. Run `docker-compose up` to build and start the container.
4. The program will output the area of a circle, rectangle, and triangle to the console.

### Building the Docker Image Manually

1. Install Docker on your system if you haven't already.
2. Clone this repository and navigate to the project directory.
3. Run `docker build -t shape-area-calculator.` to build the Docker image.
4. Run `docker run -it shape-area-calculator` to start the container and run the program.

**Code Structure**
-----------------

* `ShapeAreaCalculator.java`: The main Java program that calculates the area of shapes using method overloading.
* `Circle.java`, `Rectangle.java`, and `Triangle.java`: Java classes that represent the shapes.
* `Dockerfile`: The Dockerfile that builds the Docker image.
* `docker-compose.yml`: The Docker Compose file that defines the service.

**Method Overloading in Action**
-----------------------------

The `ShapeAreaCalculator` class defines three `calculateArea` methods, each accepting a different shape object as a parameter:

* `calculateArea(Circle circle)`
* `calculateArea(Rectangle rectangle)`
* `calculateArea(Triangle triangle)`

This allows the program to calculate the area of each shape using a single method name, making the code more concise and easier to maintain.
