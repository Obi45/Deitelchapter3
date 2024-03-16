package Chapterthree;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int month;
    private int day;
    private int ageInYears;
   // private int maximumHeartRate;
   // private int targetHeartRate;

    public HeartRate(String firstName, String lastName, int month, int day, int yearOfBirth, int ageInYears, int targetHeartRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.yearOfBirth = ageInYears;

        //this.targetHeartRate = targetHeartRate;
    }

    public HeartRate(String firstName, String lastName, int month, int day, int yearOfBirth) {
        this(firstName,lastName,month,day,yearOfBirth,0,0);
    }
        public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;

    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int ageInYears(int currentYears) {
        return ageInYears = currentYears - yearOfBirth;

    }
    public int getMaximumHeartRate(){
        return maximumHeartRate = 220 - ageInYears;
    }
   public int getTargetHeartRate(){
        return (int)0.05 * maximumHeartRate;
   }

    public Object getAgeInYears() {
    }
}