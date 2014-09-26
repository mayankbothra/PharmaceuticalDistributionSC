/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Roles.BusinessAdminRole;
import Business.Roles.HospitalPortalRole;
import Business.Roles.TrackingPortalRole;

/**
 *
 * @author Mayank
 */
public class ConfigureABusiness {

    public static Business initialize() {

        Business business = Business.getInstance1();

        addBusinessAdmin(business);
        addNetworks(business);
        addNetworkGovernment(business);
        business.getStaticVariables();
        return business;
    }

    public static void addBusinessAdmin(Business business) {

        Person padmin = business.getPersonDirectory().newPerson();
        Address padminAdd = padmin.getAddress();

        padmin.setFirstName("Mayank");
        padmin.setLastName("Bothra");
        padmin.setAge(Integer.parseInt("24"));
        padmin.setGender("Male");
        padmin.setPhone(Integer.parseInt("00000"));
        padminAdd.setLine1("A");
        padminAdd.setLine2("B");
        padminAdd.setCity("Boston");
        padminAdd.setState("MA");
        padminAdd.setZipCode(Integer.parseInt("02120"));
        padmin.setAddress(padminAdd);

        Employee admin = business.getEmployeeDirectory().newEmployee();
        admin.setPerson(padmin);
        admin.setDesignation("Administrator");

        UserAccount adminUserAccount = business.getUserAccountDirectory().newUserAccount();
        adminUserAccount.setUserName("admin");
        adminUserAccount.setPassword("admin");
        adminUserAccount.setEmployee(admin);
        adminUserAccount.setRole(new BusinessAdminRole());
        
        Person trackingPortal = business.getPersonDirectory().newPerson();
        Address tAdd = trackingPortal.getAddress();

        trackingPortal.setFirstName("Mayank");
        trackingPortal.setLastName("Bothra");
        trackingPortal.setAge(Integer.parseInt("24"));
        trackingPortal.setGender("Male");
        trackingPortal.setPhone(Integer.parseInt("00000"));
        tAdd.setLine1("A");
        tAdd.setLine2("B");
        tAdd.setCity("Boston");
        tAdd.setState("MA");
        tAdd.setZipCode(Integer.parseInt("02120"));
        trackingPortal.setAddress(tAdd);

        Employee tEmployee = business.getEmployeeDirectory().newEmployee();
        tEmployee.setPerson(trackingPortal);
        tEmployee.setDesignation("Public");

        UserAccount tPUA = business.getUserAccountDirectory().newUserAccount();
        tPUA.setUserName("tracking");
        tPUA.setPassword("tracking");
        tPUA.setEmployee(tEmployee);
        tPUA.setRole(new TrackingPortalRole());
        
        
        Person hospitalPortal = business.getPersonDirectory().newPerson();
        Address hAdd = hospitalPortal.getAddress();

        hospitalPortal.setFirstName("Mayank");
        hospitalPortal.setLastName("Bothra");
        hospitalPortal.setAge(Integer.parseInt("24"));
        hospitalPortal.setGender("Male");
        hospitalPortal.setPhone(Integer.parseInt("00000"));
        hAdd.setLine1("A");
        hAdd.setLine2("B");
        hAdd.setCity("Boston");
        hAdd.setState("MA");
        hAdd.setZipCode(Integer.parseInt("02120"));
        hospitalPortal.setAddress(hAdd);

        Employee hEmployee = business.getEmployeeDirectory().newEmployee();
        hEmployee.setPerson(hospitalPortal);
        hEmployee.setDesignation("Public");

        UserAccount hPUA = business.getUserAccountDirectory().newUserAccount();
        hPUA.setUserName("patient");
        hPUA.setPassword("patient");
        hPUA.setEmployee(hEmployee);
        hPUA.setRole(new HospitalPortalRole());
    }

    public static void addNetworks(Business business) {
//        Network china = business.getNetworkDirectory().newNetwork(Network.Name.CHINA);
//        Person chinaPerson = china.getPersonDirectory().newPerson();
//        Address chinaPersonAdd = chinaPerson.getAddress();
//
//        chinaPerson.setFirstName("Rahul");
//        chinaPerson.setLastName("Jain");
//        chinaPerson.setAge(Integer.parseInt("24"));
//        chinaPerson.setGender("Male");
//        chinaPerson.setPhone(Integer.parseInt("00000"));
//        chinaPersonAdd.setLine1("A");
//        chinaPersonAdd.setLine2("B");
//        chinaPersonAdd.setCity("Boston");
//        chinaPersonAdd.setState("MA");
//        chinaPersonAdd.setZipCode(Integer.parseInt("02120"));
//        chinaPerson.setAddress(chinaPersonAdd);
//
//        Employee cAdmin = china.getEmployeeDirectory().newEmployee();
//        cAdmin.setPerson(chinaPerson);
//        cAdmin.setDesignation("Network Admin");
//
//        UserAccount chinaUA = china.getUserAccountDirectory().newUserAccount();
//        chinaUA.setUserName("china");
//        chinaUA.setPassword("china");
//        chinaUA.setEmployee(cAdmin);
//        chinaUA.setRole(new NetworkAdminRole());

//        Enterprise chinaGovernment = china.getEnterpriseDirectory().newEnterprise("China FDA", Enterprise.Type.GOVERNMENT);
//        Person cGovtP = chinaGovernment.getPersonDirectory().newPerson();
//        Address cGovtPAdd = cGovtP.getAddress();
//
//        cGovtP.setFirstName("Mirav");
//        cGovtP.setLastName("Gokani");
//        cGovtP.setAge(Integer.parseInt("24"));
//        cGovtP.setGender("Male");
//        cGovtP.setPhone(Integer.parseInt("00000"));
//        cGovtPAdd.setLine1("A");
//        cGovtPAdd.setLine2("B");
//        cGovtPAdd.setCity("Boston");
//        cGovtPAdd.setState("MA");
//        cGovtPAdd.setZipCode(Integer.parseInt("02120"));
//        cGovtP.setAddress(cGovtPAdd);
//
//        Employee cGovtAdmin = chinaGovernment.getEmployeeDirectory().newEmployee();
//        cGovtAdmin.setPerson(cGovtP);
//        cGovtAdmin.setDesignation("Enterprise Admin");
//
//        UserAccount cGovtUA = chinaGovernment.getUserAccountDirectory().newUserAccount();
//        cGovtUA.setUserName("cgovt");
//        cGovtUA.setPassword("cgovt");
//        cGovtUA.setEmployee(cGovtAdmin);
//        cGovtUA.setRole(new EnterpriseAdminRole());
//
//        Organization licenseManagement = chinaGovernment.getOrganizationDirectory().getSelectedOrganization(Organization.Type.LicenseManagement);
//        Person lmPerson = chinaGovernment.getPersonDirectory().newPerson();
//        Address lmPersonAdd = lmPerson.getAddress();
//
//        lmPerson.setFirstName("Bhavik");
//        lmPerson.setLastName("Gandhi");
//        lmPerson.setAge(Integer.parseInt("24"));
//        lmPerson.setGender("Male");
//        lmPerson.setPhone(Integer.parseInt("00000"));
//        lmPersonAdd.setLine1("A");
//        lmPersonAdd.setLine2("B");
//        lmPersonAdd.setCity("Boston");
//        lmPersonAdd.setState("MA");
//        lmPersonAdd.setZipCode(Integer.parseInt("02120"));
//        lmPerson.setAddress(lmPersonAdd);
//
//        Employee licenseManager = licenseManagement.getEmployeeDirectory().newEmployee();
//        licenseManager.setPerson(lmPerson);
//        licenseManager.setDesignation("License Manager");
//
//        UserAccount lmUA = licenseManagement.getUserAccountDirectory().newUserAccount();
//        lmUA.setUserName("lm1");
//        lmUA.setPassword("lm1");
//        lmUA.setEmployee(licenseManager);
//        lmUA.setRole(new GovernmentFederalLicenseManagerRole());
//        
//        
//        Organization complaintManagement = chinaGovernment.getOrganizationDirectory().getSelectedOrganization(Organization.Type.ComplaintHandling);
//        Person cPerson = chinaGovernment.getPersonDirectory().newPerson();
//        Address cPersonAdd = cPerson.getAddress();
//
//        cPerson.setFirstName("Saket");
//        cPerson.setLastName("Patankar");
//        cPerson.setAge(Integer.parseInt("24"));
//        cPerson.setGender("Male");
//        cPerson.setPhone(Integer.parseInt("00000"));
//        cPersonAdd.setLine1("A");
//        cPersonAdd.setLine2("B");
//        cPersonAdd.setCity("Boston");
//        cPersonAdd.setState("MA");
//        cPersonAdd.setZipCode(Integer.parseInt("02120"));
//        cPerson.setAddress(cPersonAdd);
//
//        Employee cManager = complaintManagement.getEmployeeDirectory().newEmployee();
//        cManager.setPerson(cPerson);
//        cManager.setDesignation("Complaint Manager");
//
//        UserAccount cUA = complaintManagement.getUserAccountDirectory().newUserAccount();
//        cUA.setUserName("c1");
//        cUA.setPassword("c1");
//        cUA.setEmployee(cManager);
//        cUA.setRole(new GovernmentComplaintManagerRole());
//
//        Manufacturer chinaManufacturer = (Manufacturer)china.getEnterpriseDirectory().newEnterprise("Pfizer", Enterprise.Type.MANUFACTURER);
//        Person cManP = chinaManufacturer.getPersonDirectory().newPerson();
//        Address cManPAdd = cManP.getAddress();
//
//        cManP.setFirstName("Dhaval");
//        cManP.setLastName("Doshi");
//        cManP.setAge(Integer.parseInt("24"));
//        cManP.setGender("Male");
//        cManP.setPhone(Integer.parseInt("00000"));
//        cManPAdd.setLine1("A");
//        cManPAdd.setLine2("B");
//        cManPAdd.setCity("Boston");
//        cManPAdd.setState("MA");
//        cManPAdd.setZipCode(Integer.parseInt("02120"));
//        cManP.setAddress(cManPAdd);
//
//        Employee cManAdmin = chinaManufacturer.getEmployeeDirectory().newEmployee();
//        cManAdmin.setPerson(cManP);
//        cManAdmin.setDesignation("Enterprise Admin");
//
//        UserAccount cManUA = chinaManufacturer.getUserAccountDirectory().newUserAccount();
//        cManUA.setUserName("cman");
//        cManUA.setPassword("cman");
//        cManUA.setEmployee(cManAdmin);
//        cManUA.setRole(new EnterpriseAdminRole());
//        
//        Drug drug1 = chinaManufacturer.getDrugCatalog().newDrug();
//        drug1.setDrugId(1);
//        drug1.setDrugName("Crocin");
//        drug1.setDrugId(10000);
//        drug1.setLicenseIssueDate("12/05/2012 20:48:00");
//        drug1.setLicenseExpiryDate("12/04/2013 20:48:00");
//        drug1.setManufacturerName(chinaManufacturer.getEnterpriseName());
//        chinaManufacturer.getDrugCatalog().addDrug(drug1);
//                
//        Batch batch = chinaManufacturer.getBatchDirectory().newBatch();
//        batch.setDrug(drug1);
//        batch.setQuantity(10);
//        batch.setManufacturingDate("12/05/2012 20:48:00");
//        batch.setExpiryDate("06/04/2012 20:48:00");
//        
//        InventoryItem ii = chinaManufacturer.getInventory().newInventoryItem();
//        ii.setQuantity(batch.getQuantity());
//        ii.setDrug(batch.getDrug());
//        
//        for(int i = 0; i < 10; i++) {
//            MedicinePackage mp = ii.newMedicinePackage();
//            mp.setBatch(batch);
//        }
//
//        Organization drugManagement = chinaManufacturer.getOrganizationDirectory().getSelectedOrganization(Organization.Type.DrugManagement);
//        Person dmPerson = chinaManufacturer.getPersonDirectory().newPerson();
//        Address dmPersonAdd = dmPerson.getAddress();
//
//        dmPerson.setFirstName("Rushabh");
//        dmPerson.setLastName("Shah");
//        dmPerson.setAge(Integer.parseInt("24"));
//        dmPerson.setGender("Male");
//        dmPerson.setPhone(Integer.parseInt("00000"));
//        dmPersonAdd.setLine1("A");
//        dmPersonAdd.setLine2("B");
//        dmPersonAdd.setCity("Boston");
//        dmPersonAdd.setState("MA");
//        dmPersonAdd.setZipCode(Integer.parseInt("02120"));
//        dmPerson.setAddress(dmPersonAdd);
//
//        Employee drugManager = drugManagement.getEmployeeDirectory().newEmployee();
//        drugManager.setPerson(dmPerson);
//        drugManager.setDesignation("Drug Manager");
//
//        UserAccount dmUA = drugManagement.getUserAccountDirectory().newUserAccount();
//        dmUA.setUserName("dm1");
//        dmUA.setPassword("dm1");
//        dmUA.setEmployee(drugManager);
//        dmUA.setRole(new ManufacturerDrugManagerRole());
//
//        Organization manufacturerInventoryManagement = chinaManufacturer.getOrganizationDirectory().getSelectedOrganization(Organization.Type.ManufacturerInventoryManagement);
//        Person imPerson = chinaManufacturer.getPersonDirectory().newPerson();
//        Address imPersonAdd = imPerson.getAddress();
//
//        imPerson.setFirstName("Pratik");
//        imPerson.setLastName("Jain");
//        imPerson.setAge(Integer.parseInt("24"));
//        imPerson.setGender("Male");
//        imPerson.setPhone(Integer.parseInt("00000"));
//        imPersonAdd.setLine1("A");
//        imPersonAdd.setLine2("B");
//        imPersonAdd.setCity("Boston");
//        imPersonAdd.setState("MA");
//        imPersonAdd.setZipCode(Integer.parseInt("02120"));
//        imPerson.setAddress(imPersonAdd);
//
//        Employee imManager = manufacturerInventoryManagement.getEmployeeDirectory().newEmployee();
//        imManager.setPerson(imPerson);
//        imManager.setDesignation("Inventory Manager");
//
//        UserAccount imUA = manufacturerInventoryManagement.getUserAccountDirectory().newUserAccount();
//        imUA.setUserName("im1");
//        imUA.setPassword("im1");
//        imUA.setEmployee(imManager);
//        imUA.setRole(new ManufacturerInventoryManagerRole());
//
//        Organization manufacturingManagement = chinaManufacturer.getOrganizationDirectory().getSelectedOrganization(Organization.Type.Manufacturing);
//        Person mPerson = chinaManufacturer.getPersonDirectory().newPerson();
//        Address mPersonAdd = mPerson.getAddress();
//
//        mPerson.setFirstName("Prakash");
//        mPerson.setLastName("Joshi");
//        mPerson.setAge(Integer.parseInt("24"));
//        mPerson.setGender("Male");
//        mPerson.setPhone(Integer.parseInt("00000"));
//        mPersonAdd.setLine1("A");
//        mPersonAdd.setLine2("B");
//        mPersonAdd.setCity("Boston");
//        mPersonAdd.setState("MA");
//        mPersonAdd.setZipCode(Integer.parseInt("02120"));
//        mPerson.setAddress(mPersonAdd);
//
//        Employee mManager = manufacturingManagement.getEmployeeDirectory().newEmployee();
//        mManager.setPerson(mPerson);
//        mManager.setDesignation("Manufacturing Manager");
//
//        UserAccount mUA = manufacturingManagement.getUserAccountDirectory().newUserAccount();
//        mUA.setUserName("m1");
//        mUA.setPassword("m1");
//        mUA.setEmployee(mManager);
//        mUA.setRole(new ManufacturingManagerRole());
//        
//        Organization shipingManagement = chinaManufacturer.getOrganizationDirectory().getSelectedOrganization(Organization.Type.ManufacturerShipping);
//        Person sPerson = chinaManufacturer.getPersonDirectory().newPerson();
//        Address sPersonAdd = sPerson.getAddress();
//
//        sPerson.setFirstName("Karan");
//        sPerson.setLastName("Somani");
//        sPerson.setAge(Integer.parseInt("24"));
//        sPerson.setGender("Male");
//        sPerson.setPhone(Integer.parseInt("00000"));
//        sPersonAdd.setLine1("A");
//        sPersonAdd.setLine2("B");
//        sPersonAdd.setCity("Boston");
//        sPersonAdd.setState("MA");
//        sPersonAdd.setZipCode(Integer.parseInt("02120"));
//        sPerson.setAddress(sPersonAdd);
//
//        Employee sManager = shipingManagement.getEmployeeDirectory().newEmployee();
//        sManager.setPerson(sPerson);
//        sManager.setDesignation("Shipping Manager");
//
//        UserAccount sUA = shipingManagement.getUserAccountDirectory().newUserAccount();
//        sUA.setUserName("sm1");
//        sUA.setPassword("sm1");
//        sUA.setEmployee(sManager);
//        sUA.setRole(new ManufacturingShippmentManagerRole());
//
//        Enterprise chinaWholesaler1 = china.getEnterpriseDirectory().newEnterprise("Wholesaler1", Enterprise.Type.WHOLESALER);
//        Person cWhP = chinaWholesaler1.getPersonDirectory().newPerson();
//        Address cWhPAdd = cWhP.getAddress();
//
//        cWhP.setFirstName("Keyur");
//        cWhP.setLastName("Jain");
//        cWhP.setAge(Integer.parseInt("24"));
//        cWhP.setGender("Male");
//        cWhP.setPhone(Integer.parseInt("00000"));
//        cWhPAdd.setLine1("A");
//        cWhPAdd.setLine2("B");
//        cWhPAdd.setCity("Boston");
//        cWhPAdd.setState("MA");
//        cWhPAdd.setZipCode(Integer.parseInt("02120"));
//        cWhP.setAddress(cWhPAdd);
//
//        Employee cWhAdmin = chinaWholesaler1.getEmployeeDirectory().newEmployee();
//        cWhAdmin.setPerson(cWhP);
//        cWhAdmin.setDesignation("Enterprise Admin");
//
//        UserAccount cWhUA = chinaWholesaler1.getUserAccountDirectory().newUserAccount();
//        cWhUA.setUserName("cwh");
//        cWhUA.setPassword("cwh");
//        cWhUA.setEmployee(cWhAdmin);
//        cWhUA.setRole(new EnterpriseAdminRole());
//
//        Organization wholesalerInventoryManagement = chinaWholesaler1.getOrganizationDirectory().getSelectedOrganization(Organization.Type.WholesalerInventoryManagement);
//        Person imPerson1 = chinaWholesaler1.getPersonDirectory().newPerson();
//        Address imPersonAdd1 = imPerson1.getAddress();
//
//        imPerson1.setFirstName("Ravi");
//        imPerson1.setLastName("Shah");
//        imPerson1.setAge(Integer.parseInt("24"));
//        imPerson1.setGender("Male");
//        imPerson1.setPhone(Integer.parseInt("00000"));
//        imPersonAdd1.setLine1("A");
//        imPersonAdd1.setLine2("B");
//        imPersonAdd1.setCity("Boston");
//        imPersonAdd1.setState("MA");
//        imPersonAdd1.setZipCode(Integer.parseInt("02120"));
//        imPerson1.setAddress(imPersonAdd1);
//
//        Employee imManager1 = wholesalerInventoryManagement.getEmployeeDirectory().newEmployee();
//        imManager1.setPerson(imPerson1);
//        imManager1.setDesignation("Inventory Manager");
//
//        UserAccount imUA1 = wholesalerInventoryManagement.getUserAccountDirectory().newUserAccount();
//        imUA1.setUserName("im2");
//        imUA1.setPassword("im2");
//        imUA1.setEmployee(imManager1);
//        imUA1.setRole(new WholesalerInventoryManagerRole());
//        
//        
//
//        
        Network india = business.getNetworkDirectory().newNetwork(Network.Name.INDIA);
//        Person indiaPerson = india.getPersonDirectory().newPerson();
//        Address indiaPersonAdd = indiaPerson.getAddress();
//
//        indiaPerson.setFirstName("Mayank");
//        indiaPerson.setLastName("Bothra");
//        indiaPerson.setAge(Integer.parseInt("24"));
//        indiaPerson.setGender("Male");
//        indiaPerson.setPhone(Integer.parseInt("00000"));
//        indiaPersonAdd.setLine1("A");
//        indiaPersonAdd.setLine2("B");
//        indiaPersonAdd.setCity("Boston");
//        indiaPersonAdd.setState("MA");
//        indiaPersonAdd.setZipCode(Integer.parseInt("02120"));
//        indiaPerson.setAddress(indiaPersonAdd);
//
//        Employee iAdmin = india.getEmployeeDirectory().newEmployee();
//        iAdmin.setPerson(indiaPerson);
//        iAdmin.setDesignation("Network Admin");
//
//        UserAccount indiaUA = india.getUserAccountDirectory().newUserAccount();
//        indiaUA.setUserName("india");
//        indiaUA.setPassword("india");
//        indiaUA.setEmployee(iAdmin);
//        indiaUA.setRole(new NetworkAdminRole());
//
        Network us = business.getNetworkDirectory().newNetwork(Network.Name.UNITEDSTATES);
//        Person usPerson = us.getPersonDirectory().newPerson();
//        Address usPersonAdd = usPerson.getAddress();
//
//        usPerson.setFirstName("Mayank");
//        usPerson.setLastName("Bothra");
//        usPerson.setAge(Integer.parseInt("24"));
//        usPerson.setGender("Male");
//        usPerson.setPhone(Integer.parseInt("00000"));
//        usPersonAdd.setLine1("A");
//        usPersonAdd.setLine2("B");
//        usPersonAdd.setCity("Boston");
//        usPersonAdd.setState("MA");
//        usPersonAdd.setZipCode(Integer.parseInt("02120"));
//        usPerson.setAddress(usPersonAdd);
//
//        Employee uAdmin = us.getEmployeeDirectory().newEmployee();
//        uAdmin.setPerson(usPerson);
//        uAdmin.setDesignation("Network Admin");
//
//        UserAccount usUA = us.getUserAccountDirectory().newUserAccount();
//        usUA.setUserName("us");
//        usUA.setPassword("us");
//        usUA.setEmployee(uAdmin);
//        usUA.setRole(new NetworkAdminRole());

    }
    public static void addNetworkGovernment(Business business) {
        for (Network n : business.getNetworkDirectory().getNetworkList()) {
            String governmentName = n.getNetworkName() + " FDA";
            n.getEnterpriseDirectory().newEnterprise(governmentName, Enterprise.Type.GOVERNMENT);
        }
    }
}