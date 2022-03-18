package wei;

public class Student {
    String name;
    int math;
    int english;

    public void print(){
        int average = (math + english)/2;
        System.out.print(name + "\n" + math + "\n" + english + "\n" + + average);



    }

    public Student(String name){
        this.name = name;
    }

    public Student(){

    }



}
