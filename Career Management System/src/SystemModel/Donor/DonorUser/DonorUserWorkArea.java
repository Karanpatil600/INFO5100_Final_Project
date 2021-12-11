/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModel.Donor.DonorUser;
import SystemModel.ServiceProvider.ServiceProvider;
import SystemModel.EcoSystem;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.DonorServiceOrganization;
import SystemModel.Organization.ServiceProviderOrganization;
import SystemModel.Organization.ServiceSeekerOrganization;
import SystemModel.Organization.Organization;
import SystemModel.Organization.CreatorOrganization;
import SystemModel.Donor.Donor;
import SystemModel.Supplier.Supplier;
import SystemModel.Supplier.Supply;

import SystemModel.UserAccount.UserAccount;
import SystemModel.Creator.Creator;
import SystemModel.WorkQueue.DonationWorkReq;
import SystemModel.WorkQueue.WorkQueue;
import SystemModel.WorkQueue.WorkReq;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author adhar
 */
public class DonorUserWorkArea extends javax.swing.JPanel {
    private JPanel workArea;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise Enterprise;
    private EcoSystem ESystem;
    private Supplier s;
    Donor d;
    /**
     * Creates new form DonorUserWorkArea
     */
    public DonorUserWorkArea(JPanel workArea,UserAccount UserAccount,Organization org,Enterprise Enterprise,EcoSystem ESystem) {
        initComponents();
        this.workArea=workArea;
        this.UserAccount=UserAccount;
        this.org=org;
        this.Enterprise=Enterprise;
        this.ESystem=ESystem;
         
        /*
         for (Donor donor:((DonorOrganization)org).getDonorList().getDonorList())
        {
            if (UserAccount.getEmployee().getEmpname().equals(donor.getDonorName())) {
                 d=donor;
                 
                System.out.println("Donor Name" + d.getDonorName());
            }
            
        }*/
        /*
    
    System.out.println("busi" + ESystem.getWorkQueue().getWorkRequestList().size());
        if(d.getWorkQueue()== null){
            WorkQueue w = new WorkQueue();
            d.setWorkQueue(w);
            
        }*/
        
        //populateCreateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        createJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Donor User Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel1)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        createJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Requirement", "Quantity", "Status", "Donor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(createJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 118, 746, 215));

        jButton1.setText("Complete Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 340, 746, 41));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = createJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please first select a row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
           
             DonationWorkReq ds = (DonationWorkReq) createJTable.getValueAt(selectedRow, 3);

            ds.setStatus("Completed & Available in Stock");
            ds.setReciever(UserAccount);
            populateCreateTable();
       /*  
       DefaultTableModel model = (DefaultTableModel) createJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : ESystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof DonationWorkReq){ 
            Object[] row = new Object[10];
            row[0] = ((DonationWorkReq) work).getRequestType();
            row[1] = ((DonationWorkReq) work).getRequirements();
          
            row[2] = ((DonationWorkReq) work).getQuantity();
            row[3] = work;
            
            
            model.addRow(row);
           }
        }*/
        }
    }//GEN-LAST:event_jButton1ActionPerformed
/**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable createJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void populateCreateTable() {
   
      DefaultTableModel model = (DefaultTableModel) createJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkReq work : ESystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof DonationWorkReq){ 
            Object[] row = new Object[10];
            row[0] = ((DonationWorkReq) work).getRequestType();
            row[1] = ((DonationWorkReq) work).getRequirements();
          
            row[2] = ((DonationWorkReq) work).getQuantity();
            row[3] = work;
            row[4] = work.getReciever();
            
            
            model.addRow(row);
           }
        }}  
    
}
