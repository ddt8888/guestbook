package org.zerock.guestbook;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.guestbook.dto.GuestbookDTO;
import org.zerock.guestbook.dto.PageRequestDTO;
import org.zerock.guestbook.dto.PageResultDTO;
import org.zerock.guestbook.entity.Guestbook;

@SpringBootTest
class GuestbookApplicationTests {

	@Test
	void contextLoads() {
	}

	/*@Test
	public void testSearch() {
		PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
				.page(1)
				.size(10)
				.type("tc")
				.keyword("한글")
				.build();
		PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);
		System.out.println("PREV: "+resultDTO.isPrev());
		System.out.println("NEXT: "+resultDTO.isNext());
		System.out.println("TOTAL: "+resultDTO.getTotalPage());
		System.out.println("............................");
		for( GuestbookDTO guestbookDTO : resultDTO.getDtoList()) {
			System.out.println(guestbookDTO);
		}
		System.out.println("===============================================");
		resultDTO.getPageList().forEach(i -> System.out.println(i));
	}
*/
}
