/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Detalle_De_Pedido;
import Clases.Ingredientes;
import Clases.Pedido;
import Clases.Proveedor;
import Util.AdminFechas;
import Util.AdminSerializacion;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cleymer
 */
public class frmDetalleDePedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmDetalleDePedido
     */
   
    private int _indiceSeleccion = -1;
    public boolean _agregando;
    public int _codigoPedido;
    private Proveedor _proveedorPedido;
    private Ingredientes _ingredientes;
    private Pedido _pedidoEncontrado;

    public frmDetalleDePedido() {
        initComponents();
        this.setTitle("Gestion Detalle de Pedido");
       
        try {
            ActualizarElementosTabla();
        } catch (Exception e) {
            System.out.println("Error al actualizar los elementos " + e.getMessage());
        }
    }

     public void inicioFormulario(){
        if(this._agregando){
            this._codigoPedido=MDIPrincipal.gPedido.GenerarCodigoPedido();
        }else{
            _pedidoEncontrado=MDIPrincipal.gPedido.Buscar(_codigoPedido);
            ActualizarElementosTabla();
        }
        
        this.lblnumpedido.setText(Integer.toString(_codigoPedido));
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
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btningredientes = new javax.swing.JButton();
        lblingredientes = new javax.swing.JLabel();
        lblmen = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblnumpedido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        btnproveedor = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDetalleDePedido = new javax.swing.JTable();
        lblfondo = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion Ingredientes"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ingredientes");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btningredientes.setText("...");
        btningredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningredientesActionPerformed(evt);
            }
        });

        lblingredientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(txtPrecio))
                        .addGap(42, 42, 42)
                        .addComponent(lblmen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btningredientes)))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btningredientes)
                        .addGap(28, 28, 28))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 143, 510, 138));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Pedido"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("N° de Pedido:");

        lblnumpedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Proveedor:");

        lblProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnproveedor.setText("...");
        btnproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnumpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnproveedor)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnumpedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnproveedor))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 11, 510, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_guardar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonReportes 1.png"))); // NOI18N
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel6.setText("Guardar");

        jLabel7.setText("Eliminar");

        jLabel8.setText("Reporte");

        jLabel9.setText("Salir");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 80, 350));

        jtDetalleDePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtDetalleDePedido);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 490, 120));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2020-08-14 at 8.46.18 PM.jpeg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproveedorActionPerformed
     
         String _nombreproveedor=JOptionPane.showInputDialog(this, "Nombre del proveedor");
        
        _proveedorPedido=MDIPrincipal.gProveedor.obtenerProveedor(_nombreproveedor);
        
        if(_proveedorPedido!=null){
            this.lblProveedor.setText(_proveedorPedido.get_nombres()+" "+_proveedorPedido.get_apellidos());
        }
       
        
    }//GEN-LAST:event_btnproveedorActionPerformed

    private void btningredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningredientesActionPerformed
         String _nombre=JOptionPane.showInputDialog(this, "Ingrese el nombre del Ingrediente a escoger");
        
         _ingredientes=MDIPrincipal.gIngredientes.obtenerIngrediente(_nombre);
        
        if(_ingredientes!=null){
            this.lblingredientes.setText(_ingredientes.get_nombre());
            this.txtPrecio.setText(Double.toString(_ingredientes.get_precioventa()));
             this.lblmen.setText("");
        }else{
            this.lblmen.setText("Ingrediente No encontrado");
            this.txtPrecio.setText("");
            this.lblingredientes.setText("");
        }
    }//GEN-LAST:event_btningredientesActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        String nombreArchivo = "Detalle de Pedido";
        String contenido = MDIPrincipal.gDetalleped.getInformacionGestion();
        String ruta = "Reportes\\" + nombreArchivo;

        try {
            FileOutputStream archivo = new FileOutputStream(ruta + ".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            doc.add(new Paragraph(contenido));
            doc.close();
            JOptionPane.showMessageDialog(null, "Reporte generado correctamente");
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        _pedidoEncontrado=MDIPrincipal.gPedido.Buscar(_codigoPedido);
        if(_pedidoEncontrado==null){ //El Pedido no existe, entonces tengo que registrarlo
            if(_proveedorPedido==null){
                this.lblmen.setText("Favor seleccione el proveedor");

            }else{
                _pedidoEncontrado=new Pedido();
                _pedidoEncontrado.set_codigo(_codigoPedido);
                _pedidoEncontrado.set_proveedor(_proveedorPedido);
                MDIPrincipal.gPedido.Agregar(_pedidoEncontrado);
            }
        }

        int _posicionPedido= MDIPrincipal.gPedido.BuscarPorCodigo(_pedidoEncontrado.get_codigo());

        Detalle_De_Pedido _nuevoDetalleped=new Detalle_De_Pedido();
        _nuevoDetalleped.set_cantidad(Double.parseDouble(this.txtCantidad.getText()));
        _nuevoDetalleped.set_ingredientes(_ingredientes);

        boolean _resultado=_pedidoEncontrado.agregarDetalleped(_nuevoDetalleped);

        MDIPrincipal.gPedido.Modificar(_pedidoEncontrado, _posicionPedido);

        MDIPrincipal.frmPedido.ActualizarElementosTabla();

        try{
            ActualizarElementosTabla();
            //Paso 6 Serializar Informacion
            AdminSerializacion.serializacion(MDIPrincipal.gDetalleped, "gDetallepedido.obj");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error " + e.getMessage());

        }
        

       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (_indiceSeleccion >= 0) {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Esta Seguro?", "Warning", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                MDIPrincipal.gDetalleped.eliminarporIndice(_indiceSeleccion);
                ActualizarElementosTabla();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor Seleccione el elemento de la tabla que desea eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
     public void ActualizarElementosTabla() {
            String[] titulos = { "Cantidad", "Ingredientes", "Precio", "Subtotal"};
            DefaultTableModel dt = new DefaultTableModel(this._pedidoEncontrado.getArrayDetalle_De_Pedido(), titulos);
            this.jtDetalleDePedido.setModel(dt);
     }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btningredientes;
    private javax.swing.JButton btnproveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtDetalleDePedido;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblingredientes;
    private javax.swing.JLabel lblmen;
    private javax.swing.JLabel lblnumpedido;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
