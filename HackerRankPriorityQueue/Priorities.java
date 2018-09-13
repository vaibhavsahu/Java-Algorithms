package com.vaibhav.interview;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import java.util.*;

/**
 * Created by vaibh on 9/12/2018.
 */
class Priorities{
    private List<Student> students;

//    PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
//        @Override
//        public int compare(Student o1, Student o2) {
//            if(o1.getCGPA() == o2.getCGPA() && o1.getName() == o2.getName()){
//                return o1.getID() - o2.getID();
//            } else if(o1.getCGPA() == o2.getCGPA()){
//                return o1.getName().compareTo(o2.getName());
//            }else{
//                return Double.compare(o2.getCGPA(), o1.getCGPA());
//            }
//        }
//    });
    PriorityQueue<Student> queue = new PriorityQueue<>(
        Comparator.comparing(Student::getCGPA).reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getID));
    String operation = "";


    public List<Student> getStudents(List<String> events){
        for (String s: events) {
            if(s.length() == 6){
                System.out.println(s);
                operation = s;
                Student student = queue.poll();
                System.out.println("student removed: " + student.getName());
            }else {
                System.out.println(s);
                String[] arr = s.split(" ");
                //Arrays.stream(arr).forEach(t -> System.out.println(t));
                operation = arr[0];
                String name = arr[1];
                double cgpa = Double.valueOf(arr[2]);
                int id = Integer.valueOf(arr[3]);
                Student student = new Student(id, name, cgpa);
                queue.add(student);
            }
        }
        List<Student> students = new ArrayList<>();
        while(!queue.isEmpty()){
            students.add(queue.poll());
        }
        return students;
    }
}
