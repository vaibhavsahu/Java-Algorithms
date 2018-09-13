package com.vaibhav.interview;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final static Scanner scan = new Scanner(System.in);

    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) throws FileNotFoundException, IOException{
//        File file = new File("E:\\HackerRankPQ\\src\\com\\vaibhav\\interview\\input00.txt");
//        BufferedReader br = new BufferedReader(new FileReader(file));
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

//            while(br.readLine() != null){
//                System.out.println(br.readLine());
//            }
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            //System.out.println(event);
            events.add(event);
        }
//
        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
