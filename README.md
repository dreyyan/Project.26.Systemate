# Systemate
_Java Library for Easy Console Development_

**Systemate** is a lightweight, open-source Java library designed to simplify console-based application development. It provides utility functions for robust input validation, formatted console output, and interactive prompts, reducing boilerplate code for developers. With a focus on ease of use and cross-platform compatibility, Systemate streamlines the creation of user-friendly command-line applications.

The primary purpose of Systemate is to empower developers to build efficient, interactive console applications with minimal setup, making it ideal for educational projects, prototypes, or small-scale tools.

## FEATURES
✅ **Robust Input Handling** – Validate and retrieve inputs for various data types (int, float, double, char, string, boolean).  
✅ **Console Formatting** – Format output with symbols, animations, and error messages.  
✅ **Interactive Prompts** – Simplify user interactions with clear screen and press-to-continue utilities.  
✅ **Cross-Platform** – Compatible with Windows, Linux, and macOS using standard Java libraries.  
✅ **No Dependencies** – Built entirely with standard Java, ensuring easy integration.  

## FUTURE IMPLEMENTATIONS
🚀 **Extended Input Validation** – Add support for custom regex patterns and complex data types.  
🚀 **Advanced Formatting** – Introduce color support and ASCII art for enhanced console visuals.  
🚀 **Configuration Management** – Support for external configuration files to customize behavior.  
🚀 **Testing Utilities** – Add built-in tools for debugging and testing console apps.  

## UPDATES
🔄 Initial release (v1.0.0) with core input and utility functions.  
🔄 Optimized performance for console animations and input validation.  
🔄 Improved documentation for easier adoption.  

## PROJECT DETAILS
📌 **Author:** dreyyan  
📌 **Started:** 2025-09-21  
📌 **Finished:** 2025-09-22  

## TECH STACK
🛠️ **Language:** Java  
🛠️ **Libraries:** Standard Java libraries (no external dependencies)  

## INSTALLATION
### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A build tool (Maven, Gradle, or manual JAR inclusion)
- Create a development environment:
  ```
  java -version
  ```

### Install Dependencies
Systemate uses only standard Java libraries, so no external dependencies are required.

#### Option 1: Maven
Add the following to your `pom.xml`:
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

#### Option 2: Manual JAR Inclusion
1. Download `systemate.jar` from the [releases page](https://github.com/dreyyan/Project.26.Systemate/releases).
2. Add the JAR to your project's classpath.
3. For IDEs, include the JAR in project dependencies (e.g., Eclipse build path).

#### Option 3: Building from Source
1. Clone the repository:
   ```
   git clone https://github.com/dreyyan/Project.26.Systemate.git
   ```
2. Navigate to the project directory:
   ```
   cd Project.26.Systemate
   ```
3. Build with Maven:
   ```
   mvn clean install
   ```
4. Find the compiled JAR in the `target/` directory.

### Verify Installation
Check Java version:
```
java -version
```

## USAGE
### Running an Application with Systemate
Import the `com.dreyyan.systemate` package and use the `Input` and `Utility` classes. Example:
```java
import com.dreyyan.systemate.Input;
import com.dreyyan.systemate.Utility;

public class Main {
    public static void main(String[] args) {
        Utility.displayFormat('=', 30);
        Utility.animatedPrint("Welcome to Systemate!\n", 50);
        Utility.displayFormat('=', 30);

        String name = Input.getString("Enter your name: ");
        int age = Input.getInt("Enter your age: ");

        Utility.clearScreen();
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

## DEBUGGING
For issues, check console output for errors related to input validation or console operations. Test with a simple program:
```
java Main
```
Report issues via [GitHub Issues](https://github.com/dreyyan/Project.26.Systemate/issues) or contact ADT07299270@gmail.com.

## PROJECT STRUCTURE
- `src/main/java/com/dreyyan/systemate/`: Core library code with `Input` and `Utility` classes.
- `pom.xml`: Maven configuration for building the project.
- Other files include standard Maven/Gradle setup and documentation.

## CONTRIBUTING
Contributions are welcome! Fork the repo, make changes, and submit a pull request:
1. Create a feature branch: `git checkout -b feature/new-feature`
2. Commit changes: `git commit -m "Add new feature"`
3. Push: `git push origin feature/new-feature`
4. Open a pull request

Ensure code follows project standards and includes tests. Report issues or suggest features via [GitHub Issues](https://github.com/dreyyan/Project.26.Systemate/issues).

## LICENSE
This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.