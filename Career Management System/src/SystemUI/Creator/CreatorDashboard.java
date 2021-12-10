/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SystemUI.Creator;
import SystemModel.EcoSystem;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.Organization.CreatorOrganization;
import SystemModel.UserAccount.UserAccount;
import SystemModel.Creator.Creator;
import SystemModel.Creator.CreatorDirectory;
//import SystemModel.WorkQueue.NGOWorkReq;
//import SystemModel.WorkQueue.WorkQueue;
//import SystemModel.WorkQueue.WorkReq;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sudar
 */
public class CreatorDashboard extends javax.swing.JPanel {

    /** Creates new form CreatorDashboard */
    
    private JPanel workArea;
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise enterprise;
    private EcoSystem ESystem;
    private Creator c;
    public CreatorDashboard(JPanel downJPanel,UserAccount UserAccount,Organization org,Enterprise enterprise,EcoSystem ESystem) {
        initComponents();
        this.workArea=downJPanel;
        this.UserAccount=UserAccount;
        this.org=org;
        this.enterprise=enterprise;
        this.ESystem=ESystem;
        
        for (Creator creator:((CreatorOrganization)org).getCreatorList().getCreatorrList())
        {
            if (UserAccount.getEmployee().getEmpname().equals(creator.getCreatorName())) {
                 c = creator;
                 
                System.out.println("Volunteer Name" + c.getCreatorName());
            }
            
        }
    
    
        /*if(v.getWorkqueue()== null){
            WorkQueue w = new WorkQueue();
            v.setWorkqueue(w);
            
        }*/
        
        
        populateEventTable();
    }
    
    public void populateEventTable()
    {
         //DefaultTableModel model = (DefaultTableModel) ngoeventTbl.getModel();
        
        //model.setRowCount(0);
        /*
        
        for (WorkReq work : ESystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOWorkReq){ 
          // if((work.getStatus().equals("Not Joined"))){
            Object[] row = new Object[10];
            row[0] = ((NGOWorkReq) work).getTitle();
            row[1] = ((NGOWorkReq) work).getDescription();
            row[2] =  work.getDateOfRequest();
            row[3] = ((NGOWorkReq) work).getLocation();
            row[4] = ((NGOWorkReq) work).getVolunteerRequired();
            row[5] =  ((NGOWorkReq) work).getVolunteerAcquired();
            row[6] = work;
          //  row[7] = work.getStatus();
            
            model.addRow(row);
           }
           */
        
    }
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngoeventTbl = new javax.swing.JTable();
        vRequiredTxt = new javax.swing.JTextField();
        dateTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        titleTxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        descTxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        joinBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Volunteer Dashboard");

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(378, 378, 378))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ngoeventTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Title", "Description", "Date", "Location", "Volunteers Required", "Volunteers acquired", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ngoeventTbl);
        if (ngoeventTbl.getColumnModel().getColumnCount() > 0) {
            ngoeventTbl.getColumnModel().getColumn(6).setMinWidth(0);
            ngoeventTbl.getColumnModel().getColumn(6).setPreferredWidth(0);
            ngoeventTbl.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 174, 970, 265));
        add(vRequiredTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 619, 241, 25));
        add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 584, 241, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Event Title                : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 461, 152, -1));

        viewBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 457, 135, -1));
        add(titleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 459, 241, -1));

        descTxt.setColumns(20);
        descTxt.setRows(5);
        jScrollPane3.setViewportView(descTxt);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 489, 241, 53));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Description              : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 489, 152, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Location                  : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 551, 152, -1));
        add(locationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 549, 241, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Date                        :     ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 586, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel7.setText("Volunteers Required: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 622, 152, -1));

        joinBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        joinBtn.setText("Join this event");
        joinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinBtnActionPerformed(evt);
            }
        });
        add(joinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 457, 137, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

    }//GEN-LAST:event_backBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
       /* int selectedRow = ngoeventTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            NGOWorkReq p = (NGOWorkReq) ngoeventTbl.getValueAt(selectedRow, 6);
            titleTxt.setText(p.getTitle());
            descTxt.setText(p.getDescription());
            locationTxt.setText(p.getLocation());
            dateTxt.setText(p.getDateOfRequest().toString());
            vRequiredTxt.setText(String.valueOf(p.getVolunteerRequired()));
        }*/
    }//GEN-LAST:event_viewBtnActionPerformed

    private void joinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinBtnActionPerformed
        /*int selectedRow = ngoeventTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
        NGOWorkReq p = (NGOWorkReq) ngoeventTbl.getValueAt(selectedRow, 6);
      //  if(p.getVolunteer().getVolunteerName()==null){
        // p.setStatus("Joined");
        p.setVolunteerRequired(p.getVolunteerRequired()-1);
        p.setVolunteerAcquired(p.getVolunteerAcquired()+1);
        p.setVolunteer(v);
        //ngoeventTbl.setEditingRow(false);
        
        
        
       // }
       // else{
            JOptionPane.showMessageDialog(null, "You Successfully registered for an Event! \n The number of volunteers acquired so far for this event are "+p.getVolunteerAcquired()+"\n The number of volunteers now required for this event are"+p.getVolunteerRequired());
            DefaultTableModel model = (DefaultTableModel) ngoeventTbl.getModel();
            model.removeRow(ngoeventTbl.getSelectedRow());
       // }
       
       
        
       // populateEventTable();
       
        
        //joinBtn.setEnabled(false);
        }*/
    }//GEN-LAST:event_joinBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextArea descTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton joinBtn;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTable ngoeventTbl;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JTextField vRequiredTxt;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

}