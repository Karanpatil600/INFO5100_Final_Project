/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.CareerServiceAdminUI;

import SystemModel.EcoSystem;
import SystemModel.Employee.Employee;
import SystemModel.Enterprise.Enterprise;
import SystemModel.Organization.ServiceProviderOrganization;
import SystemModel.Organization.ServiceSeekerOrganization;
//import SystemModel.Organization.NGOOrganization;
import SystemModel.Organization.Organization;
import SystemModel.Organization.CreatorOrganization;
import SystemModel.Role.ServiceProviderAdminRole;
import SystemModel.Role.ServiceSeekerAdminRole;
//import SystemModel.Role.NGOManagerRole;
import SystemModel.Role.Role;
import SystemModel.Role.CreatorAdminRole;
import SystemModel.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sudar
 */
public class ManageUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccount
     */
    private JPanel workArea;
    private Enterprise enterprise;
    
    public ManageUserAccount(JPanel workArea, Enterprise enterprise) {
        initComponents();
        
        this.workArea = workArea;
        this.enterprise = enterprise;
        populateOrganizationJComboBox();
        populateData();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        EmployeeRoleJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        usernameTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        organizationJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setBackground(new java.awt.Color(66, 160, 236));
        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage User Account");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn)
                .addGap(261, 261, 261)
                .addComponent(jLabel1)
                .addContainerGap(411, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jLabel1))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jPanel1.add(EmployeeRoleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 211, 209, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Employee    :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 173, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setText("Password     :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 295, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Employee Role            :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 213, -1, -1));
        jPanel1.add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 293, 207, -1));
        jPanel1.add(usernameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 253, 208, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setText("Username    :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 255, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Organization: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 142, -1, -1));

        jPanel1.add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 171, 209, -1));

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 142, 209, -1));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 142, 482, 621));

        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 333, 207, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backBtnActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeJComboBox(organization);
            populateRoleComboBox(enterprise);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(usernameTxtField.getText().isEmpty()|| passwordTxtField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Any of the above field(s) can't be empty");
        }else{ String userName = usernameTxtField.getText();
            String password = passwordTxtField.getText();
            if(EcoSystem.checkIfUsernameIsUnique(userName)){
                Organization organization = (Organization) organizationJComboBox.getSelectedItem();
                Employee employee = (Employee) employeeJComboBox.getSelectedItem();
                Role role = (Role) EmployeeRoleJComboBox.getSelectedItem();

                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

                populateData();
                usernameTxtField.setText("");
                passwordTxtField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,  "Enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }}
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EmployeeRoleJComboBox;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables

    private void populateOrganizationJComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    private void populateData() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[3];
                row[0] = ua;
                row[0] = ua.getPassword();
                row[1] = ua.getRole();
                ((DefaultTableModel) userTable.getModel()).addRow(row);
            }
        }
    }
    
    public void populateEmployeeJComboBox(Organization organization) {
        employeeJComboBox.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    private void populateRoleComboBox(Enterprise e) {
        EmployeeRoleJComboBox.removeAllItems();

        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization instanceof ServiceProviderOrganization) {
            EmployeeRoleJComboBox.addItem(new ServiceProviderAdminRole());
        } 
        else if (organization instanceof ServiceSeekerOrganization) {
            EmployeeRoleJComboBox.addItem(new ServiceSeekerAdminRole());
        } 
        else if (organization instanceof CreatorOrganization) {
            EmployeeRoleJComboBox.addItem(new CreatorAdminRole());
        } /*
        else if (organization instanceof NGOOrganization) {
            EmployeeRoleJComboBox.addItem(new NGOManagerRole());
        }*/

    }
}
