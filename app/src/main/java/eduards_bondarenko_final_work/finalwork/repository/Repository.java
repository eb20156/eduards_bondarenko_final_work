package eduards_bondarenko_final_work.finalwork.repository;

import java.util.List;

public interface Repository<T> {

    Long save(T entity);

    List<T> findAll();

    T findById(Long id);

    void delete(Long id);
}
