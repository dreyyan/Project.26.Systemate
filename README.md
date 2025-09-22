# Systemate - Java Library for Easy Console Development

## Project Overview

Systemate is a lightweight, open-source Java library designed to simplify console-based application development. It provides a set of utility functions to handle user input and console output, making it easier to create robust and interactive command-line applications. The library focuses on streamlined input validation, formatted output, and console manipulation, reducing boilerplate code for developers.

### Key Features:
- Robust input handling for various data types (int, float, double, char, string, boolean)
- Utility functions for console formatting, error handling, and animation
- Simple console clearing and user interaction prompts
- Cross-platform compatibility
- Easy-to-use API for rapid development

### Project Details
- **Version**: 1.0.0
- **Author**: Dreyyan (ADT07299270@gmail.com)
- **Repository**: [https://github.com/dreyyan/Project.26.Systemate](https://github.com/dreyyan/Project.26.Systemate)
- **License**: MIT License
- **Last Updated**: September 2025
- **Java Version**: JDK 8 or higher
- **Dependencies**: None (uses standard Java libraries)

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java project with a build tool (Maven, Gradle, or manual JAR inclusion)

### Installation

You can include Systemate in your project either by downloading the JAR file or using Maven.

#### Option 1: Maven
Add the following repository and dependency to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependency>
    <groupId>com.github.dreyyan</groupId>
    <artifactId>Project.26.Systemate</artifactId>
    <version>1.0.0</version>
</dependency>
```

*Note*: Replace `1.0.0` with the desired version or a specific Git tag/commit hash if needed.

#### Option 2: Manual JAR Inclusion
1. Download the latest `systemate.jar` from the [releases page](https://github.com/dreyyan/Project.26.Systemate/releases).
2. Add the JAR to your project's classpath.
3. For IDEs, include the JAR in your project dependencies (e.g., in Eclipse, add it to the build path).

#### Option 3: Building from Source
1. Clone the repository:
   ```bash
   git clone https://github.com/dreyyan/Project.26.Systemate.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Project.26.Systemate
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. The compiled JAR will be available in the `target/` directory.

## Usage

To use Systemate, import the `com.dreyyan.systemate` package and utilize the `Input` and `Utility` classes. Below is an example demonstrating some of the library's functionality:

```java
import com.dreyyan.systemate.Input;
import com.dreyyan.systemate.Utility;

public class Main {
    public static void main(String[] args) {
        // Display a formatted header
        Utility.displayFormat('=', 30);
        Utility.animatedPrint("Welcome to Systemate!\n", 50);
        Utility.displayFormat('=', 30);

        // Get validated user input
        String name = Input.getString("Enter your name: ");
        int age = Input.getInt("Enter your age: ");

        // Clear the console
        Utility.clearScreen();

        // Display output and wait for user
        Utility.animatedPrint("Hello, " + name + "! You are " + age + " years old.\n", 30);
        Utility.pressToContinue();
    }
}
```

### Available Functions

Systemate provides two main classes: `Input` and `Utility`. Below is a list of their functions.

#### `Input` Class
Handles user input with built-in validation for various data types.

| Function | Description | Parameters | Return Type |
|----------|-------------|------------|-------------|
| `getInt(String prompt)` | Prompts for an integer input, looping until valid. | `prompt`: The prompt message. | `int` |
| `getFloat(String prompt)` | Prompts for a float input, looping until valid. | `prompt`: The prompt message. | `float` |
| `getDouble(String prompt)` | Prompts for a double input, looping until valid. | `prompt`: The prompt message. | `double` |
| `getChar(String prompt)` | Prompts for a single character input. | `prompt`: The prompt message. | `char` |
| `getString(String prompt)` | Prompts for a string input. | `prompt`: The prompt message. | `String` |
| `getBool(String prompt)` | Prompts for a boolean input (e.g., `true`/`false`). | `prompt`: The prompt message. | `boolean` |

#### `Utility` Class
Provides console manipulation and formatting utilities.

| Function | Description | Parameters | Return Type |
|----------|-------------|------------|-------------|
| `pressToContinue()` | Prompts the user to press any key to continue. | None | `void` |
| `errorMessage(String message, int msDelay)` | Displays an error message with a specified delay. | `message`: The error message.<br>`msDelay`: Delay in milliseconds. | `void` |
| `clearScreen()` | Clears the console by printing blank lines. | None | `void` |
| `displayFormat(char symbol, int length)` | Prints a line of specified length using a given symbol. | `symbol`: Character to repeat.<br>`length`: Number of repetitions. | `void` |
| `animatedPrint(String str, int msDelay)` | Prints a string with a delay between each character. | `str`: The string to print.<br>`msDelay`: Delay in milliseconds per character. | `void` |

### Example: Interactive Menu
```java
import com.dreyyan.systemate.Input;
import com.dreyyan.systemate.Utility;

public class MenuExample {
    public static void main(String[] args) {
        Utility.clearScreen();
        Utility.displayFormat('-', 20);
        Utility.animatedPrint("Main Menu\n", 50);
        Utility.displayFormat('-', 20);

        while (true) {
            System.out.println("1. Say Hello");
            System.out.println("2. Exit");
            int choice = Input.getInt("Select an option: ");
            Utility.clearScreen();

            if (choice == 1) {
                Utility.animatedPrint("Hello, World!\n", 30);
                Utility.pressToContinue();
            } else if (choice == 2) {
                Utility.animatedPrint("Goodbye!\n", 30);
                break;
            } else {
                Utility.errorMessage("Invalid option", 1000);
            }
        }
    }
}
```

## Contributing

Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -m "Add your feature"`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a pull request.

Please ensure your code follows the project's coding standards and includes tests.

## License

Systemate is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or feedback, reach out via [GitHub Issues](https://github.com/dreyyan/Project.26.Systemate/issues) or email at ADT07299270@gmail.com.