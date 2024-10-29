package lld.creationalPattern.BuilderPattern;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }
    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        } else {
            return null;
        }
    }

    private Student createMBAStudent() {
        return studentBuilder.setAge(25).setFatherName("Fa").setName("Na").setSubject().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setAge(25).setFatherName("Fa").setName("Na2").setSubject().build();
    }
}
