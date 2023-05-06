package Controlador;

import Modelo.ConsultasCliente;
import Modelo.Cliente;
import Vista.frmProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlCliente implements ActionListener {

    private final Cliente modelo;
    private final ConsultasCliente consultas;
    private final frmProducto vista;

    public CtrlCliente(Cliente modelo, ConsultasCliente consultas, frmProducto vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("Cliente");
        vista.setLocationRelativeTo(null);
        vista.txtId.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

       if (e.getSource() == vista.btnGuardar) {
            modelo.setCodigo(vista.txtCodigo1.getText());
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setDir(vista.txtDir.getText());
            modelo.setTel(vista.txtTel.getText());
            modelo.setCorreo(vista.txtCorreo.getText());
            

            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
/*
        if (e.getSource() == vista.btnModificar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setCodigo(vista.txtCodigo1.getText());
            modelo.setNombre(vista.txtNombre.getText());
           

            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            modelo.setId(Integer.parseInt(vista.txtId.getText()));

            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnBuscar) {
            modelo.setCodigo(vista.txtCodigo1.getText());

            if (consultas.buscar(modelo)) {
                vista.txtId.setText(String.valueOf(modelo.getId()));
                vista.txtCodigo1.setText(modelo.getCodigo());
                vista.txtNombre.setText(modelo.getNombre());
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();
            }
        }
*/
        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        vista.txtCodigo1.setText(null);
        vista.txtNombre.setText(null);
        vista.txtDir.setText(null);
        vista.txtTel.setText(null);
        vista.txtCorreo.setText(null);
        
    }

    private static class JOptionPane {

        private static void showMessageDialog(Object object, String registro_Guardado) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JOptionPane() {
        }
    }

}
