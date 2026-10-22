public class StudentDriver {
    public static void main(String[] args) {
        // Membuat instance/objek dari Student class
        Student studentObj = new Student();
        
        // Mencetak informasi tentang object tersebut ke layar
        System.out.println("Student Name: " + studentObj.fName + " " + studentObj.lName);
        System.out.println("Student ID: " + studentObj.stuId);
        System.out.println("Student Status: " + studentObj.stuStatus);
    }
}