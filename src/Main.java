public class Main {

   public static void main(String[] args) {
      Teacher teacher1 = new Teacher("Ayse", "464", "TRH");
      Teacher teacher2 = new Teacher("Elif", "444", "MAT");
      Teacher teacher3 = new Teacher("Yeşim", "445", "FZK");

      Course tarih = new Course("Tarih", "101", "TRH");
      Course fizik = new Course("Fizik", "102", "FZK");
      Course matematik = new Course("Matematik", "103", "MAT");

      tarih.addTeacher(teacher1);
      matematik.addTeacher(teacher2);
      fizik.addTeacher(teacher3);

      Student student1 = new Student("Ali", "123", "12.SINIF", tarih, fizik, matematik);
      student1.addBulkExamNote(100, 78, 48, 50, 60, 80);
      student1.isPass();


   }
}