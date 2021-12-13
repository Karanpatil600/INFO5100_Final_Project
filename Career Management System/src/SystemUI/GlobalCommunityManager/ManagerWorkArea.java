/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemUI.GlobalCommunityManager;
import SystemModel.EcoSystem;
import SystemModel.EnterpriseManagement.Enterprise;
import SystemModel.Organization.Organization;
import SystemModel.UserAccount.UserAccount;
import SystemModel.WorkFlow.ServiceSeekerWorkReqest;
import SystemModel.WorkFlow.GCOWorkRequest;
import SystemModel.WorkFlow.WorkRequest;
//import com.sun.glass.events.KeyEvent;

import java.awt.event.KeyEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author Karan
 */
public class ManagerWorkArea extends javax.swing.JPanel {
    private JPanel workArea; 
    private UserAccount UserAccount;
    private Organization org;
    private Enterprise enterprise;
    private EcoSystem ESystem;
    private Date d;
    private SimpleDateFormat s;
    /**
     * Creates new form ManagerWorkArea
     */
    public ManagerWorkArea(JPanel workArea, UserAccount UserAccount, Organization org, Enterprise enterprise, EcoSystem ESystem) {
        initComponents();
        this.workArea=workArea;
        this.UserAccount=UserAccount;
        this.org=org;
        this.enterprise=enterprise;
        this.ESystem=ESystem;
        completeBtn.setEnabled(false);
        d = new Date();
        s = new SimpleDateFormat("MM/dd/YY");
        populateEventTable();
        populateWorkQueueTable();
        
    }
    
    
    public void populateEventTable()
    {
         DefaultTableModel model = (DefaultTableModel) gcEventTbl.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : org.getWorkRequestList().getWorkRequestList()){
           if(work instanceof GCOWorkRequest){ 
            Object[] row = new Object[10];
            row[0] = ((GCOWorkRequest) work).getTitle();
            row[1] = ((GCOWorkRequest) work).getDescription();
            row[2] =  work.getDateOfRequest();
            row[3] = ((GCOWorkRequest) work).getLocation();
            row[4] = ((GCOWorkRequest) work).getCreatorRequired();
            row[5] = ((GCOWorkRequest) work).getCreatorAcquired();
           // row[6] = work;
            
            model.addRow(row);
           }
        } 
    }
    
    public void populateWorkQueueTable(){
        
        DefaultTableModel model = (DefaultTableModel) requestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest work : ESystem.getWorkRequestList().getWorkRequestList()) {
            if (work instanceof ServiceSeekerWorkReqest) {
                if ((work.getStatus().equalsIgnoreCase("Assigned To GC")) || (work.getStatus().equalsIgnoreCase("GC ASSIGNED the Request"))) {

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
        gcEventTbl = new javax.swing.JTable();
        requestBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        vRequiredTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        titleTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descTxt = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        completeBtn = new javax.swing.JButton();
        AssignTomeBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        requestJTable = new javax.swing.JTable();
        volunteerBtn = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.cyan);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Global Community Manager Dashboard");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel1)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        gcEventTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Title", "Description", "Date", "Location", "Creators Required", "Creators acquired"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(gcEventTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 920, 133));

        requestBtn.setBackground(java.awt.Color.gray);
        requestBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        requestBtn.setText("Request for Supplies");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 190, 36));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setText("Creators Required : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));
        add(vRequiredTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 217, 25));

        createBtn.setBackground(java.awt.Color.gray);
        createBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        createBtn.setText("Create Event");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 190, 40));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setText("Date :     ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("Location : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 80, -1));
        add(locationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 217, -1));
        add(titleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 168, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Event Title : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 100, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel8.setText("CREATE EVENT: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 140, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("Description : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        descTxt.setColumns(20);
        descTxt.setRows(5);
        jScrollPane3.setViewportView(descTxt);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 170, 50));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setText("PENDING REQUESTS:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        completeBtn.setBackground(java.awt.Color.gray);
        completeBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        completeBtn.setText("Complete");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });
        add(completeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, 155, 38));

        AssignTomeBtn.setBackground(java.awt.Color.gray);
        AssignTomeBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        AssignTomeBtn.setText("Assign to Me");
        AssignTomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignTomeBtnActionPerformed(evt);
            }
        });
        add(AssignTomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 160, 38));

        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(requestJTable);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 930, 91));

        volunteerBtn.setBackground(java.awt.Color.gray);
        volunteerBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        volunteerBtn.setText(" Creator Analysis");
        volunteerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volunteerBtnActionPerformed(evt);
            }
        });
        add(volunteerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 190, 36));
        add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 217, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        SupplyRequest sr = new SupplyRequest(workArea,UserAccount,org, enterprise,ESystem);
        workArea.add("ManageEmployee", sr);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_requestBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        try{
            if(titleTxt.getText().isEmpty() || descTxt.getText().isEmpty() || locationTxt.getText().isEmpty() || vRequiredTxt.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Text Field(s) can't be empty");
            }else{

                String event = titleTxt.getText();
                String desp = descTxt.getText();
                String location = locationTxt.getText();
                //Date date = dateChooser.getDate();
                int req = Integer.parseInt(vRequiredTxt.getText());

                if (event.equals("") || event.isEmpty() && desp.equals("") || desp.isEmpty() && location.equals("") || location.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter valid request");
                    return;
                }

                GCOWorkRequest request = new GCOWorkRequest();
                request.setTitle(event);
                request.setDescription(desp);
                request.setLocation(location);
                request.setCreatorRequired(req);
                request.setStatus("Not Joined");
                
                //request.setDateOfRequest(date);

                
                org.getWorkRequestList().getWorkRequestList().add(request);
                UserAccount.getWorkQueue().getWorkRequestList().add(request);
                ESystem.getWorkRequestList().getWorkRequestList().add(request);
                populateEventTable();

                titleTxt.setText("");
                vRequiredTxt.setText("");
                descTxt.setText("");
                locationTxt.setText("");
              //  dateChooser.setCalendar(null);
            }
        }catch(NumberFormatException e){}

    }//GEN-LAST:event_createBtnActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        int selectedRow = requestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            ServiceSeekerWorkReqest p = (ServiceSeekerWorkReqest) requestJTable.getValueAt(selectedRow, 5);

            p.setStatus("Complete");
            p.setReciever(UserAccount);
            JOptionPane.showMessageDialog(null, "You have successfully completed the request");
            populateWorkQueueTable();
            completeBtn.setEnabled(false);
           
        }   // TODO add your handling code here:
    }//GEN-LAST:event_completeBtnActionPerformed

    private void AssignTomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignTomeBtnActionPerformed
        int selectedRow = requestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

           ServiceSeekerWorkReqest hswr = (ServiceSeekerWorkReqest) requestJTable.getValueAt(selectedRow, 5);

            hswr.setStatus("GC ASSIGNED the Request");
            hswr.setReciever(UserAccount);

            populateWorkQueueTable();
            completeBtn.setEnabled(true);

        }
    }//GEN-LAST:event_AssignTomeBtnActionPerformed

    private void volunteerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volunteerBtnActionPerformed
        
        DefaultCategoryDataset d = new DefaultCategoryDataset();

        for (WorkRequest work : org.getWorkRequestList().getWorkRequestList()){
            if(work instanceof GCOWorkRequest)
            {

                d.setValue(((GCOWorkRequest) work).getCreatorAcquired(),"Event List",((GCOWorkRequest) work).getTitle());

            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Volunteers Acquired", "Event Name", "Volunteers Participated", d, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.blue);
        ChartFrame f = new ChartFrame("Volunteer Analysis",chart);
        f.setVisible(true);
        f.setSize(500,400);
    }//GEN-LAST:event_volunteerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignTomeBtn;
    private javax.swing.JButton completeBtn;
    private javax.swing.JButton createBtn;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JTextArea descTxt;
    private javax.swing.JTable gcEventTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTable requestJTable;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JTextField vRequiredTxt;
    private javax.swing.JButton volunteerBtn;
    // End of variables declaration//GEN-END:variables
}

