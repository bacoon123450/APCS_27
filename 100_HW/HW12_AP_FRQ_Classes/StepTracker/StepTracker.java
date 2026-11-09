public class StepTracker{
    private int steps;
    private int aDay;
    private double average;
    private int numofDays;
     public StepTracker(){
        steps = 0;
        aDay = 0;
        average = 0.0;
        numofDays = 0;
        
    }
     public StepTracker(int a,int b){
        steps = a;
        aDay = b;
        average = 0.0;
        numofDays = 0;
        
    }
     public StepTracker(int a,int b, double c){
        steps = a;
        aDay = b;
        average = c;
        numofDays = 0;
        
    }

    public StepTracker(int a){
        steps = a;
        aDay = 0;
        average = 0.0;
        numofDays = 0;

    }

    
    public void addDailySteps(int a){
        steps = steps + a;
        numofDays = numofDays+1;
        if (a>= 10000){
            average ++;
        }
       
    }

    public int activeDays(int a){
        return activeDays;
        
    }
    public int averageSteps(){
        return steps/aDay;
    }

    
}
