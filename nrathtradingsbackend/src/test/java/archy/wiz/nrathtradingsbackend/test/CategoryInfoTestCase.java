package archy.wiz.nrathtradingsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import archy.wiz.nrathtradingsbackend.dao.CategoryInfoDAO;
import archy.wiz.nrathtradingsbackend.dto.CategoryInfo;

public class CategoryInfoTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private CategoryInfo categoryInfo;
	private static CategoryInfoDAO categoryInfoDAO;
	
	@BeforeClass
	public static void Init() {
		context =  new AnnotationConfigApplicationContext();
		context.scan("archy.wiz.nrathtradingsbackend");
		context.refresh();
		categoryInfoDAO = (CategoryInfoDAO)context.getBean("categoryInfoDAO");
	}
	
	@Test
	public void TestCategoryInfo() {
		
	
		categoryInfo = new CategoryInfo();
		categoryInfo.setHeaderOne("THIS IS THE HEADER FOR FIRST CAT");
		categoryInfo.setFirstDescription("that is used to measure our performance mission inter alias: â€¢ "
				+ "Employment equity will be maintained across all races and gender while aligning with "
				+ "government stance towards empowerment. â€¢ Execute all technical challenges\r\n" + 
				"to provide excellent solutions that will exceed the clientâ€™s expectations");
		categoryInfo.setImageUrlOne("IMGEA1.JPG");
		categoryInfo.setHeaderTwo("THIS IS THE SECOND HEADER");
		categoryInfo.setSecondDescription("Projects are undertaken in the private and public sectors"
				+ " with built expertise\r\n in the fields of education, healthcare, judicial");
		categoryInfo.setImageURLTwo("IMGEA2.JPG");
		categoryInfo.setCategoryId(1);
		assertEquals("you have successfully added a categoryInfo", true, categoryInfoDAO.add(categoryInfo));
		
		
		
		categoryInfo = new CategoryInfo();
		categoryInfo.setHeaderOne("YOU ARE WELCOME ON JOINIG OUR TEAM");
		categoryInfo.setFirstDescription("that is used to measure our performance mission inter alias: â€¢ "
				+ "Employment equity will be maintained across all races and gender while aligning with "
				+ "government stance towards empowerment. â€¢ Execute all technical challenges\r\n" + 
				"to provide excellent solutions that will exceed the clientâ€™s expectations");
		categoryInfo.setImageUrlOne("IMGEB1.JPG");
		categoryInfo.setHeaderTwo("THIS IS COMING FROM ARCHY MULAUDZI");
		categoryInfo.setSecondDescription("Projects are undertaken in the private and public sectors"
				+ " with built expertise\r\n in the fields of education, healthcare, judicial");
		categoryInfo.setImageURLTwo("IMGEB2.JPG");
		categoryInfo.setCategoryId(2);
		assertEquals("you have successfully added a categoryInfo", true, categoryInfoDAO.add(categoryInfo));
		
		
		categoryInfo = new CategoryInfo();
		categoryInfo.setHeaderOne("THIS IS THE HEADER FOR FIRST CAT");
		categoryInfo.setFirstDescription("that is used to measure our performance mission inter alias: â€¢ "
				+ "Employment equity will be maintained across all races and gender while aligning with "
				+ "government stance towards empowerment. â€¢ Execute all technical challenges\r\n" + 
				"to provide excellent solutions that will exceed the clientâ€™s expectations");
		categoryInfo.setImageUrlOne("IMGEB1.JPG");
		categoryInfo.setHeaderTwo("THIS IS THE SECOND HEADER");
		categoryInfo.setSecondDescription("Projects are undertaken in the private and public sectors"
				+ " with built expertise\r\n in the fields of education, healthcare, judicial");
		categoryInfo.setImageURLTwo("IMGEB2.JPG");
		categoryInfo.setCategoryId(2);
		assertEquals("you have successfully added a categoryInfo", true, categoryInfoDAO.add(categoryInfo));
		
		
		
		categoryInfo = categoryInfoDAO.get(3);
		assertEquals("you have successfully fetched a categoryInfo", "THIS IS THE HEADER FOR FIRST CAT", categoryInfo.getHeaderOne());
		
		categoryInfo.setHeaderOne("THIS IS HEADER THAT CHANGED");
		assertEquals("you have successfully updated a category info",true, categoryInfoDAO.update(categoryInfo));
		
		
		assertEquals("you have successfully deleted a category info",true, categoryInfoDAO.delete(categoryInfo));
		
	    assertEquals("you have successfully fetched a list of all active category info",2, categoryInfoDAO.listActiveCategoryInfo().size());
				
		assertEquals("you have successfully fetched a list of all active category info",1, categoryInfoDAO.getActiveCategoryInfoByCategoryInfo(1).size());
       assertEquals("you have successfully fetched a list of all active category info",1, categoryInfoDAO.getActiveCategoryInfoByCategoryInfo(2).size());
       assertEquals("you have successfully fetched a list of all active category info",0, categoryInfoDAO.getActiveCategoryInfoByCategoryInfo(3).size());

	
		
		
		
	}
}

