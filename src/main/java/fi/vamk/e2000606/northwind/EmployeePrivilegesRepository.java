package fi.vamk.e2000606.northwind;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePrivilegesRepository extends JpaRepository<EmployeePrivileges, Integer> {

    List<EmployeePrivileges> findByEmployeeId(Integer employeeId);
    List<EmployeePrivileges> findByPrivilegeId(Integer privilegeId);
    
}
