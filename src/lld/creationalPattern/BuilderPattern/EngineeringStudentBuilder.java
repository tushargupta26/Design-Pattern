package lld.creationalPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        List<String> sub = new ArrayList<>();
        sub.add("DSA");
        sub.add("CN");
        this.subject = sub;
        return this;
    }
}
