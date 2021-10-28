package com.PrimeiroProjeto.Projeto.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
@Table(indexes = { @Index(name = "IDX_GUID_CK_IT", columnList = "guid")})
public class ChecklistItemEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ChecklistItemId;

    private String Description;

    private boolean IsCompleted;

    private LocalTime deadLine;

    private LocalTime posteDate;

    @ManyToOne
    private CategoryEntity category;
}
