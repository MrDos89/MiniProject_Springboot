package miniproject01.streamerlist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import miniproject01.streamerlist.repository.vo.StreamerInfo;

@Mapper
public interface StreamerInfoMapper {
//	<select id="selectAllItems" resultType="StreamerInfo">
	List<StreamerInfo> selectAllItems();
//	<insert id="insertItem" parameterType="StreamerInfo">
	int insertItem(StreamerInfo item);
//	<select id="selectById" parameterType="int" 
//			resultType="shopItem">
	StreamerInfo selectById(Integer id);
//	<update id="updateItem" parameterType="StreamerInfo">
	int updateItem(StreamerInfo item);
//	<delete id="deleteItem"
//			parameterType="int">
	int deleteItem(Integer id);
}
