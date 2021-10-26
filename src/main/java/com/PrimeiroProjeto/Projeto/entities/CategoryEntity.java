package com.PrimeiroProjeto.Projeto.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity extends BaseEntity{

    private Long CategoryId;
    private String name;

    private List<ChecklistItemEntity> checklistItems;

}
