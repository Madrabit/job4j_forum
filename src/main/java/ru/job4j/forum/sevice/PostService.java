package ru.job4j.forum.sevice;

import org.springframework.stereotype.Service;
import ru.job4j.forum.model.Post;
import ru.job4j.forum.store.PostRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author madrabit on 25.09.2020
 * @version 1$
 * @since 0.1
 */
@Service
public class PostService {

    private final PostRepository posts;

    public PostService(PostRepository posts) {
        this.posts = posts;
    }

    public List<Post> findAll() {
        List<Post> rsl = new ArrayList<>();
        posts.findAll().forEach(rsl::add);
        return rsl;
    }

    public Optional<Post> findById(int id) {
        return posts.findById((long) id);
    }

    public void create(Post post) {
        posts.save(post);
    }
}
