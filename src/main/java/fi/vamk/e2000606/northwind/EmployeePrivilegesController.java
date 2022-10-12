package fi.vamk.e2000606.northwind;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePrivilegesController {
    @Autowired
    private EmployeePrivilegesRepository repository;

    //Try: http://localhost:8080/employee-privilege/employeeId?employeeId=2
    @GetMapping("/employee-privilege/employeeId")
    public ResponseEntity<List<EmployeePrivileges>> getEmployeePrivilegeByEmployeeId(@RequestParam Integer employeeId) {
		return new ResponseEntity<List<EmployeePrivileges>>(repository.findByEmployeeId(employeeId), HttpStatus.OK);
	}

    //Try: http://localhost:8080/employee-privilege/privilegeId?privilegeId=2
    @GetMapping("/employee-privilege/privilegeId")
    public ResponseEntity<List<EmployeePrivileges>> getEmployeePrivilegeByPrivilegeId(@RequestParam Integer privilegeId) {
		return new ResponseEntity<List<EmployeePrivileges>>(repository.findByPrivilegeId(privilegeId), HttpStatus.OK);
	}

    @GetMapping("/employee-privileges")
    public Iterable<EmployeePrivileges> getEmployeePrivileges(){
        return repository.findAll();
    }
    
    @PostMapping("/employee-privilege")
    public EmployeePrivileges save(@RequestBody EmployeePrivileges employee_privilege){
        return repository.save(employee_privilege);
    }

    @PutMapping("/employee-privilege")
    public EmployeePrivileges update(@RequestBody EmployeePrivileges employee_privilege){
        return repository.save(employee_privilege);
    }

    @DeleteMapping("/employee-privilege")
    public void delete(@RequestBody EmployeePrivileges employee_privilege){
        repository.delete(employee_privilege);
    }
    
}