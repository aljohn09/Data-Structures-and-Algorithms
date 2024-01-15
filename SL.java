/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sl;
import java.util.Scanner;

import java.util.Map;

import java.util.HashMap;

public class SL {

public static void main(String[] args) {

Map<String, String> students = new HashMap<>();

Scanner scanner = new Scanner(System.in);

for (int i = 1; i <= 3; i++) {

System.out.print("Enter student number " + i + ": ");

String number = scanner.nextLine();

System.out.print("Enter first name " + i + ": ");

String name = scanner.nextLine();

students.put(number, name);

}

System.out.println("Student List:");

for (Map.Entry<String, String> entry : students.entrySet()) {

System.out.println(entry.getKey() + " " + entry.getValue());

}

students.remove(students.keySet().toArray()); // remove the third entry

System.out.print("Enter your student number: ");

String number = scanner.nextLine();

System.out.print("Enter your first name: ");

String name = scanner.nextLine();

students.put(number, name);

System.out.println("Student List:");

for (String key : students.keySet()) {

System.out.println(key + " " + students.get(key));

}

}

}