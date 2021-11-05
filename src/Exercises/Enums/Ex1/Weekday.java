package Exercises.Enums.Ex1;

public enum Weekday {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    boolean isWeekDay( ){
        if (!this.equals(SATURDAY)&&!this.equals(SUNDAY)){
            return true;
        }else{
            return false;
        }
    }

    boolean isHoliday(){
        if(this.equals(SATURDAY)||this.equals(SUNDAY)){
            return true;
        }else{
            return false;
        }
    }

    public void whichIsGreater(Weekday weekday){
            if(this.ordinal()<weekday.ordinal()){
                System.out.println("Before "+weekday);
            }else{
                System.out.println("After "+weekday);
            }
    }
}
