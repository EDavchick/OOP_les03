// 3. Создать класс StreamService, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StreamService {
    public List<Stream> sortStream(List<Stream> streams){
        Collections.sort(streams, new StreamComparator());
        return streams;
    }


}
