import java.text.SimpleDateFormat;

public class LunarCalendar {

    private String[] sWeek = {"������", "����һ", "���ڶ�", "������", "������", "������", "������"};
	private String tgString = "���ұ����켺�����ɹ�";
    private String dzString = "�ӳ���î������δ�����纥";
    private String numString = "һ�����������߰˾�ʮ";
    private String monString = "�������������߰˾�ʮ����";
    private String weekString = "��һ����������";
    private String sx = "��ţ������������Ｆ����";
	public static void main(String []args){
		ȡ��ϵͳʱ��long time=System.currentTimeMillis();
		final Calendar mCalendar=Calendar.getInstance();
		mCalendar.setTimeInMillis(time);
		ȡ��Сʱ��mHour=mCalendar.get(Calendar.HOUR);
		ȡ�÷��ӣ�mMinuts=mCalendar.get(Calendar.MINUTE);
       
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date curDate = new Date(System.currentTimeMillis());//��ȡ��ǰʱ��
		String str = formatter.format(curDate);
		System.out.println("Hello World");
	}
}
