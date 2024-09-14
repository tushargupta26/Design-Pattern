package creationalPattern.protoTypePattern;

public class Student implements ProtoType{
    int age;
    private int rollNumber;
    String name;

    public Student(int age, int rollNumber, String name){
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public ProtoType clone(){
        return new Student(this.age, this.rollNumber, this.name);
    }
}
