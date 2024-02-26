// 1. Создать класс Stream, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    List<StudentGroup> studentsGroups;

    public Stream() {
        studentsGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup studentGroup){
        studentsGroups.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentsGroups.iterator();
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studentsGroup=" + studentsGroups +
                '}';
    }
}
