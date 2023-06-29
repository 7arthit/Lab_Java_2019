
public class MyDate {//1.1
		int Day,Month,Year;//1.2
		MyDate(){//3.1
			setDay(1);
			setMonth(1);
			setYear(2018);
		}
		MyDate(int Day,int Month,int Year){
			setDay(Day);
			setMonth(Month);
			setYear(Year);
		}//3.2
		int getDay() {//1.3
			return Day;
		}
		void setDay(int day) {
			if(day>31) {//2.6
				System.out.println("Error Day");
				day = 0 ;
			}//2.6
			Day = day;
		}
		int getMonth() {
			return Month;
		}
		void setMonth(int month) {
			if(month>12) {//2.6
				System.out.println("Error Month");
				month = 0 ;
			}//2.6
			Month = month;
		}
		int getYear() {
			return Year;
		}
		void setYear(int year) {
			Year = year;
		}//1.3
		void print() {
			System.out.println(getDay()+"/"+getMonth()+"/"+getYear());
		}//1.4
}