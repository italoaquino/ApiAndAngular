package com.PrimeiroProjeto.Projeto.service;

import com.PrimeiroProjeto.Projeto.entity.CategoryEntity;
import com.PrimeiroProjeto.Projeto.repository.CategoryRepository;
import com.PrimeiroProjeto.Projeto.repository.ChecklistItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;

@Service
@Slf4j
public class ChecklistItemService {


    private CategoryRepository categoryRepository;
    private ChecklistItemRepository checklistItemRepository;

    public ChecklistItemService(CategoryRepository categoryRepository, ChecklistItemRepository checklistItemRepository){
        this.checklistItemRepository = checklistItemRepository;
        this.categoryRepository = categoryRepository;
    }

    public void validateChecklistItemDate(String description, Boolean isCompleted, LocalDate deadLine, LocalDate postDate, CategoryEntity category){
        if(!StringUtils.hasText(description)){
            throw new IllegalArgumentException("description cannot be null");
        }
        if(isCompleted == null){
            throw new IllegalArgumentException("Checklist item must have a flag indicating if it is completed or not");
        }

        if(deadLine==null){
            throw new IllegalArgumentException("Checklist item must have a deadline");
        }

    }

    public CategoryEntity addNewCategory(String description, Boolean isCompleted, LocalDate deadLine, LocalDate postDate, CategoryEntity category){

    }



}
