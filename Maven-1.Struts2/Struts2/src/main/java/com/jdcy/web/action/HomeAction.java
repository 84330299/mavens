package com.jdcy.web.action;

import java.util.ArrayList;
import java.util.List;

public class HomeAction {

	private List<String> words = new ArrayList<String>();

	public List<String> getWords() {
		return words;
	}

	public void setWords(List<String> words) {
		this.words = words;
	}

	public String index() {
		words.add("aaa");
		words.add("bbb");
		words.add("ccc");
		return "index";
	}

}
