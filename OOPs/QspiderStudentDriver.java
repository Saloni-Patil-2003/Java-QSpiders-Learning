package OOPs;

public class QspiderStudentDriver {
    public static void main(String[] args) {
        
   
    QspiderStudnt s=new QspiderStudnt("Saloni", "Java", 0, "CsE", 8.0, "Computer Science and Engineering", 8.9, 85, 79767594);
    System.out.println(s.getName());
    System.out.println(s.getCourse());
    s.setBranch("Saloni", 79767594, "CsE", "MCa");
    System.out.println(s.getBranch());
    
} 
}
