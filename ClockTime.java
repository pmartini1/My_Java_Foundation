
public class ClockTime {
	private int hour;
	private int minute;
	private String amPm;
	
	public ClockTime(int a, int b, String s) {
		this.hour = a;
		this.minute = b;
		this.amPm = s;
	}
	
		public int getHour () {
			return hour;
		}
		public int getMinute() {
			return minute;
		}
		public String getAmPm() {
			return amPm;
		}
	
		public String toString() {
			return hour+":"+minute+" "+amPm;
		}
		
		public boolean equals (Object obj) {
			boolean R = false;
			ClockTime o = (ClockTime)obj;
			if (obj instanceof ClockTime) {
				R = hour == o.hour && minute == o.minute && amPm.equals(o.amPm);
			}
			return R;
		}
}
