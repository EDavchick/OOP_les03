// 2. Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Stream;
import java.util.Comparator;

public class StreamComparator  implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        int sumStream1 = stream1.studentsGroups.size();
        int sumStream2 = stream2.studentsGroups.size();
        return Integer.compare(sumStream1, sumStream2);
    }

}
