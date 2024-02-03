/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Gestiones.*;
import Util.AdminSerializacion;
import java.awt.Dimension;

/**
 *
 * @author Cleymer
 */
public class MDIPrincipal extends javax.swing.JFrame {
    public static frmFactura frmFactura=new frmFactura();
    public static frmDetalleDeFactura frmPostres=new frmDetalleDeFactura();
    public static frmPedido frmPedido=new frmPedido();
    public static frmDetalleDePedido frmIngredientes=new frmDetalleDePedido();
    
    /**
     * Creates new form MDIPrincipal
     */
    public static GestionPostres gPostres=new GestionPostres();
    public static GestionBebidas gBebidas=new GestionBebidas();
    public static GestionReservacionMesas gReservacion=new GestionReservacionMesas();
    public static GestionProveedor gProveedor=new GestionProveedor();
    public static GestionCargo gCargo=new GestionCargo();
    public static GestionCliente gCliente=new GestionCliente();
    public static GestionEmpleado gEmpleado=new GestionEmpleado();
    public static GestionForma_De_Pago gForma_De_Pago=new GestionForma_De_Pago();
    public static GestionDetalle_De_Factura gDetalle=new GestionDetalle_De_Factura();
    public static GestionDetalle_De_Pedido gDetalleped=new GestionDetalle_De_Pedido();
    public static GestionFactura gFactura=new GestionFactura();
    public static GestionIngredientes gIngredientes=new GestionIngredientes();
    public static GestionPedido gPedido=new GestionPedido();
    public static GestionPuntos_De_Venta gPuntos=new GestionPuntos_De_Venta();
    public static GestionServicio gServicio=new GestionServicio();
    
    
    public MDIPrincipal() {
        initComponents();
        
        super.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        this.setTitle("Reposteria");
        try {
            gBebidas = (GestionBebidas) AdminSerializacion.de_serealizacion("gBebidas.obj");
            if (gBebidas == null) {
                gBebidas = new GestionBebidas();
            }
        } catch (Exception e) {
        }

        try {
            gPostres = (GestionPostres) AdminSerializacion.de_serealizacion("gPostres.obj");
            if (gPostres == null) {
                gPostres = new GestionPostres();
            }
        } catch (Exception e) {
        }

        try {
            gCliente = (GestionCliente) AdminSerializacion.de_serealizacion("gCliente.obj");
            if (gCliente == null) {
                gCliente = new GestionCliente();
            }
        } catch (Exception e) {
        }

        try {
            gEmpleado = (GestionEmpleado) AdminSerializacion.de_serealizacion("gEmpleado.obj");
            if (gEmpleado == null) {
                gEmpleado = new GestionEmpleado();
            }
        } catch (Exception e) {
        }

        try {
            gCargo = (GestionCargo) AdminSerializacion.de_serealizacion("gCargo.obj");
            if (gCargo == null) {
                gCargo = new GestionCargo();
            }
        } catch (Exception e) {
        }
        try {
            gDetalle = (GestionDetalle_De_Factura) AdminSerializacion.de_serealizacion("gDetalle.obj");
            if (gDetalle == null) {
                gDetalle = new GestionDetalle_De_Factura();
            }
        } catch (Exception e) {
        }
        try {
            gDetalleped = (GestionDetalle_De_Pedido) AdminSerializacion.de_serealizacion("gDetallepedido.obj");
            if (gDetalleped == null) {
                gDetalleped = new GestionDetalle_De_Pedido();
            }
        } catch (Exception e) {
        }
        try {
            gFactura = (GestionFactura) AdminSerializacion.de_serealizacion("gFacturas.obj");
            if (gFactura == null) {
                gFactura = new GestionFactura();
            }
        } catch (Exception e) {
        }
        try {
            gForma_De_Pago = (GestionForma_De_Pago) AdminSerializacion.de_serealizacion("gFormaDePago.obj");
            if (gForma_De_Pago == null) {
                gForma_De_Pago = new GestionForma_De_Pago();
            }
        } catch (Exception e) {
        }
        try {
            gIngredientes = (GestionIngredientes) AdminSerializacion.de_serealizacion("gIngredientes.obj");
            if (gIngredientes == null) {
                gIngredientes = new GestionIngredientes();
            }
        } catch (Exception e) {
        }
        try {
            gPedido = (GestionPedido) AdminSerializacion.de_serealizacion("gPedido.obj");
            if (gPedido == null) {
                gPedido = new GestionPedido();
            }
        } catch (Exception e) {
        }
        try {
            gProveedor = (GestionProveedor) AdminSerializacion.de_serealizacion("gProveedor.obj");
            if (gProveedor == null) {
                gProveedor = new GestionProveedor();
            }
        } catch (Exception e) {
        }
        try {
            gPuntos = (GestionPuntos_De_Venta) AdminSerializacion.de_serealizacion("gPuntosVenta.obj");
            if (gPuntos == null) {
                gPuntos = new GestionPuntos_De_Venta();
            }
        } catch (Exception e) {
        }
        try {
            gReservacion = (GestionReservacionMesas) AdminSerializacion.de_serealizacion("gReservacion.obj");
            if (gReservacion == null) {
                gReservacion = new GestionReservacionMesas();
            }
        } catch (Exception e) {
        }
        try {
            gServicio = (GestionServicio) AdminSerializacion.de_serealizacion("gServicios.obj");
            if (gServicio == null) {
                gServicio = new GestionServicio();
            }
        } catch (Exception e) {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuFacturabar = new javax.swing.JMenu();
        mnuFactura = new javax.swing.JMenuItem();
        mnudetallefacturabar = new javax.swing.JMenuItem();
        mnuPostres = new javax.swing.JMenuItem();
        mnuBebidas = new javax.swing.JMenuItem();
        mnuForma = new javax.swing.JMenuItem();
        mnuPersona = new javax.swing.JMenu();
        mnuEmpleado = new javax.swing.JMenuItem();
        mnuCargo = new javax.swing.JMenuItem();
        mnuCliente = new javax.swing.JMenuItem();
        mnuPuntos = new javax.swing.JMenuItem();
        mnuOrden = new javax.swing.JMenu();
        mnuPedido = new javax.swing.JMenuItem();
        mnuDetallePedido = new javax.swing.JMenuItem();
        mnuIngredientes = new javax.swing.JMenuItem();
        mnuProveedor = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuReservacion = new javax.swing.JMenuItem();
        mnuservicio = new javax.swing.JMenuItem();
        mnulogin = new javax.swing.JMenu();
        mnuInicioSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        mnuFacturabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajaa.jpg"))); // NOI18N
        mnuFacturabar.setText("Facturacion");

        mnuFactura.setText("Factura");
        mnuFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFacturaActionPerformed(evt);
            }
        });
        mnuFacturabar.add(mnuFactura);

        mnudetallefacturabar.setText("Detalle Factura");
        mnudetallefacturabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudetallefacturabarActionPerformed(evt);
            }
        });
        mnuFacturabar.add(mnudetallefacturabar);

        mnuPostres.setText("Postres");
        mnuPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPostresActionPerformed(evt);
            }
        });
        mnuFacturabar.add(mnuPostres);

        mnuBebidas.setText("Bebidas");
        mnuBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBebidasActionPerformed(evt);
            }
        });
        mnuFacturabar.add(mnuBebidas);

        mnuForma.setText("Forma de Pago");
        mnuForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFormaActionPerformed(evt);
            }
        });
        mnuFacturabar.add(mnuForma);

        menuBar.add(mnuFacturabar);

        mnuPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleado..jpg"))); // NOI18N
        mnuPersona.setText("Personas");

        mnuEmpleado.setText("Empleados");
        mnuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmpleadoActionPerformed(evt);
            }
        });
        mnuPersona.add(mnuEmpleado);

        mnuCargo.setText("Cargo");
        mnuCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCargoActionPerformed(evt);
            }
        });
        mnuPersona.add(mnuCargo);

        mnuCliente.setText("Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        mnuPersona.add(mnuCliente);

        mnuPuntos.setText("Puntos de Venta");
        mnuPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPuntosActionPerformed(evt);
            }
        });
        mnuPersona.add(mnuPuntos);

        menuBar.add(mnuPersona);

        mnuOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        mnuOrden.setText("Almacen");

        mnuPedido.setText("Pedido");
        mnuPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPedidoActionPerformed(evt);
            }
        });
        mnuOrden.add(mnuPedido);

        mnuDetallePedido.setText("DetallePedido");
        mnuDetallePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDetallePedidoActionPerformed(evt);
            }
        });
        mnuOrden.add(mnuDetallePedido);

        mnuIngredientes.setText("Ingredientes");
        mnuIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngredientesActionPerformed(evt);
            }
        });
        mnuOrden.add(mnuIngredientes);

        mnuProveedor.setText("Proveedor");
        mnuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProveedorActionPerformed(evt);
            }
        });
        mnuOrden.add(mnuProveedor);

        menuBar.add(mnuOrden);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva.jpg"))); // NOI18N
        jMenu1.setText("Registro");

        mnuReservacion.setText("Reservacion Mesas");
        mnuReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReservacionActionPerformed(evt);
            }
        });
        jMenu1.add(mnuReservacion);

        mnuservicio.setText("Servicio");
        mnuservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuservicioActionPerformed(evt);
            }
        });
        jMenu1.add(mnuservicio);

        menuBar.add(jMenu1);

        mnulogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sesion..png"))); // NOI18N
        mnulogin.setText("Login");

        mnuInicioSesion.setText("Inicio de Sesion");
        mnuInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInicioSesionActionPerformed(evt);
            }
        });
        mnulogin.add(mnuInicioSesion);

        menuBar.add(mnulogin);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFacturaActionPerformed
         Dimension jInternal=frmFactura.getSize(); //Dimensión de mi formulario interno
        Dimension desktopSize=this.getSize(); //Dimensiones de mi desktop
        frmFactura.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        this.desktopPane.add(frmFactura);
        frmFactura.setVisible(true);
        
    }//GEN-LAST:event_mnuFacturaActionPerformed

    private void mnudetallefacturabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudetallefacturabarActionPerformed
       frmDetalleDeFactura frm=new frmDetalleDeFactura();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnudetallefacturabarActionPerformed

    private void mnuInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInicioSesionActionPerformed
        frmLogin frm2=new frmLogin();
        Dimension jInternal=frm2.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm2.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm2.setVisible(true);
        this.desktopPane.add(frm2);
        
    }//GEN-LAST:event_mnuInicioSesionActionPerformed

    private void mnuPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPostresActionPerformed
       frmPostres frm=new frmPostres();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuPostresActionPerformed

    private void mnuBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBebidasActionPerformed
         frmBebidas frm=new frmBebidas();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuBebidasActionPerformed

    private void mnuFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFormaActionPerformed
         frmFormaDePago frm=new frmFormaDePago();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuFormaActionPerformed

    private void mnuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmpleadoActionPerformed
        frmEmpleado frm=new frmEmpleado();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuEmpleadoActionPerformed

    private void mnuCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCargoActionPerformed
        frmCargo frm=new frmCargo();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuCargoActionPerformed

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed
         frmCliente frm=new frmCliente();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
       
       
    }//GEN-LAST:event_mnuClienteActionPerformed

    private void mnuPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPuntosActionPerformed
       frmPuntosDeVenta frm=new frmPuntosDeVenta();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuPuntosActionPerformed

    private void mnuPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPedidoActionPerformed
        Dimension jInternal=frmPedido.getSize(); //Dimensión de mi formulario interno
        Dimension desktopSize=this.getSize(); //Dimensiones de mi desktop
        frmPedido.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        this.desktopPane.add(frmPedido);
        frmPedido.setVisible(true);
    }//GEN-LAST:event_mnuPedidoActionPerformed

    private void mnuDetallePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDetallePedidoActionPerformed
        frmDetalleDePedido frm=new frmDetalleDePedido();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuDetallePedidoActionPerformed

    private void mnuIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngredientesActionPerformed
        frmIngredientes frm=new frmIngredientes();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuIngredientesActionPerformed

    private void mnuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProveedorActionPerformed
         frmProveedor frm=new frmProveedor();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuProveedorActionPerformed

    private void mnuReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReservacionActionPerformed
       frmReservacionMesas frm=new frmReservacionMesas();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuReservacionActionPerformed

    private void mnuservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuservicioActionPerformed
         frmServicio frm=new frmServicio();
        Dimension jInternal=frm.getSize(); //Dimension de formulario interno
       
       Dimension desktopSize=this.getSize(); // Dimension de mi desktop
       frm.setLocation((desktopSize.width-jInternal.width)/2, (desktopSize.height-jInternal.height)/2);
        frm.setVisible(true);
        this.desktopPane.add(frm);
    }//GEN-LAST:event_mnuservicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIPrincipal().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuBebidas;
    private javax.swing.JMenuItem mnuCargo;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuDetallePedido;
    private javax.swing.JMenuItem mnuEmpleado;
    private javax.swing.JMenuItem mnuFactura;
    private javax.swing.JMenu mnuFacturabar;
    private javax.swing.JMenuItem mnuForma;
    private javax.swing.JMenuItem mnuIngredientes;
    private javax.swing.JMenuItem mnuInicioSesion;
    private javax.swing.JMenu mnuOrden;
    private javax.swing.JMenuItem mnuPedido;
    private javax.swing.JMenu mnuPersona;
    private javax.swing.JMenuItem mnuPostres;
    private javax.swing.JMenuItem mnuProveedor;
    private javax.swing.JMenuItem mnuPuntos;
    private javax.swing.JMenuItem mnuReservacion;
    private javax.swing.JMenuItem mnudetallefacturabar;
    private javax.swing.JMenu mnulogin;
    private javax.swing.JMenuItem mnuservicio;
    // End of variables declaration//GEN-END:variables

}
