/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprises.Enterprise;
import Business.Enterprises.EnterpriseDirectory;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public abstract class Network extends Enterprise {
    
    public static enum Name {
        
        UNITEDSTATES {
            @Override
            public String toString() {
                return "United States";
            }
        },
        INDIA {
            @Override
            public String toString() {
                return "India";
            }
        },
        CHINA {
            @Override
            public String toString() {
                return "China";
            }
        };
    }
    private EnterpriseDirectory enterpriseDirectory;
    private String networkName;
    
    public Network(String networkName) {
        super("Admin", "Admin");
        enterpriseDirectory = new EnterpriseDirectory();
        this.networkName = networkName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        return roles;
    }
}
