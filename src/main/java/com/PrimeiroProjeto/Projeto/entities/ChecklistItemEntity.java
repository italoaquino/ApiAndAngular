package com.PrimeiroProjeto.Projeto.entities;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChecklistItemEntity extends BaseEntity{

    private Long ChecklistItemId;

    private String Description;

    private boolean IsCompleted;

    private LocalTime deadLine;

    private LocalTime posteDate;

    private CategoryEntity category;
}
