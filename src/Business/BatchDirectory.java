/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class BatchDirectory {
    
    private ArrayList<Batch> batchList;
    
    public BatchDirectory() {
        batchList = new ArrayList<>();
    }

    public ArrayList<Batch> getBatchList() {
        return batchList;
    }

    public void setBatchList(ArrayList<Batch> batchList) {
        this.batchList = batchList;
    }
    
    public Batch newBatch() {
        Batch batch = new Batch();
        batchList.add(batch);
        return batch;
    }
    
}
