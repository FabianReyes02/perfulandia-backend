package com.perfulandia.usuarioservice.repository;

import com.perfulandia.usuarioservice.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
//importe sus métodos para trabajar un CRUD
//findAll()bo listar
//findById(id)
//Save() guardar
//delete
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
