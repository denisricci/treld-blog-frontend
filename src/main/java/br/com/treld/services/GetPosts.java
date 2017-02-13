package br.com.treld.services;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.treld.model.Post;

@Service
public class GetPosts {

	public final String BASE_URL = "http://localhost:8080";

	public List<Post> getPosts() {
		RestTemplate restTemplate = new RestTemplate();
		RequestEntity<Void> request = RequestEntity.get(URI.create(BASE_URL + "/api/post/page/1")).build();
		ResponseEntity<Post[]> response = restTemplate.exchange(request, Post[].class);
		List<Post> posts = Arrays.asList(response.getBody());
		return posts;
	};

}
