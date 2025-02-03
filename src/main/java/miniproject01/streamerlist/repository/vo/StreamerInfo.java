package miniproject01.streamerlist.repository.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StreamerInfo {
	private Integer id;
	private String name;
	private Integer followers;
	private Integer avgViews;
	private Float dailyHours;
	private String thumbnail;
	private String followerTrends;
	private Date upd_date;
}