/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Bhabani
 */
public class OrganBankEnterprise extends Enterprise {
     
    public OrganBankEnterprise(String name){
        super(name,EnterpriseType.OrganBank);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
