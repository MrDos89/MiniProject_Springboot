package miniproject01.streamerlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import miniproject01.streamerlist.repository.vo.StreamerInfo;
import miniproject01.streamerlist.service.StreamerInfoService;
// CORS 설정 : 원칙적으로는 허용할 도메인을 정확하게 명시해야 한다.
/* @CrossOrigin(origins="*", // 모든 호스트로 부터의 오리진 허가 
				methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}) */
//-> Global CORS 정첵으로 위임
@RequestMapping("/api/StreamerInfo")
@RestController // @Controller + ResponseBody
public class StreamerInfoApiController {
	// Repository 연결
	@Autowired
	private StreamerInfoService streamerInfoService;
	
	@GetMapping
	public ResponseEntity<List<StreamerInfo>> getAllItems() {
		List<StreamerInfo> items = 
				streamerInfoService.selectAllItems();
		return ResponseEntity.ok(items);
		
	}
	
	@PostMapping
	public ResponseEntity<StreamerInfo> createItem(@RequestBody StreamerInfo item) {
		StreamerInfo savedItem = streamerInfoService.insertItem(item);
		return ResponseEntity.ok(savedItem);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<StreamerInfo> updateItem(@RequestBody StreamerInfo item,
			@PathVariable Integer id) {
		item.setId(id);
		StreamerInfo updatedItem = streamerInfoService.updateItem(item);
		return ResponseEntity.ok(updatedItem);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> 
		deleteItem(@PathVariable Integer id) {
		streamerInfoService.deleteItem(id);
		return ResponseEntity.ok().<Void>build();
	}
}
