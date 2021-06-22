package com.jbs.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbs.entity.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

}
