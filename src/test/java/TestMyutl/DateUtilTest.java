package TestMyutl;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.zhangzhi.myUtil.DateUtil;

public class DateUtilTest {
	
	
	@Test
	public void testRandomDate() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
		for (int i = 0; i <10; i++) {
		
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			String string = df.format(date);
			System.out.println(string);
			
		}
		
	}
	
	
		@Test
	public void testGetDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2000, 9, 10);
		
		
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		
		System.out.println(string);
		
	}

	@Test
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2008, 1, 22);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		
		System.out.println(string);
		
	}
	/**
	 * 拼接下面根据时间范围查询订单的SQL：
String sql = "select * from t_order where create_time>='{1}'
 and create_time<='{2}' ";
将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。
最后打印出正确拼接的SQL字符串。
	 */
	
	@Test
	public void testSql() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = sql.replace("{1}",df.format(date)).replace("{2}", df.format(date2));
		System.out.println(string);
		
	}
	
	
	
	
	//思考题: 根据给定的生日,计算其年龄   
	//思考题: 返回18-65岁之间的随机日期

}
