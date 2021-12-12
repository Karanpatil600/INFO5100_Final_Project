/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.ServiceProvider.ServiceProviderUser;


import SystemModel.ServiceProvider.ServiceProvider;
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.ServiceProviderOrganization;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemModel.WorkFlow.ServiceSeekerWorkReqest;
import SystemModel.WorkFlow.WorkRequestList;
import SystemModel.WorkFlow.WorkRequest;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sudar
 */
public class ServiceProviderUserWorkArea extends javax.swing.JPanel {

    private JPanel workArea;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise Enterprise;
    private EcoSystem ESystem;
    ServiceProvider sp;
    /**
     * Creates new form ServiceProviderUserWorkArea
     */
    public ServiceProviderUserWorkArea(JPanel workArea,UserAccount UserAccount,Organization org,Enterprise Enterprise,EcoSystem ESystem) {
        initComponents();
        this.workArea=workArea;
        this.UserAccount=UserAccount;
        this.org=org;
        this.Enterprise=Enterprise;
        this.ESystem=ESystem;
        completeWorkBtn.setEnabled(false);
        
        for (ServiceProvider serviceProvider : ((ServiceProviderOrganization)org).getServiceproviderlist().getServiceProviderDirectory()) {
            if (UserAccount.getEmployee().getEmpolyeeName().equals(serviceProvider.getName())) {
                 sp=serviceProvider;
                System.out.println("ServiceProvider User Name" + sp.getName());
            }
        }
        System.out.println("busi" + ESystem.getWorkRequestList().getWorkRequestList().size());
        if (sp.getWorkRequestList()== null) {
            WorkRequestList w = new WorkRequestList();
            sp.setWorkRequestList(w);
        }
        
       
        populateWorkQueueTable();
    }
    
     public void populateWorkQueueTable(){
         DefaultTableModel model = (DefaultTableModel) WorkReqJTable.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : ESystem.getWorkRequestList().getWorkRequestList()){
           if(work instanceof ServiceSeekerWorkReqest){ 
            Object[] row = new Object[10];
            row[0] = work.getSender().getEmployee().getEmpolyeeName();
            row[1] = work.getSubject();
            row[2] = ((ServiceSeekerWorkReqest) work).getDescription();
            row[3] = ((ServiceSeekerWorkReqest) work).getLocation();
            row[4] = work.getDateOfRequest();
            row[5] = work;
            row[6] = work.getReciever();
            
            model.addRow(row);
           }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        WorkReqJTable = new javax.swing.JTable();
        assignWorkBtn = new javax.swing.JButton();
        completeWorkBtn = new javax.swing.JButton();
        reqNGOBtn = new javax.swing.JButton();
        reqDocBtn = new javax.swing.JButton();
        locationTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTxt = new javax.swing.JTextArea();
        subjectTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Service Provider User Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabel1)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 994, -1));

        WorkReqJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Subject", "Description", "Location", "Date", "Status", "Service Provider"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(WorkReqJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, 970, 214));

        assignWorkBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        assignWorkBtn.setText("ASSIGN TO ME");
        assignWorkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignWorkBtnActionPerformed(evt);
            }
        });
        add(assignWorkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 372, 152, 35));

        completeWorkBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        completeWorkBtn.setText("COMPLETE");
        completeWorkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeWorkBtnActionPerformed(evt);
            }
        });
        add(completeWorkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 371, 221, 36));

        reqNGOBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        reqNGOBtn.setText("FORWARD REQUEST TO GCO");
        reqNGOBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqNGOBtnActionPerformed(evt);
            }
        });
        add(reqNGOBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 371, 316, 36));

        reqDocBtn.setText("FORWARD REQUEST TO VENTURE BELT");
        reqDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqDocBtnActionPerformed(evt);
            }
        });
        add(reqDocBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 372, -1, 36));
        add(locationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 557, 221, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Location    :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 559, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Description:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 479, -1, -1));

        descriptionTxt.setColumns(20);
        descriptionTxt.setRows(5);
        jScrollPane2.setViewportView(descriptionTxt);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 479, 221, 71));
        add(subjectTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 433, 221, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Subject: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 435, -1, -1));

        viewBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        viewBtn.setText("VIEW");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 426, 141, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void assignWorkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignWorkBtnActionPerformed
        int selectedRow = WorkReqJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please first select a row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            ServiceSeekerWorkReqest cswr = (ServiceSeekerWorkReqest) WorkReqJTable.getValueAt(selectedRow, 5);
           if(cswr.getSubject().equalsIgnoreCase("Funding")){
               JOptionPane.showMessageDialog(null, "Sorry this request can't be completed by you as it comes under Venture Belt domain, Kindly Forward this request to Venture Belt", "Warning", JOptionPane.WARNING_MESSAGE);
           }
           else
           {
            cswr.setStatus("Pending");
            cswr.setReciever(UserAccount);

            populateWorkQueueTable();
            completeWorkBtn.setEnabled(true);
           }

        }
    }//GEN-LAST:event_assignWorkBtnActionPerformed

    private void completeWorkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeWorkBtnActionPerformed
        int selectedRow = WorkReqJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please first select a row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            ServiceSeekerWorkReqest hs = (ServiceSeekerWorkReqest) WorkReqJTable.getValueAt(selectedRow, 5);
            if (hs.getSubject().equalsIgnoreCase("Funding")) {
                JOptionPane.showMessageDialog(null, "Sorry this request can't be completed by you as it comes under Venture Belt domain, Kindly Forward this request to Venture Capital", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                hs.setStatus("Complete");
                JOptionPane.showMessageDialog(null, "The request has been completed successfully");
                populateWorkQueueTable();
                completeWorkBtn.setEnabled(false);
            }

        }
    }//GEN-LAST:event_completeWorkBtnActionPerformed

    private void reqNGOBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqNGOBtnActionPerformed
        int selectedRow = WorkReqJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please request to forward to the Global Community", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            ServiceSeekerWorkReqest hswr = (ServiceSeekerWorkReqest) WorkReqJTable.getValueAt(selectedRow, 5);
            if (hswr.getSubject().equalsIgnoreCase("Funding")) {
                JOptionPane.showMessageDialog(null, "Sorry this request can't be forwarded to NGO as it comes under Hospital domain, Kindly Forward this request to Doctor", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                hswr.setStatus("Assigned To GC");
                populateWorkQueueTable();
            }

        }

    }//GEN-LAST:event_reqNGOBtnActionPerformed

    private void reqDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqDocBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = WorkReqJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please request to forward to the Doctor", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            ServiceSeekerWorkReqest hswr = (ServiceSeekerWorkReqest) WorkReqJTable.getValueAt(selectedRow, 5);
             if(hswr.getSubject().equalsIgnoreCase("Funding")){
            hswr.setStatus("Assigned To VC");
            populateWorkQueueTable();
             }
             else{
                 JOptionPane.showMessageDialog(null, "Sorry this request can't be processed to VC", "Warning", JOptionPane.WARNING_MESSAGE);
             }

        }
        
    }//GEN-LAST:event_reqDocBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = WorkReqJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            ServiceSeekerWorkReqest p = (ServiceSeekerWorkReqest) WorkReqJTable.getValueAt(selectedRow, 5);
            subjectTxt.setText(p.getSubject());
            descriptionTxt.setText(p.getDescription());
            locationTxt.setText(p.getLocation());
        }

    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable WorkReqJTable;
    private javax.swing.JButton assignWorkBtn;
    private javax.swing.JButton completeWorkBtn;
    private javax.swing.JTextArea descriptionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JButton reqDocBtn;
    private javax.swing.JButton reqNGOBtn;
    private javax.swing.JTextField subjectTxt;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
