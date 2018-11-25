# CS417 Fall 16 - FinalProject: Definitely Group Two #
Application was initial final group project for CS417: Design Patterns, at CCSU. Initial project design was an alarm system designed for a raspberry pi that utilizing Python scripts and implementing design patterns using Java. 

## Getting Started ##
The motion alarm system uses the GrovePi along with the LED, button, buzzer, and ultrasonic sensor to detect movement. The program uses a logging system that tracks the date and time of the event that triggered or dactivated the system as well as the sensor that caused the trip or deactivation.

### Installing ###
To install the application, clone the latest git commit from the master branch using the following command on the Raspberry Pi

```
git clone https://github.com/cameronDz/rasp-pi-alarm.git
```

### Properties ###
The properties file format is the name of the component in all capital letters assigning the port number that the component is set. The defualt settings are as follows:
* GREEN_LED_PORT=4
* RED_LED_PORT=7
* BUZZER_PORT=8
* RANGER_PORT=2
* BUTTON_PORT=3

### Deployment ### 
To deploy and run the application, navigate to the root directory in the Raspberry Pi terminal, and execute the application .jar file using the command:

```
java -jar dist/finalproject.jar
```

Once the jar is executed, the system will automatically arm. Using the button component will deactivate the alarm and prompt the user with several options.

### Built With ###
* [Raspberry Pi](https://www.raspberrypi.org/) - central hardware component for running application.
* [GrovePi](https://www.dexterindustries.com/grovepi/) - open source components compatible with the Raspberry pi.
* [Java](https://docs.oracle.com/en/java/) - primary language of application.
* [Python](https://docs.python.org/3/) - scripting language for using GrovePi components.
* [NetBeans](https://netbeans.org/) - main IDE for developing and testing code base.

## Contributing ## 

### Change Log (TODO) List ###

- [x] Move java src packages to /src/main/java directory
- [x] Move python scripts to /src/main/python directory and update pathing
- [x] Move test directory to src, and add java directory - src/test/java
- [x] Move main class to proper java package
- [x] Move project directory to root directory
- [x] Update .gitignore with Eclipse IDE files and new pathing
- [x] Double check formatting for Java classes
- [ ] Check all 'well-behaved' methods and tests for proper behavoir
- [ ] Look into removing GrovePi and using Maven to import project

### Authors ###
* **Cameron Dziurgot** - *Owner of current reposoitory. Group member for initial project.* [cameronDz](https://github.com/cameronDz)
* **Curtis Willbanks** - *Group member for initial project.* 
* **Thomas Roberge** - *Group member for initial project.* [tar11](https://github.com/tar11)
* **Adam Rychlik** - *Group member for initial project.* [adamwiw](https://github.com/adamwiw)

### Acknowledgements ###
* [Professor Chad Williams](https://github.com/caw13) for assigning project and initial code reviews for project submission.
* [PurpleBooth](https://github.com/PurpleBooth) templates for [README](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2) file.

