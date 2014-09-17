import java.text.SimpleDateFormat;

public class LunarCalendar {

    private String[] sWeek = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
	private String tgString = "甲乙丙丁戊己庚辛壬癸";
    private String dzString = "子丑寅卯辰巳午未申酉戌亥";
    private String numString = "一二三四五六七八九十";
    private String monString = "正二三四五六七八九十冬腊";
    private String weekString = "日一二三四五六";
    private String sx = "鼠牛虎兔龙蛇马羊猴鸡狗猪";
	public static void main(String []args){
		取得系统时间long time=System.currentTimeMillis();
		final Calendar mCalendar=Calendar.getInstance();
		mCalendar.setTimeInMillis(time);
		取得小时：mHour=mCalendar.get(Calendar.HOUR);
		取得分钟：mMinuts=mCalendar.get(Calendar.MINUTE);
       
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date curDate = new Date(System.currentTimeMillis());//获取当前时间
		String str = formatter.format(curDate);
		System.out.println("Hello World");
	}
}
