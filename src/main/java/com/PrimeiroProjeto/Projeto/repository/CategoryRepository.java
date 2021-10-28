package com.PrimeiroProjeto.Projeto.repository;

import com.PrimeiroProjeto.Projeto.entity.CategoryEntity;
import com.PrimeiroProjeto.Projeto.entity.ChecklistItemEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface CategoryRepository extends PagingAndSortingRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findByGuid(String guid);
}
