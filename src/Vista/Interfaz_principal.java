/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorHistorial;
import Controlador.ControladorProducto;
import Modelo.Historial;
import Modelo.Producto;
import Modelo.Usuario;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.FileOutputStream;
import java.net.URI;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author WILSON O
 */
public class Interfaz_principal extends javax.swing.JFrame {

    public Interfaz_principal() {
        initComponents();

    }

    public Interfaz_principal(Usuario usuario) {
        initComponents();

        setLocationRelativeTo(null);
        lblNombre.setText(usuario.getNombre());
        lblRol.setText(usuario.getRol());
        cant_stock();
        this.setExtendedState(MAXIMIZED_BOTH);
        if (usuario.getRol().equals("USER")) {
            jMenu5.setVisible(false);
            jMenu2.setVisible(false);
        }
    }
    public void cant_stock(){
        txtNotificacion.setVisible(false);
        ControladorProducto controladorProducto = new ControladorProducto();
        List<Producto> lista = controladorProducto.listar();
        String notificacion = " ******************* NOTIFICACION *******************\n";
        for (Producto lista1 : lista) {
            if (lista1.getStock() < 11) {
                notificacion = notificacion
                        + "El producto: " + lista1.getNombre() + " Necesita productos en STOCK \n";
                txtNotificacion.setVisible(true);
                txtNotificacion.setText(notificacion);
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

        escritorio = new javax.swing.JDesktopPane();
        lblRol = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotificacion = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        item_venta = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        item_venta1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        escritorio.setBackground(java.awt.Color.lightGray);
        escritorio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                escritorioComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                escritorioComponentRemoved(evt);
            }
        });

        lblRol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNotificacion.setEditable(false);
        txtNotificacion.setColumns(20);
        txtNotificacion.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        txtNotificacion.setRows(5);
        jScrollPane1.setViewportView(txtNotificacion);

        escritorio.setLayer(lblRol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblRol, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jMenu1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/Clientes.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/busqueda-de-usuario.png"))); // NOI18N
        jMenuItem1.setText("Controlador Clientes");
        jMenuItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/shopping-cart.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/add-goods.png"))); // NOI18N
        jMenuItem3.setText("Controlador Productos");
        jMenuItem3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/shippingBlack.png"))); // NOI18N
        jMenuItem4.setText("Ingres de Productos");
        jMenuItem4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuItem4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuItem4KeyPressed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/devoluciones.png"))); // NOI18N
        jMenuItem8.setText("Controlador Categoria");
        jMenuItem8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/receipt.png"))); // NOI18N
        jMenu3.setText("Facturación");
        jMenu3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(200, 50));

        item_venta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        item_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/newInvoice.png"))); // NOI18N
        item_venta.setText("Controlador Facturas");
        item_venta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_ventaActionPerformed(evt);
            }
        });
        jMenu3.add(item_venta);

        jMenuBar1.add(jMenu3);

        jMenu5.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/multiple-users-silhouette.png"))); // NOI18N
        jMenu5.setText("Proveedores");
        jMenu5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/businessman.png"))); // NOI18N
        jMenuItem2.setText("Controlador Provvedor");
        jMenuItem2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/product_list.png"))); // NOI18N
        jMenu6.setText("INVENTARIO");
        jMenu6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/increasing-stocks-graphic-of-bars.png"))); // NOI18N
        jMenuItem5.setText("Historial");
        jMenuItem5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        jMenu4.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/receipt.png"))); // NOI18N
        jMenu4.setText("REPORTE");
        jMenu4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 50));

        item_venta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        item_venta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/newInvoice.png"))); // NOI18N
        item_venta1.setText("IMPRIMIR INVENTARIO");
        item_venta1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item_venta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_venta1ActionPerformed(evt);
            }
        });
        jMenu4.add(item_venta1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VistaUsuarios vistaUsuarios = new VistaUsuarios();
        escritorio.add(vistaUsuarios);
        vistaUsuarios.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VistaProveedor vistaProveedor = new VistaProveedor();
        escritorio.add(vistaProveedor);
        vistaProveedor.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VistaProducto vistaProducto = new VistaProducto();
        escritorio.add(vistaProducto);
        vistaProducto.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void item_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_ventaActionPerformed
        VistaFactura vistaFactura = new VistaFactura();
        escritorio.add(vistaFactura);
        vistaFactura.show();
    }//GEN-LAST:event_item_ventaActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        VistaCategoria vistaCategoria = new VistaCategoria();
        escritorio.add(vistaCategoria);
        vistaCategoria.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        VistaIngresProductos vistaIngresProductos = new VistaIngresProductos();
        escritorio.add(vistaIngresProductos);
        vistaIngresProductos.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        VistaIngresHitorial vistaIngresHitorial = new VistaIngresHitorial();
        escritorio.add(vistaIngresHitorial);
        vistaIngresHitorial.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuItem4KeyPressed

    }//GEN-LAST:event_jMenuItem4KeyPressed

    private void item_venta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_venta1ActionPerformed
        imprimir();
    }//GEN-LAST:event_item_venta1ActionPerformed

    private void escritorioComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_escritorioComponentAdded
        cant_stock();
        
    }//GEN-LAST:event_escritorioComponentAdded

    private void escritorioComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_escritorioComponentRemoved
        cant_stock();
    }//GEN-LAST:event_escritorioComponentRemoved
    public void imprimir() {
        Document document = new Document();

        try {
            Image imagen = Image.getInstance("src/imagenes/logo.png");

            PdfWriter.getInstance(document, new FileOutputStream("Informe.pdf"));
            document.open();

            imagen.setAlignment(Element.ALIGN_CENTER);
            document.add(imagen);

            Paragraph titulo = new Paragraph("REPORTE MINI MARQUET \"LA GUADALUPANA\"   ",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.NORMAL, // estilo
                            BaseColor.RED));
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            document.add(Chunk.NEWLINE);

            Paragraph nom = new Paragraph("NOMBRE:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(nom);

            Paragraph nombre = new Paragraph("WILSON RIVERA",
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            nombre.setAlignment(Element.ALIGN_CENTER);
            document.add(nombre);
            document.add(Chunk.NEWLINE);

            nom = new Paragraph("TUTOR:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(nom);

            nombre = new Paragraph("JUAN ARAUJO",
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            nombre.setAlignment(Element.ALIGN_CENTER);
            document.add(nombre);
            document.add(Chunk.NEWLINE);

            Calendar fe = Calendar.getInstance();
            String fecha = fe.get(Calendar.YEAR) + "/" + (fe.get(Calendar.MONTH) + 1) + "/" + fe.get(Calendar.DAY_OF_MONTH);
            String hora = fe.get(Calendar.HOUR) + ":" + fe.get(Calendar.MINUTE) + ":" + fe.get(Calendar.SECOND);

            Paragraph fee = new Paragraph("FECHA:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(fee);

            Paragraph fechaa = new Paragraph(fecha,
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            fechaa.setAlignment(Element.ALIGN_CENTER);
            document.add(fechaa);

            document.add(Chunk.NEWLINE);

            Paragraph hoo = new Paragraph("HORA:",
                    FontFactory.getFont("arial", 12, Font.NORMAL, BaseColor.BLUE));
            document.add(hoo);

            Paragraph horaa = new Paragraph(hora,
                    FontFactory.getFont("arial", 15, Font.NORMAL, BaseColor.BLACK));
            horaa.setAlignment(Element.ALIGN_CENTER);
            document.add(horaa);

            document.add(Chunk.NEXTPAGE);

            Paragraph t1 = new Paragraph("REPORTE DE LOS PRODUCTOS",
                    FontFactory.getFont("arial", // fuente
                            22, // tamaño
                            Font.NORMAL, // estilo
                            BaseColor.RED));
            t1.setAlignment(Element.ALIGN_CENTER);
            document.add(t1);
            document.add(Chunk.NEWLINE);

            PdfPTable table = new PdfPTable(7);

            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            table.addCell(new Paragraph("ID",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("FECHA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("MOTIVO",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("PRODUCTO",
                    FontFactory.getFont("arial", 8, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("CANTIDAD INGRESA | SALE",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("CANTIDAD NUEVA",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));

            table.addCell(new Paragraph("CANTIDAD ANTERIOR",
                    FontFactory.getFont("arial", 9, Font.BOLD, BaseColor.GREEN)));
            ControladorHistorial controladorHistorial = new ControladorHistorial();
            List<Historial> lsRiego = controladorHistorial.listar();

            for (Historial h : lsRiego) {

                table.addCell(h.getId() + "");
                table.addCell(h.getFecha() + "");
                table.addCell(h.getMotivo() + "");
                table.addCell(h.getProducto().getNombre() + "");
                table.addCell(h.getCantidadAnt() + "");
                table.addCell(h.getCantidadNew() + "");
                table.addCell(h.getCantidadOld() + "");
            }

            document.add(table);

            document.add(Chunk.NEXTPAGE);

            document.add(Chunk.NEWLINE);

            document.close();
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("Informe.pdf"));

        } catch (Exception e) {
            System.err.println(e.getMessage() + e.getLocalizedMessage());
            //System.exit(-1);
        }

    }

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
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem item_venta;
    private javax.swing.JMenuItem item_venta1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JTextArea txtNotificacion;
    // End of variables declaration//GEN-END:variables
}
