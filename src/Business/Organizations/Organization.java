/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.EmployeeDirectory;
import Business.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;

/**
 *
 * @author Mayank
 */
public abstract class Organization {

    public static enum Type {

        Admin {
            @Override
            public String toString() {
                return "Adminstration";
            }
        },
        ManufacturerInventoryManagement {
            @Override
            public String toString() {
                return "Inventory Management";
            }
        },
        WholesalerInventoryManagement {
            @Override
            public String toString() {
                return "Inventory Management";
            }
        },
        HospitalInventoryManagement {
            @Override
            public String toString() {
                return "Inventory Management";
            }
        },
        LicenseManagement {
            @Override
            public String toString() {
                return "Federal Licensing Department";
            }
        },
        StateLevel {
            @Override
            public String toString() {
                return "State Licensing Department";
            }
        },
        DrugLicensing {
            @Override
            public String toString() {
                return "Drug Licensing Department";
            }
        },
        DrugManagement {
            @Override
            public String toString() {
                return "Drug Management Department";
            }
        },
        Manufacturing {
            @Override
            public String toString() {
                return "Manufacturing Department";
            }
        },
        ComplaintHandling {
            @Override
            public String toString() {
                return "Complaint Department";
            }
        },
        HospitalPharmacy {
            @Override
            public String toString() {
                return "Pharmacy Department";
            }
        },
        HospitalDoctor {
            @Override
            public String toString() {
                return "Doctor Department";
            }
        },
         HospitalPortal {
            @Override
            public String toString() {
                return "General Department";
            }
        },
         TrackingPortal {
            @Override
            public String toString() {
                return "General Department";
            }
        },
        ManufacturerShipping {
            @Override
            public String toString() {
                return "Shipping Department";
            }
        },
        SeniorManager {
            @Override
            public String toString() {
                return "Senior Manager";
            }
        },
        WholesalerShipping {
            @Override
            public String toString() {
                return "Shipping Department";
            }
        };
    }
    private String organizationName;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private WorkQueue sentWorkQueue;

    public Organization(String organizationName) {
        this.organizationName = organizationName;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
        sentWorkQueue = new WorkQueue();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public WorkQueue getSentWorkQueue() {
        return sentWorkQueue;
    }

    @Override
    public String toString() {
        return organizationName;
    }
}
