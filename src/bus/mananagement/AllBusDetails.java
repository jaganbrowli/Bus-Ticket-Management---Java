/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.mananagement;

/**
 *
 * @author ratna
 */
public class AllBusDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form AllBusDetails
     */
    public AllBusDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        busmPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("busmPU").createEntityManager();
        busDetailsQuery = java.beans.Beans.isDesignTime() ? null : busmPUEntityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery.getResultList();
        busDetailsQuery1 = java.beans.Beans.isDesignTime() ? null : busmPUEntityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery1.getResultList();
        busDetailsQuery2 = java.beans.Beans.isDesignTime() ? null : busmPUEntityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery2.getResultList();
        busDetailsQuery3 = java.beans.Beans.isDesignTime() ? null : busmPUEntityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery3.getResultList();
        busDetailsQuery4 = java.beans.Beans.isDesignTime() ? null : busmPUEntityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery4.getResultList();
        busDetailsQuery5 = java.beans.Beans.isDesignTime() ? null : busmPUEntityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery5.getResultList();
        busDetailsQuery6 = java.beans.Beans.isDesignTime() ? null : busmPUEntityManager.createQuery("SELECT b FROM BusDetails b");
        busDetailsList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : busDetailsQuery6.getResultList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("All Bus Details");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, busDetailsList6, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${busNo}"));
        columnBinding.setColumnName("Bus No");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${movement}"));
        columnBinding.setColumnName("Movement");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${busSource}"));
        columnBinding.setColumnName("Bus Source");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${busDest}"));
        columnBinding.setColumnName("Bus Dest");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${departDate}"));
        columnBinding.setColumnName("Depart Date");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${departTime}"));
        columnBinding.setColumnName("Depart Time");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${price}"));
        columnBinding.setColumnName("Price");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalSeat}"));
        columnBinding.setColumnName("Total Seat");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<bus.mananagement.BusDetails> busDetailsList;
    private java.util.List<bus.mananagement.BusDetails> busDetailsList1;
    private java.util.List<bus.mananagement.BusDetails> busDetailsList2;
    private java.util.List<bus.mananagement.BusDetails> busDetailsList3;
    private java.util.List<bus.mananagement.BusDetails> busDetailsList4;
    private java.util.List<bus.mananagement.BusDetails> busDetailsList5;
    private java.util.List<bus.mananagement.BusDetails> busDetailsList6;
    private javax.persistence.Query busDetailsQuery;
    private javax.persistence.Query busDetailsQuery1;
    private javax.persistence.Query busDetailsQuery2;
    private javax.persistence.Query busDetailsQuery3;
    private javax.persistence.Query busDetailsQuery4;
    private javax.persistence.Query busDetailsQuery5;
    private javax.persistence.Query busDetailsQuery6;
    private javax.persistence.EntityManager busmPUEntityManager;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
