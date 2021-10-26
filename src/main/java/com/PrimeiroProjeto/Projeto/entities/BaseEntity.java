package com.PrimeiroProjeto.Projeto.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.websocket.server.ServerEndpoint;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    private String guid;
}
