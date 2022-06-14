package uz.jl.jira.services.auth;

import lombok.NonNull;
import uz.jl.jira.criteria.UserCriteria;
import uz.jl.jira.mappers.BaseMapper;
import uz.jl.jira.repository.AbstractRepository;
import uz.jl.jira.repository.auth.UserRepository;
import uz.jl.jira.services.GenericCRUDService;
import uz.jl.jira.vo.response.Data;
import uz.jl.jira.vo.response.ResponseEntity;

import java.util.List;

/**
 * @author "Elmurodov Javohir"
 * @since 14/06/22/14:46 (Tuesday)
 * jira/IntelliJ IDEA
 */
public class UserService extends AbstractRepository<UserRepository, BaseMapper> implements
        GenericCRUDService<UserVO, UserCreateVO, UserUpdateVO, UserCriteria, Long> {

    protected UserService(UserRepository repository, BaseMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<Long>> create(UserCreateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(@NonNull Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(@NonNull UserUpdateVO dto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<UserVO>> findById(@NonNull Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<UserVO>>> findAll(@NonNull UserCriteria criteria) {
        return null;
    }
}
