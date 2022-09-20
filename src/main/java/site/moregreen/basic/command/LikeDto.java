package site.moregreen.basic.command;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LikeDto {

	private Integer l_num;		//찜번호
	private Integer m_num;		//멤버 번호
	private Integer f_num;		//펀딩 번호
}