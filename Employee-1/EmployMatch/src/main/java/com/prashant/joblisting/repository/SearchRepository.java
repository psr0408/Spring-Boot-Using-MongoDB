package com.prashant.joblisting.repository;

import com.telusko.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
