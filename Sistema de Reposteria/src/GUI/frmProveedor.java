/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Ingredientes;
import Clases.Proveedor;
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
public class frmProveedor extends javax.swing.JInternalFrame {
    
        
   
     private boolean _agregando;
    private int _indiceSeleccion=-1;
    public frmProveedor() {
        
        initComponents();
        this.setTitle("Gestion Proveedor");
        
        try{
            this.cboIngredientes.setModel(MDIPrincipal.gIngredientes.getCboModel());
        }catch(Exception e){}
        try {
            ActualizarElementosTabla();
        } catch (Exception e) {
            System.out.println("Error al actualizar los elementos " + e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNombredeEmpresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboIngredientes = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProveedor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblfondo = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 65, -1, -1));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 59, 176, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Apellidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 101, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre de Empresa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 140, -1, -1));

        txtApellidos.setEditable(false);
        txtApellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 98, 176, -1));

        txtNombredeEmpresa.setEditable(false);
        txtNombredeEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtNombredeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 137, 233, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ingredientes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 176, -1, -1));

        cboIngredientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboIngredientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Leche", "Harina", "Azucar", "Canela", "Frutas", "Huevos", " ", " " }));
        cboIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIngredientesActionPerformed(evt);
            }
        });
        getContentPane().add(cboIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 176, -1, -1));

        jtProveedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jtProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtProveedorMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtProveedor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editaar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_guardar.png"))); // NOI18N
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton buscar 1.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonReportes 1.png"))); // NOI18N
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jLabel6.setText("Nuevo");

        jLabel7.setText("Editar");

        jLabel8.setText("Eliminar");

        jLabel9.setText("Guardar");

        jLabel10.setText("Buscar");

        jLabel11.setText("Salir");

        jLabel12.setText("Reporte");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportes)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 228, 530, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Codigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 26, -1, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 20, 58, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2020-08-14 at 8.46.18 PM.jpeg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this._agregando=true;
        estadoControles(true);
            estadoBotones(false);
            this.txtCodigo.setText("");
            this.txtNombre.setText("");
            this.txtApellidos.setText("");
            this.txtNombredeEmpresa.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this._agregando=false;
        estadoControles(true);
        estadoBotones(false);
        this.txtCodigo.setEditable(false);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        /**
         * PASOS 1. Solicitar los valores al usuario 2. Crear la instancia 3.
         * Setear los valores de la instancia 4. Agregar la instancia Proveedor
         * a la gestion 5. Mostrar los valores
         */
        //Paso 1
        String _codigo, _nombres, _apellidos, _nombreEmpresa;
        _codigo=this.txtCodigo.getText();
        _nombres = this.txtNombre.getText();
        _apellidos = this.txtApellidos.getText();
        _nombreEmpresa = this.txtNombredeEmpresa.getText();
        try {
            Ingredientes _ingredientes = MDIPrincipal.gIngredientes.getIngredientesByIndex(this.cboIngredientes.getSelectedIndex());

        //Paso 2 
            Proveedor proveedor = new Proveedor();

            //Paso 3
            proveedor.set_codigo(_codigo);
            proveedor.set_nombres(_nombres);
            proveedor.set_apellidos(_apellidos);
            proveedor.set_nombreEmpresa(_nombreEmpresa);
            proveedor.set_ingredientes(_ingredientes);

            if (this._agregando) {//Nuevo Proveedor

                //Paso 4
                MDIPrincipal.gProveedor.agregar(proveedor);

            } else { //Esta editando los proveedor
                MDIPrincipal.gProveedor.Modificar(proveedor, this._indiceSeleccion);
            }
            //Paso 5
            ActualizarElementosTabla();
            estadoControles(false);
            estadoBotones(true);

            //Paso 6 Serializar Informacion
            AdminSerializacion.serializacion(MDIPrincipal.gProveedor, "gProveedor.obj");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error " + e.getMessage());
        }
    }

    public void ActualizarElementosTabla() {
        String[] titulos = {"Codigo" , "Nombres", "Apellidos", "Nombre de Empresa", "Ingredientes"};
        DefaultTableModel dt = new DefaultTableModel(MDIPrincipal.gProveedor.getArrayGestion(), titulos);
        this.jtProveedor.setModel(dt);
    }

    public void estadoControles(boolean _estado) {
        this.txtCodigo.setEditable(_estado);
        this.txtNombre.setEditable(_estado);
        this.txtApellidos.setEditable(_estado);
        this.txtNombredeEmpresa.setEditable(_estado);
        this.cboIngredientes.setEnabled(_estado);

    }

    public void estadoBotones(boolean _estado) {
        this.btnBuscar.setEnabled(_estado);
        this.btnNuevo.setEnabled(_estado);
        this.btnEditar.setEnabled(_estado);
        this.btnEliminar.setEnabled(_estado);
        this.btnGuardar.setEnabled(!_estado);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cboIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIngredientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboIngredientesActionPerformed

    private void jtProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProveedorMousePressed
        // TODO add your handling code here:
        _indiceSeleccion = this.jtProveedor.getSelectedRow();
        if (_indiceSeleccion != -1) {
            Proveedor _proveedor = MDIPrincipal.gProveedor.getProveedorByIndex(_indiceSeleccion);
            mostrarElemento(_proveedor);
        }
    }//GEN-LAST:event_jtProveedorMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (_indiceSeleccion >= 0) {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Esta Seguro?", "Warning", JOptionPane.YES_NO_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                MDIPrincipal.gProveedor.eliminarporIndice(_indiceSeleccion);
                ActualizarElementosTabla();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor Seleccione el elemento de la tabla que desea eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String _codigo = JOptionPane.showInputDialog("Ingrese el codigo del Proveedor");
        Proveedor _proveedorEncontrado = MDIPrincipal.gProveedor.Buscar(_codigo);
        if (_proveedorEncontrado == null) {
            JOptionPane.showMessageDialog(this, "Proveedor no Encontrado");
        } else {
            mostrarElemento(_proveedorEncontrado);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
         String nombreArchivo = "Proveedor";
        String contenido = MDIPrincipal.gProveedor.getInformacionGestion();
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
    }//GEN-LAST:event_btnReportesActionPerformed
    public void mostrarElemento(Proveedor _proveedor) {
        this.txtCodigo.setText(_proveedor.get_codigo());
        this.txtNombre.setText(_proveedor.get_nombres());
        this.txtApellidos.setText(_proveedor.get_apellidos());
        this.txtNombredeEmpresa.setText(_proveedor.get_nombreEmpresa());
        
    Ingredientes _ingredientes=_proveedor.get_ingredientes();
    int _i=MDIPrincipal.gIngredientes.BuscarPorCodigo(_ingredientes.get_codigo());
    this.cboIngredientes.setSelectedIndex(_i);
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboIngredientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProveedor;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombredeEmpresa;
    // End of variables declaration//GEN-END:variables
}
