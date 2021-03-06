package security.business;

import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;


import security.dao.*;
import security.entity.*;
import java.util.*;



/**
 * Classe que representa a camada de negócios de RoleBusiness
 * 
 * @generated
 **/
@Service("RoleBusiness")
public class RoleBusiness {

    /**
     * Instância da classe RoleDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("RoleDAO")
    protected RoleDAO repository;

// CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Role post(final Role entity) throws Exception {
      // begin-user-code  
      // end-user-code  
      repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public Role get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Role result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Role put(final Role entity) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    public Role put(final java.lang.String id,final Role entity) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }


    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }



// CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public List<Role> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    List<Role> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToManyRelation
   */  
  public List<UserRole> findUserRole(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<UserRole> result = repository.findUserRole(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }

  /**
   * @generated modifiable
   * OneToManyRelation
   */  
  public List<Permission> findPermission(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      List<Permission> result = repository.findPermission(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;	  
  }



  /**
   * @generated modifiable
   * ManyToManyRelation
   */  
  public List<User> listUser(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      List<User> result = repository.listUser(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;        	  
  }
  
  /**
   * @generated modifiable
   */    
  public int deleteUser(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteUser(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}
