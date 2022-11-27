/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrganillamaCodigo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.Timer;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Inicio extends JFrame{
    private JPanel BarraSuperior, allContentPanel,btnCerrar,btnMaximizar,btnMinimizar,
                   mainContent, mainContentFondo,
                   panelActividades,panelCalendario,panelReloj;
    private JLabel lblCerrar,lblMaximizar,lblMinimizar,lblNomUsuario,lblReloj; 
    private int timerun = 0; 
    Timer timer;
    
    //constructor
    public Inicio() {
        this.setSize(1280,720);
        this.setContentPane(new ImagenPanel("src//main//java//Imagenes//fondo2.png"));//metodo para fondos en jFrame
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        inicializarComponentes();
        inicioReloj();
    }
    //fin Constructor
    
    //Metodos
    public void imagenLbl(JLabel lbl,String ruta){
    ImageIcon img = new ImageIcon(ruta);
    Icon icono = new ImageIcon(img.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_DEFAULT));
    lbl.setIcon(icono);
    lbl.repaint();
    
    }
    
    
    
     public class ImagenPanel extends JPanel{
        String ubicacion;
        public ImagenPanel(String ubicacion){
            this.ubicacion=ubicacion;
        }
    @Override
    public void paint(Graphics g){
        
        ImageIcon img = new ImageIcon(ubicacion);
        g.drawImage(img.getImage(),0,0, getWidth(), getHeight(), this);
        this.setOpaque(false);
        super.paint(g);
        
    }
    }
   
    private void inicializarComponentes(){
        allContentPanel = new javax.swing.JPanel();
        allContentPanel.setSize(1280,720);
        allContentPanel.setOpaque(false);
        
        
        BarraSuperior = new javax.swing.JPanel();
        BarraSuperior.setPreferredSize(new java.awt.Dimension(1280, 40));
        BarraSuperior.setBackground(new Color(0,0,0,120));
        BarraSuperior.setOpaque(true);
        
        
        btnCerrar = new javax.swing.JPanel();
        btnCerrar.setPreferredSize(new java.awt.Dimension(30, 30));
        lblCerrar = new javax.swing.JLabel();
        lblCerrar.setBounds(0,0,30,30);
        btnCerrar.setBackground(Color.red);
        btnCerrar.setOpaque(true);
        
        btnMaximizar = new javax.swing.JPanel();
        btnMaximizar.setPreferredSize(new java.awt.Dimension(30, 30));
        btnMaximizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        lblMaximizar = new javax.swing.JLabel();
        btnMaximizar.add(lblMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));
        lblMaximizar.setBackground(Color.BLACK);
        lblMaximizar.setOpaque(true);
        
        btnMinimizar = new javax.swing.JPanel();
        btnMinimizar.setPreferredSize(new java.awt.Dimension(30, 30));
        lblMinimizar = new javax.swing.JLabel();
        lblMinimizar.setSize(30,30);
        
        mainContent = new javax.swing.JPanel();
        mainContent.setPreferredSize(new Dimension(1280,680));
        mainContent.setMinimumSize(new Dimension(1280,680));
        mainContent.setLayout(new javax.swing.BoxLayout(mainContent, javax.swing.BoxLayout.LINE_AXIS));
        mainContentFondo = new javax.swing.JPanel();
        mainContentFondo.setPreferredSize(new Dimension(1280,680));
        mainContentFondo.setBackground(new Color(0,0,0,40));
        mainContentFondo.setOpaque(true);
        
        
        
       
        
       
        
        panelReloj = new JPanel();
        panelReloj.setPreferredSize(new Dimension(623,175));
        panelReloj.setBackground(new Color(0,0,0,80));
        
       
            lblReloj = new javax.swing.JLabel();
            
            lblReloj.setPreferredSize(new Dimension(100,100));
            
            lblNomUsuario = new javax.swing.JLabel();
        
        panelCalendario = new javax.swing.JPanel();
        panelCalendario.setPreferredSize(new Dimension(623,475));
        
        panelActividades = new javax.swing.JPanel();
        panelActividades.setPreferredSize(new Dimension(623,660));
        
        this.setOpacity(0.98F);
        this.setPreferredSize(new java.awt.Dimension(1280, 720));
        this.setSize(new java.awt.Dimension(1280, 720));
        
        
        
       
        GroupLayout panelRelojLayout = new GroupLayout(panelReloj);
        panelReloj.setLayout(panelRelojLayout);
        panelRelojLayout.setHorizontalGroup(
            panelRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelojLayout.createSequentialGroup()
                
                .addComponent(lblReloj, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                )
        );
        panelRelojLayout.setVerticalGroup(
            panelRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRelojLayout.createSequentialGroup()
                .addGroup(panelRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRelojLayout.createSequentialGroup()
                        
                        .addComponent(lblReloj, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)))
                )
        );
        
       
        
        GroupLayout BarraSuperiorLayout = new GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
            .addGroup(GroupLayout.Alignment.CENTER, BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnMaximizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addGap(6,6,6)
                .addGroup(BarraSuperiorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximizar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                
            )
        );
        
        GroupLayout mainContentFondoLayout = new javax.swing.GroupLayout(mainContentFondo);
        mainContentFondo.setLayout(mainContentFondoLayout);
        mainContentFondoLayout.setHorizontalGroup(
            mainContentFondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            
            .addGroup(mainContentFondoLayout.createSequentialGroup()
                
                .addGap(10,10,10)//distancia izquierda a panel reloj-calendario
                    .addGroup(mainContentFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        
                        .addComponent(panelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                     
                        .addComponent(panelReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        
                    )
                .addGap(10,10,10)//separacion entre actividades y calendario-reloj
                
                .addComponent(panelActividades, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10,10)//separcion entre panel actividades y borde derecho
                )
        );
        mainContentFondoLayout.setVerticalGroup(
            mainContentFondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            
            .addGroup(mainContentFondoLayout.createSequentialGroup()
                .addGap(10,10,10)//separacion entre barra superior y panel actividades-reloj
                .addGroup(mainContentFondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    
                        .addComponent(panelActividades, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        
    
                .addGroup(mainContentFondoLayout.createSequentialGroup()
                        
                    .addComponent(panelReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                    .addGap(10,10,10)
                    .addComponent(panelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                    
                )
                ).addGap(10,10,10)//distancia entre borde inferior y panel actividades-calendario
            )
        );

        mainContent.add(mainContentFondo);

        javax.swing.GroupLayout allContentPanelLayout = new javax.swing.GroupLayout(allContentPanel);
        allContentPanel.setLayout(allContentPanelLayout);
        allContentPanelLayout.setHorizontalGroup(
            allContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
            .addComponent(BarraSuperior,  GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
        );
        allContentPanelLayout.setVerticalGroup(
            allContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, allContentPanelLayout.createSequentialGroup()
                .addComponent(BarraSuperior, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0,0,0)
                .addComponent(mainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                
            )
        
        );

        getContentPane().add(allContentPanel);

        
    }
    public void inicioReloj(){
    ActionListener actionListener = new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Date date = new Date();
                
                DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
                
                String time = timeFormat.format(date);
                
                timeFormat = new SimpleDateFormat("dd MMMM yyyy");
                
                //today.setText(timeFormat.format(date));
                
                DateFormat get_status = new SimpleDateFormat("HH");
                
                String status = get_status.format(date);
                
                
                actualizarFondo();
                 
                
                lblReloj.setText(time);
                
            }
        };
        
        timer = new Timer(1000, actionListener);
        
        timer.setInitialDelay(0);
        
        timer.start();
    }

public void actualizarFondo(){
    this.setContentPane(new ImagenPanel("src//main//java//Imagenes//fondo2.png"));
    
}
 
  //finMetodos  
}
