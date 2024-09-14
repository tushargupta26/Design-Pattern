package creationalPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubject() {
        List<String> sub = new ArrayList<>();
        sub.add("FI1");
        sub.add("FI2");
        this.subject = sub;
        return this;
    }
}
