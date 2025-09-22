package com.dreyyan.systemate;

// Imports: Standard Java
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

// Imports: Project
import com.dreyyan.systemate.Utility;
import com.dreyyan.systemate.Input;

public class App {
    // [ METHOD ]: Display usable methods
    public static void displayMethods() {
        Method[] utilityMethods = Utility.class.getDeclaredMethods();
        Method[] inputMethods = Input.class.getDeclaredMethods();

        System.out.printf("%-16s | %-15s | %-10s\n", "METHOD", "PARAMETER/s", "RETURN TYPE");
        // Display methods information
        for (Method method : utilityMethods) {
            // Get parameter types as string
            String params = Arrays.stream(method.getParameterTypes()).map(Class::getSimpleName).collect(Collectors.joining(", "));

            // Get return type as string
            String returnType = method.getReturnType().getSimpleName();
            System.out.printf("%-16s | (%d) %-11s | %-10s\n", method.getName(), method.getParameterCount(), params, returnType);
        }
    }

    public static void main(String[] args) {
        
    }    
}
