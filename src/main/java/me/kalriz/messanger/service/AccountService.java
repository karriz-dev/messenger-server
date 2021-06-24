package me.kalriz.messanger.service;

import java.io.IOException;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.common.settings.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.kalriz.messanger.dto.response.GeneralResponse;
import me.kalriz.messanger.types.ResponseResultCode;

@Service
public class AccountService {

	@Autowired
	private RestHighLevelClient elasticClient;

	public GeneralResponse createNewAccountIndex() {
		CreateIndexRequest request = new CreateIndexRequest("account");

		request.settings(Settings.builder()
				.put("index.number_of_shards", 1)
				.put("index.number_of_replicas", 0));

		try {
			elasticClient.indices().create(request, RequestOptions.DEFAULT);
			
			return GeneralResponse.builder()
					.resultCode(ResponseResultCode.SUCCESS)
					.build();
		} catch (IOException exception) {
			return GeneralResponse.builder()
					.resultCode(ResponseResultCode.ERROR)
					.errCode(0x00000010)
					.errMsg(exception.getMessage())
					.build();
		}
	}
}
