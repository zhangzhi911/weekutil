package TestMyutl;


import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.zhangzhi.myUtil.FileUtil;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String file="abc.doc";
		String name = FileUtil.getExtendName(file);
		System.out.println(name);
	}

	@Test
	public void testGetTempDirectory() {
	  File file = FileUtil.getTempDirectory();
	  System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		
		  File file = FileUtil.getUserDirectory();
		  System.out.println(file);
		
	}

}
