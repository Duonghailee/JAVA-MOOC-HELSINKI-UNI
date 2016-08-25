public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        int dis = 0;
        if(!this.earlier(comparedDate)){
           
            if(this.month < comparedDate.month){
                dis = 1;
                
            }
            else if(this.month == comparedDate.month && this.day < comparedDate.day){
                dis = 1;
            }
            return this.year - comparedDate.year - dis;
        }
        else{
            dis = 0;
            if(comparedDate.month<this.month){
                dis = 1;
            }
            else if(comparedDate.month == this.month && comparedDate.day < this.day){
                dis = 1;
            }
            return comparedDate.year - this.year - dis;
        }
       
    }
}

