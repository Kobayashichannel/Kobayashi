package com.hspedu.homework.Homework5.Homework13;

/*
Teacher类 有名称(name), 性别(sex), 年龄(age), 学号(stu_id).
做合理封装,通过构造器在创建对象时将有4个属性赋值

 */
public class Teacher extends Person{
    private int work_age;
    //方法


    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    //教师需要有教学的方法(teacher), 在方法上写"我承诺,我会认真教学"
    public void  teacher() {
        System.out.println(getName() + "承诺,我会认真教学 java...");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }
    //输出信息方法
    public void printInfo() {
        System.out.println("老师的信息： ");
        System.out.println(super.basicInfo());
        System.out.println("工龄: " + work_age);
        teacher();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
