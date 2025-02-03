package miniproject01.streamerlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miniproject01.streamerlist.mapper.StreamerInfoMapper;
import miniproject01.streamerlist.repository.vo.StreamerInfo;

@Service
public class StreamerInfoService {
	@Autowired
	private StreamerInfoMapper streamerInfoMapper;
	
	//	목록 불러오기
	public List<StreamerInfo> selectAllItems() {
		List<StreamerInfo> items = 
				streamerInfoMapper.selectAllItems();
		return items;
	}
	
	//	새 아이템 추가
	public StreamerInfo insertItem(StreamerInfo item) {
		streamerInfoMapper.insertItem(item);
		//	새로 생성된 item의 PK
		Integer id = item.getId();
		return streamerInfoMapper.selectById(id);
	}
	
	//	아이템 수정
	public StreamerInfo updateItem(StreamerInfo item) {
		streamerInfoMapper.updateItem(item);
		return item;
	}
	
	//	아이템 삭제
	public int deleteItem(Integer id) {
		return streamerInfoMapper.deleteItem(id);
	}
}
