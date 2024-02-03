/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Clases.Empleado;
import Clases.Cargo;
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
public class frmEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmEmpleado
     */
    private boolean _agregando;
    private int _indiceSeleccion=-1;
    public frmEmpleado() {
        initComponents();
        this.setTitle("Gestion de Empleado");
        
        try{
            this.cboCargo.setModel(MDIPrincipal.gCargo.getCboModel());
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
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdentidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboCargo = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleado = new javax.swing.JTable();
        lblFondo = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 35, -1, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 32, 64, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombres");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 77, 98, -1));

        txtNombres.setEditable(false);
        txtNombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 74, 103, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 94, -1));

        txtApellidos.setEditable(false);
        txtApellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 116, -1, -1));

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 113, 103, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Identidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        txtIdentidad.setEditable(false);
        txtIdentidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 121, 132, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Sueldo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 152, 54, -1));

        txtSueldo.setEditable(false);
        txtSueldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 153, 103, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cargo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        cboCargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(cboCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 132, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 60));

        jLabel8.setText("Nuevo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editaar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 60, 60));

        jLabel9.setText("Editar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 60, 60));

        jLabel10.setText("Eliminar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_guardar.png"))); // NOI18N
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 50, 60));

        jLabel11.setText("Guardar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton buscar 1.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 60, 60));

        jLabel12.setText("Buscar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 60, 60));

        jLabel13.setText("Salir");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 30, -1));

        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonReportes 1.png"))); // NOI18N
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 50, 60));

        jLabel14.setText("Reporte");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jtEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        jtEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtEmpleadoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtEmpleado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 540, 160));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2020-08-14 at 8.46.18 PM.jpeg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this._agregando=true;
        estadoControles(true);
        estadoBotones(false);
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
             * PASOS
             * 1. Solicitar los valores al usuario
             * 2. Crear la instancia
             * 3. Setear los valores de la instancia
             * 4. Agregar la instancia Empleado a la gestion
             * 5. Mostrar los valores
             */
            
            //Paso 1
           
            String  _nombres, _apellidos, _telefono, _identidad;
            
            
            int _codigo=Integer.parseInt(txtCodigo.getText());
            _nombres=this.txtNombres.getText();
            _apellidos=this.txtApellidos.getText();
            _telefono=this.txtTelefono.getText();
            _identidad=this.txtIdentidad.getText();
            double _sueldo=Double.parseDouble(txtSueldo.getText());
           Cargo _cargo=MDIPrincipal.gCargo.getCargoByIndex(this.cboCargo.getSelectedIndex());
            
            //Paso 2 
            Empleado emp=new Empleado();
            try{
            //Paso 3
           emp.set_codigo(_codigo);
           emp.set_nombres(_nombres);
           emp.set_apellidos(_apellidos);
           emp.set_telefono(_telefono);
           emp.set_identidad(_identidad);
           emp.set_sueldo(_sueldo);
           emp.set_cargo(_cargo);
           
         if(this._agregando){//Nuevo Empleado
            
            //Paso 4
            MDIPrincipal.gEmpleado.Agregar(emp);
            
           
        }else{ //Esta editando los empleados
             MDIPrincipal.gEmpleado.Modificar(this._indiceSeleccion, emp);
        }
          //Paso 5
            ActualizarElementosTabla();
            estadoControles(false);
            estadoBotones(true);
            
            //Paso 6 Serializar Informacion
            AdminSerializacion.serializacion(MDIPrincipal.gEmpleado, "gEmpleado.obj");
         }catch(Exception e) {
             JOptionPane.showMessageDialog(this, "Ha ocurrido un error " + e.getMessage());
         } 
    }                                          

    public void ActualizarElementosTabla(){
        String [] titulos={"Codigo", "Nombres", "Apellidos", "Telefono", "Identidad", "Sueldo", "Cargo"};
        DefaultTableModel dt=new DefaultTableModel(MDIPrincipal.gEmpleado.getArrayGestion(), titulos);
        this.jtEmpleado.setModel(dt);
    }
     public void estadoControles(boolean _estado){
         this.txtCodigo.setEditable(_estado);
         this.txtNombres.setEditable(_estado);
         this.txtApellidos.setEditable(_estado);
         this.txtTelefono.setEditable(_estado);
         this.txtIdentidad.setEditable(_estado);
         this.txtSueldo.setEditable(_estado);
         this.cboCargo.setEditable(_estado);
         
     }
         public void estadoBotones(boolean _estado){
             this.btnBuscar.setEnabled(_estado);
             this.btnNuevo.setEnabled(_estado);
             this.btnEditar.setEnabled(_estado);
             this.btnEliminar.setEnabled(_estado);
             this.btnGuardar.setEnabled(!_estado);
                            
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtEmpleadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmpleadoMousePressed
        // TODO add your handling code here:
        _indiceSeleccion=this.jtEmpleado.getSelectedRow();
        if(_indiceSeleccion!=-1){
        Empleado _empleado=MDIPrincipal.gEmpleado.getEmpleadoByIndex(_indiceSeleccion);
        mostrarElemento(_empleado);
        }
    }//GEN-LAST:event_jtEmpleadoMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(_indiceSeleccion>=0){
        int resultado=JOptionPane.showConfirmDialog(null,"¿Esta Seguro?","Warning", JOptionPane.YES_NO_OPTION);
        if(resultado==JOptionPane.YES_OPTION){
            MDIPrincipal.gEmpleado.eliminarporIndice(_indiceSeleccion);
            ActualizarElementosTabla();
        }
        }else{
            JOptionPane.showMessageDialog(this,"Favor Seleccione el elemento de la tabla que desea eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String _codigo= JOptionPane.showInputDialog("Ingrese el codigo del Empleado");
        Empleado _empleadoEncontrado=MDIPrincipal.gEmpleado.Buscar(Integer.parseInt(_codigo));
        if(_empleadoEncontrado==null){
        JOptionPane.showMessageDialog(this, "Empleado no Encontrado");
        }else{
        mostrarElemento(_empleadoEncontrado);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
         String nombreArchivo = "Empleado";
        String contenido = MDIPrincipal.gEmpleado.getInformacionGestion();
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
public void mostrarElemento(Empleado _empleado){
    
      //this.txtCantidad.setText(_empleado.get_cantidad());
      this.txtNombres.setText(_empleado.get_nombres());
      this.txtApellidos.setText(_empleado.get_apellidos());
      this.txtIdentidad.setText(_empleado.get_identidad());
      this.txtTelefono.setText(_empleado.get_telefono());
      //faltan las tipo double e int
     // this.cboCargo.setText(_empleado.get_cargo());
      
      
      
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEmpleado;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtIdentidad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}