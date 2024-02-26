import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student(4, "bbb", "bca", "aaa");
        Student student02 = new Student(2, "Aaa", "Bbb", "Ccc");
        Student student03 = new Student(3, "CCC", "cab", "abc");
        Student student04 = new Student(1, "ccc", "abc", "cba");
        Student student05 = new Student(6, "sdf", "bca", "aaa");
        List<Student> studentList01 = new ArrayList<>();
        StudentGroup studentGroup01 = new StudentGroup(studentList01);
        studentGroup01.addStudent(student01);
        studentGroup01.addStudent(student02);
        studentGroup01.addStudent(student03);
        studentGroup01.addStudent(student04);
        studentGroup01.addStudent(student05);

        Student student06 = new Student(8, "AaB", "BAb", "njc");
        Student student07 = new Student(7, "aaf", "cab", "abc");
        Student student08 = new Student(5, "cab", "abc", "cba");
        List<Student> studentList02 = new ArrayList<>();
        StudentGroup studentGroup02 = new StudentGroup(studentList02);
        studentGroup02.addStudent(student06);
        studentGroup02.addStudent(student07);
        studentGroup02.addStudent(student08);

        Student student09 = new Student(11, "hgd", "Bbb", "gft");
        Student student10 = new Student(9, "aga", "kjh", "abc");
        Student student11 = new Student(10, "bfd", "abc", "jhk");
        List<Student> studentList03 = new ArrayList<>();
        StudentGroup studentGroup03 = new StudentGroup(studentList03);
        studentGroup03.addStudent(student09);
        studentGroup03.addStudent(student10);
        studentGroup03.addStudent(student11);

        Stream stream01 = new Stream();
        stream01.addStudentGroup(new StudentGroup(studentList01));
        stream01.addStudentGroup(new StudentGroup(studentList02));

        Stream stream02 = new Stream();
        stream02.addStudentGroup(new StudentGroup(studentList03));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream01);
        streams.add(stream02);

// =============== ВЫВОД СТУДЕНТОВ ===============================
// краткий вывод студентов с циклом foreach без сортировки
//        for(Student student : studentGroup01) System.out.println(student);
//        for(Student student : studentGroup02) System.out.println(student);
//        for(Student student : studentGroup03) System.out.println(student);

//        System.out.println();
//  вывод с циклом foreach с сортировкой по ID
        StudentGroupService service01 = new StudentGroupService(studentGroup01);
        StudentGroupService service02 = new StudentGroupService(studentGroup02);
        StudentGroupService service03 = new StudentGroupService(studentGroup03);
//        for(Student student : service01.getSortedStudentGroup()) System.out.println(student);
//        System.out.println();
//        for(Student student : service02.getSortedStudentGroup()) System.out.println(student);
//        System.out.println();
//        for(Student student : service03.getSortedStudentGroup()) System.out.println(student);
//        System.out.println();

//  вывод с циклом foreach с сортировкой по FIO
//        for(Student student : service01.getSortedStudentGroupByFIO()) System.out.println(student);
//        System.out.println();
//        for(Student student : service02.getSortedStudentGroupByFIO()) System.out.println(student);
//        System.out.println();
//        for(Student student : service03.getSortedStudentGroupByFIO()) System.out.println(student);
// =============== КОНЕЦ ВЫВОДА СТУДЕНТОВ ===============================
/*
List<Stream> streams = new ArrayList<>();
streams.add(stream01);
streams.add(stream02);
 */
// =============== ВЫВОД ГРУПП СТУДЕНТОВ ===============================
        for(Stream stream : streams){
            for(StudentGroup group : stream){
                System.out.println(group);
            }
        }
//        StreamService streamService = new StreamService();
//        for(Stream stream : streams){
//            streamService.sortStream(streams);
//                System.out.println(stream);
//            }



        //      Вывод сравнения групп студентов
//        for(Stream stream : streams){
//            for(Stream stream : streamService.sortStream(streams)){
//                System.out.println(stream);
//            }
//        }


//========== Вывод студентов ==========================================================
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        // создаем список при помощи цикла while без сортировки
//        while (iterator.hasNext())
//            // выводим через iterator.next()
//            System.out.println(iterator.next());
//        // удаляем студента при помощи цикла while и выводим остальных на экран
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            if(student.studentId == 4)
//                iterator.remove();
//            else
//            // выводим через student
//            System.out.println(student);
//        }

    }
}