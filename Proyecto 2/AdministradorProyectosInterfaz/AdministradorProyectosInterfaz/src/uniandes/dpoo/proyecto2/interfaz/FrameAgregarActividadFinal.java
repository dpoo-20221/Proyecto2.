
package uniandes.dpoo.proyecto2.interfaz;

import uniandes.dpoo.proyecto2.mundo.Actividad;
import uniandes.dpoo.proyecto2.mundo.Participante;
import uniandes.dpoo.proyecto2.mundo.ConsolaAplicacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import uniandes.dpoo.proyecto2.interfaz.InterfazAdministrador;



import uniandes.dpoo.proyecto2.mundo.Proyecto;

/**
 *
 * @author Usuario
 */
public class FrameAgregarActividadFinal extends javax.swing.JFrame{

    private Participante user;
    private javax.swing.JPanel PanelInformacion;
    private javax.swing.JPanel PanelLabel;
    private javax.swing.JButton btnCrear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox checkActividadCompletada;
    private com.toedter.calendar.JDateChooser dateFechaFinal;
    private com.toedter.calendar.JDateChooser dateFechaInicial;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblAgregarActividad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    private ConsolaAplicacion consola;
	private Proyecto proyecto;
    

    public FrameAgregarActividadFinal(ConsolaAplicacion consola, Proyecto proyecto) {
        initComponents();
        
        lblFechaFinal.setEnabled(false);
        dateFechaFinal.setEnabled(false);
        this.proyecto = proyecto;
        this.consola = consola;
        
       
    }


    private void initComponents() {

        PanelLabel = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        lblAgregarActividad = new javax.swing.JLabel();
        PanelInformacion = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        lblFechaInicio = new javax.swing.JLabel();
        dateFechaInicial = new com.toedter.calendar.JDateChooser();
        checkActividadCompletada = new javax.swing.JCheckBox();
        lblFechaFinal = new javax.swing.JLabel();
        dateFechaFinal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLabel.setBackground(new java.awt.Color(21, 25, 28));
        PanelLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        lblExit.setForeground(new java.awt.Color(61, 71, 100));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("x");
        lblExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lblAgregarActividad.setFont(new java.awt.Font("Times New Roman", 0, 24)); 
        lblAgregarActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblAgregarActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarActividad.setText("AGREGAR ACTIVIDAD");
        lblAgregarActividad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelLabelLayout = new javax.swing.GroupLayout(PanelLabel);
        PanelLabel.setLayout(PanelLabelLayout);
        PanelLabelLayout.setHorizontalGroup(
            PanelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLabelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblAgregarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelLabelLayout.setVerticalGroup(
            PanelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLabelLayout.createSequentialGroup()
                        .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblAgregarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(PanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        PanelInformacion.setBackground(new java.awt.Color(34, 40, 44));
        PanelInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblNombre.setForeground(new java.awt.Color(16, 95, 149));
        lblNombre.setText("Nombre de la actividad");
        PanelInformacion.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNombre.setBackground(new java.awt.Color(21, 25, 28));
        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        PanelInformacion.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 180, -1));

        lblDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblDescripcion.setForeground(new java.awt.Color(16, 95, 149));
        lblDescripcion.setText("Descripci�n");
        PanelInformacion.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(21, 25, 28));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        PanelInformacion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));

        lblTipo.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblTipo.setForeground(new java.awt.Color(16, 95, 149));
        lblTipo.setText("Tipo de actividad");
        PanelInformacion.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtTipo.setBackground(new java.awt.Color(21, 25, 28));
        txtTipo.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtTipo.setForeground(new java.awt.Color(255, 255, 255));
        PanelInformacion.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 180, -1));
        
        lblFechaInicio.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaInicio.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaInicio.setText("Fecha de inicio");
        PanelInformacion.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        dateFechaInicial.setBackground(new java.awt.Color(255, 255, 255));
        PanelInformacion.add(dateFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, -1));
        
        checkActividadCompletada.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        checkActividadCompletada.setForeground(new java.awt.Color(16, 95, 149));
        checkActividadCompletada.setText("La actividad fue completada");
        checkActividadCompletada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	checkActividadCompletadaActionPerformed(evt);
            }
        });
        
        PanelInformacion.add(checkActividadCompletada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        
        lblFechaFinal.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaFinal.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaFinal.setText("Fecha de finalizaci�n");
        PanelInformacion.add(lblFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        dateFechaFinal.setBackground(new java.awt.Color(255, 255, 255));
        PanelInformacion.add(dateFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 180, -1));
        
        btnCrear.setBackground(new java.awt.Color(25, 44, 99));
        btnCrear.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        PanelInformacion.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 120, 40));

        getContentPane().add(PanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, 420));

        pack();
        setLocationRelativeTo(null);
    }

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
    }
    public static String NombreActividad = "";
    public static String Descripcion = "";
    private static String TipoActividad = ""; 
    
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) 
    {

        NombreActividad = txtNombre.getText();
        Descripcion = txtDescripcion.getText();
        TipoActividad = txtTipo.getText();
        
        
      //Fecha inicial to Datetime
        java.util.Date fechaInicial = dateFechaInicial.getDate();
        String Fechainicial = String.format("%1$tY-%1$tm-%1$td", fechaInicial);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime FechaInicial = LocalDate.parse(Fechainicial, formatter).atStartOfDay();
        
        //Fecha final to Datetime
        java.util.Date fechaFinal = dateFechaFinal.getDate();
        String Fechafinal = String.format("%1$tY-%1$tm-%1$td", fechaFinal);
        LocalDateTime FechaFinal = LocalDate.parse(Fechafinal, formatter).atStartOfDay();
        
        if (checkActividadCompletada.isSelected())
        {
        	proyecto.crearNuevaActividadRealizada(NombreActividad, Descripcion, TipoActividad, FechaFinal, FechaInicial, consola.getUsuario());
        	consola.guardar();
        	txtNombre.setText("");
        	txtDescripcion.setText("");
        	txtTipo.setText("");
            JOptionPane.showMessageDialog(null, "Actividad agregada al proyecto a las: "+LocalDate.now().toString(), "Agregar Actividad", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
        	
		}
		else
		{	
			proyecto.crearNuevaActividadPendiente(NombreActividad, Descripcion, TipoActividad, FechaInicial, consola.getUsuario());;
			consola.guardar();
        	txtNombre.setText("");
        	txtDescripcion.setText("");
        	txtTipo.setText("");
            JOptionPane.showMessageDialog(null, "Actividad agregada al proyecto a las: "+LocalDate.now().toString(), "Agregar Actividad", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.requestFocus();
			
		}
    }
    
    private void checkActividadCompletadaActionPerformed(java.awt.event.ActionEvent evt) {
        if (!lblFechaFinal.isEnabled())
        {
            lblFechaFinal.setEnabled(true);
            dateFechaFinal.setEnabled(true);
        }
        else
        {
            lblFechaFinal.setEnabled(false);
            dateFechaFinal.setEnabled(false);
        }
    }   
}

