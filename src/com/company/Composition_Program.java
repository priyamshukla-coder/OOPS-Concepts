package com.company;

import java.util.Scanner;

public class Composition_Program {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        graduate_student student=new graduate_student();
        System.out.println(student.get_student_salary());
    }
}

class job{
    private int job_id;
    private int emp_id;
    private int salary;

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class graduate_student{
    private job new_job;

    //A newly grad student has a job//
    public graduate_student(){
        this.new_job=new job();
        new_job.setSalary(45673);
    }

    public int get_student_salary(){
        return new_job.getSalary();
    }
}