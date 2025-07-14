package OOPs;



public class Average {
    float English,marathi,hindi,history,geography;
    Average(float English,float marathi,float hindi,float history,float geography){
        this.English=English;
        this.marathi=marathi;
        this.hindi=hindi;
        this.history=history;
        this.geography=geography;
    }
    public void displayAverage(){
        float average=(English+marathi+hindi+history+geography)/5;
        System.out.println("Average:"+average);
    }
    

    
}
