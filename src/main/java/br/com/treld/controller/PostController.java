package br.com.treld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.treld.model.Post;
import br.com.treld.services.GetPosts;

@Controller
@RequestMapping("/posts")
public class PostController {

	@Autowired
	private GetPosts getPosts;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView listAllPosts() {
		List<Post> posts = getPosts.getPosts();
		ModelAndView mv = new ModelAndView("pages/posts/listPosts");
		mv.addObject("posts", posts);
		return mv;
	}

}
