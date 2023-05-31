package designPattern.dip;

public class Student {
    String name;
    int grade;

    Subject studyingSubject;

    public void setSubject(Subject subject){
        studyingSubject=subject;
    }

    public void study(){
        System.out.println(studyingSubject);
    }
}
