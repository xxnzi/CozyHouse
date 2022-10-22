package com.exe.cozy.itemDetail;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.exe.cozy.domain.ItemDetailDto;

public interface ItemDetailService {

	public int itemMaxNum() throws Exception;

	public int fileMaxNum() throws Exception;

	public void insertItem(ItemDetailDto idto) throws Exception;

	public void insertItem(Map<String, Object> idto) throws Exception;

	public int getItemDataCount(String searchKey, String searchValue) throws Exception;

	public void deleteItemData(int itemNum) throws Exception;

	public void updateItemHitCount(int itemNum) throws Exception;

	public ItemDetailDto getReadItemData(int itemNum) throws Exception;

	public int fileWrite(MultipartFile file) throws Exception;
}
