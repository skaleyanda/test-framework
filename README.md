# web-test-framework

This project is a basic test framework used to test web page functionalities.
This project is designed to support multiple browsers and devices, however, in this version
implementation is only done for Firefox and Chrome Webdrivers.


Points to note
--------------

1) Firefox driver is used as the default Webdriver.
2) Xpath is used to traverse the resulting pages and find HTML elements.

Libraries and tools used for the framework
------------------------------------------

- TestNG
- Selenium
- SLF4J

Tested on environment with following details
--------------------------------------------

- Java 11, openjdk version "11.0.7".  Code is compatible with Java 8 also.
- Maven, Apache Maven 3.8.3
- Mozilla Firefox 95.0

Steps to run
--------------
1. Update the properties file [system_props.properties](src/main/resources/system_props.properties) with the path to ChromeDriver binary file
2. Go the root folder of the project on command prompt/terminal
3. Run the command 'mvn clean install'
