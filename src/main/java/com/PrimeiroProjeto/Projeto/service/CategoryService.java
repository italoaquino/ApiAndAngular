package com.PrimeiroProjeto.Projeto.service;

import com.PrimeiroProjeto.Projeto.entity.CategoryEntity;
import com.PrimeiroProjeto.Projeto.exception.ResourceNotFoundExecption;
import com.PrimeiroProjeto.Projeto.repository.CategoryRepository;
import com.PrimeiroProjeto.Projeto.repository.ChecklistItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

@Slf4j
@Service
public class CategoryService {

    private CategoryRepository categoryRepository;
    private ChecklistItemRepository checklistItemRepository;

    public CategoryService(CategoryRepository categoryRepository, ChecklistItemRepository checklistItemRepository){
        this.checklistItemRepository = checklistItemRepository;
        this.categoryRepository = categoryRepository;
    }

    public CategoryEntity addNewCategory(String name) {

        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("Category name cannot be empty or null");
        }

        CategoryEntity category = new CategoryEntity();
        category.setGuid(UUID.randomUUID().toString());
        category.setName(name);

        log.debug("Adding a new category with name [name = {} ]", name);

        return this.categoryRepository.save(category);
    }

    public CategoryEntity updateCategory(String guid, String name){
        if(guid==null || !StringUtils.hasText(name)){
            throw new IllegalArgumentException("Invalid parameters!");
        }

        CategoryEntity retrivedCategory = this.categoryRepository.findByGuid(guid).orElseThrow(
             () -> new ResourceNotFoundExecption("category not found.")
        );

        retrivedCategory.setName(name);

        log.debug("Category uppdate with sucess!");

        return this.categoryRepository.save(retrivedCategory);
    }



}
