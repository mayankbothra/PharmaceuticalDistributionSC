/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprises.Enterprise;
import Business.Organizations.Organization;
import Business.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class NetworkDirectory {

    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<>();
    }

    public Network newNetwork(Network.Name networkName) {
        Network network = null;

        if (networkName == Network.Name.CHINA) {
            network = new China(networkName.toString());
        } else if (networkName == Network.Name.INDIA) {
            network = new India(networkName.toString());
        } else if (networkName == Network.Name.UNITEDSTATES) {
            network = new UnitedStates(networkName.toString());
        }

        if (network != null) {
            networkList.add(network);
        }
        return network;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network getMyNetwork(UserAccount userAccount) {
        for (Network n : getNetworkList()) {
            if (n.getUserAccountDirectory().isUserExist(userAccount)) {
                return n;
            }

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getUserAccountDirectory().isUserExist(userAccount)) {
                    return n;
                }

                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    if (org.getUserAccountDirectory().isUserExist(userAccount)) {
                        return n;
                    }
                }
            }
        }
        return null;
    }
}
