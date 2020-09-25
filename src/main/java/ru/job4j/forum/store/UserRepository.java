package ru.job4j.forum.store;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.forum.model.User;

/**
 * @author madrabit on 25.09.2020
 * @version 1$
 * @since 0.1
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
