/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.Creator;
import SystemModel.Employee.Employee;
import SystemModel.Organization.Organization;
import SystemModel.Organization.OrganizationDirectory;
import SystemModel.Organization.CreatorOrganization;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sudar
 */
public class ManagementEmployee extends javax.swing.JPanel {
     private OrganizationDirectory organizationDirectory;
     private JPanel workArea;
    /**
     * Creates new form ManageEmployee
     */
    public ManagementEmployee(JPanel downJPanel, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.workArea = downJPanel;
        this.organizationDirectory = organizationDirectory; 
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
        
    }
    
    public void populateOrganizationComboBox(){
        orgComboBox.removeAllItems();
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            if(organization instanceof CreatorOrganization)
            orgComboBox.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        orgselectComboBox.removeAllItems();
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            if(organization instanceof CreatorOrganization)
            orgselectComboBox.addItem(organization);
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) empTbl.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[2] = employee.getId();
            row[0] = employee.getEmpolyeeName();
            row[1] = organization.getOrganizationName();
            model.addRow(row);
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
        jLabel3 = new javax.swing.JLabel();
        orgselectComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTbl = new javax.swing.JTable();
        orgComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setBackground(new java.awt.Color(66, 160, 236));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Manage Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel1)
                .addContainerGap(423, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Organization : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        orgselectComboBox.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        add(orgselectComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 251, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Employee Name :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 180, -1));

        nameTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTxtKeyTyped(evt);
            }
        });
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 251, -1));

        addBtn.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 90, 30));

        empTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(empTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 516, 140));

        orgComboBox.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        orgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboBoxActionPerformed(evt);
            }
        });
        add(orgComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 251, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Organization : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        backBtn.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 88, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_nameTxtKeyTyped

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(nameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Name text field can't be empty");
        }
        else{

            Organization organization =(Organization) orgselectComboBox.getSelectedItem();
            String name = nameTxt.getText();

            organization.getEmployeeDirectory().createEmployee(name);

            populateTable(organization);
            nameTxt.setText(" ");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void orgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboBoxActionPerformed
        Organization organization = (Organization)orgComboBox.getSelectedItem();

        if (organization != null){
            populateTable(organization);

        }
    }//GEN-LAST:event_orgComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable empTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JComboBox orgselectComboBox;
    // End of variables declaration//GEN-END:variables
}

