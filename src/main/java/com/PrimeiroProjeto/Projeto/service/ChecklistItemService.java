package com.PrimeiroProjeto.Projeto.service;

import com.PrimeiroProjeto.Projeto.entity.CategoryEntity;
import com.PrimeiroProjeto.Projeto.repository.CategoryRepository;
import com.PrimeiroProjeto.Projeto.repository.ChecklistItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChecklistItemService {

    private CategoryRepository categoryRepository;
    private ChecklistItemRepository checklistItemRepository;

    public ChecklistItemService(CategoryRepository categoryRepository, ChecklistItemRepository checklistItemRepository){
        this.checklistItemRepository = checklistItemRepository;
        this.categoryRepository = categoryRepository;
    }



}
