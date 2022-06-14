package uz.jl.jira.repository.auth;

import uz.jl.jira.criteria.UserCriteria;
import uz.jl.jira.domains.auth.User;
import uz.jl.jira.repository.GenericCRUDRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/14:45 (Tuesday)
 * jira/IntelliJ IDEA
 */
public class UserRepository implements GenericCRUDRepository<User, UserCriteria, Long> {

    @Override
    public void create(User entity) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<List<User>> findAll(UserCriteria criteria) {
        return Optional.empty();
    }
}
