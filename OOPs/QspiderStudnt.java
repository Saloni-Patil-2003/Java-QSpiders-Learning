package OOPs;

public class QspiderStudnt {
    private String Institute="Qspider";
    private String name;
    private String course;
    private double fees;
    private String branch;
    private double cgpa;
    private String degree;
    private double sscper;
    private double hscper;
    private long phone;

    public QspiderStudnt(String name,String course,double fees,String branch,double cgpa,String degree,double sscper,double hscper,long phone){
      this.name=name;
      this.course=course;
      this.fees=fees;
      this.branch=branch;
      this.cgpa=cgpa;
      this.degree=degree;
      this.sscper=sscper;
      this.hscper=hscper;
      this.phone=phone;
      System.out.println(name+" Student Registerd");

    
    }

    public String getName(){
        return name;
    }
    
    public String getCourse(){
        return course;
    }
    
    public double getfees(){
        return fees;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String name,long phone,String oldBranch,String newBranch){
        if(this.name==name && this.phone==phone && this.branch==oldBranch){
            this.branch=newBranch;
        }
        else{
            System.out.println("invalid credential");
        }
    }
    
}
